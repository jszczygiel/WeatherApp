package com.jszczygiel.weatherapp.backend.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jakubszczygiel on 24/05/15.
 */
public class ConditionResponse {
    public float temp;
    public float pressure;
    public int humidity;
    @SerializedName("temp_min")
    public float tempMin;
    @SerializedName("temp_max")
    public float tempMax;
}
