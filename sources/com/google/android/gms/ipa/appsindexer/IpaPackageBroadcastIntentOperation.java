package com.google.android.gms.ipa.appsindexer;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IpaPackageBroadcastIntentOperation extends IntentOperation {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r9) {
        /*
            r8 = this;
            boolean r0 = defpackage.axvz.d()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 34
            r2.<init>(r1)
            java.lang.String r1 = "AppsCorpus got package broadcast: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
            java.lang.String r0 = r9.getAction()
            android.net.Uri r1 = r9.getData()
            if (r1 == 0) goto L_0x0037
            android.net.Uri r1 = r9.getData()
            java.lang.String r1 = r1.getSchemeSpecificPart()
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r2 = r0.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            switch(r2) {
                case -810471698: goto L_0x006d;
                case -19011148: goto L_0x0063;
                case 172491798: goto L_0x0059;
                case 525384130: goto L_0x004f;
                case 1544582882: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0077
        L_0x0045:
            java.lang.String r2 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0077
            r0 = 1
            goto L_0x0078
        L_0x004f:
            java.lang.String r2 = "android.intent.action.PACKAGE_REMOVED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0077
            r0 = 0
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "android.intent.action.PACKAGE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0077
            r0 = 3
            goto L_0x0078
        L_0x0063:
            java.lang.String r2 = "android.intent.action.LOCALE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0077
            r0 = 4
            goto L_0x0078
        L_0x006d:
            java.lang.String r2 = "android.intent.action.PACKAGE_REPLACED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0077
            r0 = 2
            goto L_0x0078
        L_0x0077:
            r0 = -1
        L_0x0078:
            if (r0 == 0) goto L_0x00a3
            if (r0 == r6) goto L_0x00a0
            if (r0 == r5) goto L_0x00a0
            if (r0 == r4) goto L_0x0092
            if (r0 == r3) goto L_0x0084
            r6 = 0
            goto L_0x00ab
        L_0x0084:
            qok r9 = defpackage.qok.a()
            qny r0 = new qny
            r0.<init>(r8)
            r9.a(r0)
            r6 = 0
            goto L_0x00ab
        L_0x0092:
            android.content.pm.PackageManager r9 = r8.getPackageManager()
            boolean r9 = defpackage.qnt.a(r9, r1)
            r7 = r9
            if (r9 != 0) goto L_0x009e
            goto L_0x00ab
        L_0x009e:
            r6 = 0
            goto L_0x00ab
        L_0x00a0:
            r6 = 0
            r7 = 1
            goto L_0x00ab
        L_0x00a3:
            java.lang.String r0 = "android.intent.extra.REPLACING"
            boolean r9 = r9.getBooleanExtra(r0, r7)
            r6 = r6 ^ r9
        L_0x00ab:
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 != 0) goto L_0x00ce
            if (r6 == 0) goto L_0x00c0
            qok r9 = defpackage.qok.a()
            qnx r0 = new qnx
            r0.<init>(r8, r1)
            r9.a(r0)
            return
        L_0x00c0:
            if (r7 == 0) goto L_0x00ce
            qok r9 = defpackage.qok.a()
            qnw r0 = new qnw
            r0.<init>(r8, r1)
            r9.a(r0)
        L_0x00ce:
            return
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
