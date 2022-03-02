package com.google.android.gms.signin.activity;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SignInChimeraActivity extends qcd {
    public static final iwd a = abeb.a("SignInChimeraActivity");
    private static final anaf o;
    private static final anax p = anax.a(abaf.a, abaf.b, ykq.c, new Scope("https://www.googleapis.com/auth/userinfo.profile"), new Scope("https://www.googleapis.com/auth/userinfo.email"), new Scope("openid"), new Scope[0]);
    public final aoru b = aosd.a((ExecutorService) jfb.a(1, 9));
    public int c;
    public String d;
    public boolean e;
    public Account f;
    public Set g;
    public String h;
    public String i;
    public Intent j;
    public icc k;
    public hol l;
    public abai m;
    public abdk n;
    private qaq q;
    private qao r;
    private qan s;

    static {
        anab h2 = anaf.h();
        h2.a(1, qbp.FETCH_TOS_AND_PP);
        h2.a(2, qbp.CHOOSE_ACCOUNT);
        h2.a(3, qbp.RECORD_ACCOUNT_CHIP_CONSENT);
        h2.a(4, qbp.PRE_CONSENT);
        h2.a(5, qbp.CONSENT);
        h2.a(6, qbp.SAVE_SELECTED_ACCOUNT);
        o = h2.a();
    }

    public static Intent a(Context context, String str, Scope[] scopeArr, Intent intent, Bundle bundle) {
        if (intent != null) {
            intent.putExtra("SIGN_IN_PACKAGE_NAME", str);
            intent.putExtra("SIGN_IN_SCOPE_ARRAY", scopeArr);
            intent.putExtra("sign_in_options", bundle);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.signin.activity.SignInActivity");
        intent2.putExtra("SIGN_IN_PACKAGE_NAME", str);
        intent2.putExtra("start_step", 5);
        intent2.putExtra("SIGN_IN_SCOPE_ARRAY", scopeArr);
        intent2.putExtra("consent_intent", intent);
        intent2.putExtra("sign_in_options", bundle);
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        intent2.addCategory(valueOf.length() == 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf));
        return intent2;
    }

    public final void e() {
        aosh aosh;
        Intent intent;
        qat qat;
        a.a("startNextStep() is called, signInStep=%d.", Integer.valueOf(this.c));
        int i2 = this.c;
        switch (i2) {
            case 1:
                if (!amym.a(amsk.a(',').a().b().a((CharSequence) abdl.a.c())).b((amrm) new abcb(jlo.i()))) {
                    aosh = aooz.a((aorr) this.r.a(1, new abca(this)), IOException.class, (amqy) new abcf(this), (Executor) this.q);
                    break;
                } else {
                    aosh f2 = aosh.f();
                    new AlertDialog.Builder(this).setCancelable(true).setTitle(R.string.signin_not_supported_dialog_title).setMessage(R.string.signin_not_supported_dialog_message).setPositiveButton(17039370, abch.a).setOnCancelListener(new abci(this, f2)).create().show();
                    aosh = f2;
                    break;
                }
            case 2:
                boolean booleanExtra = getIntent().getBooleanExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", false);
                if (azhi.a.a().a()) {
                    hwu hwu = new hwu();
                    hwu.a(Arrays.asList(new String[]{"com.google"}));
                    hwu.b();
                    hwu.d = booleanExtra;
                    hwu.c();
                    hwu.g = getIntent().getStringExtra("hosted_domain");
                    hwu.e = this.d;
                    hwu.f = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                    hwv hwv = new hwv();
                    hwv.b = this.i;
                    hwv.a = this.h;
                    hww hww = new hww();
                    hww.b = hwv.b;
                    hww.a = hwv.a;
                    hwu.h = hww;
                    intent = hwy.a(hwu.a());
                } else {
                    intent = hwy.a((Account) null, (ArrayList) null, new String[]{"com.google"}, true, (String) null, booleanExtra, 0, 2, getIntent().getStringExtra("hosted_domain"), true);
                    intent.putExtra("realClientPackage", this.d);
                    pyt a2 = pyu.a();
                    a2.a(amri.b(Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS)));
                    amri c2 = amri.c(this.i);
                    amri c3 = amri.c(this.h);
                    a2.a.putBoolean("should_show_consent", true);
                    a2.a.putString("privacy_policy_url", (String) c2.c());
                    a2.a.putString("terms_of_service_url", (String) c3.c());
                    intent.putExtra("first_party_options_bundle", a2.a().a);
                }
                aosh = aopr.a((aorr) this.s.a(2, intent), (amqy) new abcg(this), (Executor) this.q);
                break;
            case 3:
                if (p.containsAll(this.g)) {
                    Account account = this.f;
                    amrl.a((Object) account);
                    RecordConsentRequest recordConsentRequest = new RecordConsentRequest(1, account, (Scope[]) this.g.toArray(new Scope[0]), getIntent().getStringExtra("service_client_id"));
                    if (!azgz.b()) {
                        aosh = aopr.a((aorr) this.r.a(3, new abcm(this, recordConsentRequest)), abbq.a, (Executor) this.q);
                        break;
                    } else {
                        aosh = aopr.a(aooz.a((aorr) this.r.a(3, new abcj(this, recordConsentRequest)), ibr.class, abck.a, (Executor) this.q), abcl.a, (Executor) this.q);
                        break;
                    }
                } else {
                    aosh = aorl.a((Object) amri.b(4));
                    break;
                }
            case 4:
                if (this.j == null) {
                    if (azgz.b()) {
                        qat = this.r.a(4, new abbr(this));
                    } else {
                        qat = this.r.a(4, new abbs(this));
                    }
                    aosh = aopr.a((aorr) qat, (amqy) new abbt(this), (Executor) this.q);
                    break;
                } else {
                    aosh = aorl.a((Object) amri.b(5));
                    break;
                }
            case 5:
                qan qan = this.s;
                Intent intent2 = this.j;
                amrl.a((Object) intent2);
                aosh = aopr.a((aorr) qan.a(5, intent2), (amqy) new abbu(this), (Executor) this.q);
                break;
            case 6:
                int intExtra = getIntent().getIntExtra("com.google.android.gms.signin.extraSessionId", -1);
                if (intExtra != -1) {
                    if (!azgz.b()) {
                        aosh = aopr.a((aorr) this.r.a(6, new abby(this, intExtra)), (amqy) new abbz(this), (Executor) this.q);
                        break;
                    } else {
                        aosh = aopr.a(aooz.a((aorr) this.r.a(6, new abbv(this, intExtra)), ibr.class, abbw.a, (Executor) this.q), (amqy) new abbx(this), (Executor) this.q);
                        break;
                    }
                } else {
                    a(-1, (Intent) null);
                    aosh = aorl.a((Object) ampu.a);
                    break;
                }
            default:
                throw new IllegalStateException(String.format("Unknown sign-in step: %d", new Object[]{Integer.valueOf(i2)}));
        }
        aorl.a(aosh, new abcn(this, System.currentTimeMillis()), this.q);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(2132017716);
        this.l = new hol(this, "IDENTITY_GMSCORE", (String) null);
        if (bundle != null) {
            this.d = bundle.getString("SIGN_IN_PACKAGE_NAME");
            this.e = bundle.getBoolean("launched_by_gmscore");
            a(bundle);
        } else {
            String a2 = jhg.a((Activity) this);
            this.d = a2;
            boolean equalsIgnoreCase = "com.google.android.gms".equalsIgnoreCase(a2);
            this.e = equalsIgnoreCase;
            if (equalsIgnoreCase) {
                this.d = (String) amrh.a(getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME"), this.d);
            }
            Bundle extras = getIntent().getExtras();
            amrl.a((Object) extras);
            a(extras);
            abai abai = this.m;
            if (abai.g == null) {
                abah abah = new abah();
                abai abai2 = abai.a;
                abah.a = abai.b;
                abah.b = abai.c;
                abah.c = abai.d;
                abah.d = abai.e;
                abah.e = abai.f;
                abah.f = abai.g;
                abah.g = abai.h;
                abah.h = abai.i;
                abah.i = abai.j;
                abah.f = qbw.a();
                abai a3 = abah.a();
                this.m = a3;
                if (azgq.b()) {
                    this.l.a((audx) qcy.a(this.d, (Scope[]) this.g.toArray(new Scope[0]), a3)).b();
                }
            }
        }
        if (azgq.b()) {
            qbt.a(this, this, new abcd(this));
        }
        iwd iwd = a;
        String valueOf = String.valueOf(this.m.g);
        iwd.b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
        this.q = new qaq(new qvr(Looper.getMainLooper()));
        if (azgz.b() && this.n == null) {
            String str = this.d;
            Bundle a4 = this.m.a();
            a4.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
            this.n = abcp.a(this, abae.a(a4));
        } else {
            String str2 = this.d;
            abai abai3 = this.m;
            ibz ibz = new ibz(this);
            ibz.a((Activity) this, (icb) new abcc(this));
            ibz.a(abaf.d, (ibj) abae.a(abai3.a()));
            ibz.b = str2;
            this.k = ibz.b();
        }
        this.r = qao.a((FragmentActivity) this);
        this.s = qan.a(this);
        e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("start_step", this.c);
        bundle.putParcelable("picked_account", this.f);
        bundle.putString("SIGN_IN_PACKAGE_NAME", this.d);
        bundle.putBoolean("launched_by_gmscore", this.e);
        bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) this.g.toArray(new Scope[0]));
        bundle.putString("terms_of_service_url", this.h);
        bundle.putString("privacy_policy_url", this.i);
        bundle.putParcelable("consent_intent", this.j);
        bundle.putBundle("sign_in_options", this.m.a());
    }

    public static Intent a(String str, Scope[] scopeArr, Bundle bundle, int i2) {
        Intent a2 = itg.a(str, scopeArr, false);
        a2.putExtra("complete_sign_in_process", true);
        a2.putExtra("sign_in_options", bundle);
        a2.putExtra("com.google.android.gms.signin.extraSessionId", i2);
        a2.putExtra("service_client_id", bundle.getString("com.google.android.gms.signin.internal.serverClientId"));
        a2.putExtra("hosted_domain", bundle.getString("com.google.android.gms.signin.internal.hostedDomain"));
        return a2;
    }

    private final void a(Bundle bundle) {
        int i2;
        if (bundle.containsKey("start_step")) {
            i2 = bundle.getInt("start_step");
        } else {
            i2 = 1;
        }
        this.c = i2;
        this.f = (Account) bundle.getParcelable("picked_account");
        Parcelable[] parcelableArray = bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
        if (parcelableArray != null) {
            this.g = amym.a((Object[]) parcelableArray).a(abbp.a).c();
        }
        this.h = bundle.getString("terms_of_service_url");
        this.i = bundle.getString("privacy_policy_url");
        this.j = (Intent) bundle.getParcelable("consent_intent");
        Bundle bundle2 = bundle.getBundle("sign_in_options");
        this.m = bundle2 != null ? abah.a(bundle2).a() : new abah().a();
    }

    public final void a(int i2, Intent intent) {
        setResult(i2, intent);
        finish();
    }

    public final void a(long j2, int i2, boolean z) {
        if (azgq.b()) {
            aucd o2 = antk.i.o();
            qbp qbp = (qbp) o.get(Integer.valueOf(i2));
            amrl.a((Object) qbp);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            antk antk = (antk) o2.b;
            antk.b = qbp.i;
            int i3 = antk.a | 1;
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
            hol hol = this.l;
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
            hol.a((audx) o3.i()).b();
        }
    }
}
