package com.expanse.test.project.expanseproject.database.typeConverters;

import androidx.room.TypeConverter;

import com.expanse.test.project.expanseproject.models.RatesModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;

public class RatesConverter implements Serializable {

    Gson gson;

    @TypeConverter
    public String fromRatesModel(RatesModel ratesModel) {
        if (ratesModel == null) {
            return (null);
        }

        gson = new Gson();

        Type type = new TypeToken<RatesModel>() {
        }.getType();

        return gson.toJson(ratesModel, type);
    }

    @TypeConverter
    public RatesModel toOptionValuesList(String string) {
        if (string == null) {
            return (null);
        }

        gson = new Gson();

        Type type = new TypeToken<RatesModel>() {
        }.getType();

        RatesModel ratesModel = gson.fromJson(string, type);

        return ratesModel;
    }

}
