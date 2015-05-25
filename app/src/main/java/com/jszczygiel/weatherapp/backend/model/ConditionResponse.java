package com.jszczygiel.weatherapp.backend.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jakubszczygiel on 24/05/15.
 */
public class ConditionResponse {
    float temp;
    float pressure;
    int humidity;
    @SerializedName("temp_min")
    float tempMin;
    @SerializedName("temp_max")
    float tempMax;
}
