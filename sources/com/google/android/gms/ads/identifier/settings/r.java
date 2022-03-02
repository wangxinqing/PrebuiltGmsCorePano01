package com.google.android.gms.ads.identifier.settings;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class r {
    private static r a = null;
    private final qwq b;

    public r(qwq qwq) {
        this.b = qwq;
    }

    public static synchronized r a(Context context) {
        r rVar;
        synchronized (r.class) {
            if (a == null) {
                r rVar2 = new r(qwq.a(context));
                a = rVar2;
                rVar2.b();
                a.a();
            }
            rVar = a;
        }
        return rVar;
    }

    public final void b() {
        if (awhh.f()) {
            long l = awhh.a.a().l();
            qxf qxf = new qxf();
            qxf.i = "com.google.android.gms.ads.jams.NegotiationService";
            qxf.a(0, l);
            qxf.k = "ads.fetch_integrity_token.one_time";
            qxf.a(0);
            this.b.a((qxx) qxf.b());
        }
    }

    public final void a() {
        if (awhh.f()) {
            long n = awhh.a.a().n();
            long m = awhh.a.a().m();
            qxi qxi = new qxi();
            qxi.i = "com.google.android.gms.ads.jams.NegotiationService";
            qxi.b = m;
            qxi.a = n;
            qxi.k = "ads.fetch_integrity_token.periodic";
            qxi.a(0);
            this.b.a((qxx) qxi.b());
        }
    }
}
