package com.example.mp_group_project.ui.Information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.mp_group_project.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DescriptionFragment extends Fragment {

    private static final String ARG_TOPIC = "topic";
    private static final String ARG_DESCRIPTION = "description";
    private static final String ARG_IMAGEURL = "image";

    private String topic;
    private String description;
    private String image;

    public DescriptionFragment() {
        // Required empty public constructor
    }

    public static DescriptionFragment newInstance(String topic, String description, String image) {
        DescriptionFragment fragment = new DescriptionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TOPIC, topic);
        args.putString(ARG_DESCRIPTION, description);
        args.putString(ARG_IMAGEURL, image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            topic = getArguments().getString(ARG_TOPIC);
            description = getArguments().getString(ARG_DESCRIPTION);
            image = getArguments().getString(ARG_IMAGEURL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        TextView topicHolder = view.findViewById(R.id.tv_topic);
        TextView descriptionHolder = view.findViewById(R.id.tv_description);
        ImageView imageHolder = view.findViewById(R.id.info_pp);
        Button delete = view.findViewById(R.id.btn_delete);
        delete.setOnClickListener(v -> {
            deleteInformation();
        });

        topicHolder.setText(topic);
        descriptionHolder.setText(description);
        Glide.with(requireContext()).load(image).into(imageHolder);
        return view;
    }

    public void onBackPressed() {
        AppCompatActivity activity = (AppCompatActivity) requireActivity();
        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.central_fragment, new InformationFragment())
                .addToBackStack(null)
                .commit();
    }

    private void deleteInformation() {
        if (getArguments() != null) {
            String topicToDelete = getArguments().getString(ARG_TOPIC);
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("information");

            // Find the child node with the specified topic and remove it
            reference.orderByChild("topic").equalTo(topicToDelete)
                    .addListenerForSingleValueEvent(new ValueEventListener() {


                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                snapshot.getRef().removeValue();
                            }

                            // Go back to the InformationFragment after deletion
                            onBackPressed();
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            // Handle errors
                        }
                    });
        }
    }
}


