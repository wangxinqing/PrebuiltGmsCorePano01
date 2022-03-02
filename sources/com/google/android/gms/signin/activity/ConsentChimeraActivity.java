package com.google.android.gms.signin.activity;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsentChimeraActivity extends qcd {
    public static final iwd a = abeb.a("ConsentChimeraActivity");
    private static final anaf o;
    private static final Pattern p = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
    public final aoru b = aosd.a((ExecutorService) jfb.a(2, 9));
    public qaq c;
    public CookieManager d;
    public qao e;
    public qan f;
    public gck g;
    public TokenRequest h;
    public int i;
    public TokenResponse j;
    public ConsentResult k;
    public hol l;
    public abai m;
    abdk n;
    private boolean q;
    private AccountAuthenticatorResponse r;
    private Set s;
    private String t;

    static {
        anab h2 = anaf.h();
        h2.a(0, qbn.GET_TOKEN);
        h2.a(100, qbn.REAUTH);
        h2.a(200, qbn.CONFIGURE_COOKIES);
        h2.a(201, qbn.BROWSWER_CONSENT);
        h2.a(300, qbn.NATIVE_CONSENT);
        h2.a(400, qbn.RECORD_GRANTS);
        h2.a(500, qbn.HANDLE_DEVICE_MANAGEMENT_ERRORS);
        h2.a(501, qbn.HANDLE_LOCK_SCREEN_ERROR);
        o = h2.a();
    }

    private final void i() {
        if (!this.q && getSupportFragmentManager().findFragmentByTag("loading_interstitial") == null) {
            getSupportFragmentManager().beginTransaction().replace(16908290, new abbo(), "loading_interstitial").commit();
        }
    }

    public final void a(int i2, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i2).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.r;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i2, str);
        }
        setResult(0, putExtra);
        finish();
    }

    public final void e() {
        aorr aorr;
        aorr aorr2;
        String str;
        a.a("startNextStep() is called, consentStep=%d.", Integer.valueOf(this.i));
        int i2 = this.i;
        if (i2 == 0) {
            i();
            aorr = aopr.a((aorr) this.e.a(0, new abbf(this)), (amqy) new abbg(this), (Executor) this.c);
        } else if (i2 == 100) {
            Account a2 = this.h.a();
            if (a2 == null || !"com.google.work".equals(a2.type) || !p.matcher(a2.name).matches()) {
                aorr = this.e.a(100, new abbh(this));
            } else {
                a(6, "Work service account");
                aorr = aorl.a((Object) ampu.a);
            }
        } else if (i2 == 300) {
            TokenResponse tokenResponse = this.j;
            amrl.a((Object) tokenResponse);
            aorr = aopr.a((aorr) this.f.a(300, pzw.a(this, this.h, tokenResponse, azgt.a.a().a())), (amqy) new abbl(this), (Executor) this.c);
        } else if (i2 == 400) {
            i();
            if (azgw.b()) {
                TokenRequest tokenRequest = this.h;
                ConsentResult consentResult = this.k;
                amrl.a((Object) consentResult);
                Bundle bundle = new Bundle();
                qbx.a(bundle, "token_request", (SafeParcelable) tokenRequest);
                qbx.a(bundle, "consent_result", (SafeParcelable) consentResult);
                abdk abdk = this.n;
                amrl.a((Object) abdk);
                RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = new RecordConsentByConsentResultRequest(bundle);
                iha b2 = ihb.b();
                b2.a = new abde(recordConsentByConsentResultRequest);
                aorr = aopr.a((aorr) this.e.a(400, new abbm(qbc.a(abdk.b(b2.a())))), (amqy) new abar(this), (Executor) this.c);
            } else {
                aorr = aopr.a((aorr) this.e.a(400, new abas(this)), (amqy) new abat(this), (Executor) this.c);
            }
        } else if (i2 == 200) {
            i();
            aorr = aopr.a((aorr) this.e.a(200, new abbi(this)), amra.a(amri.b(201)), (Executor) this.c);
        } else if (i2 == 201) {
            aban aban = (aban) getSupportFragmentManager().findFragmentByTag("browser_consent");
            TokenResponse tokenResponse2 = this.j;
            amrl.a((Object) tokenResponse2);
            if (aban == null) {
                Account a3 = this.h.a();
                String str2 = tokenResponse2.z.d;
                aban aban2 = new aban();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("selected_account", a3);
                bundle2.putString("url", str2);
                aban2.setArguments(bundle2);
                getSupportFragmentManager().beginTransaction().replace(16908290, aban2, "browser_consent").commit();
                aban = aban2;
            }
            aorr = aopr.a((aorr) this.e.a(201, new abbj(aban)), (amqy) new abbk(this), (Executor) this.c);
        } else if (i2 == 500) {
            Account a4 = this.h.a();
            if (!azhc.a.a().a()) {
                aorr2 = aorl.a((Object) pzw.a((Context) this, a4, Bundle.EMPTY));
            } else {
                TokenResponse tokenResponse3 = this.j;
                if (tokenResponse3 == null) {
                    str = "dmStatus";
                } else {
                    str = tokenResponse3.v;
                }
                aorr2 = aopr.a((aorr) aoqw.c(this.b.b(new abav(this, a4))), (amqy) new abaw(this, a4, str), (Executor) aoqm.a);
            }
            aorr = aopr.a(aorr2, (aoqb) new abau(this), (Executor) this.c);
        } else if (i2 == 501) {
            aorr = aopr.a((aorr) this.f.a(501, pzw.a(this, this.h.a())), (amqy) new abay(this), (Executor) this.c);
        } else {
            throw new IllegalStateException(String.format("Unknown consent step: %d", new Object[]{Integer.valueOf(i2)}));
        }
        aorl.a(aorr, new abbn(this, System.currentTimeMillis()), this.c);
    }

    public final void onBackPressed() {
        aban aban = (aban) getSupportFragmentManager().findFragmentByTag("browser_consent");
        if (aban != null) {
            WebView webView = aban.c;
            if (webView != null && webView.canGoBack()) {
                aban.c.goBack();
                return;
            }
            a(4, "");
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        CookieManager cookieManager;
        abah abah;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(2132017712);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        Scope[] scopeArr = null;
        this.l = new hol(this, "IDENTITY_GMSCORE", (String) null);
        if (getPackageManager().hasSystemFeature("android.software.webview")) {
            cookieManager = CookieManager.getInstance();
        } else {
            cookieManager = new abco();
        }
        this.d = cookieManager;
        this.c = new qaq(new qvr(Looper.getMainLooper()));
        this.e = qao.a((FragmentActivity) this);
        this.f = qan.a(this);
        this.g = pzx.a(this);
        if (bundle != null) {
            this.i = bundle.getInt("consent_step", 0);
            if (bundle.containsKey("token_response")) {
                this.j = (TokenResponse) ivy.a((byte[]) amrl.a((Object) bundle.getByteArray("token_response")), TokenResponse.CREATOR);
            }
            if (bundle.containsKey("consent_result")) {
                this.k = (ConsentResult) bundle.getParcelable("consent_result");
            }
            this.t = bundle.getString("SIGN_IN_PACKAGE_NAME");
            if (bundle.containsKey("SIGN_IN_SCOPE_ARRAY")) {
                this.s = amym.a((Object[]) (Parcelable[]) amrl.a((Object) bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY"))).a(abaq.a).c();
            }
            Bundle bundle2 = bundle.getBundle("sign_in_options");
            amrl.a((Object) bundle2);
            this.m = abah.a(bundle2).a();
        } else {
            this.i = 0;
            this.j = null;
            this.k = null;
            this.t = getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME");
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("SIGN_IN_SCOPE_ARRAY");
            if (parcelableArrayExtra != null) {
                this.s = amym.a((Object[]) parcelableArrayExtra).a(abbb.a).c();
            }
            Bundle bundleExtra = getIntent().getBundleExtra("sign_in_options");
            if (bundleExtra != null) {
                abah = abah.a(bundleExtra);
            } else {
                abah = new abah();
            }
            abai a2 = abah.a();
            this.m = a2;
            if (a2.g == null) {
                abah.f = qbw.a();
                abai a3 = abah.a();
                this.m = a3;
                if (azgq.b()) {
                    hol hol = this.l;
                    String str = this.t;
                    Set set = this.s;
                    if (set != null) {
                        scopeArr = (Scope[]) set.toArray(new Scope[0]);
                    }
                    hol.a((audx) qcy.a(str, scopeArr, a3)).b();
                }
            }
        }
        if (azgq.b()) {
            qbt.a(this, this, new abaz(this));
        }
        iwd iwd = a;
        String valueOf = String.valueOf(this.m.g);
        iwd.b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
        this.h = (TokenRequest) ivy.a(getIntent(), "token_request", TokenRequest.CREATOR);
        this.q = getIntent().getBooleanExtra("suppress_loading_ui", false);
        this.r = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("account_authenticator_response");
        if (azgw.b()) {
            String str2 = this.t;
            Bundle a4 = this.m.a();
            a4.putString("com.google.android.gms.signin.internal.realClientPackageName", str2);
            this.n = abcp.a(this, abae.a(a4));
        }
        e();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TokenResponse tokenResponse = this.j;
        if (tokenResponse != null) {
            bundle.putByteArray("token_response", ivy.a(tokenResponse));
        }
        bundle.putInt("consent_step", this.i);
        ConsentResult consentResult = this.k;
        if (consentResult != null) {
            bundle.putParcelable("consent_result", consentResult);
        }
        Set set = this.s;
        if (set != null) {
            bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) set.toArray(new Scope[0]));
        }
        bundle.putBundle("sign_in_options", this.m.a());
    }

    public final void f() {
        int i2 = Build.VERSION.SDK_INT;
        this.d.removeAllCookies((ValueCallback) null);
        this.d.flush();
    }

    public final void a(long j2, int i2, boolean z) {
        if (azgq.b()) {
            aucd o2 = antk.i.o();
            qbn qbn = (qbn) o.get(Integer.valueOf(i2));
            amrl.a((Object) qbn);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            antk antk = (antk) o2.b;
            antk.c = qbn.j;
            int i3 = antk.a | 2;
            antk.a = i3;
            antk.a = i3 | 128;
            antk.h = z;
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            antk antk2 = (antk) o2.b;
            antk2.a |= 64;
            antk2.g = currentTimeMillis;
            antk antk3 = (antk) o2.i();
            aucd o3 = anty.n.o();
            String str = this.m.g;
            if (str != null) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anty anty = (anty) o3.b;
                str.getClass();
                anty.a |= 2;
                anty.c = str;
            }
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            anty anty2 = (anty) o3.b;
            anty2.b = 5;
            int i4 = anty2.a | 1;
            anty2.a = i4;
            antk3.getClass();
            anty2.g = antk3;
            anty2.a = i4 | 32;
            o3.i();
            this.l.a((audx) o3.i()).b();
        }
    }

    public final /* synthetic */ void a(aosh aosh, AccountManagerFuture accountManagerFuture) {
        try {
            accountManagerFuture.getResult();
            aosh.b((Object) amri.b(0));
        } catch (AuthenticatorException e2) {
            a(6, "Authenticator error");
            aosh.b((Object) ampu.a);
        } catch (OperationCanceledException e3) {
            a(4, "Reauth canceled");
            aosh.b((Object) ampu.a);
        } catch (IOException e4) {
            a(3, "Network error");
            aosh.b((Object) ampu.a);
        }
    }

    public final void a(String str) {
        Intent putExtra = new Intent().putExtra("authAccount", this.h.a().name).putExtra("accountType", this.h.a().type).putExtra("authtoken", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.r;
        if (accountAuthenticatorResponse != null) {
            Bundle extras = putExtra.getExtras();
            amrl.a((Object) extras);
            accountAuthenticatorResponse.onResult(extras);
        }
        setResult(-1, putExtra);
        finish();
    }
}
