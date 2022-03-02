package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.drive.networkcontrol.BatteryStateChangeReceiver;
import com.google.android.gms.drive.networkcontrol.ConnectivityChangeReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsm {
    public static lsm a;
    public final ConnectivityChangeReceiver A;
    public final BatteryStateChangeReceiver B;
    public final kew C;
    public final lhv D;
    public final ksz E;
    public final jiq F = jiu.a;
    public final lgy G;
    public final lge H;
    private final ConnectivityManager I;
    private final kix J;
    private final ktd K;
    private final kth L;
    private final Executor M;
    public final Context b;
    public final kkb c;
    public final kkf d;
    public final kei e;
    public final kdb f;
    public final lhx g;
    public final lrs h;
    public final lnn i;
    public final ley j;
    public final khx k;
    public final ktm l;
    public final kdx m;
    public final kim n;
    public final lih o;
    public final khw p;
    public final khp q;
    public final AtomicBoolean r;
    public final amdf s;
    public final kjd t;
    public final kjn u;
    public final ksw v;
    public final lku w;
    public final lfr x;
    public final ldv y;
    public final lel z;

    public lsm(Context context) {
        Context context2 = context;
        this.b = context2;
        this.I = (ConnectivityManager) context2.getSystemService("connectivity");
        this.G = new lgy(this.I);
        this.g = new lhy(context2);
        this.h = new lrs(context2);
        this.M = jfm.b(9);
        this.E = new ksz();
        this.c = new kkb(context2, this.M, this.g);
        this.i = new lnn(context2);
        lge lge = new lge(a(context), context2);
        this.H = lge;
        this.x = new lft(lge.a, lge.b);
        this.d = new kjr(this.c, this.M);
        this.m = new kdx(this.d);
        this.L = new kth(context2);
        this.l = new ktm(this.c, this.d, this.L, this.E, this.x, this.F);
        this.K = new ktd();
        this.k = new khx(this.c, this.d, this.F, this.h);
        Context context3 = context;
        this.v = new ksw(context3, this.l, this.m, this.K, this.E, this.L, this.k, this.F, this.G, this.x, this.d);
        this.p = new khw(context3, this.d, this.h, this.k, this.x, this.F);
        this.A = new ConnectivityChangeReceiver(context2, this.G);
        this.B = new BatteryStateChangeReceiver(context2);
        this.C = new kex(this.d);
        int i2 = Build.VERSION.SDK_INT;
        this.D = new lhv(this.A, new lhn(this.I), this.B, this.C, this.g);
        kkf kkf = this.d;
        kkb kkb = this.c;
        lgy lgy = this.G;
        ksw ksw = this.v;
        Context context4 = context;
        this.f = new kdb(context4, this, kkf, kkb, lgy, new kdn(ksw, kkf), ksw, this.p, this.F, this.x, this.D);
        this.J = new kix(this.k);
        this.e = new keh(this.f, this.k, this.F, this.p);
        this.n = new kim(context, this.J, this.k, this.d, this.p);
        this.y = new ldv(this.d, this.i);
        this.z = new lel(this.i, this.v, this.c, this.y, context, this.p);
        this.o = new lih(this.d, this.n, this.z, this.v, this.x, this.D);
        this.j = new ley(context, this.G, this.F, this.g, this.o, this.p);
        this.q = new khp(context.getApplicationContext(), this.d, this.i, jfm.b(9));
        this.r = new AtomicBoolean(true);
        this.s = new amdf(((Integer) jzq.r.c()).intValue(), ((Integer) jzq.t.c()).intValue(), ((Double) jzq.q.c()).doubleValue(), ((Integer) jzq.r.c()).intValue());
        this.t = new kjd();
        this.u = new kjn();
        this.w = new lku(this);
    }

    public static lgm a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int intValue = ((Integer) jzq.ag.c()).intValue();
        if (intValue == 1) {
            return new lgi();
        }
        if (intValue != 2) {
            return new lgk();
        }
        return new lfu(applicationContext);
    }

    public static lsm a() {
        iva.a(a != null, (Object) "Singletons not initialized");
        return a;
    }
}
