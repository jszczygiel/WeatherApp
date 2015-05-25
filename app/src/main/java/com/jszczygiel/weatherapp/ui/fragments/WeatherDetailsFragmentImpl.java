package com.jszczygiel.weatherapp.ui.fragments;

import android.os.Bundle;
import android.widget.TextView;

import com.jszczygiel.weatherapp.R;
import com.jszczygiel.weatherapp.ui.model.WeatherViewModel;
import com.jszczygiel.weatherapp.ui.presenters.WeatherPresenter;
import com.jszczygiel.weatherapp.ui.presenters.WeatherPresenterImpl;

import org.joda.time.DateTime;

import butterknife.InjectView;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class WeatherDetailsFragmentImpl extends BaseFragment implements WeatherDetailsFragment {

    static WeatherPresenter presenter;
    @InjectView(R.id.detailsTemp)
    TextView detailsTemp;

    @Override
    int getLayoutId() {
        return R.layout.fragment_weather_details;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null)
            presenter = new WeatherPresenterImpl();
        presenter.setFragment(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.loadDateWeather(DateTime.now(), "London");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.setFragment(null);
        if (getActivity().isFinishing())
            presenter = null;
    }


    @Override
    public void onError(Throwable item) {

    }

    @Override
    public void onData(WeatherViewModel item) {
        detailsTemp.setText(item.getTemp());
    }
}
