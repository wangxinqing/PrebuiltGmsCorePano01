package defpackage;

import java.util.Arrays;

/* renamed from: apbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apbv {
    final long[] a;
    final long[] b;
    final long[] c;

    public apbv() {
        this(new long[10], new long[10], new long[10]);
    }

    static void a(apbv apbv, apbu apbu) {
        apcp.c(apbv.a, apbu.a.a, apbu.b);
        long[] jArr = apbv.b;
        apbv apbv2 = apbu.a;
        apcp.c(jArr, apbv2.b, apbv2.c);
        apcp.c(apbv.c, apbu.a.c, apbu.b);
    }

    public apbv(apbu apbu) {
        this();
        a(this, apbu);
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = this.c;
        int i = apcp.a;
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        apcp.b(jArr5, jArr4);
        apcp.b(jArr14, jArr5);
        apcp.b(jArr13, jArr14);
        apcp.c(jArr6, jArr13, jArr4);
        apcp.c(jArr7, jArr6, jArr5);
        apcp.b(jArr13, jArr7);
        apcp.c(jArr8, jArr13, jArr6);
        apcp.b(jArr13, jArr8);
        apcp.b(jArr14, jArr13);
        apcp.b(jArr13, jArr14);
        apcp.b(jArr14, jArr13);
        apcp.b(jArr13, jArr14);
        apcp.c(jArr9, jArr13, jArr8);
        apcp.b(jArr13, jArr9);
        apcp.b(jArr14, jArr13);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            apcp.b(jArr13, jArr14);
            apcp.b(jArr14, jArr13);
        }
        apcp.c(jArr10, jArr14, jArr9);
        apcp.b(jArr13, jArr10);
        apcp.b(jArr14, jArr13);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            apcp.b(jArr13, jArr14);
            apcp.b(jArr14, jArr13);
        }
        apcp.c(jArr13, jArr14, jArr10);
        apcp.b(jArr14, jArr13);
        apcp.b(jArr13, jArr14);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            apcp.b(jArr14, jArr13);
            apcp.b(jArr13, jArr14);
        }
        apcp.c(jArr11, jArr13, jArr9);
        apcp.b(jArr13, jArr11);
        apcp.b(jArr14, jArr13);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            apcp.b(jArr13, jArr14);
            apcp.b(jArr14, jArr13);
        }
        apcp.c(jArr12, jArr14, jArr11);
        apcp.b(jArr14, jArr12);
        apcp.b(jArr13, jArr14);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            apcp.b(jArr14, jArr13);
            apcp.b(jArr13, jArr14);
        }
        apcp.c(jArr14, jArr13, jArr12);
        apcp.b(jArr13, jArr14);
        apcp.b(jArr14, jArr13);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            apcp.b(jArr13, jArr14);
            apcp.b(jArr14, jArr13);
        }
        apcp.c(jArr13, jArr14, jArr11);
        apcp.b(jArr14, jArr13);
        apcp.b(jArr13, jArr14);
        apcp.b(jArr14, jArr13);
        apcp.b(jArr13, jArr14);
        apcp.b(jArr14, jArr13);
        apcp.c(jArr, jArr14, jArr7);
        apcp.c(jArr2, this.a, jArr);
        apcp.c(jArr3, this.b, jArr);
        byte[] a2 = apcp.a(jArr3);
        byte b2 = a2[31];
        int i8 = apbx.a;
        a2[31] = (byte) (((apcp.a(jArr2)[0] & 1) << 7) ^ b2);
        return a2;
    }

    public apbv(apbv apbv) {
        this.a = Arrays.copyOf(apbv.a, 10);
        this.b = Arrays.copyOf(apbv.b, 10);
        this.c = Arrays.copyOf(apbv.c, 10);
    }

    public apbv(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
