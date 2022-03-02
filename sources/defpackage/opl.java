package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import java.io.Closeable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: opl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opl extends ope implements Closeable {
    public int c;
    public int d;
    public SSLSocketFactory e;
    private Context f;

    public opl(Context context) {
        this(context, true);
    }

    public final HttpURLConnection a(URL url) {
        return a(url, (Network) null);
    }

    @Deprecated
    public final void close() {
    }

    public opl(Context context, boolean z) {
        this(context, z, opd.PERMIT_ALL);
    }

    public final HttpURLConnection a(URL url, Network network) {
        URLConnection uRLConnection;
        SSLSocketFactory sSLSocketFactory;
        Bundle a;
        String string;
        iva.a((Object) url);
        iva.a((Object) url);
        if (!(this.b == opd.PERMIT_NONE || (a = this.a.a(url.toString())) == null)) {
            if (a.getString("block") != null) {
                String string2 = a.getString("name");
                String valueOf = String.valueOf(url);
                StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 13 + String.valueOf(valueOf).length());
                sb.append("Blocked by ");
                sb.append(string2);
                sb.append(": ");
                sb.append(valueOf);
                Log.w("GoogleURLConnFactory", sb.toString());
                throw new opf(a);
            } else if (this.b == opd.PERMIT_ALL && (string = a.getString("rewrite")) != null && (URLUtil.isHttpUrl(string) || URLUtil.isHttpsUrl(string))) {
                url = new URL(string);
            }
        }
        if (network != null) {
            this.f.getSystemService("connectivity");
            uRLConnection = network.openConnection(url);
        } else {
            uRLConnection = url.openConnection();
        }
        uRLConnection.setConnectTimeout(this.d);
        uRLConnection.setReadTimeout(this.c);
        if ((uRLConnection instanceof HttpsURLConnection) && (sSLSocketFactory = this.e) != null) {
            ((HttpsURLConnection) uRLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return (HttpURLConnection) uRLConnection;
    }

    public opl(Context context, boolean z, opd opd) {
        super(context, opd);
        this.c = 60000;
        this.d = 60000;
        this.f = context;
        if (z) {
            this.e = aamu.a(60000, context);
        }
    }
}
