package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

public class viewbookedDesignerDetails extends AppCompatActivity {


    TextView tv_designername, tv_designerloc, tv_designerprice,tv_designerservice ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booked_view_designer_details);
        tv_designername = findViewById(R.id.tv_designername);
        tv_designerloc = findViewById(R.id.tv_designerloc);

        tv_designerprice = findViewById(R.id.tv_designerprice);

        tv_designerservice = findViewById(R.id.tv_designerservices);

        tv_designername.setText(getIntent().getStringExtra("designername"));
        tv_designerloc.setText(getIntent().getStringExtra("designerloc"));
        tv_designerservice.setText(getIntent().getStringExtra("designerservice"));
        tv_designerprice.setText(getIntent().getStringExtra("designerprice"));
    }



}
