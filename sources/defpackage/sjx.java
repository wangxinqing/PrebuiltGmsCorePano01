package defpackage;

/* renamed from: sjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sjx implements awdt {
    private final bapu a;
    private final bapu b;

    public sjx(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        sjl sjl = new sjl(new sjq(((sjw) this.a).a()), (afts) this.b.a());
        awdx.a((Object) sjl, "Cannot return null from a non-@Nullable @Provides method");
        return sjl;
    }
}
