package defpackage;

import java.util.ArrayList;

/* renamed from: ht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ht {
    public final ArrayList d = new ArrayList();
    int e;
    int f;
    int g;
    int h;
    public int i;
    public boolean j;
    public boolean k = true;
    public String l;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    public boolean s = false;
    public ArrayList t;

    public final void a(int i2, int i3, int i4, int i5) {
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }

    public void a(int i2, gj gjVar, String str, int i3) {
        throw null;
    }

    public void a(gj gjVar) {
        throw null;
    }

    public final void b(int i2, gj gjVar, String str) {
        if (i2 != 0) {
            a(i2, gjVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void b(gj gjVar) {
        throw null;
    }

    public void c(gj gjVar) {
        throw null;
    }

    public void d(gj gjVar) {
        throw null;
    }

    public void e(gj gjVar) {
        throw null;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public boolean k() {
        throw null;
    }

    public final void l() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void a(int i2, gj gjVar) {
        b(i2, gjVar, (String) null);
    }

    public final void a(int i2, gj gjVar, String str) {
        a(i2, gjVar, str, 1);
    }

    public final void a(gj gjVar, String str) {
        a(0, gjVar, str, 1);
    }

    public final void a(hs hsVar) {
        this.d.add(hsVar);
        hsVar.c = this.e;
        hsVar.d = this.f;
        hsVar.e = this.g;
        hsVar.f = this.h;
    }
}
