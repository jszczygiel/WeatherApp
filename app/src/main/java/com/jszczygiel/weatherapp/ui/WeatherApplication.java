package com.jszczygiel.weatherapp.ui;

import android.app.Application;
import android.location.LocationManager;

import com.jszczygiel.weatherapp.ui.dagger.ApplicationComponent;
import com.jszczygiel.weatherapp.ui.dagger.ApplicationModule;
import com.jszczygiel.weatherapp.ui.dagger.DaggerApplicationComponent;

import javax.inject.Inject;


/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherApplication extends Application {

    private ApplicationComponent applicationComponent;

    // TODO(cgruber): Figure out a better example of something one might inject into the app.
    @Inject
    LocationManager locationManager; // to illustrate injecting something into the app.
    private static WeatherApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return applicationComponent;
    }


    public static WeatherApplication getInstance() {
        return instance;
    }
}
