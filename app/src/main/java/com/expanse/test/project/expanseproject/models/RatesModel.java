package com.expanse.test.project.expanseproject.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.lifecycle.ViewModel;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p>Rates that are needed are here, with their getters and setters.</p>
 */
@Entity(tableName = "RatesModel")
public class RatesModel extends ViewModel {

    @SerializedName("AUD")
    @Expose
    @ColumnInfo(name = "aud")
    private double aUD;

    @SerializedName("BTC")
    @Expose
    @ColumnInfo(name = "btc")
    private double bTC;

    @SerializedName("CAD")
    @Expose
    @ColumnInfo(name = "cad")
    private double cAD;

    @SerializedName("CNY")
    @Expose
    @ColumnInfo(name = "cny")
    private double cNY;

    @SerializedName("COP")
    @Expose
    @ColumnInfo(name = "cop")
    private double cOP;

    @SerializedName("EUR")
    @Expose
    @ColumnInfo(name = "eur")
    private double eUR;

    @SerializedName("GBP")
    @Expose
    @ColumnInfo(name = "gbp")
    private double gBP;

    @SerializedName("GHS")
    @Expose
    @ColumnInfo(name = "ghs")
    private double gHS;

    @SerializedName("HKD")
    @Expose
    @ColumnInfo(name = "hkd")
    private double hKD;

    @SerializedName("JPY")
    @Expose
    @ColumnInfo(name = "jpy")
    private double jPY;

    @SerializedName("PLN")
    @Expose
    @ColumnInfo(name = "pln")
    private double pLN;

    @SerializedName("NGN")
    @Expose
    @ColumnInfo(name = "ngn")
    private double nGN;

    @SerializedName("NZD")
    @Expose
    @ColumnInfo(name = "nzd")
    private double nZD;

    @SerializedName("USD")
    @Expose
    @PrimaryKey
    @ColumnInfo(name = "usd")
    private double uSD;

    public final static Parcelable.Creator<RatesModel> CREATOR = new Parcelable.Creator<RatesModel>() {

        @SuppressWarnings({"unchecked"})
        public RatesModel createFromParcel(Parcel in) {
            return new RatesModel(in);
        }

        public RatesModel[] newArray(int size) {
            return (new RatesModel[size]);
        }

    };

    private final static long serialVersionUID = 5922741341210331708L;

    protected RatesModel(Parcel in) {
        this.aUD = ((double) in.readValue((double.class.getClassLoader())));
        this.bTC = ((double) in.readValue((double.class.getClassLoader())));
        this.cAD = ((double) in.readValue((double.class.getClassLoader())));
        this.cNY = ((double) in.readValue((double.class.getClassLoader())));
        this.cOP = ((double) in.readValue((double.class.getClassLoader())));
        this.eUR = ((long) in.readValue((long.class.getClassLoader())));
        this.gBP = ((double) in.readValue((double.class.getClassLoader())));
        this.gHS = ((double) in.readValue((double.class.getClassLoader())));
        this.hKD = ((double) in.readValue((double.class.getClassLoader())));
        this.jPY = ((double) in.readValue((double.class.getClassLoader())));
        this.nGN = ((double) in.readValue((double.class.getClassLoader())));
        this.nZD = ((double) in.readValue((double.class.getClassLoader())));
        this.uSD = ((double) in.readValue((double.class.getClassLoader())));
        this.pLN = ((double) in.readValue((double.class.getClassLoader())));
    }

    public RatesModel() {  }

    public double getAUD() {
        return aUD;
    }

    public void setAUD(double aud) {
        this.aUD = aud;
    }

    public double getBTC() {
        return bTC;
    }

    public void setBTC(double bTC) {
        this.bTC = bTC;
    }

    public double getCAD() {
        return cAD;
    }

    public void setCAD(double cad) {
        this.cAD = cad;
    }

    public double getCNY() {
        return cNY;
    }

    public void setCNY(double cny) {
        this.cNY = cny;
    }

    public double getCOP() {
        return cOP;
    }

    public void setCOP(double cop) {
        this.cOP = cop;
    }

    public double getEUR() {
        return eUR;
    }

    public void setEUR(double eur) {
        this.eUR = eur;
    }

    public double getGBP() {
        return gBP;
    }

    public void setGBP(double gbp) {
        this.gBP = gbp;
    }

    public double getGHS() {
        return gHS;
    }

    public void setGHS(double ghs) {
        this.gHS = ghs;
    }

    public double getHKD() {
        return hKD;
    }

    public void setHKD(double hkd) {
        this.hKD = hkd;
    }

    public double getNGN() {
        return nGN;
    }

    public void setNGN(double ngn) {
        this.nGN = ngn;
    }

    public double getNZD() {
        return nZD;
    }

    public void setNZD(double nzd) {
        this.nZD = nzd;
    }

    public double getUSD() {
        return uSD;
    }

    public void setUSD(double uSD) {
        this.uSD = uSD;
    }

    public double getJPY() {
        return jPY;
    }

    public void setJPY(double jPY) {
        this.jPY = jPY;
    }

    public double getPLN() {
        return pLN;
    }

    public void setPLN(double pLN) {
        this.pLN = pLN;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aUD);
        dest.writeValue(bTC);
        dest.writeValue(cAD);
        dest.writeValue(cNY);
        dest.writeValue(cOP);
        dest.writeValue(eUR);
        dest.writeValue(gBP);
        dest.writeValue(gHS);
        dest.writeValue(hKD);
        dest.writeValue(jPY);
        dest.writeValue(nGN);
        dest.writeValue(nZD);
        dest.writeValue(uSD);
        dest.writeValue(pLN);
    }

    public int describeContents() {
        return 0;
    }
}
