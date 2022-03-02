package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* renamed from: fei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fei extends qcg {
    public static final iwd a = ehv.b("SaveAccountLinkingTokenControllerFragment");
    public fek b;
    public pzg c;
    public String d;
    public String e;
    public Account f;
    public qcv g = qcv.SAVE_ACCOUNT_LINKING_TOKEN_ACCOUNT_CHOOSER;
    private fop h;
    private SaveAccountLinkingTokenRequest i;
    private amsv j;
    private aosh k;
    private boolean l;
    private jls m;
    private fsj n;
    private aoru o;
    private String p;

    private final aorr a(qcv qcv) {
        aosh f2 = aosh.f();
        this.k = f2;
        return qay.a((aorr) f2, (Object) amri.b(qcv));
    }

    public final void b() {
        qcv qcv = qcv.DEFAULT_SAVE_ACCOUNT_LINKING_TOKEN_FLOW_STEP;
        int ordinal = this.g.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            this.k.b((Object) null);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.l) {
            this.l = true;
            a();
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 200) {
            return;
        }
        if (i3 == -1 && intent != null) {
            this.b.a(2);
            String stringExtra = intent.getStringExtra("extra_token");
            this.p = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                a(new fej(Status.e, ampu.a));
            } else {
                b();
            }
        } else {
            a(new fej(Status.e, ampu.a));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.e = arguments.getString("session_id");
        this.d = arguments.getString("calling_package");
        Context context = getContext();
        this.m = new jls((Handler) new qvr(Looper.getMainLooper()));
        this.o = jfb.a(1, 9);
        Context applicationContext = context.getApplicationContext();
        fsh a2 = fsi.a();
        a2.a = this.e;
        this.n = fsg.a(applicationContext, a2.a());
        new hol(context.getApplicationContext(), "IDENTITY_GMSCORE", (String) null);
        this.j = new fea(this);
        Activity activity = getActivity();
        this.b = (fek) qck.a(activity).a(fek.class);
        this.h = (fop) qck.a(activity).a(fop.class);
        this.c = (pzg) qck.a(activity).a(pzg.class);
        this.h.c.a(this, new fee(this));
        this.c.d.a(this, new fef(this));
        this.b.e.a(this, new feg(this));
    }

    public static fei a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        bundle.putString("session_id", str2);
        fei fei = new fei();
        fei.setArguments(bundle);
        return fei;
    }

    public final void a() {
        aorr aorr;
        a.a("startNextStep() is called, flowStep=%s.", this.g.name());
        qcv qcv = qcv.DEFAULT_SAVE_ACCOUNT_LINKING_TOKEN_FLOW_STEP;
        int ordinal = this.g.ordinal();
        if (ordinal == 1) {
            if (((pze) getChildFragmentManager().findFragmentByTag("account_chooser")) == null) {
                pze a2 = pze.a(this.d, amzy.a((Object) "com.google"), (String) null);
                getChildFragmentManager().beginTransaction().add((Fragment) a2, "account_chooser").commitNow();
                a2.a();
            }
            aorr = a(qcv.SAVE_ACCOUNT_LINKING_TOKEN_REAUTH_ACCOUNT);
        } else if (ordinal == 2) {
            foo foo = (foo) this.j.a();
            getChildFragmentManager().beginTransaction().add((Fragment) foo, "account_reauth").commitNow();
            foo.a();
            aorr = a(qcv.SAVE_ACCOUNT_LINKING_TOKEN_EXTERNAL_CONSENT);
        } else if (ordinal == 3) {
            aorr = a(qcv.SAVE_ACCOUNT_LINKING_TOKEN_SAVE_TOKEN);
            fsj fsj = this.n;
            String str = this.e;
            String str2 = this.d;
            iva.a((Object) str);
            iva.c(str2);
            iha b2 = ihb.b();
            b2.a = new fub(str, str2);
            acwa b3 = ((iby) fsj).b(b2.a());
            b3.a((acvv) new feb(this));
            b3.a(fec.a);
        } else if (ordinal != 4) {
            String valueOf = String.valueOf(this.g.name());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Invalid flowStep was reached: ") : "Invalid flowStep was reached: ".concat(valueOf));
        } else {
            fsj fsj2 = this.n;
            SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.i;
            String str3 = this.p;
            Account account = this.f;
            String str4 = this.d;
            iva.a((Object) saveAccountLinkingTokenRequest);
            iva.a((Object) account);
            iva.c(str4);
            iha b4 = ihb.b();
            b4.a = new fuk(saveAccountLinkingTokenRequest, str3, account, str4);
            aorr = aopr.a(qbc.a(((iby) fsj2).b(b4.a())), fed.a, (Executor) this.o);
        }
        aorl.a(aorr, new feh(this), this.m);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        if (saveAccountLinkingTokenRequest != null) {
            this.i = saveAccountLinkingTokenRequest;
            try {
                startIntentSenderForResult(saveAccountLinkingTokenRequest.a.getIntentSender(), 200, (Intent) null, 0, 0, 0, Bundle.EMPTY);
            } catch (IntentSender.SendIntentException e2) {
                a.e("Launching the external Consent PendingIntent failed", e2, new Object[0]);
                this.k.a((Throwable) qbf.a("Launching the external Consent PendingIntent failed", 8));
            }
        } else {
            this.k.a((Throwable) qbf.a("Timed out", 8));
        }
    }

    public final void a(fej fej) {
        this.b.a(fej);
    }
}
