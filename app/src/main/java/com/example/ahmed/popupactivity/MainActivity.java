package com.example.ahmed.popupactivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void getbtn(View view) {
        FragmentManager fragmentManager =getFragmentManager();
        popUsers popUsers = new popUsers();
        popUsers.show(fragmentManager,null);
    }
}
