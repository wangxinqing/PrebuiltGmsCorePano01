package defpackage;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.io.PrintWriter;

/* renamed from: uaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uaw extends arwm {
    final /* synthetic */ PrintWriter a;
    final /* synthetic */ DiscoveryChimeraService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uaw(DiscoveryChimeraService discoveryChimeraService, String str, PrintWriter printWriter) {
        super(str);
        this.b = discoveryChimeraService;
        this.a = printWriter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x028a A[LOOP:5: B:70:0x0284->B:72:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02cb A[LOOP:6: B:74:0x02c5->B:76:0x02cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0361  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = r1.b
            ttf r2 = r0.c
            java.io.PrintWriter r3 = r1.a
            arwg r0 = r2.f
            r0.b()
            java.util.ArrayList r4 = new java.util.ArrayList
            ttj r0 = r2.c
            java.util.List r0 = r0.d()
            r4.<init>(r0)
            java.util.Comparator r0 = defpackage.tta.a
            java.util.Collections.sort(r4, r0)
            java.util.List r0 = r2.c()
            java.util.Comparator r5 = defpackage.ttb.a
            java.util.Collections.sort(r0, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0037:
            boolean r10 = r0.hasNext()
            r11 = 3
            r12 = 2
            if (r10 == 0) goto L_0x007e
            java.lang.Object r10 = r0.next()
            ttg r10 = (defpackage.ttg) r10
            int r13 = r10.H()
            if (r13 != r12) goto L_0x0050
            int r8 = r8 + 1
            int r9 = r9 + 1
            goto L_0x0058
        L_0x0050:
            int r12 = r10.H()
            if (r12 != r11) goto L_0x0058
            int r8 = r8 + 1
        L_0x0058:
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x0062
            r6.add(r10)
            goto L_0x0037
        L_0x0062:
            java.lang.String r11 = r10.G()
            java.lang.Object r11 = r5.get(r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L_0x007a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r12 = r10.G()
            r5.put(r12, r11)
        L_0x007a:
            r11.add(r10)
            goto L_0x0037
        L_0x007e:
            int r0 = defpackage.jhg.a
            arxg r0 = r2.g
            boolean r0 = r0.a()
            r10 = 1
            if (r0 != 0) goto L_0x00b2
            android.content.Context r0 = r2.e
            java.lang.String r13 = "com.google.android.gms"
            com.google.android.chimera.config.ModuleManager r0 = com.google.android.chimera.config.ModuleManager.get(r0)     // Catch:{ IllegalStateException -> 0x009f }
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r0 = r0.getCurrentModuleApk()     // Catch:{ IllegalStateException -> 0x009f }
            java.lang.String r0 = r0.apkPackageName     // Catch:{ IllegalStateException -> 0x009f }
            boolean r0 = r13.equals(r0)     // Catch:{ IllegalStateException -> 0x009f }
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            goto L_0x00b3
        L_0x009f:
            r0 = move-exception
            jjg r13 = defpackage.tsp.a
            anie r13 = r13.c()
            anih r13 = (defpackage.anih) r13
            r13.a((java.lang.Throwable) r0)
            java.lang.String r0 = "Should never happen, except in tests (they don't have a module context)."
            r13.a((java.lang.String) r0)
            r0 = 0
            goto L_0x00b3
        L_0x00b2:
            r0 = 1
        L_0x00b3:
            if (r0 != 0) goto L_0x00b7
            r0 = 0
            goto L_0x00b9
        L_0x00b7:
            r0 = 200(0xc8, float:2.8E-43)
        L_0x00b9:
            tte r13 = new tte
            r13.<init>(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r14 = "Device:"
            r13.a(r14, r0)
            int r0 = r6.size()
            r14 = 0
        L_0x00ca:
            if (r14 >= r0) goto L_0x0195
            java.lang.Object r16 = r6.get(r14)
            ttg r16 = (defpackage.ttg) r16
            java.lang.Object[] r15 = new java.lang.Object[r12]
            java.lang.String r18 = defpackage.ttf.a((defpackage.ttg) r16)
            r15[r7] = r18
            java.lang.String r18 = r16.i()
            r15[r10] = r18
            java.lang.String r11 = "  %s%s"
            r13.a(r11, r15)
            r11 = 6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r15 = r16.G()
            r11[r7] = r15
            java.lang.Integer r15 = r16.u()
            r11[r10] = r15
            java.lang.Integer r15 = r16.w()
            r11[r12] = r15
            java.lang.Double r15 = r16.z()
            r18 = 3
            r11[r18] = r15
            java.lang.String r15 = r16.m()
            r17 = 4
            r11[r17] = r15
            r15 = 5
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            jiq r10 = r2.a
            long r21 = r10.a()
            java.lang.Long r10 = r16.y()
            long r23 = r10.longValue()
            r25 = r8
            long r7 = r21 - r23
            long r7 = r12.toMinutes(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r11[r15] = r7
            java.lang.String r7 = "    %s, rssi: %s, txPower: %s, distance: %s, mac: %s, last updated: %dm ago"
            r13.a(r7, r11)
            int r7 = r4.size()
            r8 = 0
        L_0x0133:
            int r11 = r14 + 1
            if (r8 >= r7) goto L_0x018c
            java.lang.Object r11 = r4.get(r8)
            ual r11 = (defpackage.ual) r11
            int r12 = r11.c
            avbx r12 = defpackage.avbx.a(r12)
            if (r12 != 0) goto L_0x0147
            avbx r12 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x0147:
            avbx r15 = r16.j()
            if (r12 != r15) goto L_0x0189
            r12 = 4
            java.lang.Object[] r15 = new java.lang.Object[r12]
            java.lang.String r12 = r11.b
            r10 = 0
            r15[r10] = r12
            int r12 = r11.a
            r12 = r12 & 8
            if (r12 == 0) goto L_0x0162
            int r12 = r11.e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0163
        L_0x0162:
            r12 = 0
        L_0x0163:
            r20 = 1
            r15[r20] = r12
            java.lang.String r12 = r11.d
            r19 = 2
            r15[r19] = r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            jiq r10 = r2.a
            long r22 = r10.a()
            long r10 = r11.j
            long r10 = r22 - r10
            long r10 = r12.toMinutes(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 3
            r15[r11] = r10
            java.lang.String r10 = "    %s, rssi: %s, mac: %s, last updated: %dm ago"
            r13.a(r10, r15)
        L_0x0189:
            int r8 = r8 + 1
            goto L_0x0133
        L_0x018c:
            r14 = r11
            r8 = r25
            r7 = 0
            r10 = 1
            r11 = 3
            r12 = 2
            goto L_0x00ca
        L_0x0195:
            r25 = r8
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x01a0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0221
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            int r4 = r4 + 1
            java.lang.Object r6 = r5.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r6.size()
            r8 = 1
            if (r7 != r8) goto L_0x01e8
            r7 = 0
            java.lang.Object r8 = r6.get(r7)
            ttg r8 = (defpackage.ttg) r8
            java.lang.String r8 = r8.k()
            if (r8 == 0) goto L_0x01d0
            r7 = 1
            goto L_0x01e9
        L_0x01d0:
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r7] = r5
            java.lang.Object r5 = r6.get(r7)
            ttg r5 = (defpackage.ttg) r5
            java.lang.String r5 = defpackage.ttf.a((defpackage.ttg) r5)
            r7 = 1
            r11[r7] = r5
            java.lang.String r5 = "Beacon: %s %s"
            r13.a(r5, r11)
            goto L_0x01a0
        L_0x01e8:
            r7 = 1
        L_0x01e9:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r5
            java.lang.String r5 = "Beacon: %s"
            r13.a(r5, r8)
            java.util.Iterator r5 = r6.iterator()
        L_0x01f7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a0
            java.lang.Object r6 = r5.next()
            ttg r6 = (defpackage.ttg) r6
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = defpackage.ttf.a((defpackage.ttg) r6)
            r10 = 0
            r8[r10] = r7
            java.lang.String r7 = r6.k()
            r11 = 1
            r8[r11] = r7
            java.lang.String r6 = r6.i()
            r7 = 2
            r8[r7] = r6
            java.lang.String r6 = "  %s%s, ID: %s"
            r13.a(r6, r8)
            goto L_0x01f7
        L_0x0221:
            r3.println()
            boolean r0 = defpackage.arxk.a()
            if (r0 == 0) goto L_0x022b
            goto L_0x0231
        L_0x022b:
            java.lang.String r0 = "Warning: Bluetooth disabled"
            r3.println(r0)
        L_0x0231:
            android.content.Context r0 = r2.e
            boolean r0 = defpackage.arxk.a((android.content.Context) r0)
            if (r0 == 0) goto L_0x023a
            goto L_0x0240
        L_0x023a:
            java.lang.String r0 = "Warning: Location disabled"
            r3.println(r0)
        L_0x0240:
            arxg r0 = r2.g
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x024d
            java.lang.String r0 = "Warning: Debug mode disabled"
            r3.println(r0)
        L_0x024d:
            r5 = 3
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r6 = 0
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r6 = 1
            r0[r6] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r0[r5] = r4
            java.lang.String r4 = "Notification count: %d\nListView count: %d\nBeacon count: %d\n"
            r3.printf(r4, r0)
            java.util.List r0 = r2.d()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r3 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "FastPairItem: %d"
            r13.a(r3, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0284:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02a3
            java.lang.Object r2 = r0.next()
            tzi r2 = (defpackage.tzi) r2
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r2.k
            r5 = 0
            r4[r5] = r3
            java.lang.String r2 = r2.b
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "  %s, mac: %s"
            r13.a(r2, r4)
            goto L_0x0284
        L_0x02a3:
            r13.close()
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = r1.b
            java.lang.Class<txb> r2 = defpackage.txb.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            txb r0 = (defpackage.txb) r0
            java.io.PrintWriter r2 = r1.a
            r2.println()
            java.lang.String r3 = "BatteryAdvertisementManager"
            r2.println(r3)
            java.util.Map r3 = r0.b
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x02c5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0308
            java.lang.Object r5 = r3.next()
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement r5 = (com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement) r5
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r8 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r7[r9] = r4
            r4 = 1
            r7[r4] = r5
            auay r4 = r5.f
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 2
            r7[r9] = r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r13 = r5.e
            long r11 = r11 - r13
            long r4 = r4.toSeconds(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 3
            r7[r5] = r4
            java.lang.String r4 = "  element[%d]: %s, key.hash: %s, %ds ago\n"
            r2.printf(r4, r7)
            r4 = r8
            goto L_0x02c5
        L_0x0308:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            auay r3 = r0.d
            if (r3 == 0) goto L_0x0318
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x031a
        L_0x0318:
            java.lang.String r3 = "null"
        L_0x031a:
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "  shown account key.hash: %s\n"
            r2.printf(r3, r4)
            boolean r3 = defpackage.aymw.f()
            if (r3 != 0) goto L_0x0355
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r4 = "  connected device list:\n"
            r2.printf(r4, r3)
            java.util.Set r3 = r0.c
            monitor-enter(r3)
            java.util.Set r0 = r0.c     // Catch:{ all -> 0x0352 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0352 }
        L_0x0338:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0352 }
            if (r4 == 0) goto L_0x0350
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0352 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0352 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0352 }
            r5 = 0
            r6[r5] = r4     // Catch:{ all -> 0x0352 }
            java.lang.String r4 = "    %s\n"
            r2.printf(r4, r6)     // Catch:{ all -> 0x0352 }
            goto L_0x0338
        L_0x0350:
            monitor-exit(r3)     // Catch:{ all -> 0x0352 }
            goto L_0x0355
        L_0x0352:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0352 }
            throw r0
        L_0x0355:
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.I()
            if (r0 == 0) goto L_0x03e1
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = r1.b
            java.lang.Class<aryx> r2 = defpackage.aryx.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            r2 = r0
            aryx r2 = (defpackage.aryx) r2
            java.io.PrintWriter r0 = r1.a
            r0.println()
            java.lang.String r3 = "BluetoothDeviceConnectionStateManager"
            r0.println(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            amzy r3 = r2.c
            java.lang.String r3 = r3.toString()
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "  registered profiles: %s\n"
            r0.printf(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r4 = "  connected profile and devices:\n"
            r0.printf(r4, r3)
            monitor-enter(r2)
            r3 = 0
        L_0x0390:
            android.util.SparseArray r4 = r2.d     // Catch:{ all -> 0x03de }
            int r4 = r4.size()     // Catch:{ all -> 0x03de }
            if (r3 >= r4) goto L_0x03dc
            android.util.SparseArray r4 = r2.d     // Catch:{ all -> 0x03de }
            int r4 = r4.keyAt(r3)     // Catch:{ all -> 0x03de }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x03de }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03de }
            r7 = 0
            r6[r7] = r5     // Catch:{ all -> 0x03de }
            java.lang.String r5 = "    profile proxy %d:\n"
            r0.printf(r5, r6)     // Catch:{ all -> 0x03de }
            android.util.SparseArray r5 = r2.d     // Catch:{ all -> 0x03de }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x03de }
            android.bluetooth.BluetoothProfile r4 = (android.bluetooth.BluetoothProfile) r4     // Catch:{ all -> 0x03de }
            java.util.List r4 = r4.getConnectedDevices()     // Catch:{ all -> 0x03de }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x03de }
        L_0x03bd:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x03de }
            if (r5 == 0) goto L_0x03d9
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x03de }
            android.bluetooth.BluetoothDevice r5 = (android.bluetooth.BluetoothDevice) r5     // Catch:{ all -> 0x03de }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x03de }
            java.lang.String r5 = r5.getAddress()     // Catch:{ all -> 0x03de }
            r6 = 0
            r7[r6] = r5     // Catch:{ all -> 0x03de }
            java.lang.String r5 = "      %s\n"
            r0.printf(r5, r7)     // Catch:{ all -> 0x03de }
            goto L_0x03bd
        L_0x03d9:
            int r3 = r3 + 1
            goto L_0x0390
        L_0x03dc:
            monitor-exit(r2)     // Catch:{ all -> 0x03de }
            goto L_0x03e1
        L_0x03de:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03de }
            throw r0
        L_0x03e1:
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.L()
            if (r0 == 0) goto L_0x0441
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = r1.b
            java.lang.Class<tzr> r2 = defpackage.tzr.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            tzr r0 = (defpackage.tzr) r0
            java.io.PrintWriter r2 = r1.a
            r2.println()
            java.lang.String r3 = "FastPairScanner"
            r2.println(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            boolean r5 = defpackage.arxk.b()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "  isBleEnabled: %s\n"
            r2.printf(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            boolean r5 = r0.g()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r6] = r5
            java.lang.String r5 = "  Is alive: %s\n"
            r2.printf(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            boolean r5 = r0.f()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r6] = r5
            java.lang.String r5 = "  Is scanning: %s\n"
            r2.printf(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            tzq r0 = r0.d
            r4[r6] = r0
            java.lang.String r0 = "  Current scan mode: %s\n"
            r2.printf(r0, r4)
        L_0x0441:
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.J()
            if (r0 == 0) goto L_0x04bb
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = r1.b
            java.lang.Class<txr> r2 = defpackage.txr.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            txr r0 = (defpackage.txr) r0
            java.io.PrintWriter r2 = r1.a
            r2.println()
            java.lang.String r3 = "FastPairCacheManager"
            r2.println(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "  Current size: %s\n"
            r2.printf(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r0.maxSize()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r6] = r3
            java.lang.String r3 = "  Max size: %s\n"
            r2.printf(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = "  Items: \n"
            r2.printf(r4, r3)
            java.util.Map r0 = r0.snapshot()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0498:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04bb
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object r4 = r3.getKey()
            r6 = 0
            r5[r6] = r4
            java.lang.Object r3 = r3.getValue()
            r4 = 1
            r5[r4] = r3
            java.lang.String r3 = "    %s: %s\n"
            r2.printf(r3, r5)
            goto L_0x0498
        L_0x04bb:
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x052d
            com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService r0 = r1.b
            java.lang.Class<tya> r2 = defpackage.tya.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            tya r0 = (defpackage.tya) r0
            java.io.PrintWriter r2 = r1.a
            java.util.Map r0 = r0.b
            anaf r0 = defpackage.anaf.a((java.util.Map) r0)
            r2.println()
            java.lang.String r3 = "FastPairEventStream"
            r2.println(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "  Connected device count: %d\n"
            r2.printf(r3, r4)
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x04fc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x052d
            java.lang.Object r4 = r3.next()
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            java.lang.Object r5 = r0.get(r4)
            tyb r5 = (defpackage.tyb) r5
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r4
            if (r5 != 0) goto L_0x0519
            java.lang.String r4 = "DISCONNECTED"
            goto L_0x0524
        L_0x0519:
            boolean r4 = r5.b()
            if (r4 != 0) goto L_0x0522
            java.lang.String r4 = "DISCONNECTED"
            goto L_0x0524
        L_0x0522:
            java.lang.String r4 = "CONNECTED"
        L_0x0524:
            r5 = 1
            r7[r5] = r4
            java.lang.String r4 = "    %s [%s]\n"
            r2.printf(r4, r7)
            goto L_0x04fc
        L_0x052d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaw.run():void");
    }
}
