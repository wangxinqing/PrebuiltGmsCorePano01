package defpackage;

/* renamed from: aglu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aglu implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public aglu(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        bapu bapu = this.a;
        bapu bapu2 = this.b;
        amri b2 = ((ageh) this.c).a();
        if (b2.a()) {
            obj = anax.a((Object) (agkv) (!aglr.a((aghc) b2.b()) ? bapu2.a() : bapu.a()));
        } else {
            obj = anfv.a;
        }
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
