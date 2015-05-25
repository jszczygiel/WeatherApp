package com.jszczygiel.weatherapp.ui.dagger;

import android.app.Application;
import android.location.LocationManager;

import com.jszczygiel.weatherapp.ui.WeatherApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    // Field injections of any dependencies of the DemoApplication
    void inject(WeatherApplication application);

    // Exported for child-components.
    Application application();
    LocationManager locationManager();
}
