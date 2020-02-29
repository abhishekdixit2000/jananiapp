package com.example.jannani;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HOMEActivity extends AppCompatActivity {
 Button diet,appoint,hospital,ambulance;
    String Number="8868944979";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        diet=(Button)findViewById(R.id.Diet);
        appoint=(Button)findViewById(R.id.Appoint);
        hospital=(Button)findViewById(R.id.Hospital);
        ambulance=(Button)findViewById(R.id.Ambulance);
        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(HOMEActivity.this,Diet2Activity.class);
                startActivity(a);
            }
        });
        appoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(HOMEActivity.this,AppointActivity.class);
                startActivity(a);
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(HOMEActivity.this,AmbulanceActivity.class);
                startActivity(a);
            }
        });
        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String Number="6397568318";
                Intent a=new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:"+Number));
                if(ActivityCompat.checkSelfPermission(HOMEActivity.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(a);
            }
        });
    }
}
