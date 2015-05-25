package com.jszczygiel.weatherapp.ui.dagger;

import android.app.Activity;

import dagger.Component;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
@PerActivity // Subtypes of ActivityComponent should be decorated with @PerActivity.
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface AbstractActivityComponent {
    Activity activity(); // Expose the activity to sub-graphs.
}
