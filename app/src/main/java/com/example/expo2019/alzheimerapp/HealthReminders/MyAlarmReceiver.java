package com.example.expo2019.alzheimerapp.HealthReminders;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.example.expo2019.alzheimerapp.R;

public class MyAlarmReceiver extends BroadcastReceiver {
    private static final String CHANNEL_ID = "5";
    Notification mNotification;
    String alarmTitle;


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm triggered!", Toast.LENGTH_SHORT).show();

        String title = intent != null ? intent.getStringExtra("title") : null;

        MediaPlayer mediaPlayer;
        if ("food".equalsIgnoreCase(title)) {
            mediaPlayer = MediaPlayer.create(context, R.raw.foodremindervoice);
        } else if ("water".equalsIgnoreCase(title)) {
            mediaPlayer = MediaPlayer.create(context, R.raw.waterreminervoice);
        } else {
            mediaPlayer = MediaPlayer.create(context, R.raw.coolalarmnew);
        }

        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }

        Intent i = new Intent(context, Myservice.class);
        i.putExtra("title", title != null ? title : "");
        context.startService(i);
    }


}