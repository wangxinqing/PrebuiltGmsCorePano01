package defpackage;

/* renamed from: akgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgw {
    public int a = 1;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = 0;
    public boolean j = false;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p = 0;
    public int q = -1;
    public float r = -1.0f;
    public int s;
    public int t;
    public int u;
    private final akfv v;

    public akgw(akfv akfv) {
        this.v = akfv;
        this.b = -2.14748365E9f;
        this.g = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.c = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.l = 0;
        this.k = 0.0f;
    }

    public final int a() {
        return (int) this.b;
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + this.o;
        boolean z = this.j;
        int i5 = this.m;
        if (!z) {
            i5 = -i5;
        }
        int i6 = this.p;
        if (i6 == 1) {
            return (i4 - this.q) + i5;
        }
        if (i6 == 3) {
            return (i4 - (this.s - this.q)) + i5;
        }
        if (i6 == 2) {
            return ((int) (((float) (i4 - this.q)) - (((float) this.s) * this.r))) + i5;
        }
        int i7 = this.s;
        int i8 = this.t;
        int i9 = (i7 - i8) - this.u;
        int i10 = this.q;
        if (i10 < 0) {
            float f2 = this.r;
            i3 = f2 >= 0.0f ? ((int) (((float) i7) * f2)) - i8 : i9 / 2;
        } else {
            i3 = i10 - i8;
        }
        int i11 = i9 - i3;
        int i12 = this.g;
        int i13 = this.c;
        int i14 = 0;
        if (z) {
            int i15 = this.i;
            if (i15 != 1) {
                i14 = i15 != 2 ? this.m : this.m + this.n;
            }
            if (!(i12 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE)) {
                int i16 = this.e;
                int i17 = this.f;
                if ((i16 - i17) + this.l <= i9) {
                    return i17 - i8;
                }
            }
            if (i12 != Integer.MIN_VALUE) {
                int i18 = this.f;
                if ((i4 - i18) + i14 <= i3) {
                    return i18 - i8;
                }
            }
            if (i13 != Integer.MAX_VALUE) {
                int i19 = this.l;
                int i20 = this.e;
                if ((i20 - i4) + (i19 - i14) <= i11) {
                    return (i20 - i8) - (i9 - i19);
                }
            }
            return ((i4 - i3) - i8) + i14;
        }
        int i21 = this.i;
        if (i21 == 1) {
            i14 = -this.m;
        } else if (i21 == 2) {
            i14 = this.n;
        }
        if (!(i12 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE)) {
            int i22 = this.e;
            int i23 = this.f;
            if ((i22 - i23) + this.l <= i9) {
                return i23 - i8;
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            int i24 = this.f;
            if ((i4 + i14) - i24 <= i3) {
                return i24 - i8;
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            int i25 = this.e;
            int i26 = this.l;
            if (((i25 - i4) - i14) + i26 <= i11) {
                return (i25 - i8) - (i9 - i26);
            }
        }
        return ((i4 - i3) - i8) + i14;
    }

    public final void a(float f2) {
        this.k += f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r0 <= r5) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r0 >= r5) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r4.k = r0
            int r0 = r4.a
            r1 = 2
            if (r0 == r1) goto L_0x000b
            int r2 = r4.g
            goto L_0x000d
        L_0x000b:
            int r2 = r4.h
        L_0x000d:
            if (r0 == r1) goto L_0x0012
            int r0 = r4.c
            goto L_0x0014
        L_0x0012:
            int r0 = r4.d
        L_0x0014:
            if (r2 >= r0) goto L_0x0025
            float r1 = (float) r2
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0023
            float r0 = (float) r0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 > 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            r5 = r0
            goto L_0x0027
        L_0x0023:
            r5 = r1
            goto L_0x0027
        L_0x0025:
            float r5 = r4.b
        L_0x0027:
            if (r6 == 0) goto L_0x0050
            akfv r6 = r4.v
            float r0 = r4.b
            float r1 = r5 - r0
            float r2 = r6.b
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003f
            float r6 = r6.a
            float r1 = r1 / r6
            float r0 = r0 + r1
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x004d
        L_0x003d:
            r5 = r0
            goto L_0x004d
        L_0x003f:
            float r2 = -r2
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x004d
            float r6 = r6.a
            float r1 = r1 / r6
            float r0 = r0 + r1
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x004d
            goto L_0x003d
        L_0x004d:
            r4.b = r5
            return
        L_0x0050:
            r4.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgw.a(float, boolean):void");
    }

    public final void b() {
        a(this.b + this.k, false);
    }

    public final int c() {
        return ((this.s - this.t) - this.u) - this.l;
    }

    public final void c(int i2, int i3) {
        this.t = i2;
        this.u = i3;
    }

    public final int d() {
        return a((int) this.b);
    }

    public final String toString() {
        float f2 = this.b;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.c;
        int i5 = this.e;
        StringBuilder sb = new StringBuilder(79);
        sb.append("center: ");
        sb.append(f2);
        sb.append(" min:");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(" max:");
        sb.append(i4);
        sb.append(",");
        sb.append(i5);
        return sb.toString();
    }

    public final void b(int i2, int i3) {
        this.c = i2;
        float f2 = (float) i2;
        if (this.b > f2) {
            this.b = f2;
        }
        this.e = i3;
        if (this.p == 0 && i2 != Integer.MAX_VALUE) {
            i2 = Math.min(i2, i3 - (this.s / 2));
        }
        this.d = i2;
    }

    public final void a(int i2, int i3) {
        this.g = i2;
        float f2 = (float) i2;
        if (this.b < f2) {
            this.b = f2;
        }
        this.f = i3;
        if (this.p == 0 && i2 != Integer.MIN_VALUE) {
            i2 = Math.max(i2, i3 + (this.s / 2));
        }
        this.h = i2;
    }
}
