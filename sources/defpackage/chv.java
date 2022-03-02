package defpackage;

/* renamed from: chv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chv implements Runnable {
    final /* synthetic */ cif a;

    public chv(cif cif) {
        this.a = cif;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != 35) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
            cif r0 = r12.a
            atjv r0 = r0.i
            int r0 = r0.ordinal()
            r1 = 18
            r2 = 0
            if (r0 == r1) goto L_0x01a6
            r1 = 26
            if (r0 == r1) goto L_0x010c
            r1 = 59
            if (r0 == r1) goto L_0x01a6
            cif r0 = r12.a
            atjv r1 = r0.i
            int r1 = r1.ordinal()
            r3 = 0
            r5 = 1
            if (r1 == r5) goto L_0x006e
            r6 = 6
            if (r1 == r6) goto L_0x0031
            r6 = 31
            if (r1 == r6) goto L_0x006e
            r6 = 35
            if (r1 == r6) goto L_0x006e
            goto L_0x00aa
        L_0x0031:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.h = r1
            android.content.Context r1 = defpackage.cbi.f()
            grb r7 = r0.e
            iby r1 = defpackage.gra.e(r1, r7)
            java.lang.String r7 = r0.h
            cbb r8 = defpackage.cbb.a()
            com.google.android.gms.awareness.snapshot.internal.SnapshotRequest r9 = r0.d
            long r9 = r9.d
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x0058
            long r9 = defpackage.awuz.b()
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            cbc r3 = defpackage.cbc.a(r9)
            acwa r1 = r1.a((java.lang.String) r7, (int) r6, (defpackage.jup) r8, (defpackage.juq) r3)
            bva r3 = new bva
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r6 = "[SnapshotOperation] register activity interest"
            r3.<init>(r6, r4)
            r1.a((defpackage.acvp) r3)
            goto L_0x00aa
        L_0x006e:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.h = r1
            android.content.Context r1 = defpackage.cbi.f()
            grb r6 = r0.e
            iby r1 = defpackage.gra.e(r1, r6)
            java.lang.String r6 = r0.h
            cbb r7 = defpackage.cbb.a()
            com.google.android.gms.awareness.snapshot.internal.SnapshotRequest r8 = r0.d
            long r8 = r8.d
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0095
            long r8 = defpackage.awuz.u()
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            juq r3 = defpackage.juq.b(r8)
            acwa r1 = r1.a((java.lang.String) r6, (int) r5, (defpackage.jup) r7, (defpackage.juq) r3)
            bva r3 = new bva
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r6 = "[SnapshotOperation] register location interest"
            r3.<init>(r6, r4)
            r1.a((defpackage.acvp) r3)
        L_0x00aa:
            cia r1 = new cia
            bwn r3 = defpackage.cbi.k()
            java.lang.String r4 = "SnapshotOperationReceiveContextData"
            r1.<init>(r0, r3, r4)
            r0.f = r1
            atjv r1 = r0.i
            jtv r3 = r0.f
            jtm r4 = new jtm
            r4.<init>()
            int r6 = r1.bA
            r4.a((int) r6)
            jtn r4 = r4.a()
            android.content.Context r6 = defpackage.cbi.f()
            grb r7 = r0.e
            iby r6 = defpackage.gra.c(r6, r7)
            acwa r3 = r6.a((defpackage.jtn) r4, (defpackage.jtv) r3)
            chz r4 = new chz
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r1 = r1.bA
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r5[r2] = r1
            java.lang.String r1 = "SnapshotOperation"
            r4.<init>(r0, r1, r5)
            r3.a((defpackage.acvp) r4)
            chx r1 = new chx
            r1.<init>(r0)
            r0.g = r1
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r0 = r0.g
            awwq r2 = defpackage.awwq.a
            awwr r2 = r2.a()
            long r2 = r2.a()
            java.lang.String r4 = "SnapshotOperationTimeout"
            bvp r4 = defpackage.bvq.a(r4)
            r1.a(r0, r2, r4)
            return
        L_0x010c:
            cif r0 = r12.a
            com.google.android.gms.awareness.snapshot.internal.SnapshotRequest r1 = r0.d
            java.util.ArrayList r1 = r1.b
            if (r1 == 0) goto L_0x01a1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x011c
            goto L_0x01a1
        L_0x011c:
            cie r5 = new cie
            r5.<init>(r0, r1)
            awuz r0 = defpackage.awuz.a
            awva r0 = r0.a()
            long r8 = r0.i()
            uxf r0 = new uxf
            r0.<init>()
            java.util.ArrayList r1 = r5.a
            int r3 = r1.size()
            r4 = 0
        L_0x0137:
            if (r4 >= r3) goto L_0x014d
            java.lang.Object r6 = r1.get(r4)
            com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl$TypeFilterImpl r6 = (com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl) r6
            java.lang.String r7 = r6.a()
            java.lang.String r6 = r6.b()
            r0.a(r7, r6)
            int r4 = r4 + 1
            goto L_0x0137
        L_0x014d:
            uyn r1 = new uyn
            r1.<init>()
            com.google.android.gms.nearby.messages.Strategy r3 = com.google.android.gms.nearby.messages.Strategy.b
            r1.a = r3
            com.google.android.gms.nearby.messages.MessageFilter r0 = r0.a()
            r1.b = r0
            uyo r0 = r1.a()
            uxj r1 = new uxj
            r1.<init>()
            java.lang.String r3 = "0p:com.google.android.contextmanager"
            r1.a(r3)
            r1.b()
            cif r3 = r5.c
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r3 = r3.c
            java.lang.String r3 = r3.b
            r1.c = r3
            uxk r1 = r1.a()
            android.content.Context r3 = defpackage.cbi.f()
            uxi r1 = defpackage.tcn.a((android.content.Context) r3, (defpackage.uxk) r1)
            acwa r0 = r1.a((defpackage.uxh) r5, (defpackage.uyo) r0)
            bwn r1 = defpackage.cbi.k()
            java.lang.String r3 = "SnapshotOperation_subscribeNearbyMessages"
            bvp r3 = defpackage.bvq.a(r3)
            java.util.concurrent.Executor r1 = r1.a((defpackage.bvp) r3)
            cid r3 = new cid
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r6 = "[SnapshotOperation] subscribe for beacon snapshot"
            r4 = r3
            r4.<init>(r5, r6, r7, r8)
            r0.a((java.util.concurrent.Executor) r1, (defpackage.acvp) r3)
            return
        L_0x01a1:
            r1 = 0
            r0.a(r2, r1)
            return
        L_0x01a6:
            cif r0 = r12.a
            android.content.Context r1 = defpackage.cbi.f()
            riq r3 = new riq
            r3.<init>()
            r3.c = r2
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r4 = r0.c
            java.lang.String r5 = r4.b
            r3.a = r5
            java.lang.String r4 = r4.d
            r3.b = r4
            rir r3 = r3.a()
            rhv r1 = defpackage.rij.a(r1, r3)
            com.google.android.gms.location.places.PlaceFilter r3 = new com.google.android.gms.location.places.PlaceFilter
            r3.<init>()
            icc r1 = r1.j
            rim r4 = new rim
            ibq r5 = defpackage.rij.b
            r4.<init>(r5, r1, r3)
            r1.a((defpackage.idf) r4)
            rib r1 = new rib
            r1.<init>()
            acwa r1 = defpackage.iux.a((defpackage.icf) r4, (defpackage.ick) r1)
            bwn r3 = defpackage.cbi.k()
            java.lang.String r4 = "SnapshotOperation_getCurrentPlace"
            bvp r4 = defpackage.bvq.a(r4)
            java.util.concurrent.Executor r3 = r3.a((defpackage.bvp) r4)
            chw r4 = new chw
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "[SnapshotOperation] getCurrentPlace"
            r4.<init>(r0, r5, r2)
            r1.a((java.util.concurrent.Executor) r3, (defpackage.acvp) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chv.run():void");
    }
}
