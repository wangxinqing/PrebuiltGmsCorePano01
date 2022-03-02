package defpackage;

import android.content.SyncResult;
import java.util.Locale;
import java.util.Set;

/* renamed from: lfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lfc implements lff {
    public final Set a;
    private final kkf b;
    private final kkz c;
    private final int d;

    public lfc(lsm lsm, kkz kkz, int i) {
        this.b = lsm.d;
        iva.a((Object) kkz);
        this.c = kkz;
        this.d = i;
        this.a = this.b.d(kkz);
        for (koa koa : this.b.a(kkz, lcr.APPDATA)) {
            if (koa.c() || koa.d() >= ((long) i)) {
                this.a.removeAll(((lcm) koa.b()).a);
            }
        }
    }

    public final void a(SyncResult syncResult) {
    }

    public final boolean a() {
        return false;
    }

    public final String b() {
        return String.format(Locale.US, "FullAppDataOnlySyncAlgorithm[%s]", new Object[]{anbs.a((Iterable) this.a)});
    }

    public final void a(lea lea, lnk lnk, SyncResult syncResult) {
        for (String a2 : this.a) {
            koa a3 = this.b.a(this.c, (lcp) new lcm(anax.a((Object) a2)), Long.MAX_VALUE);
            lea lea2 = lea;
            lea2.a(a3.a, Long.valueOf(a3.m), this.c, this.d, new lek(a3, leb.a(leb.a(syncResult), Long.MAX_VALUE)), lnk);
        }
    }
}
