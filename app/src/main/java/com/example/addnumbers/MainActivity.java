package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText E1, E2;
    TextView T1;
    Button B1, B2, B3, B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E1 = (EditText) findViewById(R.id.E1);
        E2 = (EditText) findViewById(R.id.E2);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        T1 = (TextView) findViewById(R.id.T1);

        //Addition

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edit = E1.getText().toString().trim();
                String edit1 = E2.getText().toString().trim();
                if (edit.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter number", Toast.LENGTH_SHORT).show();
                }
                else if (edit1.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Second number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                        int x = Integer.parseInt(E1.getText().toString());
                        int y = Integer.parseInt(E2.getText().toString());
                        int answer = result(x, y);
                        T1.setText("Add Result :" + answer);
                        //Log.d("MainActivity_Log", "Debug Answer:" +answer);
                } }
        });


        //Subtraction

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String edit = E1.getText().toString().trim();
                String edit1 = E2.getText().toString().trim();
                if (edit.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter number", Toast.LENGTH_SHORT).show();
                }
                else if (edit1.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Second number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int x = Integer.parseInt(E1.getText().toString());
                    int y = Integer.parseInt(E2.getText().toString());
                    int answer = result(x, y);
                    T1.setText("Sub Result :" + answer);
                    //Log.d("MainActivity_Log", "Debug Answer:" +answer);
                } }
        });


        //Multiplication

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String edit = E1.getText().toString().trim();
                String edit1 = E2.getText().toString().trim();
                if (edit.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter number", Toast.LENGTH_SHORT).show();
                }
                else if (edit1.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Second number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int x = Integer.parseInt(E1.getText().toString());
                    int y = Integer.parseInt(E2.getText().toString());
                    int answer = result(x, y);
                    T1.setText("Mul Result :" + answer);
                    //Log.d("MainActivity_Log", "Debug Answer:" +answer);
                } }
        });


        //Divition

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String edit = E1.getText().toString().trim();
                String edit1 = E2.getText().toString().trim();
                if (edit.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter number", Toast.LENGTH_SHORT).show();
                }
                else if (edit1.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Second number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int x = Integer.parseInt(E1.getText().toString());
                    int y = Integer.parseInt(E2.getText().toString());
                    int answer = result(x, y);
                    T1.setText("Div Result :" + answer);
                    //Log.d("MainActivity_Log", "Debug Answer:" +answer);
                } }
        });
    }




    private int result(int a, int b)
    {
        int c= a + b;
        return c;
    }

    private int subresult(int a, int b)
    {
        int c= a - b;
        return c;

    }


    private int mulresult(int a, int b) {
        int c = a * b;
        return c;

    }

    private int divresult(int a, int b)
    {
        int c= a / b;
        return c;

    }
}