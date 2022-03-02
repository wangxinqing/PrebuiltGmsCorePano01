package defpackage;

import com.google.android.ulr.ApiBleRate;

/* renamed from: ajhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajhr implements ajhv {
    final /* synthetic */ ajhs a;

    public ajhr(ajhs ajhs) {
        this.a = ajhs;
    }

    public final void a(ApiBleRate apiBleRate) {
        this.a.g.a(apiBleRate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r0 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r9) {
        /*
            r8 = this;
            boolean r0 = r9.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.Object r0 = r9.get(r2)
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r9.get(r2)
            ajml r0 = (defpackage.ajml) r0
            boolean r0 = r0.h
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            boolean r3 = defpackage.ajhs.b
            if (r3 == 0) goto L_0x006b
            int r3 = r9.size()
            r4 = 0
        L_0x0024:
            if (r4 >= r3) goto L_0x0063
            java.lang.Object r5 = r9.get(r4)
            ajml r5 = (defpackage.ajml) r5
            java.lang.String r5 = defpackage.ajml.a((defpackage.ajml) r5)
            if (r5 == 0) goto L_0x003e
            java.util.Set r6 = defpackage.ajhs.a
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x003c
            r6 = 0
            goto L_0x003f
        L_0x003c:
            r6 = 1
            goto L_0x003f
        L_0x003e:
            r6 = 0
        L_0x003f:
            int r4 = r4 + 1
            if (r6 == 0) goto L_0x0024
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "Newfie beacon sighted with namespace: "
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0055
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x0058
        L_0x0055:
            r3.concat(r1)
        L_0x0058:
            java.lang.String r1 = "UlrNearbyBeaconScanRateChange"
            defpackage.ajjb.a((java.lang.String) r1)
            ajhs r1 = r8.a
            r1.a((boolean) r2)
            goto L_0x006b
        L_0x0063:
            if (r0 != 0) goto L_0x006d
            ajhs r0 = r8.a
            r0.b(r2)
            goto L_0x00ce
        L_0x006b:
            if (r0 == 0) goto L_0x00ce
        L_0x006d:
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x00ce
            ajhs r0 = r8.a
            ajmn r0 = r0.h
            boolean r0 = r0.i
            if (r0 != 0) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            boolean r0 = defpackage.aztb.e()
            if (r0 == 0) goto L_0x0089
            goto L_0x00ce
        L_0x0089:
            ajhs r0 = r8.a
            ajmn r0 = r0.h
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0097
            boolean r0 = defpackage.aztb.f()
            if (r0 != 0) goto L_0x00ce
        L_0x0097:
            ajhs r0 = r8.a
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            long r3 = defpackage.aztb.g()     // Catch:{ all -> 0x00cb }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00c4
            java.util.ArrayList r3 = r0.d     // Catch:{ all -> 0x00cb }
            r3.addAll(r9)     // Catch:{ all -> 0x00cb }
            java.util.ArrayList r9 = r0.d     // Catch:{ all -> 0x00cb }
            int r9 = r9.size()     // Catch:{ all -> 0x00cb }
            long r3 = defpackage.aztb.g()     // Catch:{ all -> 0x00cb }
            int r4 = (int) r3     // Catch:{ all -> 0x00cb }
            int r9 = r9 - r4
            if (r9 <= 0) goto L_0x00c2
            java.util.ArrayList r0 = r0.d     // Catch:{ all -> 0x00cb }
            java.util.List r9 = r0.subList(r2, r9)     // Catch:{ all -> 0x00cb }
            r9.clear()     // Catch:{ all -> 0x00cb }
        L_0x00c2:
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            return
        L_0x00c4:
            java.util.ArrayList r9 = r0.d     // Catch:{ all -> 0x00cb }
            r9.clear()     // Catch:{ all -> 0x00cb }
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            return
        L_0x00cb:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            throw r9
        L_0x00ce:
            ajhs r0 = r8.a
            ajhv r1 = r0.g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
            r0.a((java.util.ArrayList) r2)
            r1.a((java.util.List) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhr.a(java.util.List):void");
    }
}
