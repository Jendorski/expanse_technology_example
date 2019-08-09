package com.expanse.test.project.expanseproject.retrofit;


import com.expanse.test.project.expanseproject.models.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    /***
     * <p>Get Historical rates</p>
     */
    @GET("")
    Call<ResponseModel> getHistoricRates(@Query("access_key") String accessKey);

    /**<p>This gets the latest currency symbols, referencing the Euros currency as a starting point</p>
     *
     * <p>no premium subscription plan, so this will be used to convert.</p>
     *
     * <p>What will be done will be to be able to obtain the latest rates and then retrieve the country symbol</p>
     *
     * <p>and its corresponding rates</p>
     */
    @GET("latest")
    Call<ResponseModel> getLatestRates(@Query("access_key") String accessKey);

    /**
     * <p>Converts the currency</p>
     *
     */
    @GET("")
    Call<ResponseModel> convertToNewCurrency(@Query("") String oldCurrency,
                                 @Query("") String newCurrency,
                                 @Query("access_key") String accessKey);

}
