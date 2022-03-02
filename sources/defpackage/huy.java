package defpackage;

import java.util.Arrays;

/* renamed from: huy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class huy {
    public long a;
    public long b;
    public long c;

    public huy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huy) {
            huy huy = (huy) obj;
            return this.a == huy.a && this.b == huy.b && this.c == huy.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.c), Long.valueOf(this.b)});
    }

    public huy(long j) {
        this.a = j;
        this.b = 0;
        this.c = 0;
    }
}
