package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;

/* renamed from: swu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class swu implements Runnable {
    private final sxd a;

    public swu(sxd sxd) {
        this.a = sxd;
    }

    public final void run() {
        NetworkInfo networkInfo;
        sxd sxd = this.a;
        sxd.h();
        if (sxd.w().u.a()) {
            sxd.E().j.a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a2 = sxd.w().v.a();
        sxd.w().v.a(1 + a2);
        sxd.v();
        if (a2 >= 5) {
            sxd.E().f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            sxd.w().u.a(true);
            return;
        }
        svv svv = sxd.x;
        svv.p();
        svv.a((swm) svv.i());
        String o = svv.n().o();
        Pair a3 = svv.a().a(o);
        if (!svv.g.f().booleanValue() || ((Boolean) a3.second).booleanValue() || TextUtils.isEmpty((CharSequence) a3.first)) {
            svv.E().j.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        sxh i = svv.i();
        i.k();
        try {
            networkInfo = ((ConnectivityManager) i.z().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            szj f = svv.f();
            URL a4 = f.a(svv.n().s(), o, (String) a3.first, svv.a().v.a() - 1);
            sxh i2 = svv.i();
            svt svt = new svt(svv);
            i2.h();
            i2.k();
            iva.a((Object) a4);
            iva.a((Object) svt);
            i2.F().b(new sxg(i2, o, a4, svt));
            return;
        }
        svv.E().f.a("Network is not available for Deferred Deep Link request. Skipping");
    }
}
