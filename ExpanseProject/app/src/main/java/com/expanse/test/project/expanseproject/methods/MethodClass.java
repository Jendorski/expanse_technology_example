package com.expanse.test.project.expanseproject.methods;

import android.app.Activity;
import android.text.format.DateFormat;
import android.widget.Toast;

import com.expanse.test.project.expanseproject.R;
import com.expanse.test.project.expanseproject.database.RatesDatabase;
import com.expanse.test.project.expanseproject.models.RatesModel;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

import static com.expanse.test.project.expanseproject.utils.Utils.getContexts;

public class MethodClass {

    private static final String TAG = MethodClass.class.getSimpleName();

    public MethodClass() {  }

    /**
     * <p>This method helps to determine the symbol to be displayed when either of the spinners are clicked</p>
     *
     * @param currency The currency chosen
     *
     * @return String symbol of the currency
     */
    public String getSymbol(String currency){
        switch (currency){
            case "Euro":
                return "EUR";
            case "United States Dollar":
                return "USD";
            case "Nigerian Naira":
                return "NGN";
            case "British Pound Sterling":
                return "GBP";
            case "Australian Dollar":
                return "AUD";
            case "Canadian Dollar":
                return "CAD";
            case "Polish Zloty":
                return "PLN";
            case "Chinese Yuan":
                return "CNY";
            case "Ghanaian Cedi":
                return "GHS";
            case "Colombian Peso":
                return "COP";
                default:
                    return "";
        }
    }

    /**
     * <p>This method converts the timestamp to String</p>
     *
     * @param timestamp The long value to be converted to date
     *
     * @return String the formatted Date to String.
     */
    public String convertToDate(long timestamp){
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(timestamp * 1000);
        return DateFormat.format("dd-MM-yyyy", cal).toString();
    }

    /**
     * <p>Converts the currency to a new currency, to some two decimal place precision</p>
     *
     * <p>In the event, whereby there is a network problem or somehow,
     * the rates are not saved to the DB, a toast is thrown upon conversion and the old value is returned</p>
     *
     * @param value The value to be converted to a new currency
     *
     * @param oldCurrency The value of the old currency, needed for verification, that we are not converting the same currency
     *
     * @param newCurrency The value of the new currency. Needed to get the actual rate from the DB.
     *
     * @param context Context, Activity, needed for Toast, getting Android resources amongst other utilities
     */
    public String convertCurrency(String value, String oldCurrency, String newCurrency, Activity context) throws Exception{

        String oldSymbol = getSymbol(oldCurrency);

        String newSymbol = getSymbol(newCurrency);

        RatesModel ratesModel = getRates(context);

        if(!newSymbol.equalsIgnoreCase(oldSymbol) && ratesModel != null){

            double newRate = retrieveRates(newSymbol, ratesModel);

            double val = Double.parseDouble(value);

            double result = val * newRate;

            return getFormattedAmt(result);
        }else{
            Toast.makeText(context, getContexts().getString(R.string.conversion_problem), Toast.LENGTH_SHORT).show();
            return value;
        }
    }

    /**
     * @return RatesModel from the Room DB.
     */
    public RatesModel getRates(Activity context) {
        return RatesDatabase
                .with(context)
                .ratesDao()
                .getRates();
    }

    private double retrieveRates(String symbol, RatesModel ratesModel){
        switch (symbol){
            case "NGN":
                return ratesModel.getNGN();
            case "EUR":
                return ratesModel.getEUR();
            case "USD":
                return ratesModel.getUSD();
            case "BTC":
                return ratesModel.getBTC();
            case "AUD":
                return ratesModel.getAUD();
            case "NZD":
                return ratesModel.getNZD();
            case "PLN":
                return ratesModel.getPLN();
            case "CNY":
                return ratesModel.getCNY();
            case "COP":
                return ratesModel.getCOP();
            case "CAD":
                return ratesModel.getCAD();
            case "JPY":
                return ratesModel.getJPY();
            case "HKD":
                return ratesModel.getHKD();
            case "GHS":
                return ratesModel.getGHS();
            case "GBP":
                return ratesModel.getGBP();
            default:
                return 0.0;
        }
    }

    /**
     * <p>Format the amount to decimal places.</p>
     *
     * <p>The pattern is such that the decimal places are dynamic</p>
     *
     * <p>If there are no decimal values, they are replaced with zeroes.</p>
     */
    private String getFormattedAmt(double input) {
        String pattern = "#,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(input);
    }

}
