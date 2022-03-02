package defpackage;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$2;

/* renamed from: vwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vwc implements Runnable {
    private final FastInitiation$2 a;
    private final ScanResult b;
    private final vjf c;

    public vwc(FastInitiation$2 fastInitiation$2, vjf vjf, ScanResult scanResult) {
        this.a = fastInitiation$2;
        this.c = vjf;
        this.b = scanResult;
    }

    public final void run() {
        FastInitiation$2 fastInitiation$2 = this.a;
        fastInitiation$2.a.a(this.c, this.b);
    }
}
