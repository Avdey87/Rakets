package com.aavdeev.rakets;


import android.net.Uri;

public class RaketsDescripts {

    private String rocket_name;
    private String launch_date_unix;
    private String mission_patch;
    private String details;

    public String getRocket_name() {
        return rocket_name;
    }

    public void setRocket_name(String rocket_name) {
        this.rocket_name = rocket_name;
    }

    public String getLaunch_date_unix() {
        return launch_date_unix;
    }

    public void setLaunch_date_unix(String launch_date_unix) {
        this.launch_date_unix = launch_date_unix;
    }

    public String getMission_patch() {
        return mission_patch;
    }

    public void setMission_patch(String mission_patch) {
        this.mission_patch = mission_patch;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public Uri getRaketPageUri() {
        return Uri.parse("https://api.spacexdata.com/v2/launches?launch_year=2017")
                .buildUpon()
                .appendPath(rocket_name)
                .appendPath(launch_date_unix)
                .build();
    }
}
