package defpackage;

/* renamed from: qqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqn implements awdt {
    private final bapu a;

    public qqn(bapu bapu) {
        this.a = bapu;
    }

    public static qqn a(bapu bapu) {
        return new qqn(bapu);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        qsb qsb = new qsb(((qqr) this.a).a());
        awdx.a((Object) qsb, "Cannot return null from a non-@Nullable @Provides method");
        return qsb;
    }
}
