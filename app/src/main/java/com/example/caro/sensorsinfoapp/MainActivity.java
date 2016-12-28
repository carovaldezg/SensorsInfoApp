package com.example.caro.sensorsinfoapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sensorTextView = (TextView)findViewById(R.id.sensorInfoTextView);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mList= sensorManager.getSensorList(Sensor.TYPE_ALL);

        for (int i = 1; i < mList.size(); i++) {
            sensorTextView.setVisibility(View.VISIBLE);
            sensorTextView.append("\n Nombre: " + mList.get(i).getName() + "\n Vendor: " + mList.get(i).getVendor() + "\n version: " + mList.get(i).getVersion()+ "\n");
        }
    }

}
