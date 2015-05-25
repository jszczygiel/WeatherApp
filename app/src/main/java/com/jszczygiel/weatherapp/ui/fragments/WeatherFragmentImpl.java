package com.jszczygiel.weatherapp.ui.fragments;

import android.os.Bundle;

import com.jszczygiel.weatherapp.R;
import com.jszczygiel.weatherapp.ui.model.WeatherViewModel;
import com.jszczygiel.weatherapp.ui.presenters.WeatherPresenter;
import com.jszczygiel.weatherapp.ui.presenters.WeatherPresenterImpl;

import org.joda.time.DateTime;

import javax.inject.Inject;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherFragmentImpl extends BaseFragment implements WeatherFragment {

    static WeatherPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null)
            presenter = new WeatherPresenterImpl();
        presenter.initilizePresenter();
        presenter.setFragment(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.loadDateWeather(DateTime.now(),"London");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.setFragment(null);
        if (getActivity().isFinishing())
            presenter = null;
    }
    @Override
    int getLayoutId() {
        return R.layout.fragment_weather;
    }

    @Override
    public void onError() {

    }

    @Override
    public void onData(WeatherViewModel item) {

    }
}