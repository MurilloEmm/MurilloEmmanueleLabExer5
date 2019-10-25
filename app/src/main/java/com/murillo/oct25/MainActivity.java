package com.murillo.oct25;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.murillo.oct25.R.layout.newlayout;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] verName,dates;
    int[] logo = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gg, R.drawable.hc, R.drawable.icc};
    ListView lstVersions;
    ArrayList<AndroidVersion> versions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verName = getResources().getStringArray(R.array.verName);
        dates = getResources().getStringArray(R.array.rDate);
        for(int i = 0; i < verName.length; i++){
            versions.add(new AndroidVersion(logo[i], verName[i], dates[i]));
        }

        AndroidAdapter adapter = new AndroidAdapter(this, R.layout.newlayout ,versions);
        lstVersions = findViewById(R.id.lvAndroid);
        lstVersions.setAdapter(adapter);
        lstVersions.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
        Toast.makeText(this,verName[i], Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(logo[i]);
        dialog.setTitle(verName[i]);
        dialog.setMessage(dates[i]);
        dialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, verName[i], Toast.LENGTH_LONG).show();
                    }

                });
        dialog.create().show();

    }
}
