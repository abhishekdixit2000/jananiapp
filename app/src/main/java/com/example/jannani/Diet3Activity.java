package com.example.jannani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Diet3Activity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
   private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet3);
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        submit=(Button)findViewById(R.id.submit);
       /* String heig=height.getText().toString();
        String weig=weight.getText().toString();
        float heightValue=Float.parseFloat(heig)/100;
        float weightValue=Float.parseFloat(weig);
        final float bmi=weightValue/(heightValue*heightValue);*/
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(Diet3Activity.this,Diet4Activity.class);
                startActivity(b);
            }
        });

    }
}
