package com.jszczygiel.weatherapp.ui.dagger;

import com.jszczygiel.weatherapp.backend.dagger.InteractorComponent;
import com.jszczygiel.weatherapp.backend.dagger.InteractorModule;
import com.jszczygiel.weatherapp.ui.presenters.BasePresenter;
import com.jszczygiel.weatherapp.ui.presenters.WeatherPresenter;
import com.jszczygiel.weatherapp.ui.presenters.WeatherPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
@Singleton
@Component(  modules = InteractorModule.class)
public interface PresenterComponent  {
    void inject(WeatherPresenterImpl presenter);
}
