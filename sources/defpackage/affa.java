package defpackage;

/* renamed from: affa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class affa implements amqy {
    private final affb a;
    private final long b;
    private final boolean c;
    private final affr d;
    private final Long e;
    private final boolean f;
    private final boolean g;

    public affa(affb affb, long j, boolean z, affr affr, Long l, boolean z2, boolean z3) {
        this.a = affb;
        this.b = j;
        this.c = z;
        this.d = affr;
        this.e = l;
        this.f = z2;
        this.g = z3;
    }

    public final Object a(Object obj) {
        affb affb = this.a;
        long j = this.b;
        boolean z = this.c;
        affr affr = this.d;
        Long l = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        aokp aokp = (aokp) obj;
        synchronized (affb.k.j) {
            aucd aucd = (aucd) aokp.c(5);
            aucd.a((aucj) aokp);
            affb.a(j, z, affr, l, z2, z3, aucd);
        }
        return null;
    }
}
