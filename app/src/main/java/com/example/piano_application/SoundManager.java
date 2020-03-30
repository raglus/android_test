package com.example.piano_application;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;



import java.util.HashMap;

public class SoundManager {
    private SoundPool mSoundPool;
    private HashMap<Integer,Integer> mSoundPoolMap;
    private AudioManager mAudioManager;
    private Context mContext;
    private int mid;


    public SoundManager(Context mContext,SoundPool mSoundPool){
        this.mContext = mContext;
        this.mSoundPool = mSoundPool;
        mSoundPoolMap = new HashMap<Integer, Integer>();
        mAudioManager = (AudioManager)mContext.getSystemService(Context.AUDIO_SERVICE);

    }

    public void addSound(int index,int soundId){ //효과음추가
        mSoundPoolMap.put(index,mSoundPool.load(mContext,soundId,1));
    }
    public int playSound(int index){ //효과음재생
        int streamVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        return  mSoundPool.play(mSoundPoolMap.get(index),streamVolume,streamVolume,1,0,1f);
    }
    public void stopSound(int streamId){ //효과음 정지
        mSoundPool.stop(streamId);
    }

    public int changeSound(int mid){
        this.mid = mid ;
        switch (mid){
            case R.id.White1:{
                return 0;
                }

            case R.id.White2:{
                return 1;
                }


            case R.id.White3:{
                return 2;
                }


            case R.id.White4:{
                return 3;
               }


            case R.id.White5:{
                return 4;
               }


            case R.id.White6:{
                return 5;
               }


            case R.id.White7:{
                return 6;
                }


            case R.id.White8:{
                return 7;
                }


            case R.id.White9:{
                return 8;
               }


            case R.id.White10:{
                return 9;
               }


            case R.id.White11: {
                return 10;

            }


            case R.id.White12: {
                return 11;

            }


            case R.id.White13: {
                return 12;

            }


            case R.id.White14: {
                return 13;
            }


//            case R.id.Black1:
//
//                break;
//            case R.id.Black2:
//
//                break;
//            case R.id.Black3:
//
//                break;
//            case R.id.Black4:
//
//                break;
//            case R.id.Black5:
//
//                break;
//            case R.id.Black6:
//
//                break;
//            case R.id.Black7:
//
//                break;
//            case R.id.Black8:
//
//                break;
//            case R.id.Black9:
//
//                break;
//            case R.id.Black10:
//
//                break;

        }
        return 100;
    }

}

