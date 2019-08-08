package com.expanse.test.project.expanseproject.mockRetrofit;

import com.expanse.test.project.expanseproject.models.ResponseModel;
import com.expanse.test.project.expanseproject.retrofit.ApiInterface;

import retrofit2.Call;
import retrofit2.mock.BehaviorDelegate;
import retrofit2.mock.Calls;

public class MockFailedRetrofitService implements ApiInterface{

    private static final String TAG = MockFailedRetrofitService.class.getSimpleName();

    private final BehaviorDelegate<ApiInterface> delegate;

    public MockFailedRetrofitService(BehaviorDelegate<ApiInterface> restServiceBehaviorDelegate) {
        this.delegate = restServiceBehaviorDelegate;
    }


    @Override
    public Call<ResponseModel> getHistoricRates(String accessKey) {
        return null;
    }

    /**
     * <p>Here, in the sucess of the response body, it is set to false</p>
     *
     * <p>And tested at the MockRetrofitTest class</p>
     */

    @Override
    public Call<ResponseModel> getLatestRates(String accessKey) {
        ResponseModel error = new ResponseModel();
        error.setSuccess(false);

        return delegate.returning(Calls.response(error)).getLatestRates("");
    }

    @Override
    public Call<ResponseModel> convertToNewCurrency(String oldCurrency, String newCurrency, String accessKey) {
        return null;
    }
}
