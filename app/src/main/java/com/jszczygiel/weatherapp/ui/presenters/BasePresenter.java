package com.jszczygiel.weatherapp.ui.presenters;

import com.jszczygiel.weatherapp.backend.dagger.DaggerInteractorComponent;
import com.jszczygiel.weatherapp.ui.WeatherApplication;
import com.jszczygiel.weatherapp.ui.dagger.DaggerPresenterComponent;
import com.jszczygiel.weatherapp.ui.dagger.PresenterComponent;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
public abstract class BasePresenter {
    private PresenterComponent component;
    PresenterComponent component() {
        if (component == null) {
            component = DaggerPresenterComponent.builder()
                    .build();
        }
        return component;
    }
    abstract void destroyPresenter();

}
