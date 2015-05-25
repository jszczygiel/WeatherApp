package com.jszczygiel.weatherapp.backend.dagger;

import com.jszczygiel.weatherapp.backend.api.WeatherAPIService;
import com.jszczygiel.weatherapp.backend.interactors.BaseInteractor;
import com.jszczygiel.weatherapp.backend.interactors.WeatherInteractor;
import com.jszczygiel.weatherapp.backend.interactors.WeatherInteractorImpl;
import com.jszczygiel.weatherapp.ui.dagger.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
@Singleton
@Component(modules = {RealaseApiModule.class, DataModule.class}, dependencies = ApplicationModule.class)
public interface InteractorComponent {
    void inject(WeatherInteractorImpl interactor);

    WeatherAPIService service();
}
