package com.jszczygiel.weatherapp.backend.model.responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherResponse {
    @SerializedName("coord")
    public CoordResponse coord;
    @SerializedName("main")
    public ConditionResponse condition;
}
