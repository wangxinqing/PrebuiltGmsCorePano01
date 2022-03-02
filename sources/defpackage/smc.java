package defpackage;

/* renamed from: smc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smc implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public smc(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        sly sly = new sly(sib.b(), (amsv) this.a.a(), (agzs) this.c.a(), ((agzz) ((siz) this.b).a().a()).a());
        awdx.a((Object) sly, "Cannot return null from a non-@Nullable @Provides method");
        return sly;
    }
}
