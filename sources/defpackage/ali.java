package defpackage;

/* renamed from: ali  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ali {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 3;
    public int f;
    public int g;
    public int h;
    public boolean i;

    public ali() {
        a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r9 = r8.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r9) {
        /*
            r8 = this;
            int r0 = r8.f
            int r1 = r8.d()
            boolean r2 = r8.b()
            boolean r3 = r8.c()
            if (r2 != 0) goto L_0x0035
            int r4 = r8.g
            int r5 = r1 - r4
            boolean r6 = r8.i
            if (r6 == 0) goto L_0x001f
            int r6 = r8.e
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0035
            goto L_0x0026
        L_0x001f:
            int r6 = r8.e
            r6 = r6 & 1
            if (r6 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            int r6 = r8.b
            int r7 = r9 - r6
            if (r7 > r5) goto L_0x0035
            int r6 = r6 - r4
            if (r3 != 0) goto L_0x0034
            int r9 = r8.c
            if (r6 <= r9) goto L_0x0034
            return r9
        L_0x0034:
            return r6
        L_0x0035:
            if (r3 != 0) goto L_0x005e
            int r3 = r8.h
            int r4 = r0 - r1
            int r4 = r4 - r3
            boolean r5 = r8.i
            if (r5 == 0) goto L_0x0047
            int r5 = r8.e
            r5 = r5 & 1
            if (r5 == 0) goto L_0x005e
            goto L_0x004e
        L_0x0047:
            int r5 = r8.e
            r5 = r5 & 2
            if (r5 != 0) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            int r5 = r8.a
            int r6 = r5 - r9
            if (r6 > r4) goto L_0x005e
            int r0 = r0 - r3
            int r5 = r5 - r0
            if (r2 != 0) goto L_0x005d
            int r9 = r8.d
            if (r5 >= r9) goto L_0x005d
            return r9
        L_0x005d:
            return r5
        L_0x005e:
            int r9 = r9 - r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ali.a(int):int");
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = Integer.MIN_VALUE;
        this.a = Integer.MAX_VALUE;
    }

    public final void a(int i2, int i3) {
        this.g = i2;
        this.h = i3;
    }

    public final boolean b() {
        return this.b == Integer.MIN_VALUE;
    }

    public final boolean c() {
        return this.a == Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        if (!this.i) {
            return (int) ((((float) this.f) * 50.0f) / 100.0f);
        }
        int i2 = this.f;
        return i2 - ((int) ((((float) i2) * 50.0f) / 100.0f));
    }

    public final String toString() {
        return " min:" + this.b + " " + this.d + " max:" + this.a + " " + this.c;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        int i6;
        this.b = i2;
        this.a = i3;
        int i7 = (this.f - this.g) - this.h;
        int d2 = d();
        boolean b2 = b();
        boolean c2 = c();
        if (!b2) {
            if (!this.i ? (this.e & 1) == 0 : (this.e & 2) == 0) {
                this.d = i4 - d2;
            } else {
                this.d = this.b - this.g;
            }
        }
        if (!c2) {
            boolean z = this.i;
            if (!z ? (this.e & 2) == 0 : (this.e & 1) == 0) {
                i6 = i5 - d2;
                this.c = i6;
            } else {
                i6 = (this.a - this.g) - i7;
                this.c = i6;
            }
            if (b2) {
                return;
            }
            if (!z) {
                int i8 = this.e;
                if ((i8 & 1) != 0) {
                    this.c = Math.max(this.d, i6);
                } else if ((i8 & 2) != 0) {
                    int max = Math.max(i6, i4 - d2);
                    this.c = max;
                    this.d = Math.min(this.d, max);
                }
            } else {
                int i9 = this.e;
                if ((i9 & 1) != 0) {
                    this.d = Math.min(this.d, i6);
                } else if ((i9 & 2) != 0) {
                    int min = Math.min(this.d, i5 - d2);
                    this.d = min;
                    this.c = Math.max(min, this.c);
                }
            }
        }
    }
}
