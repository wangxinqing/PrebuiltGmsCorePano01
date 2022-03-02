package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: avyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyj {
    public final avzd a;
    public final avyy b;
    public final SocketFactory c;
    public final List d;
    public final List e;
    public final ProxySelector f;
    public final Proxy g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final avyn j;
    public final awcb k;

    public avyj(String str, int i2, avyy avyy, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, avyn avyn, awcb awcb, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        avzc avzc = new avzc();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        avzc.c(str2);
        avzc.b(str);
        avzc.a(i2);
        this.a = avzc.b();
        if (avyy != null) {
            this.b = avyy;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (awcb != null) {
                    this.k = awcb;
                    if (list != null) {
                        this.d = awaj.a(list);
                        if (list2 != null) {
                            this.e = awaj.a(list2);
                            if (proxySelector != null) {
                                this.f = proxySelector;
                                this.g = proxy;
                                this.h = sSLSocketFactory;
                                this.i = hostnameVerifier;
                                this.j = avyn;
                                return;
                            }
                            throw new IllegalArgumentException("proxySelector == null");
                        }
                        throw new IllegalArgumentException("connectionSpecs == null");
                    }
                    throw new IllegalArgumentException("protocols == null");
                }
                throw new IllegalArgumentException("authenticator == null");
            }
            throw new IllegalArgumentException("socketFactory == null");
        }
        throw new IllegalArgumentException("dns == null");
    }

    @Deprecated
    public final String a() {
        return this.a.b;
    }

    @Deprecated
    public final int b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avyj) {
            avyj avyj = (avyj) obj;
            return this.a.equals(avyj.a) && this.b.equals(avyj.b) && this.k.equals(avyj.k) && this.d.equals(avyj.d) && this.e.equals(avyj.e) && this.f.equals(avyj.f) && awaj.a((Object) this.g, (Object) avyj.g) && awaj.a((Object) this.h, (Object) avyj.h) && awaj.a((Object) this.i, (Object) avyj.i) && awaj.a((Object) this.j, (Object) avyj.j);
        }
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.k.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Proxy proxy = this.g;
        int i2 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.h;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.i;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        avyn avyn = this.j;
        if (avyn != null) {
            i2 = avyn.hashCode();
        }
        return hashCode4 + i2;
    }
}
