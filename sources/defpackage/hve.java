package defpackage;

import java.util.Arrays;

/* renamed from: hve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hve {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public hve(String str, long j, long j2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hve) {
            hve hve = (hve) obj;
            return this.a.equals(hve.a) && this.b == hve.b && this.c == hve.c && this.d == hve.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 102);
        sb.append("(log source:");
        sb.append(str);
        sb.append(" creation:");
        sb.append(j);
        sb.append(" deletion:");
        sb.append(j2);
        sb.append(" current:");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
