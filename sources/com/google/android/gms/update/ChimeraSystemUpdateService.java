package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraSystemUpdateService extends Service {
    private static wkg a = wkg.a();
    private adih b;

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.update.START_SERVICE")) {
            adih adih = this.b;
            adih.asBinder();
            return adih;
        }
        Log.w("CmaSystemUpdateService", "onBind is called with an unexpected intent, returning null.");
        return null;
    }

    public final void onCreate() {
        this.b = new adih(this, this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("onStartCommand: intent: ");
        sb.append(valueOf);
        sb.toString();
        stopSelf(i2);
        return 2;
    }

    public static int a(Context context) {
        if (!ayox.e()) {
            return ((Long) adki.e.a()).intValue();
        }
        int intValue = ((Long) adki.e.a()).intValue();
        Object f = wkg.a.f(context);
        if (f == null || ((long) intValue) == adki.b.longValue()) {
            return intValue;
        }
        if (adkf.a(context, ((adla) adla.h.b()).d().n).a == 0) {
            if (!a.a(f)) {
                Log.i("CmaSystemUpdateService", "Revert back to user choice after policy expiration.");
                return intValue;
            }
            Log.i("CmaSystemUpdateService", "Urgency overridden to automatic after policy expiration.");
            return adki.b.intValue();
        } else if (a.a(f)) {
            Log.i("CmaSystemUpdateService", "Urgency overridden to automatic.");
            return adki.b.intValue();
        } else if (wkg.a.b(f)) {
            Log.i("CmaSystemUpdateService", "Urgency overridden to windowed.");
            return adki.c.intValue();
        } else if (((Boolean) adke.h.a()).booleanValue()) {
            Log.i("CmaSystemUpdateService", "Urgency not overridden for security updates.");
            return intValue;
        } else {
            Log.i("CmaSystemUpdateService", "Urgency overridden to recommended.");
            return adki.d.intValue();
        }
    }
}
