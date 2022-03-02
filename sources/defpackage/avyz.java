package defpackage;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: avyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyz {
    public final String a;
    public final List b;
    public final List c;

    private avyz(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public static avyz a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException e) {
                certificateArr = null;
            }
            List emptyList = certificateArr == null ? Collections.emptyList() : awaj.a((Object[]) certificateArr);
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new avyz(cipherSuite, emptyList, localCertificates != null ? awaj.a((Object[]) localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avyz) {
            avyz avyz = (avyz) obj;
            return this.a.equals(avyz.a) && this.b.equals(avyz.b) && this.c.equals(avyz.c);
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
