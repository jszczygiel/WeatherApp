package com.jszczygiel.weatherapp.ui.fragments;

import com.jszczygiel.weatherapp.ui.model.WeatherViewModel;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public interface WeatherFragment {
    void onError();
    void onData(WeatherViewModel item);
}
