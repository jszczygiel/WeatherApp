package com.jszczygiel.weatherapp.ui.presenters;

import com.jszczygiel.weatherapp.backend.interactors.WeatherInteractorImpl;
import com.jszczygiel.weatherapp.ui.fragments.WeatherFragment;
import com.jszczygiel.weatherapp.backend.interactors.WeatherInteractor;

import org.joda.time.DateTime;

import javax.inject.Inject;

import rx.Subscription;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherPresenterImpl extends BasePresenter implements WeatherPresenter {
    private WeatherFragment fragment;

    @Inject
    public WeatherInteractor interactor;
    private Subscription subcription;

    public WeatherPresenterImpl(){
        component().inject(this);
    }

    @Override
    public void loadDateWeather(DateTime date, String query) {
        subcription=interactor.loadDateWeather(date, query).subscribe(item -> fragment.onData(item));
    }

    @Override
    public void setFragment(WeatherFragment instance) {
        this.fragment=instance;
    }

    @Override
    public void initilizePresenter() {
    }

    @Override
    public void destroyPresenter() {
        if(!subcription.isUnsubscribed()){
            subcription.unsubscribe();
        }
    }
}
