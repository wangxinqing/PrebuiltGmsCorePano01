package defpackage;

import android.content.Context;

/* renamed from: swl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class swl implements swn {
    public final svv x;

    public swl(svv svv) {
        iva.a((Object) svv);
        this.x = svv;
    }

    public final jiq A() {
        return this.x.l;
    }

    public final spn B() {
        return this.x.m();
    }

    public final void C() {
        if (Thread.currentThread() != this.x.F().b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final sut E() {
        return this.x.E();
    }

    public final svs F() {
        return this.x.F();
    }

    public void h() {
        this.x.F().h();
    }

    public void i() {
        this.x.s();
    }

    public void j() {
        this.x.t();
    }

    public final spc u() {
        return this.x.f;
    }

    public final spg v() {
        return this.x.g;
    }

    public final svf w() {
        return this.x.a();
    }

    public final szj x() {
        return this.x.f();
    }

    public final suk y() {
        return this.x.g();
    }

    public final Context z() {
        return this.x.a;
    }
}
