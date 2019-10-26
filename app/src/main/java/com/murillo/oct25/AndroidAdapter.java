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
        String ceo = getItem(i).getCeoName();
        String industry = getItem(i).getIndName();


        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        ImageView img = convertView.findViewById(R.id.tbLogo);
        TextView verName = convertView.findViewById(R.id.tbName);
        TextView indN = convertView.findViewById(R.id.tbInd);
        TextView ceoN = convertView.findViewById(R.id.tbC);
        TextView rDate = convertView.findViewById(R.id.tbCo);

        img.setImageResource(logo);
        verName.setText(version);
        indN.setText(industry);
        ceoN.setText(ceo);
        rDate.setText(date);
        return convertView;
    }
}


