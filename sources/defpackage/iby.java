package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.wearable.Channel;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;

/* renamed from: iby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iby implements icd, gel, achf {
    private final igu a;
    public final Context c;
    public final String d;
    public final ibq e;
    public final ibm f;
    public final ida g;
    public final Looper h;
    public final int i;
    public final icc j;
    public final ifn k;

    public iby(Activity activity, ibq ibq, ibx ibx) {
        iva.a((Object) activity, (Object) "Null activity is not permitted.");
        iva.a((Object) ibq, (Object) "Api must not be null.");
        iva.a((Object) ibx, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.c = activity.getApplicationContext();
        this.d = a((Object) activity);
        this.e = ibq;
        this.f = null;
        this.h = ibx.c;
        this.g = ida.a(this.e, this.f);
        this.j = new ifo(this);
        ifn a2 = ifn.a(this.c);
        this.k = a2;
        this.i = a2.a();
        this.a = ibx.b;
        if (!(activity instanceof GoogleApiActivity)) {
            try {
                iee.a(LifecycleCallback.a(activity), this.k, this.g);
            } catch (IllegalStateException | ConcurrentModificationException e2) {
            }
        }
        this.k.a(this);
    }

    private final acwa a(int i2, ihb ihb) {
        acwd acwd = new acwd();
        ifn ifn = this.k;
        icw icw = new icw(i2, ihb, acwd, this.a);
        Handler handler = ifn.o;
        handler.sendMessage(handler.obtainMessage(4, new igh(icw, ifn.k.get(), this)));
        return acwd.a;
    }

    public final acwa b(PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rch(pendingIntent);
        return b(b.a());
    }

    public final ida b() {
        return this.g;
    }

    public final acwa c(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        iva.a((Object) exchangeAssertionsForUserCredentialsRequest);
        acjm acjm = new acjm(exchangeAssertionsForUserCredentialsRequest);
        iha b = ihb.b();
        b.a = acjm;
        return a(b.a());
    }

    public final acwa d() {
        ibq ibq = gra.a;
        icc icc = this.j;
        jwr jwr = new jwr(icc);
        icc.a((idf) jwr);
        return iux.a((icf) new bvo(jwr), new ick());
    }

    public final acwa e() {
        icc icc = this.j;
        qgg qgg = new qgg(icc);
        icc.a((idf) qgg);
        return iux.a((icf) qgg, qdz.a);
    }

    public final acwa f() {
        iha b = ihb.b();
        b.a = new rda(this);
        return a(b.a());
    }

    public final acwa g() {
        icc icc = this.j;
        rpw rpw = new rpw(icc);
        icc.a((idf) rpw);
        return iux.a((icf) rpw, new ick());
    }

    public final acwa h() {
        return a((ihb) new rxi());
    }

    public final acwa i() {
        return a((ihb) new rxm());
    }

    public final acwa j() {
        return a((ihb) new rxo());
    }

    public final acwa k() {
        return a((ihb) new rxq());
    }

    public final void l() {
        a((ihb) new zzr());
    }

    public final acwa m() {
        icc icc = this.j;
        adce adce = new adce(icc);
        icc.a((idf) adce);
        return iux.a((icf) adce, new ick());
    }

    public final acwa n() {
        icc icc = this.j;
        adcg adcg = new adcg(icc);
        icc.a((idf) adcg);
        return iux.a((icf) adcg, new ick());
    }

    public acwa o() {
        return iux.a(adsz.a(this.j), new ick());
    }

    public final acwa b(FeedbackOptions feedbackOptions) {
        try {
            if (((Boolean) myq.a.a()).booleanValue()) {
                return b((ihb) new mvz(feedbackOptions));
            }
        } catch (SecurityException e2) {
            Log.e("fb_FeedbackClient", e2.getMessage());
        }
        return iux.a(mvd.b(this.j, feedbackOptions));
    }

    public final acwa e(String str) {
        jua a2 = juc.a();
        ((InterestUpdateBatchImpl) a2).a.add(new InterestUpdateBatchImpl.Operation(2, (InterestRecordStub) null, str));
        return iux.a(a2.a(this.j));
    }

    public acwa f(String str) {
        iha b = ihb.b();
        b.a = new adse(this, str);
        b.b = new Feature[]{adru.b};
        return a(b.a());
    }

    public static Bitmap a(Activity activity) {
        try {
            return a(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e2) {
            Log.w("fb_FeedbackClient", "Get screenshot failed!", e2);
            return null;
        }
    }

    public final acwa c(String str) {
        iha b = ihb.b();
        b.a = new gew(str);
        b.b = new Feature[]{gqy.a};
        return a(b.a());
    }

    public iby(Context context) {
        this(context, ejg.a, (ibm) null, ibx.a);
        int i2 = erg.a;
    }

    public final acwa d(PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rdr(pendingIntent);
        return b(b.a());
    }

    public static Bitmap a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e2) {
            Log.w("fb_FeedbackClient", "Get screenshot failed!", e2);
            return null;
        }
    }

    public iby(Context context, acyq acyq) {
        this(context, acyr.a, (ibm) acyq, ibx.a);
    }

    public isc c() {
        Set set;
        GoogleSignInAccount a2;
        isc isc = new isc();
        ibm ibm = this.f;
        Account account = null;
        if (!(ibm instanceof ibi) || (a2 = ((ibi) ibm).a()) == null) {
            ibm ibm2 = this.f;
            if (ibm2 instanceof ibh) {
                account = ((ibh) ibm2).b();
            }
        } else {
            String str = a2.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        isc.a = account;
        ibm ibm3 = this.f;
        if (ibm3 instanceof ibi) {
            GoogleSignInAccount a3 = ((ibi) ibm3).a();
            if (a3 == null) {
                set = Collections.emptySet();
            } else {
                set = a3.a();
            }
        } else {
            set = Collections.emptySet();
        }
        if (isc.b == null) {
            isc.b = new ob();
        }
        isc.b.addAll(set);
        isc.d = this.c.getClass().getName();
        isc.c = this.c.getPackageName();
        return isc;
    }

    public iby(Context context, adry adry) {
        this(context, adrz.a, (ibm) adry, ibx.a);
    }

    private static String a(Object obj) {
        if (!jkr.i()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getFeatureId", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            return null;
        }
    }

    public final acwa b(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        iva.a((Object) exchangeAssertionsForUserCredentialsRequest);
        acjl acjl = new acjl(exchangeAssertionsForUserCredentialsRequest);
        iha b = ihb.b();
        b.a = acjl;
        return a(b.a());
    }

    public final acwa d(String str) {
        iha b = ihb.b();
        b.a = new geu(str);
        b.b = new Feature[]{gqy.a};
        return a(b.a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iby(android.content.Context r3, defpackage.ibq r4, android.os.Looper r5, defpackage.igu r6) {
        /*
            r2 = this;
            ibw r0 = new ibw
            r0.<init>()
            java.lang.String r1 = "Looper must not be null."
            defpackage.iva.a((java.lang.Object) r5, (java.lang.Object) r1)
            r0.a = r5
            r0.a(r6)
            ibx r5 = r0.a()
            r6 = 0
            r2.<init>((android.content.Context) r3, (defpackage.ibq) r4, (defpackage.ibm) r6, (defpackage.ibx) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.<init>(android.content.Context, ibq, android.os.Looper, igu):void");
    }

    public static rge a(acwd acwd) {
        return new rdj(acwd);
    }

    public iby(Context context, ibq ibq, ibm ibm, ibx ibx) {
        iva.a((Object) context, (Object) "Null context is not permitted.");
        iva.a((Object) ibq, (Object) "Api must not be null.");
        iva.a((Object) ibx, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.c = context.getApplicationContext();
        this.d = a((Object) context);
        this.e = ibq;
        this.f = ibm;
        this.h = ibx.c;
        this.g = ida.a(this.e, this.f);
        this.j = new ifo(this);
        ifn a2 = ifn.a(this.c);
        this.k = a2;
        this.i = a2.a();
        this.a = ibx.b;
        this.k.a(this);
    }

    public static void a(Channel channel) {
        iva.a((Object) channel, (Object) "channel must not be null");
    }

    public final acwa a(Account account) {
        iha b = ihb.b();
        b.a = new rmb(account);
        return a(b.a());
    }

    public final acwa b(igc igc) {
        return ihd.a(a(igc));
    }

    public final acwa b(ihb ihb) {
        return a(1, ihb);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iby(android.content.Context r2, defpackage.ibq r3, defpackage.ibm r4, defpackage.igu r5) {
        /*
            r1 = this;
            ibw r0 = new ibw
            r0.<init>()
            r0.a(r5)
            ibx r5 = r0.a()
            r1.<init>((android.content.Context) r2, (defpackage.ibq) r3, (defpackage.ibm) r4, (defpackage.ibx) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.<init>(android.content.Context, ibq, ibm, igu):void");
    }

    public final acwa a(PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rcf(pendingIntent);
        return b(b.a());
    }

    public final acwa b(String str) {
        iha b = ihb.b();
        b.a = new gev(str);
        b.b = new Feature[]{gqy.a};
        return a(b.a());
    }

    public iby(Context context, ibx ibx) {
        this(context, adyr.a, (ibm) null, ibx);
    }

    public iby(Context context, wls wls) {
        this(context, wlt.a, (ibm) wls, ibx.a);
    }

    public final acwa a(FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        ibq ibq = gra.a;
        icc icc = this.j;
        jux jux = new jux(icc, fenceUpdateRequestImpl);
        icc.a((idf) jux);
        return iux.a(jux);
    }

    public final void c(PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rdg(pendingIntent);
        b(b.a());
    }

    public iby(Context context, wls wls, byte[] bArr) {
        this(context, wlt.a, (ibm) wls, ibx.a);
    }

    public iby(Context context, byte[] bArr) {
        this(context, mvd.b, (ibm) null, ibx.a);
        aeej.a(context.getApplicationContext());
    }

    public final acwa a(FeedbackOptions feedbackOptions) {
        try {
            if (!((Boolean) myq.b.a()).booleanValue()) {
                return iux.a(mvd.a(this.j, feedbackOptions));
            }
            long nanoTime = System.nanoTime();
            Context b = this.j.b();
            iha b2 = ihb.b();
            b2.a = new mvy(feedbackOptions, nanoTime, b);
            b2.b = new Feature[]{muw.b};
            return b(b2.a());
        } catch (SecurityException e2) {
            Log.e("fb_FeedbackClient", e2.getMessage());
        }
    }

    public iby(Context context, char[] cArr) {
        this(context, ren.a, (ibm) null, ibx.a);
    }

    public iby(Context context, float[] fArr) {
        this(context, apmc.a, Looper.getMainLooper(), (igu) new apld());
        agvx.a(context);
    }

    public iby(Context context, int[] iArr) {
        this(context, rxu.a, (ibm) null, ibx.a);
    }

    public iby(Context context, short[] sArr) {
        this(context, rmf.a, (ibm) null, (igu) new icz());
    }

    public iby(Context context, boolean[] zArr) {
        this(context, zzo.a, (ibm) null, (igu) new icz());
        if (aaaa.a == null) {
            synchronized (aaaa.class) {
                if (aaaa.a == null) {
                    aaaa.a = new aaaa((byte[]) null);
                }
            }
        }
    }

    public final acwa a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rce(activityRecognitionRequest, pendingIntent);
        return b(b.a());
    }

    public iby(com.google.android.chimera.Activity activity, ibq ibq, ibx ibx) {
        iva.a((Object) activity, (Object) "Null chimeraActivity is not permitted.");
        iva.a((Object) ibq, (Object) "Api must not be null.");
        iva.a((Object) ibx, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.c = activity.getApplicationContext();
        this.d = a((Object) activity);
        this.e = ibq;
        this.f = null;
        this.h = ibx.c;
        this.g = ida.a(this.e, this.f);
        this.j = new ifo(this);
        ifn a2 = ifn.a(this.c);
        this.k = a2;
        this.i = a2.a();
        this.a = ibx.b;
        iee.a(LifecycleCallback.a(activity), this.k, this.g);
        this.k.a(this);
    }

    public final acwa a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rcg(activityTransitionRequest, pendingIntent);
        return b(b.a());
    }

    public final acwa a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rdq(geofencingRequest, pendingIntent);
        return b(b.a());
    }

    public final acwa a(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        iva.a((Object) exchangeAssertionsForUserCredentialsRequest);
        acjk acjk = new acjk(exchangeAssertionsForUserCredentialsRequest);
        iha b = ihb.b();
        b.a = acjk;
        return a(b.a());
    }

    public final acwa a(UdcCacheRequest udcCacheRequest) {
        icc icc = this.j;
        adcc adcc = new adcc(icc, udcCacheRequest);
        icc.a((idf) adcc);
        return iux.a((icf) adcc, (iuw) new acyx());
    }

    public acwa a(UsageReportingOptInOptions usageReportingOptInOptions) {
        icc icc = this.j;
        adsy adsy = new adsy(icc, usageReportingOptInOptions);
        icc.b((idf) adsy);
        return iux.a(adsy);
    }

    public final acwa a(igc igc) {
        iva.a((Object) igc, (Object) "Listener key cannot be null.");
        ifn ifn = this.k;
        acwd acwd = new acwd();
        icx icx = new icx(igc, acwd);
        Handler handler = ifn.o;
        handler.sendMessage(handler.obtainMessage(13, new igh(icx, ifn.k.get(), this)));
        return acwd.a;
    }

    @Deprecated
    public final acwa a(igi igi, ihg ihg) {
        iva.a((Object) igi);
        iva.a((Object) ihg);
        iva.a((Object) igi.a(), (Object) "Listener has already been released.");
        iva.a((Object) ihg.b, (Object) "Listener has already been released.");
        iva.b(igi.a().equals(ihg.b), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.k.a(this, igi, ihg, ibv.a);
    }

    public final acwa a(igo igo) {
        iva.a((Object) igo);
        iva.a((Object) igo.a.a(), (Object) "Listener has already been released.");
        iva.a((Object) igo.b.b, (Object) "Listener has already been released.");
        return this.k.a(this, igo.a, igo.b, igo.c);
    }

    public final acwa a(ihb ihb) {
        return a(0, ihb);
    }

    public final acwa a(String str, int i2, jup jup, juq juq) {
        jua a2 = juc.a();
        a2.a(str, i2, jup, juq);
        return iux.a(a2.a(this.j));
    }

    public acwa a(String str, String str2, byte[] bArr) {
        return iux.a(aebd.a(this.j, str, str2, bArr), aebe.a);
    }

    public acwa a(String str, byte[] bArr, adsa adsa, int i2) {
        iha b = ihb.b();
        b.a = new adsg(this, str, bArr, i2, adsa);
        b.b = new Feature[]{adru.b};
        return b(b.a());
    }

    public acwa a(String str, byte[] bArr, int[] iArr, int i2) {
        iha b = ihb.b();
        b.a = new adsh(this, str, bArr, iArr, i2);
        b.b = new Feature[]{adru.b};
        return b(b.a());
    }

    public final acwa a(List list) {
        iha b = ihb.b();
        b.a = new rds(list);
        return b(b.a());
    }

    public final acwa a(jtn jtn) {
        return iux.a(juc.b(this.j, jtn), new ick());
    }

    public final acwa a(jtn jtn, jtv jtv) {
        return iux.a(juc.a(this.j, jtn, jtv));
    }

    public final acwa a(jtv jtv) {
        return iux.a(juc.a(this.j, jtv));
    }

    public final acwa a(boolean z) {
        return a((ihb) new rxk(z));
    }

    public final acwa a(Account[] accountArr) {
        aciy aciy = new aciy(accountArr);
        iha b = ihb.b();
        b.a = aciy;
        return a(b.a());
    }

    public final acwa a(Assertion[] assertionArr) {
        iva.a((Object) assertionArr);
        acjj acjj = new acjj(assertionArr);
        iha b = ihb.b();
        b.a = acjj;
        return a(b.a());
    }

    public final acwa a(Challenge[] challengeArr, boolean z, boolean z2) {
        acji acji = new acji(challengeArr, z, z2);
        iha b = ihb.b();
        b.a = acji;
        return a(b.a());
    }

    public final acwa a(UserBootstrapInfo[] userBootstrapInfoArr) {
        acjh acjh = new acjh(userBootstrapInfoArr);
        iha b = ihb.b();
        b.a = acjh;
        return a(b.a());
    }

    public final icf a(String str, int i2, int i3) {
        ibq ibq = wlt.a;
        return xdh.b(this.j, str, i2, i3);
    }

    public final icf a(wkz wkz) {
        ibq ibq = wlt.a;
        icc icc = this.j;
        if (wkz == null) {
            wkz = wkz.a;
        }
        xcf xcf = new xcf(icc, wkz);
        icc.a((idf) xcf);
        return xcf;
    }

    public final ige a(Object obj, String str) {
        return igf.a(obj, this.h, str);
    }

    public final void a(int i2, idf idf) {
        idf.e();
        ifn ifn = this.k;
        icu icu = new icu(i2, idf);
        Handler handler = ifn.o;
        handler.sendMessage(handler.obtainMessage(4, new igh(icu, ifn.k.get(), this)));
    }

    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        iha b = ihb.b();
        b.a = new rdf(this, locationRequestInternal, pendingIntent);
        b(b.a());
    }

    public final void a(LocationRequestInternal locationRequestInternal, rei rei, Looper looper) {
        ige a2 = igf.a(rei, rop.a(looper), rei.class.getSimpleName());
        rdi rdi = new rdi(a2);
        rdb rdb = new rdb(this, rdi, a2, locationRequestInternal);
        ign a3 = igo.a();
        a3.a = rdb;
        a3.b = rdi;
        a3.c = a2;
        a(a3.a());
    }

    public final void a(reh reh) {
        ihd.a(a(igf.a(reh, reh.class.getSimpleName())));
    }
}
