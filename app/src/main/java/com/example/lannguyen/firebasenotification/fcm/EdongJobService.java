package com.example.lannguyen.firebasenotification.fcm;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.util.Log;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class EdongJobService extends JobService {

    private static final String TAG = "MyJobService";
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "Performing long running task in scheduled job");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
