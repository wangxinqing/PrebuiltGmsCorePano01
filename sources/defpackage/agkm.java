package defpackage;

/* renamed from: agkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkm {
    public final baqx a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final baql f;
    public final String g;
    public final Boolean h;
    public final barb i;

    public agkm(baqx baqx, Long l, Long l2, Long l3, Long l4, baql baql, String str, Boolean bool, barb barb) {
        this.a = baqx;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = baql;
        this.g = str;
        this.h = bool;
        this.i = barb;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", new Object[]{this.b, this.c, this.d, this.e, this.g});
    }
}
