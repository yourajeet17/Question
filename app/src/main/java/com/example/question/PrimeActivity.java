package com.example.question;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PrimeActivity extends AppCompatActivity {
    private EditText input;
    private String value;
    private Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeno);
        input=(EditText) findViewById(R.id.prime_edt_text);
        check=(Button)findViewById(R.id.prime_btn_check);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             double n= Double.parseDouble(input.getText().toString());
             int flag=0;
             int i;

             for (i=2;i<=n;i++)
             {
                 if (n%i==0)
                 {
                     flag=1;
                 }
             }
             if (flag==0)
             {
                 Toast.makeText(PrimeActivity.this,"Entered number is Prime",Toast.LENGTH_SHORT).show();
             }
             else
             {
                 Toast.makeText(PrimeActivity.this,"Entered number is not Prime",Toast.LENGTH_SHORT).show();
             }
            }
        });

    }
}