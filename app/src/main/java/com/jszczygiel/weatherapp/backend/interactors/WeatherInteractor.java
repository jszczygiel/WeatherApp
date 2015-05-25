package com.jszczygiel.weatherapp.backend.interactors;

import com.jszczygiel.weatherapp.ui.model.WeatherViewModel;

import org.joda.time.DateTime;

import rx.Observable;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public interface WeatherInteractor {
    Observable<WeatherViewModel> loadDateWeather(DateTime date, String query);
}
