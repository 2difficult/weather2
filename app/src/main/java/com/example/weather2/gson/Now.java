package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GYJ on 2017/8/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        public String txt;
    }
}

