package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bn2 = (Button) findViewById(R.id.button2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Integer age = intent.getIntExtra("age", 20);
        Toast.makeText(Main2Activity.this,name + age, Toast.LENGTH_SHORT).show();
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(Main2Activity.this,MainActivity.class);
               // startActivity(intent);
                Intent intent = getIntent();
                String name = intent.getStringExtra("name");
                Integer age = intent.getIntExtra("age", 20);
                intent.putExtra("result1","姓名:"+name+"年龄"+age);
                setResult(0,intent);
                //String p = age + "";
                //Toast.makeText(Main2Activity.this,name + age, Toast.LENGTH_SHORT).show();
                finish();//将Activity移出栈，无法返回上一页；
            }
        });
    }
}
