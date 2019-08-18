package com.example.biodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mNameEdTxt;
    private EditText mAgeEdTxt;
    private EditText mFNameEdTxt;
    private Button mSubmit;
    private TextView mNameTxt;
    private TextView mAgeTxt;
    private TextView mFNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEdTxt = findViewById(R.id.name);
        mAgeEdTxt = findViewById(R.id.age);
        mFNameEdTxt = findViewById(R.id.fatherName);
        mSubmit = findViewById(R.id.submit_btn);
        mNameTxt = findViewById(R.id.name_txt);
        mAgeTxt = findViewById(R.id.age_txt);
        mFNameTxt = findViewById(R.id.fname_txt);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNameTxt.setText(mNameEdTxt.getText().toString());
                mAgeTxt.setText(mAgeEdTxt.getText().toString());
                mFNameTxt.setText(mFNameEdTxt.getText().toString());
            }
        });
    }
}
