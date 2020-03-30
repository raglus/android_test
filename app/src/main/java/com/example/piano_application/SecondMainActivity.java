package com.example.piano_application;

import android.graphics.drawable.AnimationDrawable;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;


public class SecondMainActivity extends AppCompatActivity implements View.OnTouchListener {
    private SoundPool soundPool;
    SoundManager soundManager;
    Button button;
    boolean play;
    int playSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        MainActivity.BtnOnClickListener onClickListener = new MainActivity.BtnOnClickListener();

////         각 Button의 이벤트 리스너로 onClickListener 지정.
//        {
//            Button White1 = (Button) findViewById(R.id.White1);
//            White1.setOnClickListener(onClickListener);
//            Button White2 = (Button) findViewById(R.id.White2);
//            White2.setOnClickListener(onClickListener);
//            Button White3 = (Button) findViewById(R.id.White3);
//            White3.setOnClickListener(onClickListener);
//            Button White4 = (Button) findViewById(R.id.White4);
//            White4.setOnClickListener(onClickListener);
//            Button White5 = (Button) findViewById(R.id.White5);
//            White5.setOnClickListener(onClickListener);
//            Button White6 = (Button) findViewById(R.id.White6);
//            White6.setOnClickListener(onClickListener);
//            Button White7 = (Button) findViewById(R.id.White7);
//            White7.setOnClickListener(onClickListener);
//            Button White8 = (Button) findViewById(R.id.White8);
//            White8.setOnClickListener(onClickListener);
//            Button White9 = (Button) findViewById(R.id.White9);
//            White9.setOnClickListener(onClickListener);
//            Button White10 = (Button) findViewById(R.id.White10);
//            White10.setOnClickListener(onClickListener);
//            Button White11 = (Button) findViewById(R.id.White11);
//            White11.setOnClickListener(onClickListener);
//            Button White12 = (Button) findViewById(R.id.White12);
//            White12.setOnClickListener(onClickListener);
//            Button White13 = (Button) findViewById(R.id.White13);
//            White13.setOnClickListener(onClickListener);
//            Button White14 = (Button) findViewById(R.id.White14);
//            White14.setOnClickListener(onClickListener);
//
//            Button Black1 = (Button) findViewById(R.id.Black1);
//            Black1.setOnClickListener(onClickListener);
//            Button Black2 = (Button) findViewById(R.id.Black2);
//            Black2.setOnClickListener(onClickListener);
//            Button Black3 = (Button) findViewById(R.id.Black3);
//            Black3.setOnClickListener(onClickListener);
//            Button Black4 = (Button) findViewById(R.id.Black4);
//            Black4.setOnClickListener(onClickListener);
//            Button Black5 = (Button) findViewById(R.id.Black5);
//            Black5.setOnClickListener(onClickListener);
//            Button Black6 = (Button) findViewById(R.id.Black6);
//            Black6.setOnClickListener(onClickListener);
//            Button Black7 = (Button) findViewById(R.id.Black7);
//            Black7.setOnClickListener(onClickListener);
//            Button Black8 = (Button) findViewById(R.id.Black8);
//            Black8.setOnClickListener(onClickListener);
//            Button Black9 = (Button) findViewById(R.id.Black9);
//            Black9.setOnClickListener(onClickListener);
//            Button Black10 = (Button) findViewById(R.id.Black10);
//            Black10.setOnClickListener(onClickListener);
//        }

//         음악 사운드파일 등록
        {

            setContentView(R.layout.second_main);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                AudioAttributes audioAttributes = new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .build();

                soundPool = new SoundPool.Builder().setAudioAttributes(audioAttributes).setMaxStreams(8).build();
            }


            soundManager = new SoundManager(this, soundPool);

            soundManager.addSound(0, R.raw.a_low_sol);
            soundManager.addSound(1, R.raw.b_low_la);
            soundManager.addSound(2, R.raw.c_low_si);
            soundManager.addSound(3, R.raw.d_middle_do);
            soundManager.addSound(4, R.raw.e_middle_re);
            soundManager.addSound(5, R.raw.f_middle_mi);
            soundManager.addSound(6, R.raw.g_middle_fa);
            soundManager.addSound(7, R.raw.h_middle_sol);
            soundManager.addSound(8, R.raw.i_middle_ra);
            soundManager.addSound(9, R.raw.j_middle_si);
            soundManager.addSound(10, R.raw.k_high_do);
            soundManager.addSound(11, R.raw.l_high_re);
            soundManager.addSound(12, R.raw.m_high_mi);
            soundManager.addSound(13, R.raw.n_high_fa);
            soundManager.addSound(14, R.raw.o_high_sol);
        }

        // 그라데이션
        {
            RelativeLayout Background = findViewById(R.id.login_container);
            Background.setBackgroundResource(R.drawable.anime_1);
            final AnimationDrawable frameAnimation = (AnimationDrawable) Background.getBackground();
            frameAnimation.setEnterFadeDuration(2000);
            frameAnimation.setExitFadeDuration(2000);

            Background.postDelayed(new Runnable() {
                public void run() {
                    frameAnimation.start();
                }
            }, 200);
        }
        //피아노
        {
            soundPool.load(this, R.raw.a_low_sol,1);
            soundPool.load(this, R.raw.b_low_la,1);
            soundPool.load(this, R.raw.c_low_si,1);
            soundPool.load(this, R.raw.d_middle_do,1);
            soundPool.load(this, R.raw.e_middle_re,1);
            soundPool.load(this, R.raw.f_middle_mi,1);
            soundPool.load(this, R.raw.g_middle_fa,1);
            soundPool.load(this, R.raw.h_middle_sol,1);
            soundPool.load(this, R.raw.i_middle_ra,1);
            soundPool.load(this, R.raw.j_middle_si,1);
            soundPool.load(this, R.raw.k_high_do,1);
            soundPool.load(this, R.raw.l_high_re,1);
            soundPool.load(this, R.raw.m_high_mi,1);
            soundPool.load(this, R.raw.n_high_fa,1);
            soundPool.load(this, R.raw.o_high_sol,1);

        }
    }



    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN : {
                int mid = v.getId();
                soundManager.playSound(soundManager.changeSound(mid));

                break;
            }


        }
        return false;
    }
}
