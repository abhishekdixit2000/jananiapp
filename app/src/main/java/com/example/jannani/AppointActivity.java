package com.example.jannani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class AppointActivity extends AppCompatActivity {

    EditText name,phone,problem;
    Button submit;
    DatabaseReference reff;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoint);
        name=(EditText)findViewById(R.id.editText);
        phone=(EditText)findViewById(R.id.editText2);
        problem=(EditText)findViewById(R.id.editText3);
        submit=(Button)findViewById(R.id.button);
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int phn=Integer.parseInt(phone.getText().toString().trim());
                member.setName(name.getText().toString().trim());
                member.setPhone(phn);
                member.setProblem(problem.getText().toString().trim());
                reff.push().setValue(member);
                Toast.makeText(AppointActivity.this,"Data Inserted successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
