package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

EditText input=(EditText) findViewById(R.id.input);
TextView res=(TextView) findViewById(R.id.res);
RadioButton usd=(RadioButton) findViewById(R.id.usd);
RadioButton euro=(RadioButton) findViewById(R.id.euro);
RadioButton yen=(RadioButton) findViewById(R.id.yen);
Button convertBtn=(Button) findViewById(R.id.convertBtn);
convertBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        double exchangeRate=0;
        int inputRate=0;
        if(!input.getText().toString().equals("")){
            inputRate=Integer.parseInt(input.getText().toString());
        }
        if(usd.isChecked()){
            exchangeRate=0.013;
        }else if(euro.isChecked()){
            exchangeRate=0.013;
        }else if(yen.isChecked()){
            exchangeRate=1.80;
        }
        res.setText(String.valueOf(inputRate*exchangeRate)); }});}

}
