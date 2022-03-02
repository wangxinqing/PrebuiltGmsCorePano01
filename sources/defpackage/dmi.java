package defpackage;

import android.content.ComponentName;

/* renamed from: dmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmi implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ dmj b;

    public dmi(dmj dmj, ComponentName componentName) {
        this.b = dmj;
        this.a = componentName;
    }

    public final void run() {
        dmk dmk = this.b.c;
        ComponentName componentName = this.a;
        dkw.a();
        if (dmk.b != null) {
            dmk.b = null;
            dmk.a("Disconnected from device AnalyticsService", componentName);
            dmk.u();
        }
    }
}
