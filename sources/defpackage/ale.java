package defpackage;

/* renamed from: ale  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ale extends ajt {
    protected final od j = new od((byte[]) null);
    protected int k = -1;
    protected Object l;
    protected int m;

    private final int a(boolean z) {
        boolean z2 = false;
        if (!z) {
            for (int i = this.e; i <= this.f; i++) {
                int i2 = d(i).a;
                if (i2 == this.d - 1) {
                    z2 = true;
                } else if (z2 && i2 == 0) {
                    return i;
                }
            }
        } else {
            for (int i3 = this.f; i3 >= this.e; i3--) {
                int i4 = d(i3).a;
                if (i4 == 0) {
                    z2 = true;
                } else if (z2 && i4 == this.d - 1) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final int b(int i, int i2, int i3) {
        int i4;
        int i5 = this.f;
        if (i5 >= 0 && !(i5 == d() && this.f == i - 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.f;
        if (i6 >= 0) {
            i4 = i3 - this.i.b(i6);
        } else if (this.j.c() <= 0 || i != d() + 1) {
            i4 = 0;
        } else {
            int d = d();
            while (true) {
                if (d >= this.k) {
                    if (d(d).a == i2) {
                        break;
                    }
                    d--;
                } else {
                    d = d();
                    break;
                }
            }
            int i7 = this.b ? (-d(d).c) - this.c : d(d).c + this.c;
            for (int i8 = d + 1; i8 <= d(); i8++) {
                i7 -= d(i8).b;
            }
            i4 = i7;
        }
        ald ald = new ald(i2, i4);
        od odVar = this.j;
        Object[] objArr = odVar.a;
        int i9 = odVar.c;
        objArr[i9] = ald;
        int i10 = odVar.d & (i9 + 1);
        odVar.c = i10;
        if (i10 == odVar.b) {
            odVar.a();
        }
        Object obj = this.l;
        if (obj == null) {
            ald.c = this.i.a(i, true, this.a, false);
            obj = this.a[0];
        } else {
            ald.c = this.m;
            this.l = null;
        }
        if (this.j.c() == 1) {
            this.f = i;
            this.e = i;
            this.k = i;
        } else {
            int i11 = this.f;
            if (i11 < 0) {
                this.f = i;
                this.e = i;
            } else {
                this.f = i11 + 1;
            }
        }
        this.i.a(obj, ald.c, i2, i3);
        return ald.c;
    }

    public final int d() {
        return (this.k + this.j.c()) - 1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01ce, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r14.j.a((r7 + 1) - r14.k);
        r14.k = r14.e;
        r14.l = r14.a[0];
        r14.m = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01c1 A[Catch:{ all -> 0x0209 }, LOOP:3: B:128:0x01c1->B:143:0x01e4, LOOP_START, PHI: r6 r9 r10 
      PHI: (r6v10 int) = (r6v3 int), (r6v13 int) binds: [B:127:0x01bf, B:143:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 int) = (r9v3 int), (r9v5 int) binds: [B:127:0x01bf, B:143:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:127:0x01bf, B:143:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01dc A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01e0 A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ee A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0105 A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0110 A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014a A[Catch:{ all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015c A[ADDED_TO_REGION, Catch:{ all -> 0x0209 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r15) {
        /*
            r14 = this;
            ajv r0 = r14.i
            int r0 = r0.b()
            if (r0 == 0) goto L_0x0212
            boolean r0 = r14.f(r15)
            if (r0 != 0) goto L_0x0211
            r0 = 0
            r1 = 0
            od r2 = r14.j     // Catch:{ all -> 0x0209 }
            int r2 = r2.c()     // Catch:{ all -> 0x0209 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1
            r5 = -1
            if (r2 == 0) goto L_0x00b3
            int r2 = r14.e     // Catch:{ all -> 0x0209 }
            if (r2 < 0) goto L_0x0033
            ajv r6 = r14.i     // Catch:{ all -> 0x0209 }
            int r2 = r6.b(r2)     // Catch:{ all -> 0x0209 }
            int r6 = r14.e     // Catch:{ all -> 0x0209 }
            ald r6 = r14.d(r6)     // Catch:{ all -> 0x0209 }
            int r6 = r6.b     // Catch:{ all -> 0x0209 }
            int r7 = r14.e     // Catch:{ all -> 0x0209 }
            int r7 = r7 + r5
            goto L_0x004d
        L_0x0033:
            int r2 = r14.h     // Catch:{ all -> 0x0209 }
            if (r2 == r5) goto L_0x0039
            r7 = r2
            goto L_0x003a
        L_0x0039:
            r7 = 0
        L_0x003a:
            int r2 = r14.d()     // Catch:{ all -> 0x0209 }
            if (r7 > r2) goto L_0x00ae
            int r2 = r14.k     // Catch:{ all -> 0x0209 }
            int r6 = r2 + -1
            if (r7 >= r6) goto L_0x0047
            goto L_0x00ae
        L_0x0047:
            if (r7 < r2) goto L_0x00b3
            r2 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
        L_0x004d:
            ajv r8 = r14.i     // Catch:{ all -> 0x0209 }
            int r8 = r8.a()     // Catch:{ all -> 0x0209 }
            int r9 = r14.k     // Catch:{ all -> 0x0209 }
            int r8 = java.lang.Math.max(r8, r9)     // Catch:{ all -> 0x0209 }
        L_0x0059:
            if (r7 < r8) goto L_0x00b3
            ald r9 = r14.d(r7)     // Catch:{ all -> 0x0209 }
            int r10 = r9.a     // Catch:{ all -> 0x0209 }
            ajv r11 = r14.i     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r12 = r14.a     // Catch:{ all -> 0x0209 }
            int r11 = r11.a((int) r7, (boolean) r1, (java.lang.Object[]) r12, (boolean) r1)     // Catch:{ all -> 0x0209 }
            int r12 = r9.c     // Catch:{ all -> 0x0209 }
            if (r11 != r12) goto L_0x0098
            r14.e = r7     // Catch:{ all -> 0x0209 }
            int r12 = r14.f     // Catch:{ all -> 0x0209 }
            if (r12 < 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r14.f = r7     // Catch:{ all -> 0x0209 }
        L_0x0076:
            ajv r12 = r14.i     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r13 = r14.a     // Catch:{ all -> 0x0209 }
            r13 = r13[r1]     // Catch:{ all -> 0x0209 }
            int r2 = r2 - r6
            r12.a((java.lang.Object) r13, (int) r11, (int) r10, (int) r2)     // Catch:{ all -> 0x0209 }
            boolean r2 = r14.f(r15)     // Catch:{ all -> 0x0209 }
            if (r2 != 0) goto L_0x0091
            ajv r2 = r14.i     // Catch:{ all -> 0x0209 }
            int r2 = r2.b(r7)     // Catch:{ all -> 0x0209 }
            int r6 = r9.b     // Catch:{ all -> 0x0209 }
            int r7 = r7 + -1
            goto L_0x0059
        L_0x0091:
            java.lang.Object[] r15 = r14.a
            r15[r1] = r0
            r14.l = r0
            return
        L_0x0098:
            od r2 = r14.j     // Catch:{ all -> 0x0209 }
            int r7 = r7 + r4
            int r6 = r14.k     // Catch:{ all -> 0x0209 }
            int r7 = r7 - r6
            r2.a(r7)     // Catch:{ all -> 0x0209 }
            int r2 = r14.e     // Catch:{ all -> 0x0209 }
            r14.k = r2     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r2 = r14.a     // Catch:{ all -> 0x0209 }
            r2 = r2[r1]     // Catch:{ all -> 0x0209 }
            r14.l = r2     // Catch:{ all -> 0x0209 }
            r14.m = r11     // Catch:{ all -> 0x0209 }
            goto L_0x00b3
        L_0x00ae:
            od r2 = r14.j     // Catch:{ all -> 0x0209 }
            r2.b()     // Catch:{ all -> 0x0209 }
        L_0x00b3:
            int r2 = r14.e     // Catch:{ all -> 0x0209 }
            if (r2 < 0) goto L_0x0125
            int r6 = r14.k     // Catch:{ all -> 0x0209 }
            if (r2 <= r6) goto L_0x00bd
            goto L_0x0202
        L_0x00bd:
            int r6 = r2 + -1
            ald r2 = r14.d(r2)     // Catch:{ all -> 0x0209 }
            int r2 = r2.a     // Catch:{ all -> 0x0209 }
            int r7 = r14.a(r1)     // Catch:{ all -> 0x0209 }
            if (r7 < 0) goto L_0x00da
            boolean r8 = r14.b     // Catch:{ all -> 0x0209 }
            if (r8 == 0) goto L_0x00d4
            int r7 = r14.b((boolean) r4, (int) r7, (int[]) r0)     // Catch:{ all -> 0x0209 }
            goto L_0x00fa
        L_0x00d4:
            int r7 = r14.a((boolean) r1, (int) r7, (int[]) r0)     // Catch:{ all -> 0x0209 }
        L_0x00d9:
            goto L_0x00fa
        L_0x00da:
            int r2 = r2 + -1
            int r7 = r14.d     // Catch:{ all -> 0x0209 }
            int r7 = r7 + r5
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e2:
            if (r7 >= 0) goto L_0x00e6
            r7 = r8
            goto L_0x00d9
        L_0x00e6:
            boolean r8 = r14.b     // Catch:{ all -> 0x0209 }
            if (r8 != 0) goto L_0x00ef
            int r8 = r14.j(r7)     // Catch:{ all -> 0x0209 }
            goto L_0x00f3
        L_0x00ef:
            int r8 = r14.i(r7)     // Catch:{ all -> 0x0209 }
        L_0x00f3:
            if (r8 != r3) goto L_0x00f8
            int r7 = r7 + -1
            goto L_0x00e2
        L_0x00f8:
            r7 = r8
            goto L_0x00d9
        L_0x00fa:
            boolean r8 = r14.b     // Catch:{ all -> 0x0209 }
            if (r8 == 0) goto L_0x0105
            int r8 = r14.i(r2)     // Catch:{ all -> 0x0209 }
            if (r8 < r7) goto L_0x0122
            goto L_0x010c
        L_0x0105:
            int r8 = r14.j(r2)     // Catch:{ all -> 0x0209 }
            if (r8 <= r7) goto L_0x010c
            goto L_0x0123
        L_0x010c:
            int r2 = r2 + -1
            if (r2 >= 0) goto L_0x0122
            int r2 = r14.d     // Catch:{ all -> 0x0209 }
            int r2 = r2 + r5
            boolean r7 = r14.b     // Catch:{ all -> 0x0209 }
            if (r7 == 0) goto L_0x011c
            int r7 = r14.b(r4, r0)     // Catch:{ all -> 0x0209 }
            goto L_0x0121
        L_0x011c:
            int r7 = r14.a((boolean) r1, (int[]) r0)     // Catch:{ all -> 0x0209 }
        L_0x0121:
            goto L_0x0123
        L_0x0122:
        L_0x0123:
            r8 = 1
            goto L_0x0147
        L_0x0125:
            int r2 = r14.h     // Catch:{ all -> 0x0209 }
            if (r2 == r5) goto L_0x012b
            r6 = r2
            goto L_0x012c
        L_0x012b:
            r6 = 0
        L_0x012c:
            od r2 = r14.j     // Catch:{ all -> 0x0209 }
            int r2 = r2.c()     // Catch:{ all -> 0x0209 }
            if (r2 <= 0) goto L_0x0141
            int r2 = r14.k     // Catch:{ all -> 0x0209 }
            ald r2 = r14.d(r2)     // Catch:{ all -> 0x0209 }
            int r2 = r2.a     // Catch:{ all -> 0x0209 }
            int r7 = r14.d     // Catch:{ all -> 0x0209 }
            int r2 = r2 + r7
            int r2 = r2 + r5
            goto L_0x0142
        L_0x0141:
            r2 = r6
        L_0x0142:
            int r7 = r14.d     // Catch:{ all -> 0x0209 }
            int r2 = r2 % r7
            r7 = 0
            r8 = 0
        L_0x0147:
        L_0x0148:
            if (r2 >= 0) goto L_0x015c
            boolean r2 = r14.b     // Catch:{ all -> 0x0209 }
            if (r2 != 0) goto L_0x0153
            int r2 = r14.a((boolean) r1, (int[]) r0)     // Catch:{ all -> 0x0209 }
            goto L_0x0157
        L_0x0153:
            int r2 = r14.b(r4, r0)     // Catch:{ all -> 0x0209 }
        L_0x0157:
            r7 = r2
            int r2 = r14.d     // Catch:{ all -> 0x0209 }
            int r2 = r2 + r5
            goto L_0x0148
        L_0x015c:
            if (r6 < 0) goto L_0x0202
            boolean r9 = r14.f(r15)     // Catch:{ all -> 0x0209 }
            if (r9 != 0) goto L_0x0202
            boolean r9 = r14.b     // Catch:{ all -> 0x0209 }
            if (r9 != 0) goto L_0x016d
            int r9 = r14.j(r2)     // Catch:{ all -> 0x0209 }
            goto L_0x0171
        L_0x016d:
            int r9 = r14.i(r2)     // Catch:{ all -> 0x0209 }
        L_0x0171:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r3) goto L_0x0176
            goto L_0x0184
        L_0x0176:
            if (r9 == r10) goto L_0x0184
            boolean r10 = r14.b     // Catch:{ all -> 0x0209 }
            if (r10 == 0) goto L_0x017f
            int r10 = r14.c     // Catch:{ all -> 0x0209 }
            goto L_0x0182
        L_0x017f:
            int r10 = r14.c     // Catch:{ all -> 0x0209 }
            int r10 = -r10
        L_0x0182:
            int r9 = r9 + r10
            goto L_0x01b9
        L_0x0184:
            int r9 = r14.d     // Catch:{ all -> 0x0209 }
            int r9 = r9 + r5
            if (r2 != r9) goto L_0x01a8
            boolean r9 = r14.b     // Catch:{ all -> 0x0209 }
            if (r9 != 0) goto L_0x0192
            int r9 = r14.j(r1)     // Catch:{ all -> 0x0209 }
            goto L_0x0197
        L_0x0192:
            int r9 = r14.i(r1)     // Catch:{ all -> 0x0209 }
        L_0x0197:
            if (r9 != r3) goto L_0x019a
            goto L_0x01b9
        L_0x019a:
            if (r9 == r10) goto L_0x01b9
            boolean r10 = r14.b     // Catch:{ all -> 0x0209 }
            if (r10 == 0) goto L_0x01a3
            int r10 = r14.c     // Catch:{ all -> 0x0209 }
            goto L_0x01a6
        L_0x01a3:
            int r10 = r14.c     // Catch:{ all -> 0x0209 }
            int r10 = -r10
        L_0x01a6:
            int r9 = r9 + r10
            goto L_0x01b9
        L_0x01a8:
            boolean r9 = r14.b     // Catch:{ all -> 0x0209 }
            if (r9 != 0) goto L_0x01b3
            int r9 = r2 + 1
            int r9 = r14.i(r9)     // Catch:{ all -> 0x0209 }
            goto L_0x01b9
        L_0x01b3:
            int r9 = r2 + 1
            int r9 = r14.j(r9)     // Catch:{ all -> 0x0209 }
        L_0x01b9:
            int r10 = r6 + -1
            int r6 = r14.a((int) r6, (int) r2, (int) r9)     // Catch:{ all -> 0x0209 }
            if (r8 == 0) goto L_0x01ee
        L_0x01c1:
            boolean r8 = r14.b     // Catch:{ all -> 0x0209 }
            if (r8 != 0) goto L_0x01ca
            int r8 = r9 - r6
            if (r8 > r7) goto L_0x01d0
            goto L_0x01ce
        L_0x01ca:
            int r8 = r9 + r6
            if (r8 < r7) goto L_0x01d0
        L_0x01ce:
            r6 = r10
            goto L_0x01fd
        L_0x01d0:
            if (r10 < 0) goto L_0x0202
            boolean r8 = r14.f(r15)     // Catch:{ all -> 0x0209 }
            if (r8 != 0) goto L_0x0202
            boolean r8 = r14.b     // Catch:{ all -> 0x0209 }
            if (r8 == 0) goto L_0x01e0
            int r8 = r14.c     // Catch:{ all -> 0x0209 }
            int r6 = r6 + r8
            goto L_0x01e4
        L_0x01e0:
            int r6 = -r6
            int r8 = r14.c     // Catch:{ all -> 0x0209 }
            int r6 = r6 - r8
        L_0x01e4:
            int r9 = r9 + r6
            int r6 = r10 + -1
            int r8 = r14.a((int) r10, (int) r2, (int) r9)     // Catch:{ all -> 0x0209 }
            r10 = r6
            r6 = r8
            goto L_0x01c1
        L_0x01ee:
            boolean r6 = r14.b     // Catch:{ all -> 0x0209 }
            if (r6 != 0) goto L_0x01f7
            int r6 = r14.j(r2)     // Catch:{ all -> 0x0209 }
            goto L_0x01fb
        L_0x01f7:
            int r6 = r14.i(r2)     // Catch:{ all -> 0x0209 }
        L_0x01fb:
            r7 = r6
            r6 = r10
        L_0x01fd:
            int r2 = r2 + -1
            r8 = 1
            goto L_0x0148
        L_0x0202:
            java.lang.Object[] r15 = r14.a
            r15[r1] = r0
            r14.l = r0
            return
        L_0x0209:
            r15 = move-exception
            java.lang.Object[] r2 = r14.a
            r2[r1] = r0
            r14.l = r0
            throw r15
        L_0x0211:
            return
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ale.g(int):void");
    }

    /* renamed from: h */
    public final ald d(int i) {
        int i2 = i - this.k;
        if (i2 < 0 || i2 >= this.j.c()) {
            return null;
        }
        od odVar = this.j;
        if (i2 < odVar.c()) {
            return (ald) odVar.a[odVar.d & (odVar.b + i2)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* access modifiers changed from: package-private */
    public final int i(int i) {
        int i2 = this.e;
        if (i2 < 0) {
            return Integer.MIN_VALUE;
        }
        if (!this.b) {
            int b = this.i.b(this.f);
            ald h = d(this.f);
            if (h.a != i) {
                int i3 = this.f;
                while (true) {
                    i3--;
                    if (i3 < this.k) {
                        break;
                    }
                    b -= h.b;
                    h = d(i3);
                    if (h.a == i) {
                        return b + h.c;
                    }
                }
            } else {
                return b + h.c;
            }
        } else {
            int b2 = this.i.b(i2);
            if (d(this.e).a != i) {
                int i4 = this.e;
                while (true) {
                    i4++;
                    if (i4 > d()) {
                        break;
                    }
                    ald h2 = d(i4);
                    b2 += h2.b;
                    if (h2.a == i) {
                        return b2;
                    }
                }
            } else {
                return b2;
            }
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final int j(int i) {
        int i2 = this.e;
        if (i2 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.b) {
            int b = this.i.b(this.f);
            ald h = d(this.f);
            if (h.a != i) {
                int i3 = this.f;
                while (true) {
                    i3--;
                    if (i3 < this.k) {
                        break;
                    }
                    b -= h.b;
                    h = d(i3);
                    if (h.a == i) {
                        return b - h.c;
                    }
                }
            } else {
                return b - h.c;
            }
        } else {
            int b2 = this.i.b(i2);
            if (d(this.e).a != i) {
                int i4 = this.e;
                while (true) {
                    i4++;
                    if (i4 > d()) {
                        break;
                    }
                    ald h2 = d(i4);
                    b2 += h2.b;
                    if (h2.a == i) {
                        return b2;
                    }
                }
            } else {
                return b2;
            }
        }
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        ald ald;
        int i4;
        int i5;
        int i6 = this.e;
        if (i6 >= 0 && !(i6 == this.k && i6 == i + 1)) {
            throw new IllegalStateException();
        }
        int i7 = this.k;
        if (i7 >= 0) {
            ald = d(i7);
        } else {
            ald = null;
        }
        int b = this.i.b(this.k);
        ald ald2 = new ald(i2, 0);
        od odVar = this.j;
        int i8 = (odVar.b - 1) & odVar.d;
        odVar.b = i8;
        odVar.a[i8] = ald2;
        if (i8 == odVar.c) {
            odVar.a();
        }
        Object obj = this.l;
        if (obj == null) {
            i4 = this.i.a(i, false, this.a, false);
            ald2.c = i4;
            obj = this.a[0];
        } else {
            int i9 = this.m;
            ald2.c = i9;
            this.l = null;
            i4 = i9;
        }
        this.e = i;
        this.k = i;
        if (this.f < 0) {
            this.f = i;
        }
        if (this.b) {
            i5 = i3 + i4;
        } else {
            i5 = i3 - i4;
        }
        if (ald != null) {
            ald.b = b - i5;
        }
        this.i.a(obj, i4, i2, i5);
        return ald2.c;
    }

    public final int a(boolean z, int i, int[] iArr) {
        int i2;
        int b = this.i.b(i);
        ald h = d(i);
        int i3 = h.a;
        if (this.b) {
            int i4 = i - 1;
            int i5 = 1;
            i2 = b - this.i.c(i);
            int i6 = i3;
            while (i5 < this.d && i4 >= this.e) {
                b -= h.b;
                h = d(i4);
                int i7 = h.a;
                if (i7 != i6) {
                    i5++;
                    int c = b - this.i.c(i4);
                    if (z ? c > i2 : c < i2) {
                        i2 = c;
                        i = i4;
                        i3 = i7;
                        i6 = i3;
                    } else {
                        i6 = i7;
                    }
                }
                i4--;
            }
        } else {
            int i8 = i3;
            int i9 = i8;
            int i10 = 1;
            int i11 = i + 1;
            int i12 = b;
            while (i10 < this.d && i11 <= this.f) {
                ald h2 = d(i11);
                i12 += h2.b;
                int i13 = h2.a;
                if (i13 != i9) {
                    i10++;
                    if (z ? i12 <= b : i12 >= b) {
                        i9 = i13;
                    } else {
                        b = i12;
                        i = i11;
                        i8 = i13;
                        i9 = i8;
                    }
                }
                i11++;
            }
            i2 = b;
            i3 = i8;
        }
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01dc, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01e1 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x01e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r14, boolean r15) {
        /*
            r13 = this;
            ajv r0 = r13.i
            int r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L_0x0225
            if (r15 != 0) goto L_0x0013
            boolean r0 = r13.e(r14)
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            return r1
        L_0x0013:
            r0 = 0
            od r2 = r13.j     // Catch:{ all -> 0x021d }
            int r2 = r2.c()     // Catch:{ all -> 0x021d }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -1
            r5 = 1
            if (r2 == 0) goto L_0x00b3
            ajv r2 = r13.i     // Catch:{ all -> 0x021d }
            int r2 = r2.b()     // Catch:{ all -> 0x021d }
            int r6 = r13.f     // Catch:{ all -> 0x021d }
            if (r6 < 0) goto L_0x0034
            int r7 = r6 + 1
            ajv r8 = r13.i     // Catch:{ all -> 0x021d }
            int r6 = r8.b(r6)     // Catch:{ all -> 0x021d }
            goto L_0x004f
        L_0x0034:
            int r6 = r13.h     // Catch:{ all -> 0x021d }
            if (r6 == r4) goto L_0x003a
            r7 = r6
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            int r6 = r13.d()     // Catch:{ all -> 0x021d }
            int r6 = r6 + r5
            if (r7 > r6) goto L_0x00ae
            int r6 = r13.k     // Catch:{ all -> 0x021d }
            if (r7 < r6) goto L_0x00ae
            int r6 = r13.d()     // Catch:{ all -> 0x021d }
            if (r7 > r6) goto L_0x00b3
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x004f:
            int r8 = r13.d()     // Catch:{ all -> 0x021d }
        L_0x0053:
            if (r7 < r2) goto L_0x0056
            goto L_0x00b3
        L_0x0056:
            if (r7 > r8) goto L_0x00b3
            ald r9 = r13.d(r7)     // Catch:{ all -> 0x021d }
            if (r6 == r3) goto L_0x0062
            int r10 = r9.b     // Catch:{ all -> 0x021d }
            int r6 = r6 + r10
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            int r10 = r9.a     // Catch:{ all -> 0x021d }
            ajv r11 = r13.i     // Catch:{ all -> 0x021d }
            java.lang.Object[] r12 = r13.a     // Catch:{ all -> 0x021d }
            int r11 = r11.a((int) r7, (boolean) r5, (java.lang.Object[]) r12, (boolean) r1)     // Catch:{ all -> 0x021d }
            int r12 = r9.c     // Catch:{ all -> 0x021d }
            if (r11 == r12) goto L_0x007a
            r9.c = r11     // Catch:{ all -> 0x021d }
            od r9 = r13.j     // Catch:{ all -> 0x021d }
            int r8 = r8 - r7
            r9.b(r8)     // Catch:{ all -> 0x021d }
            r8 = r7
        L_0x007a:
            r13.f = r7     // Catch:{ all -> 0x021d }
            int r9 = r13.e     // Catch:{ all -> 0x021d }
            if (r9 < 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r13.e = r7     // Catch:{ all -> 0x021d }
        L_0x0083:
            ajv r9 = r13.i     // Catch:{ all -> 0x021d }
            java.lang.Object[] r12 = r13.a     // Catch:{ all -> 0x021d }
            r12 = r12[r1]     // Catch:{ all -> 0x021d }
            r9.a((java.lang.Object) r12, (int) r11, (int) r10, (int) r6)     // Catch:{ all -> 0x021d }
            if (r15 != 0) goto L_0x0094
            boolean r9 = r13.e(r14)     // Catch:{ all -> 0x021d }
            if (r9 != 0) goto L_0x00a4
        L_0x0094:
            if (r6 != r3) goto L_0x009c
            ajv r6 = r13.i     // Catch:{ all -> 0x021d }
            int r6 = r6.b(r7)     // Catch:{ all -> 0x021d }
        L_0x009c:
            int r9 = r13.d     // Catch:{ all -> 0x021d }
            int r9 = r9 + r4
            if (r10 == r9) goto L_0x00a2
        L_0x00a1:
            goto L_0x00ab
        L_0x00a2:
            if (r15 == 0) goto L_0x00a1
        L_0x00a4:
            java.lang.Object[] r14 = r13.a
            r14[r1] = r0
            r13.l = r0
            return r5
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x00ae:
            od r2 = r13.j     // Catch:{ all -> 0x021d }
            r2.b()     // Catch:{ all -> 0x021d }
        L_0x00b3:
            ajv r2 = r13.i     // Catch:{ all -> 0x021d }
            int r2 = r2.b()     // Catch:{ all -> 0x021d }
            int r6 = r13.f     // Catch:{ all -> 0x021d }
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 < 0) goto L_0x012c
            int r8 = r13.d()     // Catch:{ all -> 0x021d }
            if (r6 < r8) goto L_0x0129
            int r6 = r13.f     // Catch:{ all -> 0x021d }
            int r8 = r6 + 1
            ald r6 = r13.d(r6)     // Catch:{ all -> 0x021d }
            int r6 = r6.a     // Catch:{ all -> 0x021d }
            int r9 = r13.a(r5)     // Catch:{ all -> 0x021d }
            if (r9 < 0) goto L_0x00e4
            boolean r10 = r13.b     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x00de
            int r9 = r13.a((boolean) r1, (int) r9, (int[]) r0)     // Catch:{ all -> 0x021d }
            goto L_0x00fd
        L_0x00de:
            int r9 = r13.b((boolean) r5, (int) r9, (int[]) r0)     // Catch:{ all -> 0x021d }
            goto L_0x00fd
        L_0x00e4:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 0
        L_0x00e7:
            int r11 = r13.d     // Catch:{ all -> 0x021d }
            if (r10 >= r11) goto L_0x00fd
            boolean r9 = r13.b     // Catch:{ all -> 0x021d }
            if (r9 != 0) goto L_0x00f4
            int r9 = r13.i(r10)     // Catch:{ all -> 0x021d }
            goto L_0x00f8
        L_0x00f4:
            int r9 = r13.j(r10)     // Catch:{ all -> 0x021d }
        L_0x00f8:
            if (r9 != r7) goto L_0x00fd
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x00fd:
            boolean r10 = r13.b     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0108
            int r10 = r13.j(r6)     // Catch:{ all -> 0x021d }
            if (r10 > r9) goto L_0x0126
            goto L_0x010f
        L_0x0108:
            int r10 = r13.i(r6)     // Catch:{ all -> 0x021d }
            if (r10 >= r9) goto L_0x010f
            goto L_0x0127
        L_0x010f:
            int r6 = r6 + 1
            int r10 = r13.d     // Catch:{ all -> 0x021d }
            if (r6 != r10) goto L_0x0126
            boolean r6 = r13.b     // Catch:{ all -> 0x021d }
            if (r6 != 0) goto L_0x011e
            int r6 = r13.b(r5, r0)     // Catch:{ all -> 0x021d }
            goto L_0x0123
        L_0x011e:
            int r6 = r13.a((boolean) r1, (int[]) r0)     // Catch:{ all -> 0x021d }
        L_0x0123:
            r9 = r6
            r6 = 0
            goto L_0x0127
        L_0x0126:
        L_0x0127:
            r10 = 1
            goto L_0x014d
        L_0x0129:
            r5 = 0
            goto L_0x01eb
        L_0x012c:
            int r6 = r13.h     // Catch:{ all -> 0x021d }
            if (r6 == r4) goto L_0x0132
            r8 = r6
            goto L_0x0133
        L_0x0132:
            r8 = 0
        L_0x0133:
            od r6 = r13.j     // Catch:{ all -> 0x021d }
            int r6 = r6.c()     // Catch:{ all -> 0x021d }
            if (r6 <= 0) goto L_0x0147
            int r6 = r13.d()     // Catch:{ all -> 0x021d }
            ald r6 = r13.d(r6)     // Catch:{ all -> 0x021d }
            int r6 = r6.a     // Catch:{ all -> 0x021d }
            int r6 = r6 + r5
            goto L_0x0148
        L_0x0147:
            r6 = r8
        L_0x0148:
            int r9 = r13.d     // Catch:{ all -> 0x021d }
            int r6 = r6 % r9
            r9 = 0
            r10 = 0
        L_0x014d:
            r11 = 0
        L_0x014e:
            int r12 = r13.d     // Catch:{ all -> 0x021d }
            if (r6 < r12) goto L_0x0164
            if (r15 != 0) goto L_0x0166
            boolean r6 = r13.b     // Catch:{ all -> 0x021d }
            if (r6 != 0) goto L_0x015d
            int r6 = r13.b(r5, r0)     // Catch:{ all -> 0x021d }
            goto L_0x0161
        L_0x015d:
            int r6 = r13.a((boolean) r1, (int[]) r0)     // Catch:{ all -> 0x021d }
        L_0x0161:
            r9 = r6
            r6 = 0
            goto L_0x014e
        L_0x0164:
            if (r8 != r2) goto L_0x0167
        L_0x0166:
            goto L_0x0171
        L_0x0167:
            if (r15 != 0) goto L_0x0174
            boolean r12 = r13.e(r14)     // Catch:{ all -> 0x021d }
            if (r12 != 0) goto L_0x0170
            goto L_0x0174
        L_0x0170:
        L_0x0171:
            r5 = r11
            goto L_0x01eb
        L_0x0174:
            boolean r11 = r13.b     // Catch:{ all -> 0x021d }
            if (r11 != 0) goto L_0x017d
            int r11 = r13.i(r6)     // Catch:{ all -> 0x021d }
            goto L_0x0181
        L_0x017d:
            int r11 = r13.j(r6)     // Catch:{ all -> 0x021d }
        L_0x0181:
            if (r11 == r3) goto L_0x0191
            if (r11 == r7) goto L_0x0191
            boolean r12 = r13.b     // Catch:{ all -> 0x021d }
            if (r12 != 0) goto L_0x018c
            int r12 = r13.c     // Catch:{ all -> 0x021d }
            goto L_0x018f
        L_0x018c:
            int r12 = r13.c     // Catch:{ all -> 0x021d }
            int r12 = -r12
        L_0x018f:
            int r11 = r11 + r12
            goto L_0x01c7
        L_0x0191:
            if (r6 == 0) goto L_0x01a5
            boolean r11 = r13.b     // Catch:{ all -> 0x021d }
            if (r11 != 0) goto L_0x019e
            int r11 = r6 + -1
            int r11 = r13.j(r11)     // Catch:{ all -> 0x021d }
            goto L_0x01c7
        L_0x019e:
            int r11 = r6 + -1
            int r11 = r13.i(r11)     // Catch:{ all -> 0x021d }
            goto L_0x01c7
        L_0x01a5:
            boolean r11 = r13.b     // Catch:{ all -> 0x021d }
            if (r11 != 0) goto L_0x01b1
            int r11 = r13.d     // Catch:{ all -> 0x021d }
            int r11 = r11 + r4
            int r11 = r13.i(r11)     // Catch:{ all -> 0x021d }
            goto L_0x01b8
        L_0x01b1:
            int r11 = r13.d     // Catch:{ all -> 0x021d }
            int r11 = r11 + r4
            int r11 = r13.j(r11)     // Catch:{ all -> 0x021d }
        L_0x01b8:
            if (r11 == r3) goto L_0x01c7
            if (r11 == r7) goto L_0x01c7
            boolean r12 = r13.b     // Catch:{ all -> 0x021d }
            if (r12 != 0) goto L_0x01c3
            int r12 = r13.c     // Catch:{ all -> 0x021d }
            goto L_0x01c6
        L_0x01c3:
            int r12 = r13.c     // Catch:{ all -> 0x021d }
            int r12 = -r12
        L_0x01c6:
            int r11 = r11 + r12
        L_0x01c7:
            int r12 = r8 + 1
            int r8 = r13.b((int) r8, (int) r6, (int) r11)     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0208
        L_0x01cf:
            boolean r10 = r13.b     // Catch:{ all -> 0x021d }
            if (r10 != 0) goto L_0x01d8
            int r10 = r11 + r8
            if (r10 < r9) goto L_0x01de
            goto L_0x01dc
        L_0x01d8:
            int r10 = r11 - r8
            if (r10 > r9) goto L_0x01de
        L_0x01dc:
            r8 = r12
            goto L_0x0217
        L_0x01de:
            if (r12 != r2) goto L_0x01e1
            goto L_0x01eb
        L_0x01e1:
            if (r15 != 0) goto L_0x01f2
            boolean r10 = r13.e(r14)     // Catch:{ all -> 0x021d }
            if (r10 != 0) goto L_0x01ea
            goto L_0x01f2
        L_0x01ea:
        L_0x01eb:
            java.lang.Object[] r14 = r13.a
            r14[r1] = r0
            r13.l = r0
            return r5
        L_0x01f2:
            boolean r10 = r13.b     // Catch:{ all -> 0x021d }
            if (r10 != 0) goto L_0x01fa
            int r10 = r13.c     // Catch:{ all -> 0x021d }
            int r8 = r8 + r10
            goto L_0x01fe
        L_0x01fa:
            int r8 = -r8
            int r10 = r13.c     // Catch:{ all -> 0x021d }
            int r8 = r8 - r10
        L_0x01fe:
            int r11 = r11 + r8
            int r8 = r12 + 1
            int r10 = r13.b((int) r12, (int) r6, (int) r11)     // Catch:{ all -> 0x021d }
            r12 = r8
            r8 = r10
            goto L_0x01cf
        L_0x0208:
            boolean r8 = r13.b     // Catch:{ all -> 0x021d }
            if (r8 != 0) goto L_0x0211
            int r8 = r13.i(r6)     // Catch:{ all -> 0x021d }
            goto L_0x0215
        L_0x0211:
            int r8 = r13.j(r6)     // Catch:{ all -> 0x021d }
        L_0x0215:
            r9 = r8
            r8 = r12
        L_0x0217:
            int r6 = r6 + 1
            r10 = 1
            r11 = 1
            goto L_0x014e
        L_0x021d:
            r14 = move-exception
            java.lang.Object[] r15 = r13.a
            r15[r1] = r0
            r13.l = r0
            throw r14
        L_0x0225:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ale.a(int, boolean):boolean");
    }

    public final int b(boolean z, int i, int[] iArr) {
        int i2;
        int b = this.i.b(i);
        ald h = d(i);
        int i3 = h.a;
        if (!this.b) {
            int i4 = i - 1;
            int i5 = 1;
            i2 = this.i.c(i) + b;
            int i6 = i3;
            while (i5 < this.d && i4 >= this.e) {
                b -= h.b;
                h = d(i4);
                int i7 = h.a;
                if (i7 != i6) {
                    i5++;
                    int c = this.i.c(i4) + b;
                    if (z ? c > i2 : c < i2) {
                        i2 = c;
                        i = i4;
                        i3 = i7;
                        i6 = i3;
                    } else {
                        i6 = i7;
                    }
                }
                i4--;
            }
        } else {
            int i8 = i3;
            int i9 = i8;
            int i10 = 1;
            int i11 = i + 1;
            int i12 = b;
            while (i10 < this.d && i11 <= this.f) {
                ald h2 = d(i11);
                i12 += h2.b;
                int i13 = h2.a;
                if (i13 != i9) {
                    i10++;
                    if (z ? i12 <= b : i12 >= b) {
                        i9 = i13;
                    } else {
                        b = i12;
                        i = i11;
                        i8 = i13;
                        i9 = i8;
                    }
                }
                i11++;
            }
            i2 = b;
            i3 = i8;
        }
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i;
        }
        return i2;
    }

    public final void b(int i) {
        super.b(i);
        this.j.b((d() - i) + 1);
        if (this.j.c() == 0) {
            this.k = -1;
        }
    }

    public final oe[] a(int i, int i2) {
        for (int i3 = 0; i3 < this.d; i3++) {
            this.g[i3].a();
        }
        if (i >= 0) {
            while (i <= i2) {
                oe oeVar = this.g[d(i).a];
                if (oeVar.b() > 0) {
                    int i4 = oeVar.b;
                    if (i4 != 0) {
                        int[] iArr = oeVar.a;
                        int i5 = (i4 - 1) & oeVar.c;
                        if (iArr[i5] == i - 1) {
                            if (i4 != 0) {
                                oeVar.b = i5;
                                oeVar.a(i);
                                i++;
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                oeVar.a(i);
                oeVar.a(i);
                i++;
            }
        }
        return this.g;
    }
}
