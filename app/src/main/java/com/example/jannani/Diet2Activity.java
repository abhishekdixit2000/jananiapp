package com.example.jannani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.jannani.R.id.height;

public class Diet2Activity extends AppCompatActivity {
     EditText height;
    EditText weight;
     Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet2);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        //submit = (Button) findViewById(R.id.submit);
        String heig = height.getText().toString();
        String weig = weight.getText().toString();
        float heightValue = Float.parseFloat(heig) / 100;
        float weightValue = Float.parseFloat(weig);
        final float bmi = weightValue / (heightValue * heightValue);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bmi<18)
                {
                    Intent b=new Intent(Diet2Activity.this,Diet3Activity.class);
                    startActivity(b);

                }
                else if(bmi>=18 && bmi<24)
                {
                    Intent b=new Intent(Diet2Activity.this,Diet4Activity.class);
                    startActivity(b);

                }
                else {
                    Intent b=new Intent(Diet2Activity.this,Diet5Activity.class);
                    startActivity(b);
                }
            }
        });
    }
}
