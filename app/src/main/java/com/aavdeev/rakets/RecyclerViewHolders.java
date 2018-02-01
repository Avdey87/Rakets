package com.aavdeev.rakets;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView rocketName;
    public TextView launchDate;
    public TextView missionPatch;
    public TextView details;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        rocketName = (TextView) itemView.findViewById(R.id.rocket_name);
        launchDate = (TextView) itemView.findViewById(R.id.launch_date);
        missionPatch = (TextView) itemView.findViewById(R.id.mission_patch);
        details = (TextView) itemView.findViewById(R.id.details);
    }

    @Override
    public void onClick(View view) {
    }
}