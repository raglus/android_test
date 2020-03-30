package com.example.piano_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.넘어가욧);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondMainActivity.class);
                startActivity(intent);
            }
        });

        // ... 코드 계속

        // BtnOnClickListener의 객체 생성.
        super.onCreate(savedInstanceState);
        BtnOnClickListener onClickListener = new BtnOnClickListener();

        // 각 Button의 이벤트 리스너로 onClickListener 지정.
        Button White1 = (Button) findViewById(R.id.White1);
        White1.setOnClickListener(onClickListener);
        Button White2 = (Button) findViewById(R.id.White2);
        White2.setOnClickListener(onClickListener);
        Button White3 = (Button) findViewById(R.id.White3);
        White3.setOnClickListener(onClickListener);
        Button White4 = (Button) findViewById(R.id.White4);
        White4.setOnClickListener(onClickListener);
        Button White5 = (Button) findViewById(R.id.White5);
        White5.setOnClickListener(onClickListener);
        Button White6 = (Button) findViewById(R.id.White6);
        White6.setOnClickListener(onClickListener);
        Button White7 = (Button) findViewById(R.id.White7);
        White7.setOnClickListener(onClickListener);
        Button White8 = (Button) findViewById(R.id.White8);
        White8.setOnClickListener(onClickListener);
        Button White9 = (Button) findViewById(R.id.White9);
        White9.setOnClickListener(onClickListener);
        Button White10 = (Button) findViewById(R.id.White10);
        White10.setOnClickListener(onClickListener);
        Button White11 = (Button) findViewById(R.id.White11);
        White11.setOnClickListener(onClickListener);
        Button White12 = (Button) findViewById(R.id.White12);
        White12.setOnClickListener(onClickListener);
        Button White13 = (Button) findViewById(R.id.White13);
        White13.setOnClickListener(onClickListener);
        Button White14 = (Button) findViewById(R.id.White14);
        White14.setOnClickListener(onClickListener);

        Button Black1 = (Button) findViewById(R.id.Black1);
        Black1.setOnClickListener(onClickListener);
        Button Black2 = (Button) findViewById(R.id.Black2);
        Black2.setOnClickListener(onClickListener);
        Button Black3 = (Button) findViewById(R.id.Black3);
        Black3.setOnClickListener(onClickListener);
        Button Black4 = (Button) findViewById(R.id.Black4);
        Black4.setOnClickListener(onClickListener);
        Button Black5 = (Button) findViewById(R.id.Black5);
        Black5.setOnClickListener(onClickListener);
        Button Black6 = (Button) findViewById(R.id.Black6);
        Black6.setOnClickListener(onClickListener);
        Button Black7 = (Button) findViewById(R.id.Black7);
        Black7.setOnClickListener(onClickListener);
        Button Black8 = (Button) findViewById(R.id.Black8);
        Black8.setOnClickListener(onClickListener);
        Button Black9 = (Button) findViewById(R.id.Black9);
        Black9.setOnClickListener(onClickListener);
        Button Black10 = (Button) findViewById(R.id.Black10);
        Black10.setOnClickListener(onClickListener);

    }
}



