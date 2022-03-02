package defpackage;

import java.io.Closeable;
import java.net.CookieHandler;
import java.net.Proxy;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: awcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awcs {
    public static final avzn a = new awcr();
    public final avze b;
    public final awde c;
    public final avzm d;
    public awcu e;
    public long f = -1;
    public boolean g;
    public final boolean h;
    public final avzj i;
    public avzj j;
    public avzm k;
    public avzm l;
    public batz m;
    public bate n;
    public awcc o;
    public awce p;

    public awcs(avze avze, avzj avzj, boolean z, awde awde, awda awda, avzm avzm) {
        awde awde2;
        avyn avyn;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        avze avze2 = avze;
        avzj avzj2 = avzj;
        this.b = avze2;
        this.i = avzj2;
        this.h = z;
        if (awde == null) {
            avys avys = avze2.l;
            if (avzj.c()) {
                SSLSocketFactory sSLSocketFactory2 = avze2.i;
                hostnameVerifier = avze2.j;
                sSLSocketFactory = sSLSocketFactory2;
                avyn = avze2.k;
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                avyn = null;
            }
            avzd avzd = avzj2.a;
            String str = avzd.b;
            int i2 = avzd.c;
            avyy avyy = avze2.m;
            SocketFactory socketFactory = avze2.h;
            awcb awcb = avze2.t;
            Proxy proxy = avze2.c;
            awde2 = new awde(avys, new avyj(str, i2, avyy, socketFactory, sSLSocketFactory, hostnameVerifier, avyn, awcb, proxy, avze2.d, avze2.e, avze2.f));
        } else {
            awde2 = awde;
        }
        this.c = awde2;
        this.m = awda;
        this.d = avzm;
    }

    public static avzm a(avzm avzm) {
        if (avzm == null || avzm.g == null) {
            return avzm;
        }
        avzl a2 = avzm.a();
        a2.g = null;
        return a2.a();
    }

    public static boolean c(avzm avzm) {
        if (avzm.a.b.equals("HEAD")) {
            return false;
        }
        int i2 = avzm.c;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && awcw.a(avzm) == -1 && !"chunked".equalsIgnoreCase(avzm.a("Transfer-Encoding"))) ? false : true;
    }

    public final avzm b(avzm avzm) {
        avzn avzn;
        if (!this.g || !"gzip".equalsIgnoreCase(this.l.a("Content-Encoding")) || (avzn = avzm.g) == null) {
            return avzm;
        }
        batl batl = new batl(avzn.b());
        avza b2 = avzm.f.b();
        b2.a("Content-Encoding");
        b2.a("Content-Length");
        avzb a2 = b2.a();
        avzl a3 = avzm.a();
        a3.a(a2);
        a3.g = new awcx(batq.a((baua) batl));
        return a3.a();
    }

    public final boolean c() {
        return this.l != null;
    }

    public final avzm d() {
        avzm avzm = this.l;
        if (avzm != null) {
            return avzm;
        }
        throw new IllegalStateException();
    }

    public final avyq e() {
        return this.c.b();
    }

    public final awde f() {
        bate bate = this.n;
        if (bate == null) {
            batz batz = this.m;
            if (batz != null) {
                awaj.a((Closeable) batz);
            }
        } else {
            awaj.a((Closeable) bate);
        }
        avzm avzm = this.l;
        if (avzm != null) {
            awaj.a((Closeable) avzm.g);
        } else {
            this.c.e();
        }
        return this.c;
    }

    public final void a() {
        if (this.f == -1) {
            this.f = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(avzb avzb) {
        CookieHandler cookieHandler = this.b.g;
        if (cookieHandler != null) {
            cookieHandler.put(this.i.a(), awcw.a(avzb, (String) null));
        }
    }

    public final batz b() {
        if (this.p != null) {
            return this.m;
        }
        throw new IllegalStateException();
    }

    public final boolean a(avzd avzd) {
        avzd avzd2 = this.i.a;
        return avzd2.b.equals(avzd.b) && avzd2.c == avzd.c && avzd2.a.equals(avzd.a);
    }

    public final boolean a(avzj avzj) {
        return awct.b(avzj.b);
    }
}
