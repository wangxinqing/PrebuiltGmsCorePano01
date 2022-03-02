package defpackage;

import com.google.android.gms.location.LocationResult;

/* renamed from: cfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfe implements Runnable {
    final /* synthetic */ LocationResult a;
    final /* synthetic */ cff b;

    public cfe(cff cff, LocationResult locationResult) {
        this.b = cff;
        this.a = locationResult;
    }

    public final void run() {
        new Object[1][0] = this.a.a();
        this.b.a(this.a.a());
    }
}
