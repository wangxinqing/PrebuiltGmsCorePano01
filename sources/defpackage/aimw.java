package defpackage;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* renamed from: aimw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimw implements jlp {
    final /* synthetic */ aing a;
    private String b;

    public aimw(aing aing) {
        this.a = aing;
        WifiInfo connectionInfo = ((WifiManager) aing.l.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo != null) {
            this.b = connectionInfo.getBSSID();
        }
    }

    public final void a(boolean z, String str) {
        if (z) {
            this.b = str;
        }
        if (!aybx.b()) {
            aiko.a.a((aikn) new aikr(1713186543, z, this.b));
        } else {
            aiko.a.a(-1953066164, z, this.b);
        }
        this.a.a(z);
    }
}
