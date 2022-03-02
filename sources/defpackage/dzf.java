package defpackage;

/* renamed from: dzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dzf implements Runnable {
    private final Object a;
    private final icc b;
    private final eao c;
    private final dzb d;
    private final dye e;
    private final String f;
    private final boolean g;

    public dzf(Object obj, icc icc, eao eao, dzb dzb, String str, boolean z, dye dye) {
        this.a = obj;
        this.b = icc;
        this.c = eao;
        this.d = dzb;
        this.f = str;
        this.g = z;
        this.e = dye;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r6 = this;
            eao r0 = new eao
            r0.<init>()
            icc r1 = r6.b
            com.google.android.gms.common.ConnectionResult r1 = r1.f()
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x009b
            wvt r1 = new wvt
            r1.<init>()
            java.lang.String r2 = r6.f
            r1.a = r2
            java.lang.String r2 = "list_by_email_and_phone"
            r1.c = r2
            wvx r2 = new wvx
            r2.<init>()
            boolean r3 = r6.g
            r2.b = r3
            r3 = r3 ^ 1
            r2.c = r3
            r3 = 0
            r2.d = r3
            wvu r1 = r1.a()
            defpackage.iva.a((java.lang.Object) r1)
            r2.a = r1
            wvy r1 = new wvy
            r1.<init>(r2)
            wxk r2 = new wxk
            dzb r4 = r6.d
            r2.<init>(r4)
            ibq r4 = defpackage.wlt.a
            icc r4 = r6.b
            wxw r5 = new wxw
            r5.<init>(r4, r1, r2)
            idf r1 = r4.a((defpackage.idf) r5)
            icl r1 = r1.a()
            wvr r1 = (defpackage.wvr) r1
        L_0x0056:
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x0067
            icf r1 = r1.e()
            icl r1 = r1.a()
            wvr r1 = (defpackage.wvr) r1
            goto L_0x0056
        L_0x0067:
            com.google.android.gms.common.api.Status r2 = r1.aO()
            if (r2 == 0) goto L_0x009b
            com.google.android.gms.common.api.Status r2 = r1.aO()
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x0078
            goto L_0x009b
        L_0x0078:
            ilh r1 = r1.b()
            if (r1 == 0) goto L_0x00ab
        L_0x007e:
            int r2 = r1.a()     // Catch:{ all -> 0x0096 }
            if (r3 >= r2) goto L_0x0092
            java.lang.Object r2 = r1.a(r3)     // Catch:{ all -> 0x0096 }
            dze r2 = (defpackage.dze) r2     // Catch:{ all -> 0x0096 }
            com.google.android.gms.appinvite.model.ContactPerson r2 = r2.a     // Catch:{ all -> 0x0096 }
            r0.a((com.google.android.gms.appinvite.model.ContactPerson) r2)     // Catch:{ all -> 0x0096 }
            int r3 = r3 + 1
            goto L_0x007e
        L_0x0092:
            r1.c()
            goto L_0x00ab
        L_0x0096:
            r0 = move-exception
            r1.c()
            throw r0
        L_0x009b:
            r1 = 5
            java.lang.String r2 = "IdentityLoader"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "IdentityLoader"
            java.lang.String r2 = "Identity web people lookup error"
            android.util.Log.w(r1, r2)
        L_0x00ab:
            java.lang.Object r1 = r6.a
            monitor-enter(r1)
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x00c9 }
            if (r2 != 0) goto L_0x00c0
            eao r2 = r6.c     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r0 = r0.a     // Catch:{ all -> 0x00c9 }
            r2.a((java.util.Collection) r0)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r6.a     // Catch:{ all -> 0x00c9 }
            r0.notify()     // Catch:{ all -> 0x00c9 }
        L_0x00c0:
            monitor-exit(r1)     // Catch:{ all -> 0x00c9 }
            dye r0 = r6.e
            if (r0 == 0) goto L_0x00c8
            r0.i()
        L_0x00c8:
            return
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00cc:
            throw r0
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzf.run():void");
    }
}
