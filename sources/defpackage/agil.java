package defpackage;

/* renamed from: agil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agil implements agig {
    public final agio a;
    private final agig b;

    public agil(agii agii, agio agio) {
        this.b = agii;
        this.a = agio;
    }

    public final synchronized aorr a(agif agif, String str, boolean z) {
        aorr a2;
        a2 = this.b.a(agif, str, z);
        a2.a(new agik(this, agif, str), aoqm.a);
        return a2;
    }

    public final void a() {
    }

    public final synchronized agif b() {
        agif b2;
        b2 = this.b.b();
        if (!agif.a(b2) && this.a.d.a() && agnn.b(aghz.a, "")) {
            b2.c = true;
        }
        return b2;
    }

    public final void c() {
        agnn.a(aghz.a);
    }

    public final aorr a(String str, boolean z, long j, long j2, barb barb) {
        return this.b.a(str, true, j, j2, barb);
    }
}
