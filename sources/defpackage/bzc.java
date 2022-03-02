package defpackage;

import java.util.Arrays;

/* renamed from: bzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzc implements Comparable {
    public long a;
    public long b;

    public bzc(long j, long j2) {
        iva.b(j2 >= j);
        this.a = j;
        this.b = j2;
    }

    public static bzc a(long j, long j2) {
        return new bzc(j, j2);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.a += j;
        this.b += j;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(long j) {
        return j >= this.a && j <= this.b;
    }

    /* access modifiers changed from: package-private */
    public final boolean c(long j) {
        return this.a <= j && this.b >= j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.a;
        long j2 = ((bzc) obj).a;
        if (j <= j2) {
            return j < j2 ? -1 : 0;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(long j) {
        return this.b - this.a >= j;
    }

    /* access modifiers changed from: package-private */
    public final boolean e(long j) {
        long j2 = this.a;
        return j2 >= 0 && j2 <= j && this.b <= j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bzc) {
            bzc bzc = (bzc) obj;
            return this.a == bzc.a && this.b == bzc.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Intrvl: [");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
