package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;

/* renamed from: ntn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntn {
    public final Context a;
    public final nua b;
    public final nsb c;
    private NavigableMap d;
    private String e;

    public ntn(Context context, nua nua, nsb nsb) {
        this.a = context;
        this.b = nua;
        this.c = nsb;
    }

    public final int a(ntx ntx) {
        int i;
        Map.Entry b2 = b(ntx);
        if (b2 != null) {
            i = ((Integer) b2.getValue()).intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        return !a(ntx, System.currentTimeMillis()) ? Math.max(0, i - this.b.b(ntx).c) : i;
    }

    public final Map.Entry b(ntx ntx) {
        NavigableMap a2 = a();
        if (a2 != null) {
            return a2.floorEntry(Integer.valueOf(nqw.a(nrr.a().l.b(ntx.b), ntx)));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized NavigableMap a() {
        String c2 = axjy.a.a().c();
        if (!c2.equals(this.e)) {
            anbd anbd = null;
            if (!c2.isEmpty()) {
                List c3 = amsk.a(',').c(c2);
                if (c3.size() % 2 != 0) {
                    String valueOf = String.valueOf(c2);
                    Log.w("GCM", valueOf.length() == 0 ? new String("Ignoring malformed quotas flag: ") : "Ignoring malformed quotas flag: ".concat(valueOf));
                } else {
                    anbb b2 = anbd.b();
                    int i = 0;
                    while (i < c3.size()) {
                        try {
                            b2.a(Integer.valueOf(Integer.parseInt((String) c3.get(i))), Integer.valueOf(Integer.parseInt((String) c3.get(i + 1))));
                            i += 2;
                        } catch (NumberFormatException e2) {
                            String valueOf2 = String.valueOf(c2);
                            Log.w("GCM", valueOf2.length() == 0 ? new String("Ignoring malformed quotas flag: ") : "Ignoring malformed quotas flag: ".concat(valueOf2));
                        }
                    }
                    anbd = b2.a();
                }
            }
            this.d = anbd;
            this.e = c2;
            return anbd;
        }
        return this.d;
    }

    public final boolean a(ntx ntx, long j) {
        long j2 = j - this.b.b(ntx).b;
        return j2 < 0 || j2 > axlc.a.a().Z();
    }
}
