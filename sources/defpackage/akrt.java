package defpackage;

import android.location.Location;

/* renamed from: akrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akrt implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ akrv b;

    public akrt(akrv akrv, long j) {
        this.b = akrv;
        this.a = j;
    }

    public final void run() {
        this.b.a(this.a, (Location) null);
    }
}
