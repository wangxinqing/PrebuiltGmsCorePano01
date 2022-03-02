package com.google.android.gms.ads.jams;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.c;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b {
    public final Context a;
    public final qub b;
    public final d c;
    private final qwq d;

    protected b(Context context) {
        qub a2 = qub.a(context);
        d dVar = new d(context);
        qwq a3 = qwq.a(context);
        this.a = context;
        this.b = a2;
        this.c = dVar;
        this.d = a3;
    }

    /* access modifiers changed from: protected */
    public final Boolean a() {
        return Boolean.valueOf(this.c.b() > 0);
    }

    public final boolean b() {
        if (this.c.c()) {
            return false;
        }
        c.a("[JAMS] Negotiation has been disabled");
        return true;
    }

    public final void a(long j) {
        long d2 = awhl.d();
        qwq qwq = this.d;
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.ads.jams.NegotiationService";
        qxf.a(j, d2 + j);
        qxf.k = "jams-negotiation-task";
        qxf.b(0);
        qwq.a((qxx) qxf.b());
        this.c.a.edit().putLong("scheduled_next_negotiation_timestamp", System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j)).apply();
        StringBuilder sb = new StringBuilder(62);
        sb.append("[JAMS] Next negotiation to run in ");
        sb.append(j);
        sb.append(" seconds");
        c.a(sb.toString());
    }
}
