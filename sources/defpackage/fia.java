package defpackage;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.Arrays;

/* renamed from: fia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fia {
    private final String a;
    private final BeginSignInRequest b;

    public fia(String str, BeginSignInRequest beginSignInRequest) {
        iva.c(str);
        this.a = str;
        iva.a((Object) beginSignInRequest);
        this.b = beginSignInRequest;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fia) {
            fia fia = (fia) obj;
            if (!amqx.a(this.a, fia.a) || !amqx.a(this.b, fia.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
