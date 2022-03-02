package defpackage;

/* renamed from: dgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dgb {
    public final dga a;
    public final dgm b;
    public final dfd c;
    public final dhe d;
    public final dhl e;
    public final as f;
    public final as g;

    public dgb(dga dga, dfd dfd, dhe dhe, dhl dhl, dgm dgm) {
        this.c = dfd;
        this.d = dhe;
        this.e = dhl;
        this.b = dgm;
        dfg dfg = (dfg) dga;
        aqsr aqsr = dfg.a;
        this.f = dfd.c(aqsr == null ? csm.a : aqsr);
        aqsr aqsr2 = dfg.b;
        this.g = bk.a(dfd.c(aqsr2 == null ? csm.a : aqsr2), dfz.a);
        this.a = dga;
    }

    public final aqro a() {
        return ((dfg) this.a).d;
    }

    public final dih b() {
        return this.c.b();
    }

    public final void a(aqsr aqsr, aqsr aqsr2) {
        this.d.a(aqsr, aqsr2, 7);
    }
}
