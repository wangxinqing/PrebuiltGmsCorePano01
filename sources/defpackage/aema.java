package defpackage;

import com.google.android.cast.JGCastService;
import java.util.Locale;

/* renamed from: aema  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aema {
    private static final int[] a = new int[1024];
    private static final int[] b = new int[1024];
    private static final int[] c = {1, 0, 0, 3};
    private static final int[][] d = {new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
    private static final double e;
    private static final aely[] f = {new aelp(), new aelq(), new aelr(), new aels(), new aelt(), new aelu()};
    private static final aelz[] g = {new aelv(), new aelw(), new aelx(), new aelm(), new aeln(), new aelo()};

    static {
        double d2 = 1.0d;
        do {
            d2 /= 2.0d;
        } while ((d2 / 2.0d) + 1.0d != 1.0d);
        e = d2 + 1.0d;
        a(0, 0, 0, 0, 0, 0);
        a(0, 0, 0, 1, 0, 1);
        a(0, 0, 0, 2, 0, 2);
        a(0, 0, 0, 3, 0, 3);
    }

    private static final double a(double d2, double d3, double d4) {
        return Math.atan2(d4, Math.sqrt((d2 * d2) + (d3 * d3)));
    }

    private static final int a(int i) {
        return i & 3;
    }

    public static final long a(long j, int i) {
        int i2 = 30 - i;
        long j2 = 1 << (i2 + i2);
        return (j & (-j2)) | j2;
    }

    private static final long a(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((((long) i2) >> 2) << ((i3 + i3) * 4));
    }

    private static final double b(int i) {
        int max = Math.max(-1, Math.min(JGCastService.FLAG_PRIVATE_DISPLAY, i));
        double d2 = e;
        double d3 = (double) ((max + max) - 1073741823);
        Double.isNaN(d3);
        return Math.max(-d2, Math.min(d2, d3 * 9.313225746154785E-10d));
    }

    private static final int c(int i) {
        return 1 << (30 - i);
    }

    public static final long c(long j) {
        return j & (-j);
    }

    private static final aely d(int i) {
        return f[Math.min(5, i)];
    }

    private static final int e(long j) {
        return (int) (j >>> 61);
    }

    private static final boolean f(long j) {
        return (((int) j) & 1) != 0;
    }

    private static final long g(long j) {
        long k = k(j);
        int l = l(k);
        int m = m(k);
        int i = 2;
        if (f(j)) {
            i = 1;
        } else if ((((((int) j) >>> 2) ^ l) & 1) == 0) {
            i = 0;
        }
        return (((long) ((l + l) + i)) << 32) | (((long) (m + m + i)) & 4294967295L);
    }

    private static final double h(long j) {
        return j((long) ((int) (j >> 32)));
    }

    private static final double i(long j) {
        return j((long) ((int) j));
    }

    private static final double j(long j) {
        double d2 = (double) j;
        Double.isNaN(d2);
        double d3 = d2 * 4.6566128730773926E-10d;
        if (d3 >= 0.5d) {
            return (((4.0d * d3) * d3) - 4.0d) * 0.3333333333333333d;
        }
        double d4 = 1.0d - d3;
        return (1.0d - ((4.0d * d4) * d4)) * 0.3333333333333333d;
    }

    private static final long k(long j) {
        int i;
        int e2 = e(j) & 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 7; i4 >= 0; i4--) {
            if (i4 == 7) {
                i = 2;
            } else {
                i = 4;
            }
            int i5 = b[e2 + ((((int) (j >>> (((i4 + i4) * 4) + 1))) & ((1 << (i + i)) - 1)) << 2)];
            int i6 = i4 * 4;
            i2 += (i5 >> 6) << i6;
            i3 += ((i5 >> 2) & 15) << i6;
            e2 = i5 & 3;
        }
        if ((c(j) & 1229782938247303440L) != 0) {
            e2 ^= 1;
        }
        return (((long) i2) << 33) | (((long) i3) << 2) | ((long) e2);
    }

    private static final int l(long j) {
        return (int) (j >>> 33);
    }

    private static final int m(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    private static final int a(double d2) {
        double d3;
        if (d2 < 0.0d) {
            d3 = 1.0d - (Math.sqrt(1.0d - (d2 * 3.0d)) * 0.5d);
        } else {
            d3 = Math.sqrt((d2 * 3.0d) + 1.0d) * 0.5d;
        }
        return Math.max(0, Math.min(1073741823, (int) Math.round((d3 * 1.073741824E9d) - 8.0d)));
    }

    public static String d(long j) {
        if (j == 0) {
            return "X";
        }
        String lowerCase = Long.toHexString(j).toLowerCase(Locale.US);
        if (lowerCase.length() < 16) {
            StringBuilder sb = new StringBuilder(16);
            for (int length = lowerCase.length(); length < 16; length++) {
                sb.append('0');
            }
            sb.append(lowerCase);
            lowerCase = sb.toString();
        }
        return lowerCase.replaceAll("0*$", "");
    }

    private static final aelz e(int i) {
        return g[Math.min(5, i)];
    }

    private static int b(double d2) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((((d2 + 1.0d) * 0.5d) * 1.073741824E9d) - 8.0d)));
    }

    private static int b(double d2, double d3, double d4) {
        double abs = Math.abs(d2);
        double abs2 = Math.abs(d3);
        double abs3 = Math.abs(d4);
        return abs <= abs2 ? abs2 <= abs3 ? d4 < 0.0d ? 5 : 2 : d3 < 0.0d ? 4 : 1 : abs <= abs3 ? d4 < 0.0d ? 5 : 2 : d2 < 0.0d ? 3 : 0;
    }

    private static final int a(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return a[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    public static final int b(long j) {
        if (!f(j)) {
            return 30 - (Long.numberOfTrailingZeros(j) >> 1);
        }
        return 30;
    }

    public static final long a(double d2, double d3) {
        return b(Math.toRadians(d2), Math.toRadians(d3));
    }

    public static final long a(int i, int i2) {
        return b(aell.a(i), aell.a(i2));
    }

    public static final long b(double d2, double d3) {
        double cos = Math.cos(d2);
        double cos2 = Math.cos(d3) * cos;
        double sin = cos * Math.sin(d3);
        double sin2 = Math.sin(d2);
        int b2 = b(cos2, sin, sin2);
        aely d4 = d(b2);
        double d5 = cos2;
        double d6 = sin;
        double d7 = sin2;
        return a(b2, a(d4.a(d5, d6, d7)), a(d4.b(d5, d6, d7)));
    }

    private static final long a(int i, int i2, int i3) {
        int i4 = i & 1;
        long j = ((long) i) << 28;
        for (int i5 = 7; i5 >= 4; i5--) {
            int a2 = a(i2, i3, i5, i4);
            j = a(j, i5, a2);
            i4 = a(a2);
        }
        long j2 = 0;
        for (int i6 = 3; i6 >= 0; i6--) {
            int a3 = a(i2, i3, i6, i4);
            j2 = a(j2, i6, a3);
            i4 = a(a3);
        }
        long j3 = (j << 32) + j2;
        return j3 + j3 + 1;
    }

    private static final long a(int i, int i2, int i3, boolean z) {
        if (z) {
            return a(i, i2, i3);
        }
        double b2 = b(i2);
        double b3 = b(i3);
        aelz e2 = e(i);
        double a2 = e2.a(b2, b3);
        double b4 = e2.b(b2, b3);
        double c2 = e2.c(b2, b3);
        int b5 = b(a2, b4, c2);
        aely d2 = d(b5);
        double d3 = a2;
        double d4 = b4;
        double d5 = c2;
        return a(b5, b(d2.a(d3, d4, d5)), b(d2.b(d3, d4, d5)));
    }

    public static final long b(long j, int i) {
        return j + (((long) ((i + i) - 3)) * (c(j) >>> 2));
    }

    private static final void b(int i, int i2) {
        if (i2 < i) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Given array of length ");
            sb.append(i2);
            sb.append(" needs to be of minimum length ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final void b(long j, double[] dArr) {
        double[] dArr2 = dArr;
        b(2, dArr2.length);
        long g2 = g(j);
        double h = h(g2);
        double i = i(g2);
        aelz e2 = e(e(j));
        double a2 = e2.a(h, i);
        double b2 = e2.b(h, i);
        dArr2[0] = a(a2, b2, e2.c(h, i));
        dArr2[1] = Math.atan2(b2, a2);
    }

    private static final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            int i7 = ((i2 << 4) + i3) << 2;
            int i8 = i5 << 2;
            a[i7 + i4] = i8 + i6;
            b[i8 + i4] = i7 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        int i12 = i5 << 2;
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = d[i6][i13];
            int i15 = i9;
            int i16 = i4;
            a(i15, (i14 >>> 1) + i10, i11 + (i14 & 1), i16, i12 + i13, i6 ^ c[i13]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        if (r2 < 1073741824) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        if (r2 >= 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        r4 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[LOOP:0: B:8:0x0050->B:33:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d3 A[EDGE_INSN: B:53:0x00d3->B:34:0x00d3 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(long r24, int r26, long[] r27) {
        /*
            r0 = r26
            r1 = r27
            int r2 = b((long) r24)
            int r2 = r0 - r2
            r3 = 4
            int r2 = r3 << r2
            int r2 = r2 + r3
            int r4 = r1.length
            b((int) r2, (int) r4)
            int r2 = b((long) r24)
            int r4 = c((int) r2)
            int r5 = c((int) r26)
            int r6 = e((long) r24)
            long r7 = k(r24)
            int r9 = -r4
            int r10 = l(r7)
            r10 = r10 & r9
            int r7 = m(r7)
            r7 = r7 & r9
            int r8 = r10 + r4
            int r9 = r10 - r4
            int r11 = r10 - r5
            int r12 = r7 + r4
            int r13 = r7 - r4
            int r14 = r7 - r5
            r15 = 1073741824(0x40000000, float:2.0)
            r16 = 0
            r17 = 1
            if (r12 >= r15) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r13 < 0) goto L_0x004c
            r13 = 1
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r15 = -r5
            r18 = 0
        L_0x0050:
            r19 = r2
            int r2 = r7 + r15
            if (r15 < 0) goto L_0x0085
            if (r15 >= r4) goto L_0x007a
            r25 = r7
            int r7 = r10 + r15
            int r20 = r18 + 1
            r21 = r4
            r22 = r5
            long r4 = a((int) r6, (int) r7, (int) r14, (boolean) r13)
            long r4 = a((long) r4, (int) r0)
            r1[r18] = r4
            int r18 = r20 + 1
            long r4 = a((int) r6, (int) r7, (int) r12, (boolean) r3)
            long r4 = a((long) r4, (int) r0)
            r1[r20] = r4
            r4 = 1
            goto L_0x0090
        L_0x007a:
            r21 = r4
            r22 = r5
            r25 = r7
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x008f
            goto L_0x008d
        L_0x0085:
            r21 = r4
            r22 = r5
            r25 = r7
            if (r2 < 0) goto L_0x008f
        L_0x008d:
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            int r5 = r18 + 1
            if (r4 != 0) goto L_0x0096
            r7 = 0
            goto L_0x009b
        L_0x0096:
            if (r9 < 0) goto L_0x009a
            r7 = 1
            goto L_0x009b
        L_0x009a:
            r7 = 0
        L_0x009b:
            r20 = r12
            r23 = r13
            long r12 = a((int) r6, (int) r11, (int) r2, (boolean) r7)
            long r12 = a((long) r12, (int) r0)
            r1[r18] = r12
            int r18 = r5 + 1
            if (r4 != 0) goto L_0x00af
            r4 = 0
            goto L_0x00b6
        L_0x00af:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r8 >= r4) goto L_0x00b5
            r4 = 1
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            long r12 = a((int) r6, (int) r8, (int) r2, (boolean) r4)
            long r12 = a((long) r12, (int) r0)
            r1[r5] = r12
            r2 = r21
            if (r15 >= r2) goto L_0x00d3
            int r15 = r15 + r22
            r7 = r25
            r4 = r2
            r2 = r19
            r12 = r20
            r5 = r22
            r13 = r23
            goto L_0x0050
        L_0x00d3:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 >= r0) goto L_0x00da
            if (r9 < 0) goto L_0x00da
            goto L_0x00df
        L_0x00da:
            if (r3 != 0) goto L_0x00dd
            goto L_0x00e2
        L_0x00dd:
            if (r23 == 0) goto L_0x00e2
        L_0x00df:
            r0 = r18
            goto L_0x0107
        L_0x00e2:
            java.util.Arrays.sort(r27)
            if (r19 != 0) goto L_0x00e9
            r3 = 4
            goto L_0x00ea
        L_0x00e9:
            r3 = 1
        L_0x00ea:
            int r0 = r18 + -1
            r2 = 0
        L_0x00ed:
            if (r2 >= r3) goto L_0x0105
        L_0x00ef:
            int r4 = r0 + -1
            r5 = r1[r4]
            r7 = r1[r0]
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0103
            int r18 = r18 + -1
            r5 = r1[r18]
            r1[r0] = r5
            int r2 = r2 + 1
            r0 = r4
            goto L_0x00ed
        L_0x0103:
            r0 = r4
            goto L_0x00ef
        L_0x0105:
            r0 = r18
        L_0x0107:
            int r2 = r1.length
            r3 = 0
            java.util.Arrays.fill(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.a(long, int, long[]):void");
    }

    public static final void a(long j, double[] dArr) {
        b(j, dArr);
        dArr[0] = Math.toDegrees(dArr[0]);
        dArr[1] = Math.toDegrees(dArr[1]);
    }

    public static final void a(long j, int[] iArr) {
        int[] iArr2 = iArr;
        b(2, iArr2.length);
        long g2 = g(j);
        double h = h(g2);
        double i = i(g2);
        aelz e2 = e(e(j));
        double a2 = e2.a(h, i);
        double b2 = e2.b(h, i);
        long a3 = aelk.a(a(a2, b2, e2.c(h, i)), Math.atan2(b2, a2));
        iArr2[0] = aelk.a(a3);
        iArr2[1] = (int) a3;
    }

    public static final boolean a(long j) {
        return e(j) < 6 && (c(j) & 1537228672809129301L) != 0;
    }
}
