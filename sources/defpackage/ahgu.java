package defpackage;

/* renamed from: ahgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahgu implements ahgp {
    long a = 0;

    public final aqdf a() {
        aucd o = aqdf.c.o();
        long j = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdf aqdf = (aqdf) o.b;
        aqdf.a = 1;
        aqdf.b = Long.valueOf(j);
        return (aqdf) o.i();
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a += ((Long) obj).longValue();
    }
}
