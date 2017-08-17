package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GYJ on 2017/8/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
