package defpackage;

import android.bluetooth.le.ScanResult;

/* renamed from: txp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class txp extends arwm {
    final /* synthetic */ tzf a;
    final /* synthetic */ ScanResult b;
    final /* synthetic */ txr c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public txp(txr txr, String str, tzf tzf, ScanResult scanResult) {
        super(str);
        this.c = txr;
        this.a = tzf;
        this.b = scanResult;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
