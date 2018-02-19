package com.skybus.skybus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.skybus.skybus.view.MapActivity;
import com.skybus.skybus.view.MapsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresaMapa(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
