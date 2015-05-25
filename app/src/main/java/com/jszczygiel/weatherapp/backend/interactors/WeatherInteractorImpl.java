package com.jszczygiel.weatherapp.backend.interactors;

import com.jszczygiel.weatherapp.backend.api.WeatherAPIService;
import com.jszczygiel.weatherapp.ui.model.WeatherViewModel;

import org.joda.time.DateTime;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherInteractorImpl extends BaseInteractor implements WeatherInteractor {

    @Inject
    WeatherAPIService adapter;

    Observable<WeatherViewModel> observable;

    public WeatherInteractorImpl() {
        component().inject(this);
    }

    @Override
    public Observable<WeatherViewModel> loadDateWeather(DateTime date, String query) {
        if (observable == null) {
            observable = adapter.loadData(query).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).map(item ->
                            new WeatherViewModel(item)).cache();
        }
        return observable;
    }
}
