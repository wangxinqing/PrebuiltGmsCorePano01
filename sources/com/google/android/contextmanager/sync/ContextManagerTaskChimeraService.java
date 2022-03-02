package com.google.android.contextmanager.sync;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextManagerTaskChimeraService extends qwf {
    private final boolean a(String[] strArr) {
        if (strArr.length >= 2) {
            return true;
        }
        ((anih) ((anih) bxk.a.c()).a("com.google.android.contextmanager.sync.ContextManagerTaskChimeraService", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerTaskChimeraService] operation %s requires account", (Object) strArr[0]);
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r3.equals("RefreshStateOperation") != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.a
            java.lang.String r1 = ":"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)
            r1 = 3
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = r8.a
            r5 = 0
            r3[r5] = r4
            r4 = r0[r5]
            r6 = 1
            r3[r6] = r4
            int r4 = r0.length
            if (r4 < r2) goto L_0x001c
            r4 = r0[r6]
            goto L_0x001e
        L_0x001c:
            java.lang.String r4 = "<>"
        L_0x001e:
            r3[r2] = r4
            r3 = r0[r5]
            int r4 = r3.hashCode()
            switch(r4) {
                case -2075121709: goto L_0x0065;
                case -532243723: goto L_0x005b;
                case 563246221: goto L_0x0051;
                case 973696324: goto L_0x0047;
                case 1152043244: goto L_0x003d;
                case 2065618801: goto L_0x0034;
                case 2117277066: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x006f
        L_0x002a:
            java.lang.String r1 = "DeviceRegistrationSync"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006f
            r1 = 5
            goto L_0x0070
        L_0x0034:
            java.lang.String r4 = "RefreshStateOperation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x006f
            goto L_0x0070
        L_0x003d:
            java.lang.String r1 = "SyncOperation"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006f
            r1 = 4
            goto L_0x0070
        L_0x0047:
            java.lang.String r1 = "DownloadSyncOperation"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006f
            r1 = 2
            goto L_0x0070
        L_0x0051:
            java.lang.String r1 = "SyncServerInterestRecordsOperation"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006f
            r1 = 1
            goto L_0x0070
        L_0x005b:
            java.lang.String r1 = "ReadServerFenceUpdatesOperation"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006f
            r1 = 6
            goto L_0x0070
        L_0x0065:
            java.lang.String r1 = "DailyCheckinOperation"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006f
            r1 = 0
            goto L_0x0070
        L_0x006f:
            r1 = -1
        L_0x0070:
            switch(r1) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00a8;
                case 6: goto L_0x0091;
                default: goto L_0x0073;
            }
        L_0x0073:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 71
            java.lang.String r3 = "com.google.android.contextmanager.sync.ContextManagerTaskChimeraService"
            java.lang.String r4 = "a"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r1, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            java.lang.String r8 = r8.a
            java.lang.String r1 = "[ContextManagerTaskChimeraService] invalid sync operation %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r8)
            return r2
        L_0x0091:
            boolean r8 = r7.a((java.lang.String[]) r0)
            if (r8 == 0) goto L_0x00a7
            ckg r8 = new ckg
            bsz r1 = new bsz
            r0 = r0[r6]
            r1.<init>(r0)
            r8.<init>(r1)
            r8.a()
            goto L_0x00f2
        L_0x00a7:
            return r2
        L_0x00a8:
            boolean r8 = r7.a((java.lang.String[]) r0)
            if (r8 == 0) goto L_0x00bf
            cho r8 = new cho
            bsz r1 = new bsz
            r0 = r0[r6]
            r1.<init>(r0)
            r8.<init>(r1)
            java.util.concurrent.Future r8 = r8.a()
            goto L_0x00f2
        L_0x00bf:
            return r2
        L_0x00c0:
            cjz r8 = defpackage.cbi.z()
            ckb r8 = r8.b
            java.util.concurrent.Future r8 = r8.a()
            goto L_0x00f2
        L_0x00cb:
            cki r8 = new cki
            r8.<init>()
            java.util.concurrent.Future r8 = r8.a()
            goto L_0x00f2
        L_0x00d5:
            cke r8 = new cke
            r8.<init>()
            java.util.concurrent.Future r8 = r8.a()
            goto L_0x00f2
        L_0x00df:
            ckn r8 = new ckn
            r8.<init>()
            java.util.concurrent.Future r8 = r8.a()
            goto L_0x00f2
        L_0x00e9:
            cjy r8 = new cjy
            r8.<init>()
            java.util.concurrent.Future r8 = r8.a()
        L_0x00f2:
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00ff }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x00ff }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x00ff }
            if (r8 == 0) goto L_0x0100
            return r5
        L_0x00ff:
            r8 = move-exception
        L_0x0100:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.contextmanager.sync.ContextManagerTaskChimeraService.a(qxz):int");
    }
}
