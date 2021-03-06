package com.google.android.gms.stats;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.PendingCallback;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RequestCollectorChimeraService extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Log.i("RequestCollectorService", "Requesting collection");
        Intent intent2 = new Intent();
        PendingCallback pendingCallback = new PendingCallback((IBinder) new acrq());
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.stats.PlatformStatsCollectorService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtras(intent);
        intent2.putExtra("callback", pendingCallback);
        startService(intent2);
    }
}
