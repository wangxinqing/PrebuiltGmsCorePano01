package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: syb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syb implements Runnable {
    final /* synthetic */ syd a;

    public syb(syd syd) {
        this.a = syd;
    }

    public final void run() {
        String str;
        sye sye = this.a.c;
        Context z = sye.z();
        if (this.a.c.u().a) {
            str = "com.google.android.gms.measurement.PackageMeasurementService";
        } else {
            str = "com.google.android.gms.measurement.AppMeasurementService";
        }
        sye.a(new ComponentName(z, str));
    }
}
