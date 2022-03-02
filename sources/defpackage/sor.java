package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: sor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sor extends sos {
    public final Map a = new nz();
    public final Map b = new nz();
    public long c;

    public sor(svv svv) {
        super(svv);
    }

    public final void a(long j) {
        sxk o = c().o();
        for (String str : this.a.keySet()) {
            a(str, j - ((Long) this.a.get(str)).longValue(), o);
        }
        if (!this.a.isEmpty()) {
            a(j - this.c, o);
        }
        b(j);
    }

    public final void b(long j) {
        for (String put : this.a.keySet()) {
            this.a.put(put, Long.valueOf(j));
        }
        if (!this.a.isEmpty()) {
            this.c = j;
        }
    }

    public final void a(long j, sxk sxk) {
        if (sxk == null) {
            E().k.a("Not logging ad exposure. No active activity");
        } else if (j >= 1000) {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            sxn.a(sxk, bundle, true);
            f().a("am", "_xa", bundle);
        } else {
            E().k.a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        }
    }

    public final void a(String str, long j, sxk sxk) {
        if (sxk == null) {
            E().k.a("Not logging ad unit exposure. No active activity");
        } else if (j >= 1000) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            sxn.a(sxk, bundle, true);
            f().a("am", "_xu", bundle);
        } else {
            E().k.a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        }
    }
}
