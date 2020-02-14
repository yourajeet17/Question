package com.example.question;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView arms,fabo,fact,pali,prim,reve,stri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        arms=findViewById(R.id.armstrong);
        fabo=findViewById(R.id.fabonacii);
        fact=findViewById(R.id.factorial);
        pali=findViewById(R.id.palindrome);
        prim=findViewById(R.id.prime);
        reve=findViewById(R.id.revstring);
        stri=findViewById(R.id.string_palindrome);


        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,ArmstrongActivity.class);
                startActivity(i1);
            }
        });

        fabo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this,FabonaciiActivity.class);
                startActivity(i2);
            }
        });

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainActivity.this,FactorialActivity.class);
                startActivity(i3);
            }
        });

        pali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(MainActivity.this,PalindromeActivity.class);
                startActivity(i4);
            }
        });

        prim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(MainActivity.this,PrimeActivity.class);
                startActivity(i5);
            }
        });

        reve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(MainActivity.this,Reverse_stringActivity.class);
                startActivity(i6);
            }
        });

        stri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(MainActivity.this,String_palindromeActivity.class);
                startActivity(i7);
            }
        });

    }
}
