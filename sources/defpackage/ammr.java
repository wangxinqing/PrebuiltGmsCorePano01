package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: ammr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammr implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b = null;

    public ammr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ammr) {
            ammr ammr = (ammr) obj;
            if (Objects.equals(this.a, ammr.a)) {
                Long l = ammr.b;
                if (Objects.equals((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, null});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("tokenValue", (Object) this.a);
        a2.a("expirationTimeMillis", (Object) null);
        return a2.toString();
    }
}
