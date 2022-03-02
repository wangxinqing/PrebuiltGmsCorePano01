package defpackage;

import java.util.Arrays;

/* renamed from: vgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgo {
    public final tgh a;
    public final auzb b;

    public vgo(tgh tgh, auzb auzb) {
        this.a = tgh;
        this.b = auzb;
    }

    public final String a() {
        String valueOf = String.valueOf(this.b.c);
        String valueOf2 = String.valueOf(this.a.a());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vgo) {
            vgo vgo = (vgo) obj;
            return ius.a(this.a, vgo.a) && ius.a(this.b, vgo.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("AdvertiseTokenParams{tokenId=%s, tokenParams=%s}", new Object[]{this.a, this.b});
    }
}
