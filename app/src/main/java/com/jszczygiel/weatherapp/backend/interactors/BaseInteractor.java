package com.jszczygiel.weatherapp.backend.interactors;

import com.jszczygiel.weatherapp.backend.dagger.DaggerInteractorComponent;
import com.jszczygiel.weatherapp.backend.dagger.InteractorComponent;
import com.jszczygiel.weatherapp.ui.WeatherApplication;
import com.jszczygiel.weatherapp.ui.dagger.ApplicationModule;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
public class BaseInteractor {
    private InteractorComponent component;
    InteractorComponent component() {
        if (component == null) {
            component = DaggerInteractorComponent.builder()
                    .applicationModule(new ApplicationModule(WeatherApplication.getInstance()))
                    .build();
        }
        return component;
    }


}
