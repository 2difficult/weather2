package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GYJ on 2017/8/16.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        public String txt;
    }

    public class CarWash {
        public String txt;
    }

    public class Sport {
        public String txt;
    }
}
