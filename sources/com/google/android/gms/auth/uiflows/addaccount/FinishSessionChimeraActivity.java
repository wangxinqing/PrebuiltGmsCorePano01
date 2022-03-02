package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FinishSessionChimeraActivity extends Activity {
    static final fzk a = fzk.a("am_response");
    static final fzk b = fzk.a("session_type");
    static final fzk c = fzk.a("is_setup_wizard");
    static final fzk d = fzk.a("use_immersive_mode");
    static final fzk e = fzk.a("ui_parameters");
    static final fzk f = fzk.a("auth_code");
    static final fzk g = fzk.a("obfuscated_gaia_id");
    static final fzk h = fzk.a("terms_of_service_accepted");
    static final fzk i = fzk.a("is_new_account");
    static final fzk j = fzk.a("account");
    static final fzk k = fzk.a("account_type");
    static final fzk l = fzk.a("account_name");
    private static final iwd m = ehv.a("FinishSessionChimeraActivity");
    private static final fzk n = fzk.a("accountSessionBundle");
    private AccountAuthenticatorResponse o;

    public static Intent a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, Bundle bundle) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity");
        fzl fzl = new fzl();
        fzl.b(a, accountAuthenticatorResponse);
        fzl.b(k, str);
        fzl.b(n, bundle);
        return className.putExtras(fzl.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r0 = r25
            super.onCreate(r26)
            android.content.Intent r1 = r25.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            fzl r2 = new fzl
            r2.<init>(r1)
            fzk r1 = a
            java.lang.Object r1 = r2.a(r1)
            android.accounts.AccountAuthenticatorResponse r1 = (android.accounts.AccountAuthenticatorResponse) r1
            r0.o = r1
            fzk r1 = n
            java.lang.Object r1 = r2.a(r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "Session bundle cannot be null!"
            iwd r2 = m
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.d(r1, r3)
            r0.a(r1)
            return
        L_0x0034:
            android.accounts.AccountAuthenticatorResponse r5 = r0.o
            fzl r2 = new fzl
            r2.<init>(r1)
            fzk r3 = b
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "finish_add_account_session_type"
            boolean r4 = r3.equals(r2)
            r15 = 0
            if (r4 != 0) goto L_0x009f
            java.lang.String r3 = "finish_update_credentials_session_type"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x009c
            fzl r2 = new fzl
            r2.<init>(r1)
            fzk r1 = b
            java.lang.Object r1 = r2.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x009c
            fzk r1 = d
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            fzk r1 = f
            java.lang.Object r1 = r2.a(r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            fzk r1 = e
            java.lang.Object r1 = r2.a(r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            ijn r8 = defpackage.ijn.a(r1)
            fzk r1 = j
            java.lang.Object r1 = r2.a(r1)
            r6 = r1
            android.accounts.Account r6 = (android.accounts.Account) r6
            com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController r1 = new com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = r15
            r15 = r1
            goto L_0x0130
        L_0x009c:
            r3 = r15
            goto L_0x0130
        L_0x009f:
            fzl r2 = new fzl
            r2.<init>(r1)
            fzk r1 = b
            java.lang.Object r1 = r2.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x012f
            fzk r1 = k
            java.lang.Object r1 = r2.a(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            fzk r1 = l
            java.lang.Object r1 = r2.a(r1)
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            fzk r1 = d
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r8 = r1.booleanValue()
            fzk r1 = f
            java.lang.Object r1 = r2.a(r1)
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            fzk r1 = e
            java.lang.Object r1 = r2.a(r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            ijn r9 = defpackage.ijn.a(r1)
            fzk r1 = c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            fzk r1 = g
            java.lang.Object r1 = r2.a(r1)
            r12 = r1
            java.lang.String r12 = (java.lang.String) r12
            fzk r1 = h
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = r1.booleanValue()
            fzk r1 = i
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController r1 = new com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController
            r4 = r1
            r2 = 0
            r3 = r15
            r15 = r2
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15 = r1
            goto L_0x0130
        L_0x012f:
            r3 = r15
        L_0x0130:
            if (r15 == 0) goto L_0x013d
            gnw r1 = r15.a(r3)
            defpackage.gnx.a((com.google.android.chimera.Activity) r0, (com.google.android.gms.auth.uiflows.controller.Controller) r15, (defpackage.gnw) r1)
            r25.finish()
            return
        L_0x013d:
            java.lang.String r1 = "Failed to create controller from session bundle!"
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public static Bundle a(boolean z, ijn ijn, String str, Account account) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(d.a, z);
        bundle.putParcelable(e.a, ijn.a());
        bundle.putString(f.a, str);
        bundle.putParcelable(j.a, account);
        bundle.putString(b.a, "finish_update_credentials_session_type");
        return bundle;
    }

    public static Bundle a(boolean z, boolean z2, ijn ijn, String str, String str2, boolean z3, boolean z4, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(c.a, z);
        bundle.putBoolean(d.a, z2);
        bundle.putParcelable(e.a, ijn.a());
        bundle.putString(f.a, str);
        bundle.putString(g.a, str2);
        bundle.putBoolean(h.a, z3);
        bundle.putBoolean(i.a, z4);
        bundle.putString(k.a, str4);
        bundle.putString(l.a, str3);
        bundle.putString(b.a, "finish_add_account_session_type");
        return bundle;
    }

    private final void a(String str) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.o;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(8, str);
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", 8);
        intent.putExtra("errorMessage", str);
        setResult(0, intent);
        finish();
    }
}
