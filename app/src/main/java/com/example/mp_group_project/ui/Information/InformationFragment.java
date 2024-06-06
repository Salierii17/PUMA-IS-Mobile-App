package com.example.mp_group_project.ui.Information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mp_group_project.R;
import com.example.mp_group_project.databinding.FragmentInformationItemBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A fragment representing a list of Items.
 */
public class InformationFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    RecyclerView recyclerView;
    InformationAdapter adapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public InformationFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static InformationFragment newInstance(int columnCount) {
        InformationFragment fragment = new InformationFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information_item_list, container, false);
        recyclerView= view.findViewById(R.id.information_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Set up FirebaseRecyclerOptions and FirebaseRecyclerAdapter
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("information");
        FirebaseRecyclerOptions<InformationModel> options =
                new FirebaseRecyclerOptions.Builder<InformationModel>()
                        .setQuery(databaseReference, InformationModel.class)
                        .build();
        adapter= new InformationAdapter(options);
        recyclerView.setAdapter(adapter);

        return view;
    }
    @Override
    public void onStart(){
        super.onStart();
        adapter.startListening();
    }
    @Override
    public void onStop(){
        super.onStop();
        adapter.stopListening();
    }
}