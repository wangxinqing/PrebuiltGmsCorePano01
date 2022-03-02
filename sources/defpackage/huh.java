package defpackage;

/* renamed from: huh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class huh implements Comparable {
    public final long a;
    public final long b;

    public huh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (((huh) obj).a > this.a ? 1 : (((huh) obj).a == this.a ? 0 : -1));
    }
}
