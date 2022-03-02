package com.google.android.gms.auth.account.be;

import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SupervisedAccountIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("SupervisedAccountIntentOperation");

    private final void a() {
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.requestFeatureAtLatestVersion("kids");
        featureRequest.setUrgent();
        a.c("Requesting feature: kids...", new Object[0]);
        ModuleManager.get(this).requestFeatures(featureRequest);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ac2dm"
            iwd r1 = a
            java.lang.String r2 = r8.getAction()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            java.lang.String r4 = "onHandleIntent(): "
            if (r3 != 0) goto L_0x001a
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x001e
        L_0x001a:
            java.lang.String r2 = r4.concat(r2)
        L_0x001e:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r1.c(r2, r4)
            boolean r1 = defpackage.ent.g()
            if (r1 != 0) goto L_0x0034
            iwd r8 = a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "This operation is disabled"
            r8.c(r1, r0)
            return
        L_0x0034:
            java.lang.String r1 = r8.getAction()
            int r2 = r1.hashCode()
            r4 = 438946629(0x1a29cb45, float:3.511258E-23)
            r5 = 1
            if (r2 == r4) goto L_0x0052
            r4 = 1544582882(0x5c1076e2, float:1.62652439E17)
            if (r2 == r4) goto L_0x0048
            goto L_0x005c
        L_0x0048:
            java.lang.String r2 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 0
            goto L_0x005d
        L_0x0052:
            java.lang.String r2 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = -1
        L_0x005d:
            if (r1 == 0) goto L_0x00f8
            if (r1 == r5) goto L_0x0063
            goto L_0x00e7
        L_0x0063:
            iwd r8 = a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "onContainerUpdated"
            r8.c(r2, r1)
            boolean r8 = defpackage.ent.i()
            if (r8 != 0) goto L_0x007c
            iwd r8 = a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Skipping token refresh"
            r8.c(r1, r0)
            goto L_0x00e7
        L_0x007c:
            java.lang.String r8 = r7.getPackageName()
            java.util.List r8 = defpackage.jgu.d(r7, r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x0088:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r8.next()
            android.accounts.Account r1 = (android.accounts.Account) r1
            iwd r2 = a     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r4 = "Refreshing servivce flags for account %s"
            java.lang.String r5 = defpackage.iwd.a((java.lang.Object) r1)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00c4 }
            int r6 = r5.length()     // Catch:{ Exception -> 0x00c4 }
            if (r6 != 0) goto L_0x00ac
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x00c4 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r5 = r4.concat(r5)     // Catch:{ Exception -> 0x00c4 }
        L_0x00b0:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00c4 }
            r2.c(r5, r4)     // Catch:{ Exception -> 0x00c4 }
            android.os.Bundle r2 = android.os.Bundle.EMPTY     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = defpackage.eim.b((android.content.Context) r7, (android.accounts.Account) r1, (java.lang.String) r0, (android.os.Bundle) r2)     // Catch:{ Exception -> 0x00c4 }
            defpackage.eim.e(r7, r2)     // Catch:{ Exception -> 0x00c4 }
            android.os.Bundle r2 = android.os.Bundle.EMPTY     // Catch:{ Exception -> 0x00c4 }
            defpackage.eim.b((android.content.Context) r7, (android.accounts.Account) r1, (java.lang.String) r0, (android.os.Bundle) r2)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x0088
        L_0x00c4:
            r2 = move-exception
            iwd r2 = a
            java.lang.String r1 = defpackage.iwd.a((java.lang.Object) r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Failed to refresh service flags for account %s"
            int r5 = r1.length()
            if (r5 != 0) goto L_0x00dd
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x00e1
        L_0x00dd:
            java.lang.String r1 = r4.concat(r1)
        L_0x00e1:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r2.d(r1, r4)
            goto L_0x0088
        L_0x00e7:
            java.lang.String r8 = "usm"
            java.util.List r8 = defpackage.jgu.f(r7, r8)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00f7
            r7.a()
        L_0x00f7:
            return
        L_0x00f8:
            android.net.Uri r0 = r8.getData()
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r0.getSchemeSpecificPart()
            goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            boolean r1 = defpackage.amrk.a((java.lang.String) r0)
            if (r1 != 0) goto L_0x0132
            java.lang.String r8 = defpackage.ent.h()
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0119
            java.util.Set r8 = java.util.Collections.emptySet()
            goto L_0x0128
        L_0x0119:
            ob r1 = new ob
            r1.<init>()
            java.lang.String r2 = ","
            java.lang.String[] r8 = r8.split(r2)
            java.util.Collections.addAll(r1, r8)
            r8 = r1
        L_0x0128:
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x0131
            r7.a()
        L_0x0131:
            return
        L_0x0132:
            iwd r0 = a
            java.lang.String r8 = r8.getAction()
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 42
            r2.<init>(r1)
            java.lang.String r1 = "Dropping "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r8 = " Intent with missing package name"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0.d(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.SupervisedAccountIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
