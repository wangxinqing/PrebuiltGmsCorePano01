package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzq extends bzi {
    private final Runnable f;
    private long g;
    private int h;
    private int i;
    private List j;
    private bza k;
    private atjl l;
    private final atlo m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzq(defpackage.atku r10, defpackage.atlo r11) {
        /*
            r9 = this;
            int r0 = r10.b
            int r0 = defpackage.atkt.a(r0)
            r1 = 1
            if (r0 == 0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            r2 = -1
            int r6 = r0 + -1
            atjs r7 = defpackage.atjs.LOCATION_FENCE
            if (r11 != 0) goto L_0x0019
            int[] r0 = new int[r1]
            r3 = 0
            r0[r3] = r1
            r8 = r0
            goto L_0x0020
        L_0x0019:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {1, 46} // fill-array
            r8 = r0
        L_0x0020:
            java.lang.Class<bzq> r4 = defpackage.bzq.class
            r3 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            bzp r10 = new bzp
            r10.<init>(r9)
            r9.f = r10
            r0 = -1
            r9.g = r0
            r9.h = r2
            r9.i = r2
            r9.m = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzq.<init>(atku, atlo):void");
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 10;
        }
        if (i2 != 2) {
            return i2 != 3 ? 100 : 90;
        }
        return 50;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (defpackage.bzi.a(r14, r13.g, m() - 1) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (defpackage.bzi.a(r14, r13.g, m() - 1) != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r14) {
        /*
            r13 = this;
            int r0 = r13.h
            r1 = -1
            if (r0 == r1) goto L_0x0089
            int r1 = r13.b
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0075
            r4 = 2
            r5 = -1
            if (r1 == r4) goto L_0x0055
            r4 = 3
            if (r1 == r4) goto L_0x0035
            jjg r14 = defpackage.bxk.a
            anie r14 = r14.c()
            anih r14 = (defpackage.anih) r14
            r15 = 420(0x1a4, float:5.89E-43)
            java.lang.String r0 = "bzq"
            java.lang.String r1 = "b"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r14 = r14.a((java.lang.String) r0, (java.lang.String) r1, (int) r15, (java.lang.String) r2)
            anih r14 = (defpackage.anih) r14
            int r15 = r13.b
            java.lang.String r0 = "[LocationFenceImpl] Unknown location fence trigger type = %s"
            r14.a((java.lang.String) r0, (int) r15)
            int r14 = r13.b()
            return r14
        L_0x0035:
            if (r0 != r2) goto L_0x004b
            int r0 = r13.i
            if (r0 != 0) goto L_0x004b
            long r9 = r13.g
            long r0 = r13.m()
            long r11 = r0 + r5
            r7 = r14
            boolean r14 = defpackage.bzi.a(r7, r9, r11)
            if (r14 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            long r14 = r13.m()
            int r14 = r13.a((boolean) r2, (long) r14)
            return r14
        L_0x0055:
            if (r0 != 0) goto L_0x006b
            int r0 = r13.i
            if (r0 != r2) goto L_0x006b
            long r9 = r13.g
            long r0 = r13.m()
            long r11 = r0 + r5
            r7 = r14
            boolean r14 = defpackage.bzi.a(r7, r9, r11)
            if (r14 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            long r14 = r13.m()
            int r14 = r13.a((boolean) r2, (long) r14)
            return r14
        L_0x0075:
            if (r0 != 0) goto L_0x0083
            long r0 = r13.g
            long r4 = r13.n()
            long r0 = r0 + r4
            int r4 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            int r14 = r13.a(r2)
            return r14
        L_0x0089:
            int r14 = r13.b()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzq.b(long):int");
    }

    public final bza h() {
        bza bza = this.k;
        return bza == null ? bza.a() : bza;
    }

    public final int j() {
        return ((atku) this.c).f;
    }

    public final double k() {
        return ((atku) this.c).g;
    }

    public final double l() {
        return ((atku) this.c).h;
    }

    public final long m() {
        return ((atku) this.c).d;
    }

    public final long n() {
        return ((atku) this.c).i;
    }

    private final void a(atuj atuj) {
        Object[] objArr = new Object[2];
        atui atui = atuj.a;
        if (atui == null) {
            atui = atui.c;
        }
        objArr[0] = Integer.valueOf(atui.a);
        atui atui2 = atuj.a;
        if (atui2 == null) {
            atui2 = atui.c;
        }
        objArr[1] = Integer.valueOf(atui2.b);
        int a = a(this.m.a);
        atul atul = atuj.b;
        if (atul == null) {
            atul = atul.d;
        }
        boolean z = false;
        for (int i2 = 0; i2 < atul.c.size(); i2++) {
            z |= (atul.c.c(i2) * atuj.c) / 100 >= a;
        }
        if (z) {
            this.j.add(atuj);
        }
        aucx aucx = atuj.d;
        int size = aucx.size();
        for (int i3 = 0; i3 < size; i3++) {
            a((atuj) aucx.get(i3));
        }
    }

    public final int a() {
        return ((atku) this.c).e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            atlo r3 = r0.m
            r5 = 2
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x022f
            bza r3 = defpackage.bza.a()
            r0.k = r3
            java.util.List r3 = r0.j
            boolean r3 = defpackage.jir.a((java.util.Collection) r3)
            if (r3 != 0) goto L_0x01fe
            java.lang.Object[] r3 = new java.lang.Object[r8]
            atlo r6 = r0.m
            long r9 = r6.b
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r3[r7] = r6
            atlo r3 = r0.m
            int r3 = r3.a
            int r3 = a((int) r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r9 = r0.j
            int r10 = r9.size()
            r13 = 0
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x003e:
            if (r13 >= r10) goto L_0x01a9
            java.lang.Object r16 = r9.get(r13)
            r11 = r16
            atuj r11 = (defpackage.atuj) r11
            java.lang.Object[] r12 = new java.lang.Object[r5]
            atui r4 = r11.a
            if (r4 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            atui r4 = defpackage.atui.c
        L_0x0051:
            int r4 = r4.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r7] = r4
            atui r4 = r11.a
            if (r4 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            atui r4 = defpackage.atui.c
        L_0x0060:
            int r4 = r4.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r8] = r4
            atul r4 = r11.b
            if (r4 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            atul r4 = defpackage.atul.d
        L_0x006f:
            int r12 = r4.a
            int r12 = r12 * 60
            r17 = r6
            long r5 = (long) r12
            r18 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r18
            int r12 = r4.b
            int r12 = r12 * 60
            r20 = r9
            long r8 = (long) r12
            long r8 = r8 * r18
            bza r12 = defpackage.bza.a()
        L_0x0087:
            r19 = r10
            aucs r10 = r4.c
            int r10 = r10.size()
            if (r7 >= r10) goto L_0x011b
            r10 = r13
            r21 = r14
            long r13 = (long) r7
            long r13 = r13 * r8
            long r13 = r13 + r5
            int r15 = r7 + 1
            r23 = r12
            r24 = r13
            long r12 = (long) r15
            long r12 = r12 * r8
            long r12 = r12 + r5
            aucs r14 = r4.c
            int r7 = r14.c(r7)
            int r14 = r11.c
            int r7 = r7 * r14
            int r7 = r7 / 100
            if (r7 >= r3) goto L_0x00bb
            r26 = r3
            r27 = r4
            r28 = r5
            r4 = r23
            r5 = r24
            goto L_0x00ea
        L_0x00bb:
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e0
            atlo r7 = r0.m
            r26 = r3
            r27 = r4
            long r3 = r7.b
            long r3 = r3 + r1
            int r7 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x00e4
            long r3 = java.lang.Math.min(r12, r3)
            r28 = r5
            r5 = r24
            bzc r3 = defpackage.bzc.a(r5, r3)
            r4 = r23
            java.util.TreeSet r7 = r4.a
            defpackage.bza.b(r3, r7)
            goto L_0x00ea
        L_0x00e0:
            r26 = r3
            r27 = r4
        L_0x00e4:
            r28 = r5
            r4 = r23
            r5 = r24
        L_0x00ea:
            atlo r3 = r0.m
            r23 = r8
            long r7 = r3.b
            long r7 = r7 + r1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fe
            long r13 = r5 - r7
            r5 = r21
            long r5 = java.lang.Math.min(r5, r13)
            goto L_0x010b
        L_0x00fe:
            r5 = r21
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x010a
            long r12 = r12 - r1
            long r5 = java.lang.Math.min(r5, r12)
            goto L_0x010b
        L_0x010a:
        L_0x010b:
            r12 = r4
            r13 = r10
            r7 = r15
            r10 = r19
            r8 = r23
            r3 = r26
            r4 = r27
            r14 = r5
            r5 = r28
            goto L_0x0087
        L_0x011b:
            r26 = r3
            r4 = r12
            r10 = r13
            r5 = r14
            boolean r3 = r4.d()
            if (r3 != 0) goto L_0x0198
            atus r3 = defpackage.atus.i
            aucd r3 = r3.o()
            atui r7 = r11.a
            if (r7 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            atui r7 = defpackage.atui.c
        L_0x0133:
            int r7 = r7.a
            boolean r8 = r3.c
            if (r8 != 0) goto L_0x013a
            goto L_0x0140
        L_0x013a:
            r3.c()
            r8 = 0
            r3.c = r8
        L_0x0140:
            aucj r8 = r3.b
            atus r8 = (defpackage.atus) r8
            int r9 = r8.a
            r12 = 1
            r9 = r9 | r12
            r8.a = r9
            r8.b = r7
            atui r7 = r11.a
            if (r7 == 0) goto L_0x0151
            goto L_0x0153
        L_0x0151:
            atui r7 = defpackage.atui.c
        L_0x0153:
            int r7 = r7.b
            boolean r8 = r3.c
            if (r8 != 0) goto L_0x015a
            goto L_0x0160
        L_0x015a:
            r3.c()
            r8 = 0
            r3.c = r8
        L_0x0160:
            aucj r8 = r3.b
            atus r8 = (defpackage.atus) r8
            int r9 = r8.a
            r11 = 2
            r9 = r9 | r11
            r8.a = r9
            r8.c = r7
            aucj r3 = r3.i()
            atus r3 = (defpackage.atus) r3
            android.util.Pair r7 = new android.util.Pair
            jti r8 = new jti
            r9 = 3
            r11 = 1
            r8.<init>(r9, r11, r11)
            jut r9 = defpackage.jut.a(r31)
            r8.a((defpackage.jut) r9)
            auci r9 = defpackage.atus.j
            r8.a(r9, r3)
            com.google.android.gms.contextmanager.ContextData r3 = r8.a()
            atjl r3 = r3.c()
            r7.<init>(r3, r4)
            r3 = r17
            r3.add(r7)
            goto L_0x019a
        L_0x0198:
            r3 = r17
        L_0x019a:
            int r13 = r10 + 1
            r14 = r5
            r10 = r19
            r9 = r20
            r5 = 2
            r7 = 0
            r8 = 1
            r6 = r3
            r3 = r26
            goto L_0x003e
        L_0x01a9:
            r3 = r6
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01c3
            bwn r4 = defpackage.cbi.k()
            java.lang.Runnable r5 = r0.f
            java.lang.String r6 = "LocationFenceImpl#fenceEvalOp"
            bvp r6 = defpackage.bvq.a(r6)
            r4.a(r5, r14, r6)
            goto L_0x01cc
        L_0x01c3:
            bwn r4 = defpackage.cbi.k()
            java.lang.Runnable r5 = r0.f
            r4.a((java.lang.Runnable) r5)
        L_0x01cc:
            int r4 = r3.size()
            r8 = 0
        L_0x01d1:
            if (r8 >= r4) goto L_0x01fe
            java.lang.Object r5 = r3.get(r8)
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            atjl r6 = (defpackage.atjl) r6
            r0.b((defpackage.atjl) r6)
            int r6 = r0.h
            if (r6 != 0) goto L_0x01fa
            bza r6 = r0.k
            java.lang.Object r5 = r5.second
            bza r5 = (defpackage.bza) r5
            r6.a((defpackage.bza) r5)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            bza r5 = r0.k
            java.lang.String r5 = r5.toString()
            r7 = 0
            r6[r7] = r5
            goto L_0x01fb
        L_0x01fa:
            r7 = 0
        L_0x01fb:
            int r8 = r8 + 1
            goto L_0x01d1
        L_0x01fe:
            atjl r3 = r0.l
            if (r3 == 0) goto L_0x0219
            r0.b((defpackage.atjl) r3)
            int r3 = r0.h
            if (r3 != 0) goto L_0x0219
            bzc r1 = defpackage.bzc.a(r1, r1)
            bza r2 = r0.k
            java.util.TreeSet r2 = r2.a
            defpackage.bza.b(r1, r2)
            r1 = 2
            r0.e = r1
            r5 = 2
            goto L_0x022e
        L_0x0219:
            java.util.List r1 = r0.j
            if (r1 == 0) goto L_0x022a
            bza r1 = r0.k
            boolean r1 = r1.d()
            r2 = 1
            r1 = r1 ^ r2
            int r5 = r0.a(r1)
            goto L_0x022e
        L_0x022a:
            int r5 = r30.b()
        L_0x022e:
            return r5
        L_0x022f:
            int r3 = r0.h
            r4 = -1
            if (r3 != r4) goto L_0x023a
            int r1 = r30.b()
            goto L_0x02c2
        L_0x023a:
            int r4 = r0.b
            r5 = 1
            if (r4 == r5) goto L_0x02ad
            r5 = -1
            r8 = 2
            if (r4 == r8) goto L_0x028b
            r8 = 3
            if (r4 == r8) goto L_0x0269
            jjg r1 = defpackage.bxk.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 420(0x1a4, float:5.89E-43)
            java.lang.String r3 = "bzq"
            java.lang.String r4 = "b"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r1.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)
            anih r1 = (defpackage.anih) r1
            int r2 = r0.b
            java.lang.String r3 = "[LocationFenceImpl] Unknown location fence trigger type = %s"
            r1.a((java.lang.String) r3, (int) r2)
            int r1 = r30.b()
            goto L_0x02c2
        L_0x0269:
            r4 = 1
            if (r3 != r4) goto L_0x0281
            int r3 = r0.i
            if (r3 != 0) goto L_0x0281
            long r3 = r0.g
            long r8 = r30.m()
            long r5 = r5 + r8
            r1 = r31
            boolean r1 = defpackage.bzi.a(r1, r3, r5)
            if (r1 == 0) goto L_0x0281
            r7 = 1
            goto L_0x0282
        L_0x0281:
        L_0x0282:
            long r1 = r30.m()
            int r1 = r0.a((boolean) r7, (long) r1)
            goto L_0x02c2
        L_0x028b:
            if (r3 != 0) goto L_0x02a3
            int r3 = r0.i
            r8 = 1
            if (r3 != r8) goto L_0x02a3
            long r3 = r0.g
            long r9 = r30.m()
            long r5 = r5 + r9
            r1 = r31
            boolean r1 = defpackage.bzi.a(r1, r3, r5)
            if (r1 == 0) goto L_0x02a3
            r7 = 1
            goto L_0x02a4
        L_0x02a3:
        L_0x02a4:
            long r1 = r30.m()
            int r1 = r0.a((boolean) r7, (long) r1)
            goto L_0x02c2
        L_0x02ad:
            r8 = 1
            if (r3 != 0) goto L_0x02bd
            long r3 = r0.g
            long r5 = r30.n()
            long r3 = r3 + r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x02bd
            r7 = 1
            goto L_0x02be
        L_0x02bd:
        L_0x02be:
            int r1 = r0.a(r7)
        L_0x02c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzq.a(long):int");
    }

    public final void b(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.USER_LOCATION) {
            atjm atjm = atjl.h;
            if (atjm == null) {
                atjm = atjm.a;
            }
            auci auci = atus.j;
            atjm.a(auci);
            if (atjm.m.a(auci.d)) {
                atjm atjm2 = atjl.h;
                if (atjm2 == null) {
                    atjm2 = atjm.a;
                }
                auci auci2 = atus.j;
                atjm2.a(auci2);
                Object b = atjm2.m.b(auci2.d);
                if (b == null) {
                    b = auci2.b;
                } else {
                    auci2.a(b);
                }
                atus atus = (atus) b;
                double a2 = aell.a(a(), j(), atus.b, atus.c);
                int i2 = this.h;
                this.i = i2;
                if (i2 == -1) {
                    if (a2 <= (k() + l()) * 0.5d) {
                        this.h = 0;
                    } else {
                        this.h = 1;
                    }
                    atmb atmb = atjl.g;
                    if (atmb == null) {
                        atmb = atmb.e;
                    }
                    this.g = atmb.c;
                } else if (i2 != 0) {
                    int i3 = this.b;
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        ((anih) ((anih) bxk.a.c()).a("bzq", "b", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[LocationFenceImpl] Unknown location fence trigger type = %s", this.b);
                    } else if (a2 < l()) {
                        this.h = 0;
                        atmb atmb2 = atjl.g;
                        if (atmb2 == null) {
                            atmb2 = atmb.e;
                        }
                        this.g = atmb2.c;
                    }
                } else {
                    int i4 = this.b;
                    if (i4 != 1 && i4 != 2 && i4 != 3) {
                        ((anih) ((anih) bxk.a.c()).a("bzq", "b", 196, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[LocationFenceImpl] Unknown location fence trigger type = %s", this.b);
                    } else if (a2 > k()) {
                        this.h = 1;
                        atmb atmb3 = atjl.g;
                        if (atmb3 == null) {
                            atmb3 = atmb.e;
                        }
                        this.g = atmb3.c;
                    }
                }
                if (n() == 0) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(n());
                    atmb atmb4 = atjl.g;
                    if (atmb4 == null) {
                        atmb4 = atmb.e;
                    }
                    objArr[1] = Long.valueOf((atmb4.c + n()) - cbi.i().a());
                }
                if (this.b == 1 && n() > 0 && this.i != 0 && this.h == 0) {
                    cbi.E().a(n(), this.d);
                    return;
                }
                return;
            }
            ((anih) ((anih) bxk.a.c()).a("bzq", "b", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[LocationFenceImpl] No UserLocation data.");
        }
    }

    public final void a(atjl atjl) {
        if (this.m != null) {
            atjv a = atjv.a(atjl.e);
            if (a == null) {
                a = atjv.UNKNOWN_CONTEXT_NAME;
            }
            if (a != atjv.DESTINATION_PREDICTION) {
                atjv a2 = atjv.a(atjl.e);
                if (a2 == null) {
                    a2 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                if (a2 == atjv.USER_LOCATION) {
                    this.l = atjl;
                    return;
                }
                return;
            }
            atuk a3 = cdi.a(atjl);
            if (a3 != null && a3.a.size() != 0) {
                new Object[1][0] = Integer.valueOf(a3.a.size());
                this.j = new ArrayList();
                aucx aucx = a3.a;
                int size = aucx.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a((atuj) aucx.get(i2));
                }
                return;
            }
            return;
        }
        b(atjl);
    }
}
