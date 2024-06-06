package com.example.mp_group_project.ui.Information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mp_group_project.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class InformationAdapter extends FirebaseRecyclerAdapter<InformationModel, InformationAdapter.myViewHolder> {


    public InformationAdapter(FirebaseRecyclerOptions<InformationModel> options) {
        super(options);
    }

    public void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull InformationModel model) {
        holder.informationId.setText(model.getId());
        holder.topic.setText(model.getTopic());
        holder.details.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            
            Bundle bundle = new Bundle();
            bundle.putString("topic", model.getTopic());
            bundle.putString("description", model.getDescription());
            bundle.putString("image", model.getImageUrl());
            
            navController.navigate(
                R.id.action__to_informationFragment_to_descriptionsFragment,
                bundle
                );
            });
            
        }
        
        @NonNull
        @Override
        public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_information_item, parent, false);
            return new myViewHolder(view);
        }
        
        public static class myViewHolder extends RecyclerView.ViewHolder {
            TextView informationId, topic, details;
            
            public myViewHolder(@NonNull View itemView) {
                super(itemView);
                informationId = itemView.findViewById(R.id.informationId);
                topic = itemView.findViewById(R.id.tv_topic);
                details = itemView.findViewById(R.id.btn_details);
            }
        }
    }
    
    //        holder.details.setOnClickListener(v -> {
    //                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
    //                    activity.getSupportFragmentManager()
    //                            .beginTransaction()
    //                            .replace(R.id.central_fragment, new DescriptionFragment(model.getTopic(), model.description))
    //                            .addToBackStack(null)
    //                            .commit();
    //                });