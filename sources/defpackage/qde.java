package defpackage;

import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: qde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qde {
    public final KeyPair a;
    public final long b;

    public qde(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final String a() {
        return qdu.a(this.a.getPublic().getEncoded());
    }

    public final String b() {
        return qdu.a(this.a.getPrivate().getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qde) {
            qde qde = (qde) obj;
            if (this.b != qde.b || !this.a.getPublic().equals(qde.a.getPublic()) || !this.a.getPrivate().equals(qde.a.getPrivate())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }
}
