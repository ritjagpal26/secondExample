package com.example.secondexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edttext;
    private Button btnGoNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        edttext = findViewById(R.id.editPersonName);
        btnGoNext = findViewById(R.id.buttonnext);
        btnGoNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(edttext.getText().toString().trim().length() != 0)
        {
            Intent mIntent = new Intent(FirstActivity.this,SecondActivity.class);
        }
        else
        {
                showAlert();
        }
    }
    private void  showAlert()
    {
        AlertDialog.Builder alertd = new AlertDialog.Builder(this);
        alertd.setIcon(R.drawable.abc);
        alertd.setTitle("LOGIN ERROR");
        alertd.setMessage("Please Enter Your Name");
        alertd.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
       alertd.setNegativeButtonIcon(getResources().getDrawable(R.drawable.abc));
       AlertDialog mAlertDialog = alertd.create();
       mAlertDialog.show();


    }
}
