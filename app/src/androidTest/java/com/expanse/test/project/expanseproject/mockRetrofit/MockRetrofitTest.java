package com.expanse.test.project.expanseproject.mockRetrofit;

import com.expanse.test.project.expanseproject.BuildConfig;
import com.expanse.test.project.expanseproject.models.ResponseModel;
import com.expanse.test.project.expanseproject.retrofit.ApiInterface;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.mock.BehaviorDelegate;
import retrofit2.mock.MockRetrofit;
import retrofit2.mock.NetworkBehavior;

public class MockRetrofitTest {

    public MockRetrofitTest() {  }

    private static final String TAG = MockRetrofitTest.class.getSimpleName();

    private MockRetrofit mockRetrofit;

    private Retrofit retrofit;

    private static final String BASE_URL = "http://data.fixer.io/api/";

    /**
     * <p>setup for test</p>
     */
    @Before
    public void setUp() throws Exception {
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NetworkBehavior behavior = NetworkBehavior.create();

        mockRetrofit = new MockRetrofit.Builder(retrofit)
                .networkBehavior(behavior)
                .build();
    }

    /**
     * <p>Here, i run a small test to indicate if the value of the Nigerian Naira against the Euro is 405.90</p>
     *
     * <p>The request is called, or mocked and assertions are placed if the response is successful</p>
     *
     * <p>And if the value matches the expected value, wither less than or equal to the given delta</p>
     */

    @Test
    public void testRates() throws Exception{

        BehaviorDelegate<ApiInterface> delegate = mockRetrofit.create(ApiInterface.class);
        MockRetrofitService mockService = new MockRetrofitService(delegate);

        //Actual Test
        Call<ResponseModel> quote = mockService.getLatestRates(BuildConfig.API_KEY);
        Response<ResponseModel> quoteOfTheDayResponse = quote.execute();

        //Asserting response
        Assert.assertTrue(quoteOfTheDayResponse.isSuccessful());
        Assert.assertEquals(405.90, quoteOfTheDayResponse.body().getRates().getNGN(), 407.0);
    }

    /**
     * <p>For the Fixer API endpoints, like every other API, there are several error codes,
     * but i am testing for when the API Key is not found</p>
     *
     * <p>This tests for error code 101.</p>
     *
     * <p>Then in assert in the body of the response that the success is false</p>
     */
    @Test
    public void testFailedRates() throws Exception{

        BehaviorDelegate<ApiInterface> delegate = mockRetrofit.create(ApiInterface.class);
        MockFailedRetrofitService failedService = new MockFailedRetrofitService(delegate);

        //Actual Test
        Call<ResponseModel> quote = failedService.getLatestRates("");
        Response<ResponseModel> modelResponse = quote.execute();

        //Asserting response
        Assert.assertTrue(modelResponse.isSuccessful());
        Assert.assertFalse(modelResponse.body().isSuccess());

    }

}
