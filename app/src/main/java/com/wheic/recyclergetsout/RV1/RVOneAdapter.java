package com.wheic.recyclergetsout.RV1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.wheic.recyclergetsout.R;

import java.util.List;

public class RVOneAdapter extends RecyclerView.Adapter<RVOneAdapter.ViewHolder> {

    private List<RVOneModel> tutorialList; //Main-list item titles will be stored here

    private OnItemsClickListener listener; //Need this clickListener for the Main-list item onClick events

    //Parameterized constructor of this class to initialize tutorialList
    public RVOneAdapter(List<RVOneModel> tutorialList) {
        this.tutorialList = tutorialList;

    }

    //Main-list item clickListener is initialized
    //This will be used in MainActivity
    public void setWhenClickListener(OnItemsClickListener listener){
        this.listener = listener;
    }

    //Attach the item layout with the proper xml file
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_card_layout, parent, false);
        return new ViewHolder(view);
    }

    //It deals with the setting of different data and methods
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RVOneModel modelItems = tutorialList.get(position);
        holder.setData(tutorialList.get(position).getName());
        holder.singleItemCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null){
                    listener.onItemClick(modelItems);
                }
            }
        });
    }

    //It returns the length of the RecyclerView
    @Override
    public int getItemCount() {
        return tutorialList.size();
    }

    //The ViewHolder is a java class that stores the reference to the item layout views
    public class ViewHolder extends RecyclerView.ViewHolder{

        public CardView singleItemCardView;
        public TextView singleItemTextView;

        //Link up the Main-List items layout components with their respective id
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            singleItemCardView = itemView.findViewById(R.id.singleItemCardView);
            singleItemTextView = itemView.findViewById(R.id.singleItemTextView);
        }

        //setText in Main-List title text
        public void setData(String name){

            this.singleItemTextView.setText(name);

        }
    }

    //Interface to perform events on Main-List item click
    public interface OnItemsClickListener{
        void onItemClick(RVOneModel rvOneModel);
    }

}
