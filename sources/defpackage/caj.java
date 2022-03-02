package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: caj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class caj extends jip {
    public final Set a = new HashSet();
    final /* synthetic */ cap b;
    private car g = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public caj(cap cap) {
        super(bta.i, cbi.f(), cbi.k().c);
        this.b = cap;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(jio jio) {
        cas cas = (cas) jio;
        new Object[1][0] = cas;
        if (this.b.d) {
            this.a.remove(cas);
        }
        cap cap = this.b;
        bsz bsz = cas.b.c;
        iva.a((Object) bsz);
        atjv b2 = cas.b();
        if (b2 != atjv.UNKNOWN_CONTEXT_NAME) {
            cax cax = (cax) cap.a.get(bsz);
            if (cax == null) {
                cax = new cax();
                cap.a.put(bsz, cax);
            }
            boolean a2 = cax.a(b2.bA);
            if (cas.a() == 0) {
                cas.a(cbi.i().a());
            }
            car car = cas.b;
            cas cas2 = (cas) cax.a.remove(car);
            cax.a.put(car, cas);
            cax.b.a(cas.b().bA, cas);
            if (cas.c()) {
                cax.c.a((Object) cas.c, (Object) cas);
            }
            cax.d.a((Object) car.b(), (Object) cas);
            new Object[1][0] = cas;
            if (!a2) {
                cap.c.a((cky) new cal(bsz, b2));
            }
            cap.c.a((cky) new cak(bsz, cas, cas2));
        }
        this.g = null;
    }

    public final void a(car car) {
        new Object[1][0] = car;
        this.g = null;
        new Object[1][0] = null;
        a((Object) car);
        if (this.b.d) {
            this.a.remove(car);
        }
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        this.g = cas.b;
        if (this.b.d) {
            this.a.add(cas);
        }
        new Object[1][0] = this.g;
        a((Object) cas.b, (jio) cas);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jio jio) {
        cas cas = (cas) jio;
        new Object[1][0] = cas;
        new Object[1][0] = this.g;
        if (this.b.d) {
            this.a.add(cas);
        }
        if (!cas.b.equals(this.g)) {
            cap cap = this.b;
            new Object[1][0] = cas;
            bsz bsz = cas.b.c;
            iva.a((Object) bsz);
            atjv b2 = cas.b();
            cax cax = (cax) cap.a.get(bsz);
            if (cax != null && cax.a(cas.b)) {
                cas cas2 = (cas) cax.a.remove(cas.b);
                if (cas2 != null) {
                    cax.b.b(cas2.b().bA, cas2);
                    if (cas2.c()) {
                        cax.c.c(cas2.c, cas2);
                    }
                    cax.d.c(cas2.b.b(), cas2);
                    new Object[1][0] = cas2;
                }
                if (cax.a.isEmpty()) {
                    cap.a.remove(bsz);
                }
                cap.c.a((cky) new can(bsz, cas));
                if (!cax.a(b2.bA)) {
                    cap.c.a((cky) new cam(bsz, b2));
                }
            }
        }
        this.g = null;
    }
}
