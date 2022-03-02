package defpackage;

/* renamed from: afji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afji {
    private final anij a;
    private final anij b;
    private final afjk c;
    private final amsv d;
    private final amsv e;

    public afji(anij anij, anij anij2, afjk afjk, amsv amsv, amsv amsv2, afjj afjj) {
        afjj.a(afjj);
        this.a = anij;
        this.b = anij2;
        this.c = afjk;
        this.d = amsv;
        this.e = amsv2;
    }

    private final anij a(long j) {
        return !this.c.a(j) ? this.a : this.b;
    }

    public final anie b() {
        return a(((Long) this.d.a()).longValue()).c();
    }

    public final anie c() {
        return a(((Long) this.e.a()).longValue()).b();
    }

    public final anie a() {
        return this.a.d();
    }

    public final anie a(int i) {
        if (i != 5) {
            return c();
        }
        return b();
    }
}
