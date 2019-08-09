package com.expanse.test.project.expanseproject;

import androidx.room.Room;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.expanse.test.project.expanseproject.database.RatesDatabase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class TestDatabase {

    private static RatesDatabase appDataBase;

    @Test
    @Before
    public void initDb() throws Exception {
        appDataBase = Room.inMemoryDatabaseBuilder(
                InstrumentationRegistry.getInstrumentation().getContext(),
                RatesDatabase.class)
                .build();
    }

    @Test
    @After
    public void closeDb() throws Exception {
        appDataBase.close();
    }

}
