package com.jszczygiel.weatherapp.backend.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Endpoint;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.client.OkClient;

/**
 * Created by jakubszczygiel on 23/05/15.
 */
@Module
public class ApiModule {
    static String PRODUCTION_API_ENDPOINT = "http://api.openweathermap.org/data/2.5/";
    static String PRODUCTION_API_KEY = "8d71d79fd576a769543176eb5f6c1c62";

    @Provides
    @Singleton
    Client provideClient(Application app) {
        return new OkClient(DataModule.createOkHttpClient(app));
    }


    @Provides
    @Singleton
    RestAdapter provideRestAdapter(Endpoint endpoint, Client client, RequestInterceptor interceptor) {
        return new RestAdapter.Builder()
                .setClient(client)
                .setEndpoint(endpoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setRequestInterceptor(interceptor)
                .build();
    }

}
