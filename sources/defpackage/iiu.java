package defpackage;

import android.net.SSLCertificateSocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: iiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iiu {
    public static final iwd a = new iwd("Auth", "ReflectiveChannelBinder");
    public final SSLSocketFactory b;

    public iiu(SSLSocketFactory sSLSocketFactory) {
        iva.a((Object) sSLSocketFactory);
        this.b = sSLSocketFactory;
        if (sSLSocketFactory instanceof SSLCertificateSocketFactory) {
            a.b("Using android.net.SSLCertificateSocketFactory", new Object[0]);
        }
        if (this.b instanceof aamu) {
            a.b("Using conscrypt SSLCertificateSocketFactory", new Object[0]);
        }
    }
}
