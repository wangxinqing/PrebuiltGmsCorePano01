package defpackage;

/* renamed from: bzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzz extends bzi {
    private atrw f = atrw.UNKNOWN_STATE;
    private long g = 0;

    public bzz(atlv atlv) {
        super(bzz.class, atlv, 0, atjs.SHUSH_STATE_FENCE, new int[]{59});
    }

    public final int a(long j) {
        boolean z;
        if (this.f == atrw.UNKNOWN_STATE) {
            return b();
        }
        if (this.f == atrw.IN_SHUSH) {
            z = true;
        } else {
            z = false;
        }
        return a(z);
    }

    public final long i() {
        return this.g;
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.DND_MODE) {
            long a2 = cbi.i().a();
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            if (a2 - atmb.c <= awwn.a.a().d()) {
                atjm atjm = atjl.h;
                if (atjm == null) {
                    atjm = atjm.a;
                }
                auci auci = atrx.e;
                atjm.a(auci);
                if (atjm.m.a(auci.d)) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = atrx.e;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    atrx atrx = (atrx) b;
                    atrw atrw = this.f;
                    atrw a3 = atrw.a(atrx.c);
                    if (a3 == null) {
                        a3 = atrw.UNKNOWN_STATE;
                    }
                    if (atrw != a3) {
                        atmb atmb2 = atjl.g;
                        if (atmb2 == null) {
                            atmb2 = atmb.e;
                        }
                        this.g = atmb2.c;
                    }
                    atrw a4 = atrw.a(atrx.c);
                    if (a4 == null) {
                        a4 = atrw.UNKNOWN_STATE;
                    }
                    this.f = a4;
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("bzz", "a", 53, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ShushStateFenceImpl] No DND mode data.");
            }
        }
    }
}
