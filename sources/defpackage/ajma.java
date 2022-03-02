package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.google.android.gms.location.WifiScan;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiActivationChange;
import com.google.android.ulr.ApiBleRate;
import com.google.android.ulr.ApiBleScanReport;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiInternalState;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiPlaceInferenceResult;
import com.google.android.ulr.ApiPlaceReport;
import com.google.android.ulr.ApiRate;
import com.google.android.ulr.ApiStepCountsEntry;
import com.google.android.ulr.ApiWifiConnectivityStatus;
import com.google.android.ulr.LocationHistorianBatchData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajma extends ajlz implements rok {
    public final /* synthetic */ ajme b;
    private final ajmi f;
    private final ajlm g;
    private final List h = new ArrayList();
    private ajhh i;
    private ajgz j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajma(ajme ajme, ajmn ajmn, ajmm ajmm, ajmo ajmo, ajlm ajlm, ajin ajin) {
        super(ajme, ajme.a(), "UlrDispSvcFast");
        this.b = ajme;
        this.f = new ajmi(ajme.b, ajmn, ajmm, ajmo, ajlm, ajme.m, ajin);
        this.g = ajlm;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: android.location.Location} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x06e3  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0731  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0779  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0ac0  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0aeb  */
    private final void a(android.content.Intent r42, com.google.android.location.reporting.state.update.ReportingConfig r43, boolean r44) {
        /*
            r41 = this;
            r1 = r41
            r2 = r43
            r3 = r44
            boolean r0 = defpackage.aztb.s()
            if (r0 != 0) goto L_0x0e3d
            boolean r0 = com.google.android.gms.location.LocationResult.a((android.content.Intent) r42)     // Catch:{ RuntimeException -> 0x0e34 }
            if (r0 == 0) goto L_0x0018
            com.google.android.gms.location.LocationResult r0 = com.google.android.gms.location.LocationResult.b(r42)     // Catch:{ RuntimeException -> 0x0e34 }
            r5 = r0
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            boolean r0 = defpackage.aztb.l()
            if (r0 == 0) goto L_0x004e
            java.util.List r0 = r1.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004e
            java.util.List r0 = r1.h
            java.util.List r0 = defpackage.ajnz.a((java.util.List) r0)
            int r6 = r0.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 21
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = " ble scans"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "ble scan"
            r1.a((java.util.List) r0, (java.lang.String) r6, (java.lang.String) r7)
            java.util.List r0 = r1.h
            defpackage.ajjd.a((java.util.List) r0)
        L_0x004e:
            java.util.List r0 = r1.h
            r0.clear()
            boolean r6 = com.google.android.gms.location.LocationAvailability.a(r42)
            if (r5 == 0) goto L_0x0d74
            ajhh r9 = r41.b()
            ajme r0 = r1.b
            int r10 = defpackage.ajme.v
            ajmm r10 = r0.c
            jiq r0 = r0.g
            long r11 = java.lang.System.currentTimeMillis()
            com.google.android.location.reporting.state.update.ReportingConfig r13 = r10.a()
            ajmn r0 = r9.a
            boolean r14 = r0.f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r15 = java.lang.String.valueOf(r5)
            java.lang.String r16 = java.lang.String.valueOf(r0)
            int r16 = r16.length()
            java.lang.String r17 = java.lang.String.valueOf(r15)
            int r17 = r17.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r16 = r16 + 90
            int r7 = r16 + r17
            r4.<init>(r7)
            java.lang.String r7 = "LocationReceiver received: deepStillMode: "
            r4.append(r7)
            r4.append(r14)
            java.lang.String r7 = "; mState: "
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = "; isImmediate: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = "; Locations: "
            r4.append(r0)
            r4.append(r15)
            r4.toString()
            boolean r0 = r13.d()
            if (r0 != 0) goto L_0x00c5
            ajlm r0 = r9.d
            defpackage.ajhh.a(r13, r0)
            r20 = r6
            r1 = 0
            goto L_0x0d3f
        L_0x00c5:
            if (r5 != 0) goto L_0x00cb
            r20 = r6
            goto L_0x0d36
        L_0x00cb:
            java.util.List r0 = r5.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0d34
            java.util.List r4 = r5.b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            ajmn r0 = r9.a
            android.location.Location r0 = r0.d()
            r14 = r0
            r15 = 0
        L_0x00e2:
            int r0 = r4.size()
            if (r15 >= r0) goto L_0x07cd
            java.lang.Object r0 = r4.get(r15)
            r8 = r0
            android.location.Location r8 = (android.location.Location) r8
            if (r3 != 0) goto L_0x0157
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r14 == 0) goto L_0x0154
            ajmn r0 = r9.a
            long r0 = defpackage.ajhh.a((defpackage.ajmn) r0)
            boolean r19 = r9.a((long) r0)
            if (r19 != 0) goto L_0x0151
            long r21 = r14.getElapsedRealtimeNanos()
            long r23 = r8.getElapsedRealtimeNanos()
            r19 = r0
            boolean r0 = defpackage.ajhh.a((long) r19, (long) r21, (long) r23)
            if (r0 != 0) goto L_0x0114
            r19 = r4
            goto L_0x0159
        L_0x0114:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.String r17 = java.lang.String.valueOf(r1)
            int r17 = r17.length()
            r19 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r8 = r8 + 37
            int r8 = r8 + r17
            r4.<init>(r8)
            java.lang.String r8 = "Received locations too frequently: "
            r4.append(r8)
            r4.append(r0)
            java.lang.String r0 = ", "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r0)
            goto L_0x0190
        L_0x0151:
            r19 = r4
            goto L_0x0159
        L_0x0154:
            r19 = r4
            goto L_0x0159
        L_0x0157:
            r19 = r4
        L_0x0159:
            boolean r0 = defpackage.rev.j(r8)
            if (r0 == 0) goto L_0x019c
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            boolean r0 = r0.aH()
            if (r0 != 0) goto L_0x016c
            goto L_0x019c
        L_0x016c:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + 20
            r4.<init>(r1)
            java.lang.String r1 = "Filtering location: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r1, (java.lang.String) r0)
        L_0x0190:
            r27 = r5
            r20 = r6
            r2 = r7
            r23 = r10
            r4 = r11
            r30 = r15
            goto L_0x07b9
        L_0x019c:
            ajka r0 = defpackage.ajka.d
            aucd r0 = r0.o()
            double r20 = r8.getLongitude()
            int r1 = defpackage.ajnr.a(r20)
            boolean r4 = r0.c
            if (r4 == 0) goto L_0x01b4
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x01b4:
            aucj r4 = r0.b
            ajka r4 = (defpackage.ajka) r4
            int r2 = r4.a
            r20 = r6
            r6 = 2
            r2 = r2 | r6
            r4.a = r2
            r4.c = r1
            double r1 = r8.getLatitude()
            int r1 = defpackage.ajnr.a(r1)
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x01cf
            goto L_0x01d5
        L_0x01cf:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x01d5:
            aucj r2 = r0.b
            ajka r2 = (defpackage.ajka) r2
            int r4 = r2.a
            r18 = 1
            r4 = r4 | 1
            r2.a = r4
            r2.b = r1
            aucj r0 = r0.i()
            ajka r0 = (defpackage.ajka) r0
            int r1 = defpackage.rev.i(r8)
            ajjx r2 = defpackage.ajjx.u
            aucd r2 = r2.o()
            r4 = 1
            if (r1 == r4) goto L_0x0204
            if (r1 == r6) goto L_0x0201
            r4 = 3
            if (r1 == r4) goto L_0x01fe
            ajjw r1 = defpackage.ajjw.UNKNOWN
            goto L_0x0206
        L_0x01fe:
            ajjw r1 = defpackage.ajjw.WIFI
            goto L_0x0206
        L_0x0201:
            ajjw r1 = defpackage.ajjw.CELL
            goto L_0x0206
        L_0x0204:
            ajjw r1 = defpackage.ajjw.GPS
        L_0x0206:
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x020b
            goto L_0x0211
        L_0x020b:
            r2.c()
            r4 = 0
            r2.c = r4
        L_0x0211:
            aucj r4 = r2.b
            ajjx r4 = (defpackage.ajjx) r4
            int r1 = r1.f
            r4.c = r1
            int r1 = r4.a
            r1 = r1 | r6
            r4.a = r1
            r1 = r7
            long r6 = r8.getTime()
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0228
            goto L_0x022e
        L_0x0228:
            r2.c()
            r4 = 0
            r2.c = r4
        L_0x022e:
            aucj r4 = r2.b
            ajjx r4 = (defpackage.ajjx) r4
            int r3 = r4.a
            r23 = r10
            r10 = 4
            r3 = r3 | r10
            r4.a = r3
            r4.d = r6
            r0.getClass()
            r4.b = r0
            r6 = 1
            r0 = r3 | 1
            r4.a = r0
            boolean r0 = r8.hasSpeed()
            if (r0 == 0) goto L_0x0267
            float r0 = r8.getSpeed()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0255
            goto L_0x025b
        L_0x0255:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x025b:
            aucj r3 = r2.b
            ajjx r3 = (defpackage.ajjx) r3
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            r3.e = r0
        L_0x0267:
            boolean r0 = r8.hasBearing()
            if (r0 == 0) goto L_0x0288
            float r0 = r8.getBearing()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0276
            goto L_0x027c
        L_0x0276:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x027c:
            aucj r3 = r2.b
            ajjx r3 = (defpackage.ajjx) r3
            int r4 = r3.a
            r4 = r4 | 16
            r3.a = r4
            r3.f = r0
        L_0x0288:
            boolean r0 = r8.hasAltitude()
            if (r0 == 0) goto L_0x02a9
            double r3 = r8.getAltitude()
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x0297
            goto L_0x029d
        L_0x0297:
            r2.c()
            r6 = 0
            r2.c = r6
        L_0x029d:
            aucj r0 = r2.b
            ajjx r0 = (defpackage.ajjx) r0
            int r6 = r0.a
            r6 = r6 | 32
            r0.a = r6
            r0.g = r3
        L_0x02a9:
            boolean r0 = r8.hasAccuracy()
            if (r0 == 0) goto L_0x02ca
            float r0 = r8.getAccuracy()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x02b8
            goto L_0x02be
        L_0x02b8:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x02be:
            aucj r3 = r2.b
            ajjx r3 = (defpackage.ajjx) r3
            int r4 = r3.a
            r4 = r4 | 64
            r3.a = r4
            r3.h = r0
        L_0x02ca:
            boolean r0 = defpackage.rev.g(r8)
            if (r0 == 0) goto L_0x02ec
            float r0 = defpackage.rev.h(r8)
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x02d9
            goto L_0x02df
        L_0x02d9:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x02df:
            aucj r3 = r2.b
            ajjx r3 = (defpackage.ajjx) r3
            int r4 = r3.a
            r6 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 | r6
            r3.a = r4
            r3.t = r0
        L_0x02ec:
            aucj r0 = r2.i()
            ajjx r0 = (defpackage.ajjx) r0
            r2 = 5
            java.lang.Object r3 = r0.c(r2)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r0)
            ajmn r0 = r9.a     // Catch:{ RuntimeException -> 0x06c0 }
            long r6 = r0.g()     // Catch:{ RuntimeException -> 0x06c0 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x06c0 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ RuntimeException -> 0x06c0 }
            r24 = r11
            long r10 = r8.getElapsedRealtimeNanos()     // Catch:{ RuntimeException -> 0x06b8 }
            long r10 = r0.toMillis(r10)     // Catch:{ RuntimeException -> 0x06b8 }
            ajmn r0 = r9.a     // Catch:{ RuntimeException -> 0x06b8 }
            boolean r0 = r0.e     // Catch:{ RuntimeException -> 0x06b8 }
            if (r0 != 0) goto L_0x0328
            r26 = -1
            int r0 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x0328
            long r26 = defpackage.aztb.H()     // Catch:{ RuntimeException -> 0x06b8 }
            long r26 = r6 + r26
            int r0 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r0 >= 0) goto L_0x0328
            r0 = 0
            goto L_0x0329
        L_0x0328:
            r0 = 1
        L_0x0329:
            com.google.android.gms.location.WifiScan r12 = com.google.android.gms.location.WifiScan.a((android.location.Location) r8)     // Catch:{ RuntimeException -> 0x06b8 }
            if (r12 == 0) goto L_0x04cb
            int r4 = r12.a()     // Catch:{ RuntimeException -> 0x06b8 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x06b8 }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x06b8 }
            r27 = r5
            r5 = 0
        L_0x033b:
            if (r5 >= r4) goto L_0x04be
            ajkf r28 = defpackage.ajkf.m     // Catch:{ RuntimeException -> 0x04b9 }
            r29 = r4
            aucd r4 = r28.o()     // Catch:{ RuntimeException -> 0x04b9 }
            r28 = r14
            r30 = r15
            long r14 = r12.a((int) r5)     // Catch:{ RuntimeException -> 0x04b2 }
            r31 = r1
            boolean r1 = r4.c     // Catch:{ RuntimeException -> 0x04b0 }
            if (r1 != 0) goto L_0x0354
            goto L_0x035a
        L_0x0354:
            r4.c()     // Catch:{ RuntimeException -> 0x04b0 }
            r1 = 0
            r4.c = r1     // Catch:{ RuntimeException -> 0x04b0 }
        L_0x035a:
            aucj r1 = r4.b     // Catch:{ RuntimeException -> 0x04b0 }
            ajkf r1 = (defpackage.ajkf) r1     // Catch:{ RuntimeException -> 0x04b0 }
            r32 = r8
            int r8 = r1.a     // Catch:{ RuntimeException -> 0x04f2 }
            r18 = 1
            r8 = r8 | 1
            r1.a = r8     // Catch:{ RuntimeException -> 0x04f2 }
            r1.b = r14     // Catch:{ RuntimeException -> 0x04f2 }
            byte r1 = r12.b(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x0373
            goto L_0x0379
        L_0x0373:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x0379:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r15 = 2
            r14 = r14 | r15
            r15 = r29
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.c = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.c(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x0390
            goto L_0x0396
        L_0x0390:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x0396:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r14 = r14 | 16
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.f = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.d(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            if (r1 != 0) goto L_0x03b2
            r35 = r6
            r33 = r10
            r37 = r12
            r29 = r15
            goto L_0x0493
        L_0x03b2:
            int r1 = r12.d(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x03bb
            goto L_0x03c1
        L_0x03bb:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x03c1:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r14 = r14 | 32
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.g = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.e(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x03d6
            goto L_0x03dc
        L_0x03d6:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x03dc:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r14 = r14 | 64
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.h = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.f(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x03f1
            goto L_0x03f7
        L_0x03f1:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x03f7:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r14 = r14 | 128(0x80, float:1.794E-43)
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.i = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.g(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x040c
            goto L_0x0412
        L_0x040c:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x0412:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r14 = r14 | 256(0x100, float:3.59E-43)
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.j = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.h(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r8 = r4.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 != 0) goto L_0x0427
            goto L_0x042d
        L_0x0427:
            r4.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r8 = 0
            r4.c = r8     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x042d:
            aucj r8 = r4.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r8 = (defpackage.ajkf) r8     // Catch:{ RuntimeException -> 0x04f2 }
            int r14 = r8.a     // Catch:{ RuntimeException -> 0x04f2 }
            r14 = r14 | 512(0x200, float:7.175E-43)
            r8.a = r14     // Catch:{ RuntimeException -> 0x04f2 }
            r8.k = r1     // Catch:{ RuntimeException -> 0x04f2 }
            r29 = r15
            long r14 = r12.a((int) r5)     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r12.d(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            int r8 = r12.e(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            r33 = r10
            int r10 = r12.f(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            int r11 = r12.g(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            r35 = r6
            int r6 = r12.h(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x04f2 }
            r37 = r12
            r12 = 206(0xce, float:2.89E-43)
            r7.<init>(r12)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r12 = "Get RTT Ranging result from AP:"
            r7.append(r12)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.append(r14)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r12 = " RttAttemptCount="
            r7.append(r12)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r1 = " RttSuccessCount="
            r7.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.append(r8)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r1 = " RttEstimatedDistanceMm="
            r7.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.append(r10)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r1 = " RttDistanceStddevMm="
            r7.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.append(r11)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r1 = " RttChannelBandwidth="
            r7.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.append(r6)     // Catch:{ RuntimeException -> 0x04f2 }
            r7.toString()     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x0493:
            aucj r1 = r4.i()     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r1 = (defpackage.ajkf) r1     // Catch:{ RuntimeException -> 0x04f2 }
            r2.add(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            int r5 = r5 + 1
            r14 = r28
            r4 = r29
            r15 = r30
            r1 = r31
            r8 = r32
            r10 = r33
            r6 = r35
            r12 = r37
            goto L_0x033b
        L_0x04b0:
            r0 = move-exception
            goto L_0x04b5
        L_0x04b2:
            r0 = move-exception
            r31 = r1
        L_0x04b5:
            r32 = r8
            goto L_0x06cd
        L_0x04b9:
            r0 = move-exception
            r31 = r1
            goto L_0x06bd
        L_0x04be:
            r31 = r1
            r35 = r6
            r32 = r8
            r33 = r10
            r28 = r14
            r30 = r15
            goto L_0x04da
        L_0x04cb:
            r31 = r1
            r27 = r5
            r35 = r6
            r32 = r8
            r33 = r10
            r28 = r14
            r30 = r15
            r2 = 0
        L_0x04da:
            if (r2 == 0) goto L_0x04f5
            boolean r1 = r2.isEmpty()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r1 != 0) goto L_0x04f5
            java.lang.String r1 = "UlrWifiReceived"
            defpackage.ajjb.a((java.lang.String) r1, (com.google.android.location.reporting.state.update.ReportingConfig) r13)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r1 = "UlrWifiReceivedScanSize"
            int r4 = r2.size()     // Catch:{ RuntimeException -> 0x04f2 }
            long r4 = (long) r4     // Catch:{ RuntimeException -> 0x04f2 }
            defpackage.ajjb.b(r1, r4)     // Catch:{ RuntimeException -> 0x04f2 }
            goto L_0x04f5
        L_0x04f2:
            r0 = move-exception
            goto L_0x06cd
        L_0x04f5:
            if (r2 != 0) goto L_0x04fd
            r7 = r33
            r5 = r35
            goto L_0x068c
        L_0x04fd:
            if (r0 == 0) goto L_0x0688
            android.net.wifi.WifiManager r0 = r9.e     // Catch:{ RuntimeException -> 0x04f2 }
            aztb r1 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x04f2 }
            aztc r1 = r1.a()     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r1 = r1.aK()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r1 != 0) goto L_0x050f
            goto L_0x05f2
        L_0x050f:
            if (r0 == 0) goto L_0x0516
            android.net.wifi.WifiInfo r1 = r0.getConnectionInfo()     // Catch:{ RuntimeException -> 0x04f2 }
            goto L_0x0517
        L_0x0516:
            r1 = 0
        L_0x0517:
            if (r1 == 0) goto L_0x051e
            java.lang.String r4 = r1.getBSSID()     // Catch:{ RuntimeException -> 0x04f2 }
            goto L_0x051f
        L_0x051e:
            r4 = 0
        L_0x051f:
            if (r4 == 0) goto L_0x05f2
            long r5 = defpackage.arvy.a((java.lang.String) r4)     // Catch:{ RuntimeException -> 0x04f2 }
            int r1 = r1.getNetworkId()     // Catch:{ RuntimeException -> 0x04f2 }
            java.util.List r0 = r0.getConfiguredNetworks()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 == 0) goto L_0x05f2
            azss r4 = defpackage.azss.a     // Catch:{ RuntimeException -> 0x04f2 }
            azst r4 = r4.a()     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r4 = r4.g()     // Catch:{ RuntimeException -> 0x04f2 }
            r7 = 1
            r8 = r4 ^ 1
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x0540:
            boolean r4 = r0.hasNext()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r4 == 0) goto L_0x0594
            java.lang.Object r4 = r0.next()     // Catch:{ RuntimeException -> 0x04f2 }
            r7 = r4
            android.net.wifi.WifiConfiguration r7 = (android.net.wifi.WifiConfiguration) r7     // Catch:{ RuntimeException -> 0x04f2 }
            int r4 = r7.networkId     // Catch:{ RuntimeException -> 0x04f2 }
            if (r1 != r4) goto L_0x0540
            if (r8 == 0) goto L_0x0576
            java.util.BitSet r0 = r7.allowedKeyManagement     // Catch:{ RuntimeException -> 0x04f2 }
            r1 = 0
            boolean r0 = r0.get(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 != 0) goto L_0x0574
            java.util.BitSet r0 = r7.allowedKeyManagement     // Catch:{ RuntimeException -> 0x04f2 }
            r1 = 1
            boolean r0 = r0.get(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 != 0) goto L_0x0572
            java.util.BitSet r0 = r7.allowedKeyManagement     // Catch:{ RuntimeException -> 0x04f2 }
            r1 = 2
            boolean r0 = r0.get(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 == 0) goto L_0x0570
            r4 = 4
            goto L_0x0577
        L_0x0570:
            r4 = 5
            goto L_0x0577
        L_0x0572:
            r4 = 3
            goto L_0x0577
        L_0x0574:
            r4 = 2
            goto L_0x0577
        L_0x0576:
            r4 = 1
        L_0x0577:
            azsp r0 = defpackage.azsp.a     // Catch:{ RuntimeException -> 0x04f2 }
            azsq r0 = r0.b()     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r0 = r0.a()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 == 0) goto L_0x0592
            java.lang.String r0 = r7.SSID     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 == 0) goto L_0x0592
            java.lang.String r0 = r7.SSID     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r0 = defpackage.agxx.b(r0)     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 != 0) goto L_0x0592
            java.lang.String r0 = r7.SSID     // Catch:{ RuntimeException -> 0x04f2 }
            goto L_0x0596
        L_0x0592:
            r0 = 0
            goto L_0x0596
        L_0x0594:
            r0 = 0
            r4 = 1
        L_0x0596:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x059a:
            boolean r7 = r1.hasNext()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r7 == 0) goto L_0x05f2
            java.lang.Object r7 = r1.next()     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r7 = (defpackage.ajkf) r7     // Catch:{ RuntimeException -> 0x04f2 }
            long r10 = r7.b     // Catch:{ RuntimeException -> 0x04f2 }
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x059a
            r1 = 5
            java.lang.Object r1 = r7.c(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            aucd r1 = (defpackage.aucd) r1     // Catch:{ RuntimeException -> 0x04f2 }
            r1.a((defpackage.aucj) r7)     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r5 = r1.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r5 != 0) goto L_0x05bb
            goto L_0x05c1
        L_0x05bb:
            r1.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r5 = 0
            r1.c = r5     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x05c1:
            aucj r5 = r1.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r5 = (defpackage.ajkf) r5     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r6 = defpackage.ajkf.m     // Catch:{ RuntimeException -> 0x04f2 }
            int r6 = r5.a     // Catch:{ RuntimeException -> 0x04f2 }
            r6 = r6 | 8
            r5.a = r6     // Catch:{ RuntimeException -> 0x04f2 }
            r10 = 1
            r5.e = r10     // Catch:{ RuntimeException -> 0x04f2 }
            if (r8 == 0) goto L_0x05da
            int r4 = r4 + -1
            r5.d = r4     // Catch:{ RuntimeException -> 0x04f2 }
            r6 = r6 | 4
            r5.a = r6     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x05da:
            if (r0 == 0) goto L_0x05e5
            r0.getClass()     // Catch:{ RuntimeException -> 0x04f2 }
            r4 = r6 | 1024(0x400, float:1.435E-42)
            r5.a = r4     // Catch:{ RuntimeException -> 0x04f2 }
            r5.l = r0     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x05e5:
            int r0 = r2.indexOf(r7)     // Catch:{ RuntimeException -> 0x04f2 }
            aucj r1 = r1.i()     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r1 = (defpackage.ajkf) r1     // Catch:{ RuntimeException -> 0x04f2 }
            r2.set(r0, r1)     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x05f2:
            boolean r0 = r3.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 != 0) goto L_0x05f7
            goto L_0x05fd
        L_0x05f7:
            r3.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r1 = 0
            r3.c = r1     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x05fd:
            aucj r0 = r3.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajjx r0 = (defpackage.ajjx) r0     // Catch:{ RuntimeException -> 0x04f2 }
            aucx r1 = defpackage.aucj.s()     // Catch:{ RuntimeException -> 0x04f2 }
            r0.n = r1     // Catch:{ RuntimeException -> 0x04f2 }
            int r0 = r2.size()     // Catch:{ RuntimeException -> 0x04f2 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x060f:
            boolean r2 = r1.hasNext()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r2 != 0) goto L_0x0652
            long r1 = defpackage.aztb.H()     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x04f2 }
            r5 = 150(0x96, float:2.1E-43)
            r4.<init>(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r5 = "Attached "
            r4.append(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            r4.append(r0)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r5 = " wifi scans. Last wifi scan attached timestamp: "
            r4.append(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            r5 = r35
            r4.append(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r5 = " location reports. Expected every "
            r4.append(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r1 = " millis."
            r4.append(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r4.toString()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r0 <= 0) goto L_0x06d4
            ajmn r0 = r9.a     // Catch:{ RuntimeException -> 0x04f2 }
            r7 = r33
            r0.a((long) r7)     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.String r0 = "UlrWifiAttached"
            defpackage.ajjb.a((java.lang.String) r0, (com.google.android.location.reporting.state.update.ReportingConfig) r13)     // Catch:{ RuntimeException -> 0x04f2 }
            goto L_0x06d4
        L_0x0652:
            r7 = r33
            r5 = r35
            java.lang.Object r2 = r1.next()     // Catch:{ RuntimeException -> 0x04f2 }
            ajkf r2 = (defpackage.ajkf) r2     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r4 = r3.c     // Catch:{ RuntimeException -> 0x04f2 }
            if (r4 != 0) goto L_0x0661
            goto L_0x0667
        L_0x0661:
            r3.c()     // Catch:{ RuntimeException -> 0x04f2 }
            r4 = 0
            r3.c = r4     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x0667:
            aucj r4 = r3.b     // Catch:{ RuntimeException -> 0x04f2 }
            ajjx r4 = (defpackage.ajjx) r4     // Catch:{ RuntimeException -> 0x04f2 }
            r2.getClass()     // Catch:{ RuntimeException -> 0x04f2 }
            aucx r10 = r4.n     // Catch:{ RuntimeException -> 0x04f2 }
            boolean r10 = r10.a()     // Catch:{ RuntimeException -> 0x04f2 }
            if (r10 != 0) goto L_0x067e
            aucx r10 = r4.n     // Catch:{ RuntimeException -> 0x04f2 }
            aucx r10 = defpackage.aucj.a((defpackage.aucx) r10)     // Catch:{ RuntimeException -> 0x04f2 }
            r4.n = r10     // Catch:{ RuntimeException -> 0x04f2 }
        L_0x067e:
            aucx r4 = r4.n     // Catch:{ RuntimeException -> 0x04f2 }
            r4.add(r2)     // Catch:{ RuntimeException -> 0x04f2 }
            r35 = r5
            r33 = r7
            goto L_0x060f
        L_0x0688:
            r7 = r33
            r5 = r35
        L_0x068c:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ RuntimeException -> 0x04f2 }
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ RuntimeException -> 0x04f2 }
            if (r2 != 0) goto L_0x0695
            r1 = 1
            goto L_0x0696
        L_0x0695:
            r1 = 0
        L_0x0696:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r2 = 0
            r0[r2] = r1     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ RuntimeException -> 0x04f2 }
            r2 = 1
            r0[r2] = r1     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ RuntimeException -> 0x04f2 }
            r2 = 2
            r0[r2] = r1     // Catch:{ RuntimeException -> 0x04f2 }
            long r1 = defpackage.aztb.H()     // Catch:{ RuntimeException -> 0x04f2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ RuntimeException -> 0x04f2 }
            r2 = 3
            r0[r2] = r1     // Catch:{ RuntimeException -> 0x04f2 }
            goto L_0x06d4
        L_0x06b8:
            r0 = move-exception
            r31 = r1
            r27 = r5
        L_0x06bd:
            r32 = r8
            goto L_0x06c9
        L_0x06c0:
            r0 = move-exception
            r31 = r1
            r27 = r5
            r32 = r8
            r24 = r11
        L_0x06c9:
            r28 = r14
            r30 = r15
        L_0x06cd:
            java.lang.String r1 = "GCoreUlr"
            java.lang.String r2 = "Best-effort Wifi scan attachment failed"
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x06d4:
            azss r0 = defpackage.azss.a
            azst r0 = r0.a()
            boolean r0 = r0.f()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x06e3
            goto L_0x072c
        L_0x06e3:
            boolean r0 = defpackage.rev.b(r32)
            if (r0 == 0) goto L_0x0707
            java.lang.String r0 = defpackage.rev.a(r32)
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x06f2
            goto L_0x06f8
        L_0x06f2:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x06f8:
            aucj r1 = r3.b
            ajjx r1 = (defpackage.ajjx) r1
            r0.getClass()
            int r2 = r1.a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.a = r2
            r1.l = r0
        L_0x0707:
            boolean r0 = defpackage.rev.c(r32)
            if (r0 == 0) goto L_0x072c
            java.lang.Integer r0 = defpackage.rev.d(r32)
            int r0 = r0.intValue()
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x071a
            goto L_0x0720
        L_0x071a:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x0720:
            aucj r1 = r3.b
            ajjx r1 = (defpackage.ajjx) r1
            int r2 = r1.a
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r1.a = r2
            r1.m = r0
        L_0x072c:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0731
            goto L_0x0737
        L_0x0731:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x0737:
            aucj r0 = r3.b
            ajjx r0 = (defpackage.ajjx) r0
            int r1 = r0.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.a = r1
            r1 = 2023(0x7e7, float:2.835E-42)
            r0.i = r1
            azss r0 = defpackage.azss.a
            azst r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x078c
            r2 = r28
            r1 = r32
            float r0 = defpackage.ajnt.a(r1, r2)
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0773
            float r2 = r2.distanceTo(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0773
            double r4 = (double) r2
            double r6 = defpackage.aztb.I()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0771
            r0 = 1
            goto L_0x0774
        L_0x0771:
            r0 = 0
            goto L_0x0774
        L_0x0773:
            r0 = 1
        L_0x0774:
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x0779
            goto L_0x077f
        L_0x0779:
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x077f:
            aucj r2 = r3.b
            ajjx r2 = (defpackage.ajjx) r2
            int r4 = r2.a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r2.a = r4
            r2.k = r0
            goto L_0x078e
        L_0x078c:
            r1 = r32
        L_0x078e:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0793
            goto L_0x0799
        L_0x0793:
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x0799:
            aucj r0 = r3.b
            ajjx r0 = (defpackage.ajjx) r0
            int r2 = r0.a
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r4
            r0.a = r2
            r4 = r24
            r0.r = r4
            aucj r0 = r3.i()
            ajjx r0 = (defpackage.ajjx) r0
            r2 = r31
            r2.add(r0)
            ajmn r0 = r9.a
            r0.c()
            r14 = r1
        L_0x07b9:
            int r15 = r30 + 1
            r1 = r41
            r3 = r44
            r7 = r2
            r11 = r4
            r4 = r19
            r6 = r20
            r10 = r23
            r5 = r27
            r2 = r43
            goto L_0x00e2
        L_0x07cd:
            r27 = r5
            r20 = r6
            r2 = r7
            r23 = r10
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x07e4
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "No valid location reports to store"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r1)
            r1 = 0
            goto L_0x0d3f
        L_0x07e4:
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.remove(r0)
            ajjx r0 = (defpackage.ajjx) r0
            r1 = 5
            java.lang.Object r3 = r0.c(r1)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r0)
            ajnn r0 = r9.c
            android.content.Context r0 = r0.b
            ajjp r0 = defpackage.ajnn.a((android.content.Context) r0)
            azss r1 = defpackage.azss.a
            azst r1 = r1.a()
            boolean r1 = r1.h()
            if (r1 != 0) goto L_0x080f
            goto L_0x0840
        L_0x080f:
            if (r0 == 0) goto L_0x0826
            int r1 = r0.a
            r4 = 1
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0826
            int r1 = r0.b
            int r1 = defpackage.ajjo.a(r1)
            if (r1 != 0) goto L_0x0821
            r1 = 0
            goto L_0x0827
        L_0x0821:
            if (r1 != r4) goto L_0x0824
            goto L_0x0826
        L_0x0824:
            r1 = 1
            goto L_0x0827
        L_0x0826:
            r1 = 0
        L_0x0827:
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x082c
            goto L_0x0832
        L_0x082c:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x0832:
            aucj r4 = r3.b
            ajjx r4 = (defpackage.ajjx) r4
            ajjx r5 = defpackage.ajjx.u
            int r5 = r4.a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r4.a = r5
            r4.j = r1
        L_0x0840:
            azss r1 = defpackage.azss.a
            azst r1 = r1.a()
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x0868
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x0851
            goto L_0x0857
        L_0x0851:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x0857:
            aucj r1 = r3.b
            ajjx r1 = (defpackage.ajjx) r1
            ajjx r4 = defpackage.ajjx.u
            r0.getClass()
            r1.o = r0
            int r4 = r1.a
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r1.a = r4
        L_0x0868:
            aucj r1 = r3.i()
            ajjx r1 = (defpackage.ajjx) r1
            r2.add(r1)
            ajmn r1 = r9.a
            r1.g = r0
            android.location.Location r0 = r27.a()
            ajin r1 = r9.b
            boolean r3 = defpackage.azsy.c()
            if (r3 != 0) goto L_0x0887
            r15 = r23
            r23 = r13
            goto L_0x09b2
        L_0x0887:
            ajik r3 = r1.b
            if (r3 == 0) goto L_0x09ae
            com.google.android.location.reporting.state.update.ReportingConfig r1 = r23.a()
            java.util.List r1 = r1.c()
            java.lang.Object r5 = r3.c
            monitor-enter(r5)
            com.google.android.gms.leveldb.LevelDb r6 = r3.d     // Catch:{ all -> 0x09ab }
            if (r6 == 0) goto L_0x09a5
            ajij r6 = new ajij     // Catch:{ all -> 0x09ab }
            r6.<init>()     // Catch:{ all -> 0x09ab }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x09a0 }
        L_0x08a3:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x09a0 }
            if (r8 == 0) goto L_0x0991
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x09a0 }
            ajjx r8 = (defpackage.ajjx) r8     // Catch:{ all -> 0x09a0 }
            long r10 = r8.d     // Catch:{ all -> 0x09a0 }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x09a0 }
        L_0x08b5:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x09a0 }
            if (r14 == 0) goto L_0x0985
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x09a0 }
            com.google.android.location.reporting.state.update.AccountConfig r14 = (com.google.android.location.reporting.state.update.AccountConfig) r14     // Catch:{ all -> 0x09a0 }
            android.accounts.Account r14 = r14.a     // Catch:{ all -> 0x09a0 }
            r15 = r23
            int r4 = r15.g(r14)     // Catch:{ all -> 0x09a0 }
            r21 = r1
            int r1 = r15.f(r14)     // Catch:{ all -> 0x09a0 }
            r22 = r7
            java.lang.String r7 = r14.name     // Catch:{ all -> 0x09a0 }
            java.lang.String r23 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09a0 }
            int r23 = r23.length()     // Catch:{ all -> 0x09a0 }
            r24 = r12
            int r12 = r23 + 90
            r23 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x09a0 }
            r13.<init>(r12)     // Catch:{ all -> 0x09a0 }
            java.lang.String r12 = "Save location on account "
            r13.append(r12)     // Catch:{ all -> 0x09a0 }
            r13.append(r7)     // Catch:{ all -> 0x09a0 }
            java.lang.String r7 = " with reboot number: "
            r13.append(r7)     // Catch:{ all -> 0x09a0 }
            r13.append(r1)     // Catch:{ all -> 0x09a0 }
            java.lang.String r7 = " and sequence number: "
            r13.append(r7)     // Catch:{ all -> 0x09a0 }
            r13.append(r4)     // Catch:{ all -> 0x09a0 }
            r13.toString()     // Catch:{ all -> 0x09a0 }
            ajjr r7 = defpackage.ajjr.g     // Catch:{ all -> 0x09a0 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x09a0 }
            r12 = 5
            java.lang.Object r13 = r8.c(r12)     // Catch:{ all -> 0x09a0 }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ all -> 0x09a0 }
            r13.a((defpackage.aucj) r8)     // Catch:{ all -> 0x09a0 }
            boolean r12 = r13.c     // Catch:{ all -> 0x09a0 }
            if (r12 != 0) goto L_0x0916
            goto L_0x091c
        L_0x0916:
            r13.c()     // Catch:{ all -> 0x09a0 }
            r12 = 0
            r13.c = r12     // Catch:{ all -> 0x09a0 }
        L_0x091c:
            aucj r12 = r13.b     // Catch:{ all -> 0x09a0 }
            ajjx r12 = (defpackage.ajjx) r12     // Catch:{ all -> 0x09a0 }
            ajjx r25 = defpackage.ajjx.u     // Catch:{ all -> 0x09a0 }
            r25 = r8
            int r8 = r12.a     // Catch:{ all -> 0x09a0 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r12.a = r8     // Catch:{ all -> 0x09a0 }
            r12.p = r1     // Catch:{ all -> 0x09a0 }
            r1 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r1
            r12.a = r8     // Catch:{ all -> 0x09a0 }
            r12.q = r4     // Catch:{ all -> 0x09a0 }
            aucj r1 = r13.i()     // Catch:{ all -> 0x09a0 }
            ajjx r1 = (defpackage.ajjx) r1     // Catch:{ all -> 0x09a0 }
            boolean r4 = r7.c     // Catch:{ all -> 0x09a0 }
            if (r4 != 0) goto L_0x093f
            goto L_0x0945
        L_0x093f:
            r7.c()     // Catch:{ all -> 0x09a0 }
            r4 = 0
            r7.c = r4     // Catch:{ all -> 0x09a0 }
        L_0x0945:
            aucj r4 = r7.b     // Catch:{ all -> 0x09a0 }
            ajjr r4 = (defpackage.ajjr) r4     // Catch:{ all -> 0x09a0 }
            r1.getClass()     // Catch:{ all -> 0x09a0 }
            r4.b = r1     // Catch:{ all -> 0x09a0 }
            int r1 = r4.a     // Catch:{ all -> 0x09a0 }
            r8 = 1
            r1 = r1 | r8
            r4.a = r1     // Catch:{ all -> 0x09a0 }
            aucj r1 = r7.i()     // Catch:{ all -> 0x09a0 }
            ajjr r1 = (defpackage.ajjr) r1     // Catch:{ all -> 0x09a0 }
            java.lang.String r4 = "Locations"
            byte[] r4 = r3.a((defpackage.ajjr) r1, (java.lang.String) r4)     // Catch:{ all -> 0x09a0 }
            if (r4 == 0) goto L_0x0977
            byte[] r1 = defpackage.ajir.a((android.accounts.Account) r14, (long) r10, (defpackage.ajjr) r1)     // Catch:{ all -> 0x09a0 }
            r6.a(r1, r4)     // Catch:{ all -> 0x09a0 }
            r1 = r21
            r7 = r22
            r13 = r23
            r12 = r24
            r8 = r25
            r23 = r15
            goto L_0x08b5
        L_0x0977:
            r1 = r21
            r7 = r22
            r13 = r23
            r12 = r24
            r8 = r25
            r23 = r15
            goto L_0x08b5
        L_0x0985:
            r21 = r1
            r22 = r7
            r15 = r23
            r23 = r13
            r23 = r15
            goto L_0x08a3
        L_0x0991:
            r23 = r13
            java.lang.String r1 = "Locations"
            boolean r1 = r3.a((defpackage.ajij) r6, (java.lang.String) r1)     // Catch:{ all -> 0x09a0 }
            r6.a()     // Catch:{ all -> 0x09ab }
            monitor-exit(r5)     // Catch:{ all -> 0x09ab }
            r4 = r1
            goto L_0x0abe
        L_0x09a0:
            r0 = move-exception
            r6.a()     // Catch:{ all -> 0x09ab }
            throw r0     // Catch:{ all -> 0x09ab }
        L_0x09a5:
            r23 = r13
            monitor-exit(r5)     // Catch:{ all -> 0x09ab }
            r4 = 0
            goto L_0x0abe
        L_0x09ab:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x09ab }
            throw r0
        L_0x09ae:
            r15 = r23
            r23 = r13
        L_0x09b2:
            ajim r1 = r1.a
            com.google.android.location.reporting.state.update.ReportingConfig r3 = r15.a()
            java.util.List r3 = r3.c()
            java.lang.Object r4 = r1.c
            monitor-enter(r4)
            com.google.android.gms.leveldb.LevelDb r5 = r1.d     // Catch:{ all -> 0x0d31 }
            if (r5 == 0) goto L_0x0abc
            ajil r5 = new ajil     // Catch:{ all -> 0x0d31 }
            r5.<init>()     // Catch:{ all -> 0x0d31 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0ab7 }
        L_0x09cc:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0ab7 }
            if (r7 == 0) goto L_0x0aab
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0ab7 }
            ajjx r7 = (defpackage.ajjx) r7     // Catch:{ all -> 0x0ab7 }
            long r10 = r7.d     // Catch:{ all -> 0x0ab7 }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x0ab7 }
        L_0x09de:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x0ab7 }
            if (r12 == 0) goto L_0x0aa2
            java.lang.Object r12 = r8.next()     // Catch:{ all -> 0x0ab7 }
            com.google.android.location.reporting.state.update.AccountConfig r12 = (com.google.android.location.reporting.state.update.AccountConfig) r12     // Catch:{ all -> 0x0ab7 }
            android.accounts.Account r12 = r12.a     // Catch:{ all -> 0x0ab7 }
            int r13 = r15.g(r12)     // Catch:{ all -> 0x0ab7 }
            int r14 = r15.f(r12)     // Catch:{ all -> 0x0ab7 }
            r21 = r3
            java.lang.String r3 = r12.name     // Catch:{ all -> 0x0ab7 }
            java.lang.String r22 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0ab7 }
            int r22 = r22.length()     // Catch:{ all -> 0x0ab7 }
            r24 = r6
            int r6 = r22 + 90
            r22 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ab7 }
            r8.<init>(r6)     // Catch:{ all -> 0x0ab7 }
            java.lang.String r6 = "Save location on account "
            r8.append(r6)     // Catch:{ all -> 0x0ab7 }
            r8.append(r3)     // Catch:{ all -> 0x0ab7 }
            java.lang.String r3 = " with reboot number: "
            r8.append(r3)     // Catch:{ all -> 0x0ab7 }
            r8.append(r14)     // Catch:{ all -> 0x0ab7 }
            java.lang.String r3 = " and sequence number: "
            r8.append(r3)     // Catch:{ all -> 0x0ab7 }
            r8.append(r13)     // Catch:{ all -> 0x0ab7 }
            r8.toString()     // Catch:{ all -> 0x0ab7 }
            ajjs r3 = defpackage.ajjs.g     // Catch:{ all -> 0x0ab7 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0ab7 }
            r6 = 5
            java.lang.Object r8 = r7.c(r6)     // Catch:{ all -> 0x0ab7 }
            aucd r8 = (defpackage.aucd) r8     // Catch:{ all -> 0x0ab7 }
            r8.a((defpackage.aucj) r7)     // Catch:{ all -> 0x0ab7 }
            boolean r6 = r8.c     // Catch:{ all -> 0x0ab7 }
            if (r6 != 0) goto L_0x0a3b
            goto L_0x0a41
        L_0x0a3b:
            r8.c()     // Catch:{ all -> 0x0ab7 }
            r6 = 0
            r8.c = r6     // Catch:{ all -> 0x0ab7 }
        L_0x0a41:
            aucj r6 = r8.b     // Catch:{ all -> 0x0ab7 }
            ajjx r6 = (defpackage.ajjx) r6     // Catch:{ all -> 0x0ab7 }
            ajjx r25 = defpackage.ajjx.u     // Catch:{ all -> 0x0ab7 }
            r25 = r7
            int r7 = r6.a     // Catch:{ all -> 0x0ab7 }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            r6.a = r7     // Catch:{ all -> 0x0ab7 }
            r6.p = r14     // Catch:{ all -> 0x0ab7 }
            r14 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 | r14
            r6.a = r7     // Catch:{ all -> 0x0ab7 }
            r6.q = r13     // Catch:{ all -> 0x0ab7 }
            aucj r6 = r8.i()     // Catch:{ all -> 0x0ab7 }
            ajjx r6 = (defpackage.ajjx) r6     // Catch:{ all -> 0x0ab7 }
            boolean r7 = r3.c     // Catch:{ all -> 0x0ab7 }
            if (r7 != 0) goto L_0x0a64
            goto L_0x0a6a
        L_0x0a64:
            r3.c()     // Catch:{ all -> 0x0ab7 }
            r7 = 0
            r3.c = r7     // Catch:{ all -> 0x0ab7 }
        L_0x0a6a:
            aucj r7 = r3.b     // Catch:{ all -> 0x0ab7 }
            ajjs r7 = (defpackage.ajjs) r7     // Catch:{ all -> 0x0ab7 }
            r6.getClass()     // Catch:{ all -> 0x0ab7 }
            r7.b = r6     // Catch:{ all -> 0x0ab7 }
            int r6 = r7.a     // Catch:{ all -> 0x0ab7 }
            r8 = 1
            r6 = r6 | r8
            r7.a = r6     // Catch:{ all -> 0x0ab7 }
            aucj r3 = r3.i()     // Catch:{ all -> 0x0ab7 }
            ajjs r3 = (defpackage.ajjs) r3     // Catch:{ all -> 0x0ab7 }
            java.lang.String r6 = "Locations"
            byte[] r6 = r1.a((defpackage.ajjs) r3, (java.lang.String) r6)     // Catch:{ all -> 0x0ab7 }
            if (r6 == 0) goto L_0x0a98
            byte[] r3 = defpackage.ajir.a((android.accounts.Account) r12, (long) r10, (defpackage.ajjs) r3)     // Catch:{ all -> 0x0ab7 }
            r5.a(r3, r6)     // Catch:{ all -> 0x0ab7 }
            r3 = r21
            r8 = r22
            r6 = r24
            r7 = r25
            goto L_0x09de
        L_0x0a98:
            r3 = r21
            r8 = r22
            r6 = r24
            r7 = r25
            goto L_0x09de
        L_0x0aa2:
            r21 = r3
            r24 = r6
            r14 = 32768(0x8000, float:4.5918E-41)
            goto L_0x09cc
        L_0x0aab:
            java.lang.String r3 = "Locations"
            boolean r1 = r1.a((defpackage.ajil) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0ab7 }
            r5.a()     // Catch:{ all -> 0x0d31 }
            monitor-exit(r4)     // Catch:{ all -> 0x0d31 }
            r4 = r1
            goto L_0x0abe
        L_0x0ab7:
            r0 = move-exception
            r5.a()     // Catch:{ all -> 0x0d31 }
            throw r0     // Catch:{ all -> 0x0d31 }
        L_0x0abc:
            monitor-exit(r4)     // Catch:{ all -> 0x0d31 }
            r4 = 0
        L_0x0abe:
            if (r4 == 0) goto L_0x0aeb
            int r1 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r5 = 43
            r3.<init>(r5)
            java.lang.String r5 = "Successfully inserted "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = " locations"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r3, (java.lang.String) r1)
            ajmn r1 = r9.a
            long r5 = android.os.SystemClock.elapsedRealtime()
            r1.a(r0, r5)
            goto L_0x0af3
        L_0x0aeb:
            java.lang.String r1 = "GCoreUlr"
            java.lang.String r3 = "Location insertion failed for all accounts"
            defpackage.ajix.b((java.lang.String) r1, (java.lang.String) r3)
        L_0x0af3:
            ajlm r1 = r9.d
            ajhp r1 = r1.h
            java.lang.Object r3 = r1.c
            monitor-enter(r3)
            java.util.Set r5 = r1.a     // Catch:{ all -> 0x0d2e }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d2e }
            if (r5 != 0) goto L_0x0cc9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0d2e }
            java.util.Set r6 = r1.a     // Catch:{ all -> 0x0d2e }
            r5.<init>(r6)     // Catch:{ all -> 0x0d2e }
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x0d2e }
            r1.clear()     // Catch:{ all -> 0x0d2e }
            monitor-exit(r3)     // Catch:{ all -> 0x0d2e }
            long r6 = defpackage.ajnw.b()
            int r1 = r2.size()
            r3 = 0
        L_0x0b18:
            if (r3 < r1) goto L_0x0c7d
            aztb r1 = defpackage.aztb.a
            aztc r1 = r1.a()
            long r1 = r1.ca()
            int r2 = (int) r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r5.size()
            r8 = 0
        L_0x0b2f:
            if (r8 >= r3) goto L_0x0c76
            java.lang.Object r10 = r5.get(r8)
            com.google.android.gms.location.WifiScan r10 = (com.google.android.gms.location.WifiScan) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = 0
        L_0x0b3d:
            int r13 = r10.a()
            if (r12 < r13) goto L_0x0b51
            r17 = r0
            r19 = r2
            r21 = r3
            r38 = r4
            r40 = r5
            r39 = r9
            goto L_0x0c3d
        L_0x0b51:
            if (r12 >= r2) goto L_0x0c31
            int r13 = r10.d(r12)
            if (r13 == 0) goto L_0x0beb
            com.google.android.ulr.RttRangingProto r13 = new com.google.android.ulr.RttRangingProto
            int r14 = r10.d(r12)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r14)
            int r14 = r10.h(r12)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r14)
            int r14 = r10.g(r12)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r14)
            int r14 = r10.f(r12)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r14)
            int r14 = r10.e(r12)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r14)
            r24 = r13
            r24.<init>(r25, r26, r27, r28, r29)
            long r14 = r10.a((int) r12)
            r17 = r0
            int r0 = r10.d(r12)
            r19 = r2
            int r2 = r10.e(r12)
            r21 = r3
            int r3 = r10.f(r12)
            r22 = r13
            int r13 = r10.g(r12)
            r38 = r4
            int r4 = r10.h(r12)
            r39 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r40 = r5
            r5 = 214(0xd6, float:3.0E-43)
            r9.<init>(r5)
            java.lang.String r5 = "Get passive RTT Ranging result from AP:"
            r9.append(r5)
            r9.append(r14)
            java.lang.String r5 = " RttAttemptCount="
            r9.append(r5)
            r9.append(r0)
            java.lang.String r0 = " RttSuccessCount="
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = " RttEstimatedDistanceMm="
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = " RttDistanceStddevMm="
            r9.append(r0)
            r9.append(r13)
            java.lang.String r0 = " RttChannelBandwidth="
            r9.append(r0)
            r9.append(r4)
            r9.toString()
            r28 = r22
            goto L_0x0bf9
        L_0x0beb:
            r17 = r0
            r19 = r2
            r21 = r3
            r38 = r4
            r40 = r5
            r39 = r9
            r28 = 0
        L_0x0bf9:
            com.google.android.ulr.WifiStrengthProto r0 = new com.google.android.ulr.WifiStrengthProto
            int r2 = r10.c(r12)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r2)
            r26 = 0
            long r2 = r10.a((int) r12)
            java.lang.Long r27 = java.lang.Long.valueOf(r2)
            r29 = 0
            byte r2 = r10.b(r12)
            java.lang.Integer r30 = java.lang.Integer.valueOf(r2)
            r31 = 0
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r11.add(r0)
            int r12 = r12 + 1
            r0 = r17
            r2 = r19
            r3 = r21
            r4 = r38
            r9 = r39
            r5 = r40
            goto L_0x0b3d
        L_0x0c31:
            r17 = r0
            r19 = r2
            r21 = r3
            r38 = r4
            r40 = r5
            r39 = r9
        L_0x0c3d:
            long r2 = r10.c
            com.google.android.ulr.ApiMetadata r0 = new com.google.android.ulr.ApiMetadata
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            long r2 = r2 + r6
            java.lang.Long r35 = java.lang.Long.valueOf(r2)
            r36 = 0
            r24 = r0
            r37 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1.add(r0)
            int r8 = r8 + 1
            r0 = r17
            r2 = r19
            r3 = r21
            r4 = r38
            r9 = r39
            r5 = r40
            goto L_0x0b2f
        L_0x0c76:
            r17 = r0
            r38 = r4
            r39 = r9
            goto L_0x0cd5
        L_0x0c7d:
            r17 = r0
            r38 = r4
            r40 = r5
            r39 = r9
            java.lang.Object r0 = r2.get(r3)
            ajjx r0 = (defpackage.ajjx) r0
            aucx r4 = r0.n
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0c94
            goto L_0x0cbd
        L_0x0c94:
            java.util.Iterator r4 = r40.iterator()
        L_0x0c98:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0cbd
            java.lang.Object r5 = r4.next()
            com.google.android.gms.location.WifiScan r5 = (com.google.android.gms.location.WifiScan) r5
            long r8 = r5.c
            long r8 = r8 + r6
            long r10 = r0.d
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c98
            int r5 = r5.a()
            aucx r8 = r0.n
            int r8 = r8.size()
            if (r5 > r8) goto L_0x0c98
            r4.remove()
            goto L_0x0c98
        L_0x0cbd:
            int r3 = r3 + 1
            r0 = r17
            r4 = r38
            r9 = r39
            r5 = r40
            goto L_0x0b18
        L_0x0cc9:
            r17 = r0
            r38 = r4
            r39 = r9
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0d2e }
            r1.<init>()     // Catch:{ all -> 0x0d2e }
            monitor-exit(r3)     // Catch:{ all -> 0x0d2e }
        L_0x0cd5:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0d22
            r2 = r39
            ajin r0 = r2.b
            java.util.List r2 = r23.b()
            java.lang.String r3 = "wifi scans"
            boolean r0 = r0.a((java.util.List) r2, (java.util.List) r1, (java.lang.String) r3)
            if (r0 == 0) goto L_0x0d07
            int r0 = r1.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 45
            r1.<init>(r2)
            java.lang.String r2 = "Successfully inserted "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " wifi scans."
            r1.append(r0)
            r1.toString()
            goto L_0x0d22
        L_0x0d07:
            int r0 = r1.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 57
            r1.<init>(r2)
            java.lang.String r2 = "Failed to insert "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " wifi scans for all accounts."
            r1.append(r0)
            r1.toString()
        L_0x0d22:
            if (r38 != 0) goto L_0x0d26
            r0 = 0
            goto L_0x0d28
        L_0x0d26:
            r0 = r17
        L_0x0d28:
            ajhg r1 = new ajhg
            r1.<init>(r0)
            goto L_0x0d3f
        L_0x0d2e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0d2e }
            throw r0
        L_0x0d31:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0d31 }
            throw r0
        L_0x0d34:
            r20 = r6
        L_0x0d36:
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "Received null or empty location result, so returning early."
            defpackage.ajix.c(r0, r1)
            r1 = 0
        L_0x0d3f:
            r0 = r44 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 38
            r4.<init>(r3)
            java.lang.String r3 = "UlrClearcutEvents.logLocationUpdated("
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ")"
            r4.append(r2)
            r4.toString()
            boolean r2 = defpackage.ajjd.a()
            if (r2 == 0) goto L_0x0d82
            ajjc r2 = defpackage.ajjd.a
            r2.a((java.lang.Boolean) r0)
            goto L_0x0d82
        L_0x0d74:
            r20 = r6
            if (r20 != 0) goto L_0x0d80
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "Received null location result"
            defpackage.ajix.c(r0, r1)
            goto L_0x0d81
        L_0x0d80:
        L_0x0d81:
            r1 = 0
        L_0x0d82:
            if (r20 == 0) goto L_0x0e0f
            com.google.android.gms.location.LocationAvailability r0 = com.google.android.gms.location.LocationAvailability.b(r42)
            if (r0 == 0) goto L_0x0e05
            ajhh r2 = r41.b()
            com.google.android.gms.location.NetworkLocationStatus[] r3 = r0.e
            if (r3 != 0) goto L_0x0d95
            r6 = r43
            goto L_0x0db3
        L_0x0d95:
            int r4 = r3.length
            if (r4 <= 0) goto L_0x0db1
            r8 = 0
            r16 = 0
        L_0x0d9b:
            if (r8 >= r4) goto L_0x0dae
            r5 = r3[r8]
            r6 = r43
            r7 = 1
            boolean r5 = r2.a((com.google.android.gms.location.NetworkLocationStatus) r5, (com.google.android.location.reporting.state.update.ReportingConfig) r6, (boolean) r7)
            if (r5 != 0) goto L_0x0da9
            goto L_0x0dab
        L_0x0da9:
            r16 = 1
        L_0x0dab:
            int r8 = r8 + 1
            goto L_0x0d9b
        L_0x0dae:
            r6 = r43
            goto L_0x0de4
        L_0x0db1:
            r6 = r43
        L_0x0db3:
            int r9 = r0.b
            int r10 = r0.a
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r0.c
            com.google.android.gms.location.NetworkLocationStatus r3 = com.google.android.gms.location.NetworkLocationStatus.a(r9, r10, r11, r13)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 15
            r7.<init>(r5)
            java.lang.String r5 = "legacy status: "
            r7.append(r5)
            r7.append(r4)
            r7.toString()
            r4 = 0
            boolean r16 = r2.a((com.google.android.gms.location.NetworkLocationStatus) r3, (com.google.android.location.reporting.state.update.ReportingConfig) r6, (boolean) r4)
        L_0x0de4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 25
            r3.<init>(r2)
            java.lang.String r2 = "Received locationStatus: "
            r3.append(r2)
            r3.append(r0)
            r3.toString()
            if (r16 == 0) goto L_0x0e11
            goto L_0x0e13
        L_0x0e05:
            r6 = r43
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r2 = "locationStatus not set."
            defpackage.ajix.c(r0, r2)
            goto L_0x0e11
        L_0x0e0f:
            r6 = r43
        L_0x0e11:
            if (r1 == 0) goto L_0x0e31
        L_0x0e13:
            if (r1 == 0) goto L_0x0e18
            android.location.Location r4 = r1.a
            goto L_0x0e19
        L_0x0e18:
            r4 = 0
        L_0x0e19:
            boolean r0 = defpackage.aztb.o()
            if (r0 != 0) goto L_0x0e20
            goto L_0x0e25
        L_0x0e20:
            if (r44 != 0) goto L_0x0e25
            r1 = r41
            goto L_0x0e33
        L_0x0e25:
            r1 = r41
            ajme r0 = r1.b
            int r2 = defpackage.ajme.v
            ajkv r0 = r0.h
            r0.a(r6, r4)
            return
        L_0x0e31:
            r1 = r41
        L_0x0e33:
            return
        L_0x0e34:
            r0 = move-exception
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r3 = "getting location result"
            defpackage.ajix.b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            return
        L_0x0e3d:
            ajme r0 = r1.b
            int r2 = defpackage.ajme.v
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajma.a(android.content.Intent, com.google.android.location.reporting.state.update.ReportingConfig, boolean):void");
    }

    private final synchronized ajhh b() {
        if (this.i == null) {
            ajme ajme = this.b;
            int i2 = ajme.v;
            Context context = ajme.b;
            ajmn ajmn = ajme.e;
            ajlm ajlm = this.g;
            ajin ajin = ajme.p;
            ajnw.a(context);
            this.i = new ajhh(ajmn, ajin, new ajnn(context), ajlm, (WifiManager) context.getSystemService("wifi"));
        }
        return this.i;
    }

    private final synchronized ajgz c() {
        if (this.j == null) {
            ajme ajme = this.b;
            int i2 = ajme.v;
            Context context = ajme.b;
            ajmn ajmn = ajme.e;
            ajlm ajlm = this.g;
            ajin ajin = ajme.p;
            ajnw.a(context);
            this.j = new ajgz(ajmn, ajin, ajlm);
        }
        return this.j;
    }

    private final void a(ApiMetadata apiMetadata, String str, String str2) {
        ajme ajme = this.b;
        int i2 = ajme.v;
        ReportingConfig a = ajme.c.a();
        String a2 = rmp.a((Iterable) a.b());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(a2).length());
        sb.append("Received '");
        sb.append(str);
        sb.append("' for accounts ");
        sb.append(a2);
        sb.toString();
        this.b.p.a(a.b(), apiMetadata, str2);
    }

    private final void a(List list, String str, String str2) {
        ajme ajme = this.b;
        int i2 = ajme.v;
        ReportingConfig a = ajme.c.a();
        String a2 = rmp.a((Iterable) a.b());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(a2).length());
        sb.append("Received '");
        sb.append(str);
        sb.append("' for accounts ");
        sb.append(a2);
        sb.toString();
        this.b.p.a(a.b(), list, str2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r14v8, types: [atdp] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05ee A[Catch:{ IllegalArgumentException -> 0x06a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0644 A[Catch:{ IllegalArgumentException -> 0x06a3 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            int r2 = defpackage.ajme.v
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = r24.getAction()
            if (r2 == 0) goto L_0x0944
            java.lang.String r3 = java.lang.String.valueOf(r24)
            java.lang.String r4 = defpackage.ajme.a((android.content.Intent) r24)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 41
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "DispatchingService dispatching "
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = ", source: "
            r7.append(r3)
            r7.append(r4)
            r7.toString()
            ajme r3 = r1.b
            ajmm r3 = r3.c
            com.google.android.location.reporting.state.update.ReportingConfig r3 = r3.a()
            boolean r4 = r3.d()
            r5 = -1
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0054
            goto L_0x00b7
        L_0x0054:
            int r4 = r2.hashCode()
            r9 = -1603119181(0xffffffffa07257b3, float:-2.0527215E-19)
            if (r4 == r9) goto L_0x007c
            r9 = -569803536(0xffffffffde097cf0, float:-2.47676429E18)
            if (r4 == r9) goto L_0x0072
            r9 = 1115780759(0x42817697, float:64.73162)
            if (r4 == r9) goto L_0x0068
            goto L_0x0086
        L_0x0068:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0086
            r4 = 1
            goto L_0x0087
        L_0x0072:
            java.lang.String r4 = "com.google.android.location.reporting.GCM_ID_CHANGED"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0086
            r4 = 2
            goto L_0x0087
        L_0x007c:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_UPDATE_WORLD"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0086
            r4 = 0
            goto L_0x0087
        L_0x0086:
            r4 = -1
        L_0x0087:
            if (r4 == 0) goto L_0x00b7
            if (r4 == r7) goto L_0x00b7
            if (r4 == r6) goto L_0x00b7
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 49
            r3.<init>(r2)
            java.lang.String r2 = "DispatchingService ignoring "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " because ULR inactive"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r2, (java.lang.String) r0)
            return
        L_0x00b7:
            int r4 = r2.hashCode()
            r9 = 17
            r10 = 8
            r11 = 22
            r12 = 16
            switch(r4) {
                case -1995383548: goto L_0x01cc;
                case -1918487026: goto L_0x01c1;
                case -1875733435: goto L_0x01b6;
                case -1850781142: goto L_0x01ac;
                case -1704588479: goto L_0x01a1;
                case -1603119181: goto L_0x0197;
                case -1492165444: goto L_0x018c;
                case -1184851779: goto L_0x0181;
                case -1076576821: goto L_0x0176;
                case -1050121137: goto L_0x016a;
                case -931405204: goto L_0x015f;
                case -569803536: goto L_0x0153;
                case -511271086: goto L_0x0147;
                case -321582332: goto L_0x013b;
                case -193448506: goto L_0x0130;
                case -66063021: goto L_0x0125;
                case 259854786: goto L_0x0119;
                case 345482250: goto L_0x010d;
                case 436897434: goto L_0x0102;
                case 733325328: goto L_0x00f6;
                case 870701415: goto L_0x00ea;
                case 1066386426: goto L_0x00df;
                case 1115780759: goto L_0x00d4;
                case 1473645052: goto L_0x00c8;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x01d7
        L_0x00c8:
            java.lang.String r4 = "com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 15
            goto L_0x01d8
        L_0x00d4:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 4
            goto L_0x01d8
        L_0x00df:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_APPLY_UPLOAD_REQUESTS"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 7
            goto L_0x01d8
        L_0x00ea:
            java.lang.String r4 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 23
            goto L_0x01d8
        L_0x00f6:
            java.lang.String r4 = "com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 12
            goto L_0x01d8
        L_0x0102:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 1
            goto L_0x01d8
        L_0x010d:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_PLACE_INFERENCE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 10
            goto L_0x01d8
        L_0x0119:
            java.lang.String r4 = "com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 17
            goto L_0x01d8
        L_0x0125:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_REPORT_PLACE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 5
            goto L_0x01d8
        L_0x0130:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_ACTIVITY"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 2
            goto L_0x01d8
        L_0x013b:
            java.lang.String r4 = "com.google.android.location.reporting.WIFI_TRIGGERED_FLUSH_AND_UPLOAD"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 8
            goto L_0x01d8
        L_0x0147:
            java.lang.String r4 = "android.location.MODE_CHANGED"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 22
            goto L_0x01d8
        L_0x0153:
            java.lang.String r4 = "com.google.android.location.reporting.GCM_ID_CHANGED"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 13
            goto L_0x01d8
        L_0x015f:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_LOCATION"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 0
            goto L_0x01d8
        L_0x016a:
            java.lang.String r4 = "com.google.android.location.reporting.CHANGE_ON_LOCATION_DISABLE_FOR_GOOGLE_APP"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 14
            goto L_0x01d8
        L_0x0176:
            java.lang.String r4 = "android.intent.action.AIRPLANE_MODE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 19
            goto L_0x01d8
        L_0x0181:
            java.lang.String r4 = "android.location.PROVIDERS_CHANGED"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 21
            goto L_0x01d8
        L_0x018c:
            java.lang.String r4 = "com.google.android.location.reporting.CHANGE_ON_BLE_ALWAYS_SCAN_MODE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 16
            goto L_0x01d8
        L_0x0197:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_UPDATE_WORLD"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 3
            goto L_0x01d8
        L_0x01a1:
            java.lang.String r4 = "com.google.android.location.reporting.WIFI_TRIGGERED_UPLOAD"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 9
            goto L_0x01d8
        L_0x01ac:
            java.lang.String r4 = "com.google.android.location.reporting.ACTION_SEND_DATA"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 6
            goto L_0x01d8
        L_0x01b6:
            java.lang.String r4 = "android.net.wifi.WIFI_STATE_CHANGED"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 20
            goto L_0x01d8
        L_0x01c1:
            java.lang.String r4 = "com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 18
            goto L_0x01d8
        L_0x01cc:
            java.lang.String r4 = "com.google.android.gms.location.reporting.DELETE_OPERATION"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r5 = 11
            goto L_0x01d8
        L_0x01d7:
        L_0x01d8:
            r4 = 53
            r13 = 32
            r14 = 0
            switch(r5) {
                case 0: goto L_0x093f;
                case 1: goto L_0x093a;
                case 2: goto L_0x07bc;
                case 3: goto L_0x07b6;
                case 4: goto L_0x07a8;
                case 5: goto L_0x06e7;
                case 6: goto L_0x04d6;
                case 7: goto L_0x04c1;
                case 8: goto L_0x04ac;
                case 9: goto L_0x0494;
                case 10: goto L_0x0325;
                case 11: goto L_0x02bc;
                case 12: goto L_0x024e;
                case 13: goto L_0x0231;
                case 14: goto L_0x0211;
                case 15: goto L_0x0204;
                case 16: goto L_0x0204;
                case 17: goto L_0x0204;
                case 18: goto L_0x0204;
                case 19: goto L_0x0204;
                case 20: goto L_0x0204;
                case 21: goto L_0x0204;
                case 22: goto L_0x0204;
                case 23: goto L_0x0204;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r11
            r3.<init>(r2)
            java.lang.String r2 = "Unsupported action in "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.c(r2, r13, r0)
            return
        L_0x0204:
            ajmi r0 = r1.f
            ajme r3 = r1.b
            ajmm r3 = r3.c
            r3.a()
            r0.a((java.lang.String) r2)
            return
        L_0x0211:
            ajme r0 = r1.b
            android.content.Context r0 = r0.b
            boolean r0 = defpackage.jjm.a(r0)
            if (r0 != 0) goto L_0x021c
            goto L_0x0224
        L_0x021c:
            defpackage.ajme.d()
            ajme r0 = r1.b
            r0.b()
        L_0x0224:
            ajmi r0 = r1.f
            ajme r3 = r1.b
            ajmm r3 = r3.c
            r3.a()
            r0.a((java.lang.String) r2)
            return
        L_0x0231:
            ajme r0 = r1.b
            ajmm r0 = r0.c
            java.lang.Object r2 = defpackage.ajmm.f
            monitor-enter(r2)
            ahya r3 = r0.c     // Catch:{ all -> 0x024b }
            ahxz r3 = (defpackage.ahxz) r3     // Catch:{ all -> 0x024b }
            android.accounts.Account[] r3 = r3.b     // Catch:{ all -> 0x024b }
            int r4 = r3.length     // Catch:{ all -> 0x024b }
        L_0x023f:
            if (r8 >= r4) goto L_0x0249
            r5 = r3[r8]     // Catch:{ all -> 0x024b }
            r0.c(r5)     // Catch:{ all -> 0x024b }
            int r8 = r8 + 1
            goto L_0x023f
        L_0x0249:
            monitor-exit(r2)     // Catch:{ all -> 0x024b }
            return
        L_0x024b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x024b }
            throw r0
        L_0x024e:
            java.lang.String r2 = "account"
            boolean r2 = r0.hasExtra(r2)
            if (r2 == 0) goto L_0x0298
            java.lang.String r2 = "isPrimaryDevice"
            boolean r2 = r0.hasExtra(r2)
            if (r2 != 0) goto L_0x0260
            goto L_0x0298
        L_0x0260:
            java.lang.String r2 = "account"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            java.lang.String r3 = "isPrimaryDevice"
            boolean r0 = r0.getBooleanExtra(r3, r7)
            ajme r3 = r1.b
            ajmm r3 = r3.c
            com.google.android.location.reporting.state.update.AccountConfig r3 = r3.a((android.accounts.Account) r2)
            java.lang.String r4 = "com.google.android.gms+gcm-primary-device"
            ajmz r2 = defpackage.ajna.a(r2, r4)
            long r3 = r3.c
            r2.a((long) r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.n = r0
            ajna r0 = r2.a()
            ajme r2 = r1.b
            ajmm r2 = r2.c
            java.lang.String r3 = "DispatchingService.handlePrimaryDeviceChange"
            java.lang.String r4 = "DispatchingService.handlePrimaryDeviceChange"
            r2.a(r3, r0, r4)
            return
        L_0x0298:
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r4
            r3.<init>(r2)
            java.lang.String r2 = "Received change primary device intent missing extras:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.c(r2, r0)
            return
        L_0x02bc:
            java.lang.String r2 = r24.getAction()
            java.lang.String r3 = "com.google.android.gms.location.reporting.DELETE_OPERATION"
            boolean r2 = r3.equals(r2)
            defpackage.iva.b((boolean) r2)
            java.lang.String r2 = "deletions"
            boolean r2 = r0.hasExtra(r2)
            if (r2 == 0) goto L_0x02d9
            java.lang.String r2 = "deletions"
            java.util.ArrayList r14 = r0.getParcelableArrayListExtra(r2)
            goto L_0x02da
        L_0x02d9:
        L_0x02da:
            if (r14 != 0) goto L_0x02e6
            r0 = 31
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r3 = "Received delete intent with no extra"
            defpackage.ajix.c(r2, r0, r3)
            return
        L_0x02e6:
            int r0 = r14.size()
        L_0x02ea:
            if (r8 >= r0) goto L_0x0324
            java.lang.Object r2 = r14.get(r8)
            com.google.android.gms.location.reporting.Deletion r2 = (com.google.android.gms.location.reporting.Deletion) r2
            android.accounts.Account r3 = r2.a
            long r4 = r2.b
            long r6 = r2.c
            ajme r2 = r1.b
            ajii r2 = r2.m
            boolean r9 = defpackage.azsy.e()
            if (r9 == 0) goto L_0x030d
            ajim r15 = r2.a
            r16 = r3
            r17 = r4
            r19 = r6
            r15.a((android.accounts.Account) r16, (long) r17, (long) r19)
        L_0x030d:
            boolean r9 = defpackage.azsy.c()
            if (r9 != 0) goto L_0x0314
        L_0x0313:
            goto L_0x0321
        L_0x0314:
            ajik r15 = r2.b
            if (r15 == 0) goto L_0x0313
            r16 = r3
            r17 = r4
            r19 = r6
            r15.a((android.accounts.Account) r16, (long) r17, (long) r19)
        L_0x0321:
            int r8 = r8 + 1
            goto L_0x02ea
        L_0x0324:
            return
        L_0x0325:
            ria r2 = defpackage.ria.a((android.content.Intent) r24)
            if (r2 == 0) goto L_0x03ee
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03e9 }
            int r4 = r2.a()     // Catch:{ all -> 0x03e9 }
            r3.<init>(r4)     // Catch:{ all -> 0x03e9 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x03e9 }
        L_0x0338:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x03e9 }
            if (r5 == 0) goto L_0x0386
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x03e9 }
            rhy r5 = (defpackage.rhy) r5     // Catch:{ all -> 0x03e9 }
            float r6 = r5.ba()     // Catch:{ all -> 0x03e9 }
            double r10 = (double) r6
            r12 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r12
            int r6 = (int) r10
            rhq r5 = r5.bb()     // Catch:{ all -> 0x03e9 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x03e9 }
            com.google.android.ulr.ApiPlaceInference r10 = new com.google.android.ulr.ApiPlaceInference     // Catch:{ all -> 0x03e9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03e9 }
            r10.<init>(r6, r5)     // Catch:{ all -> 0x03e9 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03e9 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x03e9 }
            int r6 = r6.length()     // Catch:{ all -> 0x03e9 }
            int r6 = r6 + r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e9 }
            r11.<init>(r6)     // Catch:{ all -> 0x03e9 }
            java.lang.String r6 = "Place inference: "
            r11.append(r6)     // Catch:{ all -> 0x03e9 }
            r11.append(r5)     // Catch:{ all -> 0x03e9 }
            r11.toString()     // Catch:{ all -> 0x03e9 }
            r3.add(r10)     // Catch:{ all -> 0x03e9 }
            goto L_0x0338
        L_0x0386:
            android.net.Uri r4 = r24.getData()     // Catch:{ all -> 0x03e9 }
            if (r4 == 0) goto L_0x0399
            java.lang.String r4 = r4.getScheme()     // Catch:{ all -> 0x03e9 }
            java.lang.String r5 = "mailto:"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x03e9 }
            if (r4 == 0) goto L_0x0399
            goto L_0x039a
        L_0x0399:
            r7 = 0
        L_0x039a:
            com.google.android.ulr.ApiPlaceInferenceResult r4 = new com.google.android.ulr.ApiPlaceInferenceResult     // Catch:{ all -> 0x03e9 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x03e9 }
            long r6 = defpackage.azrx.d()     // Catch:{ all -> 0x03e9 }
            int r7 = (int) r6     // Catch:{ all -> 0x03e9 }
            r6 = 100
            if (r7 == r6) goto L_0x03c1
            r6 = 102(0x66, float:1.43E-43)
            if (r7 == r6) goto L_0x03be
            r6 = 104(0x68, float:1.46E-43)
            if (r7 == r6) goto L_0x03bb
            r6 = 105(0x69, float:1.47E-43)
            if (r7 == r6) goto L_0x03b8
            java.lang.String r6 = "unknownMode"
            goto L_0x03c3
        L_0x03b8:
            java.lang.String r6 = "noPower"
            goto L_0x03c3
        L_0x03bb:
            java.lang.String r6 = "lowPower"
            goto L_0x03c3
        L_0x03be:
            java.lang.String r6 = "balancedPower"
            goto L_0x03c3
        L_0x03c1:
            java.lang.String r6 = "highPower"
        L_0x03c3:
            r4.<init>(r3, r5, r6)     // Catch:{ all -> 0x03e9 }
            r2.c()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 24
            r5.<init>(r3)
            java.lang.String r3 = "Place inference result: "
            r5.append(r3)
            r5.append(r2)
            r5.toString()
            r2 = r4
            goto L_0x03ef
        L_0x03e9:
            r0 = move-exception
            r2.c()
            throw r0
        L_0x03ee:
            r2 = r14
        L_0x03ef:
            android.net.Uri r0 = r24.getData()
            if (r0 == 0) goto L_0x0410
            java.lang.String r3 = r0.getScheme()
            java.lang.String r4 = "mailto:"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0410
            android.accounts.Account r14 = new android.accounts.Account
            java.lang.String r3 = r0.getSchemeSpecificPart()
            java.lang.String r0 = r0.getFragment()
            r14.<init>(r3, r0)
            r0 = r14
            goto L_0x0411
        L_0x0410:
            r0 = r14
        L_0x0411:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 47
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Received place inference result '"
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = "' for account "
            r7.append(r3)
            r7.append(r4)
            r7.toString()
            if (r2 != 0) goto L_0x044e
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r2 = "Received null place inference result"
            defpackage.ajix.c(r0, r2)
            return
        L_0x044e:
            ajme r3 = r1.b
            jiq r3 = r3.g
            long r3 = java.lang.System.currentTimeMillis()
            com.google.android.ulr.ApiMetadata r15 = new com.google.android.ulr.ApiMetadata
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            r16 = 0
            r17 = 0
            r3 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r2
            r21 = r15
            r15 = r16
            r16 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0488
            ajme r2 = r1.b
            ajin r2 = r2.p
            java.lang.String r3 = "personalized place inference"
            r4 = r21
            r2.a((android.accounts.Account) r0, (com.google.android.ulr.ApiMetadata) r4, (java.lang.String) r3)
            return
        L_0x0488:
            r4 = r21
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "place inference"
            r1.a((com.google.android.ulr.ApiMetadata) r4, (java.lang.String) r0, (java.lang.String) r2)
            return
        L_0x0494:
            boolean r0 = defpackage.aztb.o()
            if (r0 != 0) goto L_0x04ab
            ajme r0 = r1.b
            ajkv r2 = r0.h
            ajmn r0 = r0.e
            android.location.Location r0 = r0.d()
            ajns r4 = r2.a(r0)
            r2.a(r3, r4, r0, r7)
        L_0x04ab:
            return
        L_0x04ac:
            boolean r0 = defpackage.aztb.o()
            if (r0 != 0) goto L_0x04c0
            ajlm r0 = r1.g
            rom r0 = r0.e
            java.lang.Object r2 = defpackage.rom.a
            roi r3 = new roi
            r3.<init>(r0, r1)
            r0.a((java.lang.Object) r2, (defpackage.rol) r3)
        L_0x04c0:
            return
        L_0x04c1:
            ajlm r0 = r1.g
            java.lang.String r2 = "DispatchingService.applyUploadRequests"
            r0.a((com.google.android.location.reporting.state.update.ReportingConfig) r3, (java.lang.String) r2)
            ajme r0 = r1.b
            ajkv r2 = r0.h
            ajmn r0 = r0.e
            android.location.Location r0 = r0.d()
            r2.a(r3, r0)
            return
        L_0x04d6:
            android.os.Parcelable$Creator r2 = com.google.android.gms.location.reporting.SendDataRequest.CREATOR
            java.lang.String r3 = "request"
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r2 = defpackage.ivy.a((android.content.Intent) r0, (java.lang.String) r3, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.location.reporting.SendDataRequest r2 = (com.google.android.gms.location.reporting.SendDataRequest) r2
            java.lang.String r3 = "account"
            android.os.Parcelable r3 = r0.getParcelableExtra(r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            java.lang.String r5 = "caller"
            java.lang.String r5 = r0.getStringExtra(r5)
            if (r2 != 0) goto L_0x04f2
            goto L_0x06c2
        L_0x04f2:
            if (r3 == 0) goto L_0x06c2
            if (r5 == 0) goto L_0x06c2
            byte[] r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r4 = "no data"
            defpackage.iva.a((java.lang.Object) r0, (java.lang.Object) r4)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r0 = r2.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r4 = "no data type"
            defpackage.iva.a((java.lang.String) r0, (java.lang.Object) r4)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r0 = r2.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            int r0 = r0.length()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r4 = 128(0x80, float:1.794E-43)
            if (r0 >= r4) goto L_0x0510
            r0 = 1
            goto L_0x0511
        L_0x0510:
            r0 = 0
        L_0x0511:
            java.lang.String r5 = "data type too long"
            defpackage.iva.b(r0, r5)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            byte[] r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r0 = defpackage.jhy.d(r0)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r5 = r2.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            com.google.android.ulr.ApiUserData r9 = new com.google.android.ulr.ApiUserData     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r9.<init>(r0, r5, r11)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            boolean r0 = defpackage.azsy.b()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r0 == 0) goto L_0x05b9
            boolean r0 = defpackage.azsy.c()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r0 == 0) goto L_0x05b9
            byte[] r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r5 = "no data"
            defpackage.iva.a((java.lang.Object) r0, (java.lang.Object) r5)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r0 = r2.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r5 = "no data type"
            defpackage.iva.a((java.lang.String) r0, (java.lang.Object) r5)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r0 = r2.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            int r0 = r0.length()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r0 >= r4) goto L_0x054f
            r0 = 1
            goto L_0x0550
        L_0x054f:
            r0 = 0
        L_0x0550:
            java.lang.String r4 = "data type too long"
            defpackage.iva.b(r0, r4)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            byte[] r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r4 = r2.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            atdp r5 = defpackage.atdp.f     // Catch:{ IllegalArgumentException -> 0x06a3 }
            aucd r5 = r5.o()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r4 == 0) goto L_0x0581
            boolean r11 = r5.c     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r11 != 0) goto L_0x056e
            goto L_0x0573
        L_0x056e:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r5.c = r8     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x0573:
            aucj r11 = r5.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            atdp r11 = (defpackage.atdp) r11     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r4.getClass()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            int r15 = r11.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r6 = r6 | r15
            r11.a = r6     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r11.c = r4     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x0581:
            if (r0 == 0) goto L_0x059c
            boolean r4 = r5.c     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r4 != 0) goto L_0x0588
        L_0x0587:
            goto L_0x058e
        L_0x0588:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r5.c = r8     // Catch:{ IllegalArgumentException -> 0x06a3 }
            goto L_0x0587
        L_0x058e:
            aucj r4 = r5.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            atdp r4 = (defpackage.atdp) r4     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            int r6 = r4.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r6 = r6 | r10
            r4.a = r6     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r4.e = r0     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x059c:
            boolean r0 = r5.c     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r0 != 0) goto L_0x05a1
            goto L_0x05a6
        L_0x05a1:
            r5.c()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r5.c = r8     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x05a6:
            aucj r0 = r5.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            atdp r0 = (defpackage.atdp) r0     // Catch:{ IllegalArgumentException -> 0x06a3 }
            int r4 = r0.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r4 = r4 | r7
            r0.a = r4     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r0.b = r13     // Catch:{ IllegalArgumentException -> 0x06a3 }
            aucj r0 = r5.i()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r14 = r0
            atdp r14 = (defpackage.atdp) r14     // Catch:{ IllegalArgumentException -> 0x06a3 }
            goto L_0x05ba
        L_0x05b9:
        L_0x05ba:
            ajme r0 = r1.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            ajin r0 = r0.p     // Catch:{ IllegalArgumentException -> 0x06a3 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ IllegalArgumentException -> 0x06a3 }
            r4.<init>(r9, r14)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.String r5 = "SendDataHelper"
            java.lang.Object r6 = r4.first     // Catch:{ IllegalArgumentException -> 0x06a3 }
            com.google.android.ulr.ApiUserData r6 = (com.google.android.ulr.ApiUserData) r6     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.Object r4 = r4.second     // Catch:{ IllegalArgumentException -> 0x06a3 }
            atdp r4 = (defpackage.atdp) r4     // Catch:{ IllegalArgumentException -> 0x06a3 }
            boolean r7 = defpackage.azsy.c()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r7 != 0) goto L_0x05d5
            goto L_0x0645
        L_0x05d5:
            ajik r7 = r0.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r7 == 0) goto L_0x0645
            boolean r7 = defpackage.azsy.b()     // Catch:{ IllegalArgumentException -> 0x06a3 }
            if (r7 != 0) goto L_0x05e0
            goto L_0x05e8
        L_0x05e0:
            if (r4 == 0) goto L_0x05e8
            java.lang.String r6 = "UlrApiUserDatasGrpcTriggered"
            defpackage.ajjb.a((java.lang.String) r6)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            goto L_0x05ec
        L_0x05e8:
            atdp r4 = defpackage.ajnq.a((com.google.android.ulr.ApiUserData) r6)     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x05ec:
            if (r4 == 0) goto L_0x0644
            ajik r0 = r0.b     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.util.List r17 = java.util.Collections.singletonList(r3)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.Object r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x06a3 }
            monitor-enter(r3)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            com.google.android.gms.leveldb.LevelDb r6 = r0.d     // Catch:{ all -> 0x0641 }
            if (r6 == 0) goto L_0x063f
            ajij r6 = new ajij     // Catch:{ all -> 0x0641 }
            r6.<init>()     // Catch:{ all -> 0x0641 }
            ajjr r7 = defpackage.ajjr.g     // Catch:{ all -> 0x063a }
            aucd r7 = r7.o()     // Catch:{ all -> 0x063a }
            boolean r9 = r7.c     // Catch:{ all -> 0x063a }
            if (r9 != 0) goto L_0x060b
            goto L_0x0610
        L_0x060b:
            r7.c()     // Catch:{ all -> 0x063a }
            r7.c = r8     // Catch:{ all -> 0x063a }
        L_0x0610:
            aucj r8 = r7.b     // Catch:{ all -> 0x063a }
            ajjr r8 = (defpackage.ajjr) r8     // Catch:{ all -> 0x063a }
            r4.getClass()     // Catch:{ all -> 0x063a }
            r8.f = r4     // Catch:{ all -> 0x063a }
            int r9 = r8.a     // Catch:{ all -> 0x063a }
            r9 = r9 | r12
            r8.a = r9     // Catch:{ all -> 0x063a }
            aucj r7 = r7.i()     // Catch:{ all -> 0x063a }
            r20 = r7
            ajjr r20 = (defpackage.ajjr) r20     // Catch:{ all -> 0x063a }
            long r7 = r4.b     // Catch:{ all -> 0x063a }
            r15 = r0
            r16 = r6
            r18 = r7
            r21 = r5
            r15.a(r16, r17, r18, r20, r21)     // Catch:{ all -> 0x063a }
            r0.a((defpackage.ajij) r6, (java.lang.String) r5)     // Catch:{ all -> 0x063a }
            r6.a()     // Catch:{ all -> 0x0641 }
            monitor-exit(r3)     // Catch:{ all -> 0x0641 }
            return
        L_0x063a:
            r0 = move-exception
            r6.a()     // Catch:{ all -> 0x0641 }
            throw r0     // Catch:{ all -> 0x0641 }
        L_0x063f:
            monitor-exit(r3)     // Catch:{ all -> 0x0641 }
            return
        L_0x0641:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0641 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x0644:
            return
        L_0x0645:
            ajim r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.util.List r17 = java.util.Collections.singletonList(r3)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            java.lang.Object r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x06a3 }
            monitor-enter(r3)     // Catch:{ IllegalArgumentException -> 0x06a3 }
            com.google.android.gms.leveldb.LevelDb r4 = r0.d     // Catch:{ all -> 0x06a0 }
            if (r4 == 0) goto L_0x069e
            ajil r4 = new ajil     // Catch:{ all -> 0x06a0 }
            r4.<init>()     // Catch:{ all -> 0x06a0 }
            ajjs r7 = defpackage.ajjs.g     // Catch:{ all -> 0x0699 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0699 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x0699 }
            boolean r10 = r7.c     // Catch:{ all -> 0x0699 }
            if (r10 != 0) goto L_0x0666
            goto L_0x066b
        L_0x0666:
            r7.c()     // Catch:{ all -> 0x0699 }
            r7.c = r8     // Catch:{ all -> 0x0699 }
        L_0x066b:
            aucj r8 = r7.b     // Catch:{ all -> 0x0699 }
            ajjs r8 = (defpackage.ajjs) r8     // Catch:{ all -> 0x0699 }
            r9.getClass()     // Catch:{ all -> 0x0699 }
            int r10 = r8.a     // Catch:{ all -> 0x0699 }
            r10 = r10 | r12
            r8.a = r10     // Catch:{ all -> 0x0699 }
            r8.f = r9     // Catch:{ all -> 0x0699 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x0699 }
            r20 = r7
            ajjs r20 = (defpackage.ajjs) r20     // Catch:{ all -> 0x0699 }
            java.lang.Long r6 = r6.e()     // Catch:{ all -> 0x0699 }
            long r18 = r6.longValue()     // Catch:{ all -> 0x0699 }
            r15 = r0
            r16 = r4
            r21 = r5
            r15.a(r16, r17, r18, r20, r21)     // Catch:{ all -> 0x0699 }
            r0.a((defpackage.ajil) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0699 }
            r4.a()     // Catch:{ all -> 0x06a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x06a0 }
            return
        L_0x0699:
            r0 = move-exception
            r4.a()     // Catch:{ all -> 0x06a0 }
            throw r0     // Catch:{ all -> 0x06a0 }
        L_0x069e:
            monitor-exit(r3)     // Catch:{ all -> 0x06a0 }
            return
        L_0x06a0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06a0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x06a3 }
        L_0x06a3:
            r0 = move-exception
            java.lang.String r2 = r2.a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "bad user data: "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x06b8
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x06bc
        L_0x06b8:
            java.lang.String r2 = r3.concat(r2)
        L_0x06bc:
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r3, (java.lang.String) r2, (java.lang.Throwable) r0)
            return
        L_0x06c2:
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 43
            r3.<init>(r2)
            java.lang.String r2 = "Received SendData intent missing an extra: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.c(r2, r4, r0)
            return
        L_0x06e7:
            java.lang.String r2 = "placeReport"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            com.google.android.gms.location.places.PlaceReport r2 = (com.google.android.gms.location.places.PlaceReport) r2
            java.lang.String r3 = "account"
            android.os.Parcelable r3 = r0.getParcelableExtra(r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            java.lang.String r4 = "placeReportCaller"
            java.lang.String r4 = r0.getStringExtra(r4)
            if (r2 != 0) goto L_0x0702
            goto L_0x0781
        L_0x0702:
            if (r3 == 0) goto L_0x0781
            if (r4 == 0) goto L_0x0781
            ajme r5 = r1.b
            jiq r5 = r5.g
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = r2.d
            com.google.android.ulr.ApiPlaceReport r15 = new com.google.android.ulr.ApiPlaceReport
            java.lang.String r9 = r2.c
            java.lang.String r10 = r2.b
            r15.<init>(r9, r4, r10, r8)
            com.google.android.ulr.ApiMetadata r4 = new com.google.android.ulr.ApiMetadata
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r8 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            java.lang.Long r20 = java.lang.Long.valueOf(r5)
            r21 = 0
            r22 = 0
            r9 = r4
            r5 = r15
            r15 = r8
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            ajme r5 = r1.b
            ajin r5 = r5.p
            java.lang.String r6 = "PlaceReportHelper"
            r5.a((android.accounts.Account) r3, (com.google.android.ulr.ApiMetadata) r4, (java.lang.String) r6)
            java.lang.String r2 = r2.b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0780
            aztb r2 = defpackage.aztb.a
            aztc r2 = r2.a()
            boolean r2 = r2.al()
            if (r2 == 0) goto L_0x0780
            ajme r2 = r1.b
            ajmn r3 = r2.e
            r3.e = r7
            ajmm r2 = r2.c
            com.google.android.location.reporting.state.update.ReportingConfig r2 = r2.a()
            java.lang.String r0 = defpackage.ajme.a((android.content.Intent) r24)
            ajlm r3 = r1.g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "DispatchingService.requestImmediateLocation+"
            int r5 = r0.length()
            if (r5 != 0) goto L_0x0778
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            goto L_0x077c
        L_0x0778:
            java.lang.String r0 = r4.concat(r0)
        L_0x077c:
            r3.a(r2, r0, r7)
            return
        L_0x0780:
            return
        L_0x0781:
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 46
            r3.<init>(r2)
            java.lang.String r2 = "Received PlaceReport intent missing an extra: "
            r3.append(r2)
            r3.append(r0)
            r0 = 33
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.c(r3, r0, r2)
            return
        L_0x07a8:
            java.lang.String r0 = defpackage.ajme.a((android.content.Intent) r24)
            ajlm r2 = r1.g
            java.lang.String r0 = defpackage.ajme.a((java.lang.String) r0)
            r2.a((com.google.android.location.reporting.state.update.ReportingConfig) r3, (java.lang.String) r0)
            return
        L_0x07b6:
            ajmi r2 = r1.f
            r2.a((android.content.Intent) r0)
            return
        L_0x07bc:
            boolean r2 = defpackage.aztb.s()
            if (r2 != 0) goto L_0x0934
            ajgz r2 = r23.c()
            boolean r4 = r3.d()
            if (r4 != 0) goto L_0x07d2
            ajlm r0 = r2.c
            defpackage.ajhh.a(r3, r0)
            return
        L_0x07d2:
            com.google.android.gms.location.ActivityRecognitionResult r4 = com.google.android.gms.location.ActivityRecognitionResult.b(r24)
            if (r4 != 0) goto L_0x0801
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + r12
            r4.<init>(r3)
            r4.append(r0)
            java.lang.String r0 = " has no activity"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            java.lang.String r0 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r0, (java.lang.Throwable) r2)
            return
        L_0x0801:
            ajmn r0 = r2.a
            r0.b = r4
            boolean r0 = defpackage.ajjd.a()
            if (r0 != 0) goto L_0x080c
            goto L_0x0811
        L_0x080c:
            ajjc r0 = defpackage.ajjd.a
            r0.a()
        L_0x0811:
            long r9 = r4.c
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x090b
            ajmn r0 = r2.a
            com.google.android.gms.location.ActivityRecognitionResult r0 = r0.e()
            if (r0 == 0) goto L_0x0846
            com.google.android.gms.location.DetectedActivity r5 = r0.a()
            int r5 = r5.a()
            com.google.android.gms.location.DetectedActivity r7 = r4.a()
            int r7 = r7.a()
            if (r5 == r7) goto L_0x0834
            goto L_0x0846
        L_0x0834:
            long r11 = r0.c
            long r9 = r9 - r11
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            long r11 = r0.c()
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0846
            return
        L_0x0846:
            ajmn r0 = r2.a
            r0.a((com.google.android.gms.location.ActivityRecognitionResult) r4)
            java.lang.String r0 = "UlrActivityReceived"
            defpackage.ajjb.a((java.lang.String) r0, (com.google.android.location.reporting.state.update.ReportingConfig) r3)
            ajin r0 = r2.b
            java.util.List r11 = r3.b()
            boolean r2 = defpackage.azsy.c()
            if (r2 != 0) goto L_0x085d
            goto L_0x08b5
        L_0x085d:
            ajik r2 = r0.b
            if (r2 == 0) goto L_0x08b5
            java.lang.Object r3 = r2.c
            monitor-enter(r3)
            com.google.android.gms.leveldb.LevelDb r0 = r2.d     // Catch:{ all -> 0x08b2 }
            if (r0 == 0) goto L_0x08b0
            ajcd r0 = defpackage.aisr.a((com.google.android.gms.location.ActivityRecognitionResult) r4)     // Catch:{ all -> 0x08b2 }
            ajij r5 = new ajij     // Catch:{ all -> 0x08b2 }
            r5.<init>()     // Catch:{ all -> 0x08b2 }
            ajjr r7 = defpackage.ajjr.g     // Catch:{ all -> 0x08ab }
            aucd r7 = r7.o()     // Catch:{ all -> 0x08ab }
            if (r0 == 0) goto L_0x0891
            boolean r9 = r7.c     // Catch:{ all -> 0x08ab }
            if (r9 != 0) goto L_0x087e
            goto L_0x0883
        L_0x087e:
            r7.c()     // Catch:{ all -> 0x08ab }
            r7.c = r8     // Catch:{ all -> 0x08ab }
        L_0x0883:
            aucj r8 = r7.b     // Catch:{ all -> 0x08ab }
            ajjr r8 = (defpackage.ajjr) r8     // Catch:{ all -> 0x08ab }
            r0.getClass()     // Catch:{ all -> 0x08ab }
            r8.c = r0     // Catch:{ all -> 0x08ab }
            int r0 = r8.a     // Catch:{ all -> 0x08ab }
            r0 = r0 | r6
            r8.a = r0     // Catch:{ all -> 0x08ab }
        L_0x0891:
            long r12 = r4.b     // Catch:{ all -> 0x08ab }
            aucj r0 = r7.i()     // Catch:{ all -> 0x08ab }
            r14 = r0
            ajjr r14 = (defpackage.ajjr) r14     // Catch:{ all -> 0x08ab }
            java.lang.String r15 = "Activity"
            r9 = r2
            r10 = r5
            r9.a(r10, r11, r12, r14, r15)     // Catch:{ all -> 0x08ab }
            java.lang.String r0 = "Activity"
            r2.a((defpackage.ajij) r5, (java.lang.String) r0)     // Catch:{ all -> 0x08ab }
            r5.a()     // Catch:{ all -> 0x08b2 }
            monitor-exit(r3)     // Catch:{ all -> 0x08b2 }
            return
        L_0x08ab:
            r0 = move-exception
            r5.a()     // Catch:{ all -> 0x08b2 }
            throw r0     // Catch:{ all -> 0x08b2 }
        L_0x08b0:
            monitor-exit(r3)     // Catch:{ all -> 0x08b2 }
            return
        L_0x08b2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08b2 }
            throw r0
        L_0x08b5:
            ajim r0 = r0.a
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            com.google.android.gms.leveldb.LevelDb r3 = r0.d     // Catch:{ all -> 0x0908 }
            if (r3 == 0) goto L_0x0906
            ajcd r3 = defpackage.aisr.a((com.google.android.gms.location.ActivityRecognitionResult) r4)     // Catch:{ all -> 0x0908 }
            ajil r5 = new ajil     // Catch:{ all -> 0x0908 }
            r5.<init>()     // Catch:{ all -> 0x0908 }
            ajjs r7 = defpackage.ajjs.g     // Catch:{ all -> 0x0901 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0901 }
            if (r3 == 0) goto L_0x08e7
            boolean r9 = r7.c     // Catch:{ all -> 0x0901 }
            if (r9 != 0) goto L_0x08d4
            goto L_0x08d9
        L_0x08d4:
            r7.c()     // Catch:{ all -> 0x0901 }
            r7.c = r8     // Catch:{ all -> 0x0901 }
        L_0x08d9:
            aucj r8 = r7.b     // Catch:{ all -> 0x0901 }
            ajjs r8 = (defpackage.ajjs) r8     // Catch:{ all -> 0x0901 }
            r3.getClass()     // Catch:{ all -> 0x0901 }
            r8.c = r3     // Catch:{ all -> 0x0901 }
            int r3 = r8.a     // Catch:{ all -> 0x0901 }
            r3 = r3 | r6
            r8.a = r3     // Catch:{ all -> 0x0901 }
        L_0x08e7:
            long r12 = r4.b     // Catch:{ all -> 0x0901 }
            aucj r3 = r7.i()     // Catch:{ all -> 0x0901 }
            r14 = r3
            ajjs r14 = (defpackage.ajjs) r14     // Catch:{ all -> 0x0901 }
            java.lang.String r15 = "Activity"
            r9 = r0
            r10 = r5
            r9.a(r10, r11, r12, r14, r15)     // Catch:{ all -> 0x0901 }
            java.lang.String r3 = "Activity"
            r0.a((defpackage.ajil) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0901 }
            r5.a()     // Catch:{ all -> 0x0908 }
            monitor-exit(r2)     // Catch:{ all -> 0x0908 }
            return
        L_0x0901:
            r0 = move-exception
            r5.a()     // Catch:{ all -> 0x0908 }
            throw r0     // Catch:{ all -> 0x0908 }
        L_0x0906:
            monitor-exit(r2)     // Catch:{ all -> 0x0908 }
            return
        L_0x0908:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0908 }
            throw r0
        L_0x090b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + r13
            r4.<init>(r3)
            java.lang.String r3 = "No realtime in activity result: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            java.lang.String r2 = "GCoreUlr"
            android.util.Log.wtf(r2, r0)
            return
        L_0x0934:
            ajme r0 = r1.b
            r0.c()
            return
        L_0x093a:
            r1.a((android.content.Intent) r0, (com.google.android.location.reporting.state.update.ReportingConfig) r3, (boolean) r7)
            return
        L_0x093f:
            r1.a((android.content.Intent) r0, (com.google.android.location.reporting.state.update.ReportingConfig) r3, (boolean) r8)
            return
        L_0x0944:
            java.lang.String r0 = java.lang.String.valueOf(r24)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 50
            r3.<init>(r2)
            java.lang.String r2 = "Legacy intent "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", updating active state to cancel it"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r2, (java.lang.String) r0)
            ajme r0 = r1.b
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Context r0 = r0.b
            android.content.ComponentName r0 = defpackage.ajme.a((android.content.Context) r0)
            r2.setComponent(r0)
            ajme r0 = r1.b
            android.content.Context r0 = r0.b
            android.app.PendingIntent r0 = defpackage.ajlm.a((android.content.Context) r0, (android.content.Intent) r2)
            ajme r2 = r1.b
            rom r2 = r2.f
            r2.a((android.app.PendingIntent) r0)
            r0.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajma.a(android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public final void a(WifiScan wifiScan) {
        String valueOf = String.valueOf(wifiScan);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("Wifi scan: ");
        sb.append(valueOf);
        sb.toString();
        int a = wifiScan.a();
        String valueOf2 = String.valueOf(false);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
        sb2.append("UlrClearcutEvents.logWifiScanEvent(");
        sb2.append(a);
        sb2.append(", ");
        sb2.append(valueOf2);
        sb2.append(")");
        sb2.toString();
        if (ajjd.a()) {
            ajjd.a.a(a, (Boolean) false);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ApiBleRate apiBleRate) {
        String valueOf = String.valueOf(apiBleRate.toString());
        if (valueOf.length() == 0) {
            new String("BLE Scan rate change:");
        } else {
            "BLE Scan rate change:".concat(valueOf);
        }
        ajme ajme = this.b;
        int i2 = ajme.v;
        jiq jiq = ajme.g;
        long currentTimeMillis = System.currentTimeMillis();
        ApiRate apiRate = new ApiRate(apiBleRate, (String) null, (Boolean) null, (Long) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null);
        Long valueOf2 = Long.valueOf(currentTimeMillis);
        ApiMetadata apiMetadata = r3;
        ApiMetadata apiMetadata2 = new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, (ApiDeviceConnectivitySetting) null, (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, apiRate, (ApiStepCountsEntry) null, valueOf2, (ApiWifiConnectivityStatus) null, (ArrayList) null);
        a(apiMetadata, apiMetadata.toString(), "bleRate");
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        if (list == null) {
            try {
                ajix.c("GCoreUlr", 14, "bleScan not set");
            } catch (RuntimeException e) {
                ajix.b("GCoreUlr", "Unexpected exception thrown when parsing BLE scans", (Throwable) e);
            }
        } else if (list.isEmpty()) {
            ApiBleScanReport apiBleScanReport = new ApiBleScanReport();
            ajme ajme = this.b;
            int i2 = ajme.v;
            jiq jiq = ajme.g;
            a(ajnz.a(apiBleScanReport, System.currentTimeMillis()), "empty data", "ble scan");
        } else if (!aztb.l()) {
            List a = ajnz.a(list);
            int size = a.size();
            StringBuilder sb = new StringBuilder(21);
            sb.append(size);
            sb.append(" ble scans");
            a(a, sb.toString(), "ble scan");
            ajjd.a(list);
        } else {
            this.h.addAll(list);
        }
    }
}
