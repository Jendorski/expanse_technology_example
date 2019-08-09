package com.expanse.test.project.expanseproject.mockRetrofit;

import com.expanse.test.project.expanseproject.BuildConfig;
import com.expanse.test.project.expanseproject.models.RatesModel;
import com.expanse.test.project.expanseproject.models.ResponseModel;
import com.expanse.test.project.expanseproject.retrofit.ApiInterface;

import retrofit2.Call;
import retrofit2.mock.BehaviorDelegate;

public class MockRetrofitService implements ApiInterface {

    private final BehaviorDelegate<ApiInterface> delegate;

    public MockRetrofitService(BehaviorDelegate<ApiInterface> service) {
        this.delegate = service;
    }

    @Override
    public Call<ResponseModel> getHistoricRates(String accessKey) {
        return null;
    }

    /**
     * <p>Here, we set the mock response and return a delegate for when the call is mocked.</p>
     */
    @Override
    public Call<ResponseModel> getLatestRates(String accessKey) {
        ResponseModel responseModel = new ResponseModel();
        RatesModel ratesModel = new RatesModel();
        ratesModel.setNGN(405.90);
        responseModel.setRates(ratesModel);
        return delegate.returningResponse(responseModel).getLatestRates(BuildConfig.API_KEY);
    }

    @Override
    public Call<ResponseModel> convertToNewCurrency(String oldCurrency, String newCurrency, String accessKey) {
        return null;
    }
}
