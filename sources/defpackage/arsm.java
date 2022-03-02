package defpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: arsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsm extends ahye implements arsn {
    public static final arsm a = new arsm();
    private static final short s = a(0);
    public short b;
    public arsf c;
    public arqa d;
    public arqj e;
    public arrn f;
    public argb g;
    public argb n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;

    private arsm() {
    }

    static short a(int i) {
        if (i <= 0) {
            return s;
        }
        int i2 = i - 32768;
        return i2 <= 32767 ? (short) i2 : s;
    }

    static long d(long j) {
        return j & 281474960982000L;
    }

    public final long c(long j) {
        return this.p ? d(j) : j;
    }

    /* access modifiers changed from: package-private */
    public final long e(long j) {
        return this.q ? d(j) : j;
    }

    public final int f() {
        return this.g.size();
    }

    private final void a(arqa arqa, arqj arqj, arrn arrn) {
        this.c.e.a((Runnable) new arsk(this, arqa, arqj, arrn));
    }

    private final void b(aqek aqek, long j, arqz arqz) {
        Set set;
        aqek aqek2;
        int i;
        boolean z;
        short b2;
        short s2;
        aqek aqek3;
        aqek aqek4 = aqek;
        aqek.c();
        int i2 = 1;
        int j2 = aqek4.j(1);
        int g2 = j2 - (this.f.g() - this.f.size());
        if (g2 <= 0) {
            set = Collections.emptySet();
        } else {
            arrk a2 = this.f.entrySet().iterator();
            set = new HashSet(g2);
            while (a2.hasNext() && g2 > 0) {
                a2.f();
                set.add(Short.valueOf(a2.h()));
                g2--;
            }
        }
        int j3 = aqek4.j(1);
        HashSet hashSet = new HashSet(j3);
        for (int i3 = 0; i3 < j3; i3++) {
            try {
                hashSet.add(Long.valueOf(arst.c(aqek4.b(1, i3))));
            } catch (Exception e2) {
            }
        }
        HashSet hashSet2 = new HashSet();
        if (!hashSet.isEmpty()) {
            arrk a3 = this.f.entrySet().iterator();
            while (a3.hasNext()) {
                a3.f();
                if (hashSet.contains(Long.valueOf(a3.i()))) {
                    hashSet2.add((Short) a3.e());
                }
            }
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.addAll(set);
        hashSet3.addAll(hashSet2);
        a((Set) hashSet3);
        int i4 = 3;
        boolean z2 = this.c.g.elevationFromWifiEnabled() && j2 == aqek4.j(3);
        int i5 = 0;
        while (i5 < j2) {
            byte[] b3 = aqek4.b(i2, i5);
            if (z2) {
                aqek2 = aqek4.f(i4, i5);
            } else {
                aqek2 = null;
            }
            try {
                this.c.b();
                int b4 = arst.b(b3);
                long c2 = arst.c(b3);
                int a4 = arsr.a(aqek2);
                arrn arrn = this.f;
                short s3 = (short) b4;
                arrk a5 = arrn.entrySet().iterator();
                while (true) {
                    if (!a5.hasNext()) {
                        b2 = arrn.b();
                        arrn.a = b2;
                        break;
                    }
                    a5.f();
                    if (c2 == a5.i()) {
                        b2 = a5.h();
                        break;
                    }
                    arqz arqz2 = arqz;
                    i = j2;
                    boolean z3 = z2;
                }
                long j4 = c2;
                arrn.a(b2, s3, c2, a4, j);
                try {
                    arqz.c(j4);
                    int d2 = arst.d(b3);
                    boolean a6 = arsr.a(aqek2, d2);
                    int i6 = 0;
                    while (i6 < d2) {
                        z = z2;
                        try {
                            long a7 = arst.a(b3, i6);
                            int b5 = arst.b(b3, i6);
                            i = j2;
                            try {
                                byte round = (byte) ((int) Math.round(arst.c(b3, i6)));
                                aqek aqek5 = aqek2;
                                byte round2 = (byte) ((int) Math.round((arst.d(b3, i6) / 0.01d) - 0.03125d));
                                if (a6) {
                                    aqek3 = aqek5;
                                    if (arsr.b(aqek3, i6)) {
                                        s2 = a(arsr.c(aqek3, i6));
                                        this.d.a(c(a7), b2, b5, round, round2, s2);
                                        i6++;
                                        z2 = z;
                                        j2 = i;
                                    }
                                } else {
                                    aqek3 = aqek5;
                                }
                                s2 = s;
                                this.d.a(c(a7), b2, b5, round, round2, s2);
                                i6++;
                                z2 = z;
                                j2 = i;
                            } catch (IllegalStateException e3) {
                                this.c.s.c();
                                this.c.d();
                                i5++;
                                z2 = z;
                                j2 = i;
                                i2 = 1;
                                i4 = 3;
                            } catch (IllegalArgumentException e4) {
                                this.c.s.b();
                                this.c.d();
                                i5++;
                                z2 = z;
                                j2 = i;
                                i2 = 1;
                                i4 = 3;
                            } catch (IndexOutOfBoundsException e5) {
                                this.c.s.d();
                                this.c.d();
                                i5++;
                                z2 = z;
                                j2 = i;
                                i2 = 1;
                                i4 = 3;
                            }
                        } catch (IllegalStateException e6) {
                            i = j2;
                            this.c.s.c();
                            this.c.d();
                            i5++;
                            z2 = z;
                            j2 = i;
                            i2 = 1;
                            i4 = 3;
                        } catch (IllegalArgumentException e7) {
                            i = j2;
                            this.c.s.b();
                            this.c.d();
                            i5++;
                            z2 = z;
                            j2 = i;
                            i2 = 1;
                            i4 = 3;
                        } catch (IndexOutOfBoundsException e8) {
                            i = j2;
                            this.c.s.d();
                            this.c.d();
                            i5++;
                            z2 = z;
                            j2 = i;
                            i2 = 1;
                            i4 = 3;
                        }
                    }
                    i = j2;
                    z = z2;
                    this.c.c();
                } catch (IllegalStateException e9) {
                    i = j2;
                    z = z2;
                    this.c.s.c();
                    this.c.d();
                    i5++;
                    z2 = z;
                    j2 = i;
                    i2 = 1;
                    i4 = 3;
                } catch (IllegalArgumentException e10) {
                    i = j2;
                    z = z2;
                    this.c.s.b();
                    this.c.d();
                    i5++;
                    z2 = z;
                    j2 = i;
                    i2 = 1;
                    i4 = 3;
                } catch (IndexOutOfBoundsException e11) {
                    i = j2;
                    z = z2;
                    this.c.s.d();
                    this.c.d();
                    i5++;
                    z2 = z;
                    j2 = i;
                    i2 = 1;
                    i4 = 3;
                }
            } catch (IllegalStateException e12) {
                arqz arqz3 = arqz;
                i = j2;
                z = z2;
                this.c.s.c();
                this.c.d();
                i5++;
                z2 = z;
                j2 = i;
                i2 = 1;
                i4 = 3;
            } catch (IllegalArgumentException e13) {
                arqz arqz4 = arqz;
                i = j2;
                z = z2;
                this.c.s.b();
                this.c.d();
                i5++;
                z2 = z;
                j2 = i;
                i2 = 1;
                i4 = 3;
            } catch (IndexOutOfBoundsException e14) {
                arqz arqz5 = arqz;
                i = j2;
                z = z2;
                this.c.s.d();
                this.c.d();
                i5++;
                z2 = z;
                j2 = i;
                i2 = 1;
                i4 = 3;
            }
            i5++;
            z2 = z;
            j2 = i;
            i2 = 1;
            i4 = 3;
        }
        int i7 = j2;
        arfz a8 = this.n.iterator();
        while (a8.hasNext()) {
            Long l = (Long) a8.next();
            if (this.d.a(c(l.longValue()), false) == -1) {
                short s4 = this.b;
                if (s4 == 0) {
                    arrn arrn2 = this.f;
                    short s5 = arrn2.a;
                    s4 = s5 == 0 ? arrn2.b() : s5;
                }
                this.e.a(e(l.longValue()), s4);
            }
        }
        int i8 = this.r + 1;
        this.r = i8;
        if (i7 > 0 || i8 > 10) {
            d();
        }
    }

    public final void d() {
        if (this.j) {
            ByteBuffer allocate = ByteBuffer.allocate(this.d.h() + this.e.h() + this.f.h());
            this.d.c(allocate);
            this.e.c(allocate);
            this.f.c(allocate);
            this.c.d.f().execute(new arsl(this, allocate));
            this.r = 0;
        }
    }

    public final boolean e() {
        return !this.g.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set a(defpackage.arsy r41, defpackage.arrc r42) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r41.a()
            r7 = 0
        L_0x0018:
            if (r7 >= r5) goto L_0x01b0
            long r13 = r1.a((int) r7)
            int r15 = r1.b(r7)
            int r23 = r1.c(r7)
            float r24 = r1.d(r7)
            float r22 = r1.e(r7)
            long r25 = r0.c(r13)
            float r8 = (float) r15
            arqa r9 = r0.d
            long r10 = r0.c(r13)
            r12 = 1
            int r9 = r9.a((long) r10, (boolean) r12)
            r11 = -1
            if (r9 == r11) goto L_0x00e0
            arqa r6 = r0.d
            arhg r6 = r6.d
            arqj r6 = (defpackage.arqj) r6
            short r6 = r6.b((int) r9)
            arrn r10 = r0.f
            arhg r10 = r10.d
            arri r10 = (defpackage.arri) r10
            int r10 = r10.a((short) r6, (boolean) r12)
            if (r10 == r11) goto L_0x00cf
            r0.b = r6
            arrn r6 = r0.f
            long[] r6 = r6.e
            r17 = r13
            r12 = r6[r10]
            arqa r6 = r0.d
            int[] r6 = r6.a
            r6 = r6[r9]
            long r12 = defpackage.arst.a((long) r12, (int) r6)
            arqa r6 = r0.d
            byte[] r14 = r6.b
            byte r14 = r14[r9]
            r19 = r15
            double r14 = (double) r14
            byte[] r11 = r6.e
            byte r11 = r11[r9]
            r27 = r4
            r28 = r5
            double r4 = (double) r11
            r20 = 4638707616191610880(0x4060000000000000, double:128.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 + r20
            r20 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r4 = r4 * r20
            arrn r11 = r0.f
            int[] r11 = r11.f
            r10 = r11[r10]
            short[] r6 = r6.f
            short r6 = r6[r9]
            r9 = 2147483647(0x7fffffff, float:NaN)
            r11 = -8388608(0xffffffffff800000, float:-Infinity)
            if (r10 == r9) goto L_0x00ae
            short r9 = s
            if (r9 == r6) goto L_0x00ae
            if (r9 == r6) goto L_0x00a7
            r9 = 32768(0x8000, float:4.5918E-41)
            int r6 = r6 + r9
            goto L_0x00a8
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            int r10 = r10 + r6
            float r6 = (float) r10
            r9 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 / r9
            goto L_0x00b0
        L_0x00ae:
            r6 = -8388608(0xffffffffff800000, float:-Infinity)
        L_0x00b0:
            arpu r29 = new arpu
            double r9 = (double) r8
            r8 = r29
            r20 = r9
            r9 = r17
            r1 = 1
            r11 = r12
            r30 = r17
            r13 = r14
            r32 = r19
            r15 = r4
            r17 = r6
            r18 = r20
            r20 = r23
            r21 = r24
            r8.<init>(r9, r11, r13, r15, r17, r18, r20, r21, r22)
            r10 = r29
            goto L_0x00ea
        L_0x00cf:
            r27 = r4
            r28 = r5
            r30 = r13
            r32 = r15
            r1 = 1
            java.lang.Short r4 = java.lang.Short.valueOf(r6)
            r3.add(r4)
            goto L_0x00e9
        L_0x00e0:
            r27 = r4
            r28 = r5
            r30 = r13
            r32 = r15
            r1 = 1
        L_0x00e9:
            r10 = 0
        L_0x00ea:
            if (r10 == 0) goto L_0x015e
            java.lang.Long r1 = java.lang.Long.valueOf(r25)
            boolean r4 = r2.containsKey(r1)
            if (r4 == 0) goto L_0x0158
            float r4 = r10.f
            java.lang.Object r5 = r2.get(r1)
            arpu r5 = (defpackage.arpu) r5
            float r5 = r5.f
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0131
            java.lang.Object r4 = r2.get(r1)
            arpu r4 = (defpackage.arpu) r4
            long r12 = r4.a
            float r5 = r4.f
            int r14 = (int) r5
            r15 = 9
            long r5 = r4.b
            float r8 = r4.e
            int r9 = r4.g
            float r11 = r4.h
            arqq r4 = r4.l
            r20 = r11
            r11 = r42
            r16 = r5
            r18 = r8
            r19 = r9
            r21 = r4
            r11.a(r12, r14, r15, r16, r18, r19, r20, r21)
            r2.put(r1, r10)
            r5 = r27
            goto L_0x01a7
        L_0x0131:
            long r4 = r10.a
            float r1 = r10.f
            int r1 = (int) r1
            r33 = 9
            long r8 = r10.b
            float r6 = r10.e
            int r11 = r10.g
            float r12 = r10.h
            arqq r10 = r10.l
            r29 = r42
            r30 = r4
            r32 = r1
            r34 = r8
            r36 = r6
            r37 = r11
            r38 = r12
            r39 = r10
            r29.a(r30, r32, r33, r34, r36, r37, r38, r39)
            r5 = r27
            goto L_0x01a7
        L_0x0158:
            r2.put(r1, r10)
            r5 = r27
            goto L_0x01a7
        L_0x015e:
            argb r4 = r0.g
            r5 = r30
            boolean r1 = r4.a((long) r5, (boolean) r1)
            if (r1 == 0) goto L_0x017e
            r12 = 2
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r42
            r9 = r5
            r11 = r32
            r16 = r23
            r17 = r24
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            r5 = r27
            goto L_0x01a7
        L_0x017e:
            boolean r1 = r0.b((long) r5)
            if (r1 == 0) goto L_0x019a
            r12 = 3
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r42
            r9 = r5
            r11 = r32
            r16 = r23
            r17 = r24
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            r5 = r27
            goto L_0x01a7
        L_0x019a:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = r27
            r5.put(r1, r4)
        L_0x01a7:
            int r7 = r7 + 1
            r1 = r41
            r4 = r5
            r5 = r28
            goto L_0x0018
        L_0x01b0:
            r5 = r4
            int r1 = r2.size()
            int r4 = r0.o
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x01bf:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0212
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.Object r6 = r6.getValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r41
            int r11 = r7.b(r6)
            int r16 = r7.c(r6)
            float r17 = r7.d(r6)
            r7.e(r6)
            if (r1 > r4) goto L_0x0204
            argb r6 = r0.g
            r6.a((long) r9)
            r12 = 4
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r42
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            goto L_0x01bf
        L_0x0204:
            r12 = 8
            r13 = 0
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 0
            r8 = r42
            r8.a(r9, r11, r12, r13, r15, r16, r17, r18)
            goto L_0x01bf
        L_0x0212:
            r0.a((java.util.Set) r3)
            arqa r1 = r0.d
            int r1 = r1.size()
            double r3 = (double) r1
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            arqa r1 = r0.d
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
            arrn r1 = r0.f
            int r1 = r1.size()
            double r3 = (double) r1
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            arrn r1 = r0.f
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arsm.a(arsy, arrc):java.util.Set");
    }

    public final void a() {
        super.b();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.n.clear();
        this.g.clear();
    }

    public final void a(long j) {
        HashSet hashSet = new HashSet();
        arrk a2 = this.f.entrySet().iterator();
        while (a2.hasNext()) {
            a2.f();
            if (a2.j() < j) {
                hashSet.add(Short.valueOf(a2.h()));
                a2.remove();
            }
        }
        a((Set) hashSet);
    }

    public final void b(aqek aqek) {
        arfz a2 = this.g.iterator();
        this.n.clear();
        while (a2.hasNext()) {
            a2.c();
            aqek.a(1, a2.a());
            this.n.a(a2.a());
        }
        this.n.size();
    }

    public final void a(aqek aqek) {
        if (aqek.i(78)) {
            this.o = aqek.b(78);
        }
        if (aqek.i(74)) {
            this.q = aqek.a(74);
        }
        if (aqek.i(73)) {
            this.p = aqek.a(73);
        }
    }

    public final boolean b(long j) {
        return this.e.a(e(j), true);
    }

    public final void a(aqek aqek, long j, arqz arqz) {
        b(aqek, j, arqz);
        arqz.d((long) this.g.size());
        this.g.clear();
    }

    public final void a(PrintWriter printWriter) {
        printWriter.print("frewleTileCacheManager{downloadqueue=[");
        arfz a2 = this.g.iterator();
        while (a2.hasNext()) {
            printWriter.printf("%012X, ", new Object[]{(Long) a2.next()});
        }
        printWriter.print("]; numMacsInCache=");
        printWriter.print(this.d.size());
        printWriter.print("; numUninformativeMacAddresses=");
        printWriter.print(this.e.size());
        printWriter.print("; nibbleModel=");
        printWriter.print(this.p ? 1 : 0);
        printWriter.print("; nibbleUninform=");
        printWriter.print(this.q ? 1 : 0);
        printWriter.print("; tilesInCache=[");
        arrk a3 = this.f.entrySet().iterator();
        while (a3.hasNext()) {
            a3.f();
            printWriter.printf("0x%016x, ", new Object[]{Long.valueOf(a3.i())});
        }
        printWriter.println("]}");
    }

    /* access modifiers changed from: package-private */
    public final void a(Set set) {
        if (!set.isEmpty()) {
            arpx a2 = this.d.entrySet().iterator();
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
        }
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr) {
        arqj arqj;
        arqa arqa;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        try {
            arqa = new arqa();
            arhd.a(arqa, arqj.a(wrap, arqa.c), wrap);
            try {
                arqj = arqj.d(wrap);
                try {
                    arrn arrn = new arrn();
                    arhd.a(arrn, arri.a(wrap, arrn.c), wrap);
                    a(arqa, arqj, arrn);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e2) {
                    e = e2;
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        a(arqa, arqj, (arrn) null);
                        throw th;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e3) {
                e = e3;
                arqj = null;
                throw new IOException(e);
            } catch (Throwable th2) {
                th = th2;
                arqj = null;
                a(arqa, arqj, (arrn) null);
                throw th;
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e4) {
            e = e4;
            arqa = null;
            arqj = null;
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            arqa = null;
            arqj = null;
            a(arqa, arqj, (arrn) null);
            throw th;
        }
    }
}
