package com.example.pertemuan5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;


    public class AlertReceiver extends BroadcastReceiver
    {
        //ketika menerima broadcast dari alarm, maka akan segera memunculkan notifikasi
        @Override
        public void onReceive(Context context, Intent intent)
        {
            NotificationHelp notificationHelp = new
                    NotificationHelp(context);
            NotificationCompat.Builder nb =
                    notificationHelp.getChannelNotification();
            notificationHelp.getManager().notify(1, nb.build());
        }
    }
