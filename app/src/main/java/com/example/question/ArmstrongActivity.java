package com.example.question;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ArmstrongActivity extends AppCompatActivity {
    private Button check;
    private EditText input;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armstrong);
        int temp=0,n=0,r=0,s=0;

        input=(EditText)findViewById(R.id.armstrong_edt_input);
        check=(Button)findViewById(R.id.armstrong_btn_check);
        value=input.getText().toString().trim();
        temp = Integer.parseInt(value);
        n=Integer.parseInt(value);
        temp=n;
        while (n!=0){
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if (temp==s){
            Toast.makeText(ArmstrongActivity.this,"this is a armstrong number",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(ArmstrongActivity.this,"this is not a armstrong number",Toast.LENGTH_SHORT).show();
        }
    }
}