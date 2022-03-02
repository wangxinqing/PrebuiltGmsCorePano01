package com.google.android.gms.instantapps.backend;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DevManagerStatus$OnPackageChangeOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r5) {
        /*
            r4 = this;
            java.lang.Object r0 = defpackage.qeg.c
            monitor-enter(r0)
            android.net.Uri r1 = r5.getData()     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "com.google.android.instantapps.devman"
            android.net.Uri r2 = r5.getData()     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r2.getEncodedSchemeSpecificPart()     // Catch:{ all -> 0x0056 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r5.getAction()     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0056 }
            r2 = 0
            if (r1 != 0) goto L_0x0042
            java.lang.String r5 = r5.getAction()     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "android.intent.action.PACKAGE_REMOVED"
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0052
            qfn r5 = defpackage.qeg.a     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "DevManager uninstalled"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0056 }
            r5.a(r1, r3)     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0056 }
            defpackage.qeg.b = r5     // Catch:{ all -> 0x0056 }
            goto L_0x0052
        L_0x0042:
            qfn r5 = defpackage.qeg.a     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "DevManager installed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0056 }
            r5.a(r1, r2)     // Catch:{ all -> 0x0056 }
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0056 }
            defpackage.qeg.b = r5     // Catch:{ all -> 0x0056 }
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.backend.DevManagerStatus$OnPackageChangeOperation.onHandleIntent(android.content.Intent):void");
    }
}
