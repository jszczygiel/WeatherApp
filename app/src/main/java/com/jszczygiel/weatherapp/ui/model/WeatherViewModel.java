package com.jszczygiel.weatherapp.ui.model;

import com.jszczygiel.weatherapp.backend.model.WeatherResponse;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherViewModel extends BaseViewModel {

    private final static float CELCIUS_KELVIN_CONVERSION = 273.15f;
    private final float temp;

    public WeatherViewModel(WeatherResponse item) {
        this.temp = item.condition.temp;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public String getTemp() {
        return String.valueOf(temp - CELCIUS_KELVIN_CONVERSION);
    }
}
