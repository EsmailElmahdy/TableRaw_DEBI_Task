package com.example.newjavaproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaskDayThreeUnitConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_day_3_unit_converter);
        EditText cmEditText = findViewById(R.id.cm_et);
        TextView inchesTextView = findViewById(R.id.inches_et);
        Button convertButton = findViewById(R.id.convert_btn);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float cmValue = Float.parseFloat(cmEditText.getText().toString());
                    float inchesValue = cmValue * 0.393701f;
                    inchesTextView.setText(String.format("%.2f", inchesValue) + " Inches");
                } catch (NumberFormatException e) {
                    inchesTextView.setText("Invalid Input");
                }
            }
        });
    }
}
