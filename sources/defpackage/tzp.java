package defpackage;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.discovery.fastpair.scanner.FastPairScanner$FastPairFoundScanCallback;

/* renamed from: tzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzp extends arwm {
    final /* synthetic */ ScanResult a;
    final /* synthetic */ int b;
    final /* synthetic */ FastPairScanner$FastPairFoundScanCallback c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tzp(FastPairScanner$FastPairFoundScanCallback fastPairScanner$FastPairFoundScanCallback, String str, ScanResult scanResult, int i) {
        super(str);
        this.c = fastPairScanner$FastPairFoundScanCallback;
        this.a = scanResult;
        this.b = i;
    }

    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}
