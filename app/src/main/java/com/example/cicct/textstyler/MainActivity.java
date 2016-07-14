package com.example.cicct.textstyler;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.cicct.textstyler.R.id.frame;
import static com.example.cicct.textstyler.R.id.txtInput;

public class MainActivity extends AppCompatActivity {

    private EditText mInput;
    private CheckBox mBold;
    private CheckBox mItalic;
    private TextView mTvResult;
    private LinearLayout mFrame;
    private RadioButton mGreen;
    private RadioButton mRed;
    private RadioButton mBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvResult = (TextView) findViewById(R.id.txtVResult);
        mInput = (EditText) findViewById(txtInput);
        mBold = (CheckBox) findViewById(R.id.chkBold);
        mItalic = (CheckBox) findViewById(R.id.chkItalic);
        mFrame = (LinearLayout) findViewById(R.id.frame);
        mBlue = (RadioButton) findViewById(R.id.rBtnBlue);
        mGreen = (RadioButton) findViewById(R.id.rBtnGreen);
        mRed = (RadioButton) findViewById(R.id.rBtnRed);


        mBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBold.isChecked() && mItalic.isChecked()) {
                    mTvResult.setTypeface(null, Typeface.BOLD_ITALIC);
                }else if(mBold.isChecked()){
                    mTvResult.setTypeface(null, Typeface.BOLD);
                }else if (!mBold.isChecked() && mItalic.isChecked()){
                    mTvResult.setTypeface(null, Typeface.ITALIC);
                }else{
                    mTvResult.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
        mItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBold.isChecked() && mItalic.isChecked()) {
                    mTvResult.setTypeface(null, Typeface.BOLD_ITALIC);
                }else if (mItalic.isChecked()){
                    mTvResult.setTypeface(null, Typeface.ITALIC);
                }else if (mBold.isChecked() && !mItalic.isChecked()){
                    mTvResult.setTypeface(null, Typeface.BOLD);
                }else{
                    mTvResult.setTypeface(null, Typeface.NORMAL);
                }
            }
        });

        mGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mTvResult.setTextColor(Color.GREEN);
            }
        });
        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mTvResult.setTextColor(Color.RED);
            }
        });
        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mTvResult.setTextColor(Color.BLUE);
            }
        });
//        mColor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mRed.isSelected()) {
//                    mTvResult.setTextColor(Color.RED);
//                }else if(mGreen.isSelected()){
//                    mTvResult.setTextColor(Color.GREEN);
//                }else{
//                    mTvResult.setTextColor(Color.BLUE);
//                }
//            }
//        });
        mInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable mEditable) {
                mTvResult.setText(mEditable+"");
            }
        });



    }
}
