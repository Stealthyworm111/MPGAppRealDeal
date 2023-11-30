package com.example.mpgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public TextView txtTotalGallons;
    public Button btnFillUpHistory, btnCalc;
    public Switch swtFilledUp;
    public EditText edtCurrentMileage, edtPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTotalGallons = findViewById(R.id.txtTotalGallons);
        btnFillUpHistory = findViewById(R.id.btnFillUpHistory);
        btnCalc = findViewById(R.id.btnCalc);
        swtFilledUp = findViewById(R.id.swtFilledUp);
        edtCurrentMileage = findViewById(R.id.edtCurrentMileage);
        edtPrice = findViewById(R.id.edtPrice);


    }
}