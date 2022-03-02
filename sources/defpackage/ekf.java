package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.account.be.CreateBootstrapAssertionIntentOperation;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ekf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekf extends AbstractAccountAuthenticator {
    public static final iwd a = new iwd("GLSActivity", "GmsAccountAuthenticatorImpl");
    public static final Semaphore c = new Semaphore(0);
    public ExchangeAssertionsForUserCredentialsRequest b = null;
    private final Context d;
    private final ekh e;
    private final eny f;
    private final gbs g;
    private final eka h;
    private final eli i;
    private final fys j;
    private final fyg k;
    private final biv l;
    private final ejq m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ekf(android.content.Context r11) {
        /*
            r10 = this;
            android.content.Context r0 = r11.getApplicationContext()
            ekh r1 = defpackage.ekh.a
            fzi r2 = defpackage.eny.a
            java.lang.Object r2 = r2.b()
            eny r2 = (defpackage.eny) r2
            gck r3 = new gck
            r3.<init>(r11)
            eka r4 = new eka
            r4.<init>(r11)
            eli r5 = defpackage.eli.a((android.content.Context) r11)
            fzi r6 = defpackage.fys.d
            java.lang.Object r6 = r6.b()
            fys r6 = (defpackage.fys) r6
            fzi r7 = defpackage.fyg.d
            java.lang.Object r7 = r7.b()
            fyg r7 = (defpackage.fyg) r7
            ejq r8 = new ejq
            r8.<init>(r11)
            biv r9 = new biv
            r9.<init>(r11)
            r10.<init>(r0)
            r11 = 0
            r10.b = r11
            defpackage.iva.a((java.lang.Object) r0)
            r10.d = r0
            defpackage.iva.a((java.lang.Object) r1)
            r10.e = r1
            defpackage.iva.a((java.lang.Object) r2)
            r10.f = r2
            defpackage.iva.a((java.lang.Object) r3)
            r10.g = r3
            defpackage.iva.a((java.lang.Object) r4)
            r10.h = r4
            defpackage.iva.a((java.lang.Object) r5)
            r10.i = r5
            defpackage.iva.a((java.lang.Object) r6)
            r10.j = r6
            defpackage.iva.a((java.lang.Object) r7)
            r10.k = r7
            defpackage.iva.a((java.lang.Object) r8)
            r10.m = r8
            defpackage.iva.a((java.lang.Object) r9)
            r10.l = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekf.<init>(android.content.Context):void");
    }

    private final AppDescription a() {
        fyk fyk = new fyk(this.d);
        String uuid = UUID.randomUUID().toString();
        return new AppDescription(fyk.d, fyk.f, uuid, uuid);
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        boolean z;
        ManagedAuthOptions managedAuthOptions;
        String str3 = str;
        Bundle bundle2 = bundle;
        iva.a((Object) bundle);
        if ("com.google.work".equals(str3)) {
            int i2 = bundle2.getInt(eig.a, 0);
            if (!this.j.a(i2)) {
                a.c(String.format("uid %s cannot manage add accounts of type: %s", new Object[]{Integer.valueOf(i2), str3}), new Object[0]);
                Intent className = new Intent().setClassName(this.d, "com.google.android.gms.auth.uiflows.addaccount.CantAddWorkAccountActivity");
                ekb a2 = ekb.a();
                a2.a(this.d, className);
                return a2.b();
            }
        }
        AppDescription a3 = a();
        boolean z2 = bundle2.getBoolean("setupWizard", bundle2.getBoolean("firstRun", false));
        boolean z3 = bundle2.getBoolean("useImmersiveMode", false);
        boolean z4 = bundle2.getBoolean("suppress_device_to_device_setup", false);
        String string = bundle2.getString("authAccount");
        String string2 = bundle2.getString("purchaser_gaia_email");
        String string3 = bundle2.getString("purchaser_name");
        String[] stringArray = bundle2.getStringArray("allowed_domains");
        String string4 = bundle2.getString("minute_maid_login_template");
        boolean z5 = bundle2.getBoolean("resolve_frp_only", false);
        boolean z6 = bundle2.getBoolean("suppress_google_services");
        boolean z7 = bundle2.getBoolean("suppress_account_provisioning", false);
        boolean z8 = bundle2.getBoolean("suppress_backup_opt_in", false);
        ManagedAuthOptions a4 = ManagedAuthOptions.a(bundle2.getByteArray("managed_auth_options"));
        if (!z2) {
            managedAuthOptions = a4;
            z = z8;
        } else {
            if (stringArray != null) {
                managedAuthOptions = a4;
                if (stringArray.length > 0) {
                    z = z8;
                    this.m.a(new HashSet(Arrays.asList(stringArray)));
                }
            } else {
                managedAuthOptions = a4;
            }
            z = z8;
        }
        String string5 = bundle2.getString("password");
        if (!TextUtils.isEmpty(string5)) {
            AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
            accountSignInRequest.d = z2;
            accountSignInRequest.c = bundle2.getBoolean("created", false);
            accountSignInRequest.b = a3;
            AccountCredentials accountCredentials = new AccountCredentials(str3);
            accountCredentials.b = bundle2.getBoolean("useBrowser");
            if (string5.startsWith("code:")) {
                accountCredentials.e = string5.substring(5);
            } else {
                String string6 = bundle2.getString("username");
                accountCredentials.c = string6;
                Collection<String> a5 = this.m.a();
                if (a5 != null) {
                    for (String valueOf : a5) {
                        String valueOf2 = String.valueOf(valueOf);
                        if (string6.endsWith(valueOf2.length() == 0 ? new String("@") : "@".concat(valueOf2))) {
                        }
                    }
                    ekb a6 = ekb.a();
                    a6.a(8, "Domain not allowed");
                    return a6.b();
                }
                if (jgu.b(this.d, new Account(string6, str3), this.d.getPackageName())) {
                    ekb a7 = ekb.a();
                    a7.a(8, "Account does not exist or not visible. Maybe change pwd?");
                    return a7.b();
                } else if (string5.startsWith("oauth1:")) {
                    accountCredentials.d = string5.substring(7);
                } else {
                    accountCredentials.f = string5;
                }
            }
            accountSignInRequest.f = accountCredentials;
            TokenResponse a8 = this.g.a(accountSignInRequest);
            if (a8.b() == gei.SUCCESS) {
                ekb a9 = ekb.a();
                a9.a(a8.u);
                return a9.b();
            }
            ekb a10 = ekb.a();
            String valueOf3 = String.valueOf(a8.b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 27);
            sb.append("Sign in failed with status ");
            sb.append(valueOf3);
            a10.a(8, sb.toString());
            return a10.b();
        }
        boolean z9 = bundle2.getBoolean("hasMultipleUsers", false);
        eka eka = this.h;
        SetupAccountWorkflowRequest setupAccountWorkflowRequest = new SetupAccountWorkflowRequest(a3, str3);
        setupAccountWorkflowRequest.i = accountAuthenticatorResponse;
        Collection a11 = this.m.a();
        if (a11 != null) {
            setupAccountWorkflowRequest.d = new ArrayList(a11);
        } else {
            setupAccountWorkflowRequest.d = null;
        }
        setupAccountWorkflowRequest.c = z2;
        setupAccountWorkflowRequest.k = z3;
        setupAccountWorkflowRequest.j = z4;
        setupAccountWorkflowRequest.n = string;
        setupAccountWorkflowRequest.l = string2;
        setupAccountWorkflowRequest.m = string3;
        setupAccountWorkflowRequest.b = z9;
        setupAccountWorkflowRequest.e.clear();
        if (bundle2 != null) {
            setupAccountWorkflowRequest.e.putAll(bundle2);
        }
        setupAccountWorkflowRequest.o = string4;
        setupAccountWorkflowRequest.p = z5;
        setupAccountWorkflowRequest.q = z6;
        setupAccountWorkflowRequest.r = z7;
        setupAccountWorkflowRequest.s = z;
        setupAccountWorkflowRequest.t = managedAuthOptions;
        PendingIntent a12 = eka.a(setupAccountWorkflowRequest);
        ekb a13 = ekb.a();
        a13.a(a12);
        return a13.b();
    }

    public final Bundle addAccountFromCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        a.c("addAccountFromCredentials: %s", iwd.a((Object) account));
        this.k.a();
        if (((Boolean) ((gck) this.g).a((gcj) new gbz(account.name, bundle))).booleanValue()) {
            a.b("addAccountFromCredentials: account add successful", new Object[0]);
            this.k.b();
            ekb a2 = ekb.a();
            a2.a(true);
            return a2.b();
        }
        a.e("addAccountFromCredentials: account add failed", new Object[0]);
        ekb a3 = ekb.a();
        a3.a(false);
        return a3.b();
    }

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        String str;
        boolean z = true;
        a.c("confirmCredentials invoked for account: %s", iwd.a((Object) account));
        if (bundle == null || !bundle.containsKey("password")) {
            ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest = new ConfirmCredentialsWorkflowRequest();
            confirmCredentialsWorkflowRequest.f = accountAuthenticatorResponse;
            confirmCredentialsWorkflowRequest.c = a();
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            confirmCredentialsWorkflowRequest.b = str;
            confirmCredentialsWorkflowRequest.e = account;
            confirmCredentialsWorkflowRequest.d.clear();
            if (bundle != null) {
                confirmCredentialsWorkflowRequest.d.putAll(bundle);
            }
            PendingIntent a2 = this.h.a(confirmCredentialsWorkflowRequest);
            ekb a3 = ekb.a();
            a3.a(this.d, a2, accountAuthenticatorResponse, Arrays.asList(new String[]{"booleanResult", "accountType", "retry"}));
            return a3.b();
        }
        String string = bundle.getString("password");
        AccountCredentials accountCredentials = new AccountCredentials(account);
        accountCredentials.f = string;
        ConfirmCredentialsRequest confirmCredentialsRequest = new ConfirmCredentialsRequest();
        confirmCredentialsRequest.b = accountCredentials;
        TokenResponse a4 = this.g.a(confirmCredentialsRequest);
        ekb a5 = ekb.a();
        if (gei.SUCCESS != a4.b()) {
            z = false;
        }
        a5.a(z);
        return a5.b();
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        throw new UnsupportedOperationException();
    }

    public final Bundle finishSession(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, Bundle bundle) {
        iva.a((Object) bundle);
        AppDescription a2 = a();
        eka eka = this.h;
        FinishSessionWorkflowRequest finishSessionWorkflowRequest = new FinishSessionWorkflowRequest(1, bundle, a2, str, (AccountAuthenticatorResponse) null);
        finishSessionWorkflowRequest.d = accountAuthenticatorResponse;
        PendingIntent a3 = eka.a(finishSessionWorkflowRequest);
        ekb a4 = ekb.a();
        a4.a(this.d, a3, accountAuthenticatorResponse, Arrays.asList(new String[]{"booleanResult", "accountType", "authAccount", "accountStatusToken", "retry"}));
        return a4.b();
    }

    public final Bundle getAccountCredentialsForCloning(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        a.c("getAccountCredentialsForCloning, account: %s", iwd.a((Object) account));
        Bundle bundle = (Bundle) ((gck) this.g).a((gcj) new gby(account.name));
        if (bundle == null) {
            a.e("getAccountCredentialsForCloning: Bundle was null", new Object[0]);
            ekb a2 = ekb.a();
            a2.a(false);
            return a2.b();
        }
        if (ent.ac()) {
            a.b("Using new partial bootstrap flow", new Object[0]);
            Bundle bundle2 = new Bundle();
            Intent startIntent = IntentOperation.getStartIntent(this.d, CreateBootstrapAssertionIntentOperation.class, "com.google.android.gms.auth.account.be.create_bootstrap_assertion");
            startIntent.putExtra("bootstrapAccount", account);
            startIntent.putExtra("messenger", new Messenger(new eke(this, Looper.getMainLooper())));
            this.d.startService(startIntent);
            try {
                c.tryAcquire(1, TimeUnit.MINUTES);
            } catch (InterruptedException e2) {
                a.e("Error waiting for count down", e2, new Object[0]);
            }
            if (this.b != null) {
                a.b("Successful assertion creation for partial bootstrap", new Object[0]);
                bundle2.putByteArray("partialBootstrapAssertion", ivy.a(this.b));
            } else {
                a.e("No assertion returned for partial bootstrap", new Object[0]);
                bundle2 = null;
            }
            if (bundle2 != null) {
                bundle.putBundle("bootstrapBundle", bundle2);
            }
        }
        ekb a3 = ekb.a();
        a3.a(true);
        a3.a.putAll(bundle);
        return a3.b();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle getAccountRemovalAllowed(android.accounts.AccountAuthenticatorResponse r8, android.accounts.Account r9) {
        /*
            r7 = this;
            ejq r0 = r7.m
            java.lang.String r1 = r9.name
            boolean r2 = defpackage.jkr.a()
            if (r2 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x002c
        L_0x000f:
            android.os.UserManager r2 = r0.a
            java.lang.String r0 = r0.b
            android.os.Bundle r0 = r2.getApplicationRestrictions(r0)
            java.lang.String r2 = "auth_account:disallow_account_removal_for_domains"
            java.lang.String[] r0 = r0.getStringArray(r2)
            if (r0 != 0) goto L_0x0024
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x002c
        L_0x0024:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x002c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "@"
            int r5 = r2.length()
            if (r5 != 0) goto L_0x004f
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x0053
        L_0x004f:
            java.lang.String r2 = r4.concat(r2)
        L_0x0053:
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x0030
            ekb r8 = defpackage.ekb.a()
            r8.a((boolean) r3)
            android.os.Bundle r8 = r8.b()
            return r8
        L_0x0065:
            long r0 = android.os.Binder.clearCallingIdentity()
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012f }
            r4 = 22
            r5 = 1
            if (r2 < r4) goto L_0x00c6
            ekh r2 = r7.e     // Catch:{ all -> 0x012f }
            android.content.Context r4 = r7.d     // Catch:{ all -> 0x012f }
            boolean r2 = r2.a((android.content.Context) r4)     // Catch:{ all -> 0x012f }
            if (r2 != 0) goto L_0x00c6
            android.content.Context r2 = r7.d     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "keyguard"
            java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{ all -> 0x012f }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x012f }
            boolean r2 = r2.isKeyguardSecure()     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00c6
            android.content.Context r2 = r7.d     // Catch:{ all -> 0x012f }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ all -> 0x012f }
            java.util.List r2 = defpackage.jgu.d(r2, r4)     // Catch:{ all -> 0x012f }
            int r2 = r2.size()     // Catch:{ all -> 0x012f }
            if (r2 != r5) goto L_0x00c6
            eli r2 = r7.i     // Catch:{ all -> 0x012f }
            java.util.List r2 = r2.e()     // Catch:{ all -> 0x012f }
            if (r2 != 0) goto L_0x00c6
            eli r2 = r7.i     // Catch:{ all -> 0x012f }
            boolean r2 = r2.a()     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00c6
            eli r2 = r7.i     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "com.google"
            java.lang.String r6 = r9.type     // Catch:{ all -> 0x012f }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x00c6
            java.lang.String r4 = r9.name     // Catch:{ all -> 0x012f }
            java.lang.String r2 = r2.b(r4)     // Catch:{ all -> 0x012f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x00c4
            r2 = 0
            goto L_0x00c7
        L_0x00c4:
            r2 = 1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            android.os.Binder.restoreCallingIdentity(r0)
            boolean r0 = defpackage.jkr.a()
            if (r0 == 0) goto L_0x010f
            android.content.Context r0 = r7.d
            android.content.Intent r0 = defpackage.ijk.a((android.content.Context) r0, (android.accounts.Account) r9)
            if (r0 == 0) goto L_0x00d9
            goto L_0x00e7
        L_0x00d9:
            if (r2 != 0) goto L_0x00e7
            ekb r8 = defpackage.ekb.a()
            r8.a((boolean) r5)
            android.os.Bundle r8 = r8.b()
            return r8
        L_0x00e7:
            com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest r0 = new com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest
            r0.<init>(r8, r9, r2)
            eka r9 = r7.h
            android.app.PendingIntent r9 = r9.a((com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest) r0)
            ekb r0 = defpackage.ekb.a()
            android.content.Context r1 = r7.d
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r4 = "booleanResult"
            r2[r3] = r4
            java.lang.String r3 = "retry"
            r2[r5] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.a(r1, r9, r8, r2)
            android.os.Bundle r8 = r0.b()
            return r8
        L_0x010f:
            if (r2 == 0) goto L_0x0123
            ekb r9 = defpackage.ekb.a()
            android.content.Context r0 = r7.d
            android.content.Intent r8 = com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity.a((android.content.Context) r0, (android.accounts.AccountAuthenticatorResponse) r8)
            r9.a((android.content.Context) r0, (android.content.Intent) r8)
            android.os.Bundle r8 = r9.b()
            return r8
        L_0x0123:
            ekb r8 = defpackage.ekb.a()
            r8.a((boolean) r5)
            android.os.Bundle r8 = r8.b()
            return r8
        L_0x012f:
            r8 = move-exception
            android.os.Binder.restoreCallingIdentity(r0)
            goto L_0x0135
        L_0x0134:
            throw r8
        L_0x0135:
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekf.getAccountRemovalAllowed(android.accounts.AccountAuthenticatorResponse, android.accounts.Account):android.os.Bundle");
    }

    /* JADX INFO: finally extract failed */
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Bundle b2;
        iva.a(str, (Object) "authTokenType cannot be empty.");
        iva.b(bundle != null && !bundle.isEmpty(), "loginOptions cannot be null or empty.");
        iva.a((Object) account, (Object) "Account cannot be null.");
        iva.a(account.name, (Object) "Account name cannot be empty");
        if (jhx.a((Object[]) eim.c, (Object) account.type)) {
            Context context = this.d;
            bundle.putParcelable("accountManagerResponse", accountAuthenticatorResponse);
            bundle.putString("_opt_is_called_from_account_manager", "1");
            bundle.putBoolean("handle_notification", bundle.getBoolean("notifyOnAuthFailure", false));
            String str2 = context.getApplicationInfo().packageName;
            bundle.putString("clientPackageName", str2);
            if (TextUtils.isEmpty(bundle.getString(eim.e))) {
                bundle.putString(eim.e, str2);
            }
            bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (awkm.a.a().b()) {
                try {
                    Bundle a2 = this.l.a(account, str, bundle);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    TokenData a3 = TokenData.a(a2, "tokenDetails");
                    if (a3 == null) {
                        String string = a2.getString("Error");
                        gei c2 = gei.c(string);
                        ekb a4 = ekb.a();
                        if (gei.a(c2)) {
                            a4.a(this.d, (Intent) a2.getParcelable("userRecoveryIntent"));
                            iwd iwd = a;
                            String valueOf = String.valueOf(string);
                            iwd.d(valueOf.length() == 0 ? new String("Recoverable error: ") : "Recoverable error: ".concat(valueOf), new Object[0]);
                        } else if (gei.b(c2)) {
                            a4.a(3, string);
                            iwd iwd2 = a;
                            String valueOf2 = String.valueOf(string);
                            iwd2.d(valueOf2.length() == 0 ? new String("Retryable error: ") : "Retryable error: ".concat(valueOf2), new Object[0]);
                        } else {
                            a4.a(5, string);
                            iwd iwd3 = a;
                            String valueOf3 = String.valueOf(string);
                            iwd3.d(valueOf3.length() == 0 ? new String("Invalid response error: ") : "Invalid response error: ".concat(valueOf3), new Object[0]);
                        }
                        return a4.b();
                    }
                    ekb a5 = ekb.a();
                    a5.a(account);
                    a5.a(a3);
                    return a5.b();
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            } else {
                try {
                    Bundle a6 = this.l.a(account, str, bundle);
                    TokenData a7 = TokenData.a(a6, "tokenDetails");
                    if (a7 != null) {
                        iva.a((Object) a7, (Object) "null tokenData is not expected here as it should have triggered exceptions above.");
                        ekb a8 = ekb.a();
                        a8.a(account);
                        a8.a(a7);
                        b2 = a8.b();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return b2;
                    }
                    String string2 = a6.getString("Error");
                    gei c3 = gei.c(string2);
                    if (gei.a(c3)) {
                        throw new UserRecoverableAuthException(string2, (Intent) a6.getParcelable("userRecoveryIntent"));
                    } else if (gei.b(c3)) {
                        throw new IOException(string2);
                    } else {
                        throw new eif(string2);
                    }
                } catch (UserRecoverableAuthException e2) {
                    a.a((Throwable) e2);
                    ekb a9 = ekb.a();
                    a9.a(this.d, e2.a());
                    b2 = a9.b();
                } catch (IOException e3) {
                    a.a((Throwable) e3);
                    ekb a10 = ekb.a();
                    a10.a(3, e3.getMessage());
                    b2 = a10.b();
                } catch (eif e4) {
                    a.a((Throwable) e4);
                    ekb a11 = ekb.a();
                    a11.a(5, e4.getMessage());
                    b2 = a11.b();
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("Account type not supported.");
        }
    }

    public final String getAuthTokenLabel(String str) {
        CharSequence text;
        Context context = this.d;
        a.d("getAuthTokenLabel: %s", str);
        String str2 = null;
        if (!str.startsWith("oauth:")) {
            try {
                String valueOf = String.valueOf(str);
                String str3 = valueOf.length() == 0 ? new String("com.google.android.googleapps.permission.GOOGLE_AUTH.") : "com.google.android.googleapps.permission.GOOGLE_AUTH.".concat(valueOf);
                PackageManager packageManager = context.getPackageManager();
                PermissionInfo permissionInfo = packageManager.getPermissionInfo(str3, 0);
                if (permissionInfo.labelRes != 0 && (text = packageManager.getText(permissionInfo.packageName, permissionInfo.labelRes, (ApplicationInfo) null)) != null) {
                    str2 = text.toString();
                } else if (permissionInfo.nonLocalizedLabel != null) {
                    str2 = permissionInfo.nonLocalizedLabel.toString();
                } else if (permissionInfo.name != null) {
                    str2 = permissionInfo.name;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return str2 != null ? str2 : str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle hasFeatures(android.accounts.AccountAuthenticatorResponse r5, android.accounts.Account r6, java.lang.String[] r7) {
        /*
            r4 = this;
            ela r5 = new ela
            android.content.Context r0 = r4.d
            r5.<init>(r0)
            r0 = 0
            if (r7 == 0) goto L_0x006e
            eny r1 = r4.f
            enx r2 = defpackage.eqb.f
            java.lang.Object r1 = r1.a((android.accounts.Account) r6, (defpackage.enx) r2)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x003a
            r1 = 1025(0x401, float:1.436E-42)
            int r2 = android.os.Binder.getCallingUid()
            defpackage.izj.a(r1, r2)
            r5.a(r6)
            defpackage.izj.a()
            iwd r5 = a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Synced services for account."
            r5.b(r2, r1)
            eny r5 = r4.f
            enx r1 = defpackage.eqb.f
            java.lang.Object r5 = r5.a((android.accounts.Account) r6, (defpackage.enx) r1)
            r1 = r5
            java.util.Set r1 = (java.util.Set) r1
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            if (r1 != 0) goto L_0x0047
            iwd r5 = a
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = "Services not available!"
            r5.d(r7, r6)
            goto L_0x006f
        L_0x0047:
            int r5 = r7.length
            r6 = 0
        L_0x0049:
            if (r6 >= r5) goto L_0x006c
            r2 = r7[r6]
            java.lang.String r3 = "service_"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0062
            r3 = 8
            java.lang.String r2 = r2.substring(r3)
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x006f
            goto L_0x0069
        L_0x0062:
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0049
        L_0x006c:
            r0 = 1
            goto L_0x006f
        L_0x006e:
        L_0x006f:
            ekb r5 = defpackage.ekb.a()
            r5.a((boolean) r0)
            android.os.Bundle r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekf.hasFeatures(android.accounts.AccountAuthenticatorResponse, android.accounts.Account, java.lang.String[]):android.os.Bundle");
    }

    public final Bundle isCredentialsUpdateSuggested(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str) {
        boolean booleanValue = ((Boolean) ((gck) this.g).a((gcj) new gci(str))).booleanValue();
        ekb a2 = ekb.a();
        a2.a(!booleanValue);
        return a2.b();
    }

    public final Bundle startAddAccountSession(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        AccountAuthenticatorResponse accountAuthenticatorResponse2 = accountAuthenticatorResponse;
        Bundle bundle2 = bundle;
        iva.a((Object) bundle);
        AppDescription a2 = a();
        String[] stringArray = bundle2.getStringArray("allowed_domains");
        if (stringArray != null && stringArray.length > 0) {
            this.m.a(new HashSet(Arrays.asList(stringArray)));
        }
        boolean z = bundle2.getBoolean("useImmersiveMode", false);
        boolean z2 = bundle2.getBoolean("setupWizard", bundle2.getBoolean("firstRun", false));
        String string = bundle2.getString("purchaser_gaia_email");
        String string2 = bundle2.getString("purchaser_name");
        StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest = r3;
        eka eka = this.h;
        String str3 = string2;
        String str4 = string;
        StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest2 = new StartAddAccountSessionWorkflowRequest(1, (List) null, new Bundle(), a2, str, (AccountAuthenticatorResponse) null, false, false, (String) null, (String) null);
        startAddAccountSessionWorkflowRequest.f = accountAuthenticatorResponse2;
        startAddAccountSessionWorkflowRequest.g = z2;
        startAddAccountSessionWorkflowRequest.h = z;
        Collection a3 = this.m.a();
        if (a3 != null) {
            startAddAccountSessionWorkflowRequest.b = new ArrayList(a3);
        } else {
            startAddAccountSessionWorkflowRequest.b = null;
        }
        startAddAccountSessionWorkflowRequest.i = str4;
        startAddAccountSessionWorkflowRequest.j = str3;
        startAddAccountSessionWorkflowRequest.c.clear();
        Bundle bundle3 = bundle;
        if (bundle3 != null) {
            startAddAccountSessionWorkflowRequest.c.putAll(bundle3);
        }
        PendingIntent a4 = eka.a(startAddAccountSessionWorkflowRequest);
        ekb a5 = ekb.a();
        a5.a(this.d, a4, accountAuthenticatorResponse2, Arrays.asList(new String[]{"booleanResult", "accountSessionBundle", "authAccount", "password", "accountStatusToken", "retry"}));
        return a5.b();
    }

    public final Bundle startUpdateCredentialsSession(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        iva.a((Object) bundle);
        UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest = new UpdateCredentialsWorkflowRequest();
        updateCredentialsWorkflowRequest.a(account);
        updateCredentialsWorkflowRequest.a(bundle);
        updateCredentialsWorkflowRequest.c = a();
        PendingIntent a2 = this.h.a(updateCredentialsWorkflowRequest);
        ekb a3 = ekb.a();
        a3.a(this.d, a2, accountAuthenticatorResponse, Arrays.asList(new String[]{"booleanResult", "accountSessionBundle", "password", "accountStatusToken", "retry"}));
        return a3.b();
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        a.c("updateCredentials invoked for account: %s", iwd.a((Object) account));
        UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest = new UpdateCredentialsWorkflowRequest();
        updateCredentialsWorkflowRequest.a(account);
        updateCredentialsWorkflowRequest.a(bundle);
        updateCredentialsWorkflowRequest.c = a();
        PendingIntent b2 = this.h.b(updateCredentialsWorkflowRequest);
        ekb a2 = ekb.a();
        a2.a(this.d, b2, accountAuthenticatorResponse, Arrays.asList(new String[]{"booleanResult", "accountType", "retry"}));
        return a2.b();
    }
}
