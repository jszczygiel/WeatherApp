package com.jszczygiel.weatherapp.ui.fragments;

import android.os.Bundle;
import android.widget.ListView;

import com.jszczygiel.weatherapp.R;
import com.jszczygiel.weatherapp.ui.presenters.LocationsPresenter;

import javax.inject.Inject;

import butterknife.InjectView;

/**
 * Created by jakubszczygiel on 25/05/15.
 */
public class LocationListFragmentImpl extends BaseFragment implements LocationListFragment {

    @InjectView(R.id.listContainer) ListView listContainer;

    @Inject
    LocationsPresenter locationsPresenter;

    @Override
    int getLayoutId() {
        return R.layout.fragment_weather_list;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
