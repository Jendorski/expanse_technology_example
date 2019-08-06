package com.expanse.test.project.expanseproject.database.typeConverters;

import androidx.room.TypeConverter;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Adapted from the Android online guide:<url>https://developer.android.com/reference/android/arch/persistence/room/TypeConverter</url>
 * </p>
 *
 * <p>This class helps to convert <l>long</l> values to Date.</p>
 */


public class DateConverter implements Serializable {

    @TypeConverter
    public Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public Long dateToTimestamp(Date date) {
        if (date == null) {
            return null;
        } else {
            return date.getTime();
        }
    }
}
