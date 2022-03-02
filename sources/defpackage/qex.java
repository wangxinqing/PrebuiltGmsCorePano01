package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qex {
    public final hph a;
    private final Map b = new HashMap();
    private final qeu c = new qeu();

    static {
        new qfn("ClearcutCounters");
    }

    public qex(Context context) {
        int i = (int) axuy.a.a().i();
        if (i <= 0) {
            new Object[1][0] = Integer.valueOf(i);
            this.a = null;
            return;
        }
        hph hph = new hph(new hol(context, "WESTINGHOUSE_COUNTERS", (String) null), "WESTINGHOUSE_COUNTERS", i);
        this.a = hph;
        hph.a();
    }

    public final synchronized hpd a(String str) {
        hpd hpd;
        hpd = (hpd) this.b.get(str);
        if (hpd == null) {
            hpd = this.a.a(str, hph.p);
            this.b.put(str, hpd);
        }
        return hpd;
    }

    public final qew b(String str) {
        hph hph = this.a;
        if (hph != null) {
            return new qew(hph.b(str));
        }
        return new qew((hox) null);
    }

    public final qev a() {
        return a(0);
    }

    public final qev a(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("offsetMillis should be >= 0, not ");
        sb.append(j);
        iva.b(z, sb.toString());
        return this.a != null ? new qev(this, j) : new qev(this);
    }

    public final void a(String str, int i) {
        hph hph = this.a;
        if (hph != null) {
            hph.a(this.c.a(str, i));
        }
    }
}
