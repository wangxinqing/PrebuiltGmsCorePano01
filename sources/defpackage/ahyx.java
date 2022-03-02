package defpackage;

import android.net.wifi.ScanResult;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyx implements ahyy {
    public static final ahyx a = new ahyx();

    private ahyx() {
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            if (!(scanResult == null || scanResult.SSID == null || !agxx.a(scanResult.BSSID, scanResult.SSID))) {
                it.remove();
            }
        }
    }
}
