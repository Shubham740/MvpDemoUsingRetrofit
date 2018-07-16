package com.example.mvpsample.application;

import android.app.Application;

import com.example.mvpsample.presenter.retrofit.ApiClient;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.mvpsample.utils.AppConstants.BASE_URL_DUPONT;
import static com.example.mvpsample.utils.AppConstants.NETWORK_TIMEOUT;

/**
 * Created by Shubham on 6/12/17.
 * it is the application class of the app.
 */

public class LakshyaApplication extends Application {
    private static final String TAG = LakshyaApplication.class.getSimpleName();

    private static Retrofit sRetrofit;

    /**
     * it creates the object of Retrofit
     */
    @Override
    public void onCreate() {
        super.onCreate();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(NETWORK_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(NETWORK_TIMEOUT, TimeUnit.SECONDS)
                .build();

        sRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL_DUPONT)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     *
     * @return :the Object of ApiClent
     * static method no need to create the object of the class
     *
     */
    public static ApiClient getClient() {
        return sRetrofit.create(ApiClient.class);
    }

}
