package com.google.android.gms.icing.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemEventIntentOperation extends IntentOperation {
    public static final String a = jkq.a("com.google.android.gms.icing");
    public static final String b = jkq.a("com.google.android.gms.icing.mdh");

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        if (new java.util.Random().nextInt(r5) == 0) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, android.content.Intent r6) {
        /*
            java.lang.String r0 = "SystemEventIntentOperation.run: Got intent %s"
            defpackage.oso.d((java.lang.String) r0, (java.lang.Object) r6)
            android.os.Bundle r0 = r6.getExtras()
            if (r0 == 0) goto L_0x0029
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r4 = "SystemEventIntentOperation.run Intent extra %s: %s"
            defpackage.oso.d(r4, r2, r3)
            goto L_0x0013
        L_0x0029:
            java.lang.String r0 = r6.getAction()
            java.lang.String r1 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r2 = r2.equals(r0)
            r3 = 1
            if (r2 != 0) goto L_0x004e
            java.lang.String r2 = a
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x004e
            java.lang.String r2 = b
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            goto L_0x006a
        L_0x004e:
            java.lang.String r0 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "com.google.android.gms.icing"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = "com.google.android.gms.icing.mdh"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = 1
        L_0x006a:
            java.lang.String r0 = "com.google.android.gms.icing.service.IndexWorkerService"
            r6.setClassName(r5, r0)
            r5.startService(r6)
            boolean r5 = defpackage.pbq.a()
            if (r5 != 0) goto L_0x007c
            if (r1 == 0) goto L_0x00dc
            goto L_0x00c5
        L_0x007c:
            if (r1 == 0) goto L_0x00dc
            pia r5 = defpackage.phw.a
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = "Received flags update request"
            r5.a(r1, r0)
            agvx r5 = defpackage.pba.J
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00c2
            agvx r5 = defpackage.ozz.C
            java.lang.Object r5 = r5.c()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x00b0
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int r5 = r6.nextInt(r5)
            if (r5 != 0) goto L_0x00c5
            goto L_0x00c2
        L_0x00b0:
            if (r5 >= 0) goto L_0x00c5
            pia r0 = defpackage.phw.a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r6] = r5
            java.lang.String r5 = "Invalid sampling interval: %d"
            r0.e(r5, r1)
            goto L_0x00c5
        L_0x00c2:
            defpackage.pbt.a()
        L_0x00c5:
            axud r5 = defpackage.axud.a
            axue r5 = r5.a()
            long r5 = r5.b()
            int r6 = (int) r5
            if (r6 <= 0) goto L_0x00dc
            java.util.concurrent.ExecutorService r5 = defpackage.pbu.a
            pbs r0 = new pbs
            r0.<init>(r6)
            r5.execute(r0)
        L_0x00dc:
            return
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.service.SystemEventIntentOperation.a(android.content.Context, android.content.Intent):void");
    }

    public final void onHandleIntent(Intent intent) {
        a(this, intent);
    }
}
