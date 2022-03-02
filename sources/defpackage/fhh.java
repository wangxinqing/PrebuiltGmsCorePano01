package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: fhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fhh implements fcu {
    private final Context a;
    private final String b;
    private final BeginSignInRequest c;
    private final InternalSignInCredentialWrapper d;

    public fhh(Context context, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        this.b = str;
        iva.a((Object) beginSignInRequest);
        this.c = beginSignInRequest;
        iva.a((Object) internalSignInCredentialWrapper);
        this.d = internalSignInCredentialWrapper;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(defpackage.fde r14) {
        /*
            r13 = this;
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r14 = r13.d
            com.google.android.gms.auth.api.identity.SignInCredential r14 = r14.g
            java.lang.String r14 = r14.f
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x001a
            com.google.android.gms.auth.api.identity.CompleteSignInResult r14 = new com.google.android.gms.auth.api.identity.CompleteSignInResult
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r0 = r13.d
            com.google.android.gms.auth.api.identity.SignInCredential r0 = r0.g
            r14.<init>(r0)
            aorr r14 = defpackage.aorl.a((java.lang.Object) r14)
            return r14
        L_0x001a:
            android.content.Context r14 = r13.a
            java.lang.String r0 = r13.b
            int r14 = defpackage.jhg.i(r14, r0)
            r0 = -1
            if (r14 == r0) goto L_0x0171
            android.content.Context r0 = r13.a
            gck r0 = defpackage.pzx.a(r0)
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r1 = r13.d
            boolean r1 = r1.a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x004f
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r1 = r13.d
            java.util.List r4 = r1.h
            com.google.android.gms.common.api.Scope r5 = com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper.d
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x004f
            java.util.List r1 = r1.h
            com.google.android.gms.common.api.Scope r4 = com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper.a
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x004d
            r1 = 1
            goto L_0x0050
        L_0x004d:
            r1 = 0
            goto L_0x0050
        L_0x004f:
            r1 = 1
        L_0x0050:
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r4 = r13.d
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x0076
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r4 = r13.d
            boolean r5 = r4.i
            if (r5 != 0) goto L_0x0076
            java.util.List r5 = r4.h
            com.google.android.gms.common.api.Scope r6 = com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper.e
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x0076
            java.util.List r4 = r4.h
            com.google.android.gms.common.api.Scope r5 = com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper.b
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0077
        L_0x0074:
            r4 = 0
            goto L_0x0077
        L_0x0076:
            r4 = 1
        L_0x0077:
            com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper r5 = r13.d
            android.accounts.Account r5 = r5.f
            com.google.android.gms.auth.api.identity.BeginSignInRequest r6 = r13.c
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r6 = r6.b
            java.lang.String r6 = r6.b
            defpackage.iva.a((java.lang.Object) r6)
            com.google.android.gms.auth.api.identity.BeginSignInRequest r7 = r13.c
            com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions r7 = r7.b
            java.lang.String r7 = r7.c
            qah r5 = defpackage.qah.a((android.accounts.Account) r5, (java.lang.String) r6)
            if (r7 == 0) goto L_0x00d1
            aucd r6 = r5.c
            aqlj r8 = defpackage.aqlj.c
            aucd r8 = r8.o()
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r8.c()
            r8.c = r2
        L_0x00a2:
            aucj r9 = r8.b
            aqlj r9 = (defpackage.aqlj) r9
            r7.getClass()
            int r10 = r9.a
            r3 = r3 | r10
            r9.a = r3
            r9.b = r7
            aucj r3 = r8.i()
            aqlj r3 = (defpackage.aqlj) r3
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            r6.c()
            r6.c = r2
        L_0x00c0:
            aucj r2 = r6.b
            aqll r2 = (defpackage.aqll) r2
            aqll r6 = defpackage.aqll.k
            r3.getClass()
            r2.h = r3
            int r3 = r2.a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.a = r3
        L_0x00d1:
            r2 = 5
            r5.a((int) r2)
            gda r2 = defpackage.gda.GRANTED
            r5.a((defpackage.gda) r2)
            java.lang.String r2 = r13.b
            r5.a((java.lang.String) r2, (int) r14)
            r5.a((boolean) r4)
            r5.b((boolean) r1)
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r14 = r5.a()
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r14 = r0.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r14)
            gei r0 = defpackage.gei.SUCCESS
            gei r1 = r14.b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0160
            com.google.android.gms.auth.TokenData r14 = r14.w
            if (r14 == 0) goto L_0x0160
            defpackage.iva.a((java.lang.Object) r14)
            java.lang.String r12 = r14.b
            amri r14 = defpackage.qae.a(r12)
            boolean r0 = r14.a()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r14 = r14.b()
            qad r14 = (defpackage.qad) r14
            if (r4 == 0) goto L_0x011f
            amri r0 = r14.e
            java.lang.String r1 = "Anonymous google account"
            java.lang.Object r0 = r0.a((java.lang.Object) r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0121
        L_0x011f:
            java.lang.String r0 = r14.a
        L_0x0121:
            r6 = r0
            com.google.android.gms.auth.api.identity.CompleteSignInResult r0 = new com.google.android.gms.auth.api.identity.CompleteSignInResult
            com.google.android.gms.auth.api.identity.SignInCredential r1 = new com.google.android.gms.auth.api.identity.SignInCredential
            amri r2 = r14.b
            java.lang.Object r2 = r2.c()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            amri r2 = r14.c
            java.lang.Object r2 = r2.c()
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            amri r2 = r14.d
            java.lang.Object r2 = r2.c()
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            amri r14 = r14.f
            java.lang.Object r14 = r14.c()
            r10 = r14
            android.net.Uri r10 = (android.net.Uri) r10
            r11 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.<init>(r1)
            aorr r14 = defpackage.aorl.a((java.lang.Object) r0)
            return r14
        L_0x0157:
            r14 = 8
            java.lang.String r0 = "Parsing the ID token failed"
            qbf r14 = defpackage.qbf.a(r0, r14)
            throw r14
        L_0x0160:
            qbe r14 = defpackage.qbf.a()
            r0 = 28404(0x6ef4, float:3.9802E-41)
            r14.c = r0
            java.lang.String r0 = "Failed to retrieve an ID token"
            r14.a = r0
            qbf r14 = r14.a()
            throw r14
        L_0x0171:
            r14 = 28442(0x6f1a, float:3.9856E-41)
            qbf r14 = defpackage.qbf.a((int) r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhh.a(fde):aorr");
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SIGN_IN;
    }
}
