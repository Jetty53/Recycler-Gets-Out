package com.wheic.recyclergetsout.RV2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wheic.recyclergetsout.R;

import java.util.List;

public class RVTwoAdapter extends RecyclerView.Adapter<RVTwoAdapter.ViewHolder> {

    private List<RVTwoModel> tutorialSubList; //Sub-list item titles will be stored here

    //Parameterized constructor of this class to initialize tutorialSubList
    public RVTwoAdapter(List<RVTwoModel> tutorialSubList) {
        this.tutorialSubList = tutorialSubList;
    }

    //Attach the item layout with the proper xml file
    @NonNull
    @Override
    public RVTwoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_card_layout_vertical, parent, false);
        return new ViewHolder(view);
    }

    //It deals with the setting of different data and methods
    @Override
    public void onBindViewHolder(@NonNull RVTwoAdapter.ViewHolder holder, int position) {
        holder.setData(tutorialSubList.get(position).getName());
    }

    //It returns the length of the RecyclerView
    @Override
    public int getItemCount() {
        return tutorialSubList.size();
    }

    //The ViewHolder is a java class that stores the reference to the item layout views
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView rvTwoText;

        //Link up the Sub-List items layout components with their respective id
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rvTwoText = itemView.findViewById(R.id.singleItemTextViewRVTwo);
        }

        //setText in Sub-List title text
        public void setData(String name){
            this.rvTwoText.setText(name);
        }
    }
}
