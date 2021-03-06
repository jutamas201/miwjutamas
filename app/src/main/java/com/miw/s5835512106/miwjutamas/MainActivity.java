package com.miw.s5835512106.miwjutamas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit1,edit2;

    private Button bt1,bt2;

    private String scal,scal1;
    private double cal,ccal,cal1,ccal1;
    private TextView t3;
    private ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        t3 = findViewById(R.id.t3);
    }

    public void changeF(View view) {

        if(edit1.length()==0){
            t3.setText("please input integer ");}
        else{
            cal = Double.parseDouble(edit1.getText().toString());
            ccal = (cal-543);
            scal = Double.toString(ccal);
            edit2.setText(scal);
            t3.setText("Calculate B.E. ->  A.D.");
        }
    }

    public void changeC(View view) {
        if (edit2.length()==0){
            t3.setText("please input integer .");}

        else{
            cal1 = Double.parseDouble(edit2.getText().toString());
            ccal1 = (cal1+543);
            scal1 = Double.toString(ccal1);
            edit1.setText(scal1);
            t3.setText("Calculate A.D -> B.E");
        }
    }
}
