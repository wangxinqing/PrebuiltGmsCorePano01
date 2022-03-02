package defpackage;

/* renamed from: dfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dfd {
    public final cuj a;
    public final ctf b;
    public final aw c;
    public final as d;
    public final cvm e;

    public dfd(cuj cuj, dih dih, cvm cvm, ctf ctf) {
        this.a = cuj;
        aw awVar = new aw();
        this.c = awVar;
        awVar.b(dih);
        aw awVar2 = this.c;
        ctf.getClass();
        this.d = bk.b(awVar2, new dfa(ctf));
        this.b = ctf;
        this.e = cvm;
    }

    public final void a() {
        dih b2 = b();
        cti cti = (cti) this.b;
        cry cry = (cry) cti.b.get(b2);
        if (cry != null && ((amri) cry.b()).a()) {
            cti.a(b2, cry);
        }
    }

    public final as b(aqsr aqsr) {
        return bk.b(this.c, new dfb(this, aqsr));
    }

    public final as c(aqsr aqsr) {
        return bk.b(this.c, new dfc(this, aqsr));
    }

    public final csl d(aqsr aqsr) {
        return (csl) this.a.b(b(), aqsr, this.e).b();
    }

    public final dih b() {
        return (dih) this.c.b();
    }

    public final void c() {
        this.a.c(b());
    }

    public final void a(aqsr aqsr) {
        this.a.c(b(), aqsr, this.e);
    }

    public final void a(String str) {
        this.c.b(dio.a(str));
    }
}
