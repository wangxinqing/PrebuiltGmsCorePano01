package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.WorkSource;

/* renamed from: aiyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyl extends aiym {
    final WifiManager.WifiLock a;

    public aiyl(Context context, boolean z, WifiManager wifiManager, String str) {
        super(context, z, str, aiym.b);
        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(2, "NlpWifiLock");
        this.a = createWifiLock;
        createWifiLock.setReferenceCounted(false);
    }

    public final void a() {
        this.a.release();
        super.a();
    }

    public final void a(long j, aizx aizx) {
        WorkSource a2;
        super.a(j, aizx);
        if ((aizx instanceof ajrb) && (a2 = ((ajrb) aizx).a()) != null) {
            this.c.c(a2);
        }
        this.a.acquire();
    }
}
