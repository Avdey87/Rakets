package com.aavdeev.rakets;


import com.google.gson.annotations.SerializedName;

public class ItemObject {
    @SerializedName("rocket")
    private String rocketName;
    @SerializedName("launch_date_utc")
    private String launchDate;
    @SerializedName("mission_patch")
    private String missionPatch;
    @SerializedName("details")
    private String details;

    public ItemObject(String rocketName, String launchDate, String missionPatch, String details) {
        this.rocketName = rocketName;
        this.launchDate = launchDate;
        this.missionPatch = missionPatch;
        this.details = details;
    }

    public String getRocketName() {
        return rocketName;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public String getDetails() {
        return details;
    }

    public String getMissionPatch() {

        return missionPatch;
    }
}

