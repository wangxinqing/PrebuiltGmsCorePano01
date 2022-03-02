package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: arsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsq extends ahye implements arsn {
    public static final arsq a = new arsq();
    private static final short u = a(0);
    public short b;
    public arsf c;
    public arqf d;
    public arqj e;
    public arrs f;
    public arqv g;
    public arqo n;
    public argb o;
    public argb p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;

    private arsq() {
    }

    static short a(int i) {
        if (i <= 0) {
            return u;
        }
        int i2 = i - 32768;
        return i2 <= 32767 ? (short) i2 : u;
    }

    static long d(long j) {
        return j & 281474960982000L;
    }

    public final long c(long j) {
        return this.r ? d(j) : j;
    }

    /* access modifiers changed from: package-private */
    public final long e(long j) {
        return this.s ? d(j) : j;
    }

    public final int f() {
        return this.o.size();
    }

    private final void a(arqf arqf, arqj arqj, arrs arrs, arqv arqv, arqo arqo) {
        this.c.e.a((Runnable) new arso(this, arqf, arqj, arrs, arqv, arqo));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6 = r16.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.aqek r38, long r39, defpackage.arqz r41) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            r38.c()
            r3 = 1
            int r4 = r2.j(r3)
            arrs r0 = r1.f
            int r0 = r0.g()
            arrs r5 = r1.f
            int r5 = r5.size()
            int r0 = r0 - r5
            int r0 = r4 - r0
            if (r0 > 0) goto L_0x0023
            java.util.Set r0 = java.util.Collections.emptySet()
            r6 = r0
            goto L_0x004d
        L_0x0023:
            arrs r5 = r1.f
            arrq r5 = r5.entrySet()
            arrp r5 = r5.iterator()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r0)
        L_0x0032:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0039
            goto L_0x004d
        L_0x0039:
            if (r0 <= 0) goto L_0x004c
            r5.f()
            short r7 = r5.h()
            java.lang.Short r7 = java.lang.Short.valueOf(r7)
            r6.add(r7)
            int r0 = r0 + -1
            goto L_0x0032
        L_0x004c:
        L_0x004d:
            int r5 = r2.j(r3)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r5)
            r9 = 0
        L_0x0058:
            if (r9 >= r5) goto L_0x006e
            byte[] r0 = r2.b((int) r3, (int) r9)     // Catch:{ Exception -> 0x006a }
            long r10 = defpackage.arst.c(r0)     // Catch:{ Exception -> 0x006a }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x006a }
            r7.add(r0)     // Catch:{ Exception -> 0x006a }
            goto L_0x006b
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            int r9 = r9 + 1
            goto L_0x0058
        L_0x006e:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r5 = r7.isEmpty()
            if (r5 != 0) goto L_0x00a4
            arrs r5 = r1.f
            arrq r5 = r5.entrySet()
            arrp r5 = r5.iterator()
        L_0x0083:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00a4
            r5.f()
            long r9 = r5.i()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r9 = r7.contains(r9)
            if (r9 == 0) goto L_0x0083
            java.lang.Object r9 = r5.e()
            java.lang.Short r9 = (java.lang.Short) r9
            r0.add(r9)
            goto L_0x0083
        L_0x00a4:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r5.addAll(r6)
            r5.addAll(r0)
            arsf r0 = r1.c
            aybd r0 = r0.g
            boolean r0 = r0.enableFrewleFloorEstimator()
            r6 = 4
            if (r0 == 0) goto L_0x00c2
            int r0 = r2.j(r6)
            if (r4 != r0) goto L_0x00c2
            r7 = 1
            goto L_0x00c3
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            r9 = 2
            r10 = 3
            if (r7 != 0) goto L_0x00c9
            goto L_0x0160
        L_0x00c9:
            boolean r0 = r2.h(r6)
            if (r0 == 0) goto L_0x00e7
            r0 = 0
            r11 = 0
            r12 = 0
        L_0x00d3:
            if (r0 >= r4) goto L_0x00e6
            aqek r13 = r2.f(r6, r0)
            int r14 = r13.j(r9)
            int r12 = r12 + r14
            int r13 = r13.j(r10)
            int r11 = r11 + r13
            int r0 = r0 + 1
            goto L_0x00d3
        L_0x00e6:
            goto L_0x00e9
        L_0x00e7:
            r11 = 0
            r12 = 0
        L_0x00e9:
            arqv r0 = r1.g
            int r0 = r0.g()
            arqv r13 = r1.g
            int r13 = r13.size()
            int r0 = r0 - r13
            int r12 = r12 - r0
            arqo r0 = r1.n
            int r0 = r0.g()
            arqo r13 = r1.n
            int r13 = r13.size()
            int r0 = r0 - r13
            int r11 = r11 - r0
            if (r12 <= 0) goto L_0x0108
            goto L_0x010f
        L_0x0108:
            if (r11 > 0) goto L_0x010f
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L_0x015d
        L_0x010f:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            arqv r13 = r1.g
            arqt r13 = r13.entrySet()
            arqs r13 = r13.iterator()
        L_0x011e:
            boolean r14 = r13.hasNext()
            if (r14 != 0) goto L_0x0125
            goto L_0x0138
        L_0x0125:
            if (r12 <= 0) goto L_0x0138
            r13.f()
            short r14 = r13.h()
            java.lang.Short r14 = java.lang.Short.valueOf(r14)
            r0.add(r14)
            int r12 = r12 + -1
            goto L_0x011e
        L_0x0138:
            arqo r12 = r1.n
            arqm r12 = r12.entrySet()
            arql r12 = r12.iterator()
        L_0x0142:
            boolean r13 = r12.hasNext()
            if (r13 != 0) goto L_0x0149
            goto L_0x015d
        L_0x0149:
            if (r11 <= 0) goto L_0x015c
            r12.f()
            short r13 = r12.h()
            java.lang.Short r13 = java.lang.Short.valueOf(r13)
            r0.add(r13)
            int r11 = r11 + -1
            goto L_0x0142
        L_0x015c:
        L_0x015d:
            r5.addAll(r0)
        L_0x0160:
            r1.a((java.util.Set) r5)
            arsf r0 = r1.c
            aybd r0 = r0.g
            boolean r0 = r0.elevationFromWifiEnabled()
            if (r0 == 0) goto L_0x0175
            int r0 = r2.j(r10)
            if (r4 != r0) goto L_0x0175
            r5 = 1
            goto L_0x0176
        L_0x0175:
            r5 = 0
        L_0x0176:
            r11 = 0
        L_0x0177:
            if (r11 >= r4) goto L_0x03d3
            byte[] r12 = r2.b((int) r3, (int) r11)
            if (r5 == 0) goto L_0x0184
            aqek r14 = r2.f(r10, r11)
            goto L_0x0185
        L_0x0184:
            r14 = 0
        L_0x0185:
            if (r7 == 0) goto L_0x018c
            aqek r15 = r2.f(r6, r11)
            goto L_0x018d
        L_0x018c:
            r15 = 0
        L_0x018d:
            arsf r13 = r1.c     // Catch:{ IllegalStateException -> 0x03b1, IllegalArgumentException -> 0x039b, IndexOutOfBoundsException -> 0x0385 }
            r13.b()     // Catch:{ IllegalStateException -> 0x03b1, IllegalArgumentException -> 0x039b, IndexOutOfBoundsException -> 0x0385 }
            int r13 = defpackage.arst.b(r12)     // Catch:{ IllegalStateException -> 0x03b1, IllegalArgumentException -> 0x039b, IndexOutOfBoundsException -> 0x0385 }
            short r13 = (short) r13
            r25 = r11
            long r10 = defpackage.arst.c(r12)     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            int r21 = defpackage.arsr.a(r14)     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            int r8 = defpackage.arst.d(r12)     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            boolean r8 = defpackage.arss.a(r15, r8)     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            if (r8 == 0) goto L_0x01b2
            int r8 = r15.b((int) r6)     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            r22 = r8
            goto L_0x01b4
        L_0x01b2:
            r22 = 0
        L_0x01b4:
            arrs r8 = r1.f     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            arrq r16 = r8.entrySet()     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            arrp r16 = r16.iterator()     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
        L_0x01be:
            boolean r17 = r16.hasNext()     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            if (r17 != 0) goto L_0x01cb
            short r6 = r8.b()     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            r8.a = r6     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            goto L_0x01da
        L_0x01cb:
            r16.f()     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            long r17 = r16.i()     // Catch:{ IllegalStateException -> 0x037f, IllegalArgumentException -> 0x0379, IndexOutOfBoundsException -> 0x0373 }
            int r6 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x0365
            short r6 = r16.h()     // Catch:{ IllegalStateException -> 0x035b, IllegalArgumentException -> 0x0351, IndexOutOfBoundsException -> 0x0347 }
        L_0x01da:
            r16 = r8
            r17 = r6
            r18 = r13
            r19 = r10
            r23 = r39
            r16.a(r17, r18, r19, r21, r22, r23)     // Catch:{ IllegalStateException -> 0x035b, IllegalArgumentException -> 0x0351, IndexOutOfBoundsException -> 0x0347 }
            r8 = r41
            r8.c(r10)     // Catch:{ IllegalStateException -> 0x0345, IllegalArgumentException -> 0x0343, IndexOutOfBoundsException -> 0x0341 }
            int r10 = defpackage.arst.d(r12)     // Catch:{ IllegalStateException -> 0x0345, IllegalArgumentException -> 0x0343, IndexOutOfBoundsException -> 0x0341 }
            boolean r11 = defpackage.arsr.a(r14, r10)     // Catch:{ IllegalStateException -> 0x0345, IllegalArgumentException -> 0x0343, IndexOutOfBoundsException -> 0x0341 }
            boolean r13 = defpackage.arss.a(r15, r10)     // Catch:{ IllegalStateException -> 0x0345, IllegalArgumentException -> 0x0343, IndexOutOfBoundsException -> 0x0341 }
            r0 = 0
        L_0x01f9:
            if (r0 >= r10) goto L_0x0293
            r16 = r10
            long r9 = defpackage.arst.a((byte[]) r12, (int) r0)     // Catch:{ IllegalStateException -> 0x0289, IllegalArgumentException -> 0x027f, IndexOutOfBoundsException -> 0x0275 }
            int r30 = defpackage.arst.b(r12, r0)     // Catch:{ IllegalStateException -> 0x0289, IllegalArgumentException -> 0x027f, IndexOutOfBoundsException -> 0x0275 }
            double r19 = defpackage.arst.c(r12, r0)     // Catch:{ IllegalStateException -> 0x0289, IllegalArgumentException -> 0x027f, IndexOutOfBoundsException -> 0x0275 }
            r24 = r4
            long r3 = java.lang.Math.round(r19)     // Catch:{ IllegalStateException -> 0x0273, IllegalArgumentException -> 0x0271, IndexOutOfBoundsException -> 0x026f }
            int r4 = (int) r3     // Catch:{ IllegalStateException -> 0x0273, IllegalArgumentException -> 0x0271, IndexOutOfBoundsException -> 0x026f }
            byte r3 = (byte) r4     // Catch:{ IllegalStateException -> 0x0273, IllegalArgumentException -> 0x0271, IndexOutOfBoundsException -> 0x026f }
            double r19 = defpackage.arst.d(r12, r0)     // Catch:{ IllegalStateException -> 0x0273, IllegalArgumentException -> 0x0271, IndexOutOfBoundsException -> 0x026f }
            r21 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r19 = r19 / r21
            r21 = -4584664420663164928(0xc060000000000000, double:-128.0)
            double r19 = r19 + r21
            r36 = r5
            long r4 = java.lang.Math.round(r19)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            int r5 = (int) r4     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            byte r4 = (byte) r5     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            if (r11 == 0) goto L_0x023b
            boolean r5 = defpackage.arsr.b(r14, r0)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            if (r5 == 0) goto L_0x023b
            int r5 = defpackage.arsr.c(r14, r0)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            short r5 = a((int) r5)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r33 = r5
            goto L_0x023f
        L_0x023b:
            short r5 = u     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r33 = r5
        L_0x023f:
            if (r13 == 0) goto L_0x024f
            r5 = 1
            int r2 = r15.c((int) r5, (int) r0)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            short r2 = (short) r2     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            if (r2 == 0) goto L_0x024f
            int r2 = r2 + -1
            short r2 = (short) r2     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r34 = r2
            goto L_0x0251
        L_0x024f:
            r34 = -1
        L_0x0251:
            arqf r2 = r1.d     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            long r27 = r1.c(r9)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r26 = r2
            r29 = r6
            r31 = r3
            r32 = r4
            r26.a(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            int r0 = r0 + 1
            r2 = r38
            r10 = r16
            r4 = r24
            r5 = r36
            r3 = 1
            r9 = 2
            goto L_0x01f9
        L_0x026f:
            r0 = move-exception
            goto L_0x0278
        L_0x0271:
            r0 = move-exception
            goto L_0x0282
        L_0x0273:
            r0 = move-exception
            goto L_0x028c
        L_0x0275:
            r0 = move-exception
            r24 = r4
        L_0x0278:
            r36 = r5
        L_0x027a:
            r2 = 4
            r5 = 3
            r9 = 2
            goto L_0x038e
        L_0x027f:
            r0 = move-exception
            r24 = r4
        L_0x0282:
            r36 = r5
        L_0x0284:
            r2 = 4
            r5 = 3
            r9 = 2
            goto L_0x03a4
        L_0x0289:
            r0 = move-exception
            r24 = r4
        L_0x028c:
            r36 = r5
        L_0x028e:
            r2 = 4
            r5 = 3
            r9 = 2
            goto L_0x03ba
        L_0x0293:
            r24 = r4
            r36 = r5
            int r0 = defpackage.arst.d(r12)     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x0339, IndexOutOfBoundsException -> 0x0335 }
            boolean r0 = defpackage.arss.a(r15, r0)     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x0339, IndexOutOfBoundsException -> 0x0335 }
            if (r0 == 0) goto L_0x0324
            r2 = 2
            int r0 = r15.j(r2)     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x0339, IndexOutOfBoundsException -> 0x0335 }
            r2 = 0
        L_0x02a7:
            if (r2 < r0) goto L_0x02de
            r2 = 3
            int r0 = r15.j(r2)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            short r0 = (short) r0     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r3 = 0
        L_0x02b0:
            if (r3 >= r0) goto L_0x02d4
            aqek r4 = r15.f(r2, r3)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r5 = 1
            long r29 = defpackage.arss.b(r4, r5)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            aqek r4 = r15.f(r2, r3)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r2 = 2
            long r31 = defpackage.arss.b(r4, r2)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            arqo r2 = r1.n     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r26 = r2
            r27 = r6
            r28 = r3
            r26.a(r27, r28, r29, r31)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            int r3 = r3 + 1
            short r3 = (short) r3     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            r2 = 3
            goto L_0x02b0
        L_0x02d4:
            r5 = 3
            r9 = 2
            r10 = 4
            goto L_0x0327
        L_0x02d8:
            r0 = move-exception
            goto L_0x027a
        L_0x02da:
            r0 = move-exception
            goto L_0x0284
        L_0x02dc:
            r0 = move-exception
            goto L_0x028e
        L_0x02de:
            r3 = -1
            if (r2 == r3) goto L_0x02e7
            r3 = 2
            aqek r4 = r15.f(r3, r2)     // Catch:{ IllegalStateException -> 0x02dc, IllegalArgumentException -> 0x02da, IndexOutOfBoundsException -> 0x02d8 }
            goto L_0x02e8
        L_0x02e7:
            r4 = 0
        L_0x02e8:
            r3 = 1
            java.lang.String r29 = r4.f(r3)     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x0339, IndexOutOfBoundsException -> 0x0335 }
            r5 = 3
            aqek r9 = r4.e(r5)     // Catch:{ IllegalStateException -> 0x0322, IllegalArgumentException -> 0x0320, IndexOutOfBoundsException -> 0x031e }
            long r32 = defpackage.arss.b(r9, r3)     // Catch:{ IllegalStateException -> 0x0322, IllegalArgumentException -> 0x0320, IndexOutOfBoundsException -> 0x031e }
            aqek r3 = r4.e(r5)     // Catch:{ IllegalStateException -> 0x0322, IllegalArgumentException -> 0x0320, IndexOutOfBoundsException -> 0x031e }
            r9 = 2
            long r34 = defpackage.arss.b(r3, r9)     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            int r3 = r4.b((int) r9)     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            short r3 = (short) r3     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            r10 = 4
            int r4 = r4.b((int) r10)     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            short r4 = (short) r4     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            arqv r11 = r1.g     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            r26 = r11
            r27 = r6
            r28 = r2
            r30 = r3
            r31 = r4
            r26.a(r27, r28, r29, r30, r31, r32, r34)     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            int r2 = r2 + 1
            short r2 = (short) r2     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            goto L_0x02a7
        L_0x031e:
            r0 = move-exception
            goto L_0x0337
        L_0x0320:
            r0 = move-exception
            goto L_0x033b
        L_0x0322:
            r0 = move-exception
            goto L_0x033f
        L_0x0324:
            r5 = 3
            r9 = 2
            r10 = 4
        L_0x0327:
            arsf r0 = r1.c     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            r0.c()     // Catch:{ IllegalStateException -> 0x0333, IllegalArgumentException -> 0x0331, IndexOutOfBoundsException -> 0x032f }
            r2 = 4
            goto L_0x03c6
        L_0x032f:
            r0 = move-exception
            goto L_0x034f
        L_0x0331:
            r0 = move-exception
            goto L_0x0359
        L_0x0333:
            r0 = move-exception
            goto L_0x0363
        L_0x0335:
            r0 = move-exception
            r5 = 3
        L_0x0337:
            r9 = 2
            goto L_0x034f
        L_0x0339:
            r0 = move-exception
            r5 = 3
        L_0x033b:
            r9 = 2
            goto L_0x0359
        L_0x033d:
            r0 = move-exception
            r5 = 3
        L_0x033f:
            r9 = 2
            goto L_0x0363
        L_0x0341:
            r0 = move-exception
            goto L_0x034a
        L_0x0343:
            r0 = move-exception
            goto L_0x0354
        L_0x0345:
            r0 = move-exception
            goto L_0x035e
        L_0x0347:
            r0 = move-exception
            r8 = r41
        L_0x034a:
            r24 = r4
            r36 = r5
            r5 = 3
        L_0x034f:
            r2 = 4
            goto L_0x038e
        L_0x0351:
            r0 = move-exception
            r8 = r41
        L_0x0354:
            r24 = r4
            r36 = r5
            r5 = 3
        L_0x0359:
            r2 = 4
            goto L_0x03a4
        L_0x035b:
            r0 = move-exception
            r8 = r41
        L_0x035e:
            r24 = r4
            r36 = r5
            r5 = 3
        L_0x0363:
            r2 = 4
            goto L_0x03ba
        L_0x0365:
            r24 = r4
            r36 = r5
            r2 = 4
            r5 = 3
            r2 = r38
            r5 = r36
            r3 = 1
            r6 = 4
            goto L_0x01be
        L_0x0373:
            r0 = move-exception
            r24 = r4
            r36 = r5
            goto L_0x038c
        L_0x0379:
            r0 = move-exception
            r24 = r4
            r36 = r5
            goto L_0x03a2
        L_0x037f:
            r0 = move-exception
            r24 = r4
            r36 = r5
            goto L_0x03b8
        L_0x0385:
            r0 = move-exception
            r24 = r4
            r36 = r5
            r25 = r11
        L_0x038c:
            r2 = 4
            r5 = 3
        L_0x038e:
            arsf r0 = r1.c
            arpj r0 = r0.s
            r0.d()
            arsf r0 = r1.c
            r0.d()
            goto L_0x03c6
        L_0x039b:
            r0 = move-exception
            r24 = r4
            r36 = r5
            r25 = r11
        L_0x03a2:
            r2 = 4
            r5 = 3
        L_0x03a4:
            arsf r0 = r1.c
            arpj r0 = r0.s
            r0.b()
            arsf r0 = r1.c
            r0.d()
            goto L_0x03c6
        L_0x03b1:
            r0 = move-exception
            r24 = r4
            r36 = r5
            r25 = r11
        L_0x03b8:
            r2 = 4
            r5 = 3
        L_0x03ba:
            arsf r0 = r1.c
            arpj r0 = r0.s
            r0.c()
            arsf r0 = r1.c
            r0.d()
        L_0x03c6:
            int r11 = r25 + 1
            r2 = r38
            r4 = r24
            r5 = r36
            r3 = 1
            r6 = 4
            r10 = 3
            goto L_0x0177
        L_0x03d3:
            r24 = r4
            argb r0 = r1.p
            arfz r0 = r0.iterator()
        L_0x03db:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0418
            java.lang.Object r2 = r0.next()
            java.lang.Long r2 = (java.lang.Long) r2
            arqf r3 = r1.d
            long r4 = r2.longValue()
            long r4 = r1.c(r4)
            r6 = 0
            int r3 = r3.a((long) r4, (boolean) r6)
            r4 = -1
            if (r3 != r4) goto L_0x03db
            short r3 = r1.b
            if (r3 == 0) goto L_0x03fe
            goto L_0x040a
        L_0x03fe:
            arrs r3 = r1.f
            short r5 = r3.a
            if (r5 != 0) goto L_0x0409
            short r3 = r3.b()
            goto L_0x040a
        L_0x0409:
            r3 = r5
        L_0x040a:
            arqj r5 = r1.e
            long r7 = r2.longValue()
            long r7 = r1.e(r7)
            r5.a((long) r7, (short) r3)
            goto L_0x03db
        L_0x0418:
            int r0 = r1.t
            r2 = 1
            int r0 = r0 + r2
            r1.t = r0
            if (r24 > 0) goto L_0x0426
            r2 = 10
            if (r0 <= r2) goto L_0x0425
            goto L_0x0426
        L_0x0425:
            return
        L_0x0426:
            r37.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arsq.b(aqek, long, arqz):void");
    }

    public final void d() {
        if (this.j) {
            ByteBuffer allocate = ByteBuffer.allocate(this.d.h() + this.e.h() + this.f.h() + this.g.h() + this.n.h());
            this.d.c(allocate);
            this.e.c(allocate);
            this.f.c(allocate);
            this.g.c(allocate);
            this.n.c(allocate);
            this.c.d.f().execute(new arsp(this, allocate));
            this.t = 0;
        }
    }

    public final boolean e() {
        return !this.o.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set a(defpackage.arsy r42, defpackage.arrc r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r42.a()
            r7 = 0
        L_0x0018:
            if (r7 >= r5) goto L_0x021b
            long r13 = r1.a((int) r7)
            int r15 = r1.b(r7)
            int r24 = r1.c(r7)
            float r25 = r1.d(r7)
            float r22 = r1.e(r7)
            long r26 = r0.c(r13)
            float r8 = (float) r15
            arqf r9 = r0.d
            long r10 = r0.c(r13)
            r12 = 1
            int r9 = r9.a((long) r10, (boolean) r12)
            r10 = -1
            if (r9 == r10) goto L_0x0146
            arqf r6 = r0.d
            arhg r6 = r6.d
            arqj r6 = (defpackage.arqj) r6
            short r6 = r6.b((int) r9)
            arrs r11 = r0.f
            arhg r11 = r11.d
            arri r11 = (defpackage.arri) r11
            int r11 = r11.a((short) r6, (boolean) r12)
            if (r11 == r10) goto L_0x0132
            r0.b = r6
            arrs r12 = r0.f
            long[] r12 = r12.e
            r28 = r4
            r29 = r5
            r4 = r12[r11]
            arqf r12 = r0.d
            int[] r12 = r12.a
            r12 = r12[r9]
            long r4 = defpackage.arst.a((long) r4, (int) r12)
            arqf r12 = r0.d
            byte[] r10 = r12.b
            byte r10 = r10[r9]
            r30 = r2
            double r1 = (double) r10
            byte[] r10 = r12.e
            byte r10 = r10[r9]
            r19 = r1
            double r1 = (double) r10
            r31 = 4638707616191610880(0x4060000000000000, double:128.0)
            java.lang.Double.isNaN(r1)
            double r1 = r1 + r31
            r31 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r1 = r1 * r31
            arrs r10 = r0.f
            int[] r10 = r10.f
            r10 = r10[r11]
            short[] r11 = r12.f
            short r11 = r11[r9]
            r12 = 2147483647(0x7fffffff, float:NaN)
            r21 = -8388608(0xffffffffff800000, float:-Infinity)
            if (r10 == r12) goto L_0x00b0
            short r12 = u
            if (r12 == r11) goto L_0x00b0
            if (r12 == r11) goto L_0x00a7
            r12 = 32768(0x8000, float:4.5918E-41)
            int r11 = r11 + r12
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            int r10 = r10 + r11
            float r10 = (float) r10
            r11 = 1092616192(0x41200000, float:10.0)
            float r10 = r10 / r11
            r21 = r10
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            arsf r10 = r0.c
            aybd r10 = r10.g
            boolean r10 = r10.enableFrewleFloorEstimator()
            if (r10 == 0) goto L_0x0111
            arqf r10 = r0.d
            short[] r10 = r10.g
            short r9 = r10[r9]
            r10 = -1
            if (r9 == r10) goto L_0x0111
            arqv r11 = r0.g
            arhg r11 = r11.d
            arsc r11 = (defpackage.arsc) r11
            int r9 = defpackage.arsc.b(r6, r9)
            r12 = 1
            int r9 = r11.a((int) r9, (boolean) r12)
            if (r9 == r10) goto L_0x0111
            arqv r10 = r0.g
            short[] r10 = r10.b
            short r10 = r10[r9]
            arqo r11 = r0.n
            arhg r11 = r11.d
            arsc r11 = (defpackage.arsc) r11
            int r6 = defpackage.arsc.b(r6, r10)
            r12 = 1
            int r6 = r11.a((int) r6, (boolean) r12)
            r10 = -1
            if (r6 == r10) goto L_0x0112
            arqv r10 = r0.g
            java.lang.String r32 = r10.a((int) r9)
            arqv r10 = r0.g
            long[] r11 = r10.f
            r33 = r11[r9]
            long[] r10 = r10.g
            r35 = r10[r9]
            arqo r9 = r0.n
            long[] r10 = r9.a
            r37 = r10[r6]
            long[] r9 = r9.b
            r39 = r9[r6]
            arqq r6 = new arqq
            r31 = r6
            r31.<init>(r32, r33, r35, r37, r39)
            r23 = r6
            goto L_0x0114
        L_0x0111:
            r12 = 1
        L_0x0112:
            r23 = 0
        L_0x0114:
            arpu r6 = new arpu
            double r9 = (double) r8
            r8 = r6
            r31 = r9
            r9 = r13
            r33 = r7
            r7 = 1
            r11 = r4
            r4 = r13
            r13 = r19
            r34 = r15
            r15 = r1
            r17 = r21
            r18 = r31
            r20 = r24
            r21 = r25
            r8.<init>(r9, r11, r13, r15, r17, r18, r20, r21, r22, r23)
            r11 = r6
            goto L_0x0153
        L_0x0132:
            r30 = r2
            r28 = r4
            r29 = r5
            r33 = r7
            r4 = r13
            r34 = r15
            r7 = 1
            java.lang.Short r1 = java.lang.Short.valueOf(r6)
            r3.add(r1)
            goto L_0x0152
        L_0x0146:
            r30 = r2
            r28 = r4
            r29 = r5
            r33 = r7
            r4 = r13
            r34 = r15
            r7 = 1
        L_0x0152:
            r11 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x01c9
            java.lang.Long r1 = java.lang.Long.valueOf(r26)
            r2 = r30
            boolean r4 = r2.containsKey(r1)
            if (r4 == 0) goto L_0x01c3
            float r4 = r11.f
            java.lang.Object r5 = r2.get(r1)
            arpu r5 = (defpackage.arpu) r5
            float r5 = r5.f
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x019c
            java.lang.Object r4 = r2.get(r1)
            arpu r4 = (defpackage.arpu) r4
            long r13 = r4.a
            float r5 = r4.f
            int r15 = (int) r5
            r16 = 9
            long r5 = r4.b
            float r7 = r4.e
            int r8 = r4.g
            float r9 = r4.h
            arqq r4 = r4.l
            r12 = r43
            r17 = r5
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r4
            r12.a(r13, r15, r16, r17, r19, r20, r21, r22)
            r2.put(r1, r11)
            r5 = r28
            goto L_0x0212
        L_0x019c:
            long r4 = r11.a
            float r1 = r11.f
            int r1 = (int) r1
            r21 = 9
            long r6 = r11.b
            float r8 = r11.e
            int r9 = r11.g
            float r10 = r11.h
            arqq r11 = r11.l
            r17 = r43
            r18 = r4
            r20 = r1
            r22 = r6
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r17.a(r18, r20, r21, r22, r24, r25, r26, r27)
            r5 = r28
            goto L_0x0212
        L_0x01c3:
            r2.put(r1, r11)
            r5 = r28
            goto L_0x0212
        L_0x01c9:
            r2 = r30
            argb r1 = r0.o
            boolean r1 = r1.a((long) r4, (boolean) r7)
            if (r1 == 0) goto L_0x01e9
            r12 = 2
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r43
            r9 = r4
            r11 = r34
            r16 = r24
            r17 = r25
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            r5 = r28
            goto L_0x0212
        L_0x01e9:
            boolean r1 = r0.b((long) r4)
            if (r1 == 0) goto L_0x0205
            r12 = 3
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r43
            r9 = r4
            r11 = r34
            r16 = r24
            r17 = r25
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            r5 = r28
            goto L_0x0212
        L_0x0205:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r33)
            r5 = r28
            r5.put(r1, r4)
        L_0x0212:
            int r7 = r33 + 1
            r1 = r42
            r4 = r5
            r5 = r29
            goto L_0x0018
        L_0x021b:
            r5 = r4
            int r1 = r2.size()
            int r4 = r0.q
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x022a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x027d
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.Object r6 = r6.getValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r42
            int r11 = r7.b(r6)
            int r16 = r7.c(r6)
            float r17 = r7.d(r6)
            r7.e(r6)
            if (r1 > r4) goto L_0x026f
            argb r6 = r0.o
            r6.a((long) r9)
            r12 = 4
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r43
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            goto L_0x022a
        L_0x026f:
            r12 = 8
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r43
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            goto L_0x022a
        L_0x027d:
            r0.a((java.util.Set) r3)
            arqf r1 = r0.d
            int r1 = r1.size()
            double r3 = (double) r1
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            arqf r1 = r0.d
            int r1 = r1.g()
            double r7 = (double) r1
            java.lang.Double.isNaN(r7)
            double r3 = r3 / r7
            defpackage.arpj.a((double) r3)
            arqj r1 = r0.e
            int r1 = r1.size()
            double r3 = (double) r1
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            arqj r1 = r0.e
            int r1 = r1.g()
            double r7 = (double) r1
            java.lang.Double.isNaN(r7)
            double r3 = r3 / r7
            defpackage.arpj.a((double) r3)
            arrs r1 = r0.f
            int r1 = r1.size()
            double r3 = (double) r1
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            arrs r1 = r0.f
            int r1 = r1.g()
            double r5 = (double) r1
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            defpackage.arpj.a((double) r3)
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Collection r2 = r2.values()
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arsq.a(arsy, arrc):java.util.Set");
    }

    public final void a() {
        super.b();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.n.clear();
        this.p.clear();
        this.o.clear();
    }

    public final void a(long j) {
        HashSet hashSet = new HashSet();
        arrp a2 = this.f.entrySet().iterator();
        while (a2.hasNext()) {
            a2.f();
            if (a2.j() < j) {
                hashSet.add(Short.valueOf(a2.h()));
                a2.remove();
            }
        }
        a((Set) hashSet);
    }

    public final void a(aqek aqek) {
        if (aqek.i(78)) {
            this.q = aqek.b(78);
        }
        if (aqek.i(74)) {
            this.s = aqek.a(74);
        }
        if (aqek.i(73)) {
            this.r = aqek.a(73);
        }
    }

    public final void a(aqek aqek, long j, arqz arqz) {
        b(aqek, j, arqz);
        arqz.d((long) this.o.size());
        this.o.clear();
    }

    public final void a(PrintWriter printWriter) {
        printWriter.print("frewleTileCacheManager{downloadqueue=[");
        arfz a2 = this.o.iterator();
        while (a2.hasNext()) {
            printWriter.printf("%012X, ", new Object[]{(Long) a2.next()});
        }
        printWriter.print("]; numMacsInCache=");
        printWriter.print(this.d.size());
        printWriter.print("; numUninformativeMacAddresses=");
        printWriter.print(this.e.size());
        printWriter.print("; nibbleModel=");
        printWriter.print(this.r ? 1 : 0);
        printWriter.print("; nibbleUninform=");
        printWriter.print(this.s ? 1 : 0);
        printWriter.print("; tilesInCache=[");
        arrp a3 = this.f.entrySet().iterator();
        while (a3.hasNext()) {
            a3.f();
            printWriter.printf("0x%016x, ", new Object[]{Long.valueOf(a3.i())});
        }
        printWriter.println("]}");
    }

    /* access modifiers changed from: package-private */
    public final void a(Set set) {
        if (!set.isEmpty()) {
            arqc a2 = this.d.entrySet().iterator();
            while (a2.hasNext()) {
                a2.f();
                if (set.contains(Short.valueOf(a2.h()))) {
                    a2.remove();
                }
            }
            arqh a3 = this.e.iterator();
            while (a3.hasNext()) {
                a3.c();
                if (set.contains(Short.valueOf(a3.f()))) {
                    a3.remove();
                }
            }
            arqs a4 = this.g.entrySet().iterator();
            while (a4.hasNext()) {
                a4.f();
                if (set.contains(Short.valueOf(a4.h()))) {
                    a4.remove();
                }
            }
            arql a5 = this.n.entrySet().iterator();
            while (a5.hasNext()) {
                a5.f();
                if (set.contains(Short.valueOf(a5.h()))) {
                    a5.remove();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: arrs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: arrs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: arrs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: arqv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: arqv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: arqv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: arrs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: arrs} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r8) {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            r0 = 0
            arqf r2 = new arqf     // Catch:{ IllegalArgumentException -> 0x008d, BufferUnderflowException -> 0x008b, ArrayIndexOutOfBoundsException -> 0x0089, all -> 0x0083 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x008d, BufferUnderflowException -> 0x008b, ArrayIndexOutOfBoundsException -> 0x0089, all -> 0x0083 }
            arhj r1 = r2.c     // Catch:{ IllegalArgumentException -> 0x008d, BufferUnderflowException -> 0x008b, ArrayIndexOutOfBoundsException -> 0x0089, all -> 0x0083 }
            arqj r1 = defpackage.arqj.a((java.nio.ByteBuffer) r8, (defpackage.arhj) r1)     // Catch:{ IllegalArgumentException -> 0x008d, BufferUnderflowException -> 0x008b, ArrayIndexOutOfBoundsException -> 0x0089, all -> 0x0083 }
            defpackage.arhd.a(r2, r1, r8)     // Catch:{ IllegalArgumentException -> 0x008d, BufferUnderflowException -> 0x008b, ArrayIndexOutOfBoundsException -> 0x0089, all -> 0x0083 }
            arqj r3 = defpackage.arqj.d((java.nio.ByteBuffer) r8)     // Catch:{ IllegalArgumentException -> 0x007d, BufferUnderflowException -> 0x007b, ArrayIndexOutOfBoundsException -> 0x0079, all -> 0x0073 }
            arrs r4 = new arrs     // Catch:{ IllegalArgumentException -> 0x0070, BufferUnderflowException -> 0x006e, ArrayIndexOutOfBoundsException -> 0x006c, all -> 0x0066 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0070, BufferUnderflowException -> 0x006e, ArrayIndexOutOfBoundsException -> 0x006c, all -> 0x0066 }
            arhj r1 = r4.c     // Catch:{ IllegalArgumentException -> 0x0070, BufferUnderflowException -> 0x006e, ArrayIndexOutOfBoundsException -> 0x006c, all -> 0x0066 }
            arri r1 = defpackage.arri.a((java.nio.ByteBuffer) r8, (defpackage.arhj) r1)     // Catch:{ IllegalArgumentException -> 0x0070, BufferUnderflowException -> 0x006e, ArrayIndexOutOfBoundsException -> 0x006c, all -> 0x0066 }
            defpackage.arhd.a(r4, r1, r8)     // Catch:{ IllegalArgumentException -> 0x0070, BufferUnderflowException -> 0x006e, ArrayIndexOutOfBoundsException -> 0x006c, all -> 0x0066 }
            arsf r1 = r7.c     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            aybd r1 = r1.g     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            boolean r1 = r1.throwIllegalArgExceptionOnUnsupportedEncoding()     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            arqv r5 = new arqv     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            r5.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            arhj r1 = r5.c     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            arsc r1 = defpackage.arsc.a((java.nio.ByteBuffer) r8, (defpackage.arhj) r1)     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            defpackage.arhd.a(r5, r1, r8)     // Catch:{ IllegalArgumentException -> 0x0063, BufferUnderflowException -> 0x0061, ArrayIndexOutOfBoundsException -> 0x005f, all -> 0x0058 }
            arqo r6 = new arqo     // Catch:{ IllegalArgumentException -> 0x0056, BufferUnderflowException -> 0x0054, ArrayIndexOutOfBoundsException -> 0x0052, all -> 0x004e }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x0056, BufferUnderflowException -> 0x0054, ArrayIndexOutOfBoundsException -> 0x0052, all -> 0x004e }
            arhj r0 = r6.c     // Catch:{ IllegalArgumentException -> 0x0056, BufferUnderflowException -> 0x0054, ArrayIndexOutOfBoundsException -> 0x0052, all -> 0x004e }
            arsc r0 = defpackage.arsc.a((java.nio.ByteBuffer) r8, (defpackage.arhj) r0)     // Catch:{ IllegalArgumentException -> 0x0056, BufferUnderflowException -> 0x0054, ArrayIndexOutOfBoundsException -> 0x0052, all -> 0x004e }
            defpackage.arhd.a(r6, r0, r8)     // Catch:{ IllegalArgumentException -> 0x0056, BufferUnderflowException -> 0x0054, ArrayIndexOutOfBoundsException -> 0x0052, all -> 0x004e }
            r1 = r7
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x004e:
            r8 = move-exception
            r1 = r2
            goto L_0x0099
        L_0x0052:
            r8 = move-exception
            goto L_0x0081
        L_0x0054:
            r8 = move-exception
            goto L_0x0081
        L_0x0056:
            r8 = move-exception
            goto L_0x0081
        L_0x0058:
            r8 = move-exception
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r0
            goto L_0x009c
        L_0x005f:
            r8 = move-exception
            goto L_0x0064
        L_0x0061:
            r8 = move-exception
            goto L_0x0064
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            r5 = r0
            goto L_0x0081
        L_0x0066:
            r8 = move-exception
            r4 = r0
            r1 = r2
            r2 = r3
            r3 = r4
            goto L_0x009c
        L_0x006c:
            r8 = move-exception
            goto L_0x0071
        L_0x006e:
            r8 = move-exception
            goto L_0x0071
        L_0x0070:
            r8 = move-exception
        L_0x0071:
            r4 = r0
            goto L_0x0080
        L_0x0073:
            r8 = move-exception
            r3 = r0
            r4 = r3
            r1 = r2
            r2 = r4
            goto L_0x009c
        L_0x0079:
            r8 = move-exception
            goto L_0x007e
        L_0x007b:
            r8 = move-exception
            goto L_0x007e
        L_0x007d:
            r8 = move-exception
        L_0x007e:
            r3 = r0
            r4 = r3
        L_0x0080:
            r5 = r4
        L_0x0081:
            r0 = r2
            goto L_0x0091
        L_0x0083:
            r8 = move-exception
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            goto L_0x009c
        L_0x0089:
            r8 = move-exception
            goto L_0x008e
        L_0x008b:
            r8 = move-exception
            goto L_0x008e
        L_0x008d:
            r8 = move-exception
        L_0x008e:
            r3 = r0
            r4 = r3
            r5 = r4
        L_0x0091:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            r1.<init>(r8)     // Catch:{ all -> 0x0097 }
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r8 = move-exception
            r1 = r0
        L_0x0099:
            r2 = r3
            r3 = r4
            r4 = r5
        L_0x009c:
            r5 = 0
            r0 = r7
            r0.a(r1, r2, r3, r4, r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arsq.a(byte[]):void");
    }

    public final void b(aqek aqek) {
        arfz a2 = this.o.iterator();
        this.p.clear();
        while (a2.hasNext()) {
            a2.c();
            aqek.a(1, a2.a());
            this.p.a(a2.a());
        }
        this.p.size();
    }

    public final boolean b(long j) {
        return this.e.a(e(j), true);
    }
}
