package defpackage;

import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import javax.net.SocketFactory;

/* renamed from: avzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzg implements URLStreamHandlerFactory, Cloneable {
    private final avze a;

    public avzg(avze avze) {
        this.a = avze;
    }

    public final HttpURLConnection a(URL url) {
        return a(url, this.a.c);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new avzg(this.a.clone());
    }

    public final URLStreamHandler createURLStreamHandler(String str) {
        if (str.equals("http") || str.equals("https")) {
            return new avzf(this, str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final HttpURLConnection a(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        avze avze = new avze(this.a);
        if (avze.f == null) {
            avze.f = ProxySelector.getDefault();
        }
        if (avze.g == null) {
            avze.g = CookieHandler.getDefault();
        }
        if (avze.h == null) {
            avze.h = SocketFactory.getDefault();
        }
        if (avze.i == null) {
            avze.i = avze.b();
        }
        if (avze.j == null) {
            avze.j = awdm.a;
        }
        if (avze.k == null) {
            avze.k = avyn.a;
        }
        if (avze.t == null) {
            avze.t = awcb.a;
        }
        if (avze.l == null) {
            avze.l = avys.a;
        }
        if (avze.d == null) {
            avze.d = avze.a;
        }
        if (avze.e == null) {
            avze.e = avze.b;
        }
        if (avze.m == null) {
            avze.m = avyy.a;
        }
        avze.c = proxy;
        if (protocol.equals("http")) {
            return new awdg(url, avze);
        }
        if (protocol.equals("https")) {
            return new awdh(new awdg(url, avze));
        }
        String valueOf = String.valueOf(protocol);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected protocol: ") : "Unexpected protocol: ".concat(valueOf));
    }
}
