package com.jszczygiel.weatherapp.backend.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherResponse {
    @SerializedName("coord")
    CoordResponse coord;
    @SerializedName("main")
    ConditionResponse condition;
}
