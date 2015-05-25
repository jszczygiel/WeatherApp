package com.jszczygiel.weatherapp.ui.dagger;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
