package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: avzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class avzf extends URLStreamHandler {
    final /* synthetic */ String a;
    final /* synthetic */ avzg b;

    public avzf(avzg avzg, String str) {
        this.b = avzg;
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final int getDefaultPort() {
        if (this.a.equals("http")) {
            return 80;
        }
        if (this.a.equals("https")) {
            return 443;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final URLConnection openConnection(URL url) {
        return this.b.a(url);
    }

    /* access modifiers changed from: protected */
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.b.a(url, proxy);
    }
}
