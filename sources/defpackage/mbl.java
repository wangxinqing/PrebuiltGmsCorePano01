package defpackage;

/* renamed from: mbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbl {
    public final long a;
    public final long b;

    public mbl(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        long e = (axff.a.a().e() * 1000) + currentTimeMillis;
        long b2 = currentTimeMillis + (axff.a.a().b() * 1000);
        j2 = j2 < b2 ? b2 : j2;
        e = j2 <= e ? j2 : e;
        this.a = j > e ? e : j;
        this.b = e;
    }
}
