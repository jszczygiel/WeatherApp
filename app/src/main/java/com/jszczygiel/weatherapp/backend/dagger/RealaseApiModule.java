package com.jszczygiel.weatherapp.backend.dagger;

import com.jszczygiel.weatherapp.backend.api.WeatherAPIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
@Module(includes = ApiModule.class)
public class RealaseApiModule {
    @Provides
    @Singleton
    WeatherAPIService provideWeatherAPIService(RestAdapter restAdapter) {
        return restAdapter.create(WeatherAPIService.class);
    }

    @Provides
    @Singleton
    Endpoint provideEndpoint() {
        return Endpoints.newFixedEndpoint(ApiModule.PRODUCTION_API_ENDPOINT);
    }

    @Provides
    @Singleton
    RequestInterceptor provideRequestInterceptor() {
        return request -> request.addHeader("x-api-key", ApiModule.PRODUCTION_API_KEY);
    }
}
