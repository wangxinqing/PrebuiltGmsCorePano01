package defpackage;

import android.location.Location;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.location.GeofencingRequest;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: aimr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aimr extends ains {
    final aiml b;
    final /* synthetic */ aing c;

    public aimr(aing aing, aiml aiml) {
        this.c = aing;
        this.b = aiml;
    }

    /* access modifiers changed from: protected */
    public final ains a(aisp aisp) {
        if (!this.c.n.a()) {
            return this.c.i;
        }
        aisp aisp2 = aisp.UNAVAILABLE;
        int ordinal = aisp.ordinal();
        if (ordinal == 0) {
            return this.c.d;
        }
        if (ordinal == 1) {
            return this.c.e;
        }
        if (ordinal == 2) {
            return this.c.f;
        }
        if (ordinal == 3) {
            return this.c.g;
        }
        if (ordinal != 4) {
            return null;
        }
        return this.c.h;
    }

    public abstract aoaq a();

    /* access modifiers changed from: protected */
    public void a(aijq aijq) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v12, types: [int] */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r0.what
            r3 = 3
            r4 = 6
            r5 = 0
            if (r2 == r3) goto L_0x07ac
            r6 = 9
            r7 = 1
            if (r2 == r6) goto L_0x07a2
            r6 = 12
            if (r2 == r6) goto L_0x079c
            r6 = 98
            r8 = 0
            if (r2 == r6) goto L_0x0794
            r6 = 150(0x96, float:2.1E-43)
            if (r2 == r6) goto L_0x077c
            r9 = 152(0x98, float:2.13E-43)
            r10 = 2
            if (r2 == r9) goto L_0x05ec
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x003e
            r3 = 103(0x67, float:1.44E-43)
            if (r2 == r3) goto L_0x002d
            boolean r0 = defpackage.aikq.a
            return r5
        L_0x002d:
            java.lang.Object r0 = r0.obj
            aimf r0 = (defpackage.aimf) r0
            aiml r2 = r1.b
            aimd r2 = r2.k
            aimq r3 = new aimq
            r3.<init>(r1, r0)
            r2.a((java.lang.Runnable) r3)
            return r7
        L_0x003e:
            java.lang.Object r0 = r0.obj
            java.io.PrintWriter r0 = (java.io.PrintWriter) r0
            aiml r2 = r1.b
            java.lang.String r3 = "Registered geofences:\n"
            r0.print(r3)
            aiju r3 = r2.f
            aijx r4 = r3.e
            java.util.Collection r6 = r4.c()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0069
            java.util.Collection r6 = r4.d()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            java.lang.String r4 = "    <none>"
            r0.print(r4)
            goto L_0x00d6
        L_0x0069:
            java.util.Collection r6 = r4.c()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x007d
            java.util.Collection r6 = r4.d()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x009f
        L_0x007d:
            java.lang.String r6 = "Active Geofences:"
            r0.println(r6)
            java.util.Collection r6 = r4.c()
            java.util.Iterator r6 = r6.iterator()
        L_0x008a:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x009f
            java.lang.Object r9 = r6.next()
            aikb r9 = (defpackage.aikb) r9
            r9.a((java.io.PrintWriter) r0)
            java.lang.String r9 = "\n"
            r0.print(r9)
            goto L_0x008a
        L_0x009f:
            java.util.Collection r6 = r4.d()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00cb
            java.lang.String r6 = "Inactive Geofences:"
            r0.println(r6)
            java.util.Collection r6 = r4.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x00b6:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r6.next()
            aikb r9 = (defpackage.aikb) r9
            r9.a((java.io.PrintWriter) r0)
            java.lang.String r9 = "\n"
            r0.print(r9)
            goto L_0x00b6
        L_0x00cb:
            java.lang.String r6 = "\n"
            r0.print(r6)
            aijs r4 = r4.g
            r4.a((java.io.PrintWriter) r0)
        L_0x00d6:
            ikh r4 = r3.b
            if (r4 != 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            ikh r3 = r3.b
            r3.a((java.io.PrintWriter) r0)
        L_0x00e0:
            java.util.TreeMap r3 = r2.j
            int r3 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r6 = 30
            r4.<init>(r6)
            java.lang.String r9 = "\nUniqueIds in use: "
            r4.append(r9)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.print(r3)
            aikc r3 = r2.c
            android.util.Pair r3 = r3.b
            if (r3 == 0) goto L_0x012e
            java.lang.String r3 = "\nLast location:\n    "
            r0.print(r3)
            aikc r3 = r2.c
            android.util.Pair r3 = r3.b
            java.lang.Object r3 = r3.second
            android.location.Location r3 = (android.location.Location) r3
            java.lang.String r4 = "Time="
            r0.print(r4)
            java.util.Date r4 = new java.util.Date
            long r11 = r3.getTime()
            r4.<init>(r11)
            r0.print(r4)
            java.lang.String r3 = "\n    "
            r0.print(r3)
            aikc r3 = r2.c
            android.util.Pair r3 = r3.b
            java.lang.Object r3 = r3.second
            r0.print(r3)
        L_0x012e:
            java.lang.String r3 = "\n"
            r0.print(r3)
            aime r3 = r2.m
            r3.a((java.io.PrintWriter) r0)
            java.lang.String r3 = "\nLocation update interval="
            r0.print(r3)
            ainj r3 = r2.e
            int r3 = r3.f
            r0.print(r3)
            java.lang.String r3 = "s"
            r0.print(r3)
            java.lang.String r3 = "\n"
            r0.print(r3)
            aisl r2 = r2.d
            java.lang.Object r9 = r2.h
            monitor-enter(r9)
            java.lang.String r3 = "Dump of ActivityDetector:\n    Interval="
            r0.print(r3)     // Catch:{ all -> 0x05e9 }
            int r2 = r2.j     // Catch:{ all -> 0x05e9 }
            r0.print(r2)     // Catch:{ all -> 0x05e9 }
            java.lang.String r2 = "s"
            r0.print(r2)     // Catch:{ all -> 0x05e9 }
            monitor-exit(r9)     // Catch:{ all -> 0x05e9 }
            aing r2 = r1.c
            ains r2 = r2.c()
            aimr r2 = (defpackage.aimr) r2
            r2.a((java.io.PrintWriter) r0)
            java.lang.String r2 = "\n"
            r0.print(r2)
            aing r2 = r1.c
            java.lang.String r3 = r2.F
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.concat(r4)
            r0.println(r3)
            ainy r3 = r2.K
            if (r3 == 0) goto L_0x0190
            ainu r3 = r3.c
            int r3 = r3.b()
            goto L_0x0191
        L_0x0190:
            r3 = 0
        L_0x0191:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r9 = 26
            r4.<init>(r9)
            java.lang.String r9 = " total records="
            r4.append(r9)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            r3 = 0
        L_0x01a8:
            ainy r4 = r2.K
            if (r4 == 0) goto L_0x01b3
            ainu r4 = r4.c
            int r4 = r4.a()
            goto L_0x01b4
        L_0x01b3:
            r4 = 0
        L_0x01b4:
            if (r3 < r4) goto L_0x05c2
            ains r2 = r2.c()
            java.lang.String r2 = r2.g()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "curState="
            int r4 = r2.length()
            if (r4 != 0) goto L_0x01d0
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x01d4
        L_0x01d0:
            java.lang.String r2 = r3.concat(r2)
        L_0x01d4:
            r0.println(r2)
            boolean r2 = defpackage.aybx.b()
            if (r2 == 0) goto L_0x01e9
            aikp r2 = defpackage.aiko.a
            aiml r3 = r1.b
            java.util.List r3 = r3.b()
            r2.a((java.io.PrintWriter) r0, (java.util.List) r3)
            goto L_0x01ee
        L_0x01e9:
            aikp r2 = defpackage.aiko.a
            r2.a((java.io.PrintWriter) r0, (java.util.List) r8)
        L_0x01ee:
            aing r2 = r1.c
            aikk r2 = r2.q
            if (r2 == 0) goto L_0x05c1
            java.lang.String r3 = "GeofencerStatsLogManager:"
            r0.println(r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r8 = r2.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r10 = 40
            r5.<init>(r10)
            java.lang.String r10 = "  Stats elapsed ms: "
            r5.append(r10)
            long r3 = r3 - r8
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.println(r3)
            java.lang.String r3 = "  GeofencerDeviceCapabilities:"
            r0.println(r3)
            aucd r3 = r2.k
            aucj r3 = r3.b
            aoal r3 = (defpackage.aoal) r3
            boolean r3 = r3.b
            aucd r4 = r2.l
            aucj r4 = r4.b
            aoal r4 = (defpackage.aoal) r4
            boolean r4 = r4.b
            java.lang.String r5 = "gps"
            defpackage.aikk.a((java.io.PrintWriter) r0, (java.lang.String) r5, (boolean) r3, (boolean) r4)
            aucd r3 = r2.k
            aucj r3 = r3.b
            aoal r3 = (defpackage.aoal) r3
            boolean r3 = r3.c
            aucd r4 = r2.l
            aucj r4 = r4.b
            aoal r4 = (defpackage.aoal) r4
            boolean r4 = r4.c
            java.lang.String r5 = "nlp"
            defpackage.aikk.a((java.io.PrintWriter) r0, (java.lang.String) r5, (boolean) r3, (boolean) r4)
            aucd r3 = r2.k
            aucj r3 = r3.b
            aoal r3 = (defpackage.aoal) r3
            boolean r3 = r3.d
            aucd r4 = r2.l
            aucj r4 = r4.b
            aoal r4 = (defpackage.aoal) r4
            boolean r4 = r4.d
            java.lang.String r5 = "significant_motion_detector"
            defpackage.aikk.a((java.io.PrintWriter) r0, (java.lang.String) r5, (boolean) r3, (boolean) r4)
            aucd r3 = r2.k
            aucj r3 = r3.b
            aoal r3 = (defpackage.aoal) r3
            boolean r3 = r3.e
            aucd r4 = r2.l
            aucj r4 = r4.b
            aoal r4 = (defpackage.aoal) r4
            boolean r4 = r4.e
            java.lang.String r5 = "gps_hardware_geofencing"
            defpackage.aikk.a((java.io.PrintWriter) r0, (java.lang.String) r5, (boolean) r3, (boolean) r4)
            aucd r3 = r2.k
            aucj r3 = r3.b
            aoal r3 = (defpackage.aoal) r3
            boolean r3 = r3.f
            aucd r4 = r2.l
            aucj r4 = r4.b
            aoal r4 = (defpackage.aoal) r4
            boolean r4 = r4.f
            java.lang.String r5 = "chre_geofencing"
            defpackage.aikk.a((java.io.PrintWriter) r0, (java.lang.String) r5, (boolean) r3, (boolean) r4)
            java.lang.String r3 = "  ProfileInfo:"
            r0.println(r3)
            aucd r3 = r2.m
            aucj r3 = r3.b
            aoau r3 = (defpackage.aoau) r3
            boolean r3 = r3.b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 24
            r4.<init>(r5)
            java.lang.String r5 = "    isPrimaryUser: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            aucd r3 = r2.m
            aucj r3 = r3.b
            aoau r3 = (defpackage.aoau) r3
            boolean r3 = r3.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 25
            r4.<init>(r5)
            java.lang.String r5 = "    isOwnerProfile: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            java.lang.String r3 = "  Durations:"
            r0.println(r3)
            nz r3 = r2.j
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x02d4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0322
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            aoaq r5 = (defpackage.aoaq) r5
            java.lang.String r5 = r5.name()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r8 = java.lang.String.valueOf(r5)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 17
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = "    "
            r10.append(r8)
            r10.append(r5)
            java.lang.String r5 = " enabled ms: "
            r10.append(r5)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r0.println(r4)
            goto L_0x02d4
        L_0x0322:
            aoaq r3 = r2.c
            java.lang.String r3 = r3.name()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r8 = r2.d
            java.lang.String r10 = java.lang.String.valueOf(r3)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 46
            r11.<init>(r10)
            java.lang.String r10 = "    current("
            r11.append(r10)
            r11.append(r3)
            java.lang.String r3 = ") enabled ms: "
            r11.append(r3)
            long r4 = r4 - r8
            r11.append(r4)
            java.lang.String r3 = r11.toString()
            r0.println(r3)
            aucd r3 = r2.o
            aucj r3 = r3.b
            aoan r3 = (defpackage.aoan) r3
            long r3 = r3.c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r8 = 64
            r5.<init>(r8)
            java.lang.String r8 = "    Significant motion detector enabled ms: "
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.println(r3)
            boolean r3 = r2.e
            if (r3 != 0) goto L_0x037d
            java.lang.String r3 = "      Currently disabled"
            r0.println(r3)
            goto L_0x039a
        L_0x037d:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r8 = r2.f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r10 = 45
            r5.<init>(r10)
            java.lang.String r10 = "      Currently enabled: "
            r5.append(r10)
            long r3 = r3 - r8
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.println(r3)
        L_0x039a:
            java.lang.String r3 = "  Counters:"
            r0.println(r3)
            aucd r3 = r2.n
            aucj r3 = r3.b
            aoak r3 = (defpackage.aoak) r3
            int r3 = r3.b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 33
            r4.<init>(r5)
            java.lang.String r8 = "    locationRequests: "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            aucd r3 = r2.n
            aucj r3 = r3.b
            aoak r3 = (defpackage.aoak) r3
            int r3 = r3.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.String r8 = "    locationReceived: "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            aucd r3 = r2.n
            aucj r3 = r3.b
            aoak r3 = (defpackage.aoak) r3
            int r3 = r3.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r8 = 44
            r4.<init>(r8)
            java.lang.String r8 = "    sentinelFenceUpdatesNonChre: "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            aucd r3 = r2.n
            aucj r3 = r3.b
            aoak r3 = (defpackage.aoak) r3
            int r3 = r3.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r8 = 41
            r4.<init>(r8)
            java.lang.String r9 = "    sentinelFenceUpdatesChre: "
            r4.append(r9)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            aucd r3 = r2.n
            aucj r3 = r3.b
            aoak r3 = (defpackage.aoak) r3
            int r3 = r3.f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r9 = 37
            r4.<init>(r9)
            java.lang.String r9 = "    geofenceCountMaximum: "
            r4.append(r9)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            nz r3 = r2.i
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x043e:
            boolean r4 = r3.hasNext()
            r9 = 29
            if (r4 == 0) goto L_0x0595
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r10 = r4.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = java.lang.String.valueOf(r10)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 5
            r12.<init>(r11)
            java.lang.String r11 = "    "
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = ":"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r0.println(r10)
            java.lang.Object r4 = r4.getValue()
            aiki r4 = (defpackage.aiki) r4
            aucd r10 = r4.b
            aucj r11 = r10.b
            aoaj r11 = (defpackage.aoaj) r11
            int r11 = r11.c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 38
            r12.<init>(r13)
            java.lang.String r13 = "      addGeofenceRequests: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r0.println(r11)
            aucj r11 = r10.b
            aoaj r11 = (defpackage.aoaj) r11
            int r11 = r11.d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r8)
            java.lang.String r13 = "      removeGeofenceRequests: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r0.println(r11)
            aucj r11 = r10.b
            aoaj r11 = (defpackage.aoaj) r11
            int r11 = r11.e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            java.lang.String r13 = "      geofenceEnters: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r0.println(r11)
            aucj r11 = r10.b
            aoaj r11 = (defpackage.aoaj) r11
            int r11 = r11.f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 32
            r12.<init>(r13)
            java.lang.String r13 = "      geofenceExits: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r0.println(r11)
            aucj r11 = r10.b
            aoaj r11 = (defpackage.aoaj) r11
            int r11 = r11.g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            java.lang.String r13 = "      geofenceDwells: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r0.println(r11)
            aucj r10 = r10.b
            aoaj r10 = (defpackage.aoaj) r10
            int r10 = r10.i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r12 = 39
            r11.<init>(r12)
            java.lang.String r12 = "      geofenceCountMaximum: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r0.println(r10)
            nz r4 = r4.a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0529:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0591
            java.lang.Object r10 = r4.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            oq r11 = (defpackage.oq) r11
            java.lang.Object r12 = r11.a
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.Object r11 = r11.b
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r13 = java.lang.String.valueOf(r12)
            int r13 = r13.length()
            java.lang.String r14 = java.lang.String.valueOf(r11)
            int r14 = r14.length()
            java.lang.String r15 = java.lang.String.valueOf(r10)
            int r15 = r15.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r13 = r13 + r9
            int r13 = r13 + r14
            int r13 = r13 + r15
            r5.<init>(r13)
            java.lang.String r13 = "      transition/initial("
            r5.append(r13)
            r5.append(r12)
            java.lang.String r12 = "/"
            r5.append(r12)
            r5.append(r11)
            java.lang.String r11 = "): "
            r5.append(r11)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r0.println(r5)
            r5 = 33
            goto L_0x0529
        L_0x0591:
            r5 = 33
            goto L_0x043e
        L_0x0595:
            int r3 = r2.g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            java.lang.String r5 = "  Events happened: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            int r2 = r2.h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            java.lang.String r4 = "  Events sampled: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.println(r2)
        L_0x05c1:
            return r7
        L_0x05c2:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r4[r5] = r9
            ainy r9 = r2.K
            if (r9 == 0) goto L_0x05d5
            ainu r9 = r9.c
            aint r9 = r9.a(r3)
            goto L_0x05d6
        L_0x05d5:
            r9 = r8
        L_0x05d6:
            java.lang.String r9 = r9.toString()
            r4[r7] = r9
            java.lang.String r9 = " rec[%d]: %s\n"
            r0.printf(r9, r4)
            r0.flush()
            int r3 = r3 + 1
            goto L_0x01a8
        L_0x05e9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x05e9 }
            throw r0
        L_0x05ec:
            aiml r2 = r1.b
            aimd r2 = r2.k
            java.lang.Object r0 = r0.obj
            arlp r0 = (defpackage.arlp) r0
            jgw r9 = r2.p
            if (r9 != 0) goto L_0x0603
            jbr r9 = r2.o
            if (r9 != 0) goto L_0x05fd
            goto L_0x0608
        L_0x05fd:
            jbs r11 = r2.m
            r11.a((defpackage.jbr) r9)
            goto L_0x0608
        L_0x0603:
            jgy r11 = r2.n
            r11.a((defpackage.jgw) r9)
        L_0x0608:
            int r9 = r2.r
            if (r9 == 0) goto L_0x076b
            if (r9 == r7) goto L_0x0724
            if (r9 == r10) goto L_0x06f6
            aucx r3 = r0.c
            int r3 = r3.size()
            if (r3 == 0) goto L_0x0635
            aucx r0 = r0.c
            int r3 = r0.size()
        L_0x061e:
            if (r5 >= r3) goto L_0x06d9
            java.lang.Object r4 = r0.get(r5)
            arll r4 = (defpackage.arll) r4
            arlu[] r6 = r2.d
            int r9 = r4.b
            arlu r4 = r4.d
            if (r4 != 0) goto L_0x0630
            arlu r4 = defpackage.arlu.f
        L_0x0630:
            r6[r9] = r4
            int r5 = r5 + 1
            goto L_0x061e
        L_0x0635:
            aucx r3 = r0.b
            int r3 = r3.size()
            if (r3 != 0) goto L_0x063e
            goto L_0x0643
        L_0x063e:
            aucx r0 = r0.b
            r2.a((java.util.List) r0, (boolean) r7)
        L_0x0643:
            java.util.ArrayDeque r0 = r2.v
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06d9
            java.util.ArrayDeque r0 = r2.v
            java.lang.Object r0 = r0.removeFirst()
            aimc r0 = (defpackage.aimc) r0
            java.util.ArrayList r3 = r2.a
            monitor-enter(r3)
            java.util.Collection r5 = r0.b     // Catch:{ all -> 0x06d6 }
            if (r5 == 0) goto L_0x067f
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x06d6 }
        L_0x065e:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x06d6 }
            if (r9 == 0) goto L_0x067f
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x06d6 }
            aimb r9 = (defpackage.aimb) r9     // Catch:{ all -> 0x06d6 }
            nz r10 = r2.b     // Catch:{ all -> 0x06d6 }
            java.util.ArrayList r11 = r2.a     // Catch:{ all -> 0x06d6 }
            int r12 = r9.a     // Catch:{ all -> 0x06d6 }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x06d6 }
            r10.remove(r11)     // Catch:{ all -> 0x06d6 }
            java.util.ArrayList r10 = r2.a     // Catch:{ all -> 0x06d6 }
            int r9 = r9.a     // Catch:{ all -> 0x06d6 }
            r10.set(r9, r8)     // Catch:{ all -> 0x06d6 }
            goto L_0x065e
        L_0x067f:
            java.util.Collection r0 = r0.a     // Catch:{ all -> 0x06d6 }
            if (r0 == 0) goto L_0x06aa
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x06d6 }
        L_0x0687:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x06d6 }
            if (r5 == 0) goto L_0x06aa
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x06d6 }
            aimb r5 = (defpackage.aimb) r5     // Catch:{ all -> 0x06d6 }
            java.util.ArrayList r9 = r2.a     // Catch:{ all -> 0x06d6 }
            int r10 = r5.a     // Catch:{ all -> 0x06d6 }
            aijt r11 = r5.b     // Catch:{ all -> 0x06d6 }
            r9.set(r10, r11)     // Catch:{ all -> 0x06d6 }
            nz r9 = r2.b     // Catch:{ all -> 0x06d6 }
            aijt r10 = r5.b     // Catch:{ all -> 0x06d6 }
            int r5 = r5.a     // Catch:{ all -> 0x06d6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x06d6 }
            r9.put(r10, r5)     // Catch:{ all -> 0x06d6 }
            goto L_0x0687
        L_0x06aa:
            monitor-exit(r3)     // Catch:{ all -> 0x06d6 }
            java.util.ArrayDeque r0 = r2.v
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06b9
            aing r0 = r2.j
            r0.d((int) r6)
            goto L_0x06d9
        L_0x06b9:
            java.util.ArrayDeque r0 = r2.u
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06d9
            aing r0 = r2.j
            r0.d((int) r6)
            java.lang.String r0 = "ChreGeofenceHardware"
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L_0x06d9
            java.lang.String r0 = "ChreGeofenceHardware"
            java.lang.String r3 = "Not expecting responses, but sending queue is not empty."
            defpackage.aikq.b(r0, r3)
            goto L_0x06d9
        L_0x06d6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06d6 }
            throw r0
        L_0x06d9:
            java.lang.Runnable r0 = r2.s
            if (r0 == 0) goto L_0x077b
            r0 = 4
            java.lang.String r3 = "ChreGeofenceHardware"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x06ed
            java.lang.String r0 = "ChreGeofenceHardware"
            java.lang.String r3 = "All Geofences synced from CHRE."
            defpackage.aikq.a(r0, r3)
        L_0x06ed:
            java.lang.Runnable r0 = r2.s
            r0.run()
            r2.s = r8
            goto L_0x077b
        L_0x06f6:
            r2.a()
            aucx r4 = r0.c
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0710
            aucx r4 = r0.b
            int r4 = r4.size()
            if (r4 != 0) goto L_0x070a
            goto L_0x0715
        L_0x070a:
            aucx r0 = r0.b
            r2.a((java.util.List) r0, (boolean) r5)
            goto L_0x0715
        L_0x0710:
            aucx r0 = r0.c
            r2.a((java.util.List) r0, (boolean) r5)
        L_0x0715:
            r2.r = r3
            aing r0 = r2.j
            int r2 = r2.g
            if (r2 <= 0) goto L_0x071f
            r5 = 1
            goto L_0x0720
        L_0x071f:
        L_0x0720:
            r0.b(r5)
            goto L_0x077b
        L_0x0724:
            boolean r3 = defpackage.axyu.b()
            if (r3 != 0) goto L_0x0732
            r2.r = r5
            aing r0 = r2.j
            r0.b(r5)
            goto L_0x077b
        L_0x0732:
            int r0 = r0.a
            r2.g = r0
            r2.r = r10
            arlo r0 = defpackage.arlo.e
            aucd r0 = r0.o()
            arlm r0 = (defpackage.arlm) r0
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0745
            goto L_0x074a
        L_0x0745:
            r0.c()
            r0.c = r5
        L_0x074a:
            aucj r3 = r0.b
            arlo r3 = (defpackage.arlo) r3
            r3.b = r10
            int r4 = r3.a
            r4 = r4 | r7
            r3.a = r4
        L_0x0755:
            int r3 = r2.g
            if (r5 >= r3) goto L_0x075f
            r0.a(r5)
            int r5 = r5 + 1
            goto L_0x0755
        L_0x075f:
            aucj r0 = r0.i()
            arlo r0 = (defpackage.arlo) r0
            aimc r3 = defpackage.aimd.w
            r2.a((defpackage.arlo) r0, (defpackage.aimc) r3)
            goto L_0x077b
        L_0x076b:
            java.lang.String r0 = "ChreGeofenceHardware"
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L_0x077b
            java.lang.String r0 = "ChreGeofenceHardware"
            java.lang.String r2 = "Shouldn't receive any response when engine is uninitialized."
            defpackage.aikq.b(r0, r2)
        L_0x077b:
            return r7
        L_0x077c:
            aiml r0 = r1.b
            aimd r0 = r0.k
            java.util.ArrayDeque r2 = r0.u
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0793
            java.util.ArrayDeque r2 = r0.u
            java.lang.Object r2 = r2.removeFirst()
            arlo r2 = (defpackage.arlo) r2
            r0.a((defpackage.arlo) r2)
        L_0x0793:
            return r7
        L_0x0794:
            java.lang.Object r0 = r0.obj
            aimf r0 = (defpackage.aimf) r0
            r0.a((java.lang.Object) r8)
            return r7
        L_0x079c:
            aiml r0 = r1.b
            r0.i()
            return r7
        L_0x07a2:
            aiml r2 = r1.b
            java.lang.Object r0 = r0.obj
            android.content.Intent r0 = (android.content.Intent) r0
            r2.a((android.content.Intent) r0)
            return r7
        L_0x07ac:
            java.lang.String r0 = "GeofencerStateMachine"
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L_0x07bc
            java.lang.String r0 = "GeofencerStateMachine"
            java.lang.String r2 = "SM_STOP_CMD should never be sent for now."
            defpackage.aikq.b(r0, r2)
        L_0x07bc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimr.b(android.os.Message):boolean");
    }

    public void k() {
        aikk aikk = this.c.q;
        if (aikk != null) {
            aoaq a = a();
            aikk.a();
            if (!a.equals(aikk.c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aikk.a(aikk.c, elapsedRealtime);
                aikk.d = elapsedRealtime;
                aikk.c = a;
            }
        }
    }

    public void l() {
    }

    public void a(PrintWriter printWriter) {
        printWriter.print("\nDump of current state:");
        printWriter.print("\n    ");
        printWriter.print(g());
    }

    public boolean a(ainr ainr) {
        boolean z = aikq.a;
        Pair a = this.b.a(ainr);
        int intValue = ((Integer) a.first).intValue();
        ainr.a((Object) Integer.valueOf(intValue));
        if (a.second != null) {
            aikk aikk = this.c.q;
            if (aikk != null) {
                aikk.a(ainr.b, ainr.a, ((List) a.second).size());
                aikk aikk2 = this.c.q;
                String str = ainr.b;
                aikk2.a();
                aucd aucd = aikk2.a(str).b;
                int i = ((aoaj) aucd.b).d + 1;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoaj aoaj = (aoaj) aucd.b;
                aoaj aoaj2 = aoaj.j;
                aoaj.a |= 4;
                aoaj.d = i;
            }
            a(ainr.b, (List) a.second);
        }
        return intValue == 0;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, GeofencingRequest geofencingRequest, List list) {
        if (this.c.q != null) {
            Pair pair = this.b.c.b;
            if (pair == null || pair.second == null) {
                this.c.q.a(str, geofencingRequest, list, (Location) null);
            } else {
                this.c.q.a(str, geofencingRequest, list, (Location) pair.second);
            }
            this.c.q.a(str, geofencingRequest, this.b.a(str, geofencingRequest.c), this.b.d());
        }
        if (!aybx.b()) {
            aiko.a.a((aikn) new aikl(-2136481340, str, list, "Geofences added", true));
            return true;
        }
        aiko.a.a(-64817135, str, list, 3, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, List list) {
        if (!aybx.b()) {
            aiko.a.a((aikn) new aikl(1533697028, str, list, "Geofences removed", true));
            return true;
        }
        aiko.a.a(1279658741, str, list, 4, true);
        return true;
    }
}
