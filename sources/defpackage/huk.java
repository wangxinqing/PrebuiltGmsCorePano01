package defpackage;

/* renamed from: huk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class huk implements Comparable {
    public final long a;
    private final long b;

    public huk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* renamed from: a */
    public final int compareTo(huk huk) {
        long j = this.a;
        long j2 = huk.a;
        if (j == j2) {
            j = this.b;
            j2 = huk.b;
        }
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
