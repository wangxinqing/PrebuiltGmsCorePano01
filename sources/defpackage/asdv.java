package defpackage;

import android.bluetooth.le.ScanResult;
import android.os.SystemClock;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$1;

/* renamed from: asdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asdv extends arwm {
    final /* synthetic */ int a;
    final /* synthetic */ ScanResult b;
    final /* synthetic */ FastPairScanner$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdv(FastPairScanner$1 fastPairScanner$1, String str, int i, ScanResult scanResult) {
        super(str);
        this.c = fastPairScanner$1;
        this.a = i;
        this.b = scanResult;
    }

    public final void run() {
        aseb aseb = this.c.a;
        int i = aseb.l;
        aseb.c.a(this.a, aseb.a(this.b));
        this.c.a.b.put(this.b.getDevice().getAddress(), Long.valueOf(SystemClock.elapsedRealtime()));
        this.c.a.b();
    }
}
