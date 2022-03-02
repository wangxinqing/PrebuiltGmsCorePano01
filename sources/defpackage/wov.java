package defpackage;

/* renamed from: wov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wov implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ xqu b;
    final /* synthetic */ wow c;

    public wov(wow wow, String str, xqu xqu) {
        this.c = wow;
        this.a = str;
        this.b = xqu;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r9 = this;
            wow r0 = r9.c
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            wow r1 = r9.c     // Catch:{ all -> 0x00d9 }
            wph r1 = r1.c     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x00d7
            java.lang.String r1 = r9.a     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = defpackage.xqv.a(r1)     // Catch:{ all -> 0x00d9 }
            r2 = 0
            wow r3 = r9.c     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            wph r3 = r3.c     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            wpg r3 = r3.a(r1)     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            if (r3 != 0) goto L_0x009b
            wow r3 = r9.c     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            wph r3 = r3.c     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            avzy r3 = r3.a     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            avzv r1 = r3.b(r1)     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            if (r1 == 0) goto L_0x002e
            wpf r3 = new wpf     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            goto L_0x002f
        L_0x002e:
            r3 = r2
        L_0x002f:
            if (r3 == 0) goto L_0x009a
            avzv r1 = r3.a     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            avzy r4 = r1.d     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            monitor-enter(r4)     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            avzw r5 = r1.a     // Catch:{ all -> 0x0097 }
            avzv r6 = r5.f     // Catch:{ all -> 0x0097 }
            if (r6 != r1) goto L_0x0091
            boolean r6 = r5.e     // Catch:{ all -> 0x0097 }
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x0046
            boolean[] r6 = r1.b     // Catch:{ all -> 0x0097 }
            r6[r8] = r7     // Catch:{ all -> 0x0097 }
        L_0x0046:
            java.io.File[] r5 = r5.d     // Catch:{ all -> 0x0097 }
            r5 = r5[r8]     // Catch:{ all -> 0x0097 }
            avzy r6 = r1.d     // Catch:{ FileNotFoundException -> 0x0059 }
            awdj r6 = r6.b     // Catch:{ FileNotFoundException -> 0x0059 }
            batz r5 = r6.a(r5)     // Catch:{ FileNotFoundException -> 0x0059 }
            avzu r6 = new avzu     // Catch:{ all -> 0x0097 }
            r6.<init>(r1, r5)     // Catch:{ all -> 0x0097 }
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            goto L_0x005d
        L_0x0059:
            r1 = move-exception
            batz r6 = defpackage.avzy.i     // Catch:{ all -> 0x0097 }
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
        L_0x005d:
            bate r2 = defpackage.batq.a((defpackage.batz) r6)     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            xqu r1 = r9.b     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            byte[] r1 = r1.k()     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            r2.a(r1)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            avzv r1 = r3.a     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            avzy r3 = r1.d     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            monitor-enter(r3)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            boolean r4 = r1.c     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x0079
            avzy r4 = r1.d     // Catch:{ all -> 0x008a }
            r4.a(r1, r7)     // Catch:{ all -> 0x008a }
            goto L_0x0085
        L_0x0079:
            avzy r4 = r1.d     // Catch:{ all -> 0x008a }
            r4.a(r1, r8)     // Catch:{ all -> 0x008a }
            avzy r4 = r1.d     // Catch:{ all -> 0x008a }
            avzw r1 = r1.a     // Catch:{ all -> 0x008a }
            r4.a((defpackage.avzw) r1)     // Catch:{ all -> 0x008a }
        L_0x0085:
            monitor-exit(r3)     // Catch:{ all -> 0x008a }
            r2.close()     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            goto L_0x00a2
        L_0x008a:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008a }
            throw r1     // Catch:{ IOException -> 0x008f, all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x00c8
        L_0x008f:
            r1 = move-exception
            goto L_0x00b1
        L_0x0091:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            r1.<init>()     // Catch:{ all -> 0x0097 }
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            throw r1     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
        L_0x009a:
            goto L_0x00a2
        L_0x009b:
            baua r1 = r3.a()     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
            r1.close()     // Catch:{ IOException -> 0x00b0, all -> 0x00ae }
        L_0x00a2:
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00d7
        L_0x00a8:
            r1 = move-exception
            java.lang.String r2 = "AvatarCacheImpl"
            java.lang.String r3 = "put: Error closing outputStream."
            goto L_0x00c3
        L_0x00ae:
            r1 = move-exception
            goto L_0x00c8
        L_0x00b0:
            r1 = move-exception
        L_0x00b1:
            java.lang.String r3 = "AvatarCacheImpl"
            java.lang.String r4 = "put: Error adding byte[] to disk cache."
            android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00d7
        L_0x00be:
            r1 = move-exception
            java.lang.String r2 = "AvatarCacheImpl"
            java.lang.String r3 = "put: Error closing outputStream."
        L_0x00c3:
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x00d9 }
            goto L_0x00d7
        L_0x00c7:
            r1 = move-exception
        L_0x00c8:
            if (r2 == 0) goto L_0x00d6
            r2.close()     // Catch:{ IOException -> 0x00ce }
            goto L_0x00d6
        L_0x00ce:
            r2 = move-exception
            java.lang.String r3 = "AvatarCacheImpl"
            java.lang.String r4 = "put: Error closing outputStream."
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x00d9 }
        L_0x00d6:
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d7:
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            return
        L_0x00d9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wov.run():void");
    }
}
