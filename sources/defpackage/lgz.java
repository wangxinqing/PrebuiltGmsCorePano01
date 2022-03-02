package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: lgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lgz implements lib {
    final /* synthetic */ URL a;
    final /* synthetic */ lha b;
    private final HttpURLConnection c = ((HttpURLConnection) jlk.a(this.a, 2818));

    public lgz(lha lha, URL url) {
        this.b = lha;
        this.a = url;
    }

    public final HttpURLConnection a() {
        return this.c;
    }

    public final lho b() {
        return this.b.a;
    }

    public final void close() {
        jlk.a(this.c);
    }
}
