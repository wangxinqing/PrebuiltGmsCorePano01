package com.google.firebase.auth.api.gms.ui;

import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserSignInResponseHandlerChimeraActivity extends Activity {
    private static final iwd a = new iwd("FirebaseAuth", "IdpResponseHandler");

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.String r0 = "link"
            java.lang.String r1 = "firebaseError"
            java.lang.String r2 = "cpn"
            java.lang.String r3 = "SignInCompleteActivity"
            super.onCreate(r14)
            boolean r14 = defpackage.axic.b()
            r4 = 0
            if (r14 == 0) goto L_0x01b1
            iwd r14 = a
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Activity enabled. Continuing"
            r14.a(r6, r5)
            r14 = 0
            android.content.Intent r5 = r13.getIntent()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            android.net.Uri r5 = r5.getData()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            iwd r6 = a     // Catch:{ UnsupportedOperationException -> 0x0130 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ UnsupportedOperationException -> 0x0130 }
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            int r10 = r10.length()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            int r10 = r10 + 4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0130 }
            r11.<init>(r10)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            java.lang.String r10 = "uri:"
            r11.append(r10)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            r11.append(r9)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            java.lang.String r9 = r11.toString()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            r8[r4] = r9     // Catch:{ UnsupportedOperationException -> 0x0130 }
            r6.a(r3, r8)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            if (r5 == 0) goto L_0x012c
            java.util.Set r6 = r5.getQueryParameterNames()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            boolean r8 = r6.contains(r2)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            if (r8 == 0) goto L_0x0128
            java.lang.String r2 = r5.getQueryParameter(r2)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            iwd r8 = a     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.String r10 = "package name (cpn): "
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            int r12 = r11.length()     // Catch:{ UnsupportedOperationException -> 0x0126 }
            if (r12 != 0) goto L_0x0073
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r11.<init>(r10)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            goto L_0x0077
        L_0x0073:
            java.lang.String r11 = r10.concat(r11)     // Catch:{ UnsupportedOperationException -> 0x0126 }
        L_0x0077:
            r9[r4] = r11     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r8.a(r3, r9)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            boolean r8 = r6.contains(r1)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r9 = 603979776(0x24000000, float:2.7755576E-17)
            java.lang.String r10 = "com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED"
            if (r8 == 0) goto L_0x00ad
            java.lang.String r0 = r5.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.Class<com.google.firebase.auth.internal.FederatedSignInActivity> r3 = com.google.firebase.auth.internal.FederatedSignInActivity.class
            r1.<init>(r13, r3)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r1.setPackage(r2)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.Class<com.google.firebase.auth.internal.FederatedSignInActivity> r3 = com.google.firebase.auth.internal.FederatedSignInActivity.class
            java.lang.String r3 = r3.getName()     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r1.setClassName(r2, r3)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r1.setAction(r10)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r1.addFlags(r9)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            com.google.android.gms.common.api.Status r0 = defpackage.apvy.a((java.lang.String) r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            defpackage.apvy.a(r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r14 = r1
            goto L_0x0125
        L_0x00ad:
            boolean r1 = r6.contains(r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            if (r1 == 0) goto L_0x0124
            java.lang.String r0 = r5.getQueryParameter(r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            iwd r1 = a     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.String r7 = "idpResponseUrl (link): "
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            int r11 = r8.length()     // Catch:{ UnsupportedOperationException -> 0x0126 }
            if (r11 != 0) goto L_0x00ce
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r8.<init>(r7)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            goto L_0x00d2
        L_0x00ce:
            java.lang.String r8 = r7.concat(r8)     // Catch:{ UnsupportedOperationException -> 0x0126 }
        L_0x00d2:
            r6[r4] = r8     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r1.a(r3, r6)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.String r1 = "eventId"
            java.lang.String r1 = r5.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.Class<com.google.firebase.auth.internal.FederatedSignInActivity> r5 = com.google.firebase.auth.internal.FederatedSignInActivity.class
            r3.<init>(r13, r5)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r3.setPackage(r2)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.Class<com.google.firebase.auth.internal.FederatedSignInActivity> r5 = com.google.firebase.auth.internal.FederatedSignInActivity.class
            java.lang.String r5 = r5.getName()     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r3.setClassName(r2, r5)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r3.addFlags(r9)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            if (r0 != 0) goto L_0x00f6
            goto L_0x011e
        L_0x00f6:
            if (r1 == 0) goto L_0x011e
            apvq r1 = defpackage.apvr.a(r13, r2, r1)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            if (r1 == 0) goto L_0x0119
            com.google.firebase.auth.api.model.VerifyAssertionRequest r5 = new com.google.firebase.auth.api.model.VerifyAssertionRequest     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r5.<init>(r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.String r0 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r5, (android.content.Intent) r3, (java.lang.String) r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.String r0 = "com.google.firebase.auth.internal.OPERATION"
            java.lang.String r5 = r1.b     // Catch:{ UnsupportedOperationException -> 0x0126 }
            r3.putExtra(r0, r5)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            java.lang.String r0 = r1.d     // Catch:{ UnsupportedOperationException -> 0x0126 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r1 = "com.google.firebase.auth.internal.EXTRA_TENANT_ID"
            r3.putExtra(r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0126 }
        L_0x0118:
            goto L_0x0122
        L_0x0119:
            r3.setAction(r10)     // Catch:{ UnsupportedOperationException -> 0x0126 }
            goto L_0x0122
        L_0x011e:
            r3.setAction(r10)     // Catch:{ UnsupportedOperationException -> 0x0126 }
        L_0x0122:
            r14 = r3
            goto L_0x0125
        L_0x0124:
        L_0x0125:
            goto L_0x0153
        L_0x0126:
            r0 = move-exception
            goto L_0x0132
        L_0x0128:
            r13.finish()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            return
        L_0x012c:
            r13.finish()     // Catch:{ UnsupportedOperationException -> 0x0130 }
            return
        L_0x0130:
            r0 = move-exception
            r2 = r14
        L_0x0132:
            iwd r1 = a
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Error parsing url: "
            int r5 = r0.length()
            if (r5 != 0) goto L_0x014a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x014e
        L_0x014a:
            java.lang.String r0 = r3.concat(r0)
        L_0x014e:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r1.e(r0, r3)
        L_0x0153:
            axii r0 = defpackage.axii.a
            axij r0 = r0.a()
            boolean r0 = r0.a()
            java.lang.String r1 = "FederatedSignInActivity not found in package: "
            if (r0 != 0) goto L_0x0187
            if (r14 == 0) goto L_0x0183
            r13.startActivity(r14)     // Catch:{ ActivityNotFoundException -> 0x0167 }
            goto L_0x0183
        L_0x0167:
            r14 = move-exception
            iwd r14 = a
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x017a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x017e
        L_0x017a:
            java.lang.String r0 = r1.concat(r0)
        L_0x017e:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r14.e(r0, r1)
        L_0x0183:
            r13.finish()
            return
        L_0x0187:
            if (r14 == 0) goto L_0x01ad
            r13.startActivity(r14)     // Catch:{ ActivityNotFoundException -> 0x018d }
            return
        L_0x018d:
            r14 = move-exception
            iwd r14 = a
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x01a0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x01a4
        L_0x01a0:
            java.lang.String r0 = r1.concat(r0)
        L_0x01a4:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r14.e(r0, r1)
            r13.finish()
            return
        L_0x01ad:
            r13.finish()
            return
        L_0x01b1:
            iwd r14 = a
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "Activity disabled. Finishing"
            r14.a(r1, r0)
            r13.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.gms.ui.BrowserSignInResponseHandlerChimeraActivity.onCreate(android.os.Bundle):void");
    }
}
