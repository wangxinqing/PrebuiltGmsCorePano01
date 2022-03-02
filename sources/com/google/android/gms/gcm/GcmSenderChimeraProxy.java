package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmSenderChimeraProxy extends BroadcastReceiver {
    static acrz b;

    public static void a() {
        acrz acrz = b;
        if (acrz != null) {
            acrz.c();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        nqw.a(context);
        for (String str : intent.getExtras().keySet()) {
            if (str.startsWith("GOOG.") || str.startsWith("GOOGLE.")) {
                intent.removeExtra(str);
            }
        }
        if (nqw.d() != 0) {
            intent.putExtra("GOOGLE.UAID", nrr.a().b.b());
        }
        GcmProxyIntentOperation.a(context, intent);
    }

    static synchronized void a(Context context) {
        synchronized (GcmSenderChimeraProxy.class) {
            if (b == null) {
                acrz acrz = new acrz(context, 1, "GCMSEND", (String) null, "com.google.android.gms");
                b = acrz;
                acrz.a(false);
            }
            b.a(500);
        }
    }
}
