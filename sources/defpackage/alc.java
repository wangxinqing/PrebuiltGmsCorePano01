package defpackage;

/* renamed from: alc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alc extends ajt {
    private final ajs j = new ajs(0);

    public alc() {
        a(1);
    }

    /* access modifiers changed from: protected */
    public final int a(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.b ? this.i.b(i) - this.i.c(i) : this.i.b(i);
    }

    /* access modifiers changed from: protected */
    public final int b(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (!this.b) {
            return this.i.b(i) + this.i.c(i);
        }
        return this.i.b(i);
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        int i = this.f;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.h;
        if (i2 != -1) {
            return Math.min(i2, this.i.b() - 1);
        }
        return 0;
    }

    public final ajs d(int i) {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        int i = this.e;
        if (i < 0) {
            int i2 = this.h;
            if (i2 != -1) {
                return Math.min(i2, this.i.b() - 1);
            }
            i = this.i.b();
        }
        return i - 1;
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        int i2;
        int i3;
        if (this.i.b() != 0 && !f(i)) {
            int a = this.i.a();
            int e = e();
            while (e >= a) {
                int a2 = this.i.a(e, false, this.a, false);
                if (this.e >= 0 && this.f >= 0) {
                    if (this.b) {
                        i2 = this.i.b(e + 1) + this.c + a2;
                    } else {
                        i2 = (this.i.b(e + 1) - this.c) - a2;
                    }
                    this.e = e;
                } else {
                    if (!this.b) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    this.e = e;
                    this.f = e;
                }
                this.i.a(this.a[0], a2, 0, i2);
                if (!f(i)) {
                    e--;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(int i, int i2, aax aax) {
        int i3;
        int i4;
        if (this.b ? i2 > 0 : i2 < 0) {
            if (this.e != 0) {
                i3 = e();
                i4 = (!this.b ? -this.c : this.c) + this.i.b(this.e);
            } else {
                return;
            }
        } else if (this.f != this.i.b() - 1) {
            i3 = d();
            int c = this.i.c(this.f) + this.c;
            int b = this.i.b(this.f);
            if (this.b) {
                c = -c;
            }
            i4 = b + c;
        } else {
            return;
        }
        aax.a(i3, Math.abs(i4 - i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, boolean z) {
        int i2;
        int i3;
        if (this.i.b() == 0) {
            return false;
        }
        if (!z && e(i)) {
            return false;
        }
        int d = d();
        boolean z2 = false;
        while (d < this.i.b()) {
            int a = this.i.a(d, true, this.a, false);
            if (this.e >= 0 && this.f >= 0) {
                if (this.b) {
                    int i4 = d - 1;
                    i2 = (this.i.b(i4) - this.i.c(i4)) - this.c;
                } else {
                    int i5 = d - 1;
                    i2 = this.i.b(i5) + this.i.c(i5) + this.c;
                }
                this.f = d;
            } else {
                if (!this.b) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                this.e = d;
                this.f = d;
            }
            this.i.a(this.a[0], a, 0, i2);
            if (z || e(i)) {
                return true;
            }
            d++;
            z2 = true;
        }
        return z2;
    }

    public final oe[] a(int i, int i2) {
        this.g[0].a();
        this.g[0].a(i);
        this.g[0].a(i2);
        return this.g;
    }
}
