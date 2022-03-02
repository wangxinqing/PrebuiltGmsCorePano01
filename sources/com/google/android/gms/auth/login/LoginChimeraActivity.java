package com.google.android.gms.auth.login;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoginChimeraActivity extends ggc {
    private ggi a;
    private String m;
    private String n;
    private String o;
    /* access modifiers changed from: private */
    public ggj p;

    /* access modifiers changed from: package-private */
    public final void b() {
        String d = this.a.d();
        String a2 = this.a.a();
        String str = this.o;
        boolean z = this.a.j() == 0;
        this.a.k();
        startActivityForResult(BrowserChimeraActivity.a(d, a2, str, z, this.a.a.getStringArrayList("allowed_domains"), this.a.a.getString("purchaser_email"), this.a.a.getString("purchaser_name")), 1004);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        CaptchaSolution captchaSolution;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i4 == 1) {
            setResult(1);
            finish();
            return;
        }
        boolean z2 = false;
        if (i4 != 0) {
            Account account = null;
            if (i3 != 1001) {
                if (i3 != 1002) {
                    if (i3 != 1004) {
                        if (i3 != 1009) {
                            if (i3 == 1033) {
                                a();
                                return;
                            } else if (i3 != 1026) {
                                if (i3 != 1027) {
                                    super.onActivityResult(i, i2, intent);
                                    return;
                                } else {
                                    b(intent2);
                                    return;
                                }
                            } else if (i4 != 6) {
                                ghc ghc = new ghc(intent2.getStringExtra("account_name"), intent2.getStringExtra("password"));
                                this.a.a(ghc.a);
                                this.n = ghc.b;
                            } else {
                                b();
                                return;
                            }
                        } else if (i4 == 6) {
                            b();
                            return;
                        } else if (i4 == 5) {
                            a();
                            return;
                        } else if (i4 != -1) {
                            setResult(i4);
                            finish();
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                    if (i4 == 11) {
                        setResult(11);
                        finish();
                    }
                    if (i4 == -1) {
                        ggd a2 = ggd.a(intent);
                        this.o = a2.b();
                        if (a2.a() != null) {
                            this.a.a(a2.a());
                        }
                        this.a.a.putBoolean("is_terms_of_services_newly_accepted", a2.a.getBoolean("is_terms_of_services_newly_accepted"));
                        this.a.a.putBoolean("is_new_account", a2.a.getBoolean("is_new_account", false));
                    }
                } else {
                    TokenResponse a3 = ggx.a(intent);
                    boolean z3 = a3.b() == gei.DEVICE_MANAGEMENT_REQUIRED || a3.b() == gei.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED;
                    if (gei.SUCCESS != a3.b() && (!z3 || this.a.j() != 0)) {
                        String str = a3.e;
                        if (str != null) {
                            this.a.b(str);
                        }
                        if (a3.b() == gei.BAD_AUTHENTICATION) {
                            a(a3.f, a3.b());
                            return;
                        }
                        gei b = a3.b();
                        String str2 = this.b;
                        String str3 = b.ac;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
                        sb.append(str2);
                        sb.append(" #handleTokenResponse - status: ");
                        sb.append(str3);
                        sb.toString();
                        int ordinal = b.ordinal();
                        if (ordinal == 3 || ordinal == 8) {
                            a();
                            return;
                        }
                        if (ordinal == 17) {
                            CaptchaChallenge captchaChallenge = a3.n;
                            if (captchaChallenge != null) {
                                this.m = captchaChallenge.c;
                                startActivityForResult(new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.login.CaptchaActivity").putExtra("bitmap", captchaChallenge.d), 1001);
                                return;
                            }
                        } else if (ordinal == 20) {
                            startActivityForResult(GrantCredentialsWithAclChimeraActivity.a(this.a.b().e, this.a.b().b, this.a.f(), this.a.d(), fyn.a(a3.c()), a3.r, a3.s, a3.y, false, (String) null), 1027);
                            return;
                        }
                        a(a3.f, b);
                        return;
                    }
                    Account account2 = a3.u;
                    ggi ggi = this.a;
                    String d = ggi.d();
                    String e = ggi.e();
                    if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(e)) {
                        account = new Account(d, e);
                    }
                    if (account2 == null) {
                        account2 = account;
                    } else {
                        this.a.a(account2);
                    }
                    if (this.a.a.getBoolean("is_terms_of_services_newly_accepted")) {
                        Intent intent3 = new Intent("com.android.vending.TOS_ACKED");
                        intent3.setPackage("com.android.vending");
                        intent3.putExtra("TosAckedReceiver.account", account2.name);
                        intent3.putExtra("TosAckedReceiver.account_type", account2.type);
                        intent3.addFlags(268435456);
                        sendBroadcast(intent3, "com.android.vending.TOS_ACKED");
                        Intent intent4 = new Intent("com.android.chrome.TOS_ACKED");
                        intent4.setPackage("com.android.chrome");
                        intent4.putExtra("TosAckedReceiver.account", account2.name);
                        intent4.putExtra("TosAckedReceiver.account_type", account2.type);
                        sendBroadcast(intent4, "com.android.chrome.TOS_ACKED");
                    }
                    gei gei = gei.SUCCESS;
                    String str4 = a3.d;
                    boolean i5 = this.a.i();
                    boolean z4 = this.a.a.getBoolean("is_new_account", false);
                    Intent intent5 = new Intent();
                    if (str4 != null || gei == gei.SUCCESS) {
                        z2 = true;
                    }
                    iva.b(z2);
                    fyo.a(gei).b(intent5);
                    if (str4 != null) {
                        intent5.putExtra("authtoken", str4);
                    }
                    if (i5) {
                        intent5.putExtra("booleanResult", true);
                    }
                    intent5.putExtra("authAccount", account2.name);
                    intent5.putExtra("accountType", account2.type);
                    intent5.putExtra("is_new_account", z4);
                    ghe.a(intent.getExtras(), intent5);
                    setResult(-1, intent5);
                    finish();
                    return;
                }
            }
            if (i4 == -1) {
                String stringExtra = intent2.getStringExtra("answer");
                String str5 = this.m;
                if (str5 == null) {
                    captchaSolution = null;
                } else {
                    captchaSolution = stringExtra != null ? new CaptchaSolution(str5, stringExtra) : null;
                }
                if (i3 != 1004) {
                    z = false;
                }
                a(captchaSolution, (ConsentResult) null, z);
                return;
            }
            setResult(1);
            finish();
        } else if (this.a.j() != 0) {
            setResult(0, a(intent2));
            finish();
        } else if ((i3 == 1001 || i3 == 1002 || i3 == 1004) && !this.a.a.getBoolean("is_browser_only") && !this.a.k()) {
            a();
        } else {
            setResult(0, a(intent2));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.view.Window r0 = r10.getWindow()
            r1 = 2
            r0.clearFlags(r1)
            boolean r0 = r10.isFinishing()
            if (r0 == 0) goto L_0x001d
            java.lang.String r11 = r10.b
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = " #onCreate - isFinishing"
            r11.concat(r0)
            return
        L_0x001d:
            if (r11 == 0) goto L_0x003e
            ggi r0 = new ggi
            r0.<init>(r11)
            r10.a = r0
            android.content.Intent r11 = r0.h()
            if (r11 == 0) goto L_0x003d
            ggi r11 = r10.a
            boolean r11 = r11.c()
            if (r11 == 0) goto L_0x003d
            ggi r11 = r10.a
            android.content.Intent r11 = r11.h()
            r10.b(r11)
        L_0x003d:
            return
        L_0x003e:
            android.content.Intent r11 = r10.getIntent()
            android.os.Bundle r0 = r11.getExtras()
            if (r0 == 0) goto L_0x0189
            ggi r1 = new ggi
            r1.<init>(r0)
            r10.a = r1
            int r0 = r1.j()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x0184
            gei r11 = defpackage.fyo.a((android.content.Intent) r11)
            if (r11 != 0) goto L_0x0060
            gei r11 = defpackage.gei.SUCCESS
        L_0x0060:
            int r0 = r11.ordinal()
            r4 = 3
            if (r0 == r4) goto L_0x0074
            r2 = 8
            if (r0 == r2) goto L_0x0070
            r10.a(r1, r11)
            return
        L_0x0070:
            r10.a()
            return
        L_0x0074:
            boolean r11 = defpackage.jkr.h()
            java.lang.String r0 = "GLSActivity"
            if (r11 == 0) goto L_0x008b
            awjs r11 = defpackage.awjs.a
            awjt r11 = r11.a()
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r11 = 1
            goto L_0x00d7
        L_0x008b:
            android.content.pm.PackageManager r11 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00d0 }
            java.lang.String r4 = "com.google.android.backuptransport"
            android.content.pm.ApplicationInfo r4 = r11.getApplicationInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x00d0 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x00d0 }
            java.lang.String r6 = "com.google.android.backup.BackupEnabler"
            r5.<init>(r6)     // Catch:{ NameNotFoundException -> 0x00d0 }
            android.content.pm.ResolveInfo r11 = r11.resolveService(r5, r3)     // Catch:{ NameNotFoundException -> 0x00d0 }
            if (r4 == 0) goto L_0x00a4
            r5 = 1
            goto L_0x00a5
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            if (r11 == 0) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00d0 }
            r8 = 44
            r7.<init>(r8)     // Catch:{ NameNotFoundException -> 0x00d0 }
            java.lang.String r8 = "backupPackageExists() info: "
            r7.append(r8)     // Catch:{ NameNotFoundException -> 0x00d0 }
            r7.append(r5)     // Catch:{ NameNotFoundException -> 0x00d0 }
            java.lang.String r5 = ", bi: "
            r7.append(r5)     // Catch:{ NameNotFoundException -> 0x00d0 }
            r7.append(r6)     // Catch:{ NameNotFoundException -> 0x00d0 }
            java.lang.String r5 = r7.toString()     // Catch:{ NameNotFoundException -> 0x00d0 }
            android.util.Log.i(r0, r5)     // Catch:{ NameNotFoundException -> 0x00d0 }
            if (r4 != 0) goto L_0x00cc
            r11 = 0
            goto L_0x00d7
        L_0x00cc:
            if (r11 != 0) goto L_0x0089
            r11 = 0
            goto L_0x00d7
        L_0x00d0:
            r11 = move-exception
            java.lang.String r11 = "Could not find Backup package: com.google.android.backuptransport"
            android.util.Log.w(r0, r11)
            r11 = 0
        L_0x00d7:
            ggi r4 = r10.a
            android.os.Bundle r4 = r4.a
            java.lang.String r5 = "is_setup_wizard"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 != 0) goto L_0x00e5
            r4 = 0
            goto L_0x00ea
        L_0x00e5:
            if (r11 != 0) goto L_0x00e9
            r4 = 0
            goto L_0x00ea
        L_0x00e9:
            r4 = 1
        L_0x00ea:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "com.google.android.setupwizard"
            java.lang.String r7 = "com.google.android.setupwizard.GoogleServicesActivity"
            android.content.Intent r5 = r5.setClassName(r6, r7)
            android.content.res.Resources r6 = r10.getResources()
            r7 = 2130903054(0x7f03000e, float:1.7412915E38)
            java.lang.String[] r6 = r6.getStringArray(r7)
            java.lang.String r7 = "device_country"
            java.lang.String r1 = defpackage.iqi.a(r10, r7, r1)
            android.content.ContentResolver r7 = r10.getContentResolver()
            java.lang.String r8 = "google_setup:play_email_opt_in"
            java.lang.String r7 = defpackage.aeeg.a((android.content.ContentResolver) r7, (java.lang.String) r8)
            if (r7 == 0) goto L_0x011d
            android.content.ContentResolver r0 = r10.getContentResolver()
            boolean r3 = defpackage.aeeg.a((android.content.ContentResolver) r0, (java.lang.String) r8, (boolean) r2)
            goto L_0x016a
        L_0x011d:
            if (r1 != 0) goto L_0x0120
            goto L_0x0137
        L_0x0120:
            java.lang.String r7 = ""
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x0137
            if (r6 == 0) goto L_0x0137
            java.util.List r0 = java.util.Arrays.asList(r6)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x016a
            r3 = 1
            goto L_0x016a
        L_0x0137:
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 74
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Problem looking up Google Play email default; countryCode="
            r9.append(r7)
            r9.append(r1)
            java.lang.String r1 = " optInCountries="
            r9.append(r1)
            r9.append(r6)
            java.lang.String r1 = r9.toString()
            android.util.Log.e(r0, r1)
        L_0x016a:
            java.lang.String r0 = "agreePlayEmail"
            r5.putExtra(r0, r3)
            if (r4 == 0) goto L_0x0177
            java.lang.String r0 = "agreeBackup"
            r5.putExtra(r0, r2)
        L_0x0177:
            if (r11 == 0) goto L_0x017e
            java.lang.String r11 = "agreeRestore"
            r5.putExtra(r11, r2)
        L_0x017e:
            r11 = 1041(0x411, float:1.459E-42)
            r10.startActivityForResult(r5, r11)
            return
        L_0x0184:
            r10.a(r1, r1, r3)
            return
        L_0x0189:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LoginActivity requires extra data"
            r11.<init>(r0)
            goto L_0x0192
        L_0x0191:
            throw r11
        L_0x0192:
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.login.LoginChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        ggj ggj = this.p;
        if (ggj != null) {
            ggj.cancel(true);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(new Bundle(this.a.a));
    }

    /* access modifiers changed from: package-private */
    public final Intent a(Intent intent) {
        Intent intent2 = new Intent();
        if (intent != null) {
            gei a2 = fyo.a(intent);
            fyo.a(a2).b(intent2);
            String stringExtra = intent.getStringExtra("authtoken");
            if (stringExtra != null) {
                intent2.putExtra("authtoken", stringExtra);
            }
            if (a2 != gei.SUCCESS && this.a.i()) {
                intent2.putExtra("booleanResult", false);
            }
        }
        return intent2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        boolean z = true;
        if (this.a.a() != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.a.j() != 1) {
                b();
                return;
            }
        }
        ghb ghb = new ghb(this);
        ghb.a.putExtra("account_name", this.a.d());
        ghb.a.putExtra("is_confirming_credentials", this.a.i());
        if (this.a.j() != 0) {
            z = false;
        }
        ghb.a.putExtra("is_adding_account", z);
        startActivityForResult(new Intent(ghb.a), 1026);
    }

    /* access modifiers changed from: package-private */
    public final void b(Intent intent) {
        PACLConfig pACLConfig;
        String str;
        this.a.a.putParcelable("grant_credential_response_status", intent);
        ConsentResult consentResult = (ConsentResult) intent.getParcelableExtra(ConsentResult.a);
        gei a2 = consentResult.a();
        if (a2 == gei.SUCCESS) {
            this.a.a(consentResult.e);
            PACLConfig g = this.a.g();
            String str2 = consentResult.d;
            if (str2 == null) {
                pACLConfig = null;
            } else {
                if (g != null) {
                    str = g.b;
                } else {
                    str = null;
                }
                pACLConfig = new PACLConfig(str, str2);
            }
            this.a.a(pACLConfig);
            a((CaptchaSolution) null, consentResult, false);
            return;
        }
        Intent putExtra = new Intent().putExtra("errorCode", 4).putExtra("errorMessage", a2.ac);
        fyo.a(a2).b(putExtra);
        setResult(0, a(putExtra));
        finish();
    }

    /* access modifiers changed from: package-private */
    public final void a(CaptchaSolution captchaSolution, ConsentResult consentResult, boolean z) {
        boolean z2;
        iva.a((Object) this.a.b(), (Object) "Calling app cannot be null!");
        TokenRequest tokenRequest = new TokenRequest(this.a.d(), this.a.e(), this.a.f());
        tokenRequest.e = (FACLConfig) this.a.a.getParcelable("facl");
        tokenRequest.f = this.a.g();
        tokenRequest.a(this.a.a.getBundle("options"));
        tokenRequest.h = false;
        if (this.a.j() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tokenRequest.g = z2;
        tokenRequest.j = this.a.b();
        tokenRequest.k = captchaSolution;
        if (consentResult != null) {
            if (consentResult.b() != null) {
                tokenRequest.a(consentResult.b());
            }
            tokenRequest.q = consentResult.g;
        }
        if (this.a.c()) {
            ggj ggj = this.p;
            if (ggj != null) {
                ggj.cancel(true);
            }
            ggj ggj2 = new ggj(this, tokenRequest, this.n, this.o, z, this.a.i());
            this.p = ggj2;
            ggj2.execute(new Object[0]);
            return;
        }
        new Object[1][0] = tokenRequest.c;
        startActivityForResult(LoginActivityChimeraTask.a(this, tokenRequest, this.n, this.o, z, this.a.i(), this.a.a.getString("title"), this.a.a.getBoolean("allow_credit_card")), 1002);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, gei gei) {
        boolean z;
        String d = this.a.d();
        if (this.a.j() == 0) {
            z = true;
        } else {
            z = false;
        }
        startActivityForResult(ShowErrorChimeraActivity.a(d, str, gei, false, z, true), 1009);
    }
}
