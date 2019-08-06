package com.expanse.test.project.expanseproject.retrofit;

import com.expanse.test.project.expanseproject.BuildConfig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {

    /********
     * URLS
     *******/
    private static final String ROOT_URL = "http://pratikbutani.x10.mx";

    private static final String GIGM_ROOT_URL = "http://client.gigmobilitysystem.com";

    static OkHttpClient okHttpClient;

    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(GIGM_ROOT_URL)
                .client(initOkHttp())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private static OkHttpClient initOkHttp(){

        OkHttpClient.Builder httpClient  = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS);

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder builder = original.newBuilder();

                Request request = builder.build();

                return chain.proceed(request);
            }
        });

        return httpClient.build();

    }

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static ApiClient getApiService() {
        return getRetrofitInstance().create(ApiClient.class);
    }
}
