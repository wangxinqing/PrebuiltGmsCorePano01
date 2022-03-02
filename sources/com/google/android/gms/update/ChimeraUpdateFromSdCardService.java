package com.google.android.gms.update;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.File;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraUpdateFromSdCardService extends Service {
    public static final /* synthetic */ int d = 0;
    private static wkg e = wkg.a();
    public StateWatcher a;
    public volatile int b;
    public File c;
    private adio f;

    public final void a() {
        sendBroadcast(new Intent("com.google.android.gms.update.UpdateFromSdCard.STATUS_CHANGED"));
    }

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.update.BIND_SDCARD_SERVICE")) {
            adio adio = this.f;
            adio.asBinder();
            return adio;
        }
        Log.w("CmaUpdateFromSdCardS", "onBind for sdcard is called with an unexpected intent, returning null.");
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        StateWatcher stateWatcher = new StateWatcher(this, new adia(this));
        this.b = 1;
        this.a = stateWatcher;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
        stateWatcher.a.registerReceiver(stateWatcher, intentFilter);
        stateWatcher.a.getSharedPreferences("update", 0).edit().putInt("battery_state", stateWatcher.b).apply();
        this.f = new adio(this);
    }

    public final void onDestroy() {
        StateWatcher stateWatcher = this.a;
        stateWatcher.a.unregisterReceiver(stateWatcher);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (e.b() > 0) {
            stopSelf();
            return 2;
        }
        if (intent == null || !"com.google.android.gms.update.UpdateFromSdCard.VERIFIER_RESULT_CHANGED".equals(intent.getAction())) {
            this.b = 1;
        } else {
            if (intent.getBooleanExtra("verifier_task_result", false)) {
                int i4 = this.a.b;
                if (i4 == 0) {
                    i3 = 4;
                } else if (i4 == 1 || i4 == 2) {
                    i3 = 1040;
                } else {
                    Log.e("CmaUpdateFromSdCardS", "Unknown battery state, cannot handle!");
                }
            } else {
                i3 = 263;
            }
            this.b = i3;
        }
        a();
        stopSelf();
        return 2;
    }
}
