package defpackage;

/* renamed from: soy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class soy extends soz {
    final /* synthetic */ spb a;
    private final szl h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public soy(spb spb, String str, int i, szl szl) {
        super(str, i);
        this.a = spb;
        this.h = szl;
    }

    public final int a() {
        return this.h.b;
    }

    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x045f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.szz r18, long r19, defpackage.spp r21, boolean r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            spb r2 = r0.a
            spg r2 = r2.v()
            java.lang.String r3 = r0.b
            suc r4 = defpackage.sud.ad
            boolean r2 = r2.b(r3, r4)
            spb r3 = r0.a
            spg r3 = r3.v()
            java.lang.String r4 = r0.b
            suc r5 = defpackage.sud.ae
            boolean r3 = r3.b(r4, r5)
            defpackage.ayiv.c()
            if (r3 != 0) goto L_0x0026
            goto L_0x0033
        L_0x0026:
            if (r2 == 0) goto L_0x0033
            szl r3 = r0.h
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x0033
            r3 = r21
            long r3 = r3.e
            goto L_0x0035
        L_0x0033:
            r3 = r19
        L_0x0035:
            spb r5 = r0.a
            sut r5 = r5.E()
            r6 = 2
            boolean r5 = r5.a((int) r6)
            java.lang.String r7 = "null"
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0137
            spb r5 = r0.a
            sut r5 = r5.E()
            sur r5 = r5.k
            int r11 = r0.c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            szl r12 = r0.h
            int r13 = r12.a
            r13 = r13 & r10
            if (r13 == 0) goto L_0x0062
            int r12 = r12.b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0063
        L_0x0062:
            r12 = 0
        L_0x0063:
            spb r13 = r0.a
            suk r13 = r13.y()
            szl r14 = r0.h
            java.lang.String r14 = r14.c
            java.lang.String r13 = r13.a((java.lang.String) r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, event"
            r5.a(r14, r11, r12, r13)
            spb r5 = r0.a
            sut r5 = r5.E()
            sur r5 = r5.k
            spb r11 = r0.a
            szg r11 = r11.o()
            szl r12 = r0.h
            if (r12 == 0) goto L_0x0130
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "\nevent_filter {\n"
            r13.append(r14)
            int r14 = r12.a
            r14 = r14 & r10
            if (r14 == 0) goto L_0x00a2
            int r14 = r12.b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r15 = "filter_id"
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r9, (java.lang.String) r15, (java.lang.Object) r14)
        L_0x00a2:
            suk r14 = r11.y()
            java.lang.String r15 = r12.c
            java.lang.String r14 = r14.a((java.lang.String) r15)
            java.lang.String r15 = "event_name"
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r9, (java.lang.String) r15, (java.lang.Object) r14)
            boolean r14 = r12.f
            boolean r15 = r12.g
            boolean r8 = r12.h
            java.lang.String r8 = defpackage.szg.a((boolean) r14, (boolean) r15, (boolean) r8)
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L_0x00c7
            java.lang.String r14 = "filter_type"
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r9, (java.lang.String) r14, (java.lang.Object) r8)
        L_0x00c7:
            boolean r8 = defpackage.ayjn.b()
            if (r8 == 0) goto L_0x00df
            spg r8 = r11.v()
            suc r14 = defpackage.sud.aJ
            boolean r8 = r8.a((defpackage.suc) r14)
            if (r8 == 0) goto L_0x00df
            int r8 = r12.a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x00eb
        L_0x00df:
            szp r8 = r12.e
            if (r8 != 0) goto L_0x00e5
            szp r8 = defpackage.szp.g
        L_0x00e5:
            java.lang.String r14 = "event_count_filter"
            r11.a((java.lang.StringBuilder) r13, (int) r10, (java.lang.String) r14, (defpackage.szp) r8)
        L_0x00eb:
            boolean r8 = defpackage.ayjn.b()
            if (r8 == 0) goto L_0x0106
            spg r8 = r11.v()
            suc r14 = defpackage.sud.aJ
            boolean r8 = r8.a((defpackage.suc) r14)
            if (r8 != 0) goto L_0x00fe
            goto L_0x0106
        L_0x00fe:
            aucx r8 = r12.d
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0115
        L_0x0106:
            java.lang.String r8 = "  filters {\n"
            r13.append(r8)
            aucx r8 = r12.d
            int r12 = r8.size()
            r14 = 0
        L_0x0113:
            if (r14 < r12) goto L_0x0123
        L_0x0115:
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r10)
            java.lang.String r8 = "}\n}\n"
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            goto L_0x0131
        L_0x0123:
            java.lang.Object r15 = r8.get(r14)
            szm r15 = (defpackage.szm) r15
            r11.a((java.lang.StringBuilder) r13, (int) r6, (defpackage.szm) r15)
            int r14 = r14 + 1
            goto L_0x0113
        L_0x0130:
            r8 = r7
        L_0x0131:
            java.lang.String r11 = "Filter definition"
            r5.a(r11, r8)
        L_0x0137:
            szl r5 = r0.h
            int r8 = r5.a
            r11 = r8 & 1
            if (r11 == 0) goto L_0x0461
            int r11 = r5.b
            r12 = 256(0x100, float:3.59E-43)
            if (r11 > r12) goto L_0x0461
            boolean r11 = r5.f
            boolean r12 = r5.g
            if (r2 == 0) goto L_0x0151
            boolean r2 = r5.h
            if (r2 == 0) goto L_0x0151
            r2 = 1
            goto L_0x0152
        L_0x0151:
            r2 = 0
        L_0x0152:
            if (r11 == 0) goto L_0x0156
            r2 = 1
            goto L_0x015d
        L_0x0156:
            if (r12 == 0) goto L_0x015a
        L_0x0158:
            r2 = 1
            goto L_0x015d
        L_0x015a:
            if (r2 != 0) goto L_0x0158
            r2 = 0
        L_0x015d:
            if (r22 != 0) goto L_0x0160
            goto L_0x0186
        L_0x0160:
            if (r2 != 0) goto L_0x0186
            spb r1 = r0.a
            sut r1 = r1.E()
            sur r1 = r1.k
            int r2 = r0.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            szl r3 = r0.h
            int r4 = r3.a
            r4 = r4 & r10
            if (r4 == 0) goto L_0x017e
            int r3 = r3.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x017f
        L_0x017e:
            r8 = 0
        L_0x017f:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.a(r3, r2, r8)
            return r10
        L_0x0186:
            java.lang.String r11 = r1.c
            r8 = r8 & 8
            if (r8 != 0) goto L_0x018d
            goto L_0x01a5
        L_0x018d:
            szp r8 = r5.e
            if (r8 != 0) goto L_0x0193
            szp r8 = defpackage.szp.g
        L_0x0193:
            java.lang.Boolean r3 = a((long) r3, (defpackage.szp) r8)
            if (r3 == 0) goto L_0x0420
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x01a5
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)
            goto L_0x0421
        L_0x01a5:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            aucx r4 = r5.d
            int r8 = r4.size()
            r12 = 0
        L_0x01b1:
            if (r12 < r8) goto L_0x03ee
            nz r4 = new nz
            r4.<init>()
            aucx r8 = r1.b
            int r12 = r8.size()
            r13 = 0
        L_0x01bf:
            if (r13 >= r12) goto L_0x0227
            java.lang.Object r14 = r8.get(r13)
            tab r14 = (defpackage.tab) r14
            java.lang.String r15 = r14.b
            boolean r15 = r3.contains(r15)
            if (r15 == 0) goto L_0x0222
            int r15 = r14.a
            r16 = r15 & 4
            if (r16 == 0) goto L_0x01e1
            java.lang.String r15 = r14.b
            long r9 = r14.d
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r4.put(r15, r9)
            goto L_0x0222
        L_0x01e1:
            r9 = r15 & 16
            if (r9 == 0) goto L_0x01f1
            java.lang.String r9 = r14.b
            double r14 = r14.e
            java.lang.Double r10 = java.lang.Double.valueOf(r14)
            r4.put(r9, r10)
            goto L_0x0222
        L_0x01f1:
            r9 = r15 & 2
            if (r9 != 0) goto L_0x021b
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r8 = r14.b
            java.lang.String r5 = r5.b(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r3.a(r8, r4, r5)
            r8 = 0
            goto L_0x0421
        L_0x021b:
            java.lang.String r9 = r14.b
            java.lang.String r10 = r14.c
            r4.put(r9, r10)
        L_0x0222:
            int r13 = r13 + 1
            r9 = 0
            r10 = 1
            goto L_0x01bf
        L_0x0227:
            aucx r3 = r5.d
            int r5 = r3.size()
            r8 = 0
        L_0x022e:
            if (r8 >= r5) goto L_0x03e7
            java.lang.Object r9 = r3.get(r8)
            szm r9 = (defpackage.szm) r9
            int r10 = r9.a
            r10 = r10 & 4
            if (r10 == 0) goto L_0x0242
            boolean r10 = r9.d
            if (r10 == 0) goto L_0x0242
            r10 = 1
            goto L_0x0243
        L_0x0242:
            r10 = 0
        L_0x0243:
            java.lang.String r12 = r9.e
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x03ce
            java.lang.Object r13 = r4.get(r12)
            boolean r14 = r13 instanceof java.lang.Long
            if (r14 == 0) goto L_0x029f
            int r14 = r9.a
            r14 = r14 & r6
            if (r14 == 0) goto L_0x027b
            java.lang.Long r13 = (java.lang.Long) r13
            long r12 = r13.longValue()
            szp r9 = r9.c
            if (r9 == 0) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            szp r9 = defpackage.szp.g
        L_0x0265:
            java.lang.Boolean r9 = a((long) r12, (defpackage.szp) r9)
            if (r9 == 0) goto L_0x0278
            boolean r9 = r9.booleanValue()
            if (r9 != r10) goto L_0x0356
            r3 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            goto L_0x0421
        L_0x0278:
            r8 = 0
            goto L_0x0421
        L_0x027b:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r5 = r5.b(r12)
            java.lang.String r8 = "No number filter for long param. event, param"
            r3.a(r8, r4, r5)
            r8 = 0
            goto L_0x0421
        L_0x029f:
            boolean r14 = r13 instanceof java.lang.Double
            if (r14 == 0) goto L_0x02ef
            int r14 = r9.a
            r14 = r14 & r6
            if (r14 == 0) goto L_0x02cb
            java.lang.Double r13 = (java.lang.Double) r13
            double r12 = r13.doubleValue()
            szp r9 = r9.c
            if (r9 == 0) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            szp r9 = defpackage.szp.g
        L_0x02b5:
            java.lang.Boolean r9 = a((double) r12, (defpackage.szp) r9)
            if (r9 == 0) goto L_0x02c8
            boolean r9 = r9.booleanValue()
            if (r9 != r10) goto L_0x0356
            r3 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            goto L_0x0421
        L_0x02c8:
            r8 = 0
            goto L_0x0421
        L_0x02cb:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r5 = r5.b(r12)
            java.lang.String r8 = "No number filter for double param. event, param"
            r3.a(r8, r4, r5)
            r8 = 0
            goto L_0x0421
        L_0x02ef:
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L_0x0381
            int r14 = r9.a
            r15 = r14 & 1
            if (r15 == 0) goto L_0x030d
            java.lang.String r13 = (java.lang.String) r13
            szt r9 = r9.b
            if (r9 == 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            szt r9 = defpackage.szt.f
        L_0x0302:
            spb r12 = r0.a
            sut r12 = r12.E()
            java.lang.Boolean r9 = a((java.lang.String) r13, (defpackage.szt) r9, (defpackage.sut) r12)
            goto L_0x0347
        L_0x030d:
            r14 = r14 & 2
            if (r14 != 0) goto L_0x0335
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r5 = r5.b(r12)
            java.lang.String r8 = "No filter for String param. event, param"
            r3.a(r8, r4, r5)
            r8 = 0
            goto L_0x0421
        L_0x0335:
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = defpackage.szg.a((java.lang.String) r13)
            if (r14 == 0) goto L_0x035d
            szp r9 = r9.c
            if (r9 != 0) goto L_0x0343
            szp r9 = defpackage.szp.g
        L_0x0343:
            java.lang.Boolean r9 = a((java.lang.String) r13, (defpackage.szp) r9)
        L_0x0347:
            if (r9 == 0) goto L_0x035a
            boolean r9 = r9.booleanValue()
            if (r9 != r10) goto L_0x0356
            r3 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            goto L_0x0421
        L_0x0356:
            int r8 = r8 + 1
            goto L_0x022e
        L_0x035a:
            r8 = 0
            goto L_0x0421
        L_0x035d:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r5 = r5.b(r12)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r3.a(r8, r4, r5)
            r8 = 0
            goto L_0x0421
        L_0x0381:
            if (r13 != 0) goto L_0x03ab
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.k
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r5 = r5.b(r12)
            java.lang.String r8 = "Missing param for filter. event, param"
            r3.a(r8, r4, r5)
            r3 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            goto L_0x0421
        L_0x03ab:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            spb r5 = r0.a
            suk r5 = r5.y()
            java.lang.String r5 = r5.b(r12)
            java.lang.String r8 = "Unknown param type. event, param"
            r3.a(r8, r4, r5)
            r8 = 0
            goto L_0x0421
        L_0x03ce:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            java.lang.String r5 = "Event has empty param name. event"
            r3.a(r5, r4)
            r8 = 0
            goto L_0x0421
        L_0x03e7:
            r3 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            goto L_0x0421
        L_0x03ee:
            java.lang.Object r9 = r4.get(r12)
            szm r9 = (defpackage.szm) r9
            java.lang.String r10 = r9.e
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0407
            java.lang.String r9 = r9.e
            r3.add(r9)
            int r12 = r12 + 1
            r9 = 0
            r10 = 1
            goto L_0x01b1
        L_0x0407:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.f
            spb r4 = r0.a
            suk r4 = r4.y()
            java.lang.String r4 = r4.a((java.lang.String) r11)
            java.lang.String r5 = "null or empty param name in filter. event"
            r3.a(r5, r4)
            r8 = 0
            goto L_0x0421
        L_0x0420:
            r8 = 0
        L_0x0421:
            spb r3 = r0.a
            sut r3 = r3.E()
            sur r3 = r3.k
            if (r8 != 0) goto L_0x042c
            goto L_0x042d
        L_0x042c:
            r7 = r8
        L_0x042d:
            java.lang.String r4 = "Event filter result"
            r3.a(r4, r7)
            if (r8 == 0) goto L_0x045f
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r0.d = r4
            boolean r3 = r8.booleanValue()
            if (r3 == 0) goto L_0x045d
            r0.e = r4
            if (r2 == 0) goto L_0x045b
            int r2 = r1.a
            r2 = r2 & r6
            if (r2 == 0) goto L_0x045b
            long r1 = r1.d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            szl r2 = r0.h
            boolean r2 = r2.g
            if (r2 != 0) goto L_0x0459
            r0.f = r1
            goto L_0x045b
        L_0x0459:
            r0.g = r1
        L_0x045b:
            r1 = 1
            return r1
        L_0x045d:
            r1 = 1
            return r1
        L_0x045f:
            r1 = 0
            return r1
        L_0x0461:
            spb r1 = r0.a
            sut r1 = r1.E()
            sur r1 = r1.f
            java.lang.String r2 = r0.b
            java.lang.Object r2 = defpackage.sut.a((java.lang.String) r2)
            szl r3 = r0.h
            int r4 = r3.a
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x047e
            int r3 = r3.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x047f
        L_0x047e:
            r8 = 0
        L_0x047f:
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.a(r4, r2, r3)
            spb r1 = r0.a
            spg r1 = r1.v()
            java.lang.String r2 = r0.b
            suc r3 = defpackage.sud.am
            boolean r1 = r1.b(r2, r3)
            if (r1 != 0) goto L_0x049a
            r1 = 1
            return r1
        L_0x049a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.soy.a(szz, long, spp, boolean):boolean");
    }
}
