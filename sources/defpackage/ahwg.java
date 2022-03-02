package defpackage;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiScanner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwg implements WifiScanner.ScanListener {
    private final ArrayList a = new ArrayList();
    private final ahwf b;

    public ahwg(ahwf ahwf) {
        this.b = ahwf;
    }

    public final void onFailure(int i, String str) {
        this.b.a(false);
    }

    public final void onFullResult(ScanResult scanResult) {
        if (scanResult != null) {
            this.a.add(scanResult);
        }
    }

    public final void onPeriodChanged(int i) {
    }

    public final void onResults(WifiScanner.ScanData[] scanDataArr) {
        this.b.a((List) this.a);
    }

    public final void onSuccess() {
    }
}
