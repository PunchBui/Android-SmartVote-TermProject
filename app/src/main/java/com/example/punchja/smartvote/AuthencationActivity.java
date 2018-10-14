package com.example.punchja.smartvote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthencationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authencation);
        Button submit_btn = findViewById(R.id.submit);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ident = findViewById(R.id.identify);
                String i = ident.getText().toString();
                String msg = "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก";
                AlertDialog.Builder a1 = new AlertDialog.Builder(AuthencationActivity.this);
                a1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                a1.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                if(i.length()<13){
                    Toast.makeText(
                            AuthencationActivity.this,
                            msg,
                            Toast.LENGTH_LONG
                    ).show();
                }else if(i.equals("1111111111111")||i.equals("2222222222222")){
                            a1.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                            a1.show();
                }else{
                    a1.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    a1.show();
                }
            }
        });
    }
}
