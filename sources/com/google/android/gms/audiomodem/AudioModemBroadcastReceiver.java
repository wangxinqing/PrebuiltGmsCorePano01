package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioModemBroadcastReceiver extends nla {
    public final Context a;
    public final qvr b;
    public boolean c;
    private final eda d;

    public AudioModemBroadcastReceiver(Context context, qvr qvr, eda eda) {
        super("nearby");
        this.a = context;
        this.b = qvr;
        this.d = eda;
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".endsWith(intent.getAction())) {
            jjg jjg = edx.a;
            eda eda = this.d;
            if (eda.f) {
                eeo eeo = eda.e;
                eeo.c = true;
                eeo.b();
            }
            if (eda.d) {
                eda.c.b();
            }
        }
    }
}
