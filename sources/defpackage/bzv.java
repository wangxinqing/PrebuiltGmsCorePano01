package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: bzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzv extends bzi {
    private static final int[] i = {18};
    private static final int[] j = {18, 7, 1};
    public int f;
    public int g;
    public long h;
    private atjl k;
    private atus l;
    private final ccr m;
    private final long n;
    private List o;
    private List p;
    private ContextData q;
    private boolean r;
    private final ArrayList s;
    private String t;
    private long u;
    private boolean v;
    private atpn w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzv(defpackage.atlj r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atli.a(r0)
            if (r0 == 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            java.lang.Class<bzv> r2 = defpackage.bzv.class
            r7 = -1
            int r4 = r0 + -1
            atjs r5 = defpackage.atjs.PLACE_FENCE
            r0 = 0
            int[] r6 = new int[r0]
            r1 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 0
            r8.k = r1
            r8.l = r1
            r8.o = r1
            r8.p = r1
            r8.q = r1
            atpn r2 = defpackage.atpn.UNKNOWN
            r8.w = r2
            r2 = -1
            r8.h = r2
            r8.g = r7
            r8.f = r7
            r8.r = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.s = r2
            r8.t = r1
            r2 = 0
            r8.u = r2
            r8.v = r0
            atpn r0 = defpackage.atpn.UNKNOWN
            r8.w = r0
            int r9 = r9.a
            int r9 = defpackage.atli.a(r9)
            if (r9 != 0) goto L_0x004e
        L_0x004d:
            goto L_0x0067
        L_0x004e:
            r0 = 6
            if (r9 != r0) goto L_0x004d
            ccr r9 = new ccr
            attp r0 = defpackage.awvf.b()
            r9.<init>(r0)
            r8.m = r9
            jiq r9 = defpackage.cbi.i()
            long r0 = r9.a()
            r8.n = r0
            return
        L_0x0067:
            r8.m = r1
            r8.n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzv.<init>(atlj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b2, code lost:
        if (defpackage.bzi.a(r12, r2, l()) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d0, code lost:
        if (defpackage.bzi.a(r12, r2, l()) != false) goto L_0x01d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r12) {
        /*
            r11 = this;
            long r2 = r11.h
            r0 = 5
            r1 = 2
            r4 = 3
            r6 = 1
            r7 = -1
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x000d
            goto L_0x0019
        L_0x000d:
            int r5 = r11.b
            if (r5 != r1) goto L_0x0013
            goto L_0x01f1
        L_0x0013:
            if (r5 == r4) goto L_0x01f1
            if (r5 == r6) goto L_0x01f1
            if (r5 == r0) goto L_0x01f1
        L_0x0019:
            int r5 = r11.b
            r7 = 0
            if (r5 == r6) goto L_0x01dd
            if (r5 == r1) goto L_0x01bf
            if (r5 == r4) goto L_0x01a1
            r12 = 4
            if (r5 == r12) goto L_0x00ca
            if (r5 == r0) goto L_0x0049
            jjg r12 = defpackage.bxk.a
            anie r12 = r12.c()
            anih r12 = (defpackage.anih) r12
            r13 = 455(0x1c7, float:6.38E-43)
            java.lang.String r0 = "bzv"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)
            anih r12 = (defpackage.anih) r12
            int r13 = r11.b
            java.lang.String r0 = "[PlaceFenceImpl] Unknown places fence type = %s"
            r12.a((java.lang.String) r0, (int) r13)
            int r12 = r11.b()
            return r12
        L_0x0049:
            java.util.List r12 = r11.o
            if (r12 == 0) goto L_0x0052
            int r12 = r12.size()
            goto L_0x0053
        L_0x0052:
            r12 = 0
        L_0x0053:
            java.util.List r13 = r11.p
            if (r13 == 0) goto L_0x005c
            int r13 = r13.size()
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            if (r12 == r13) goto L_0x0061
            r7 = 1
            goto L_0x0094
        L_0x0061:
            if (r12 == 0) goto L_0x0093
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r12)
            r1 = 0
        L_0x0069:
            if (r1 >= r12) goto L_0x007b
            java.util.List r2 = r11.o
            java.lang.Object r2 = r2.get(r1)
            atts r2 = (defpackage.atts) r2
            java.lang.String r2 = r2.d
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0069
        L_0x007b:
            r12 = 0
        L_0x007c:
            if (r12 >= r13) goto L_0x0093
            java.util.List r1 = r11.p
            java.lang.Object r1 = r1.get(r12)
            atts r1 = (defpackage.atts) r1
            java.lang.String r1 = r1.d
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0091
            int r12 = r12 + 1
            goto L_0x007c
        L_0x0091:
            r7 = 1
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            if (r7 == 0) goto L_0x00c5
            attu r12 = defpackage.attu.b
            aucd r12 = r12.o()
            attt r12 = (defpackage.attt) r12
            java.util.List r13 = r11.o
            r12.a(r13)
            aucj r12 = r12.i()
            attu r12 = (defpackage.attu) r12
            jti r13 = new jti
            r0 = 7
            r1 = 60
            r13.<init>(r0, r1, r6)
            auci r0 = defpackage.attu.c
            r13.a(r0, r12)
            long r0 = r11.h
            jut r12 = defpackage.jut.b(r0)
            r13.a((defpackage.jut) r12)
            com.google.android.gms.contextmanager.ContextData r12 = r13.a()
            r11.q = r12
        L_0x00c5:
            int r12 = r11.a(r7)
            return r12
        L_0x00ca:
            atpn r12 = defpackage.atpn.UNKNOWN
            boolean r12 = r11.r
            if (r12 != 0) goto L_0x00d4
            atpn r12 = defpackage.atpn.SCREEN_IS_OFF
            r13 = 2
            goto L_0x0130
        L_0x00d4:
            java.util.ArrayList r12 = r11.s
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x010e
            java.util.ArrayList r12 = r11.s
            int r13 = r12.size()
            int r13 = r13 + -1
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r0 = r11.t
            r13[r7] = r0
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r7] = r12
            if (r12 != 0) goto L_0x00fa
            atpn r12 = defpackage.atpn.NULL_PLACE_INFERENCE
            r13 = 3
            goto L_0x0130
        L_0x00fa:
            boolean r12 = android.text.TextUtils.equals(r12, r0)
            if (r12 != 0) goto L_0x0102
            r12 = 2
            goto L_0x0103
        L_0x0102:
            r12 = 3
        L_0x0103:
            if (r12 != r4) goto L_0x0108
            atpn r13 = defpackage.atpn.PLACES_DID_CHANGE
            goto L_0x010a
        L_0x0108:
            atpn r13 = defpackage.atpn.SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS
        L_0x010a:
            r10 = r13
            r13 = r12
            r12 = r10
            goto L_0x0130
        L_0x010e:
            long r12 = r11.u
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x012d
            jiq r12 = defpackage.cbi.i()
            long r12 = r12.a()
            long r2 = r11.u
            long r8 = defpackage.awuz.y()
            long r2 = r2 + r8
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            atpn r12 = defpackage.atpn.NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD
            r13 = 3
            goto L_0x0130
        L_0x012d:
            atpn r12 = defpackage.atpn.EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD
            r13 = 2
        L_0x0130:
            boolean r0 = r11.v
            if (r0 == 0) goto L_0x0135
            goto L_0x0139
        L_0x0135:
            atpn r0 = r11.w
            if (r12 == r0) goto L_0x019c
        L_0x0139:
            btx r0 = defpackage.cbi.G()
            atpo r2 = defpackage.bzu.a((int) r13, (defpackage.atpn) r12)
            if (r2 == 0) goto L_0x0198
            atjs r3 = defpackage.atjs.PLACE_FENCE
            aucd r3 = defpackage.btx.a((int) r4, (defpackage.atjs) r3)
            atpg r4 = defpackage.atpg.d
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0154
            goto L_0x0159
        L_0x0154:
            r4.c()
            r4.c = r7
        L_0x0159:
            aucj r5 = r4.b
            atpg r5 = (defpackage.atpg) r5
            int r8 = r13 + -1
            r5.b = r8
            int r8 = r5.a
            r6 = r6 | r8
            r5.a = r6
            r2.getClass()
            r5.c = r2
            r1 = r1 | r6
            r5.a = r1
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r3.c()
            r3.c = r7
        L_0x0178:
            aucj r1 = r3.b
            atpj r1 = (defpackage.atpj) r1
            aucj r2 = r4.i()
            atpg r2 = (defpackage.atpg) r2
            atpj r4 = defpackage.atpj.g
            r2.getClass()
            r1.f = r2
            int r2 = r1.a
            r2 = r2 | 16
            r1.a = r2
            aucj r1 = r3.i()
            atpj r1 = (defpackage.atpj) r1
            r0.a((defpackage.atpj) r1)
        L_0x0198:
            r11.w = r12
            r11.v = r7
        L_0x019c:
            int r13 = r13 + -1
            r11.e = r13
            return r13
        L_0x01a1:
            int r0 = r11.f
            if (r0 != 0) goto L_0x01b5
            int r0 = r11.g
            if (r0 != r6) goto L_0x01b5
            long r4 = r11.l()
            r0 = r12
            boolean r12 = defpackage.bzi.a(r0, r2, r4)
            if (r12 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            r6 = 0
        L_0x01b6:
            long r12 = r11.l()
            int r12 = r11.a((boolean) r6, (long) r12)
            return r12
        L_0x01bf:
            int r0 = r11.f
            if (r0 != r6) goto L_0x01d3
            int r0 = r11.g
            if (r0 != 0) goto L_0x01d3
            long r4 = r11.l()
            r0 = r12
            boolean r12 = defpackage.bzi.a(r0, r2, r4)
            if (r12 == 0) goto L_0x01d3
            goto L_0x01d4
        L_0x01d3:
            r6 = 0
        L_0x01d4:
            long r12 = r11.l()
            int r12 = r11.a((boolean) r6, (long) r12)
            return r12
        L_0x01dd:
            int r0 = r11.f
            if (r0 != r6) goto L_0x01eb
            long r0 = r11.m()
            long r2 = r2 + r0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x01eb
            goto L_0x01ec
        L_0x01eb:
            r6 = 0
        L_0x01ec:
            int r12 = r11.a(r6)
            return r12
        L_0x01f1:
            int r12 = r11.b()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzv.a(long):int");
    }

    public final int[] g() {
        return this.b == 4 ? j : i;
    }

    public final List j() {
        return ((atlj) this.c).d;
    }

    public final List k() {
        return ((atlj) this.c).f;
    }

    public final long l() {
        return ((atlj) this.c).b;
    }

    public final long m() {
        return ((atlj) this.c).e;
    }

    public final String n() {
        return ((atlj) this.c).g;
    }

    public final List a() {
        return ((atlj) this.c).c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: atus} */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.atjl r14) {
        /*
            r13 = this;
            r0 = 1
            r13.v = r0
            int r1 = r14.e
            atjv r1 = defpackage.atjv.a(r1)
            if (r1 != 0) goto L_0x000d
            atjv r1 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x000d:
            atjv r2 = defpackage.atjv.USER_LOCATION
            if (r1 == r2) goto L_0x02ea
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "bzv"
            int r4 = r13.b
            r5 = 4
            r6 = 0
            r7 = 0
            if (r4 != r5) goto L_0x01d0
            int r4 = r14.e
            atjv r4 = defpackage.atjv.a(r4)
            if (r4 != 0) goto L_0x0028
            atjv r4 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x0028:
            atjv r8 = defpackage.atjv.SCREEN
            if (r4 == r8) goto L_0x002e
            goto L_0x01d0
        L_0x002e:
            atmb r4 = r14.g
            if (r4 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            atmb r4 = defpackage.atmb.e
        L_0x0035:
            int r4 = r4.b
            int r4 = defpackage.atma.a(r4)
            if (r4 == 0) goto L_0x01cf
            r5 = 2
            if (r4 != r5) goto L_0x01cf
            atjm r4 = r14.h
            if (r4 != 0) goto L_0x0046
            atjm r4 = defpackage.atjm.a
        L_0x0046:
            auci r8 = defpackage.atuf.d
            r4.a(r8)
            aubx r4 = r4.m
            auch r8 = r8.d
            boolean r4 = r4.a((defpackage.auch) r8)
            if (r4 == 0) goto L_0x01ba
            atjm r14 = r14.h
            if (r14 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            atjm r14 = defpackage.atjm.a
        L_0x005c:
            auci r1 = defpackage.atuf.d
            r14.a(r1)
            aubx r14 = r14.m
            auch r2 = r1.d
            java.lang.Object r14 = r14.b((defpackage.auch) r2)
            if (r14 != 0) goto L_0x006e
            java.lang.Object r14 = r1.b
            goto L_0x0071
        L_0x006e:
            r1.a(r14)
        L_0x0071:
            atuf r14 = (defpackage.atuf) r14
            int r14 = r14.b
            int r14 = defpackage.atue.a(r14)
            if (r14 != 0) goto L_0x007d
            goto L_0x0162
        L_0x007d:
            r1 = 3
            if (r14 != r1) goto L_0x0162
            r13.r = r0
            jiq r14 = defpackage.cbi.i()
            long r1 = r14.a()
            r13.u = r1
            java.util.ArrayList r14 = r13.s
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00ad
            r13.t = r6
            java.util.ArrayList r14 = r13.s
            int r1 = r14.size()
            r2 = 0
        L_0x009d:
            if (r2 < r1) goto L_0x00a0
            goto L_0x00af
        L_0x00a0:
            java.lang.Object r3 = r14.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            int r2 = r2 + 1
            if (r3 == 0) goto L_0x009d
            r13.t = r3
            goto L_0x00af
        L_0x00ad:
            r13.t = r6
        L_0x00af:
            java.util.ArrayList r14 = r13.s
            r14.clear()
            byd r14 = defpackage.cbi.E()
            long r1 = defpackage.awuz.y()
            bzm r3 = r13.d
            r14.a((long) r1, (defpackage.bzm) r3)
            atjl r14 = r13.k
            if (r14 == 0) goto L_0x00f0
            atjm r14 = r14.h
            if (r14 == 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            atjm r14 = defpackage.atjm.a
        L_0x00cc:
            auci r1 = defpackage.atus.j
            r14.a(r1)
            aubx r14 = r14.m
            auch r2 = r1.d
            java.lang.Object r14 = r14.b((defpackage.auch) r2)
            if (r14 != 0) goto L_0x00de
            java.lang.Object r14 = r1.b
            goto L_0x00e1
        L_0x00de:
            r1.a(r14)
        L_0x00e1:
            r6 = r14
            atus r6 = (defpackage.atus) r6
            atjl r14 = r13.k
            atmb r14 = r14.g
            if (r14 == 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            atmb r14 = defpackage.atmb.e
        L_0x00ed:
            long r1 = r14.c
            goto L_0x00f2
        L_0x00f0:
            r1 = -1
        L_0x00f2:
            if (r6 == 0) goto L_0x0108
            atus r14 = r13.l
            if (r14 == 0) goto L_0x0105
            int r3 = r14.b
            int r14 = r14.c
            int r4 = r6.b
            int r8 = r6.c
            double r3 = defpackage.aell.a((int) r3, (int) r14, (int) r4, (int) r8)
            goto L_0x010a
        L_0x0105:
            r3 = -4611686018427387904(0xc000000000000000, double:-2.0)
            goto L_0x010a
        L_0x0108:
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x010a:
            r13.l = r6
            btx r14 = defpackage.cbi.G()
            atjs r6 = defpackage.atjs.PLACE_FENCE
            aucd r5 = defpackage.btx.a((int) r5, (defpackage.atjs) r6)
            atpf r6 = defpackage.atpf.c
            aucd r6 = r6.o()
            atpl r1 = defpackage.bzu.a((long) r1, (double) r3)
            boolean r2 = r6.c
            if (r2 == 0) goto L_0x0129
            r6.c()
            r6.c = r7
        L_0x0129:
            aucj r2 = r6.b
            atpf r2 = (defpackage.atpf) r2
            r1.getClass()
            r2.b = r1
            int r1 = r2.a
            r0 = r0 | r1
            r2.a = r0
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x013c
            goto L_0x0141
        L_0x013c:
            r5.c()
            r5.c = r7
        L_0x0141:
            aucj r0 = r5.b
            atpj r0 = (defpackage.atpj) r0
            aucj r1 = r6.i()
            atpf r1 = (defpackage.atpf) r1
            atpj r2 = defpackage.atpj.g
            r1.getClass()
            r0.e = r1
            int r1 = r0.a
            r1 = r1 | 8
            r0.a = r1
            aucj r0 = r5.i()
            atpj r0 = (defpackage.atpj) r0
            r14.a((defpackage.atpj) r0)
            return
        L_0x0162:
            r13.r = r7
            btx r14 = defpackage.cbi.G()
            atjs r1 = defpackage.atjs.PLACE_FENCE
            aucd r1 = defpackage.btx.a((int) r5, (defpackage.atjs) r1)
            atpf r2 = defpackage.atpf.c
            aucd r2 = r2.o()
            atpl r3 = defpackage.bzu.a()
            boolean r4 = r2.c
            if (r4 == 0) goto L_0x0181
            r2.c()
            r2.c = r7
        L_0x0181:
            aucj r4 = r2.b
            atpf r4 = (defpackage.atpf) r4
            r3.getClass()
            r4.b = r3
            int r3 = r4.a
            r0 = r0 | r3
            r4.a = r0
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x0194
            goto L_0x0199
        L_0x0194:
            r1.c()
            r1.c = r7
        L_0x0199:
            aucj r0 = r1.b
            atpj r0 = (defpackage.atpj) r0
            aucj r2 = r2.i()
            atpf r2 = (defpackage.atpf) r2
            atpj r3 = defpackage.atpj.g
            r2.getClass()
            r0.e = r2
            int r2 = r0.a
            r2 = r2 | 8
            r0.a = r2
            aucj r0 = r1.i()
            atpj r0 = (defpackage.atpj) r0
            r14.a((defpackage.atpj) r0)
            return
        L_0x01ba:
            jjg r14 = defpackage.bxk.a
            anie r14 = r14.c()
            anih r14 = (defpackage.anih) r14
            r0 = 205(0xcd, float:2.87E-43)
            anie r14 = r14.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "[PlaceFenceImpl] Could not deserialize screen context."
            r14.a((java.lang.String) r0)
        L_0x01cf:
            return
        L_0x01d0:
            int r4 = r14.e
            atjv r4 = defpackage.atjv.a(r4)
            if (r4 != 0) goto L_0x01da
            atjv r4 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x01da:
            atjv r8 = defpackage.atjv.PLACES
            if (r4 != r8) goto L_0x02e9
            atjm r4 = r14.h
            if (r4 == 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            atjm r4 = defpackage.atjm.a
        L_0x01e5:
            auci r8 = defpackage.attu.c
            r4.a(r8)
            aubx r4 = r4.m
            auch r8 = r8.d
            boolean r4 = r4.a((defpackage.auch) r8)
            if (r4 == 0) goto L_0x02d3
            atjm r4 = r14.h
            if (r4 == 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            atjm r4 = defpackage.atjm.a
        L_0x01fb:
            auci r8 = defpackage.attu.c
            r4.a(r8)
            aubx r4 = r4.m
            auch r9 = r8.d
            java.lang.Object r4 = r4.b((defpackage.auch) r9)
            if (r4 != 0) goto L_0x020d
            java.lang.Object r4 = r8.b
            goto L_0x0210
        L_0x020d:
            r8.a(r4)
        L_0x0210:
            attu r4 = (defpackage.attu) r4
            int r8 = r13.b
            r9 = 5
            if (r8 == r9) goto L_0x028d
            aucx r1 = r4.a
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0259
            java.lang.Object[] r14 = new java.lang.Object[r0]
            aucx r1 = r4.a
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r7] = r1
            aucx r14 = r4.a
            java.lang.Object r14 = r14.get(r7)
            atts r14 = (defpackage.atts) r14
            aucx r1 = r4.a
            int r2 = r1.size()
            r3 = 0
        L_0x023c:
            if (r3 >= r2) goto L_0x0251
            java.lang.Object r4 = r1.get(r3)
            atts r4 = (defpackage.atts) r4
            double r8 = r4.b
            double r10 = r14.b
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x024d
            goto L_0x024e
        L_0x024d:
            r14 = r4
        L_0x024e:
            int r3 = r3 + 1
            goto L_0x023c
        L_0x0251:
            btx r1 = defpackage.cbi.G()
            r1.a()
            goto L_0x025e
        L_0x0259:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r7] = r14
            r14 = r6
        L_0x025e:
            int r1 = r13.b
            if (r1 != r5) goto L_0x028c
            boolean r1 = r13.r
            if (r1 == 0) goto L_0x028c
            if (r14 == 0) goto L_0x026b
            java.lang.String r6 = r14.d
            goto L_0x026c
        L_0x026b:
        L_0x026c:
            java.util.ArrayList r14 = r13.s
            int r14 = r14.size()
            if (r14 == 0) goto L_0x0283
            if (r14 == r0) goto L_0x0277
            goto L_0x028c
        L_0x0277:
            if (r6 == 0) goto L_0x0282
            java.util.ArrayList r14 = r13.s
            r14.add(r6)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r7] = r6
        L_0x0282:
            return
        L_0x0283:
            java.util.ArrayList r14 = r13.s
            r14.add(r6)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r7] = r6
        L_0x028c:
            return
        L_0x028d:
            ccr r14 = r13.m
            if (r14 == 0) goto L_0x02bd
            aucx r0 = r4.a
            java.util.List r14 = r14.a((java.util.List) r0)
            r13.o = r14
            jiq r14 = defpackage.cbi.i()
            long r0 = r14.a()
            r13.h = r0
            java.util.List r14 = r13.p
            if (r14 != 0) goto L_0x02bc
            long r2 = r13.n
            awuz r14 = defpackage.awuz.a
            awva r14 = r14.a()
            long r4 = r14.L()
            long r2 = r2 + r4
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 >= 0) goto L_0x02bc
            java.util.List r14 = r13.o
            r13.p = r14
        L_0x02bc:
            return
        L_0x02bd:
            jjg r14 = defpackage.bxk.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r0 = 293(0x125, float:4.1E-43)
            anie r14 = r14.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "[PlaceFenceImpl] null filter"
            r14.a((java.lang.String) r0)
            return
        L_0x02d3:
            jjg r14 = defpackage.bxk.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r0 = 284(0x11c, float:3.98E-43)
            anie r14 = r14.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "[PlaceFenceImpl] No extension found."
            r14.a((java.lang.String) r0)
            return
        L_0x02e9:
            return
        L_0x02ea:
            r13.k = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzv.a(atjl):void");
    }

    public final boolean a(byt byt) {
        HashSet hashSet = new HashSet(k());
        HashSet hashSet2 = new HashSet(j());
        List k2 = k();
        int size = k2.size();
        int i2 = 0;
        while (i2 < size) {
            String str = (String) k2.get(i2);
            String a = byt.a(str);
            if (a != null) {
                hashSet.remove(str);
                hashSet2.add(a);
                i2++;
            } else {
                ((anih) ((anih) bxk.a.b()).a("bzv", "a", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceImpl] Failed to resolve alias %s", (Object) str);
                return false;
            }
        }
        atlj atlj = (atlj) this.c;
        aucd aucd = (aucd) atlj.c(5);
        aucd.a((aucj) atlj);
        atlg atlg = (atlg) aucd;
        if (atlg.c) {
            atlg.c();
            atlg.c = false;
        }
        atlj atlj2 = atlj.h;
        ((atlj) atlg.b).f = aucj.s();
        if (atlg.c) {
            atlg.c();
            atlg.c = false;
        }
        ((atlj) atlg.b).d = aucj.s();
        if (!hashSet.isEmpty()) {
            atlg.a(hashSet);
        }
        if (!hashSet2.isEmpty()) {
            atlg.b(hashSet2);
        }
        this.c = (atlj) atlg.i();
        return true;
    }

    public final boolean a(Collection collection, Collection collection2) {
        boolean z;
        ContextData contextData = this.q;
        if (!(contextData == null || collection == null)) {
            collection.add(contextData);
        }
        if (this.b == 5) {
            z = true;
        } else {
            z = false;
        }
        this.p = this.o;
        if (collection2 != null && z) {
            for (int valueOf : i) {
                collection2.add(Integer.valueOf(valueOf));
            }
        }
        return z;
    }
}
