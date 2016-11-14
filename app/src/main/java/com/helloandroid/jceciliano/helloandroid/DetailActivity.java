package com.helloandroid.jceciliano.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailActivity extends AppCompatActivity {
    private CoordinatorLayout coordinatorLayout;
    private EditText mHelloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
    }

    public void displayDetailText(View view){
        mHelloText = (EditText) findViewById(R.id.HellowText);
        Snackbar snackbar = Snackbar.make(coordinatorLayout, mHelloText.getText().toString(), Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
