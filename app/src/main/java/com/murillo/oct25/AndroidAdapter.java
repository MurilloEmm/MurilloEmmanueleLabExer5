package com.murillo.oct25;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.List;

public class AndroidAdapter extends ArrayAdapter<AndroidVersion> {
    private Context context;
    private int resource;

    public AndroidAdapter(Context context, int resource, List<AndroidVersion> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }



    @Override
    public View getView(int i, @Nullable View convertView, ViewGroup parent) {
        int logo = getItem(i).getLogo();
        String version = getItem(i).getName();
        String date = getItem(i).getrDate();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        ImageView img = convertView.findViewById(R.id.tbLogo);
        TextView verName = convertView.findViewById(R.id.tbName);
        TextView rDate = convertView.findViewById(R.id.tbDate);

        img.setImageResource(logo);
        verName.setText(version);
        rDate.setText(date);
        return convertView;
        }
    }


