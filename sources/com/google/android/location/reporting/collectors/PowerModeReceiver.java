package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PowerModeReceiver extends nla {
    public ajlm a;
    private final ajmo b;
    private final ajmn c;

    public PowerModeReceiver(ajmo ajmo, ajmn ajmn) {
        super("location");
        this.b = ajmo;
        this.c = ajmn;
        ajmn.a(ajmo.d());
    }

    private final void a(boolean z) {
        int i;
        if (z != this.c.f) {
            this.b.c.edit().putBoolean("lastDeepStillModeValue", z).apply();
            this.c.a(z);
            ajlm ajlm = this.a;
            System.currentTimeMillis();
            if (aztb.M()) {
                if (!z) {
                    i = 2;
                } else {
                    i = 1;
                }
                ajlm.c(i);
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("UlrClearcutEvents.logDeepStillChanged(");
            sb.append(z);
            sb.append(")");
            sb.toString();
            if (ajjd.a()) {
                ajjd.a.g(z);
            }
        }
    }

    public final void a(Context context, Intent intent) {
        if (this.a != null) {
            String action = intent.getAction();
            String valueOf = String.valueOf(action);
            if (valueOf.length() == 0) {
                new String("Received power mode change: ");
            } else {
                "Received power mode change: ".concat(valueOf);
            }
            if ("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED".equals(action)) {
                a(true);
            } else if ("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED".equals(action)) {
                a(false);
            }
            if (!aztb.q() && !aztb.r()) {
                this.a.b(1);
            } else if (action != null && this.a != null) {
                if ("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED".equals(action)) {
                    this.a.a(1);
                } else if ("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED".equals(action)) {
                    this.a.a(2);
                }
            }
        }
    }
}
