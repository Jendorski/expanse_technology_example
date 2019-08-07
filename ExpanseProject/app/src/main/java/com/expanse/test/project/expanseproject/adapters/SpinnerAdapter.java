package com.expanse.test.project.expanseproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.expanse.test.project.expanseproject.R;

/**
 *<p>This spinner adapter configures the list to be used by the Spinner.</p>
 *
 * <p>The Adapter extends the ArrayAdapter which has its constructor.</p>
 *
 * <p>Other variables such as the list of images, the activity, are added to the constructor</p>
 */
public class SpinnerAdapter extends ArrayAdapter<String> {

    FragmentActivity activity;

    int[] arr_images;

    String[] strings;

    public SpinnerAdapter(FragmentActivity activity, int resource, int textViewResourceId, @NonNull String[] objects,
                          int[] arrayImages) {
        super(activity, resource, textViewResourceId, objects);
        this.activity = activity;
        this.arr_images = arrayImages;
        this.strings = objects;
    }

    @Override
    public View getDropDownView(int position, View convertView,ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View row = inflater.inflate(R.layout.currency_list_row, parent, false);

        TextView label = row.findViewById(R.id.country_name);
        label.setText(strings[position]);

        ImageView icon = row.findViewById(R.id.country_image);
        icon.setImageResource(arr_images[position]);

        return row;
    }

}
