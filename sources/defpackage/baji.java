package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: baji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baji extends azzs implements azyw {
    public static final Logger a = Logger.getLogger(baji.class.getName());
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    static final babj c = babj.o.a("Channel shutdownNow invoked");
    static final babj d = babj.o.a("Channel shutdown invoked");
    static final babj e = babj.o.a("Subchannel shutdown invoked");
    public static final bajm f = new bajm(new HashMap(), new HashMap(), (Object) null, (Map) null);
    public volatile boolean A;
    public volatile boolean B;
    public final bads C;
    public final badu D;
    public final azxj E;
    public final azyv F;
    public bajm G;
    public boolean H;
    public final boolean I;
    final baha J;
    public babp K;
    public int L;
    public bagd M;
    public final baii N;
    public final baiq O;
    private final String P;
    private final baan Q;
    private final baal R;
    private final badp S;
    private final bajb T;
    private final bajz U;
    private final bait V;
    private final long W;
    private final bald X;
    private final azxi Y;
    private baas Z;
    private final CountDownLatch aa;
    private final bajn ab;
    private final bakt ac;
    public final azyx g;
    public final baek h;
    public final Executor i;
    public final bait j;
    public final balq k;
    public final babq l = new babq(new baig(this));
    public final azyi m;
    public final azxy n;
    public final baer o = new baer();
    public final String p;
    public boolean q;
    public baix r;
    public volatile azzm s;
    public boolean t;
    public final Set u = new HashSet(16, 0.75f);
    public final Set v;
    public final bafa w;
    public final bajh x;
    public final AtomicBoolean y;
    public boolean z;

    public baji(badc badc, baek baek, bajz bajz, amsv amsv, List list, balq balq) {
        badc badc2 = badc;
        bajz bajz2 = bajz;
        balq balq2 = balq;
        boolean z2 = true;
        this.v = new HashSet(1, 0.75f);
        this.x = new bajh(this);
        this.y = new AtomicBoolean(false);
        this.aa = new CountDownLatch(1);
        this.L = 1;
        this.G = f;
        this.H = false;
        new baku();
        this.ab = new bais(this);
        this.J = new baiu(this);
        this.O = new baiq(this);
        String str = badc2.g;
        amrl.a((Object) str, (Object) "target");
        this.P = str;
        this.g = azyx.a("Channel", str);
        amrl.a((Object) balq2, (Object) "timeProvider");
        this.k = balq2;
        bajz bajz3 = badc2.c;
        amrl.a((Object) bajz3, (Object) "executorPool");
        this.U = bajz3;
        Executor executor = (Executor) bajz3.a();
        amrl.a((Object) executor, (Object) "executor");
        this.i = executor;
        this.h = new badr(baek, this.i);
        this.T = new bajb(this.h.a());
        azyx azyx = this.g;
        long a2 = balq.a();
        String str2 = this.P;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14);
        sb.append("Channel for '");
        sb.append(str2);
        sb.append("'");
        this.D = new badu(azyx, a2, sb.toString());
        this.E = new badt(this.D, balq2);
        this.Q = badc2.f;
        babb babb = bagt.j;
        this.S = new badp(azzr.a(), badc2.i);
        bajz bajz4 = badc2.d;
        amrl.a((Object) bajz4, (Object) "offloadExecutorPool");
        this.j = new bait(bajz4);
        baar baar = new baar(this.S, this.E);
        baak baak = new baak();
        baak.a = Integer.valueOf(badc.c());
        amrl.a((Object) babb);
        baak.b = babb;
        babq babq = this.l;
        amrl.a((Object) babq);
        baak.c = babq;
        bajb bajb = this.T;
        amrl.a((Object) bajb);
        baak.e = bajb;
        amrl.a((Object) baar);
        baak.d = baar;
        azxj azxj = this.E;
        amrl.a((Object) azxj);
        baak.f = azxj;
        baak.g = new baio(this);
        baal baal = new baal(baak.a, baak.b, baak.c, baak.d, baak.e, baak.f, baak.g);
        this.R = baal;
        this.Z = a(this.P, this.Q, baal);
        amrl.a((Object) bajz2, (Object) "balancerRpcExecutorPool");
        this.V = new bait(bajz2);
        bafa bafa = new bafa(this.i, this.l);
        this.w = bafa;
        bajn bajn = this.ab;
        bafa.f = bajn;
        bafa.c = new baeu(bajn);
        bafa.d = new baev(bajn);
        bafa.e = new baew(bajn);
        this.X = new bald();
        this.I = true;
        this.Y = azxq.a(azxq.a((azxi) new baja(this, this.Z.a()), this.X), list);
        amrl.a((Object) amsv, (Object) "stopwatchSupplier");
        long j2 = badc2.l;
        if (j2 != -1) {
            amrl.a(j2 < badc.b ? false : z2, "invalid idleTimeoutMillis %s", badc2.l);
            this.W = badc2.l;
        } else {
            this.W = j2;
        }
        this.ac = new bakt(new baiv(this), this.l, this.h.a(), amsn.a());
        azyi azyi = badc2.j;
        amrl.a((Object) azyi, (Object) "decompressorRegistry");
        this.m = azyi;
        azxy azxy = badc2.k;
        amrl.a((Object) azxy, (Object) "compressorRegistry");
        this.n = azxy;
        this.p = badc2.h;
        baii baii = new baii(balq2);
        this.N = baii;
        this.C = baii.a();
        azyv azyv = badc2.m;
        amrl.a((Object) azyv);
        this.F = azyv;
        azyv.a(azyv.c, this);
        if (!this.I) {
            m();
        }
    }

    static baas a(String str, baan baan, baal baal) {
        URI uri;
        baas a2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri != null && (a2 = baan.a(uri, baal)) != null) {
            return a2;
        }
        String str2 = "";
        if (!b.matcher(str).matches()) {
            try {
                String a3 = baan.a();
                String valueOf = String.valueOf(str);
                baas a4 = baan.a(new URI(a3, str2, valueOf.length() == 0 ? new String("/") : "/".concat(valueOf), (String) null), baal);
                if (a4 != null) {
                    return a4;
                }
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            String valueOf2 = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 3);
            sb2.append(" (");
            sb2.append(valueOf2);
            sb2.append(")");
            str2 = sb2.toString();
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    private final void q() {
        this.l.b();
        babp babp = this.K;
        if (babp != null) {
            babp.a();
            this.K = null;
            this.M = null;
        }
    }

    public final azyx b() {
        return this.g;
    }

    public final /* bridge */ /* synthetic */ azzs c() {
        o();
        return this;
    }

    public final /* bridge */ /* synthetic */ azzs d() {
        p();
        return this;
    }

    public final void e() {
        this.l.execute(new bail(this));
    }

    public final void f() {
        this.l.execute(new baik(this));
    }

    public final void g() {
        if (this.z) {
            for (bahv bahv : this.u) {
                babj babj = c;
                bahv.a(babj);
                bahv.e.execute(new bahk(bahv, babj));
            }
            Iterator it = this.v.iterator();
            if (it.hasNext()) {
                baka baka = (baka) it.next();
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.l.b();
        if (!this.y.get() && !this.t) {
            if (this.J.a()) {
                b(false);
            } else {
                j();
            }
            if (this.r == null) {
                this.E.a(2, "Exiting idle mode");
                baix baix = new baix(this);
                baix.a = new badk(this.S, baix);
                this.r = baix;
                this.Z.a(new baao(this, baix, this.Z));
                this.q = true;
            }
        }
    }

    public final void i() {
        a(true);
        this.w.a((azzm) null);
        this.E.a(2, "Entering IDLE state");
        this.o.a(azxz.IDLE);
        if (this.J.a()) {
            h();
        }
    }

    public final void j() {
        long j2 = this.W;
        if (j2 != -1) {
            bakt bakt = this.ac;
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
            long a2 = bakt.a() + nanos;
            bakt.e = true;
            if (a2 - bakt.d < 0 || bakt.f == null) {
                ScheduledFuture scheduledFuture = bakt.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                bakt.f = bakt.a.schedule(new baks(bakt), nanos, TimeUnit.NANOSECONDS);
            }
            bakt.d = a2;
        }
    }

    public final void k() {
        this.l.b();
        q();
        l();
    }

    public final void l() {
        this.l.b();
        if (this.q) {
            this.Z.c();
        }
    }

    public final void m() {
        this.H = true;
        bald bald = this.X;
        bald.a.set(this.G);
        bald.b = true;
    }

    public final void n() {
        if (!this.B && this.y.get() && this.u.isEmpty() && this.v.isEmpty()) {
            this.E.a(2, "Terminated");
            azyv.b(this.F.c, this);
            this.U.a(this.i);
            this.V.b();
            this.j.b();
            this.h.close();
            this.B = true;
            this.aa.countDown();
        }
    }

    public final void o() {
        this.E.a(1, "shutdown() called");
        if (this.y.compareAndSet(false, true)) {
            this.l.a(new baim(this));
            this.x.a(d);
            this.l.execute(new baih(this));
        }
    }

    public final void p() {
        ArrayList arrayList;
        this.E.a(1, "shutdownNow() called");
        o();
        bajh bajh = this.x;
        babj babj = c;
        bajh.a(babj);
        synchronized (bajh.a) {
            arrayList = new ArrayList(bajh.b);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((baef) arrayList.get(i2)).b(babj);
        }
        bajh.d.w.b(babj);
        this.l.execute(new bain(this));
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("logId", this.g.a);
        a2.a("target", (Object) this.P);
        return a2.toString();
    }

    public final void b(boolean z2) {
        ScheduledFuture scheduledFuture;
        bakt bakt = this.ac;
        bakt.e = false;
        if (z2 && (scheduledFuture = bakt.f) != null) {
            scheduledFuture.cancel(false);
            bakt.f = null;
        }
    }

    public final azxl a(baaj baaj, azxh azxh) {
        return this.Y.a(baaj, azxh);
    }

    public final String a() {
        return this.Y.a();
    }

    public final void a(azzm azzm) {
        this.s = azzm;
        this.w.a(azzm);
    }

    public final void a(String str) {
        try {
            this.l.b();
        } catch (IllegalStateException e2) {
            a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl", "logWarningIfNotInSyncContext", str.concat(" should be called from SynchronizationContext. This warning will become an exception in a future release. See https://github.com/grpc/grpc-java/issues/5015 for more details"), e2);
        }
    }

    public final void a(boolean z2) {
        boolean z3;
        this.l.b();
        if (z2) {
            amrl.b(this.q, (Object) "nameResolver is not started");
            if (this.r != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            amrl.b(z3, (Object) "lbHelper is null");
        }
        if (this.Z != null) {
            q();
            this.Z.b();
            this.q = false;
            if (z2) {
                this.Z = a(this.P, this.Q, this.R);
            } else {
                this.Z = null;
            }
        }
        baix baix = this.r;
        if (baix != null) {
            badk badk = baix.a;
            badk.b.a();
            badk.b = null;
            this.r = null;
        }
        this.s = null;
    }

    public final boolean a(TimeUnit timeUnit) {
        return this.aa.await(10, timeUnit);
    }
}
