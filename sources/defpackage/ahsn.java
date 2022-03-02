package defpackage;

import android.location.GnssNavigationMessage;

/* renamed from: ahsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsn implements Runnable {
    private final ahsr a;
    private final GnssNavigationMessage b;
    private final long c;

    public ahsn(ahsr ahsr, GnssNavigationMessage gnssNavigationMessage, long j) {
        this.a = ahsr;
        this.b = gnssNavigationMessage;
        this.c = j;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c);
    }
}
