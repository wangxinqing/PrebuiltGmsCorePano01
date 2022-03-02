package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: awdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdh extends awdf {
    private final awdg a;

    public awdh(awdg awdg) {
        super(awdg);
        this.a = awdg;
    }

    /* access modifiers changed from: protected */
    public final avyz a() {
        awcs awcs = this.a.c;
        if (awcs != null) {
            return awcs.c() ? this.a.c.d().e : this.a.d;
        }
        throw new IllegalStateException("Connection has not yet been established");
    }

    public final long getContentLengthLong() {
        return this.a.getContentLengthLong();
    }

    public final long getHeaderFieldLong(String str, long j) {
        return this.a.getHeaderFieldLong(str, j);
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.a.a.j;
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.a.a.i;
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.a.setFixedLengthStreamingMode(j);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.a.a.j = hostnameVerifier;
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.a.a.i = sSLSocketFactory;
    }
}
