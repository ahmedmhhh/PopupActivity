package com.example.ahmed.popupactivity;


import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.zip.Inflater;

public class popActivity extends DialogFragment implements View.OnClickListener{

    View view;
    TimePicker timePicker;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.pop_activity,container,false);
        Button button = (Button) view.findViewById(R.id.button);
        timePicker = (TimePicker) view.findViewById(R.id.timePicker);
        button.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View view) {
        this.dismiss();
        String mytime = timePicker.getHour()+":"+timePicker.getMinute();
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.SetDate(mytime);
    }
}
