package com.aavdeev.rakets;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;

    }

    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.rocketName.setText("Rocket Name: " + itemList.get(position).getRocketName());
        holder.launchDate.setText("Launch Date: " + itemList.get(position).getLaunchDate());
        holder.missionPatch.setText("Mission Patch: " + itemList.get(position).getMissionPatch());
        holder.details.setText("Details: " + itemList.get(position).getDetails());
    }


    public int getItemCount() {
        return this.itemList.size();
    }

}
