package com.example.bodymassindexbmi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private EditText etheight, etweight;
    private TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etheight = findViewById(R.id.height);
        etweight = findViewById(R.id.weight);
        btn1 = findViewById(R.id.btncal);
        tvresult = findViewById(R.id.tvresult);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float height = Float.parseFloat(etheight.getText().toString()) / 100;
        float weight = Float.parseFloat(etweight.getText().toString());
        float result = weight / (height * height);
        tvresult.setText(Float.toString(result));

        if (result <= 18.5) {
            Toast.makeText(getApplicationContext(), "you are under weight", Toast.LENGTH_LONG).show();
        } else if (result > 18.5 & result < 24.9) {
            Toast.makeText(getApplicationContext(), "normal", Toast.LENGTH_LONG).show();
        }else if (result>25 & result<29.9) {
            Toast.makeText(getApplicationContext(),"over weight",Toast.LENGTH_LONG).show();
        }
    }

}


