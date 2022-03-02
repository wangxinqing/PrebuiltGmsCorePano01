package defpackage;

import java.io.Closeable;

/* renamed from: tru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tru implements tlx, tpc {
    public final tlw a;
    private final tph b;
    private final String c = String.format("DIRECT-%s-%s", new Object[]{ulu.a(2), ulu.a(6)});
    private final String d = ulu.a(8);

    public tru(tph tph, tlw tlw) {
        this.b = tph;
        this.a = tlw;
    }

    public final tnm a(tlh tlh, String str, arzw arzw) {
        uwd uwd;
        this.b.f();
        arzt arzt = arzw.g;
        if (arzt == null) {
            arzt = arzt.f;
        }
        String str2 = arzt.b;
        String str3 = arzt.c;
        int i = arzt.d;
        arzt arzt2 = arzw.g;
        if (arzt2 == null) {
            arzt2 = arzt.f;
        }
        int i2 = arzt2.e;
        jjg jjg = tky.a;
        tph tph = this.b;
        tfw q = tlh.q(str);
        synchronized (tph.i) {
            uwd = null;
            if (tph.a()) {
                if (tph.b.c.a()) {
                    uwd = tph.b.j.a(str2, str3, i, i2, q);
                }
            }
        }
        if (uwd != null) {
            trv a2 = trv.a(uwd);
            if (a2 != null) {
                return a2;
            }
            jjt.a((Closeable) uwd);
            throw new tlu(asnt.MEDIUM_ERROR, 6, String.format("WifiDirectBandwidthUpgradeMedium failed to create WiFi Direct endpoint channel to the WiFi Direct ssid %s for endpoint %s", new Object[]{str2, str}));
        }
        throw new tlu(asnt.MEDIUM_ERROR, 27, String.format("WifiDirectBandwidthUpgradeMedium failed to connect to the WiFi Direct ssid %s for endpoint %s", new Object[]{str2, str}));
    }

    public final void a() {
        this.b.g();
        this.b.h();
        jjg jjg = tky.a;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    public final byte[] a(defpackage.tlh r10, java.lang.String r11) {
        /*
            r9 = this;
            tph r0 = r9.b
            r0.f()
            tph r0 = r9.b
            java.lang.Object r1 = r0.i
            monitor-enter(r1)
            boolean r2 = r0.a()     // Catch:{ all -> 0x0186 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001e
            ulj r0 = r0.b     // Catch:{ all -> 0x0186 }
            une r0 = r0.j     // Catch:{ all -> 0x0186 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0186 }
            monitor-exit(r1)     // Catch:{ all -> 0x0186 }
            if (r0 == 0) goto L_0x001f
            goto L_0x004e
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x0186 }
        L_0x001f:
            tph r0 = r9.b
            java.lang.Object r2 = r0.i
            monitor-enter(r2)
            boolean r1 = r0.a()     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x016e
            ulj r1 = r0.b     // Catch:{ all -> 0x0183 }
            upb r1 = r1.c     // Catch:{ all -> 0x0183 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x0048
            ulj r0 = r0.b     // Catch:{ all -> 0x0183 }
            une r0 = r0.j     // Catch:{ all -> 0x0183 }
            r9.getClass()     // Catch:{ all -> 0x0183 }
            tor r1 = new tor     // Catch:{ all -> 0x0183 }
            r1.<init>(r9)     // Catch:{ all -> 0x0183 }
            boolean r0 = r0.a((defpackage.tor) r1)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x016f
            jjg r0 = defpackage.tky.a
        L_0x004e:
            boolean r0 = r10.d(r11)
            tph r1 = r9.b
            java.lang.Object r2 = r1.i
            monitor-enter(r2)
            boolean r5 = r1.a()     // Catch:{ all -> 0x016b }
            r6 = 26
            if (r5 == 0) goto L_0x006b
            ulj r1 = r1.b     // Catch:{ all -> 0x016b }
            une r1 = r1.j     // Catch:{ all -> 0x016b }
            boolean r1 = r1.b()     // Catch:{ all -> 0x016b }
            monitor-exit(r2)     // Catch:{ all -> 0x016b }
            if (r1 != 0) goto L_0x009b
            goto L_0x006c
        L_0x006b:
            monitor-exit(r2)     // Catch:{ all -> 0x016b }
        L_0x006c:
            tph r1 = r9.b
            java.lang.String r2 = r9.c
            java.lang.String r5 = r9.d
            tfw r10 = r10.q(r11)
            java.lang.Object r7 = r1.i
            monitor-enter(r7)
            boolean r8 = r1.a()     // Catch:{ all -> 0x0168 }
            if (r8 == 0) goto L_0x0150
            ulj r8 = r1.b     // Catch:{ all -> 0x0168 }
            upb r8 = r8.c     // Catch:{ all -> 0x0168 }
            boolean r8 = r8.a()     // Catch:{ all -> 0x0168 }
            if (r8 == 0) goto L_0x0095
            ulj r1 = r1.b     // Catch:{ all -> 0x0168 }
            une r1 = r1.j     // Catch:{ all -> 0x0168 }
            boolean r10 = r1.a(r2, r5, r0, r10)     // Catch:{ all -> 0x0168 }
            if (r10 == 0) goto L_0x0095
            r10 = 1
            goto L_0x0096
        L_0x0095:
            r10 = 0
        L_0x0096:
            monitor-exit(r7)     // Catch:{ all -> 0x0168 }
            if (r10 == 0) goto L_0x0151
            jjg r10 = defpackage.tky.a
        L_0x009b:
            tph r10 = r9.b
            java.lang.Object r0 = r10.i
            monitor-enter(r0)
            boolean r1 = r10.a()     // Catch:{ all -> 0x014d }
            r2 = 0
            if (r1 == 0) goto L_0x00bd
            ulj r1 = r10.b     // Catch:{ all -> 0x014d }
            upb r1 = r1.c     // Catch:{ all -> 0x014d }
            boolean r1 = r1.a()     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x00bb
            ulj r10 = r10.b     // Catch:{ all -> 0x014d }
            une r10 = r10.j     // Catch:{ all -> 0x014d }
            und r2 = r10.d()     // Catch:{ all -> 0x014d }
            monitor-exit(r0)     // Catch:{ all -> 0x014d }
            goto L_0x00be
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x014d }
            goto L_0x00be
        L_0x00bd:
            monitor-exit(r0)     // Catch:{ all -> 0x014d }
        L_0x00be:
            if (r2 == 0) goto L_0x0131
            java.lang.String r10 = r9.c
            java.lang.String r11 = r9.d
            int r0 = r2.a
            int r1 = r2.b
            arzt r2 = defpackage.arzt.f
            aucd r2 = r2.o()
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            r2.c()
            r2.c = r4
        L_0x00d8:
            aucj r5 = r2.b
            arzt r5 = (defpackage.arzt) r5
            r10.getClass()
            int r6 = r5.a
            r6 = r6 | r3
            r5.a = r6
            r5.b = r10
            r11.getClass()
            r10 = r6 | 2
            r5.a = r10
            r5.c = r11
            r10 = r10 | 4
            r5.a = r10
            r5.d = r0
            r11 = 8
            r10 = r10 | r11
            r5.a = r10
            r5.e = r1
            aucj r10 = r2.i()
            arzt r10 = (defpackage.arzt) r10
            arzw r0 = defpackage.arzw.h
            aucd r0 = r0.o()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x010d
            goto L_0x0112
        L_0x010d:
            r0.c()
            r0.c = r4
        L_0x0112:
            aucj r1 = r0.b
            arzw r1 = (defpackage.arzw) r1
            r1.b = r11
            int r11 = r1.a
            r11 = r11 | r3
            r1.a = r11
            r10.getClass()
            r1.g = r10
            r10 = r11 | 32
            r1.a = r10
            aucj r10 = r0.i()
            arzw r10 = (defpackage.arzw) r10
            byte[] r10 = defpackage.tpk.a((defpackage.arzw) r10)
            return r10
        L_0x0131:
            tph r10 = r9.b
            r10.h()
            tph r10 = r9.b
            r10.g()
            tlu r10 = new tlu
            asnt r0 = defpackage.asnt.MEDIUM_ERROR
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r11
            java.lang.String r11 = "WifiDirectBandwidthUpgradeMedium couldn't initiate the WIFI_DIRECT upgrade for endpoint %s because we could not obtain the WiFi Direct credentials."
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r10.<init>(r0, r6, r11)
            throw r10
        L_0x014d:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014d }
            throw r10
        L_0x0150:
            monitor-exit(r7)     // Catch:{ all -> 0x0168 }
        L_0x0151:
            tph r10 = r9.b
            r10.h()
            tlu r10 = new tlu
            asnt r0 = defpackage.asnt.MEDIUM_ERROR
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r11
            java.lang.String r11 = "WifiDirectBandwidthUpgradeMedium couldn't initiate the WIFI_DIRECT upgrade for endpoint %s because it failed to become WiFi Direct discoverable."
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r10.<init>(r0, r6, r11)
            throw r10
        L_0x0168:
            r10 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0168 }
            throw r10
        L_0x016b:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016b }
            throw r10
        L_0x016e:
            monitor-exit(r2)     // Catch:{ all -> 0x0183 }
        L_0x016f:
            tlu r10 = new tlu
            asnt r0 = defpackage.asnt.MEDIUM_ERROR
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r11
            r11 = 25
            java.lang.String r2 = "WifiDirectBandwidthUpgradeMedium couldn't initiate the WIFI_DIRECT upgrade for endpoint %s because it failed to start listening for incoming WiFi Direct connections."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r10.<init>(r0, r11, r1)
            throw r10
        L_0x0183:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0183 }
            throw r10
        L_0x0186:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0186 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tru.a(tlh, java.lang.String):byte[]");
    }
}
