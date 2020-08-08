package com.example.gridtry;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MusicService extends Service {
    MediaPlayer mp;


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp = MediaPlayer.create(this, R.raw.music1);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();
        Toast.makeText(this, "Music Started", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Music Stopped", Toast.LENGTH_SHORT).show();
        mp.stop();
    }
}
