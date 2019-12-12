package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button bn4=(Button)findViewById(R.id.button3);
        Intent intent=getIntent();
        String name = intent.getStringExtra("name");
        Integer age = intent.getIntExtra("age", 20);
        Integer tel=intent.getIntExtra("tel",158);
        Toast.makeText(Main3Activity.this,name+age+tel,Toast.LENGTH_SHORT).show();
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                String name = intent.getStringExtra("name");
                Integer age = intent.getIntExtra("age", 20);
                Integer tel=intent.getIntExtra("tel",158);
                intent.putExtra("result2","姓名:"+name+"年龄"+age+"电话"+158);
                setResult(1,intent);
                //Toast.makeText(Main3Activity.this,name+age+tel,Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
