package defpackage;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdb {
    public static final ith a = new ith("ActionQueue", "");
    private static final String g = new JSONObject().toString();
    public final kkf b;
    public final lsm c;
    public final khw d;
    public final long e = ((Long) jzq.v.c()).longValue();
    public final lgy f;
    private final Context h;
    private final kkb i;
    private final kdn j;
    private final kdl k;
    private final lsh l;
    private final ksw m;
    private final lfr n;
    private final jiq o;
    private final lsf p = new lsf(new kcz(this), this.e, jfm.b(10), "PendingCleanupActionThread");
    private final lhv q;
    private kdv r;

    public kdb(Context context, lsm lsm, kkf kkf, kkb kkb, lgy lgy, kdn kdn, ksw ksw, khw khw, jiq jiq, lfr lfr, lhv lhv) {
        this.h = context;
        iva.a((Object) kkf);
        this.b = kkf;
        iva.a((Object) kkb);
        this.i = kkb;
        iva.a((Object) lgy);
        this.f = lgy;
        iva.a((Object) kdn);
        this.j = kdn;
        this.k = new kdl();
        this.c = lsm;
        this.l = new kdc();
        this.d = khw;
        this.o = jiq;
        iva.a((Object) ksw);
        this.m = ksw;
        iva.a((Object) lfr);
        this.n = lfr;
        iva.a((Object) lhv);
        this.q = lhv;
    }

    public final synchronized int a(kah kah) {
        return a(kah, (lfq) null);
    }

    public final void b() {
        a().c();
        d();
    }

    public final synchronized void c() {
        boolean z = true;
        iva.a(!this.b.b());
        if (this.r != null) {
            z = false;
        }
        iva.a(z);
        this.r = kdv.a(this.b, this.f, this.h, this.k, this.c, this.j, this.l, this.d, this.m, this.n, this.o, this.q);
        d();
    }

    public final void d() {
        this.p.a();
    }

    public final synchronized boolean e() {
        kdv kdv;
        kdv = this.r;
        return kdv != null && kdv.b();
    }

    /* JADX INFO: finally extract failed */
    public final synchronized int a(kah kah, lfq lfq) {
        kkb kkb;
        boolean z;
        kah kah2 = kah;
        synchronized (this) {
            this.i.h();
            int i2 = 2;
            try {
                kkz a2 = kah.a();
                kdv a3 = a();
                kof kof = r6;
                kof kof2 = new kof(this.i, -1, a2.b, g, kah.s(), 0, System.currentTimeMillis(), false, (String) null);
                kof.t();
                kof kof3 = kof;
                long j2 = kof3.m;
                try {
                    kao a4 = kah2.a(new kam(this.b, j2, lfq));
                    kof3.d = kah.s();
                    kof3.a(a4.a().toString());
                    kof3.t();
                    if (j2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iva.b(z);
                    a3.b.execute(new kdq(a3, j2));
                    this.i.i();
                    this.i.j();
                    return 0;
                } catch (kcp e2) {
                    this.i.j();
                    kdm a5 = kah2.a(this.b);
                    if (a5 != null) {
                        this.j.a(2, a5);
                    }
                    return 0;
                } catch (Throwable th) {
                    this.i.j();
                    throw th;
                }
            } catch (JSONException e3) {
                a.c("ActionQueue", "Failed to commit action", e3);
                kkb = this.i;
                kkb.j();
                return 1;
            } catch (kco e4) {
                a.c("ActionQueue", "Cannot apply action", e4);
                if (!(e4 instanceof kcs)) {
                    i2 = !(e4 instanceof kcu) ? !(e4 instanceof kcr) ? !(e4 instanceof kcq) ? e4 instanceof kcv ? 6 : 1 : 5 : 4 : 3;
                }
                this.i.j();
                return i2;
            } catch (Exception e5) {
                a.c("ActionQueue", "Unexpected exception when applying action", e5);
                kkb = this.i;
                kkb.j();
                return 1;
            }
        }
    }

    public final synchronized kdv a() {
        kdv kdv;
        kdv = this.r;
        iva.a((Object) kdv, (Object) "PendingActionManager is not initialized");
        return kdv;
    }
}
