package com.meetvishalkumar.myapplication.Loading_Animation;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.meetvishalkumar.myapplication.R;


public class NoInternetDiaload extends Dialog {
    public NoInternetDiaload(@NonNull Context context){
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet_diaload);

    }
}