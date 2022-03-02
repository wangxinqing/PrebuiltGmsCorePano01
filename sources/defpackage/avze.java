package defpackage;

import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: avze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avze implements Cloneable {
    public static final List a = awaj.a((Object[]) new avzh[]{avzh.HTTP_2, avzh.SPDY_3, avzh.HTTP_1_1});
    public static final List b = awaj.a((Object[]) new avyu[]{avyu.a, avyu.b, avyu.c});
    private static SSLSocketFactory u;
    public Proxy c;
    public List d;
    public List e;
    public ProxySelector f;
    public CookieHandler g;
    public SocketFactory h;
    public SSLSocketFactory i;
    public HostnameVerifier j;
    public avyn k;
    public avys l;
    public avyy m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public awcb t;
    private final awah v;
    private final avyw w;
    private final List x;
    private final List y;

    static {
        awaa.b = new awaa();
    }

    public avze() {
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = 10000;
        this.r = 10000;
        this.s = 10000;
        this.v = new awah();
        this.w = new avyw();
    }

    public static final synchronized SSLSocketFactory b() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (avze.class) {
            if (u == null) {
                try {
                    SSLContext instance = SSLContext.getInstance("TLS");
                    instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                    u = instance.getSocketFactory();
                } catch (GeneralSecurityException e2) {
                    throw new AssertionError();
                }
            }
            sSLSocketFactory = u;
        }
        return sSLSocketFactory;
    }

    /* renamed from: a */
    public final avze clone() {
        return new avze(this);
    }

    public avze(avze avze) {
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = 10000;
        this.r = 10000;
        this.s = 10000;
        this.v = avze.v;
        this.w = avze.w;
        this.c = avze.c;
        this.d = avze.d;
        this.e = avze.e;
        this.x.addAll(avze.x);
        this.y.addAll(avze.y);
        this.f = avze.f;
        this.g = avze.g;
        this.h = avze.h;
        this.i = avze.i;
        this.j = avze.j;
        this.k = avze.k;
        this.t = avze.t;
        this.l = avze.l;
        this.m = avze.m;
        this.n = avze.n;
        this.o = avze.o;
        this.p = avze.p;
        this.q = avze.q;
        this.r = avze.r;
        this.s = avze.s;
    }
}
