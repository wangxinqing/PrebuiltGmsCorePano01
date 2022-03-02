package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: qfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfq {
    private static final Object w = new Object();
    private static qfq x;
    public final aoru a = aosd.a((ExecutorService) jfm.a(10));
    public final jiq b = jiu.a;
    public final qlc c;
    public final qlg d;
    public final SharedPreferences e;
    public final SharedPreferences f;
    public final qjt g;
    public final qhj h;
    public final qkm i;
    public final qks j;
    public final qex k;
    public final qiz l;
    public final qlx m;
    public final qja n;
    public final qfl o;
    public final qfg p;
    public final qkc q;
    public final qld r;
    public final qkv s;
    public final qkn t;
    public final File u;
    private final qkb v;

    public qfq(Context context) {
        Context applicationContext = context.getApplicationContext();
        int a2 = qfe.a();
        File dir = applicationContext.getDir("instantapps", 0);
        this.u = new File(dir, "cookies");
        String absolutePath = dir.getAbsolutePath();
        this.k = new qex(applicationContext);
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("instantapps.OptIn", 0);
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("instantapps.AccountPreferences", 0);
        SharedPreferences sharedPreferences3 = applicationContext.getSharedPreferences("instantapps.Routing", 0);
        SharedPreferences sharedPreferences4 = applicationContext.getSharedPreferences("instantapps.UserPrefsUpdater", 0);
        this.e = applicationContext.getSharedPreferences("instantapps.ServerExperiments", 0);
        this.f = applicationContext.getSharedPreferences("instantapps.RuntimeState", 0);
        qfa qfa = new qfa(applicationContext);
        this.c = new qlc(qub.a(applicationContext), sharedPreferences2);
        qed qed = new qed(new qec(applicationContext, this.k), this.c);
        Context context2 = applicationContext;
        izd izd = new izd(context2, axuy.a.a().f(), (int) axuy.a.a().g(), -1, 13824);
        qeo qeo = new qeo(izd);
        qex qex = this.k;
        aoru aoru = this.a;
        aoru aoru2 = aoru;
        int i2 = a2;
        qen qen = r1;
        qen qen2 = new qen(context2, qex, qfa, izd, qeo, qed, aoru2, new qfk(applicationContext));
        qef qef = new qef(applicationContext, qen);
        qeg qeg = new qeg(applicationContext.getPackageManager());
        qee qee = new qee(qeg, qen, qef, new qeh());
        this.d = new qlg(this.c, sharedPreferences);
        Context context3 = applicationContext;
        this.l = new qiz(context3, this.k, qgy.a(applicationContext, "Metadata", new File(absolutePath, "metadataDatabase")), absolutePath, this.a);
        qgy a3 = qgy.a(applicationContext, "DomainFilter", new File(absolutePath, "domainFilterInfoDb"));
        qiz qiz = this.l;
        qlc qlc = this.c;
        qlg qlg = this.d;
        SharedPreferences sharedPreferences5 = this.e;
        qex qex2 = this.k;
        qfa qfa2 = qfa;
        SharedPreferences sharedPreferences6 = sharedPreferences5;
        qee qee2 = qee;
        qee qee3 = qee;
        qlg qlg2 = qlg;
        qeg qeg2 = qeg;
        SharedPreferences sharedPreferences7 = sharedPreferences6;
        qeg qeg3 = qeg2;
        qex qex3 = qex2;
        SharedPreferences sharedPreferences8 = sharedPreferences3;
        qeg qeg4 = qeg3;
        qjv qjv = new qjv(applicationContext, qiz, qfa2, qee2, a3, qlc, qlg2, sharedPreferences7, qex3, new Random());
        this.g = new qjo(qeg4, qjv, new qjq(applicationContext, qjv));
        this.m = new qlx(applicationContext, qgy.a(applicationContext, "AppData", new File(absolutePath, "instantAppDataDb")), absolutePath);
        this.n = new qja();
        this.h = new qhk(this.l, this.n, applicationContext);
        this.i = new qkm(sharedPreferences8);
        qjb qjb = new qjb(this.l, qee3, this.h, this.k, applicationContext);
        this.p = new qfg();
        this.t = new qkn(applicationContext, qeg4);
        int i3 = qko.a;
        if (!jkr.e() || axuy.c()) {
            qkb qkb = new qkb(qgy.a(applicationContext, "HashPrefix", new File(absolutePath, "prefixFilterInfoDb")), this.k);
            this.v = qkb;
            this.g.a((qka) qkb);
            if (!jkr.e() || !axuy.c()) {
                this.q = null;
            } else {
                qkd qkd = new qkd(applicationContext, this.v, this.p, this.l, new qfk(applicationContext), this.g, this.k);
                this.q = new qjp(qeg4, qkd, new qjs(applicationContext, qkd, this.a));
            }
        } else {
            this.q = null;
            this.v = null;
        }
        qeg qeg5 = qeg4;
        qks qks = r1;
        qks qks2 = new qks(applicationContext, this.g, this.l, this.d, this.c, qjb, this.k, this.p, i2, this.t, qeg5, this.v);
        this.j = qks;
        this.o = new qfl(applicationContext);
        if (axuy.a.a().D()) {
            this.d.a((qlf) new qle(applicationContext));
        }
        this.r = qld.a(applicationContext);
        this.s = new qkv(sharedPreferences4, this.d, qee3, this.c, applicationContext, this.k, new Random());
    }

    public static qfq a(Context context) {
        qfq qfq;
        int i2 = jhg.a;
        synchronized (w) {
            if (x == null) {
                x = new qfq(context.getApplicationContext());
            }
            qfq = x;
        }
        return qfq;
    }
}
