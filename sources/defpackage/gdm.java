package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.uiflows.addaccount.AccountIntroChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.StartAddAccountSessionController;
import com.google.android.gms.auth.uiflows.confirmcredentials.ConfirmCredentialsController;
import com.google.android.gms.auth.uiflows.controller.ControllerLauncherChimeraActivity;
import com.google.android.gms.auth.uiflows.gettoken.GetTokenController;
import com.google.android.gms.auth.uiflows.updatecredentials.UpdateCredentialsController;
import java.util.List;
import java.util.UUID;

/* renamed from: gdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gdm extends bhw implements gdn {
    public final Context a;
    private final boolean b;
    private final eny c;

    public gdm() {
        super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
    }

    private final PendingIntent a(Intent intent, String str) {
        String valueOf = String.valueOf(str);
        intent.addCategory(valueOf.length() == 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf));
        return PendingIntent.getActivity(this.a, 0, intent, 0);
    }

    public final PendingIntent b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        if (this.b) {
            return a(ControllerLauncherChimeraActivity.a(this.a, new UpdateCredentialsController(updateCredentialsWorkflowRequest.f, updateCredentialsWorkflowRequest.e, ijn.a(updateCredentialsWorkflowRequest.a()), false)), UUID.randomUUID().toString());
        }
        throw new UnsupportedOperationException();
    }

    public gdm(Context context) {
        super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
        this.a = context;
        int i = Build.VERSION.SDK_INT;
        this.b = true;
        this.c = (eny) eny.a.b();
    }

    public final PendingIntent a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        if (jkr.a()) {
            Context context = this.a;
            AccountAuthenticatorResponse accountAuthenticatorResponse = accountRemovalAllowedWorkflowRequest.a;
            Account account = accountRemovalAllowedWorkflowRequest.b;
            return a(new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity").putExtra("am_response", accountAuthenticatorResponse).putExtra("account", account).putExtra("show_lock_screen", accountRemovalAllowedWorkflowRequest.c), UUID.randomUUID().toString());
        }
        throw new UnsupportedOperationException();
    }

    public final PendingIntent a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        if (this.b) {
            return a(ControllerLauncherChimeraActivity.a(this.a, new ConfirmCredentialsController(confirmCredentialsWorkflowRequest.f, confirmCredentialsWorkflowRequest.e, false, ijn.a(new Bundle(confirmCredentialsWorkflowRequest.d)))), UUID.randomUUID().toString());
        }
        throw new UnsupportedOperationException();
    }

    public Intent b(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        String[] strArr;
        boolean z;
        SetupAccountWorkflowRequest setupAccountWorkflowRequest2 = setupAccountWorkflowRequest;
        PendingIntent pendingIntent = (PendingIntent) setupAccountWorkflowRequest.b().getParcelable("pendingIntent");
        String string = setupAccountWorkflowRequest.b().getString(eig.b);
        List a2 = setupAccountWorkflowRequest.a();
        if (a2 != null) {
            strArr = (String[]) a2.toArray(new String[a2.size()]);
        } else {
            strArr = new String[0];
        }
        Context context = this.a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = setupAccountWorkflowRequest2.i;
        String str = setupAccountWorkflowRequest2.h;
        boolean z2 = setupAccountWorkflowRequest2.c;
        boolean z3 = setupAccountWorkflowRequest2.k;
        ijn a3 = ijn.a(setupAccountWorkflowRequest2.e);
        if ("cn.google".equals(setupAccountWorkflowRequest2.h) || setupAccountWorkflowRequest2.j) {
            z = true;
        } else {
            z = false;
        }
        return AccountIntroChimeraActivity.a(context, accountAuthenticatorResponse, str, z2, z3, a3, z, setupAccountWorkflowRequest2.n, setupAccountWorkflowRequest2.l, setupAccountWorkflowRequest2.m, strArr, pendingIntent, string, setupAccountWorkflowRequest2.o, setupAccountWorkflowRequest2.p, setupAccountWorkflowRequest2.q, setupAccountWorkflowRequest2.r, setupAccountWorkflowRequest2.s, setupAccountWorkflowRequest2.t, D2dOptions.a(setupAccountWorkflowRequest2.e));
    }

    public PendingIntent a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        if (jkr.c()) {
            finishSessionWorkflowRequest.a();
            return a(FinishSessionChimeraActivity.a(this.a, finishSessionWorkflowRequest.d, finishSessionWorkflowRequest.c, finishSessionWorkflowRequest.a()), UUID.randomUUID().toString());
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.PendingIntent a(com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.h
            int r1 = r0.hashCode()
            r2 = -2011849543(0xffffffff88159cb9, float:-4.5022283E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 816462108(0x30aa391c, float:1.2385359E-9)
            if (r1 == r2) goto L_0x0022
            r2 = 879034182(0x3464ff46, float:2.1327023E-7)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "com.google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "cn.google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "com.google.work"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0056
            if (r0 == r4) goto L_0x0046
            if (r0 != r3) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "No account type."
            r12.<init>(r0)
            throw r12
        L_0x0046:
            boolean r0 = r11.b
            if (r0 == 0) goto L_0x0050
            android.content.Intent r12 = r11.b((com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest) r12)
            goto L_0x0179
        L_0x0050:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        L_0x0056:
            boolean r0 = r11.b
            if (r0 != 0) goto L_0x0175
            android.content.Context r1 = r11.a
            android.accounts.AccountAuthenticatorResponse r2 = r12.i
            java.util.Locale r0 = java.util.Locale.getDefault()
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            android.content.Context r4 = r11.a
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.provider.Settings.System.getConfiguration(r4, r3)
            android.content.Context r4 = r11.a
            r5 = 0
            java.lang.String r6 = "device_country"
            java.lang.String r4 = defpackage.iqi.a(r4, r6, r5)
            java.lang.String r5 = r0.getLanguage()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r6 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "&lang="
            int r8 = r6.length()
            if (r8 != 0) goto L_0x0093
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0097
        L_0x0093:
            java.lang.String r6 = r7.concat(r6)
        L_0x0097:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r7)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r5)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r7 = r7 + 14
            int r7 = r7 + r8
            int r7 = r7 + r9
            r10.<init>(r7)
            r10.append(r6)
            java.lang.String r6 = "&langCountry="
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = "_"
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            int r5 = r3.mcc
            if (r5 == 0) goto L_0x010e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r3.mcc
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 5
            int r5 = r5 + r6
            r7.<init>(r5)
            r7.append(r0)
            java.lang.String r0 = "&mcc="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
        L_0x010e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "&xoauth_display_name=Android%20Phone"
            java.lang.String r0 = r0.concat(r3)
            if (r4 == 0) goto L_0x0141
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r5 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 4
            int r3 = r3 + r5
            r6.<init>(r3)
            r6.append(r0)
            java.lang.String r0 = "&cc="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
        L_0x0141:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 58
            r4.<init>(r3)
            java.lang.String r3 = "https://accounts.google.com/o/android/auth?&source=android"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "&tmpl=new_account"
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r4 = r12.h
            java.lang.String r5 = r12.n
            android.os.Bundle r12 = r12.e
            ijn r6 = defpackage.ijn.a(r12)
            android.content.Intent r12 = com.google.android.gms.auth.uiflows.addaccount.BrowserSignInChimeraActivity.a((android.content.Context) r1, (android.accounts.AccountAuthenticatorResponse) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (defpackage.ijn) r6)
            goto L_0x0179
        L_0x0175:
            android.content.Intent r12 = r11.b((com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest) r12)
        L_0x0179:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            android.app.PendingIntent r12 = r11.a(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdm.a(com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest):android.app.PendingIntent");
    }

    public PendingIntent a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        String[] strArr;
        StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest2 = startAddAccountSessionWorkflowRequest;
        if (!jkr.c()) {
            throw new UnsupportedOperationException();
        } else if ("com.google".equals(startAddAccountSessionWorkflowRequest2.e) || "com.google.work".equals(startAddAccountSessionWorkflowRequest2.e)) {
            String string = startAddAccountSessionWorkflowRequest.b().getString(eig.b);
            List a2 = startAddAccountSessionWorkflowRequest.a();
            if (a2 != null) {
                strArr = (String[]) a2.toArray(new String[a2.size()]);
            } else {
                strArr = new String[0];
            }
            return a(ControllerLauncherChimeraActivity.a(this.a, new StartAddAccountSessionController(startAddAccountSessionWorkflowRequest2.f, startAddAccountSessionWorkflowRequest2.e, startAddAccountSessionWorkflowRequest2.g, startAddAccountSessionWorkflowRequest2.h, ijn.a(startAddAccountSessionWorkflowRequest.b()), startAddAccountSessionWorkflowRequest2.i, startAddAccountSessionWorkflowRequest2.j, strArr, string, (String) null, false, false, (String) null, (String) null, (String) null, (String) null)), UUID.randomUUID().toString());
        } else {
            throw new IllegalStateException("Account type is not supported.");
        }
    }

    public final PendingIntent a(TokenWorkflowRequest tokenWorkflowRequest) {
        Intent intent;
        if (!this.b) {
            Account account = tokenWorkflowRequest.i;
            ggi ggi = new ggi(new Bundle());
            boolean booleanValue = ((Boolean) this.c.a(account, eqb.i, false)).booleanValue();
            iwd iwd = DefaultAuthDelegateChimeraService.a;
            StringBuilder sb = new StringBuilder(23);
            sb.append("Use browser flow? ");
            sb.append(booleanValue);
            iwd.c(sb.toString(), new Object[0]);
            if (booleanValue) {
                ggi.b("https://accounts.google.com/o/android/auth?");
            }
            ggi.a.putInt("request_type", 1);
            ggi.a.putParcelable("calling_app_description", tokenWorkflowRequest.h);
            ggi.a(account);
            ggi.a.putString("service", tokenWorkflowRequest.b);
            ggi.a.putBundle("options", tokenWorkflowRequest.a());
            ggi.a.putBoolean("suppress_progress_screen", tokenWorkflowRequest.g);
            ggi.a(tokenWorkflowRequest.f);
            ggi.a(tokenWorkflowRequest.e);
            intent = new Intent().setClassName(this.a.getApplicationContext(), "com.google.android.gms.auth.login.LoginActivity").putExtras(ggi.a);
        } else {
            Bundle a2 = tokenWorkflowRequest.a();
            boolean z = a2.getBoolean("UseCache");
            TokenRequest tokenRequest = new TokenRequest(tokenWorkflowRequest.i, tokenWorkflowRequest.b);
            tokenRequest.f = tokenWorkflowRequest.f;
            tokenRequest.m = z;
            tokenRequest.a(a2);
            tokenRequest.j = tokenWorkflowRequest.h;
            if (awmw.a.a().a()) {
                intent = pzt.a(this.a, tokenRequest);
            } else {
                intent = ControllerLauncherChimeraActivity.a(this.a, new GetTokenController(tokenWorkflowRequest.j, tokenRequest, tokenWorkflowRequest.g, false, ijn.a(tokenWorkflowRequest.a()), 0));
            }
        }
        return a(intent, UUID.randomUUID().toString());
    }

    public PendingIntent a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        if (jkr.c()) {
            Account account = updateCredentialsWorkflowRequest.e;
            if (account != null) {
                return a(ControllerLauncherChimeraActivity.a(this.a, new UpdateCredentialsController(updateCredentialsWorkflowRequest.f, account, ijn.a(updateCredentialsWorkflowRequest.a()), true)), UUID.randomUUID().toString());
            }
            throw new IllegalStateException("Account is required to update credentials.");
        }
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                PendingIntent a2 = a((SetupAccountWorkflowRequest) bhx.a(parcel, SetupAccountWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a2);
                return true;
            case 2:
                PendingIntent a3 = a((TokenWorkflowRequest) bhx.a(parcel, TokenWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a3);
                return true;
            case 3:
                PendingIntent b2 = b((UpdateCredentialsWorkflowRequest) bhx.a(parcel, UpdateCredentialsWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, b2);
                return true;
            case 4:
                PendingIntent a4 = a((ConfirmCredentialsWorkflowRequest) bhx.a(parcel, ConfirmCredentialsWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a4);
                return true;
            case 5:
                PendingIntent a5 = a((StartAddAccountSessionWorkflowRequest) bhx.a(parcel, StartAddAccountSessionWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a5);
                return true;
            case 6:
                PendingIntent a6 = a((UpdateCredentialsWorkflowRequest) bhx.a(parcel, UpdateCredentialsWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a6);
                return true;
            case 7:
                PendingIntent a7 = a((FinishSessionWorkflowRequest) bhx.a(parcel, FinishSessionWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a7);
                return true;
            case 8:
                PendingIntent a8 = a((AccountRemovalAllowedWorkflowRequest) bhx.a(parcel, AccountRemovalAllowedWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a8);
                return true;
            default:
                return false;
        }
    }
}
