package defpackage;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: chw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chw extends bva {
    final /* synthetic */ cif a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chw(cif cif, String str, Object... objArr) {
        super(str, objArr);
        this.a = cif;
    }

    public final void a(Exception exc) {
        this.a.a(7508, (Snapshot) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0200, code lost:
        if (r30 != null) goto L_0x0202;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r36) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            rib r2 = (defpackage.rib) r2
            cif r0 = r1.a
            atjv r0 = r0.i
            int r0 = r0.bA
            r3 = 60
            r4 = 18
            r5 = 1
            r6 = 0
            if (r0 != r4) goto L_0x0016
            r7 = 1
            goto L_0x001b
        L_0x0016:
            if (r0 != r3) goto L_0x001a
            r7 = 1
            goto L_0x001b
        L_0x001a:
            r7 = 0
        L_0x001b:
            defpackage.iva.b((boolean) r7)
            r7 = 0
            if (r2 == 0) goto L_0x01fe
            int r8 = r2.a()     // Catch:{ all -> 0x01f7 }
            if (r8 <= 0) goto L_0x01f4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01f7 }
            int r8 = r2.a()     // Catch:{ all -> 0x01f7 }
            r7.<init>(r8)     // Catch:{ all -> 0x01f7 }
            attu r8 = defpackage.attu.b     // Catch:{ all -> 0x01f7 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x01f7 }
            attt r8 = (defpackage.attt) r8     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x01f7 }
        L_0x003c:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x01f7 }
            if (r10 == 0) goto L_0x0176
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x01f7 }
            rhy r10 = (defpackage.rhy) r10     // Catch:{ all -> 0x01f7 }
            rhq r11 = r10.bb()     // Catch:{ all -> 0x01f7 }
            gre r12 = new gre     // Catch:{ all -> 0x01f7 }
            r12.<init>()     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = r11.a()     // Catch:{ all -> 0x01f7 }
            r12.a = r13     // Catch:{ all -> 0x01f7 }
            java.util.List r13 = r11.b()     // Catch:{ all -> 0x01f7 }
            r12.k = r13     // Catch:{ all -> 0x01f7 }
            java.lang.CharSequence r13 = r11.p()     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01f7 }
            r12.b = r13     // Catch:{ all -> 0x01f7 }
            java.lang.CharSequence r13 = r11.q()     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01f7 }
            r12.l = r13     // Catch:{ all -> 0x01f7 }
            java.lang.CharSequence r13 = r11.o()     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01f7 }
            r12.m = r13     // Catch:{ all -> 0x01f7 }
            java.lang.CharSequence r13 = r11.i()     // Catch:{ all -> 0x01f7 }
            if (r13 == 0) goto L_0x0092
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ all -> 0x01f7 }
            java.lang.CharSequence r14 = r11.i()     // Catch:{ all -> 0x01f7 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x01f7 }
            r13[r6] = r14     // Catch:{ all -> 0x01f7 }
            java.util.List r13 = java.util.Arrays.asList(r13)     // Catch:{ all -> 0x01f7 }
            goto L_0x0096
        L_0x0092:
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x01f7 }
        L_0x0096:
            r12.n = r13     // Catch:{ all -> 0x01f7 }
            com.google.android.gms.maps.model.LatLng r13 = r11.d()     // Catch:{ all -> 0x01f7 }
            r12.c = r13     // Catch:{ all -> 0x01f7 }
            float r13 = r11.e()     // Catch:{ all -> 0x01f7 }
            r12.d = r13     // Catch:{ all -> 0x01f7 }
            com.google.android.gms.maps.model.LatLngBounds r13 = r11.f()     // Catch:{ all -> 0x01f7 }
            r12.e = r13     // Catch:{ all -> 0x01f7 }
            java.util.TimeZone r13 = r11.g()     // Catch:{ all -> 0x01f7 }
            if (r13 == 0) goto L_0x00b9
            java.util.TimeZone r13 = r11.g()     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = r13.getID()     // Catch:{ all -> 0x01f7 }
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r13 = "UTC"
        L_0x00bb:
            r12.f = r13     // Catch:{ all -> 0x01f7 }
            android.net.Uri r13 = r11.h()     // Catch:{ all -> 0x01f7 }
            r12.g = r13     // Catch:{ all -> 0x01f7 }
            boolean r13 = r11.j()     // Catch:{ all -> 0x01f7 }
            r12.h = r13     // Catch:{ all -> 0x01f7 }
            float r13 = r11.k()     // Catch:{ all -> 0x01f7 }
            r12.i = r13     // Catch:{ all -> 0x01f7 }
            int r13 = r11.l()     // Catch:{ all -> 0x01f7 }
            r12.j = r13     // Catch:{ all -> 0x01f7 }
            java.lang.String r11 = r11.m()     // Catch:{ all -> 0x01f7 }
            r12.o = r11     // Catch:{ all -> 0x01f7 }
            com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceEntity r11 = new com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceEntity     // Catch:{ all -> 0x01f7 }
            java.lang.String r14 = r12.a     // Catch:{ all -> 0x01f7 }
            java.util.List r15 = r12.k     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = r12.b     // Catch:{ all -> 0x01f7 }
            java.lang.String r4 = r12.l     // Catch:{ all -> 0x01f7 }
            java.lang.String r3 = r12.m     // Catch:{ all -> 0x01f7 }
            java.util.List r6 = r12.n     // Catch:{ all -> 0x01f7 }
            com.google.android.gms.maps.model.LatLng r5 = r12.c     // Catch:{ all -> 0x01f7 }
            r29 = r9
            float r9 = r12.d     // Catch:{ all -> 0x01f7 }
            com.google.android.gms.maps.model.LatLngBounds r1 = r12.e     // Catch:{ all -> 0x01f7 }
            r30 = r2
            java.lang.String r2 = r12.f     // Catch:{ all -> 0x01f2 }
            r31 = r0
            android.net.Uri r0 = r12.g     // Catch:{ all -> 0x01f2 }
            r32 = r8
            boolean r8 = r12.h     // Catch:{ all -> 0x01f2 }
            r33 = r7
            float r7 = r12.i     // Catch:{ all -> 0x01f2 }
            r34 = r10
            int r10 = r12.j     // Catch:{ all -> 0x01f2 }
            java.lang.String r12 = r12.o     // Catch:{ all -> 0x01f2 }
            r16 = r13
            r13 = r11
            r17 = r4
            r18 = r3
            r19 = r6
            r20 = r5
            r21 = r9
            r22 = r1
            r23 = r2
            r24 = r0
            r25 = r8
            r26 = r7
            r27 = r10
            r28 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x01f2 }
            float r0 = r34.ba()     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceLikelihoodEntity r1 = new com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceLikelihoodEntity     // Catch:{ all -> 0x01f2 }
            defpackage.iva.a((java.lang.Object) r11)     // Catch:{ all -> 0x01f2 }
            r1.<init>(r11, r0)     // Catch:{ all -> 0x01f2 }
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x01f2 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x01f2 }
            r0 = r33
            r0.add(r1)     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceEntity r2 = r1.a     // Catch:{ all -> 0x01f2 }
            float r1 = r1.b     // Catch:{ all -> 0x01f2 }
            double r3 = (double) r1     // Catch:{ all -> 0x01f2 }
            r5 = 0
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r8 = 0
            atts r1 = defpackage.cen.a(r2, r3, r5, r6, r8)     // Catch:{ all -> 0x01f2 }
            r8 = r32
            boolean r2 = r8.c     // Catch:{ all -> 0x01f2 }
            if (r2 != 0) goto L_0x0150
            goto L_0x0156
        L_0x0150:
            r8.c()     // Catch:{ all -> 0x01f2 }
            r2 = 0
            r8.c = r2     // Catch:{ all -> 0x01f2 }
        L_0x0156:
            aucj r2 = r8.b     // Catch:{ all -> 0x01f2 }
            attu r2 = (defpackage.attu) r2     // Catch:{ all -> 0x01f2 }
            r1.getClass()     // Catch:{ all -> 0x01f2 }
            r2.a()     // Catch:{ all -> 0x01f2 }
            aucx r2 = r2.a     // Catch:{ all -> 0x01f2 }
            r2.add(r1)     // Catch:{ all -> 0x01f2 }
            r1 = r35
            r7 = r0
            r9 = r29
            r2 = r30
            r0 = r31
            r3 = 60
            r4 = 18
            r5 = 1
            r6 = 0
            goto L_0x003c
        L_0x0176:
            r31 = r0
            r30 = r2
            r0 = r7
            r1 = r31
            r2 = 60
            if (r1 == r2) goto L_0x0182
            goto L_0x01b1
        L_0x0182:
            ccr r2 = new ccr     // Catch:{ all -> 0x01f2 }
            attp r3 = defpackage.awvf.b()     // Catch:{ all -> 0x01f2 }
            r2.<init>(r3)     // Catch:{ all -> 0x01f2 }
            aucj r3 = r8.b     // Catch:{ all -> 0x01f2 }
            attu r3 = (defpackage.attu) r3     // Catch:{ all -> 0x01f2 }
            aucx r3 = r3.a     // Catch:{ all -> 0x01f2 }
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)     // Catch:{ all -> 0x01f2 }
            java.util.List r2 = r2.a((java.util.List) r3)     // Catch:{ all -> 0x01f2 }
            boolean r3 = r8.c     // Catch:{ all -> 0x01f2 }
            if (r3 != 0) goto L_0x019e
            goto L_0x01a4
        L_0x019e:
            r8.c()     // Catch:{ all -> 0x01f2 }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x01f2 }
        L_0x01a4:
            aucj r3 = r8.b     // Catch:{ all -> 0x01f2 }
            attu r3 = (defpackage.attu) r3     // Catch:{ all -> 0x01f2 }
            aucx r4 = defpackage.aucj.s()     // Catch:{ all -> 0x01f2 }
            r3.a = r4     // Catch:{ all -> 0x01f2 }
            r8.a(r2)     // Catch:{ all -> 0x01f2 }
        L_0x01b1:
            jti r2 = new jti     // Catch:{ all -> 0x01f2 }
            r3 = 7
            r4 = 1
            r2.<init>(r3, r1, r4)     // Catch:{ all -> 0x01f2 }
            auci r3 = defpackage.attu.c     // Catch:{ all -> 0x01f2 }
            aucj r4 = r8.i()     // Catch:{ all -> 0x01f2 }
            attu r4 = (defpackage.attu) r4     // Catch:{ all -> 0x01f2 }
            r2.a(r3, r4)     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.contextmanager.ContextData r2 = r2.a()     // Catch:{ all -> 0x01f2 }
            gro r3 = new gro     // Catch:{ all -> 0x01f2 }
            r3.<init>()     // Catch:{ all -> 0x01f2 }
            r3.a((com.google.android.gms.contextmanager.ContextData) r2)     // Catch:{ all -> 0x01f2 }
            r2 = 18
            if (r1 != r2) goto L_0x01ed
            com.google.android.gms.awareness.snapshot.internal.PlacesData r1 = new com.google.android.gms.awareness.snapshot.internal.PlacesData     // Catch:{ all -> 0x01f2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f2 }
            ilm r0 = defpackage.ilk.d()     // Catch:{ all -> 0x01f2 }
            defpackage.ilk.a(r0, r1)     // Catch:{ all -> 0x01f2 }
            r1 = 0
            com.google.android.gms.common.data.DataHolder r0 = r0.a((int) r1)     // Catch:{ all -> 0x01f2 }
            boolean r1 = r3.a((java.lang.Object) r0)     // Catch:{ all -> 0x01f2 }
            if (r1 == 0) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            r3.c = r0     // Catch:{ all -> 0x01f2 }
        L_0x01ed:
            com.google.android.gms.awareness.snapshot.internal.Snapshot r7 = r3.a()     // Catch:{ all -> 0x01f2 }
            goto L_0x0202
        L_0x01f2:
            r0 = move-exception
            goto L_0x01fa
        L_0x01f4:
            r30 = r2
            goto L_0x0200
        L_0x01f7:
            r0 = move-exception
            r30 = r2
        L_0x01fa:
            r30.c()
            throw r0
        L_0x01fe:
            r30 = r2
        L_0x0200:
            if (r30 == 0) goto L_0x0206
        L_0x0202:
            r30.c()
            goto L_0x0207
        L_0x0206:
        L_0x0207:
            r1 = r35
            cif r0 = r1.a
            r2 = 0
            r0.a(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chw.a(java.lang.Object):void");
    }
}
