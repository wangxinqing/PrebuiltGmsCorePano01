package defpackage;

/* renamed from: nve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nve implements Runnable {
    final /* synthetic */ nvi a;
    final /* synthetic */ aubc b;
    final /* synthetic */ nvh c;

    public nve(nvh nvh, nvi nvi, aubc aubc) {
        this.c = nvh;
        this.a = nvi;
        this.b = aubc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v16 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            nvh r2 = r1.c
            nvi r3 = r1.a
            aubc r4 = r1.b
            r5 = 16
            byte r0 = r4.B()     // Catch:{ IOException -> 0x028a }
            r3.j = r0     // Catch:{ IOException -> 0x028a }
            r6 = 0
            r7 = 1
            r8 = 0
        L_0x0013:
            boolean r0 = r3.f
            if (r0 == 0) goto L_0x0289
            r9 = -1
            byte r0 = r4.B()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0022
        L_0x001d:
            r0 = move-exception
            goto L_0x0285
        L_0x0020:
            r0 = move-exception
            r0 = -1
        L_0x0022:
            r10 = 28
            njy r11 = r2.u     // Catch:{ IOException -> 0x0270 }
            java.lang.String r12 = "readMessage"
            amky r11 = defpackage.njy.a((defpackage.njy) r11, (java.lang.String) r12)     // Catch:{ IOException -> 0x0270 }
            acrz r12 = r2.t     // Catch:{ all -> 0x0262 }
            r13 = 500(0x1f4, double:2.47E-321)
            r12.a((long) r13)     // Catch:{ all -> 0x0262 }
            boolean r12 = r3.f     // Catch:{ all -> 0x0262 }
            if (r12 == 0) goto L_0x025b
            if (r0 < 0) goto L_0x0234
            int r12 = r4.t()     // Catch:{ all -> 0x0262 }
            int r13 = r2.n     // Catch:{ all -> 0x0262 }
            int r14 = r12 + 2
            int r13 = r13 + r14
            r2.n = r13     // Catch:{ all -> 0x0262 }
            r14 = 128(0x80, float:1.794E-43)
            if (r12 <= r14) goto L_0x004c
            int r13 = r13 + 1
            r2.n = r13     // Catch:{ all -> 0x0262 }
        L_0x004c:
            byte[] r13 = new byte[r6]     // Catch:{ all -> 0x0262 }
            if (r12 <= 0) goto L_0x0054
            byte[] r13 = r4.e(r12)     // Catch:{ all -> 0x0262 }
        L_0x0054:
            audx r12 = defpackage.nuu.a(r0, r13)     // Catch:{ all -> 0x0262 }
            int r13 = r3.q     // Catch:{ all -> 0x0262 }
            int r14 = r3.r     // Catch:{ all -> 0x0262 }
            defpackage.nuo.a(r6, r0, r12, r13, r14)     // Catch:{ all -> 0x0262 }
            int r0 = r2.m     // Catch:{ all -> 0x0262 }
            int r0 = r0 + r7
            r2.m = r0     // Catch:{ all -> 0x0262 }
            boolean r0 = r12 instanceof defpackage.amnt     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x00f5
            amnt r12 = (defpackage.amnt) r12     // Catch:{ all -> 0x0262 }
            amnd r0 = r12.a     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            amnd r0 = defpackage.amnd.c     // Catch:{ all -> 0x0262 }
        L_0x0071:
            int r0 = r0.a     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x00e0
            r2.v = r6     // Catch:{ all -> 0x0262 }
            r13 = 0
            r2.l = r13     // Catch:{ all -> 0x0262 }
            r2.j = r6     // Catch:{ all -> 0x0262 }
            r2.k = r6     // Catch:{ all -> 0x0262 }
            int r0 = r2.i     // Catch:{ all -> 0x0262 }
            int r0 = r0 + r7
            r2.i = r0     // Catch:{ all -> 0x0262 }
            r2.f = r7     // Catch:{ all -> 0x0262 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0262 }
            r2.g = r13     // Catch:{ all -> 0x0262 }
            java.net.Socket r0 = r3.b     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x009e
            axlc r9 = defpackage.axlc.a     // Catch:{ all -> 0x0262 }
            axld r9 = r9.a()     // Catch:{ all -> 0x0262 }
            long r13 = r9.O()     // Catch:{ all -> 0x0262 }
            int r9 = (int) r13     // Catch:{ all -> 0x0262 }
            r0.setSoTimeout(r9)     // Catch:{ all -> 0x0262 }
        L_0x009e:
            r3.g = r7     // Catch:{ all -> 0x0262 }
            java.util.List r9 = r2.e     // Catch:{ all -> 0x0262 }
            monitor-enter(r9)     // Catch:{ all -> 0x0262 }
            java.util.List r0 = r2.e     // Catch:{ all -> 0x00dd }
            r0.clear()     // Catch:{ all -> 0x00dd }
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            java.util.List r9 = r2.h     // Catch:{ all -> 0x0262 }
            monitor-enter(r9)     // Catch:{ all -> 0x0262 }
            java.util.concurrent.BlockingQueue r13 = r3.o     // Catch:{ all -> 0x00da }
            monitor-enter(r13)     // Catch:{ all -> 0x00da }
            java.util.concurrent.BlockingQueue r0 = r3.o     // Catch:{ all -> 0x00d7 }
            java.util.List r14 = r2.h     // Catch:{ all -> 0x00d7 }
            r0.addAll(r14)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r13)     // Catch:{ all -> 0x00d7 }
            java.util.List r0 = r2.h     // Catch:{ all -> 0x00da }
            r0.clear()     // Catch:{ all -> 0x00da }
            monitor-exit(r9)     // Catch:{ all -> 0x00da }
            int r0 = defpackage.nuu.b(r12)     // Catch:{ all -> 0x0262 }
            r2.a((defpackage.nvi) r3, (int) r0)     // Catch:{ all -> 0x0262 }
            r2.a((defpackage.amnt) r12)     // Catch:{ all -> 0x0262 }
            if (r11 != 0) goto L_0x00ca
            goto L_0x00cd
        L_0x00ca:
            r11.close()     // Catch:{ IOException -> 0x00d3 }
        L_0x00cd:
            r2.j()
            r8 = 1
            goto L_0x0013
        L_0x00d3:
            r0 = move-exception
            r8 = 1
            goto L_0x0271
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x00e0:
            r2.a((defpackage.amnt) r12)     // Catch:{ all -> 0x0262 }
            int r0 = r2.k     // Catch:{ all -> 0x0262 }
            int r0 = r0 + r7
            r2.k = r0     // Catch:{ all -> 0x0262 }
            r0 = 4
            r2.b(r3, r0)     // Catch:{ all -> 0x0262 }
            if (r11 == 0) goto L_0x00f1
            r11.close()     // Catch:{ IOException -> 0x0270 }
        L_0x00f1:
            r2.j()
            return
        L_0x00f5:
            if (r8 != 0) goto L_0x0102
            r0 = 14
            r2.b(r3, r0)     // Catch:{ all -> 0x0262 }
            if (r11 == 0) goto L_0x00f1
            r11.close()     // Catch:{ IOException -> 0x0270 }
            goto L_0x00f1
        L_0x0102:
            boolean r0 = r12 instanceof defpackage.amnj     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0132
            amng r0 = defpackage.amng.e     // Catch:{ all -> 0x0262 }
            aucd r0 = r0.o()     // Catch:{ all -> 0x0262 }
            amnf r0 = (defpackage.amnf) r0     // Catch:{ all -> 0x0262 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r13 = r2.q     // Catch:{ all -> 0x0262 }
            int r13 = r13.e()     // Catch:{ all -> 0x0262 }
            if (r13 == r9) goto L_0x012f
            boolean r9 = r0.c     // Catch:{ all -> 0x0262 }
            if (r9 != 0) goto L_0x011b
            goto L_0x0120
        L_0x011b:
            r0.c()     // Catch:{ all -> 0x0262 }
            r0.c = r6     // Catch:{ all -> 0x0262 }
        L_0x0120:
            aucj r9 = r0.b     // Catch:{ all -> 0x0262 }
            amng r9 = (defpackage.amng) r9     // Catch:{ all -> 0x0262 }
            int r14 = r9.a     // Catch:{ all -> 0x0262 }
            r14 = r14 | r5
            r9.a = r14     // Catch:{ all -> 0x0262 }
            r9.d = r13     // Catch:{ all -> 0x0262 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r9 = r2.q     // Catch:{ all -> 0x0262 }
            r9.i = r13     // Catch:{ all -> 0x0262 }
        L_0x012f:
            defpackage.nvh.a((defpackage.nvi) r3, (defpackage.audw) r0)     // Catch:{ all -> 0x0262 }
        L_0x0132:
            boolean r0 = r12 instanceof defpackage.amna     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x0228
            int r0 = defpackage.nuu.b(r12)     // Catch:{ all -> 0x0262 }
            r2.a((defpackage.nvi) r3, (int) r0)     // Catch:{ all -> 0x0262 }
            boolean r0 = r12 instanceof defpackage.amnn     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0198
            r0 = r12
            amnn r0 = (defpackage.amnn) r0     // Catch:{ all -> 0x0262 }
            amne r0 = r0.d     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            amne r0 = defpackage.amne.d     // Catch:{ all -> 0x0262 }
        L_0x014b:
            int r9 = r0.b     // Catch:{ all -> 0x0262 }
            r13 = 12
            if (r9 != r13) goto L_0x0198
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x0262 }
            auay r0 = defpackage.auay.a((java.lang.String) r0)     // Catch:{ all -> 0x0262 }
            amnu r9 = defpackage.amnu.b     // Catch:{ all -> 0x0262 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r9, (defpackage.auay) r0)     // Catch:{ all -> 0x0262 }
            amnu r0 = (defpackage.amnu) r0     // Catch:{ all -> 0x0262 }
            aucx r0 = r0.a     // Catch:{ all -> 0x0262 }
            r2.a((defpackage.nvi) r3, (java.util.List) r0)     // Catch:{ all -> 0x0262 }
            nts r0 = r2.p     // Catch:{ all -> 0x0262 }
            nrj r9 = r2.r     // Catch:{ all -> 0x0262 }
            android.content.Context r13 = r0.b     // Catch:{ all -> 0x0262 }
            boolean r13 = defpackage.aekv.a(r13)     // Catch:{ all -> 0x0262 }
            if (r13 != 0) goto L_0x0198
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r13.<init>()     // Catch:{ all -> 0x0262 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0262 }
            r14.<init>()     // Catch:{ all -> 0x0262 }
            ntp r15 = new ntp     // Catch:{ all -> 0x0262 }
            r15.<init>(r9, r14, r13, r2)     // Catch:{ all -> 0x0262 }
            r0.a((defpackage.ntr) r15)     // Catch:{ all -> 0x0262 }
            int r9 = r13.length()     // Catch:{ all -> 0x0262 }
            if (r9 <= 0) goto L_0x0195
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0262 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0262 }
            r9[r6] = r13     // Catch:{ all -> 0x0262 }
            java.lang.String r13 = "Resent %s"
            com.google.android.gms.gcm.GcmChimeraService.a(r13, r9)     // Catch:{ all -> 0x0262 }
        L_0x0195:
            r0.a((java.util.List) r14)     // Catch:{ all -> 0x0262 }
        L_0x0198:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0262 }
            defpackage.nuo.a((defpackage.audx) r12)     // Catch:{ all -> 0x0262 }
            nva r0 = r2.s     // Catch:{ all -> 0x0262 }
            r0.c(r7)     // Catch:{ all -> 0x0262 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r0 = r2.q     // Catch:{ all -> 0x0262 }
            r0.d()     // Catch:{ all -> 0x0262 }
            boolean r0 = r12 instanceof defpackage.amnc     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x01ba
            nrj r9 = r2.r     // Catch:{ all -> 0x0262 }
            r15 = r12
            amnc r15 = (defpackage.amnc) r15     // Catch:{ all -> 0x0262 }
            nrc r6 = new nrc     // Catch:{ all -> 0x0262 }
            r6.<init>(r9, r15, r13)     // Catch:{ all -> 0x0262 }
            defpackage.nrj.a((defpackage.nri) r6)     // Catch:{ all -> 0x0262 }
        L_0x01ba:
            android.content.Context r6 = r2.o     // Catch:{ all -> 0x0262 }
            boolean r6 = defpackage.aekv.a(r6)     // Catch:{ all -> 0x0262 }
            if (r6 != 0) goto L_0x01db
            nva r6 = r2.s     // Catch:{ all -> 0x0262 }
            boolean r6 = r6.e()     // Catch:{ all -> 0x0262 }
            if (r6 != 0) goto L_0x01db
            android.content.Context r6 = r2.o     // Catch:{ all -> 0x0262 }
            boolean r9 = defpackage.qxt.a()     // Catch:{ all -> 0x0262 }
            if (r9 == 0) goto L_0x01d8
            nxn r9 = defpackage.nxn.CLOUD_MESSAGE_RECEIVED     // Catch:{ all -> 0x0262 }
            defpackage.qxt.a(r6, r9)     // Catch:{ all -> 0x0262 }
            goto L_0x01db
        L_0x01d8:
            defpackage.aaaz.c()     // Catch:{ all -> 0x0262 }
        L_0x01db:
            if (r0 == 0) goto L_0x01fc
            amnc r12 = (defpackage.amnc) r12     // Catch:{ all -> 0x0262 }
            boolean r0 = r12.p     // Catch:{ all -> 0x0262 }
            java.lang.String r6 = r12.h     // Catch:{ all -> 0x0262 }
            boolean r9 = defpackage.amrk.a((java.lang.String) r6)     // Catch:{ all -> 0x0262 }
            if (r9 != 0) goto L_0x01fb
            java.util.List r9 = r2.e     // Catch:{ all -> 0x0262 }
            monitor-enter(r9)     // Catch:{ all -> 0x0262 }
            java.util.List r12 = r2.e     // Catch:{ all -> 0x01f8 }
            r12.add(r6)     // Catch:{ all -> 0x01f8 }
            monitor-exit(r9)     // Catch:{ all -> 0x01f8 }
            nts r9 = r2.p     // Catch:{ all -> 0x0262 }
            r9.a((java.lang.String) r6)     // Catch:{ all -> 0x0262 }
            goto L_0x01fd
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01f8 }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x01fb:
            goto L_0x01fd
        L_0x01fc:
            r0 = 0
        L_0x01fd:
            java.util.ArrayList r6 = r3.m     // Catch:{ all -> 0x0262 }
            monitor-enter(r6)     // Catch:{ all -> 0x0262 }
            int r9 = r3.q     // Catch:{ all -> 0x0225 }
            int r9 = r9 + r7
            r3.q = r9     // Catch:{ all -> 0x0225 }
            int r12 = r3.p     // Catch:{ all -> 0x0225 }
            int r9 = r9 - r12
            long r12 = (long) r9     // Catch:{ all -> 0x0225 }
            axkb r9 = defpackage.axkb.a     // Catch:{ all -> 0x0225 }
            axkc r9 = r9.b()     // Catch:{ all -> 0x0225 }
            long r14 = r9.a()     // Catch:{ all -> 0x0225 }
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 < 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            if (r0 == 0) goto L_0x021d
        L_0x021a:
            defpackage.nvh.a((defpackage.nvi) r3)     // Catch:{ all -> 0x0225 }
        L_0x021d:
            monitor-exit(r6)     // Catch:{ all -> 0x0225 }
            if (r11 != 0) goto L_0x0221
            goto L_0x027f
        L_0x0221:
            r11.close()     // Catch:{ IOException -> 0x0270 }
            goto L_0x027f
        L_0x0225:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0225 }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x0228:
            r0 = 18
            r2.b(r3, r0)     // Catch:{ all -> 0x0262 }
            if (r11 == 0) goto L_0x00f1
            r11.close()     // Catch:{ IOException -> 0x0270 }
            goto L_0x00f1
        L_0x0234:
            boolean r6 = r3.k     // Catch:{ all -> 0x0262 }
            if (r6 != 0) goto L_0x0250
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r9 = 45
            r6.<init>(r9)     // Catch:{ all -> 0x0262 }
            java.lang.String r9 = "Unexpected connection close (FIN) "
            r6.append(r9)     // Catch:{ all -> 0x0262 }
            r6.append(r0)     // Catch:{ all -> 0x0262 }
            r6.toString()     // Catch:{ all -> 0x0262 }
            r0 = 20
            r2.b(r3, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0254
        L_0x0250:
            r2.b(r3, r10)     // Catch:{ all -> 0x0262 }
        L_0x0254:
            if (r11 == 0) goto L_0x00f1
            r11.close()     // Catch:{ IOException -> 0x0270 }
            goto L_0x00f1
        L_0x025b:
            if (r11 == 0) goto L_0x00f1
            r11.close()     // Catch:{ IOException -> 0x0270 }
            goto L_0x00f1
        L_0x0262:
            r0 = move-exception
            r6 = r0
            if (r11 == 0) goto L_0x026f
            r11.close()     // Catch:{ all -> 0x026a }
            goto L_0x026f
        L_0x026a:
            r0 = move-exception
            r9 = r0
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r9)     // Catch:{ IOException -> 0x0270 }
        L_0x026f:
            throw r6     // Catch:{ IOException -> 0x0270 }
        L_0x0270:
            r0 = move-exception
        L_0x0271:
            boolean r0 = r3.k     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x027b
            r0 = 19
            r2.b(r3, r0)     // Catch:{ all -> 0x001d }
            goto L_0x027f
        L_0x027b:
            r2.b(r3, r10)     // Catch:{ all -> 0x001d }
        L_0x027f:
            r2.j()
            r6 = 0
            goto L_0x0013
        L_0x0285:
            r2.j()
            throw r0
        L_0x0289:
            return
        L_0x028a:
            r0 = move-exception
            r2.b(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nve.run():void");
    }
}
