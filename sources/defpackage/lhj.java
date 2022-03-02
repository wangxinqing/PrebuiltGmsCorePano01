package defpackage;

/* renamed from: lhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lhj implements lhs {
    private final lhi a;
    private final boolean b;
    private final khq c;
    private final lhv d;

    public lhj(lhv lhv, lhi lhi, boolean z, khq khq) {
        this.d = lhv;
        this.a = lhi;
        this.b = z;
        this.c = khq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r4.remove(r1) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            lhv r0 = r8.d
            lhi r1 = r8.a
            boolean r2 = r8.b
            khq r3 = r8.c
            lhk r4 = r0.b
            lhe r5 = r1.g
            r6 = r4
            lhn r6 = (defpackage.lhn) r6
            java.lang.Object r6 = r6.c
            monitor-enter(r6)
            lhn r4 = (defpackage.lhn) r4     // Catch:{ all -> 0x0083 }
            java.util.Set r4 = r4.e     // Catch:{ all -> 0x0083 }
            boolean r4 = r4.remove(r5)     // Catch:{ all -> 0x0083 }
            if (r4 != 0) goto L_0x0025
            ith r4 = defpackage.lhn.a     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "NetworkStoreImpl"
            java.lang.String r7 = "Attempt to remove listener that has not been added."
            r4.c((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ all -> 0x0083 }
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.drive.networkcontrol.BatteryStateChangeReceiver r4 = r0.c
            lhc r5 = r1.e
            r4.b(r5)
            lhd r1 = r1.f
            if (r2 == 0) goto L_0x004a
            lhx r0 = r0.e
            lhy r0 = (defpackage.lhy) r0
            java.util.Set r0 = r0.b
            defpackage.iva.a((java.lang.Object) r1)
            boolean r0 = r0.remove(r1)
            if (r0 != 0) goto L_0x0049
            ith r0 = defpackage.lhy.a
            java.lang.String r1 = "PreferencesImpl"
            java.lang.String r2 = "Attempt to remove sync preferences listener which was not added."
            r0.c((java.lang.String) r1, (java.lang.String) r2)
        L_0x0049:
            return
        L_0x004a:
            kew r0 = r0.d
            r2 = r0
            kex r2 = (defpackage.kex) r2
            java.util.Map r2 = r2.c
            monitor-enter(r2)
            r4 = r0
            kex r4 = (defpackage.kex) r4     // Catch:{ all -> 0x0080 }
            java.util.Map r4 = r4.c     // Catch:{ all -> 0x0080 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0080 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            boolean r1 = r4.remove(r1)     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x006f
        L_0x0066:
            ith r1 = defpackage.kex.a     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = "AppPreferencesStoreImpl"
            java.lang.String r6 = "The listener was not added."
            r1.c((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0080 }
        L_0x006f:
            if (r4 == 0) goto L_0x007e
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x007e
            kex r0 = (defpackage.kex) r0     // Catch:{ all -> 0x0080 }
            java.util.Map r0 = r0.c     // Catch:{ all -> 0x0080 }
            r0.remove(r3)     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            throw r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhj.a():void");
    }
}
