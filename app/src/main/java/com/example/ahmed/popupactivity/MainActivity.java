package com.example.ahmed.popupactivity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        popActivity pop = new popActivity();
        pop.show(fragmentTransaction,null);
    }

    void SetDate(String date){
        TextView textView = (TextView) findViewById(R.id.teext);
        textView.setText(date);
    }
}
