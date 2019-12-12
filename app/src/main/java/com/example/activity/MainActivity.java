package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn1=(Button)findViewById(R.id.button1);
        Button bn2=(Button)findViewById(R.id.button4);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                intent.putExtra("name","wy");
                intent.putExtra("age",20);
                intent.putExtra("tel",158);
                startActivityForResult(intent,1);
            }
        });
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name","wy");
                intent.putExtra("age",20);
                //intent.putExtra("tel",158);
                startActivityForResult(intent,0);
                //startActivity(intent);
            }
        });
    }
    protected void onActivityResult(int req,int res,Intent a){//重写
        super.onActivityResult(req, res, a);
        if(req==0&&res==0) {
            String date = a.getStringExtra("result1");
            Toast.makeText(MainActivity.this, date, Toast.LENGTH_SHORT).show();
        }
        if(req==1&&res==1){
                String date1=a.getStringExtra("result2");
                Toast.makeText(MainActivity.this,date1,Toast.LENGTH_SHORT).show();
            }
            //finish();
    }
}
