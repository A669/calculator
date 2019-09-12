package com.example.alculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int MENU_RESET_ID = 1;


    EditText Num1;
    EditText Num2;
    TextView Result;
    Button sun;
    Button min;
    Button multi;
    Button div;

    String oper = "";
    private Menu menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Num1 = findViewById(R.id.Num1);

    Num2 = findViewById(R.id.Num2);


    sun =findViewById(R.id.sun);

    min =findViewById(R.id.min);

    multi =findViewById(R.id.min);

    div =findViewById(R.id.div);

    Result =findViewById(R.id.Result);



}

    public void onBtnClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;


//        if (TextUtils.isEmpty(Num1.getText().toString())
//                || TextUtils.isEmpty(Num2.getText().toString())) {
//            return;
//        }


        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());


        switch (v.getId()) {
            case R.id.sun:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.min:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.multi:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.div:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }


        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
