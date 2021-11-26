package com.gap.mobigpk1;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.gap.mobigpk1.Model.Category;
import com.gap.mobigpk1.Model.Note;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link notes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class notes extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Context context;
    ImageView nointernet;
    RecyclerView recyclerView;
    FirebaseRecyclerAdapter<Note, NoteViewHolder> adapter;
    RecyclerView.LayoutManager manager;
    FirebaseDatabase database;
    DatabaseReference reference;

    public notes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment notes.
     */
    // TODO: Rename and change types and number of parameters
    public static notes newInstance(String param1, String param2) {
        notes fragment = new notes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
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
        View v=inflater.inflate(R.layout.fragment_notes, container, false);
        nointernet = v.findViewById(R.id.nointernt);



        if(!isConnected())
        {
            nointernet.setVisibility(View.VISIBLE);
            Toast.makeText(getActivity(),"No Internet Access",Toast.LENGTH_LONG).show();
        }

        long duration= TimeUnit.SECONDS.toMillis(2);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                String sDuration=String.format(Locale.ENGLISH,"%02d"
                        , TimeUnit.MILLISECONDS.toSeconds(l));
                //Toast.makeText(getActivity(),"Please wait! Connecting to Internet",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFinish() {
                ProgressBar progress=v.findViewById(R.id.progress_icon);
                progress.setVisibility(View.INVISIBLE);
            }
        }.start();

        database= FirebaseDatabase.getInstance();
        reference=database.getReference("Note");

        manager=new LinearLayoutManager(getActivity());
        recyclerView=v.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(manager);

        FirebaseRecyclerOptions<Note> options=new FirebaseRecyclerOptions.Builder<Note>()
                .setQuery(reference,Note.class)
                .build();

        adapter=new FirebaseRecyclerAdapter<Note, NoteViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull NoteViewHolder noteViewHolder, int i, @NonNull Note note) {
                noteViewHolder.categoryName.setText(note.getTitle());
                noteViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(note.getLink()));
                   //     startActivity(intent);
                     //   Intent intent=new Intent(getActivity(),video_lectures.class);
                       // intent.putExtra("title",note.getLink());
                        startActivity(intent);
                    }
                });
            }

            @NonNull
            @Override
            public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v1= LayoutInflater.from(getContext())
                        .inflate(R.layout.notes_btn_firebase,parent,false);
                return new NoteViewHolder(v1);
            }


        };
        adapter.startListening();
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

        return v;
    }
    public class NoteViewHolder extends RecyclerView.ViewHolder {
        public TextView categoryName;
        public RecyclerView category_recyclerView;
        public RecyclerView.LayoutManager manager;
        private Context context;
        RelativeLayout relativeLayout;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout=itemView.findViewById(R.id.relative);
            manager=new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
            categoryName=itemView.findViewById(R.id.category_name);
            category_recyclerView=itemView.findViewById(R.id.recyclerView);
            category_recyclerView.setLayoutManager(manager);
        }

    }
}