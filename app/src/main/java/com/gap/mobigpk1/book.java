package com.gap.mobigpk1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link book#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class book extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView slide;
    AutoScroll autoScrollAdapter;
    LinearLayoutManager layoutManager;
    private Dialog progressDialog;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment book.
     */
    // TODO: Rename and change types and number of parameters
    public static book newInstance(String param1, String param2) {
        book fragment = new book();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public book() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private boolean isConnected()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) Objects.requireNonNull(getActivity()).getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo()!=null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_book, container, false);


        if(!isConnected())
        {
            progressDialog=new Dialog(getActivity());
            progressDialog.setContentView(R.layout.dialog_layout);
            progressDialog.setCancelable(false);
            Button btn=progressDialog.findViewById(R.id.retry);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isConnected())
                        progressDialog.dismiss();
                    else
                        Toast.makeText(getActivity(),"No Internet Access",Toast.LENGTH_SHORT).show();
                }
            });
            progressDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            progressDialog.show();
            //    Toast.makeText(getActivity(),"No Internet Access",Toast.LENGTH_LONG).show();
        }

        Button button1 = v.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Main2Activity.class);
                intent.putExtra("title","Mechanical Engg.");
                startActivity(intent);
            }
        });
        Button button2 = v.findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Main3Activity.class);
                intent.putExtra("title","Electrical Engg.");
                startActivity(intent);
            }
        });
        Button button3 =v.findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Main4Activity.class);
                intent.putExtra("title","Civil Engg.");
                startActivity(intent);
            }
        });
        Button button4 = v.findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),syllebuss.class);
                startActivity(intent);
            }
        });
        Button button5 = v.findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),previousYear_paper.class);
                startActivity(intent);
            }
        });

        slide=v.findViewById(R.id.slide);
        setRV();
        return v;
    }
    private void setRV(){
        layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        slide.setLayoutManager(layoutManager);
        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.tile);
        images.add(R.drawable.masterpiece);
        images.add(R.drawable.tile3);
        images.add(R.drawable.tilet);

        autoScrollAdapter= new AutoScroll(images);
        slide.setAdapter(autoScrollAdapter);

        LinearSnapHelper snapHelper=new LinearSnapHelper();
        snapHelper.attachToRecyclerView(slide);

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(layoutManager.findLastCompletelyVisibleItemPosition() < (autoScrollAdapter.getItemCount() - 1)){
                    layoutManager.smoothScrollToPosition(slide, new RecyclerView.State(), layoutManager.findLastCompletelyVisibleItemPosition() + 1);
                }else{
                    layoutManager.smoothScrollToPosition(slide, new RecyclerView.State(), 0);
                }
            }
        },0,3000);


    }
}