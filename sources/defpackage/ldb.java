package defpackage;

import android.content.SyncResult;
import java.util.Date;
import java.util.Locale;

/* renamed from: ldb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ldb implements lff {
    private final kkz a;
    private final ldz b;
    private final int c;
    private lef d = null;
    private lfa e = null;
    private final koa f;

    public ldb(kkz kkz, ldz ldz, koa koa, int i) {
        iva.a((Object) ldz);
        iva.a((Object) koa);
        iva.b(i >= 0);
        this.a = kkz;
        this.b = ldz;
        this.c = i;
        this.f = koa;
    }

    public final void a(SyncResult syncResult) {
        lef lef = this.d;
        Long l = null;
        if (lef != null) {
            String a2 = lef.a();
            Date a3 = this.e.a();
            if (a3 != null) {
                l = Long.valueOf(a3.getTime());
            }
            this.f.a(a2, l);
            this.f.t();
            return;
        }
        this.b.a(0);
        this.b.a((String) null);
    }

    public final boolean a() {
        return false;
    }

    public final String b() {
        return String.format(Locale.US, "SyncMoreAlgorithm[%s]", new Object[]{this.f.toString()});
    }

    public final String toString() {
        return String.format(Locale.US, "SyncMoreAlgorithm[delegate=%s]", new Object[]{this.b});
    }

    public final void a(lea lea, lnk lnk, SyncResult syncResult) {
        if (!this.f.c()) {
            this.e = new lfa(this.b, this.f.b.longValue());
            this.d = new lef(this.e);
            koa koa = this.f;
            lea.a(koa.a, Long.valueOf(koa.m), this.a, this.c, this.d, lnk);
        }
    }
}
