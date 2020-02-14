package com.example.question;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FactorialActivity extends AppCompatActivity {
    private Button check;
    String str;
    private EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);
        check=(Button)findViewById(R.id.factorial_btn_check);
        input=(EditText)findViewById(R.id.factorial_edt_input);
        int i , fact ,num;
        fact=1;
        str=input.getText().toString().trim();
        num=Integer.parseInt(str);
        for (i=1;i<=num;i++){
            fact=fact*i;
        }
        Toast.makeText(FactorialActivity.this,"the factorial of number is : "+fact,Toast.LENGTH_SHORT).show();
    }
}