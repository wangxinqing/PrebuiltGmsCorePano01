package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import android.location.Location;
import com.android.volley.Response;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockscreenChimeraReceiver extends IntentOperation {
    private static boolean a;

    public static synchronized void a(boolean z) {
        synchronized (LockscreenChimeraReceiver.class) {
            a = z;
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (LockscreenChimeraReceiver.class) {
            z = a;
        }
        return z;
    }

    public final void onHandleIntent(Intent intent) {
        if (a() && "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            snb.e(this);
            snb.f(this);
            smh.a(new avuj[]{avuj.SCREEN_UNLOCKED}, (Location) null, (avtx) null, (avty) null, (String) smo.l.a(), (avue) null, snh.a(this), (String) null, (Response.Listener) null, (Response.ErrorListener) null);
            a(false);
        }
    }
}
