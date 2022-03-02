package defpackage;

/* renamed from: aglt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aglt implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public aglt(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        bapu bapu = this.a;
        amri b2 = ((ageh) this.c).a();
        if (!((agic) this.b.a()).b && b2.a() && ((aghc) b2.b()).a() && aglr.a((aghc) b2.b())) {
            obj = amri.b((aglo) bapu.a());
        } else {
            obj = ampu.a;
        }
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
