package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qzs implements qyq {
    public final auco a;
    public final rar b;
    public final aftw c;
    public final rbk d;
    private final amsv e;
    private final rav f;
    private final aftv g;
    private final afym h;
    private final aftm i;
    private final aoqu j = aoqu.a();

    public qzs(auco auco, rbk rbk, amsv amsv, rav rav, aftv aftv, afym afym, rar rar, aftw aftw, aftm aftm) {
        this.a = auco;
        this.d = rbk;
        this.e = amsv;
        this.f = rav;
        this.g = aftv;
        this.h = afym;
        this.b = rar;
        this.c = aftw;
        this.i = aftm;
    }

    public static aorr a(aorr aorr) {
        return aopr.a(aorr, qzb.a, (Executor) aoqm.a);
    }

    private final void a() {
        aftm aftm = this.i;
        if (aftm != null) {
            aftm.a();
        }
    }

    public final int a(aorr aorr, int i2) {
        auoa auoa;
        rau rau = (rau) this.e.a();
        rbl a2 = rbl.a();
        if (rau != null) {
            auoa = rau.b(i2);
        } else {
            auoa = null;
        }
        int a3 = a2.a(auoa, aorr, (amqy) null);
        if (rbk.e()) {
            this.a.a();
        }
        return a3;
    }

    public final int a(aorr aorr, int i2, amqy amqy) {
        auoa auoa;
        rau rau = (rau) this.e.a();
        rbl a2 = rbl.a();
        if (rau != null) {
            auoa = rau.b(i2);
        } else {
            auoa = null;
        }
        int a3 = a2.a(auoa, aorr, amqy);
        if (rbk.e()) {
            this.a.a();
        }
        return a3;
    }

    @Deprecated
    public final int a(String str) {
        return this.f.a(str);
    }

    public final aorr a(afun afun, int i2) {
        rau rau = (rau) this.e.a();
        if (rau == null || !rau.a(i2)) {
            throw new afuj();
        } else if (i2 != 1 || rau.a(this.g)) {
            return afun.a();
        } else {
            throw new afug();
        }
    }

    public final aorr a(afun afun, int i2, Executor executor) {
        aorr aorr;
        if (rbk.h()) {
            return a((afuq) new qyr(afun), i2, executor);
        }
        this.a.a();
        a();
        afym afym = this.h;
        if (afym == null) {
            aorr = this.j.a(new qzc(this, afun, i2), executor);
        } else {
            aorr = this.j.a(new qzi(this, afun, i2, afym, executor), executor);
        }
        aorl.a(aorr, new qzq(this), executor);
        return aorr;
    }

    public final aorr a(afuq afuq, int i2, afxv afxv) {
        rau rau = (rau) this.e.a();
        if (rau == null || !rau.a(i2)) {
            throw new afuj();
        } else if (i2 != 1 || rau.a(this.g)) {
            return afuq.a(afxv);
        } else {
            throw new afug();
        }
    }

    public final aorr a(afuq afuq, int i2, Executor executor) {
        aorr aorr;
        this.a.a();
        a();
        afym afym = this.h;
        if (afym == null) {
            aorr = this.j.a(new qzj(this, afuq, i2), executor);
        } else {
            aorr = this.j.a(new qzk(this, afuq, i2, afym, executor), executor);
        }
        aorl.a(aorr, new qzr(this), executor);
        return aorr;
    }
}
