package com.google.android.gms.instantapps.routing;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstantAppAddRemoveStatusIntentOperation extends IntentOperation {
    private static final qfn a = new qfn("AppAddRemoveStatusOp");

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            axum r0 = defpackage.axum.a
            axun r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r6.getAction()
            int r1 = r0.hashCode()
            r2 = -1551420805(0xffffffffa387327b, float:-1.4658109E-17)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x002b
            r2 = 1686683586(0x6488bfc2, float:2.0180598E22)
            if (r1 == r2) goto L_0x0021
            goto L_0x0035
        L_0x0021:
            java.lang.String r1 = "com.google.android.gms.instantapps.INSTANT_APP_UNINSTALLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "com.google.android.gms.instantapps.INSTANT_APP_INSTALLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x0049
            if (r0 == r4) goto L_0x0049
            qfn r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r6 = r6.getAction()
            r1[r3] = r6
            java.lang.String r6 = "Unexpected intent action=%s"
            r0.b(r6, r1)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.routing.InstantAppAddRemoveStatusIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
