package defpackage;

import android.net.Network;
import java.net.HttpURLConnection;

/* renamed from: lhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lhh implements lib {
    public final Network a;
    final /* synthetic */ lhi b;
    private final HttpURLConnection c;
    private final lho d = new lhg(this);

    public lhh(lhi lhi, Network network, HttpURLConnection httpURLConnection) {
        this.b = lhi;
        this.a = network;
        this.c = httpURLConnection;
    }

    public final HttpURLConnection a() {
        return this.c;
    }

    public final lho b() {
        return this.d;
    }

    public final void close() {
        jlk.a(this.c);
    }
}
