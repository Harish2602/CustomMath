package com.spagylo.custommath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.spagylo.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int s=MyMath.Plus(10,20);
        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }
}
