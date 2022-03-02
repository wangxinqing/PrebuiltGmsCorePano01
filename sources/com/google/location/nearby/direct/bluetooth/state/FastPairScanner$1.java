package com.google.location.nearby.direct.bluetooth.state;

import android.bluetooth.le.ScanResult;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastPairScanner$1 extends nkz {
    public final /* synthetic */ aseb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairScanner$1(aseb aseb, String str, String str2) {
        super(str, str2);
        this.a = aseb;
    }

    public final void a(int i) {
        ((anih) ((anih) asil.a.b()).a("com.google.location.nearby.direct.bluetooth.state.FastPairScanner$1", "a", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: onScanFailed, error code=%d", i);
        aseb aseb = this.a;
        int i2 = aseb.l;
        aseb.a.c(aseb.e);
    }

    public final void a(int i, ScanResult scanResult) {
        if (scanResult.getScanRecord() != null) {
            aseb aseb = this.a;
            int i2 = aseb.l;
            asea asea = aseb.i;
            if (asea != null) {
                asea.c++;
            }
            aseb.a.c(new asdv(this, "FastPairScanner_onScanResult", i, scanResult));
        }
    }
}
