package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.util.PackageResetHelper;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: akvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvl {
    public final Context a;
    public final HandlerThread b;
    public final Handler c = new qvr(this.b.getLooper());
    public final aoru d;
    public final aoru e;
    public final akiy f;
    public final aksa g;
    public final akyn h;
    public final PackageResetHelper i;
    public final PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver j;
    public final akio k;
    public final aoru l;
    public final aoru m;
    private final akhw n;
    private final akhj o;
    private final akuj p;
    private final akpy q;
    private final Executor r;

    public akvl(Context context, akir akir) {
        akql akql;
        Context context2 = context;
        this.a = context2;
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        HandlerThread handlerThread = new HandlerThread("Places");
        this.b = handlerThread;
        handlerThread.start();
        aoru a2 = jfm.a(10);
        this.l = a2;
        if (a2 instanceof jfz) {
            ((jfz) a2).setRejectedExecutionHandler(discardPolicy);
        }
        aoru a3 = jfm.a(10);
        if (a3 instanceof jfz) {
            ((jfz) a3).setRejectedExecutionHandler(discardPolicy);
        }
        this.g = new aksa(this.c, a3);
        aoru b2 = jfm.b(10);
        this.d = b2;
        if (b2 instanceof jfz) {
            ((jfz) b2).setRejectedExecutionHandler(discardPolicy);
        }
        aoru b3 = jfm.b(10);
        this.e = b3;
        if (b3 instanceof jfz) {
            ((jfz) b3).setRejectedExecutionHandler(discardPolicy);
        }
        akuv akuv = new akuv();
        this.n = new akhw(this.a, new jls(this.c));
        hol hol = new hol(context.getApplicationContext(), "LE", (String) null);
        akhj akhj = new akhj(context2, hol, 1, this.l);
        this.o = akhj;
        aksc a4 = aksc.a(context2, PlacesParams.a, akhj);
        aktg a5 = aktg.a(context2, PlacesParams.a, this.o);
        this.h = new akyn(context2, this.c);
        this.r = new akvg(this);
        aoru b4 = jfm.b(10);
        this.m = b4;
        if (b4 instanceof jfz) {
            ((jfz) b4).setRejectedExecutionHandler(discardPolicy);
        }
        akuj akuj = new akuj(context, akuv, this.r, this.g, this.e, this.d, this.l, a4, a5, hol);
        this.p = akuj;
        Context context3 = this.a;
        Handler handler = this.c;
        aoru aoru = this.d;
        aklz.a(new akoz());
        this.k = new akjy(akuj, new akum(context3, akuj, aoru, handler), new akjf(akuj));
        akup akup = new akup(context2, this.h, this.k, this.p.d);
        if (!azbk.a.a().a()) {
            akql = new akqr(this.m, this.r);
        } else if (azbk.a.a().h()) {
            akql = new akra(context.getCacheDir(), this.m, this.r);
        } else {
            akql = new akqj(this.m, this.r);
        }
        this.q = new akpy(a4, akql, this.g);
        aksc aksc = a4;
        this.f = new akiy(context2, this.c, new akhm(new akpb(this.a, this.c, this.h, this.p.f, aksc, a5, this.g, this.n, this.q, this.o), akup, new akuc()), akir);
        PackageResetHelper packageResetHelper = new PackageResetHelper(this.a, this.f, false);
        this.i = packageResetHelper;
        packageResetHelper.a(this.c);
        PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver placeDetectionServiceImpl$FlagChangeBroadCastReceiver = new PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver(akup);
        this.j = placeDetectionServiceImpl$FlagChangeBroadCastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        this.a.registerReceiver(placeDetectionServiceImpl$FlagChangeBroadCastReceiver, intentFilter);
    }

    public final void a(Runnable runnable) {
        this.c.post(runnable);
    }
}
