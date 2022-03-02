package defpackage;

/* renamed from: amdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amdc {
    public final long a;
    public final long b;

    public amdc(long j, long j2) {
        boolean z = true;
        amrl.a(j >= 0);
        amrl.a(j2 < j ? false : z);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amdc) {
            amdc amdc = (amdc) obj;
            return this.b == amdc.b && this.a == amdc.a;
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return String.format("ByteRange{start=%d, end=%d}", new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
