package com.example.tanmay.governmentschemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText age, housed, category, income;
    private Button buttonScheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListenerOnButton() {
        age = (EditText) findViewById(R.id.age);
        housed = (EditText) findViewById(R.id.housed);
        category = (EditText) findViewById(R.id.category);
        income = (EditText) findViewById(R.id.income);
        buttonScheme = (Button) findViewById(R.id.button1);

        buttonScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = age.getText().toString();
                String value2 = income.getText().toString();
                int age1 = Integer.parseInt(value1);
                int income1 = Integer.parseInt(value2);

            }

        });


    }
}
