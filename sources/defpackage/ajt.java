package defpackage;

/* renamed from: ajt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ajt {
    final Object[] a = new Object[1];
    protected boolean b;
    protected int c;
    protected int d;
    protected int e = -1;
    protected int f = -1;
    protected oe[] g;
    protected int h = -1;
    protected ajv i;

    /* access modifiers changed from: protected */
    public abstract int a(boolean z, int i2, int[] iArr);

    public final int a(boolean z, int[] iArr) {
        return a(z, !this.b ? this.e : this.f, iArr);
    }

    public final void a() {
        this.f = -1;
        this.e = -1;
    }

    public void a(int i2, int i3, aax aax) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2, boolean z);

    public abstract oe[] a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int b(boolean z, int i2, int[] iArr);

    public final int b(boolean z, int[] iArr) {
        return b(z, !this.b ? this.f : this.e, iArr);
    }

    public final int c(int i2) {
        ajs d2 = d(i2);
        if (d2 != null) {
            return d2.a;
        }
        return -1;
    }

    public abstract ajs d(int i2);

    /* access modifiers changed from: protected */
    public final boolean e(int i2) {
        if (this.f < 0) {
            return false;
        }
        if (this.b) {
            if (a(true, (int[]) null) <= i2 + this.c) {
                return true;
            }
        } else if (b(false, (int[]) null) >= i2 - this.c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean f(int i2) {
        if (this.f < 0) {
            return false;
        }
        if (this.b) {
            if (b(false, (int[]) null) >= i2 - this.c) {
                return true;
            }
        } else if (a(true, (int[]) null) <= i2 + this.c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void g(int i2);

    public void b(int i2) {
        int i3;
        if (i2 >= 0 && (i3 = this.f) >= 0) {
            if (i3 >= i2) {
                this.f = i2 - 1;
            }
            c();
            if (this.e < 0) {
                this.h = i2;
            }
        }
    }

    public final void c() {
        if (this.f < this.e) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        } else if (this.d != i2) {
            this.d = i2;
            this.g = new oe[i2];
            for (int i3 = 0; i3 < this.d; i3++) {
                this.g[i3] = new oe();
            }
        }
    }

    public final boolean b() {
        return a(!this.b ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }
}
