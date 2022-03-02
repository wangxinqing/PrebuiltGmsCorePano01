package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;

/* renamed from: acou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acou extends AsyncTask {
    final /* synthetic */ AccountChallengeWebView a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private final Context g = this.a.getContext();

    public acou(AccountChallengeWebView accountChallengeWebView, String str, String str2) {
        this.a = accountChallengeWebView;
        this.b = str;
        iva.a((Object) str2, (Object) "authCode cannot be null.");
        this.c = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: acor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: acor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: acos} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: acor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: acor} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            java.lang.String r8 = r7.c
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r0 = 0
            if (r8 != 0) goto L_0x0019
            android.content.Context r8 = r7.g
            java.lang.String r1 = r7.b
            java.lang.String r2 = r7.c
            iwd r3 = com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView.a
            acor r3 = new acor
            r3.<init>(r8, r1, r2)
            goto L_0x0036
        L_0x0019:
            java.lang.String r8 = r7.d
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0035
            android.content.Context r2 = r7.g
            java.lang.String r3 = r7.b
            java.lang.String r4 = r7.d
            java.lang.String r5 = r7.e
            java.lang.String r6 = r7.f
            iwd r8 = com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView.a
            acos r8 = new acos
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r3 = r8
            goto L_0x0036
        L_0x0035:
            r3 = r0
        L_0x0036:
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView r8 = r7.a
            iwd r1 = com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView.a
            r8.g()
            com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView.a(r3)
            return r0
        L_0x0043:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Neither authCode nor credential were set"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acou.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        this.a.c();
    }

    public acou(AccountChallengeWebView accountChallengeWebView, String str, String str2, String str3, String str4) {
        this.a = accountChallengeWebView;
        this.b = str;
        iva.a((Object) str2, (Object) "credentials cannot be null.");
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
