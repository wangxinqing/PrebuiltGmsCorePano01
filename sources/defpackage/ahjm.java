package defpackage;

/* renamed from: ahjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahjm {
    long a = -1;
    protected final ahix b;

    public ahjm(ahix ahix) {
        this.b = ahix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r9 >= (r11 + Long.MAX_VALUE)) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean a(long r9, long r11, long r13, long r15) {
        /*
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r2 = 0
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r3 = 1
            r0[r3] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            r4 = 2
            r0[r4] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            r4 = 3
            r0[r4] = r1
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x005b
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x005b
            r4 = 0
            r6 = -9223372036854775808
            int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x003f
            long r0 = r11 + r6
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x003d
            goto L_0x0046
        L_0x003d:
            r0 = r6
            goto L_0x0048
        L_0x003f:
            long r4 = r11 + r0
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            long r0 = r9 - r11
        L_0x0048:
            long r0 = java.lang.Math.abs(r0)
            r4 = 2
            long r6 = r15 / r4
            long r4 = r13 / r4
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x005b
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x005b
            return r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjm.a(long, long, long, long):boolean");
    }

    public static final long b(long j) {
        return (j / 1000000) + 1500;
    }

    public abstract ahjl a(long j);

    /* access modifiers changed from: protected */
    public final long c() {
        ahix ahix = this.b;
        long j = ahix.ap;
        long j2 = Long.MAX_VALUE;
        if (ahix.k() != Long.MAX_VALUE) {
            ahix ahix2 = this.b;
            if (!ahix2.r.a) {
                j2 = Math.max(0, ahix2.k() - b(ahix2.K.a));
            } else {
                j2 = ahix2.k();
            }
        }
        return ajqz.a(j, j2);
    }

    public final long d() {
        long j;
        ahix ahix = this.b;
        long j2 = ahix.U;
        if (j2 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (ahix.r.a) {
            StringBuilder sb = new StringBuilder(82);
            sb.append("getMinPeriod: accelBatchingMode is on. Return minPeriodMillis=");
            sb.append(j2);
            sb.toString();
            return this.b.U;
        } else if (ahix.B.d()) {
            long j3 = this.b.U;
            StringBuilder sb2 = new StringBuilder(76);
            sb2.append("getMinPeriod: hardware AR is on. Return minPeriodMillis=");
            sb2.append(j3);
            sb2.toString();
            return this.b.U;
        } else {
            ahix ahix2 = this.b;
            if (ahix2.aa) {
                j = ahix2.O.a;
            } else {
                j = ahix2.K.a;
            }
            long b2 = b(j);
            long j4 = this.b.U;
            StringBuilder sb3 = new StringBuilder(118);
            sb3.append("getMinPeriod: accelBatchingMode is off. minPeriodMillis=");
            sb3.append(j4);
            sb3.append(", detectionTimeMillis=");
            sb3.append(b2);
            sb3.toString();
            return Math.max(0, this.b.U - b2);
        }
    }

    /* access modifiers changed from: protected */
    public final long b() {
        ahix ahix = this.b;
        long j = ahix.al;
        long j2 = ahix.V;
        long j3 = Long.MAX_VALUE;
        if (j2 != Long.MAX_VALUE) {
            j3 = Math.max(0, j2 - b(ahix.P.a));
        }
        return ajqz.a(j, j3);
    }

    /* access modifiers changed from: protected */
    public final long a() {
        long a2 = ajqz.a(this.b.ak, d());
        return this.b.c() ? Math.min(a2, ajqz.a(this.b.ao, 60000)) : a2;
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j, long j2) {
        if (j >= j2) {
            return false;
        }
        return !a(j, j2, this.b.V, Long.MAX_VALUE) && !this.b.az.b();
    }
}
