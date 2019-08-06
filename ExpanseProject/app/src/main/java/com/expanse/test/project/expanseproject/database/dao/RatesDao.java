package com.expanse.test.project.expanseproject.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.expanse.test.project.expanseproject.models.RatesModel;

@Dao
public interface RatesDao {

    @Query("SELECT * FROM RatesModel")
    RatesModel getLatestRates();

    @Query("SELECT * FROM RatesModel WHERE 'timestamp' > :timestamp ")
    RatesModel getRatesByTimeStamp(long timestamp);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRates(RatesModel... rates);

    @Delete
    void deleteRates(RatesModel... users);
}
