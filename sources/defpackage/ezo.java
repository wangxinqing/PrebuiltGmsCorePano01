package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: ezo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezo implements fcu {
    public final Context a;
    public final String b;
    public final AuthorizationRequest c;
    public final int d;
    public final gck e;
    public final List f;
    private final String g;

    public ezo(Context context, String str, String str2, AuthorizationRequest authorizationRequest) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        this.b = str;
        iva.c(str2);
        this.g = str2;
        iva.a((Object) authorizationRequest);
        this.c = authorizationRequest;
        this.d = jhg.i(context.getApplicationContext(), str);
        this.e = pzx.a(context.getApplicationContext());
        this.f = authorizationRequest.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r1.endsWith(r0.length() == 0 ? new java.lang.String("@") : "@".concat(r0)) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(defpackage.fde r5) {
        /*
            r4 = this;
            com.google.android.gms.auth.api.identity.AuthorizationRequest r5 = r4.c
            android.accounts.Account r5 = r5.e
            if (r5 != 0) goto L_0x000e
            android.content.Context r5 = r4.a
            java.lang.String r0 = r4.b
            android.accounts.Account r5 = defpackage.jgu.b(r5, r0)
        L_0x000e:
            if (r5 == 0) goto L_0x007d
            com.google.android.gms.auth.api.identity.AuthorizationRequest r0 = r4.c
            java.lang.String r0 = r0.f
            android.content.Context r1 = r4.a
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = r4.b
            boolean r1 = defpackage.jgu.b((android.content.Context) r1, (android.accounts.Account) r5, (java.lang.String) r2)
            if (r1 != 0) goto L_0x0023
            goto L_0x0054
        L_0x0023:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0066
            java.lang.String r1 = r5.name
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "@"
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0049
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x004d
        L_0x0049:
            java.lang.String r0 = r2.concat(r0)
        L_0x004d:
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0054
            goto L_0x0066
        L_0x0054:
            com.google.android.gms.auth.api.identity.AuthorizationRequest r5 = r4.c
            android.accounts.Account r5 = r5.e
            if (r5 != 0) goto L_0x005f
            aorr r5 = r4.b()
            return r5
        L_0x005f:
            r5 = 28433(0x6f11, float:3.9843E-41)
            qbf r5 = defpackage.qbf.a((int) r5)
            throw r5
        L_0x0066:
            ezm r0 = new ezm
            r0.<init>(r4, r5)
            aoqm r5 = defpackage.aoqm.a
            aorr r5 = defpackage.aorl.a((java.util.concurrent.Callable) r0, (java.util.concurrent.Executor) r5)
            ezl r0 = new ezl
            r0.<init>(r4)
            aoqm r1 = defpackage.aoqm.a
            aorr r5 = defpackage.aopr.a((defpackage.aorr) r5, (defpackage.aoqb) r0, (java.util.concurrent.Executor) r1)
            return r5
        L_0x007d:
            aorr r5 = r4.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezo.a(fde):aorr");
    }

    public final aorr b() {
        int i;
        AuthorizationRequest authorizationRequest = this.c;
        String str = this.g;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.AUTHORIZATION").setPackage("com.google.android.gms");
        ivy.a((SafeParcelable) authorizationRequest, intent, "authorization_request");
        intent.putExtra("session_id", str);
        Context context = this.a;
        if (!jkr.b()) {
            i = 1207959552;
        } else {
            i = 1275068416;
        }
        return aorl.a((Object) new AuthorizationResult((String) null, (String) null, (String) null, amzy.h(), (GoogleSignInAccount) null, jhg.a(context, intent, i)));
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_AUTHORIZE;
    }
}
