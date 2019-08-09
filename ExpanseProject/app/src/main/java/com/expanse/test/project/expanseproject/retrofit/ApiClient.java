package com.expanse.test.project.expanseproject.retrofit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static int REQUEST_TIMEOUT = 5;

    private static final String BASE_URL = "http://data.fixer.io/api/";

    private static Retrofit retrofit = null;

    private static ApiClient mInstance;

    private static OkHttpClient okHttpClient;

    /**<p>This method is used for network operations</p>
     *
     * <p>The OkHttp client is initialised</p>
     */
    public static Retrofit getClient() {

        if(okHttpClient == null){
            initOkHttp();
        }

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;
    }

    public static synchronized ApiClient getInstance(){
        if (mInstance == null){
            mInstance = new ApiClient();
        }
        return mInstance;
    }

    public ApiClient getApi(){
        return retrofit.create(ApiClient.class);
    }

    /**<p>This method initialises the OkHttp for use with the Retrofit configuration</p>
     *
     * <p>An Interceptor is attached to the Client, to see the body in the Logcat</p>
     *
     * <p>Request is built and initialisation occurs</p>
     *
     * <p>Interceptors are not added, we want to keep the info a bit private</p>
     */
    private static void initOkHttp(){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(REQUEST_TIMEOUT,TimeUnit.SECONDS)
                .writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS);

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

                Request original = chain.request();

                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader("Accept", "application/x-www-form-urlencoded");

                Request request = requestBuilder.build();

                return chain.proceed(request);

            }
        });

        okHttpClient = httpClient.build();

    }

    public static void resetApiClient(){
        retrofit = null;
        okHttpClient = null;
    }

}
