package com.example.caro.sensorsinfoapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaSensores = (ListView)findViewById(R.id.sensorsListView);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mList= sensorManager.getSensorList(Sensor.TYPE_ALL);

        ArrayList<String> sensorsinfo = new ArrayList<String>();
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.sensorlist_item, R.id.textView ,mList);
        listaSensores.setAdapter(adapter);



    }

}
