package com.expanse.test.project.expanseproject.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "ResponseModel")
public class ResponseModel {

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("timestamp")
    @Expose
    @PrimaryKey
    @ColumnInfo(name = "timestamp")
    private long timestamp;

    @SerializedName("base")
    @Expose
    private String base;

    @SerializedName("date")
    @Expose
    @ColumnInfo(name = "date")
    private String date;

    @SerializedName("rates")
    @Expose
    //@ForeignKey(entity = RatesModel.class, childColumns = {"uSD","nGN", ""}, parentColumns = {})
    private RatesModel rates;

    public final static Parcelable.Creator<ResponseModel> CREATOR = new Parcelable.Creator<ResponseModel>() {

        @SuppressWarnings({"unchecked"})
        public ResponseModel createFromParcel(Parcel in) {
            return new ResponseModel(in);
        }

        public ResponseModel[] newArray(int size) {
            return (new ResponseModel[size]);
        }

    };

    private final static long serialVersionUID = 4770065355921621639L;

    protected ResponseModel(Parcel in) {
        this.success = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.timestamp = ((long) in.readValue((long.class.getClassLoader())));
        this.base = ((String) in.readValue((String.class.getClassLoader())));
        this.date = ((String) in.readValue((String.class.getClassLoader())));
        this.rates = ((RatesModel) in.readValue((RatesModel.class.getClassLoader())));
    }

    public ResponseModel() { }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesModel getRates() {
        return rates;
    }

    public void setRates(RatesModel rates) {
        this.rates = rates;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(success);
        dest.writeValue(timestamp);
        dest.writeValue(base);
        dest.writeValue(date);
        dest.writeValue(rates);
    }

    public int describeContents() {
        return 0;
    }
}
