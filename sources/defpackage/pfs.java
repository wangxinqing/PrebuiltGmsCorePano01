package defpackage;

import java.util.concurrent.Executor;

/* renamed from: pfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pfs implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;
    private final bapu g;

    public pfs(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
        this.e = bapu5;
        this.f = bapu6;
        this.g = bapu7;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aalw b2 = ((pfq) this.f).a();
        pes b3 = ((pet) this.g).a();
        amsv b4 = pfn.b();
        aelh aelh = pba.aa;
        awdx.a((Object) aelh, "Cannot return null from a non-@Nullable @Provides method");
        aelh aelh2 = pba.s;
        awdx.a((Object) aelh2, "Cannot return null from a non-@Nullable @Provides method");
        aelh aelh3 = pba.t;
        awdx.a((Object) aelh3, "Cannot return null from a non-@Nullable @Provides method");
        return new pez(awds.b(this.a), ((pde) this.b).a(), ((pfo) this.c).a(), awds.b(this.d), (Executor) this.e.a(), b2, b3, b4, aelh, aelh2, aelh3);
    }
}
