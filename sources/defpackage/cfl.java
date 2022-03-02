package defpackage;

/* renamed from: cfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfl extends bwp {
    final /* synthetic */ cfm c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfl(cfm cfm) {
        super("ProduceTimeIntervalsOperation");
        this.c = cfm;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            jiq r0 = defpackage.cbi.i()
            long r0 = r0.a()
            cfm r2 = r14.c
            chl r3 = r2.k
            java.util.TimeZone r4 = r3.a
            java.util.Calendar r4 = defpackage.bvl.a((long) r0, (java.util.TimeZone) r4)
            atsd r4 = defpackage.bvl.a((java.util.Calendar) r4)
            chk r5 = r3.b
            int r6 = r4.b
            int r7 = r4.c
            int r8 = r4.d
            int r4 = r4.e
            int r4 = defpackage.atsp.a(r4)
            r9 = 1
            if (r4 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r4 = 1
        L_0x0029:
            r10 = -1
            int r4 = r4 + r10
            android.util.SparseArray r11 = r5.b
            int r6 = defpackage.chk.a(r6, r7, r8)
            java.util.ArrayList r7 = defpackage.chk.a
            java.lang.Object r6 = r11.get(r6, r7)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x004b
            android.util.SparseArray r5 = r5.c
            java.util.ArrayList r6 = defpackage.chk.a
            java.lang.Object r4 = r5.get(r4, r6)
            r6 = r4
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            java.util.Collections.sort(r6)
            java.util.TimeZone r4 = r3.a
            long r4 = defpackage.bvl.b(r0, r4)
            chi r3 = r3.c
            java.util.List r7 = r3.b
            chh r8 = new chh
            r8.<init>(r4)
            if (r7 == 0) goto L_0x006a
            int r7 = java.util.Collections.binarySearch(r7, r8)
            if (r7 >= 0) goto L_0x006b
            int r7 = -r7
            int r7 = r7 + -2
            goto L_0x006b
        L_0x006a:
            r7 = -1
        L_0x006b:
            if (r7 < 0) goto L_0x0083
            java.util.List r8 = r3.b
            java.lang.Object r8 = r8.get(r7)
            chh r8 = (defpackage.chh) r8
            long r11 = r8.a
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0083
            long r11 = r8.b
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0083
            r10 = r7
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            if (r10 < 0) goto L_0x0091
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r10)
            chh r3 = (defpackage.chh) r3
            java.util.List r3 = r3.c
            goto L_0x0093
        L_0x0091:
            amzy r3 = defpackage.chi.a
        L_0x0093:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r6.size()
            int r7 = r3.size()
            int r5 = r5 + r7
            r4.<init>(r5)
            int r5 = r6.size()
            r7 = 0
        L_0x00a6:
            r8 = 3
            r10 = 2
            if (r7 >= r5) goto L_0x00cf
            java.lang.Object r11 = r6.get(r7)
            atsr r11 = (defpackage.atsr) r11
            atsr r12 = defpackage.atsr.UNKNOWN_DAY_TYPE
            atsl r12 = defpackage.atsl.UNKNOWN_DAY_PART
            int r11 = r11.ordinal()
            if (r11 == r9) goto L_0x00c7
            if (r11 == r10) goto L_0x00c4
            if (r11 == r8) goto L_0x00c1
            atrm r8 = defpackage.atrm.UNKNOWN
            goto L_0x00c9
        L_0x00c1:
            atrm r8 = defpackage.atrm.HOLIDAY
            goto L_0x00c9
        L_0x00c4:
            atrm r8 = defpackage.atrm.WEEKEND
            goto L_0x00c9
        L_0x00c7:
            atrm r8 = defpackage.atrm.WEEKDAY
        L_0x00c9:
            r4.add(r8)
            int r7 = r7 + 1
            goto L_0x00a6
        L_0x00cf:
            java.util.Iterator r3 = r3.iterator()
        L_0x00d3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0102
            java.lang.Object r5 = r3.next()
            atsl r5 = (defpackage.atsl) r5
            atsr r6 = defpackage.atsr.UNKNOWN_DAY_TYPE
            atsl r6 = defpackage.atsl.UNKNOWN_DAY_PART
            int r5 = r5.ordinal()
            if (r5 == r9) goto L_0x00fc
            if (r5 == r10) goto L_0x00f9
            if (r5 == r8) goto L_0x00f6
            r6 = 4
            if (r5 == r6) goto L_0x00f3
            atrm r5 = defpackage.atrm.UNKNOWN
            goto L_0x00fe
        L_0x00f3:
            atrm r5 = defpackage.atrm.NIGHT
            goto L_0x00fe
        L_0x00f6:
            atrm r5 = defpackage.atrm.EVENING
            goto L_0x00fe
        L_0x00f9:
            atrm r5 = defpackage.atrm.AFTERNOON
            goto L_0x00fe
        L_0x00fc:
            atrm r5 = defpackage.atrm.MORNING
        L_0x00fe:
            r4.add(r5)
            goto L_0x00d3
        L_0x0102:
            java.util.Collections.sort(r4)
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x0115
            r2.a(r4, r0)
            chl r2 = r2.k
            long r0 = r2.a((long) r0)
            goto L_0x014e
        L_0x0115:
            java.util.List r3 = r2.j
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x013f
            jjg r3 = defpackage.bxk.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r5 = 143(0x8f, float:2.0E-43)
            java.lang.String r6 = "cfm"
            java.lang.String r7 = "b"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r3 = r3.a((java.lang.String) r6, (java.lang.String) r7, (int) r5, (java.lang.String) r8)
            anih r3 = (defpackage.anih) r3
            java.lang.String r5 = "[TimeIntervalsProducer] Got same value as before for attributes %s"
            r3.a((java.lang.String) r5, (java.lang.Object) r4)
            chl r2 = r2.k
            long r0 = r2.a((long) r0)
            goto L_0x014e
        L_0x013f:
            r5 = -1
            long r5 = r5 + r0
            r2.a((long) r5)
            r2.a(r4, r0)
            chl r2 = r2.k
            long r0 = r2.a((long) r0)
        L_0x014e:
            java.lang.String r2 = "ProduceTimeIntervalsOperation"
            bvp r2 = defpackage.bvq.a(r2)
            r14.a(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfl.a():void");
    }
}
