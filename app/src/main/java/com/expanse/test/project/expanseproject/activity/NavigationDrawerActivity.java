package com.expanse.test.project.expanseproject.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.expanse.test.project.expanseproject.BuildConfig;
import com.expanse.test.project.expanseproject.R;
import com.expanse.test.project.expanseproject.adapters.SpinnerAdapter;
import com.expanse.test.project.expanseproject.database.RatesDatabase;
import com.expanse.test.project.expanseproject.methods.MethodClass;
import com.expanse.test.project.expanseproject.models.ResponseModel;
import com.expanse.test.project.expanseproject.retrofit.ApiClient;
import com.expanse.test.project.expanseproject.retrofit.ApiInterface;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemSelected;
import butterknife.OnTextChanged;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * <p>This i expect will be the main activity</p>
 *
 * <p>The EventBus is registered in onCreate and onDestroyed, unregistered</p>
 *
 * <p> The hamburger icon is disabled, it was kept to try to imitate the mock screen as much as possible.</p>
 *
 * <p>The Sign Up Text also has no functionality, also to imitate the mock screen</p>
 *
 * <p>The following symbols will be displayed for conversion, EUR, USD, BTC, NGN, AUD, CAD, PLN, CNY, GHS, HKD</p>
 *
 * <p>The base currency is set to Euros, given that the information from the API (a free plan) does not allow to retrieve rates for other currencies</p>
 *
 * <p>The conversion is carried out when as the text is changing or the spinner for the new currency is selected or the convert button is clicked</p>
 */
public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String[] currencyList = {"Euro", "United States Dollar", "British Pound Sterling", "Nigerian Naira",
            "Australian Dollar", "Canadian Dollar", "Polish Zloty", "Chinese Yuan",
            "Ghanaian Cedi", "Colombian Peso"};

    int[] currencyImage = {};

    private static final String TAG = NavigationDrawerActivity.class.getSimpleName();

    private MethodClass methodClass;

    @BindView(R.id.currency_converter_button)
    Button convertButton;

    @BindView(R.id.old_currency_edit_text)
    EditText oldEditText;

    @BindView(R.id.new_currency_edit_text)
    EditText newEditText;

    @BindView(R.id.new_country_text_view)
    TextView newCountryText;

    @BindView(R.id.old_country_text_view)
    TextView oldCountryText;

    @BindView(R.id.mid_market_text_time)
    TextView timeFrameText;

    @BindView(R.id.spinner_new_currency)
    Spinner newSpinner;

    @BindView(R.id.spinner_old_currency)
    Spinner oldSpinner;

    @BindView(R.id.currency_converter_spin_kit)
    SpinKitView spinKitView;

    @BindView(R.id.currency_converter_layout)
    RelativeLayout mainLayout;

    String oldCurrency, newCurrency, theTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setDrawerSlideAnimationEnabled(true);

        drawer.addDrawerListener(toggle);
        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        ButterKnife.bind(this);

        oldSpinner.setAdapter(new SpinnerAdapter(NavigationDrawerActivity.this, R.layout.currency_list_row,
                R.id.country_name, currencyList,currencyImage));
        oldSpinner.setEnabled(false);

        newSpinner.setAdapter(new SpinnerAdapter(NavigationDrawerActivity.this, R.layout.currency_list_row,
                R.id.country_name, currencyList,currencyImage));

        methodClass = new MethodClass();

        convert();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id){
            case R.id.nav_home:
                break;
            case R.id.nav_gallery:
                break;
            case R.id.nav_slideshow:
                break;
            case R.id.nav_tools:
                break;
            case R.id.nav_share:
                break;
            case R.id.nav_send:
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void toConverter(){
        try{
            oldCurrency = oldSpinner.getSelectedItem().toString();
            newCurrency = newSpinner.getSelectedItem().toString();

            String oldSymbol = methodClass.getSymbol(oldCurrency);
            String newSymbol = methodClass.getSymbol(newCurrency);

            String textToConvert = oldEditText.getText().toString();

            String converted = methodClass.convertCurrency(textToConvert, oldCurrency, newCurrency, NavigationDrawerActivity.this);

            newCountryText.setText(newSymbol);
            oldCountryText.setText(oldSymbol);

            newEditText.setText(converted, TextView.BufferType.EDITABLE);

        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, getResources().getString(R.string.an_error_occured), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * <p>This method calls the latest rates for all available currencies offered by <url>fixer.io</url></p>
     */
    private void convert(){

        mainLayout.setVisibility(View.INVISIBLE);
        spinKitView.setVisibility(View.VISIBLE);
        spinKitView.animate();

        Retrofit retrofit = ApiClient.getClient();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        retrofit2.Call<ResponseModel> call = apiInterface.getLatestRates(BuildConfig.API_KEY);

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

                mainLayout.setVisibility(View.VISIBLE);
                spinKitView.setVisibility(View.INVISIBLE);

                ResponseModel responseModel = response.body();

                long timeStamp = responseModel.getTimestamp();
                theTime = methodClass.convertToDate(timeStamp);
                timeFrameText.setText(String.format("Market rates as at: %s", theTime));

                RatesDatabase.with(NavigationDrawerActivity.this).ratesDao().insertRates(responseModel.getRates());

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                call.cancel();
                t.printStackTrace();
                spinKitView.setVisibility(View.INVISIBLE);
                mainLayout.setVisibility(View.VISIBLE);
            }
        });
    }

    /**
     * <p>As the button is being clicked upon, the converter is executed</p>
     */
    @OnClick(R.id.currency_converter_button)
    void submitButton(View view){
        toConverter();
    }

    /**
     * <p>Here we will call the conversion to take place, as the text or figure, in this case, is changing</p>
     */
    @OnTextChanged(R.id.old_currency_edit_text)
    protected void onTextChanged(CharSequence text) {
        toConverter();
    }

    /**
     * <p>Here we will call the conversion to take place, as the spinner is changing</p>
     */
    @OnItemSelected(R.id.spinner_new_currency)
    protected void itemSelected(){
        toConverter();
    }

}
