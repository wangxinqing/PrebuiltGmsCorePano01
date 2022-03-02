package com.google.android.gms.chimera.container;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InitConfigOperation extends IntentOperation {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAction()
            defpackage.amtf.a((java.lang.Object) r0)
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r1) {
                case -1482987174: goto L_0x003c;
                case -500294787: goto L_0x0032;
                case -444354185: goto L_0x0028;
                case 438946629: goto L_0x001e;
                case 1360632797: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0046
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.chimera.container.ACTION_SECONDARY_USER_RECHECK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 2
            goto L_0x0047
        L_0x001e:
            java.lang.String r1 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            goto L_0x0047
        L_0x0028:
            java.lang.String r1 = "com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0032:
            java.lang.String r1 = "com.google.android.gms.chimera.container.ACTION_FORCE_CONFIG_RECHECK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 3
            goto L_0x0047
        L_0x003c:
            java.lang.String r1 = "com.google.android.chimera.container.REQUESTED_FEATURES_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 4
            goto L_0x0047
        L_0x0046:
            r0 = -1
        L_0x0047:
            if (r0 == 0) goto L_0x00ff
            if (r0 == r6) goto L_0x00ff
            if (r0 == r4) goto L_0x0052
            if (r0 == r3) goto L_0x0058
            if (r0 == r2) goto L_0x0058
            return
        L_0x0052:
            boolean r0 = defpackage.awxo.i()
            if (r0 == 0) goto L_0x00fe
        L_0x0058:
            boolean r0 = defpackage.awxp.f()
            if (r0 == 0) goto L_0x005f
            goto L_0x0082
        L_0x005f:
            r0 = 0
        L_0x0060:
            long r1 = (long) r0
            long r3 = defpackage.awxp.c()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0082
            agvx r1 = defpackage.heh.d
            java.lang.Object r1 = r1.c()
            byte[] r1 = (byte[]) r1
            byte[] r2 = defpackage.heh.a
            if (r1 != r2) goto L_0x0082
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x007d }
            int r0 = r0 + 1
            goto L_0x0060
        L_0x007d:
            r8 = move-exception
            java.lang.Thread.interrupted()
            return
        L_0x0082:
            java.lang.String r0 = "chimera.CLIENT_SESSION_ID"
            java.lang.String r0 = r8.getStringExtra(r0)
            java.lang.String r1 = "progressListener"
            boj r1 = defpackage.bpx.a((android.content.Intent) r8, (java.lang.String) r1)
            if (r1 == 0) goto L_0x0097
            hgw r2 = new hgw
            r2.<init>(r1)
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            java.lang.String r1 = "chimera.URGENTLY_REQUESTED_FEATURES"
            byte[] r1 = r8.getByteArrayExtra(r1)
            if (r1 == 0) goto L_0x00d9
            aubs r3 = defpackage.aubs.b()     // Catch:{ auda -> 0x00b4 }
            bod r4 = defpackage.bod.b     // Catch:{ auda -> 0x00b4 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r1, (defpackage.aubs) r3)     // Catch:{ auda -> 0x00b4 }
            bod r1 = (defpackage.bod) r1     // Catch:{ auda -> 0x00b4 }
            aucx r1 = r1.a     // Catch:{ auda -> 0x00b4 }
            amzy r1 = defpackage.amzy.a((java.util.Collection) r1)     // Catch:{ auda -> 0x00b4 }
            goto L_0x00dd
        L_0x00b4:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 39
            r4.<init>(r3)
            java.lang.String r3 = "Ignoring corrupt urgent features list: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r3 = "FeatureMgr"
            android.util.Log.w(r3, r1)
        L_0x00d9:
            amzy r1 = defpackage.amzy.h()
        L_0x00dd:
            hek r3 = defpackage.hek.a((android.content.Context) r7)
            r4 = 5
            r3.a(r4, r2, r0, r1)
            if (r2 == 0) goto L_0x00fd
            java.lang.Class<com.google.android.gms.chimera.container.WaitUpdateCompleteOperation> r0 = com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.class
            java.lang.String r1 = "com.google.android.gms.chimera.action.WAIT_UPDATE_COMPLETE"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r7, (java.lang.Class) r0, (java.lang.String) r1)
            defpackage.amtf.a((java.lang.Object) r0)
            java.lang.String r1 = "liveListener"
            defpackage.bpx.a((android.content.Intent) r0, (java.lang.String) r1, (defpackage.boj) r2)
            com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.a(r8, r0, r5)
            r7.startService(r0)
        L_0x00fd:
            return
        L_0x00fe:
            return
        L_0x00ff:
            com.google.android.gms.chimera.container.ConfigChimeraService.b()
            defpackage.hel.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.InitConfigOperation.onHandleIntent(android.content.Intent):void");
    }
}
