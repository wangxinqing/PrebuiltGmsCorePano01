package defpackage;

import android.net.Network;
import android.net.NetworkRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: gwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwo extends gwf {
    private final gwn b = new gwn(ihs.b());
    private final amri c;

    public gwo(gwr gwr) {
        super(gwr);
        this.c = gwr.s.a() ? amri.b((NetworkRequest) gwr.s.b()) : ampu.a;
    }

    public final HttpURLConnection a(String str) {
        if (!this.c.a()) {
            return super.a(str);
        }
        amri a = this.b.a();
        if (!a.a()) {
            a = this.b.a((NetworkRequest) this.c.b(), awrq.l());
        }
        if (a.a()) {
            return super.b().a(new URL(str), (Network) a.b());
        }
        if (awrq.r()) {
            return super.a(str);
        }
        throw new IOException("Unable to acquire network");
    }

    public final HttpURLConnection a(String str, afzd afzd) {
        if (!this.c.a()) {
            return super.a(str, afzd);
        }
        amri a = this.b.a();
        if (!a.a()) {
            a = this.b.a((NetworkRequest) this.c.b(), awrq.l());
        }
        if (a.a()) {
            HttpURLConnection a2 = super.b().a(new URL(str), (Network) a.b());
            if (a2 instanceof HttpsURLConnection) {
                ((HttpsURLConnection) a2).setSSLSocketFactory(this.a);
            }
            a2.setRequestMethod("POST");
            return a2;
        } else if (awrq.r()) {
            return super.a(str, afzd);
        } else {
            throw new IOException("Unable to acquire network");
        }
    }
}
