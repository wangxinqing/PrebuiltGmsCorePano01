package defpackage;

import java.math.RoundingMode;

/* renamed from: aons  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aons {
    public static int a(int i, int i2) {
        return aoog.b(((long) i) + ((long) i2));
    }

    public static boolean a(int i) {
        boolean z = true;
        boolean z2 = i > 0;
        if ((i & (i - 1)) != 0) {
            z = false;
        }
        return z2 & z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (((r0 & true) & r2) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r1 <= 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r5 > 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5 < 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return r0 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r5, int r6, java.math.RoundingMode r7) {
        /*
            defpackage.amrl.a((java.lang.Object) r7)
            if (r6 == 0) goto L_0x0053
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 == 0) goto L_0x0052
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = defpackage.aonr.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L_0x004a;
                case 2: goto L_0x0051;
                case 3: goto L_0x0046;
                case 4: goto L_0x0048;
                case 5: goto L_0x0043;
                case 6: goto L_0x0024;
                case 7: goto L_0x0024;
                case 8: goto L_0x0024;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L_0x0024:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L_0x0040
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L_0x0045
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            r6 = r0 & 1
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0051
            goto L_0x0045
        L_0x0040:
            if (r1 > 0) goto L_0x0045
            goto L_0x0051
        L_0x0043:
            if (r5 <= 0) goto L_0x0051
        L_0x0045:
            goto L_0x0048
        L_0x0046:
            if (r5 >= 0) goto L_0x0051
        L_0x0048:
            int r0 = r0 + r5
            return r0
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            defpackage.aonu.a(r2)
        L_0x0051:
            return r0
        L_0x0052:
            return r0
        L_0x0053:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aons.a(int, int, java.math.RoundingMode):int");
    }

    public static int a(int i, RoundingMode roundingMode) {
        if (i > 0) {
            switch (aonr.a[roundingMode.ordinal()]) {
                case 1:
                    aonu.a(a(i));
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + (((-1257966797 >>> numberOfLeadingZeros) - i) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("x (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }
}
