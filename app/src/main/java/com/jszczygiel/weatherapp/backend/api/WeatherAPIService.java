package com.jszczygiel.weatherapp.backend.api;

import com.jszczygiel.weatherapp.backend.model.WeatherResponse;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
public interface WeatherAPIService {
    @GET("/weather")
    Observable<WeatherResponse> loadData(@Query("q") String query);
}
