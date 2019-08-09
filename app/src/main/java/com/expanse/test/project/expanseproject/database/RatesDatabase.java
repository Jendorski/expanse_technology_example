package com.expanse.test.project.expanseproject.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.expanse.test.project.expanseproject.database.dao.RatesDao;
import com.expanse.test.project.expanseproject.database.typeConverters.RatesConverter;
import com.expanse.test.project.expanseproject.models.RatesModel;
import com.expanse.test.project.expanseproject.models.ResponseModel;
import com.expanse.test.project.expanseproject.database.typeConverters.DateConverter;

@Database(entities = {RatesModel.class, ResponseModel.class}, version = 1)
@TypeConverters({DateConverter.class, RatesConverter.class})
public abstract class RatesDatabase extends RoomDatabase {

    private static RatesDatabase appDataBase;

    public abstract RatesDao ratesDao();

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            /**
             * <p>Since we didn't alter the table, there's nothing else to do here.</p>
             */

        }
    };

    private static RatesDatabase getInstance(Context context){
        if(appDataBase == null){
            appDataBase = buildDataBaseInstance(context);
        }
        return appDataBase;
    }

    public static RatesDatabase with(Context context){
        return getInstance(context);
    }

    //This initializes the appDataBase
    private static RatesDatabase buildDataBaseInstance(Context context){
        return Room.databaseBuilder(context,
                RatesDatabase.class, "app_database.db")
                .addMigrations(MIGRATION_1_2)
                .allowMainThreadQueries().build();
    }

    private void cleanUp(){
        appDataBase = null;
    }

}
