package defpackage;

/* renamed from: qqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqk implements awdt {
    private final bapu a;

    public qqk(bapu bapu) {
        this.a = bapu;
    }

    public static qqk a(bapu bapu) {
        return new qqk(bapu);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        qsa qsa = new qsa(((qqr) this.a).a());
        awdx.a((Object) qsa, "Cannot return null from a non-@Nullable @Provides method");
        return qsa;
    }
}
