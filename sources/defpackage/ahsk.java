package defpackage;

import android.telephony.CellLocation;

/* renamed from: ahsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsk implements Runnable {
    private final ahsr a;
    private final int b;
    private final String c;
    private final CellLocation d;
    private final int e;
    private final long f;

    public ahsk(ahsr ahsr, int i, String str, CellLocation cellLocation, int i2, long j) {
        this.a = ahsr;
        this.b = i;
        this.c = str;
        this.d = cellLocation;
        this.e = i2;
        this.f = j;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}
