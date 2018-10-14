package com.example.yuripps.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button checkButton = findViewById(R.id.check);

        checkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText numidEditText = findViewById(R.id.numid);
                String ni = numidEditText.getText().toString();


                int N = ni.length();
                if (N != 13) {
                    Toast.makeText(Main2Activity.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG).show();
                } else if (ni.equals("1111111111111") || ni.equals("2222222222222")) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //todo: โค้ดที่ให้ยูเซ่อ คลิค ok ใน dialog
                        }
                    });
                    dialog.show();

                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //todo: โค้ดที่ให้ยูเซ่อ คลิค ok ใน dialog
                        }
                    });
                    dialog.show();
                    }
                }
            });


    }
}
