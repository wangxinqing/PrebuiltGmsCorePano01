package defpackage;

import android.os.SystemClock;

/* renamed from: ahle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahle {
    protected final ahix d;
    protected final aizl e;
    protected final ahjc f;
    protected final aizy g;
    protected final aicn h;
    protected final ajbf i;
    protected final boolean j;

    public ahle(ahix ahix) {
        this.d = ahix;
        this.e = ahix.d;
        this.f = ahix.e;
        this.g = ahix.g;
        this.h = ahix.h;
        this.i = ahix.j;
        this.j = ahix.p;
    }

    private final void a(ahjs ahjs, ahjt ahjt) {
        if (a(ahjt)) {
            a((ahle) ahjt);
        } else {
            a((ahle) ahjs);
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    /* access modifiers changed from: protected */
    public void D() {
    }

    /* access modifiers changed from: protected */
    public void a(aibl aibl, aibl aibl2) {
    }

    /* access modifiers changed from: protected */
    public void a(ajbe ajbe) {
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final void b(long j2) {
        ahle ahle;
        new Object[1][0] = Long.valueOf(j2);
        if (j2 == 2) {
            a((ahjs) new ahlg(this.d), (ahjt) new ahlh(this.d));
        } else if ((8 & j2) != 0) {
            a((ahjs) new ahjz(this.d), (ahjt) new ahka(this.d));
        } else if (!this.d.a()) {
            if (j2 == 39) {
                a((ahjs) new ahkb(this.d), (ahjt) new ahkc(this.d));
            } else if (j2 == 4) {
                a((ahjs) new ahkr(this.d), (ahjt) new ahkc(this.d));
            } else if (j2 == 32) {
                a((ahjs) new ahkb(this.d), (ahjt) new ahkc(this.d));
            }
        } else if (r()) {
            if (this.j) {
                ahle = new ahly(this.d);
            } else {
                ahle = new ahlb(this.d);
            }
            a(ahle);
        } else {
            a((ahle) new ahkg(this.d));
        }
    }

    /* access modifiers changed from: protected */
    public final void c(long j2) {
        if (this.d.B.d()) {
            this.d.B.g();
        }
        if (this.j) {
            ahix ahix = this.d;
            ajao ajao = ahix.av;
            if (ajao != null && ajao.c) {
                ahix.w();
            }
            a((ahle) new ahkz(this.d, axwx.c(), 0));
            return;
        }
        b(j2);
    }

    /* access modifiers changed from: protected */
    public void c(boolean z) {
    }

    public void g() {
        ahix ahix = this.d;
        if (ahix.aa != ahix.a()) {
            ahix.q();
            boolean z = !ahix.aa;
            ahix.aa = z;
            if (z) {
                ahix.h.a(aico.ACTIVITY_LOW_POWER_MODE_ON);
            } else {
                ahix.h.a(aico.ACTIVITY_LOW_POWER_MODE_OFF);
            }
            boolean z2 = ahix.aa;
            StringBuilder sb = new StringBuilder(25);
            sb.append("Set low power mode: ");
            sb.append(z2);
            sb.toString();
        }
        ahix.b(ahix.q instanceof ahkp);
        if (!ahix.R.isEmpty() && ahix.az.b()) {
            if (ahix.aa) {
                ahix.az.a();
            } else {
                ahix.az.a(ahix);
            }
        }
    }

    public void h() {
        this.d.n();
    }

    public abstract String p();

    /* access modifiers changed from: protected */
    public final boolean r() {
        if (!this.d.z.a()) {
            return (this.j && this.d.A.a()) || this.d.B.d();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void s() {
        if (!(this instanceof ahkp)) {
            a((ahle) new ahkp(this.d));
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public void x() {
        s();
    }

    public void y() {
    }

    public void z() {
    }

    static boolean a(long j2, ahjt ahjt) {
        return j2 > (ahjt.b() / 1000000) + 1500;
    }

    /* access modifiers changed from: protected */
    public void a(ahle ahle) {
        String p = this.d.q.p();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 40);
        sb.append("Leaving state: ");
        sb.append(p);
        sb.append(" at: ");
        sb.append(elapsedRealtime);
        sb.toString();
        this.d.q.h();
        ahix ahix = this.d;
        if (!ahle.getClass().equals(ahix.q.getClass())) {
            String p2 = ahle.p();
            Integer num = (Integer) ahix.E.get(p2);
            if (num == null) {
                num = 0;
            }
            ahix.E.put(p2, Integer.valueOf(num.intValue() + 1));
        }
        ahix.q = ahle;
        String p3 = this.d.q.p();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb2 = new StringBuilder(String.valueOf(p3).length() + 41);
        sb2.append("Entering state: ");
        sb2.append(p3);
        sb2.append(" at: ");
        sb2.append(elapsedRealtime2);
        sb2.toString();
        ahle.g();
    }

    /* access modifiers changed from: protected */
    public final boolean a(ahjt ahjt) {
        long j2;
        ahla ahla = this.d.r;
        if (ahla.a) {
            aizy aizy = ahla.b;
            if (a(SystemClock.elapsedRealtime() - ahla.c, ahjt)) {
                ahil d2 = ahjt.d();
                if (d2 != null) {
                    j2 = d2.a;
                } else {
                    j2 = 3200000000L;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ahix ahix = this.d;
                if (elapsedRealtime - Math.min(ahix.ak, ahix.ao) > j2 / 1000000) {
                    return true;
                }
            }
        }
        return false;
    }
}
