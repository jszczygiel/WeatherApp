package com.jszczygiel.weatherapp.backend.dagger;

import com.jszczygiel.weatherapp.backend.api.WeatherAPIService;
import com.jszczygiel.weatherapp.backend.interactors.WeatherInteractor;
import com.jszczygiel.weatherapp.backend.interactors.WeatherInteractorImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
@Module
public class InteractorModule {
    @Singleton
    @Provides
    WeatherInteractor provideWeatherInteractor() {
        return new WeatherInteractorImpl();
    }
}
