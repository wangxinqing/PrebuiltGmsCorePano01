package defpackage;

import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: guz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class guz extends gwg {
    public guz(X509Certificate x509Certificate) {
        super(x509Certificate);
    }

    public final void checkValidity() {
    }

    public final void checkValidity(Date date) {
    }

    public final Date getNotAfter() {
        return new Date(9223372036854775806L);
    }

    public final Date getNotBefore() {
        return new Date(1);
    }
}
