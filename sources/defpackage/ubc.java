package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubc extends arwm {
    final /* synthetic */ DiscoveryChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubc(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.a = discoveryChimeraService;
    }

    public final void run() {
        jjg jjg = tsp.a;
        tsm tsm = this.a.b;
        synchronized (tsm.e) {
            tsm.f.add(tsl.SUBSCRIBE_BACKGROUND);
        }
        tsm.b.c(tsm.c);
        this.a.d.a();
        tst tst = this.a.h;
        tst.b.b();
        if (tst.e.c().getBoolean("has_pending_app_install", false)) {
            tst.e.b(false);
            for (ttg ttg : tst.c.c()) {
                if (ttg.b(ttg.a.a())) {
                    String str = tst.f.a(ttg.t(), ttg).c;
                    if (str == null) {
                        ((anih) tsp.a.b()).a("error parsing actionUrl for app install %s", (Object) ttg.t());
                    } else {
                        long j = Long.MAX_VALUE;
                        try {
                            PackageInfo packageInfo = tst.g.a.getPackageManager().getPackageInfo(str, 0);
                            if (packageInfo != null) {
                                j = packageInfo.firstInstallTime;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            aryq aryq = aryq.a;
                        }
                        if (ttg.b(j)) {
                            tst.a.a(asom.APP_INSTALLED, ttg);
                            ttg.a((Long) null);
                        }
                    }
                }
            }
        }
    }
}
