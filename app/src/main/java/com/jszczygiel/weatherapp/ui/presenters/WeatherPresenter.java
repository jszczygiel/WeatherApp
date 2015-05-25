package com.jszczygiel.weatherapp.ui.presenters;

import com.jszczygiel.weatherapp.ui.fragments.WeatherFragment;

import org.joda.time.DateTime;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public interface WeatherPresenter extends BasePresenterInterface {
    void loadDateWeather(DateTime date, String query);

    void setFragment(WeatherFragment instance);

}
