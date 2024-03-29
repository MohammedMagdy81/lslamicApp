package com.example.myislamicapp.data.prayersNotifications;

import static com.example.myislamicapp.data.utils.Constant.REGISTER_TAG;

import android.content.Context;

import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import com.example.myislamicapp.data.utils.Constant;

import java.util.concurrent.TimeUnit;

public class AzanUtils {

    public static final String AZAN_CHANNEL_ID = "AzanChannel";
    public static final String AZAN_CHANNEL_NAME = "AzanChannelName";

//    public static void registerPrayerTimes(Context context) {
//        WorkManager.getInstance(context.getApplicationContext()).cancelAllWork();
//        PeriodicWorkRequest mRegisterRequest = new PeriodicWorkRequest.Builder(RegisterPrayerTimeWorker.class,
//                30,
//                TimeUnit.DAYS)
//                .addTag(REGISTER_TAG)
//                .build();
//        WorkManager.getInstance(context.getApplicationContext()).enqueueUniquePeriodicWork(REGISTER_TAG,
//                ExistingPeriodicWorkPolicy.REPLACE, mRegisterRequest);
//    }

    public static void registerPrayerTimes(Context context) {

        WorkManager.getInstance(context.getApplicationContext()).cancelAllWork();
        PeriodicWorkRequest registerRequest = new PeriodicWorkRequest
                .Builder(RegisterPrayerTimeWorker.class, 30, TimeUnit.DAYS)
                .addTag("REGISTER_PRAYERS")
                .build();
        WorkManager.getInstance(context.getApplicationContext())
                .enqueueUniquePeriodicWork("REGISTER_PRAYERS",
                        ExistingPeriodicWorkPolicy.REPLACE, registerRequest);
    }
}
