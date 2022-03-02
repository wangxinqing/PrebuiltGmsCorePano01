package defpackage;

import java.util.Arrays;

/* renamed from: ashy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ashy {
    public final long a;
    public final long b;

    public ashy(long j, long j2) {
        boolean z = true;
        iva.b(j >= 0);
        iva.b(j2 >= 0);
        iva.b(j2 > j ? false : z);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ashy) {
            ashy ashy = (ashy) obj;
            return ashy.a == this.a && ashy.b == this.b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
