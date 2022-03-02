package defpackage;

import java.io.Closeable;

/* renamed from: trw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class trw implements tlx, tpd {
    public final tnq a;
    public final tlw b;
    private final tph c;

    public trw(tph tph, tnq tnq, tlw tlw) {
        this.c = tph;
        this.a = tnq;
        this.b = tlw;
    }

    public final tnm a(tlh tlh, String str, arzw arzw) {
        uwf uwf;
        this.c.f();
        arzu arzu = arzw.c;
        if (arzu == null) {
            arzu = arzu.f;
        }
        tph tph = this.c;
        String str2 = arzu.b;
        String str3 = arzu.c;
        String str4 = arzu.e;
        int i = arzu.d;
        tfw q = tlh.q(str);
        synchronized (tph.f) {
            uwf = null;
            if (tph.a()) {
                if (tph.b.c.a()) {
                    uwf = tph.b.g.a(str2, str3, str4, i, q);
                }
            }
        }
        if (uwf != null) {
            jjg jjg = tky.a;
            tnm a2 = this.a.a(uwf);
            if (a2 != null) {
                return a2;
            }
            jjt.a((Closeable) uwf);
            this.c.d();
            throw new tlu(asnt.MEDIUM_ERROR, 6, String.format("WifiHotspotBandwidthUpgradeMedium failed to create new EndpointChannel for outgoing socket %s, aborting upgrade.", new Object[]{uwf}));
        }
        throw new tlu(asnt.MEDIUM_ERROR, 13, String.format("WifiHotspotBandwidthUpgradeMedium failed to join available Wifi hotspot (%s, %d) on endpoint %s, aborting upgrade.", new Object[]{arzu.b, Integer.valueOf(arzu.d), str}));
    }

    public final void a() {
        tph tph = this.c;
        synchronized (tph.f) {
            if (tph.a()) {
                tph.b.g.g();
            }
        }
        this.c.c();
        this.c.d();
        jjg jjg = tky.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0324, code lost:
        if (r3.a() != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0326, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.ulh.a.d()).a("uoh", "a", 624, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting Wifi connections because WifiHotspot is not available.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x033c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        defpackage.ulu.a();
        r7 = new java.net.ServerSocket();
        r7.bind(new java.net.InetSocketAddress(r3.g.c, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r3.g.e = r7.getLocalPort();
        new defpackage.unp(r3, 9, r7, r0).start();
        r3.h = r7;
        r0 = r3.g.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x036b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x036e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x036f, code lost:
        r7 = (defpackage.anih) defpackage.ulh.a.b();
        r7.a((java.lang.Throwable) r0);
        ((defpackage.anih) r7.a("uoh", "a", 645, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting Wifi connections.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0388, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x038a, code lost:
        if (r0 != false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x044a, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x044b, code lost:
        r1.c.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0465, code lost:
        throw new defpackage.tlu(defpackage.asnt.MEDIUM_ERROR, 12, java.lang.String.format("WifiHotspotBandwidthUpgradeMedium couldn't complete the Wifi upgrade for endpoint %s because it failed to start listening for incoming Wifi connections.", new java.lang.Object[]{r19}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0469, code lost:
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0273, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02ba, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02bc, code lost:
        if (r10 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02be, code lost:
        r0 = defpackage.tky.a;
        r1 = r17;
        r0 = r1.c;
        r2 = r0.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02c6, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02cb, code lost:
        if (r0.a() == false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02cd, code lost:
        r3 = r0.b.g;
        getClass();
        r0 = new defpackage.too(r1);
        r3.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02e2, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e7, code lost:
        if (r3.f() == false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e9, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.ulh.a.b()).a("uoh", "a", 611, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting Wifi connections because another Wifi server is already in-progress.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02fe, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ff, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0306, code lost:
        if (r3.b() != false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0308, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.ulh.a.b()).a("uoh", "a", 619, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting Wifi connections without hosting a hotspot.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ae A[Catch:{ all -> 0x0470 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c9 A[Catch:{ all -> 0x0470 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(defpackage.tlh r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r17
            tph r0 = r1.c
            r0.f()
            boolean r7 = r18.d(r19)
            tph r0 = r1.c
            java.lang.Object r2 = r0.f
            monitor-enter(r2)
            boolean r3 = r0.a()     // Catch:{ all -> 0x0491 }
            if (r3 == 0) goto L_0x0022
            ulj r0 = r0.b     // Catch:{ all -> 0x0491 }
            uoh r0 = r0.g     // Catch:{ all -> 0x0491 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0491 }
            monitor-exit(r2)     // Catch:{ all -> 0x0491 }
            if (r0 != 0) goto L_0x038c
            goto L_0x0023
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x0491 }
        L_0x0023:
            tph r0 = r1.c
            tfw r11 = r18.q(r19)
            java.lang.Object r12 = r0.f
            monitor-enter(r12)
            boolean r2 = r0.a()     // Catch:{ all -> 0x048e }
            if (r2 == 0) goto L_0x0477
            ulj r0 = r0.b     // Catch:{ all -> 0x048e }
            uoh r13 = r0.g     // Catch:{ all -> 0x048e }
            java.lang.String r0 = "uoh"
            java.lang.String r14 = "a"
            java.lang.String r15 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r13.j()     // Catch:{ all -> 0x048e }
            monitor-enter(r13)     // Catch:{ all -> 0x048e }
            boolean r2 = r13.b()     // Catch:{ all -> 0x0474 }
            if (r2 == 0) goto L_0x0065
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0474 }
            anie r2 = r2.b()     // Catch:{ all -> 0x0474 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0474 }
            r3 = 307(0x133, float:4.3E-43)
            anie r0 = r2.a((java.lang.String) r0, (java.lang.String) r14, (int) r3, (java.lang.String) r15)     // Catch:{ all -> 0x0474 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0474 }
            java.lang.String r2 = "Refusing to start a Wifi hotspot because we're already hosting a Wifi hotspot with SSID %s."
            unu r3 = r13.c()     // Catch:{ all -> 0x0474 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0474 }
            r0.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0474 }
            monitor-exit(r13)     // Catch:{ all -> 0x0474 }
            r10 = 0
            goto L_0x02bb
        L_0x0065:
            boolean r2 = r13.a()     // Catch:{ all -> 0x0474 }
            if (r2 != 0) goto L_0x0084
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0474 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0474 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0474 }
            r3 = 315(0x13b, float:4.41E-43)
            anie r0 = r2.a((java.lang.String) r0, (java.lang.String) r14, (int) r3, (java.lang.String) r15)     // Catch:{ all -> 0x0474 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0474 }
            java.lang.String r2 = "Failed to start a Wifi hotspot because WifiHotspot is not available."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0474 }
            monitor-exit(r13)     // Catch:{ all -> 0x0474 }
            r10 = 0
            goto L_0x02bb
        L_0x0084:
            aymi r2 = defpackage.aymi.a     // Catch:{ all -> 0x0474 }
            aymj r2 = r2.a()     // Catch:{ all -> 0x0474 }
            boolean r2 = r2.aP()     // Catch:{ all -> 0x0474 }
            if (r2 == 0) goto L_0x013b
            java.lang.String r6 = "uoh"
            java.lang.String r5 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r2 = r13.d()     // Catch:{ all -> 0x0470 }
            if (r2 == 0) goto L_0x010e
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0470 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0470 }
            r3 = 447(0x1bf, float:6.26E-43)
            anie r2 = r2.a((java.lang.String) r6, (java.lang.String) r5, (int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0470 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0470 }
            java.lang.String r3 = "Attempting to start a wifi direct hotspot."
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            unf r3 = new unf     // Catch:{ all -> 0x0470 }
            r3.<init>(r13)     // Catch:{ all -> 0x0470 }
            uog r2 = new uog     // Catch:{ all -> 0x0470 }
            android.content.Context r8 = r13.a     // Catch:{ all -> 0x0470 }
            android.net.wifi.p2p.WifiP2pManager r9 = r13.e     // Catch:{ all -> 0x0470 }
            android.net.wifi.WifiManager r10 = r13.c     // Catch:{ all -> 0x0470 }
            r18 = r2
            r16 = r3
            r3 = r8
            r8 = r4
            r4 = r9
            r9 = r5
            r5 = r16
            r1 = r6
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0470 }
            uru r2 = r13.f     // Catch:{ all -> 0x0470 }
            r3 = r18
            urt r2 = r2.b(r3)     // Catch:{ all -> 0x0470 }
            urt r4 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0470 }
            if (r2 == r4) goto L_0x00ef
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r2 = r2.c()     // Catch:{ all -> 0x0470 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0470 }
            r3 = 463(0x1cf, float:6.49E-43)
            anie r1 = r2.a((java.lang.String) r1, (java.lang.String) r9, (int) r3, (java.lang.String) r8)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Unable to start Wifi Direct hotspot because registration failed"
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
            goto L_0x0126
        L_0x00ef:
            unu r1 = r3.b     // Catch:{ all -> 0x0470 }
            r13.g = r1     // Catch:{ all -> 0x0470 }
            r13.k = r3     // Catch:{ all -> 0x0470 }
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 321(0x141, float:4.5E-43)
            anie r0 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0470 }
            java.lang.String r1 = "Successfully started a Wifi Direct hotspot"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0470 }
            monitor-exit(r13)     // Catch:{ all -> 0x0470 }
            r10 = 1
            goto L_0x02bb
        L_0x010e:
            r8 = r4
            r9 = r5
            r1 = r6
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0470 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0470 }
            r3 = 443(0x1bb, float:6.21E-43)
            anie r1 = r2.a((java.lang.String) r1, (java.lang.String) r9, (int) r3, (java.lang.String) r8)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Wifi Direct is not supported."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
        L_0x0126:
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 324(0x144, float:4.54E-43)
            anie r1 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Failed to start a Wifi Direct hotspot"
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
        L_0x013b:
            aymi r1 = defpackage.aymi.a     // Catch:{ all -> 0x0470 }
            aymj r1 = r1.a()     // Catch:{ all -> 0x0470 }
            boolean r1 = r1.aO()     // Catch:{ all -> 0x0470 }
            if (r1 == 0) goto L_0x0212
            java.lang.String r1 = "uoh"
            java.lang.String r2 = "m"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0470 }
            r5 = 26
            if (r4 < r5) goto L_0x01e8
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r4 = r4.d()     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            r5 = 501(0x1f5, float:7.02E-43)
            anie r4 = r4.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            java.lang.String r5 = "Attempting to start a local only hotspot."
            r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0470 }
            boolean r4 = defpackage.aymi.y()     // Catch:{ all -> 0x0470 }
            if (r4 == 0) goto L_0x016f
        L_0x016e:
            goto L_0x0176
        L_0x016f:
            boolean r4 = defpackage.jkr.h()     // Catch:{ all -> 0x0470 }
            if (r4 != 0) goto L_0x0194
            goto L_0x016e
        L_0x0176:
            upb r4 = r13.b     // Catch:{ all -> 0x0470 }
            boolean r4 = r4.b()     // Catch:{ all -> 0x0470 }
            if (r4 != 0) goto L_0x0194
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r4 = r4.c()     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            r5 = 510(0x1fe, float:7.15E-43)
            anie r1 = r4.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Failed to start a local-only hotspot because we failed to turn Wifi off before starting it up."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
            goto L_0x01fd
        L_0x0194:
            aosh r4 = defpackage.aosh.f()     // Catch:{ all -> 0x0470 }
            unm r5 = new unm     // Catch:{ all -> 0x0470 }
            r5.<init>(r13, r4)     // Catch:{ all -> 0x0470 }
            unv r6 = new unv     // Catch:{ all -> 0x0470 }
            android.net.wifi.WifiManager r7 = r13.c     // Catch:{ all -> 0x0470 }
            r6.<init>(r7, r4, r5)     // Catch:{ all -> 0x0470 }
            urt r4 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0470 }
            uru r5 = r13.f     // Catch:{ all -> 0x0470 }
            urt r5 = r5.b(r6)     // Catch:{ all -> 0x0470 }
            if (r4 == r5) goto L_0x01c9
            upb r4 = r13.b     // Catch:{ all -> 0x0470 }
            r4.a()     // Catch:{ all -> 0x0470 }
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r4 = r4.c()     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            r5 = 549(0x225, float:7.7E-43)
            anie r1 = r4.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Unable to start the Local only hotspot because registration failed."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
            goto L_0x01fd
        L_0x01c9:
            r13.i = r6     // Catch:{ all -> 0x0470 }
            unu r1 = r6.a     // Catch:{ all -> 0x0470 }
            r13.g = r1     // Catch:{ all -> 0x0470 }
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 330(0x14a, float:4.62E-43)
            anie r0 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0470 }
            java.lang.String r1 = "Successfully started a local only hotspot"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0470 }
            monitor-exit(r13)     // Catch:{ all -> 0x0470 }
            r10 = 1
            goto L_0x02bb
        L_0x01e8:
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r4 = r4.d()     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            r5 = 497(0x1f1, float:6.96E-43)
            anie r1 = r4.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Local only hotspot is not supported."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
        L_0x01fd:
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 333(0x14d, float:4.67E-43)
            anie r1 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Failed to start a local only hotspot"
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
        L_0x0212:
            aymi r1 = defpackage.aymi.a     // Catch:{ all -> 0x0470 }
            aymj r1 = r1.a()     // Catch:{ all -> 0x0470 }
            boolean r1 = r1.aQ()     // Catch:{ all -> 0x0470 }
            if (r1 == 0) goto L_0x02a4
            java.lang.String r1 = "uoh"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            upb r4 = r13.b     // Catch:{ all -> 0x0470 }
            boolean r4 = r4.b()     // Catch:{ all -> 0x0470 }
            if (r4 != 0) goto L_0x0242
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r4 = r4.c()     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            r5 = 389(0x185, float:5.45E-43)
            anie r1 = r4.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Failed to start a Wifi AP because we failed to turn Wifi off before starting it up."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
            goto L_0x028f
        L_0x0242:
            uoa r4 = new uoa     // Catch:{ all -> 0x0470 }
            android.content.Context r5 = r13.a     // Catch:{ all -> 0x0470 }
            android.net.wifi.WifiManager r6 = r13.c     // Catch:{ all -> 0x0470 }
            android.net.ConnectivityManager r7 = r13.d     // Catch:{ all -> 0x0470 }
            r4.<init>(r5, r6, r7, r11)     // Catch:{ all -> 0x0470 }
            urt r5 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0470 }
            uru r6 = r13.f     // Catch:{ all -> 0x0470 }
            urt r6 = r6.b(r4)     // Catch:{ all -> 0x0470 }
            if (r5 != r6) goto L_0x0275
            unu r1 = r4.b     // Catch:{ all -> 0x0470 }
            r13.g = r1     // Catch:{ all -> 0x0470 }
            r13.j = r4     // Catch:{ all -> 0x0470 }
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 339(0x153, float:4.75E-43)
            anie r0 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0470 }
            java.lang.String r1 = "Successfully started a Wifi SoftAP hotspot"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0470 }
            monitor-exit(r13)     // Catch:{ all -> 0x0470 }
            r10 = 1
            goto L_0x02bb
        L_0x0275:
            upb r4 = r13.b     // Catch:{ all -> 0x0470 }
            r4.a()     // Catch:{ all -> 0x0470 }
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r4 = r4.c()     // Catch:{ all -> 0x0470 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0470 }
            r5 = 400(0x190, float:5.6E-43)
            anie r1 = r4.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Unable to start a Soft AP Wifi Hotspot because registration failed."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
        L_0x028f:
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 342(0x156, float:4.79E-43)
            anie r1 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            java.lang.String r2 = "Failed to start a Wifi SoftAP hotspot"
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0470 }
        L_0x02a4:
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0470 }
            anie r1 = r1.b()     // Catch:{ all -> 0x0470 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0470 }
            r2 = 346(0x15a, float:4.85E-43)
            anie r0 = r1.a((java.lang.String) r0, (java.lang.String) r14, (int) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0470 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0470 }
            java.lang.String r1 = "Failed to start a Wifi hotspot"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0470 }
            monitor-exit(r13)     // Catch:{ all -> 0x0470 }
            r10 = 0
        L_0x02bb:
            monitor-exit(r12)     // Catch:{ all -> 0x046c }
            if (r10 == 0) goto L_0x0469
            jjg r0 = defpackage.tky.a
            r1 = r17
            tph r0 = r1.c
            java.lang.Object r2 = r0.f
            monitor-enter(r2)
            boolean r3 = r0.a()     // Catch:{ all -> 0x0466 }
            if (r3 == 0) goto L_0x044a
            ulj r0 = r0.b     // Catch:{ all -> 0x0466 }
            uoh r3 = r0.g     // Catch:{ all -> 0x0466 }
            r17.getClass()     // Catch:{ all -> 0x0466 }
            too r0 = new too     // Catch:{ all -> 0x0466 }
            r0.<init>(r1)     // Catch:{ all -> 0x0466 }
            java.lang.String r4 = "uoh"
            java.lang.String r5 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r3.j()     // Catch:{ all -> 0x0466 }
            monitor-enter(r3)     // Catch:{ all -> 0x0466 }
            boolean r7 = r3.f()     // Catch:{ all -> 0x0447 }
            if (r7 == 0) goto L_0x0302
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0447 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            r7 = 611(0x263, float:8.56E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r5, (int) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            java.lang.String r4 = "Refusing to start accepting Wifi connections because another Wifi server is already in-progress."
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x0447 }
            monitor-exit(r3)     // Catch:{ all -> 0x0447 }
            r0 = 0
            goto L_0x0389
        L_0x0302:
            boolean r7 = r3.b()     // Catch:{ all -> 0x0447 }
            if (r7 != 0) goto L_0x0320
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0447 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            r7 = 619(0x26b, float:8.67E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r5, (int) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            java.lang.String r4 = "Can't start accepting Wifi connections without hosting a hotspot."
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x0447 }
            monitor-exit(r3)     // Catch:{ all -> 0x0447 }
            r0 = 0
            goto L_0x0389
        L_0x0320:
            boolean r7 = r3.a()     // Catch:{ all -> 0x0447 }
            if (r7 != 0) goto L_0x033e
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0447 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            r7 = 624(0x270, float:8.74E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r5, (int) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            java.lang.String r4 = "Failed to start accepting Wifi connections because WifiHotspot is not available."
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x0447 }
            monitor-exit(r3)     // Catch:{ all -> 0x0447 }
            r0 = 0
            goto L_0x0389
        L_0x033e:
            defpackage.ulu.a()     // Catch:{ IOException -> 0x036e }
            java.net.ServerSocket r7 = new java.net.ServerSocket     // Catch:{ IOException -> 0x036e }
            r7.<init>()     // Catch:{ IOException -> 0x036e }
            java.net.InetSocketAddress r8 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x036e }
            unu r9 = r3.g     // Catch:{ IOException -> 0x036e }
            java.net.InetAddress r9 = r9.c     // Catch:{ IOException -> 0x036e }
            r10 = 0
            r8.<init>(r9, r10)     // Catch:{ IOException -> 0x036e }
            r7.bind(r8)     // Catch:{ IOException -> 0x036e }
            unu r4 = r3.g     // Catch:{ all -> 0x0447 }
            int r5 = r7.getLocalPort()     // Catch:{ all -> 0x0447 }
            r4.e = r5     // Catch:{ all -> 0x0447 }
            unp r4 = new unp     // Catch:{ all -> 0x0447 }
            r5 = 9
            r4.<init>(r3, r5, r7, r0)     // Catch:{ all -> 0x0447 }
            r4.start()     // Catch:{ all -> 0x0447 }
            r3.h = r7     // Catch:{ all -> 0x0447 }
            unu r0 = r3.g     // Catch:{ all -> 0x0447 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0447 }
            monitor-exit(r3)     // Catch:{ all -> 0x0447 }
            r0 = 1
            goto L_0x0389
        L_0x036e:
            r0 = move-exception
            jjg r7 = defpackage.ulh.a     // Catch:{ all -> 0x0447 }
            anie r7 = r7.b()     // Catch:{ all -> 0x0447 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0447 }
            r7.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0447 }
            r0 = 645(0x285, float:9.04E-43)
            anie r0 = r7.a((java.lang.String) r4, (java.lang.String) r5, (int) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0447 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0447 }
            java.lang.String r4 = "Failed to start accepting Wifi connections."
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x0447 }
            monitor-exit(r3)     // Catch:{ all -> 0x0447 }
            r0 = 0
        L_0x0389:
            monitor-exit(r2)     // Catch:{ all -> 0x0466 }
            if (r0 == 0) goto L_0x044b
        L_0x038c:
            tph r0 = r1.c
            java.lang.Object r2 = r0.f
            monitor-enter(r2)
            boolean r3 = r0.a()     // Catch:{ all -> 0x0444 }
            r4 = 0
            if (r3 == 0) goto L_0x03b3
            ulj r0 = r0.b     // Catch:{ all -> 0x0444 }
            uoh r0 = r0.g     // Catch:{ all -> 0x0444 }
            unu r0 = r0.c()     // Catch:{ all -> 0x0444 }
            if (r0 == 0) goto L_0x03b1
            tpg r4 = new tpg     // Catch:{ all -> 0x0444 }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x0444 }
            java.lang.String r5 = r0.b     // Catch:{ all -> 0x0444 }
            java.lang.String r6 = r0.d     // Catch:{ all -> 0x0444 }
            int r0 = r0.e     // Catch:{ all -> 0x0444 }
            r4.<init>(r3, r5, r6, r0)     // Catch:{ all -> 0x0444 }
            monitor-exit(r2)     // Catch:{ all -> 0x0444 }
            goto L_0x03b4
        L_0x03b1:
            monitor-exit(r2)     // Catch:{ all -> 0x0444 }
            goto L_0x03b4
        L_0x03b3:
            monitor-exit(r2)     // Catch:{ all -> 0x0444 }
        L_0x03b4:
            if (r4 == 0) goto L_0x042e
            java.lang.String r0 = r4.a
            java.lang.String r2 = r4.b
            java.lang.String r3 = r4.c
            int r4 = r4.d
            arzu r5 = defpackage.arzu.f
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x03c9
            goto L_0x03cf
        L_0x03c9:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x03cf:
            aucj r6 = r5.b
            arzu r6 = (defpackage.arzu) r6
            r0.getClass()
            int r7 = r6.a
            r8 = 1
            r7 = r7 | r8
            r6.a = r7
            r6.b = r0
            r2.getClass()
            r0 = r7 | 2
            r6.a = r0
            r6.c = r2
            r0 = r0 | 4
            r6.a = r0
            r6.d = r4
            r3.getClass()
            r0 = r0 | 8
            r6.a = r0
            r6.e = r3
            aucj r0 = r5.i()
            arzu r0 = (defpackage.arzu) r0
            arzw r2 = defpackage.arzw.h
            aucd r2 = r2.o()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0407
            goto L_0x040d
        L_0x0407:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x040d:
            aucj r3 = r2.b
            arzw r3 = (defpackage.arzw) r3
            r4 = 3
            r3.b = r4
            int r4 = r3.a
            r5 = 1
            r4 = r4 | r5
            r3.a = r4
            r0.getClass()
            r3.c = r0
            r0 = r4 | 2
            r3.a = r0
            aucj r0 = r2.i()
            arzw r0 = (defpackage.arzw) r0
            byte[] r0 = defpackage.tpk.a((defpackage.arzw) r0)
            return r0
        L_0x042e:
            tlu r0 = new tlu
            asnt r2 = defpackage.asnt.MEDIUM_ERROR
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r19
            java.lang.String r4 = "WifiHotspotBandwidthUpgradeMedium couldn't initiate the WIFI_HOTSPOT upgrade for endpoint %s because the Wifi Hotspot credentials were unable to be obtained."
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r4 = 12
            r0.<init>(r2, r4, r3)
            throw r0
        L_0x0444:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0444 }
            throw r0
        L_0x0447:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0447 }
            throw r0     // Catch:{ all -> 0x0466 }
        L_0x044a:
            monitor-exit(r2)     // Catch:{ all -> 0x0466 }
        L_0x044b:
            tph r0 = r1.c
            r0.c()
            tlu r0 = new tlu
            asnt r2 = defpackage.asnt.MEDIUM_ERROR
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r19
            java.lang.String r4 = "WifiHotspotBandwidthUpgradeMedium couldn't complete the Wifi upgrade for endpoint %s because it failed to start listening for incoming Wifi connections."
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r4 = 12
            r0.<init>(r2, r4, r3)
            throw r0
        L_0x0466:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0466 }
            throw r0
        L_0x0469:
            r1 = r17
            goto L_0x0478
        L_0x046c:
            r0 = move-exception
            r1 = r17
            goto L_0x048f
        L_0x0470:
            r0 = move-exception
            r1 = r17
            goto L_0x0475
        L_0x0474:
            r0 = move-exception
        L_0x0475:
            monitor-exit(r13)     // Catch:{ all -> 0x0474 }
            throw r0     // Catch:{ all -> 0x048e }
        L_0x0477:
            monitor-exit(r12)     // Catch:{ all -> 0x048e }
        L_0x0478:
            tlu r0 = new tlu
            asnt r2 = defpackage.asnt.MEDIUM_ERROR
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r19
            r4 = 11
            java.lang.String r5 = "WifiHotspotBandwidthUpgradeMedium couldn't complete the Wifi upgrade for endpoint %s because it failed to start a Wifi hotspot."
            java.lang.String r3 = java.lang.String.format(r5, r3)
            r0.<init>(r2, r4, r3)
            throw r0
        L_0x048e:
            r0 = move-exception
        L_0x048f:
            monitor-exit(r12)     // Catch:{ all -> 0x048e }
            throw r0
        L_0x0491:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0491 }
            goto L_0x0495
        L_0x0494:
            throw r0
        L_0x0495:
            goto L_0x0494
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trw.a(tlh, java.lang.String):byte[]");
    }
}
