package com.jszczygiel.weatherapp.ui.model;

import com.jszczygiel.weatherapp.backend.model.WeatherResponse;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherViewModel extends BaseViewModel {
    public WeatherViewModel(WeatherResponse item) {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
