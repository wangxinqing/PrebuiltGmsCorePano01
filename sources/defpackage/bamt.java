package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bamt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bamt implements baep, bamc {
    private static final Map F;
    private static final baml[] G = new baml[0];
    public static final Logger a = Logger.getLogger(bamt.class.getName());
    public long A;
    public final Runnable B;
    public final int C;
    public final balu D;
    final azyp E;
    private final azyx H;
    private int I;
    private final balc J;
    private final int K;
    private boolean L;
    private boolean M;
    private ScheduledExecutorService N;
    private final baha O = new bamm(this);
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final Random e = new Random();
    public final int f;
    public bajn g;
    public bamd h;
    public banf i;
    public final Object j = new Object();
    public final Map k = new HashMap();
    public final Executor l;
    public int m;
    public bams n;
    public azxa o;
    public babj p;
    public bagz q;
    public boolean r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public int u = 0;
    public final LinkedList v = new LinkedList();
    public final banj w;
    public baic x;
    public boolean y;
    public long z;

    static {
        EnumMap enumMap = new EnumMap(bany.class);
        enumMap.put(bany.NO_ERROR, babj.n.a("No error: A GRPC status of OK should have been sent"));
        enumMap.put(bany.PROTOCOL_ERROR, babj.n.a("Protocol error"));
        enumMap.put(bany.INTERNAL_ERROR, babj.n.a("Internal error"));
        enumMap.put(bany.FLOW_CONTROL_ERROR, babj.n.a("Flow control error"));
        enumMap.put(bany.STREAM_CLOSED, babj.n.a("Stream closed"));
        enumMap.put(bany.FRAME_TOO_LARGE, babj.n.a("Frame too large"));
        enumMap.put(bany.REFUSED_STREAM, babj.o.a("Refused stream"));
        enumMap.put(bany.CANCEL, babj.c.a("Cancelled"));
        enumMap.put(bany.COMPRESSION_ERROR, babj.n.a("Compression error"));
        enumMap.put(bany.CONNECT_ERROR, babj.n.a("Connect error"));
        enumMap.put(bany.ENHANCE_YOUR_CALM, babj.k.a("Enhance your calm"));
        enumMap.put(bany.INADEQUATE_SECURITY, babj.i.a("Inadequate security"));
        F = Collections.unmodifiableMap(enumMap);
    }

    public bamt(InetSocketAddress inetSocketAddress, String str, String str2, azxa azxa, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, banj banj, azyp azyp, Runnable runnable, balu balu) {
        amrl.a((Object) inetSocketAddress, (Object) "address");
        this.b = inetSocketAddress;
        this.c = str;
        this.K = 4194304;
        this.f = 65535;
        amrl.a((Object) executor, (Object) "executor");
        this.l = executor;
        this.J = new balc(executor);
        this.I = 3;
        this.s = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.t = sSLSocketFactory;
        amrl.a((Object) banj, (Object) "connectionSpec");
        this.w = banj;
        baab baab = bagt.a;
        this.d = bagt.a("okhttp", str2);
        this.E = azyp;
        amrl.a((Object) runnable, (Object) "tooManyPingsRunnable");
        this.B = runnable;
        this.C = Integer.MAX_VALUE;
        amrl.a((Object) balu);
        this.D = balu;
        this.H = azyx.a((Class) getClass(), inetSocketAddress.toString());
        azwy a2 = azxa.a();
        a2.a(bagm.b, azxa);
        this.o = a2.a();
        synchronized (this.j) {
            amrl.a((Object) new bamn());
        }
    }

    public static babj a(bany bany) {
        babj babj = (babj) F.get(bany);
        if (babj != null) {
            return babj;
        }
        babj babj2 = babj.d;
        int i2 = bany.s;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown http2 error code: ");
        sb.append(i2);
        return babj2.a(sb.toString());
    }

    private final void f() {
        if (this.p != null && this.k.isEmpty() && this.v.isEmpty() && !this.r) {
            this.r = true;
            baic baic = this.x;
            if (baic != null) {
                baic.e();
                balk.b(bagt.m, this.N);
                this.N = null;
            }
            bagz bagz = this.q;
            if (bagz != null) {
                Throwable e2 = e();
                synchronized (bagz) {
                    if (!bagz.d) {
                        bagz.d = true;
                        bagz.e = e2;
                        Map map = bagz.c;
                        bagz.c = null;
                        for (Map.Entry entry : map.entrySet()) {
                            bagz.a((baia) entry.getKey(), (Executor) entry.getValue(), e2);
                        }
                    }
                }
                this.q = null;
            }
            if (!this.L) {
                this.L = true;
                this.h.a(bany.NO_ERROR, new byte[0]);
            }
            this.h.close();
        }
    }

    public final azxa a() {
        return this.o;
    }

    public final azyx b() {
        return this.H;
    }

    public final void c(baml baml) {
        if (!this.M) {
            this.M = true;
            baic baic = this.x;
            if (baic != null) {
                baic.c();
            }
        }
        if (baml.s) {
            this.O.a(baml, true);
        }
    }

    public final baml[] d() {
        baml[] bamlArr;
        synchronized (this.j) {
            bamlArr = (baml[]) this.k.values().toArray(G);
        }
        return bamlArr;
    }

    public final Throwable e() {
        synchronized (this.j) {
            babj babj = this.p;
            if (babj == null) {
                babk c2 = babj.o.a("Connection closed").c();
                return c2;
            }
            babk c3 = babj.c();
            return c3;
        }
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("logId", this.H.a);
        a2.a("address", (Object) this.b);
        return a2.toString();
    }

    public static String a(baua baua) {
        batd batd = new batd();
        while (baua.c(batd, 1) != -1) {
            if (batd.c(batd.b - 1) == 10) {
                long a2 = batd.a((byte) 10, 0);
                if (a2 != -1) {
                    return batd.f(a2);
                }
                batd batd2 = new batd();
                batd.b(batd2, Math.min(32, batd.b));
                long min = Math.min(batd.b, Long.MAX_VALUE);
                String c2 = batd2.j().c();
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 50);
                sb.append("\\n not found: limit=");
                sb.append(min);
                sb.append(" content=");
                sb.append(c2);
                sb.append(8230);
                throw new EOFException(sb.toString());
            }
        }
        String valueOf = String.valueOf(batd.j().c());
        throw new EOFException(valueOf.length() == 0 ? new String("\\n not found: ") : "\\n not found: ".concat(valueOf));
    }

    public final baml b(int i2) {
        baml baml;
        synchronized (this.j) {
            baml = (baml) this.k.get(Integer.valueOf(i2));
        }
        return baml;
    }

    public final void b(babj babj) {
        a(babj);
        synchronized (this.j) {
            Iterator it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((baml) entry.getValue()).h.b(babj, false, new baaf());
                b((baml) entry.getValue());
            }
            Iterator it2 = this.v.iterator();
            while (it2.hasNext()) {
                baml baml = (baml) it2.next();
                baml.h.b(babj, true, new baaf());
                b(baml);
            }
            this.v.clear();
            f();
        }
    }

    public final boolean c() {
        boolean z2 = false;
        while (!this.v.isEmpty() && this.k.size() < this.u) {
            a((baml) this.v.poll());
            z2 = true;
        }
        return z2;
    }

    public final void b(baml baml) {
        if (this.M && this.v.isEmpty() && this.k.isEmpty()) {
            this.M = false;
            baic baic = this.x;
            if (baic != null) {
                baic.d();
            }
        }
        if (baml.s) {
            this.O.a(baml, false);
        }
    }

    public final /* bridge */ /* synthetic */ baef a(baaj baaj, baaf baaf, azxh azxh) {
        Object obj;
        amrl.a((Object) baaj, (Object) "method");
        amrl.a((Object) baaf, (Object) "headers");
        balm a2 = balm.a(azxh, this.o);
        Object obj2 = this.j;
        synchronized (obj2) {
            try {
                obj = obj2;
                baml baml = new baml(baaj, baaf, this.h, this, this.i, this.j, this.K, this.f, this.c, this.d, a2, this.D, azxh);
                return baml;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final Runnable a(bajn bajn) {
        amrl.a((Object) bajn, (Object) "listener");
        this.g = bajn;
        if (this.y) {
            this.N = (ScheduledExecutorService) balk.a(bagt.m);
            baic baic = new baic(new baib(this), this.N, this.z, this.A);
            this.x = baic;
            baic.a();
        }
        if (this.b != null) {
            bamb bamb = new bamb(this.J, this);
            baoj baoj = new baoj();
            baoi baoi = new baoi(batq.a((batz) bamb));
            synchronized (this.j) {
                this.h = new bamd(this, baoi, new bamw(Level.FINE, bamt.class));
                this.i = new banf(this, this.h);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.J.execute(new bamq(this, countDownLatch, bamb, baoj));
            try {
                synchronized (this.j) {
                    bamd bamd = this.h;
                    try {
                        bamd.b.a();
                    } catch (IOException e2) {
                        bamd.a.a(e2);
                    }
                    baom baom = new baom();
                    baom.a(7, this.f);
                    bamd bamd2 = this.h;
                    bamd2.c.a(2, baom);
                    try {
                        bamd2.b.b(baom);
                    } catch (IOException e3) {
                        bamd2.a.a(e3);
                    }
                }
                countDownLatch.countDown();
                this.J.execute(new bamr(this));
                return null;
            } catch (Throwable th) {
                countDownLatch.countDown();
                throw th;
            }
        } else {
            synchronized (this.j) {
                this.h = new bamd(this, (baoa) null, (bamw) null);
                this.i = new banf(this, this.h);
            }
            this.J.execute(new bamo(this));
            return null;
        }
    }

    public final void a(int i2, babj babj, baeg baeg, boolean z2, bany bany, baaf baaf) {
        synchronized (this.j) {
            baml baml = (baml) this.k.remove(Integer.valueOf(i2));
            if (baml != null) {
                if (bany != null) {
                    this.h.a(i2, bany.CANCEL);
                }
                if (babj != null) {
                    bamk bamk = baml.h;
                    if (baaf == null) {
                        baaf = new baaf();
                    }
                    bamk.a(babj, baeg, z2, baaf);
                }
                if (!c()) {
                    f();
                    b(baml);
                }
            }
        }
    }

    public final void a(int i2, bany bany, babj babj) {
        synchronized (this.j) {
            if (this.p == null) {
                this.p = babj;
                this.g.a(babj);
            }
            if (bany != null) {
                if (!this.L) {
                    this.L = true;
                    this.h.a(bany, new byte[0]);
                }
            }
            Iterator it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i2) {
                    it.remove();
                    ((baml) entry.getValue()).h.a(babj, baeg.REFUSED, false, new baaf());
                    b((baml) entry.getValue());
                }
            }
            Iterator it2 = this.v.iterator();
            while (it2.hasNext()) {
                baml baml = (baml) it2.next();
                baml.h.a(babj, baeg.REFUSED, true, new baaf());
                b(baml);
            }
            this.v.clear();
            f();
        }
    }

    public final void a(babj babj) {
        synchronized (this.j) {
            if (this.p == null) {
                this.p = babj;
                this.g.a(babj);
                f();
            }
        }
    }

    public final void a(baml baml) {
        boolean z2;
        boolean z3 = true;
        if (baml.g == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.b(z2, (Object) "StreamId already assigned");
        this.k.put(Integer.valueOf(this.I), baml);
        c(baml);
        bamk bamk = baml.h;
        int i2 = this.I;
        baml baml2 = bamk.u;
        batd batd = baml.a;
        if (baml2.g != -1) {
            z3 = false;
        }
        amrl.b(z3, "the stream has been started with id %s", i2);
        bamk.u.g = i2;
        bamk.u.h.a();
        if (bamk.t) {
            bamd bamd = bamk.g;
            baml baml3 = bamk.u;
            boolean z4 = baml3.i;
            try {
                bamd.b.a(false, baml3.g, bamk.b);
            } catch (IOException e2) {
                bamd.a.a(e2);
            }
            bamk.u.d.a();
            bamk.b = null;
            if (bamk.c.b > 0) {
                bamk.h.a(bamk.d, bamk.u.g, bamk.c, bamk.e);
            }
            bamk.t = false;
        }
        if (baml.h() == baai.UNARY || baml.h() == baai.SERVER_STREAMING) {
            boolean z5 = baml.i;
        } else {
            this.h.b();
        }
        int i3 = this.I;
        if (i3 >= 2147483645) {
            this.I = Integer.MAX_VALUE;
            a(Integer.MAX_VALUE, bany.NO_ERROR, babj.o.a("Stream ids exhausted"));
            return;
        }
        this.I = i3 + 2;
    }

    public final void a(bany bany, String str) {
        a(0, bany, a(bany).b(str));
    }

    public final void a(Throwable th) {
        amrl.a((Object) th, (Object) "failureCause");
        a(0, bany.INTERNAL_ERROR, babj.o.b(th));
    }

    public final boolean a(int i2) {
        boolean z2;
        synchronized (this.j) {
            z2 = false;
            if (i2 < this.I && (i2 & 1) == 1) {
                z2 = true;
            }
        }
        return z2;
    }
}
