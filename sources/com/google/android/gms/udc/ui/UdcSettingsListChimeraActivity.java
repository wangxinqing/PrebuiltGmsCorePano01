package com.google.android.gms.udc.ui;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcSettingsListChimeraActivity extends bjs {
    private static final jjg a = jjg.a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.google.android.gms.identity.accounts.api.AccountData} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.view.View r8 = new android.view.View
            r8.<init>(r7)
            r7.setContentView((android.view.View) r8)
            java.lang.String r8 = "com.google.android.gms.udc.ui.UdcSettingsListChimeraActivity"
            java.lang.String r0 = "onCreate"
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r2 = r7.isFinishing()
            if (r2 != 0) goto L_0x00e2
            boolean r2 = r7.isChangingConfigurations()
            if (r2 != 0) goto L_0x00e2
            r2 = 0
            defpackage.jhg.c((com.google.android.chimera.Activity) r7)     // Catch:{ SecurityException -> 0x00c2 }
            android.content.Intent r3 = r7.getIntent()
            if (r3 == 0) goto L_0x00a6
            int r4 = defpackage.pxz.b     // Catch:{ ActivityNotFoundException -> 0x0086 }
            boolean r4 = defpackage.pya.a(r7, r3)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            r5 = 0
            if (r4 == 0) goto L_0x0050
            java.lang.String r4 = "Context must not be null."
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r4)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            java.lang.String r4 = "Intent must not be null."
            defpackage.iva.a((java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            boolean r4 = defpackage.pya.a(r7, r3)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = "com.google.android.gms.accounts.ACCOUNT_DATA"
            android.os.Parcelable$Creator r5 = com.google.android.gms.identity.accounts.api.AccountData.CREATOR     // Catch:{ ActivityNotFoundException -> 0x0086 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.ivy.a((android.content.Intent) r3, (java.lang.String) r4, (android.os.Parcelable.Creator) r5)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            r5 = r4
            com.google.android.gms.identity.accounts.api.AccountData r5 = (com.google.android.gms.identity.accounts.api.AccountData) r5     // Catch:{ ActivityNotFoundException -> 0x0086 }
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            java.lang.String r5 = r5.a     // Catch:{ ActivityNotFoundException -> 0x0086 }
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            if (r5 == 0) goto L_0x0079
            java.lang.String r4 = "ClientRequestExtra"
            android.os.Parcelable r3 = r3.getParcelableExtra(r4)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            com.google.android.gms.udc.UdcSettingsListActivityRequest r3 = (com.google.android.gms.udc.UdcSettingsListActivityRequest) r3     // Catch:{ ActivityNotFoundException -> 0x0086 }
            if (r3 == 0) goto L_0x0074
            boolean r4 = r3.a()     // Catch:{ ActivityNotFoundException -> 0x0086 }
            if (r4 == 0) goto L_0x0074
            java.lang.String r4 = "me"
            java.lang.String r6 = r3.a     // Catch:{ ActivityNotFoundException -> 0x0086 }
            boolean r4 = r4.equalsIgnoreCase(r6)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            if (r4 != 0) goto L_0x0074
            java.lang.String r3 = r3.a     // Catch:{ ActivityNotFoundException -> 0x0086 }
            android.content.Intent r3 = defpackage.adhu.a(r7, r5, r3)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            goto L_0x007d
        L_0x0074:
            android.content.Intent r3 = defpackage.adhu.a(r5)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            goto L_0x007d
        L_0x0079:
            android.content.Intent r3 = defpackage.adhu.a()     // Catch:{ ActivityNotFoundException -> 0x0086 }
        L_0x007d:
            r7.startActivityForResult(r3, r2)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            r3 = -1
            r7.setResult(r3)     // Catch:{ ActivityNotFoundException -> 0x0086 }
            goto L_0x00a2
        L_0x0086:
            r3 = move-exception
            jjg r4 = a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r3)
            r3 = 66
            anie r8 = r4.a((java.lang.String) r8, (java.lang.String) r0, (int) r3, (java.lang.String) r1)
            anih r8 = (defpackage.anih) r8
            java.lang.String r0 = "Account settings activity not found."
            r8.a((java.lang.String) r0)
            r7.setResult(r2)
        L_0x00a2:
            r7.finish()
            return
        L_0x00a6:
            jjg r3 = a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r4 = 54
            anie r8 = r3.a((java.lang.String) r8, (java.lang.String) r0, (int) r4, (java.lang.String) r1)
            anih r8 = (defpackage.anih) r8
            java.lang.String r0 = "No intent found."
            r8.a((java.lang.String) r0)
            r7.setResult(r2)
            r7.finish()
            return
        L_0x00c2:
            r3 = move-exception
            jjg r4 = a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r3)
            r3 = 45
            anie r8 = r4.a((java.lang.String) r8, (java.lang.String) r0, (int) r3, (java.lang.String) r1)
            anih r8 = (defpackage.anih) r8
            java.lang.String r0 = "Non-google signed package forbidden to access this Activity"
            r8.a((java.lang.String) r0)
            r7.setResult(r2)
            r7.finish()
            return
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.ui.UdcSettingsListChimeraActivity.onCreate(android.os.Bundle):void");
    }
}
