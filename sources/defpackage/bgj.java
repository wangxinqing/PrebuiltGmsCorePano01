package defpackage;

/* renamed from: bgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bgj implements Runnable {
    final /* synthetic */ bgk a;

    public bgj(bgk bgk) {
        this.a = bgk;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r12 = this;
            bgk r0 = r12.a
            java.lang.Object r0 = r0.g
            monitor-enter(r0)
            bgk r1 = r12.a     // Catch:{ all -> 0x0196 }
            boolean r1 = r1.h     // Catch:{ all -> 0x0196 }
            if (r1 != 0) goto L_0x0194
            bgk r1 = r12.a     // Catch:{ all -> 0x0196 }
            r2 = 1
            r1.h = r2     // Catch:{ all -> 0x0196 }
            monitor-exit(r0)     // Catch:{ all -> 0x0196 }
            r0 = 0
            bgk r1 = r12.a     // Catch:{ Exception -> 0x017a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017a }
            nps r4 = r1.b     // Catch:{ Exception -> 0x017a }
            npr r4 = r4.a()     // Catch:{ Exception -> 0x017a }
            r5 = 0
            if (r4 == 0) goto L_0x002a
            bhu r4 = r4.a     // Catch:{ Exception -> 0x017a }
            java.lang.String r6 = r4.b     // Catch:{ Exception -> 0x017a }
            java.lang.String r4 = r4.c     // Catch:{ Exception -> 0x017a }
            r10 = r4
            r9 = r6
            goto L_0x002c
        L_0x002a:
            r9 = r5
            r10 = r9
        L_0x002c:
            android.content.Context r7 = r1.a     // Catch:{ auda -> 0x016c }
            bhs r8 = r1.e     // Catch:{ auda -> 0x016c }
            nnt r11 = r1.d     // Catch:{ auda -> 0x016c }
            noe r4 = new noe     // Catch:{ auda -> 0x016c }
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ auda -> 0x016c }
            java.util.concurrent.LinkedBlockingQueue r6 = r4.b     // Catch:{ InterruptedException -> 0x0046 }
            r7 = 50000(0xc350, double:2.47033E-319)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0046 }
            java.lang.Object r6 = r6.poll(r7, r9)     // Catch:{ InterruptedException -> 0x0046 }
            com.google.android.gms.gass.internal.ProgramResponse r6 = (com.google.android.gms.gass.internal.ProgramResponse) r6     // Catch:{ InterruptedException -> 0x0046 }
            goto L_0x004f
        L_0x0046:
            r6 = move-exception
            r7 = 2009(0x7d9, float:2.815E-42)
            long r8 = r4.c     // Catch:{ auda -> 0x016c }
            r4.a(r7, r8, r6)     // Catch:{ auda -> 0x016c }
            r6 = r5
        L_0x004f:
            r7 = 3004(0xbbc, float:4.21E-42)
            long r8 = r4.c     // Catch:{ auda -> 0x016c }
            r4.a(r7, r8)     // Catch:{ auda -> 0x016c }
            if (r6 == 0) goto L_0x0064
            int r4 = r6.c     // Catch:{ auda -> 0x016c }
            r7 = 7
            if (r4 != r7) goto L_0x0061
            r4 = 3
            defpackage.nnt.a = r4     // Catch:{ auda -> 0x016c }
            goto L_0x0064
        L_0x0061:
            r4 = 2
            defpackage.nnt.a = r4     // Catch:{ auda -> 0x016c }
        L_0x0064:
            if (r6 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            com.google.android.gms.gass.internal.ProgramResponse r6 = defpackage.noe.c()     // Catch:{ auda -> 0x016c }
        L_0x006b:
            byte[] r4 = r6.b     // Catch:{ auda -> 0x016c }
            if (r4 != 0) goto L_0x0071
            goto L_0x015f
        L_0x0071:
            int r6 = r4.length     // Catch:{ auda -> 0x016c }
            if (r6 == 0) goto L_0x015f
            auay r4 = defpackage.auay.a((byte[]) r4)     // Catch:{ auda -> 0x016c }
            aubs r6 = defpackage.aubs.c()     // Catch:{ auda -> 0x016c }
            bht r7 = defpackage.bht.e     // Catch:{ auda -> 0x016c }
            aubc r4 = r4.h()     // Catch:{ auda -> 0x015d }
            r8 = 4
            java.lang.Object r7 = r7.c(r8)     // Catch:{ auda -> 0x015d }
            aucj r7 = (defpackage.aucj) r7     // Catch:{ auda -> 0x015d }
            aueh r8 = defpackage.aueh.a     // Catch:{ IOException -> 0x0143, RuntimeException -> 0x0132 }
            aueq r8 = r8.a((java.lang.Object) r7)     // Catch:{ IOException -> 0x0143, RuntimeException -> 0x0132 }
            aubd r9 = defpackage.aubd.a((defpackage.aubc) r4)     // Catch:{ IOException -> 0x0143, RuntimeException -> 0x0132 }
            r8.a(r7, r9, r6)     // Catch:{ IOException -> 0x0143, RuntimeException -> 0x0132 }
            r8.d(r7)     // Catch:{ IOException -> 0x0143, RuntimeException -> 0x0132 }
            r4.a((int) r0)     // Catch:{ auda -> 0x0130 }
            defpackage.aucj.b((defpackage.aucj) r7)     // Catch:{ auda -> 0x016c }
            bht r7 = (defpackage.bht) r7     // Catch:{ auda -> 0x016c }
            bhu r4 = r7.b     // Catch:{ auda -> 0x016c }
            if (r4 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            bhu r4 = defpackage.bhu.g     // Catch:{ auda -> 0x016c }
        L_0x00a8:
            java.lang.String r4 = r4.b     // Catch:{ auda -> 0x016c }
            boolean r4 = r4.isEmpty()     // Catch:{ auda -> 0x016c }
            if (r4 == 0) goto L_0x00b2
            goto L_0x0123
        L_0x00b2:
            bhu r4 = r7.b     // Catch:{ auda -> 0x016c }
            if (r4 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            bhu r4 = defpackage.bhu.g     // Catch:{ auda -> 0x016c }
        L_0x00b9:
            java.lang.String r4 = r4.c     // Catch:{ auda -> 0x016c }
            boolean r4 = r4.isEmpty()     // Catch:{ auda -> 0x016c }
            if (r4 != 0) goto L_0x0123
            auay r4 = r7.d     // Catch:{ auda -> 0x016c }
            byte[] r4 = r4.k()     // Catch:{ auda -> 0x016c }
            int r4 = r4.length     // Catch:{ auda -> 0x016c }
            if (r4 == 0) goto L_0x0123
            nps r4 = r1.b     // Catch:{ auda -> 0x016c }
            npr r4 = r4.a()     // Catch:{ auda -> 0x016c }
            if (r4 != 0) goto L_0x00d3
            goto L_0x00f8
        L_0x00d3:
            bhu r4 = r4.a     // Catch:{ auda -> 0x016c }
            bhu r6 = r7.b     // Catch:{ auda -> 0x016c }
            if (r6 == 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            bhu r6 = defpackage.bhu.g     // Catch:{ auda -> 0x016c }
        L_0x00dc:
            java.lang.String r6 = r6.b     // Catch:{ auda -> 0x016c }
            java.lang.String r8 = r4.b     // Catch:{ auda -> 0x016c }
            boolean r6 = r6.equals(r8)     // Catch:{ auda -> 0x016c }
            if (r6 == 0) goto L_0x00f8
            bhu r6 = r7.b     // Catch:{ auda -> 0x016c }
            if (r6 == 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            bhu r6 = defpackage.bhu.g     // Catch:{ auda -> 0x016c }
        L_0x00ed:
            java.lang.String r6 = r6.c     // Catch:{ auda -> 0x016c }
            java.lang.String r4 = r4.c     // Catch:{ auda -> 0x016c }
            boolean r4 = r6.equals(r4)     // Catch:{ auda -> 0x016c }
            if (r4 == 0) goto L_0x00f8
            goto L_0x0123
        L_0x00f8:
            nps r4 = r1.b     // Catch:{ auda -> 0x016c }
            boolean r4 = r4.a(r7, r5)     // Catch:{ auda -> 0x016c }
            if (r4 != 0) goto L_0x010e
            nnt r4 = r1.d     // Catch:{ auda -> 0x016c }
            r5 = 4009(0xfa9, float:5.618E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ auda -> 0x016c }
            long r6 = r6 - r2
            r4.a(r5, r6)     // Catch:{ auda -> 0x016c }
            goto L_0x0186
        L_0x010e:
            npx r4 = r1.c     // Catch:{ auda -> 0x016c }
            nps r5 = r1.b     // Catch:{ auda -> 0x016c }
            npr r5 = r5.a()     // Catch:{ auda -> 0x016c }
            r4.a((defpackage.npr) r5)     // Catch:{ auda -> 0x016c }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ auda -> 0x016c }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r1.f = r4     // Catch:{ auda -> 0x016c }
            goto L_0x0186
        L_0x0123:
            nnt r4 = r1.d     // Catch:{ auda -> 0x016c }
            r5 = 5010(0x1392, float:7.02E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ auda -> 0x016c }
            long r6 = r6 - r2
            r4.a(r5, r6)     // Catch:{ auda -> 0x016c }
            goto L_0x0186
        L_0x0130:
            r4 = move-exception
            throw r4     // Catch:{ auda -> 0x015d }
        L_0x0132:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()     // Catch:{ auda -> 0x015d }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x015d }
            if (r5 == 0) goto L_0x0142
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ auda -> 0x015d }
            auda r4 = (defpackage.auda) r4     // Catch:{ auda -> 0x015d }
            throw r4     // Catch:{ auda -> 0x015d }
        L_0x0142:
            throw r4     // Catch:{ auda -> 0x015d }
        L_0x0143:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()     // Catch:{ auda -> 0x015d }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x015d }
            if (r5 != 0) goto L_0x0156
            auda r5 = new auda     // Catch:{ auda -> 0x015d }
            java.lang.String r4 = r4.getMessage()     // Catch:{ auda -> 0x015d }
            r5.<init>((java.lang.String) r4)     // Catch:{ auda -> 0x015d }
            throw r5     // Catch:{ auda -> 0x015d }
        L_0x0156:
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ auda -> 0x015d }
            auda r4 = (defpackage.auda) r4     // Catch:{ auda -> 0x015d }
            throw r4     // Catch:{ auda -> 0x015d }
        L_0x015d:
            r4 = move-exception
            throw r4     // Catch:{ auda -> 0x016c }
        L_0x015f:
            nnt r4 = r1.d     // Catch:{ auda -> 0x016c }
            r5 = 5009(0x1391, float:7.019E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ auda -> 0x016c }
            long r6 = r6 - r2
            r4.a(r5, r6)     // Catch:{ auda -> 0x016c }
            goto L_0x0186
        L_0x016c:
            r4 = move-exception
            nnt r1 = r1.d     // Catch:{ Exception -> 0x017a }
            r5 = 4002(0xfa2, float:5.608E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017a }
            long r6 = r6 - r2
            r1.a(r5, r6, r4)     // Catch:{ Exception -> 0x017a }
            goto L_0x0186
        L_0x017a:
            r1 = move-exception
            bgk r2 = r12.a
            nnt r2 = r2.d
            r3 = 2023(0x7e7, float:2.835E-42)
            r4 = -1
            r2.a(r3, r4, r1)
        L_0x0186:
            bgk r1 = r12.a
            java.lang.Object r1 = r1.g
            monitor-enter(r1)
            bgk r2 = r12.a     // Catch:{ all -> 0x0191 }
            r2.h = r0     // Catch:{ all -> 0x0191 }
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            return
        L_0x0191:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0191 }
            throw r0
        L_0x0194:
            monitor-exit(r0)     // Catch:{ all -> 0x0196 }
            return
        L_0x0196:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0196 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgj.run():void");
    }
}
