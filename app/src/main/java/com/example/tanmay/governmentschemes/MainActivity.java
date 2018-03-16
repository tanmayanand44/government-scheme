package com.example.tanmay.governmentschemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addListenerOnButton(){
        age=(EditText)findViewById(R.id.age);
        housed=(EditText)findViewbyId(R.id.housed);
        category=(EditText)findViewbyId(R.id.category);
        income=(EditText)findViewbyId(R.id.income);
        buttonScheme=(Button)findViewby
    }
}
