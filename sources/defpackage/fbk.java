package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: fbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fbk extends qcg {
    public static final iwd a = ehv.b("AuthorizationControllerFragment");
    private anax A;
    public AuthorizationRequest b;
    public String c;
    public String d;
    public hol e;
    public fbn f;
    public fce g;
    public aoru h;
    public String i;
    public String j;
    public String k;
    public Account l;
    public fsj m;
    public int n;
    public Set o;
    public gck p;
    public TokenRequest q;
    public TokenResponse r;
    public ConsentResult s;
    public int t;
    public amsv u;
    public amsv v;
    public CookieManager w;
    public GoogleSignInAccount x;
    private fop y;
    private pzg z;

    public static fbk a(String str, AuthorizationRequest authorizationRequest, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        bundle.putString("session_id", str2);
        bundle.putParcelable("auth_request", authorizationRequest);
        fbk fbk = new fbk();
        fbk.setArguments(bundle);
        return fbk;
    }

    public final void a(int i2, String str) {
        if (i2 == 1) {
            this.i = str;
        } else if (i2 == 2) {
            this.j = str;
        } else if (i2 == 3) {
            this.k = str;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.g.b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.b = (AuthorizationRequest) arguments.getParcelable("auth_request");
        this.d = arguments.getString("session_id");
        this.c = arguments.getString("calling_package");
        Context context = getContext();
        this.e = new hol(context.getApplicationContext(), "IDENTITY_GMSCORE", (String) null);
        Context applicationContext = context.getApplicationContext();
        fsh a2 = fsi.a();
        a2.a = this.d;
        this.m = fsg.a(applicationContext, a2.a());
        this.h = jfb.a(1, 9);
        this.n = jhg.i(context.getApplicationContext(), this.c);
        this.p = pzx.a(context.getApplicationContext());
        this.A = anax.a((Collection) this.b.a);
        this.o = new HashSet();
        this.u = new fai(this);
        this.v = new fat(this);
        this.w = CookieManager.getInstance();
        Activity activity = getActivity();
        this.f = (fbn) qck.a(activity).a(fbn.class);
        this.y = (fop) qck.a(activity).a(fop.class);
        this.z = (pzg) qck.a(activity).a(pzg.class);
        this.y.c.a(this, new fao(this));
        this.f.d.a(this, new fap(this));
        this.f.g.a(this, new faq(this));
        this.z.d.a(this, new far(this));
        this.z.g.a(this, new fas(this));
        this.f.a(1);
        this.f.c.a(this, new fau(this));
        fcd a3 = fce.a();
        a3.a = qcr.RESOLVE_ACCOUNT;
        a3.a(qcr.RESOLVE_ACCOUNT, new fbb(this));
        a3.a(qcr.EXTERNAL_ACCOUNT_CHOOSER, new fbc(this));
        a3.a(qcr.EXTERNAL_REAUTH_ACCOUNT, new fbd(this));
        a3.a(qcr.AUTH_ACCOUNT, new fbe(this));
        a3.a(qcr.CONSENT_GET_COOKIES, new fbf(this));
        a3.a(qcr.CONSENT_SHOW_REMOTE_UI, new fbg(this));
        a3.a(qcr.EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY, new fbh(this));
        a3.a(qcr.CONSENT_RECORD_GRANTS, new fbi(this));
        a3.a(qcr.BUILD_GOOGLE_SIGN_IN_ACCOUNT, new faj(this));
        a3.a(qcr.SET_DEFAULT_ACCOUNT, new fak(this));
        a3.b = new fal(this);
        a3.c = new fam(this);
        a3.a(this.e, this.d, fan.a);
        this.g = a3.a();
    }

    public static boolean a(Account account, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String lowerCase = account.name.toLowerCase(Locale.ROOT);
        String valueOf = String.valueOf(str.toLowerCase(Locale.ROOT));
        return lowerCase.endsWith(valueOf.length() == 0 ? new String("@") : "@".concat(valueOf));
    }

    public final void onDestroy() {
        int i2 = Build.VERSION.SDK_INT;
        this.w.removeAllCookies((ValueCallback) null);
        this.w.flush();
        super.onDestroy();
    }

    public final aorr a(int i2) {
        this.t = i2;
        return this.h.b(new fba(this, i2));
    }

    public final Set a() {
        return !this.o.isEmpty() ? this.o : this.A;
    }

    public final void a(fbm fbm) {
        this.f.a(fbm);
    }
}
