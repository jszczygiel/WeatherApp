package com.jszczygiel.weatherapp.ui.activities;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.jszczygiel.weatherapp.R;
import com.jszczygiel.weatherapp.ui.fragments.WeatherDetailsFragmentImpl;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public class MainActivity extends BaseActivity {

    private static final String MASTER_FRAGMENT = "master_fragment";
    @InjectView(R.id.masterContainer)
    FrameLayout masterContainer;

    @InjectView(R.id.detailContainer)
    @Optional
    FrameLayout detailContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        if (savedInstanceState == null) {
            WeatherDetailsFragmentImpl test = new WeatherDetailsFragmentImpl();
            getSupportFragmentManager().beginTransaction().replace(masterContainer.getId(), test, MASTER_FRAGMENT).commit();
        } else {
            WeatherDetailsFragmentImpl test = (WeatherDetailsFragmentImpl) getSupportFragmentManager().findFragmentByTag(MASTER_FRAGMENT);
        }
    }
}
