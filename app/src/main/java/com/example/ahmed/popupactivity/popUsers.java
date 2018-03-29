package com.example.ahmed.popupactivity;


import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class popUsers extends DialogFragment implements View.OnClickListener{
    View form;
    EditText editText;
    Button search;
    Button cancel;
    TextView result;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        form = inflater.inflate(R.layout.pop_activity,container,false);
         editText = (EditText) form.findViewById(R.id.editText);
         search = (Button) form.findViewById(R.id.searchbtn);
         cancel = (Button) form.findViewById(R.id.cnbtn);
         result = (TextView) form.findViewById(R.id.resultTXT);
         getDialog().setTitle("Please enter User name");
        search.setOnClickListener(this);
        cancel.setOnClickListener(this);
        return form;
    }

    @Override
    public void onClick(View view) {
        Button bu = (Button) view;
        if(bu.getText().toString().equals("Cancel"))
            this.dismiss();
        else{
            if(editText.getText().toString().equals("Ahmed")||editText.getText().toString().equals("ahmed")){
                result.setText("Found");
            }else
                result.setText("not found");
        }
    }
}
