package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GYJ on 2017/8/16.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String MAX;
        public String MIN;
    }

    public class More {
        @SerializedName("txt_d")
        public String txt;
    }
}
