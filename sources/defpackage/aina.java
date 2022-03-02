package defpackage;

/* renamed from: aina  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aina extends aimr {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aina(aing aing, aiml aiml) {
        super(aing, aiml);
        this.a = aing;
    }

    public final aoaq a() {
        return aoaq.NOT_INITIALIZED;
    }

    public final String g() {
        return "NotInitializedState";
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x032c A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0356 A[Catch:{ IOException -> 0x04c7 }] */
    public final boolean a(android.os.Message r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            boolean r2 = defpackage.aikq.a
            int r2 = r0.what
            r3 = 5
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 != r4) goto L_0x0010
            r7 = 0
            goto L_0x0015
        L_0x0010:
            if (r2 != r3) goto L_0x0014
            r7 = 0
            goto L_0x0015
        L_0x0014:
            r7 = 1
        L_0x0015:
            java.lang.String r8 = "Received add or remove geofence request before initialized."
            defpackage.irk.a((boolean) r7, (java.lang.Object) r8)
            r7 = 32
            r8 = 2
            if (r2 == r8) goto L_0x0058
            java.lang.String r4 = "GeofencerStateMachine"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L_0x0053
            aing r3 = r1.a
            java.lang.String r2 = r3.a((int) r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + r7
            r4.<init>(r3)
            java.lang.String r3 = "Received "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " in NotInitializedState"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "GeofencerStateMachine"
            defpackage.aikq.c(r3, r2)
        L_0x0053:
            boolean r0 = super.b(r27)
            return r0
        L_0x0058:
            boolean r2 = defpackage.aikq.a
            aiml r2 = r1.b
            java.lang.Object r0 = r0.obj
            r9 = r0
            android.content.Intent r9 = (android.content.Intent) r9
            ajpm r10 = r2.n
            byte[] r0 = r10.b()
            r10.b = r0
            byte[] r0 = r10.b
            if (r0 == 0) goto L_0x0072
            byte[] r0 = r10.b
            int r0 = r0.length
            if (r0 == r7) goto L_0x00ac
        L_0x0072:
            boolean r0 = defpackage.aikq.a
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            byte[] r7 = new byte[r7]
            r0.nextBytes(r7)
            java.io.DataOutputStream r12 = new java.io.DataOutputStream     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009e, all -> 0x009a }
            android.content.Context r0 = r10.a     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009e, all -> 0x009a }
            java.lang.String r13 = r10.c     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009e, all -> 0x009a }
            java.io.FileOutputStream r0 = r0.openFileOutput(r13, r6)     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009e, all -> 0x009a }
            r12.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009e, all -> 0x009a }
            r12.writeShort(r5)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0096, all -> 0x0092 }
            r12.write(r7)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0096, all -> 0x0092 }
            goto L_0x00a7
        L_0x0092:
            r0 = move-exception
            r11 = r12
            goto L_0x0565
        L_0x0096:
            r0 = move-exception
            goto L_0x00a0
        L_0x0098:
            r0 = move-exception
            goto L_0x00a5
        L_0x009a:
            r0 = move-exception
            r11 = 0
            goto L_0x0565
        L_0x009e:
            r0 = move-exception
            r12 = 0
        L_0x00a0:
            boolean r0 = defpackage.aikq.a     // Catch:{ all -> 0x0563 }
            goto L_0x00a7
        L_0x00a3:
            r0 = move-exception
            r12 = 0
        L_0x00a5:
            boolean r0 = defpackage.aikq.a     // Catch:{ all -> 0x0563 }
        L_0x00a7:
            defpackage.ajre.a((java.io.Closeable) r12)
            r10.b = r7
        L_0x00ac:
            aisl r0 = r2.d
            ajpm r7 = r2.n
            aiab r7 = r7.a()
            java.lang.Object r10 = r0.h
            monitor-enter(r10)
            ahys r12 = new ahys     // Catch:{ all -> 0x0560 }
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x0560 }
            android.content.Context r14 = r0.b     // Catch:{ all -> 0x0560 }
            java.io.File r14 = r14.getFilesDir()     // Catch:{ all -> 0x0560 }
            java.lang.String r15 = r0.e     // Catch:{ all -> 0x0560 }
            r13.<init>(r14, r15)     // Catch:{ all -> 0x0560 }
            r12.<init>(r8, r13, r7)     // Catch:{ all -> 0x0560 }
            r0.i = r12     // Catch:{ all -> 0x0560 }
            r7 = 7
            ahys r12 = r0.i     // Catch:{ IOException -> 0x010b }
            ailr r13 = defpackage.ailr.e     // Catch:{ IOException -> 0x010b }
            java.lang.Object r13 = r13.c(r7)     // Catch:{ IOException -> 0x010b }
            auef r13 = (defpackage.auef) r13     // Catch:{ IOException -> 0x010b }
            audx r12 = r12.a((defpackage.auef) r13)     // Catch:{ IOException -> 0x010b }
            ailr r12 = (defpackage.ailr) r12     // Catch:{ IOException -> 0x010b }
            long r13 = r12.b     // Catch:{ IOException -> 0x010b }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x010b }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x010b }
            long r3 = r15 - r17
            long r15 = r13 - r3
            long r15 = java.lang.Math.abs(r15)     // Catch:{ IOException -> 0x010b }
            r17 = 10000(0x2710, double:4.9407E-320)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0107
            aucx r15 = r12.c     // Catch:{ IOException -> 0x010b }
            int r15 = r15.size()     // Catch:{ IOException -> 0x010b }
            if (r15 == 0) goto L_0x0107
            boolean r15 = defpackage.aikq.a     // Catch:{ IOException -> 0x010b }
            aisq r0 = r0.g     // Catch:{ IOException -> 0x010b }
            java.lang.Math.min(r3, r13)     // Catch:{ IOException -> 0x010b }
            r0.a((defpackage.ailr) r12)     // Catch:{ IOException -> 0x010b }
            goto L_0x010e
        L_0x0107:
            boolean r0 = defpackage.aikq.a     // Catch:{ IOException -> 0x010b }
            monitor-exit(r10)     // Catch:{ all -> 0x0560 }
            goto L_0x010f
        L_0x010b:
            r0 = move-exception
            boolean r0 = defpackage.aikq.a     // Catch:{ all -> 0x0560 }
        L_0x010e:
            monitor-exit(r10)     // Catch:{ all -> 0x0560 }
        L_0x010f:
            aiju r3 = r2.f
            ajpm r0 = r2.n
            aiab r0 = r0.a()
            android.content.Context r2 = r3.d
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            ikh r4 = r3.b
            if (r4 == 0) goto L_0x04ed
            ikh r4 = r3.b
            r4.c((android.content.Intent) r9)
            ikh r4 = r3.b
            java.util.List r4 = r4.d()
            boolean r9 = defpackage.aikq.a
            ahys r9 = new ahys
            java.io.File r10 = new java.io.File
            android.content.Context r12 = r3.d
            java.io.File r12 = r12.getFilesDir()
            java.lang.String r13 = "geofencer_state_list"
            r10.<init>(r12, r13)
            r9.<init>(r8, r10, r0)
            r3.c = r9
            r9 = 6
            ahys r0 = r3.c     // Catch:{ IOException -> 0x04c7 }
            ailw r10 = defpackage.ailw.d     // Catch:{ IOException -> 0x04c7 }
            java.lang.Object r7 = r10.c(r7)     // Catch:{ IOException -> 0x04c7 }
            auef r7 = (defpackage.auef) r7     // Catch:{ IOException -> 0x04c7 }
            audx r0 = r0.a((defpackage.auef) r7)     // Catch:{ IOException -> 0x04c7 }
            ailw r0 = (defpackage.ailw) r0     // Catch:{ IOException -> 0x04c7 }
            ikh r7 = r3.b     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r7 = r7.b()     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r10 = r0.b     // Catch:{ IOException -> 0x04c7 }
            boolean r7 = r7.equals(r10)     // Catch:{ IOException -> 0x04c7 }
            r7 = r7 ^ r5
            boolean r10 = defpackage.aikq.a     // Catch:{ IOException -> 0x04c7 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ IOException -> 0x04c7 }
            r10.<init>()     // Catch:{ IOException -> 0x04c7 }
            aucx r0 = r0.c     // Catch:{ IOException -> 0x04c7 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x04c7 }
        L_0x016d:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x0439
            java.lang.Object r0 = r12.next()     // Catch:{ IOException -> 0x04c7 }
            r13 = r0
            ailt r13 = (defpackage.ailt) r13     // Catch:{ IOException -> 0x04c7 }
            int r0 = r13.a     // Catch:{ IOException -> 0x04c7 }
            r0 = r0 & r8
            if (r0 != 0) goto L_0x018f
            java.lang.String r0 = "GeofenceStateCache"
            boolean r0 = android.util.Log.isLoggable(r0, r9)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r13 = "Incomplete geofence information: lack PendingIntent key."
            defpackage.aikq.b(r0, r13)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x016d
        L_0x018f:
            java.lang.String r0 = r13.c     // Catch:{ IOException -> 0x04c7 }
            java.util.Iterator r14 = r4.iterator()     // Catch:{ IOException -> 0x04c7 }
        L_0x0195:
            boolean r15 = r14.hasNext()     // Catch:{ IOException -> 0x04c7 }
            if (r15 == 0) goto L_0x01aa
            java.lang.Object r15 = r14.next()     // Catch:{ IOException -> 0x04c7 }
            com.google.android.location.geofencer.data.PendingIntentCacheItem r15 = (com.google.android.location.geofencer.data.PendingIntentCacheItem) r15     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r11 = r15.b     // Catch:{ IOException -> 0x04c7 }
            boolean r11 = r11.equals(r0)     // Catch:{ IOException -> 0x04c7 }
            if (r11 == 0) goto L_0x0195
            goto L_0x01ab
        L_0x01aa:
            r15 = 0
        L_0x01ab:
            if (r15 == 0) goto L_0x03dc
            android.app.PendingIntent r11 = r15.a     // Catch:{ IOException -> 0x04c7 }
            int r0 = r13.a     // Catch:{ IOException -> 0x04c7 }
            r14 = r0 & 1
            if (r14 != 0) goto L_0x01bd
            r9 = r2
            r18 = r7
            r25 = r12
            r6 = 2
            goto L_0x0317
        L_0x01bd:
            r14 = r0 & 2
            if (r14 == 0) goto L_0x0311
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0311
            int r0 = r13.d     // Catch:{ IOException -> 0x04c7 }
            ails r0 = r13.b     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            ails r0 = defpackage.ails.l     // Catch:{ IOException -> 0x04c7 }
        L_0x01ce:
            int r14 = r0.b     // Catch:{ IOException -> 0x04c7 }
            int r14 = r0.a     // Catch:{ IOException -> 0x04c7 }
            r16 = r14 & 32
            r18 = r7
            if (r16 == 0) goto L_0x0273
            r16 = r14 & 16
            if (r16 == 0) goto L_0x0273
            r16 = r14 & 2
            if (r16 == 0) goto L_0x0273
            r16 = r14 & 4
            if (r16 == 0) goto L_0x0273
            r16 = r14 & 8
            if (r16 == 0) goto L_0x0273
            r16 = r14 & 64
            if (r16 == 0) goto L_0x0273
            r8 = r14 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01f3
            int r8 = r0.i     // Catch:{ IOException -> 0x04c7 }
            goto L_0x01f4
        L_0x01f3:
            r8 = 0
        L_0x01f4:
            r14 = r14 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x01fb
            int r14 = r0.j     // Catch:{ IOException -> 0x04c7 }
            goto L_0x01fc
        L_0x01fb:
            r14 = -1
        L_0x01fc:
            rdo r5 = new rdo     // Catch:{ IllegalArgumentException -> 0x023f }
            r5.<init>()     // Catch:{ IllegalArgumentException -> 0x023f }
            java.lang.String r9 = r0.g     // Catch:{ IllegalArgumentException -> 0x023f }
            r5.a = r9     // Catch:{ IllegalArgumentException -> 0x023f }
            int r9 = r0.h     // Catch:{ IllegalArgumentException -> 0x023f }
            r5.b = r9     // Catch:{ IllegalArgumentException -> 0x023f }
            double r6 = r0.c     // Catch:{ IllegalArgumentException -> 0x023f }
            r9 = r2
            double r1 = r0.d     // Catch:{ IllegalArgumentException -> 0x023d }
            r25 = r12
            float r12 = r0.e     // Catch:{ IllegalArgumentException -> 0x023b }
            r19 = r5
            r20 = r6
            r22 = r1
            r24 = r12
            r19.a(r20, r22, r24)     // Catch:{ IllegalArgumentException -> 0x023b }
            long r0 = r0.f     // Catch:{ IllegalArgumentException -> 0x023b }
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x022a
            r5.c = r0     // Catch:{ IllegalArgumentException -> 0x023b }
            r1 = -1
            goto L_0x022e
        L_0x022a:
            r1 = -1
            r5.c = r1     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x022e:
            r5.d = r8     // Catch:{ IllegalArgumentException -> 0x0239 }
            r5.e = r14     // Catch:{ IllegalArgumentException -> 0x0239 }
            com.google.android.gms.location.internal.ParcelableGeofence r0 = r5.a()     // Catch:{ IllegalArgumentException -> 0x0239 }
            r20 = r0
            goto L_0x027a
        L_0x0239:
            r0 = move-exception
            goto L_0x0245
        L_0x023b:
            r0 = move-exception
            goto L_0x0243
        L_0x023d:
            r0 = move-exception
            goto L_0x0241
        L_0x023f:
            r0 = move-exception
            r9 = r2
        L_0x0241:
            r25 = r12
        L_0x0243:
            r1 = -1
        L_0x0245:
            java.lang.String r5 = "GeofenceState"
            r6 = 6
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ IOException -> 0x04c7 }
            if (r5 == 0) goto L_0x0270
            java.lang.String r5 = "GeofenceState"
            java.lang.String r6 = "Invalid geofence from protocol buffer: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x04c7 }
            int r7 = r0.length()     // Catch:{ IOException -> 0x04c7 }
            if (r7 != 0) goto L_0x0266
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x04c7 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x026a
        L_0x0266:
            java.lang.String r0 = r6.concat(r0)     // Catch:{ IOException -> 0x04c7 }
        L_0x026a:
            defpackage.aikq.b(r5, r0)     // Catch:{ IOException -> 0x04c7 }
            r20 = 0
            goto L_0x027a
        L_0x0270:
            r20 = 0
            goto L_0x027a
        L_0x0273:
            r9 = r2
            r25 = r12
            r1 = -1
            r20 = 0
        L_0x027a:
            if (r20 != 0) goto L_0x0290
            java.lang.String r0 = "GeofenceState"
            r1 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x028c
            java.lang.String r0 = "GeofenceState"
            java.lang.String r1 = "Invalid geofence from protocol buffer."
            defpackage.aikq.b(r0, r1)     // Catch:{ IOException -> 0x04c7 }
        L_0x028c:
            r5 = 0
            r6 = 2
            goto L_0x032a
        L_0x0290:
            ails r0 = r13.b     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x0295
            goto L_0x0297
        L_0x0295:
            ails r0 = defpackage.ails.l     // Catch:{ IOException -> 0x04c7 }
        L_0x0297:
            int r0 = r0.k     // Catch:{ IOException -> 0x04c7 }
            int r21 = defpackage.rdv.a((int) r0)     // Catch:{ IOException -> 0x04c7 }
            boolean r0 = r13.h     // Catch:{ IOException -> 0x04c7 }
            int r5 = r13.a     // Catch:{ IOException -> 0x04c7 }
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x02aa
            java.lang.String r5 = r13.j     // Catch:{ IOException -> 0x04c7 }
            r24 = r5
            goto L_0x02ae
        L_0x02aa:
            java.lang.String r5 = ""
            r24 = r5
        L_0x02ae:
            aijt r5 = new aijt     // Catch:{ IOException -> 0x04c7 }
            int r6 = r13.i     // Catch:{ IOException -> 0x04c7 }
            r19 = r5
            r22 = r11
            r23 = r6
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x04c7 }
            aijz r6 = r5.k     // Catch:{ IOException -> 0x04c7 }
            int r7 = r13.d     // Catch:{ IOException -> 0x04c7 }
            int r7 = defpackage.ailv.a(r7)     // Catch:{ IOException -> 0x04c7 }
            if (r7 == 0) goto L_0x02c6
            goto L_0x02c7
        L_0x02c6:
            r7 = 1
        L_0x02c7:
            byte r7 = defpackage.aijt.b((int) r7)     // Catch:{ IOException -> 0x04c7 }
            r6.b = r7     // Catch:{ IOException -> 0x04c7 }
            r5.i = r0     // Catch:{ IOException -> 0x04c7 }
            int r0 = r13.a     // Catch:{ IOException -> 0x04c7 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x02f2
            int r0 = r13.e     // Catch:{ IOException -> 0x04c7 }
            int r0 = defpackage.ailv.a(r0)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x02de
            goto L_0x02df
        L_0x02de:
            r0 = 1
        L_0x02df:
            byte r0 = defpackage.aijt.b((int) r0)     // Catch:{ IOException -> 0x04c7 }
            r6 = 1
            if (r0 != r6) goto L_0x02e8
            r6 = 2
            goto L_0x02ef
        L_0x02e8:
            r6 = 2
            if (r0 == r6) goto L_0x02ef
            r7 = 0
            r5.e = r7     // Catch:{ IOException -> 0x04c7 }
            goto L_0x02f3
        L_0x02ef:
            r5.e = r0     // Catch:{ IOException -> 0x04c7 }
            goto L_0x02f3
        L_0x02f2:
            r6 = 2
        L_0x02f3:
            int r0 = r13.a     // Catch:{ IOException -> 0x04c7 }
            r7 = r0 & 32
            if (r7 == 0) goto L_0x030b
            byte r7 = r5.e     // Catch:{ IOException -> 0x04c7 }
            r8 = 1
            if (r7 != r8) goto L_0x030b
            boolean r7 = r13.g     // Catch:{ IOException -> 0x04c7 }
            if (r7 == 0) goto L_0x0303
        L_0x0302:
            goto L_0x030c
        L_0x0303:
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0302
            long r0 = r13.f     // Catch:{ IOException -> 0x04c7 }
            r1 = r0
            goto L_0x030c
        L_0x030b:
            r7 = 0
        L_0x030c:
            r5.h = r7     // Catch:{ IOException -> 0x04c7 }
            r5.g = r1     // Catch:{ IOException -> 0x04c7 }
            goto L_0x032a
        L_0x0311:
            r9 = r2
            r18 = r7
            r25 = r12
            r6 = 2
        L_0x0317:
            java.lang.String r0 = "GeofenceState"
            r1 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x0329
            java.lang.String r0 = "GeofenceState"
            java.lang.String r1 = "Incomplete geofence state."
            defpackage.aikq.b(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            r5 = 0
            goto L_0x032a
        L_0x0329:
            r5 = 0
        L_0x032a:
            if (r5 != 0) goto L_0x0356
            java.lang.String r0 = "GeofenceStateCache"
            r1 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x0349
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r1 = "Protocol buffer does not convert to a valid geofence state."
            defpackage.aikq.b(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x0349:
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x0356:
            com.google.android.gms.location.internal.ParcelableGeofence r0 = r5.a     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x04c7 }
            java.util.List r1 = r15.c     // Catch:{ IOException -> 0x04c7 }
            if (r1 != 0) goto L_0x035f
            goto L_0x0394
        L_0x035f:
            int r1 = java.util.Collections.binarySearch(r1, r0)     // Catch:{ IOException -> 0x04c7 }
            if (r1 < 0) goto L_0x0394
            java.util.List r0 = r15.c     // Catch:{ IOException -> 0x04c7 }
            r0.remove(r1)     // Catch:{ IOException -> 0x04c7 }
            android.app.PendingIntent r0 = r15.a     // Catch:{ IOException -> 0x04c7 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ IOException -> 0x04c7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x04c7 }
            if (r0 != 0) goto L_0x0383
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x04c7 }
            int r1 = r15.a()     // Catch:{ IOException -> 0x04c7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x04c7 }
            android.app.PendingIntent r1 = r15.a     // Catch:{ IOException -> 0x04c7 }
            r10.put(r1, r0)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x0384
        L_0x0383:
        L_0x0384:
            r0.add(r5)     // Catch:{ IOException -> 0x04c7 }
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x0394:
            java.lang.String r1 = "GeofenceStateCache"
            r2 = 6
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x04c7 }
            if (r1 == 0) goto L_0x03cf
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x04c7 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x04c7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c7 }
            int r1 = r1 + 98
            r2.<init>(r1)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r1 = "Request ID "
            r2.append(r1)     // Catch:{ IOException -> 0x04c7 }
            r2.append(r0)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r0 = " not found in memory cache. Probably caused by I/O failure during removeGeofences call."
            r2.append(r0)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x04c7 }
            defpackage.aikq.b(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x03cf:
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x03dc:
            r9 = r2
            r18 = r7
            r25 = r12
            r6 = 2
            if (r18 != 0) goto L_0x042c
            java.lang.String r1 = "GeofenceStateCache"
            r2 = 6
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x04c7 }
            if (r1 == 0) goto L_0x041f
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x04c7 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x04c7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04c7 }
            int r1 = r1 + 77
            r2.<init>(r1)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r1 = "Unable to find pending intent for key: "
            r2.append(r1)     // Catch:{ IOException -> 0x04c7 }
            r2.append(r0)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r0 = ". Registered geofence will be dropped."
            r2.append(r0)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x04c7 }
            defpackage.aikq.b(r0, r1)     // Catch:{ IOException -> 0x04c7 }
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x041f:
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x042c:
            r1 = r26
            r2 = r9
            r7 = r18
            r12 = r25
            r5 = 1
            r6 = 0
            r8 = 2
            r9 = 6
            goto L_0x016d
        L_0x0439:
            r9 = r2
            java.util.Iterator r1 = r4.iterator()     // Catch:{ IOException -> 0x04c7 }
        L_0x043e:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x04d8
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x04c7 }
            com.google.android.location.geofencer.data.PendingIntentCacheItem r0 = (com.google.android.location.geofencer.data.PendingIntentCacheItem) r0     // Catch:{ IOException -> 0x04c7 }
            int r2 = r0.a()     // Catch:{ IOException -> 0x04c7 }
            if (r2 != 0) goto L_0x04b5
            android.app.PendingIntent r0 = r0.a     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r2 = defpackage.ajqj.a(r0)     // Catch:{ IOException -> 0x04c7 }
            if (r2 != 0) goto L_0x0459
            goto L_0x0490
        L_0x0459:
            r4 = 0
            r9.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x048f }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ IOException -> 0x04c7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x043e
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x04c7 }
        L_0x046a:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x04c7 }
            if (r2 == 0) goto L_0x043e
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x04c7 }
            aijt r2 = (defpackage.aijt) r2     // Catch:{ IOException -> 0x04c7 }
            aijx r4 = r3.e     // Catch:{ IOException -> 0x04c7 }
            android.app.PendingIntent r5 = r2.b     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r5 = defpackage.ajqj.a(r5)     // Catch:{ IOException -> 0x04c7 }
            java.lang.String r6 = r2.c     // Catch:{ IOException -> 0x04c7 }
            aijy r7 = new aijy     // Catch:{ IOException -> 0x04c7 }
            r7.<init>(r5, r6)     // Catch:{ IOException -> 0x04c7 }
            aikb r4 = r4.a((defpackage.aijy) r7)     // Catch:{ IOException -> 0x04c7 }
            if (r4 == 0) goto L_0x046a
            r4.a((defpackage.aijt) r2)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x046a
        L_0x048f:
            r0 = move-exception
        L_0x0490:
            java.lang.String r0 = "GeofenceStateCache"
            r4 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x043e
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r4 = "Not recovering removed package: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x04c7 }
            int r5 = r2.length()     // Catch:{ IOException -> 0x04c7 }
            if (r5 != 0) goto L_0x04ad
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x04c7 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x04b1
        L_0x04ad:
            java.lang.String r2 = r4.concat(r2)     // Catch:{ IOException -> 0x04c7 }
        L_0x04b1:
            defpackage.aikq.c(r0, r2)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x043e
        L_0x04b5:
            java.lang.String r0 = "GeofenceStateCache"
            r2 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch:{ IOException -> 0x04c7 }
            if (r0 == 0) goto L_0x043e
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r2 = "Some geofence(s) couldn't be found on disk."
            defpackage.aikq.b(r0, r2)     // Catch:{ IOException -> 0x04c7 }
            goto L_0x043e
        L_0x04c7:
            r0 = move-exception
            java.lang.String r0 = "GeofenceStateCache"
            r1 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x04d8
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r1 = "Unable to load state, all registered geofences are lost."
            defpackage.aikq.b(r0, r1)
        L_0x04d8:
            r3.b()     // Catch:{ IOException -> 0x04dc }
            goto L_0x04ed
        L_0x04dc:
            r0 = move-exception
            java.lang.String r0 = "GeofenceStateCache"
            r1 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x04ed
            java.lang.String r0 = "GeofenceStateCache"
            java.lang.String r1 = "Unable to do clean up after restarted."
            defpackage.aikq.c(r0, r1)
        L_0x04ed:
            r1 = r26
            aiml r0 = r1.b
            r0.i()
            aing r0 = r1.a
            aucd r0 = r0.C
            if (r0 == 0) goto L_0x051a
            aiml r2 = r1.b
            aime r2 = r2.m
            boolean r2 = r2.b()
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x050c
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x050c:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            aoal r3 = defpackage.aoal.g
            int r3 = r0.a
            r3 = r3 | 8
            r0.a = r3
            r0.e = r2
        L_0x051a:
            aing r0 = r1.a
            aink r0 = r0.x
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0546
            aiml r0 = r1.b
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x053e
            aiml r0 = r1.b
            r0.j()
            aing r0 = r1.a
            aimx r2 = r0.c
            r0.b((defpackage.ains) r2)
            aing r0 = r1.a
            r0.d()
            goto L_0x055e
        L_0x053e:
            aing r0 = r1.a
            aimz r2 = r0.a
            r0.b((defpackage.ains) r2)
            goto L_0x055e
        L_0x0546:
            java.lang.String r0 = "GeofencerStateMachine"
            r2 = 4
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            if (r0 == 0) goto L_0x0557
            java.lang.String r0 = "GeofencerStateMachine"
            java.lang.String r2 = "Network location disabled."
            defpackage.aikq.a(r0, r2)
        L_0x0557:
            aing r0 = r1.a
            aimu r2 = r0.b
            r0.b((defpackage.ains) r2)
        L_0x055e:
            r2 = 1
            return r2
        L_0x0560:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0560 }
            throw r0
        L_0x0563:
            r0 = move-exception
            r11 = r12
        L_0x0565:
            defpackage.ajre.a((java.io.Closeable) r11)
            goto L_0x056a
        L_0x0569:
            throw r0
        L_0x056a:
            goto L_0x0569
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aina.a(android.os.Message):boolean");
    }
}
