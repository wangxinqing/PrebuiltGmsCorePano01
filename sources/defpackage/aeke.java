package defpackage;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;

/* renamed from: aeke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeke extends ScanCallback {
    final /* synthetic */ aekf a;

    public aeke(aekf aekf) {
        this.a = aekf;
    }

    public final void onScanFailed(int i) {
        this.a.a(i);
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        this.a.a(new aekg(scanResult));
    }
}
