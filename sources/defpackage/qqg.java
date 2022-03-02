package defpackage;

/* renamed from: qqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqg implements awdt {
    private final bapu a;
    private final bapu b;

    public qqg(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public static qqg a(bapu bapu, bapu bapu2) {
        return new qqg(bapu, bapu2);
    }

    /* renamed from: b */
    public final qrl a() {
        qrl qrl = new qrl(((qqo) this.a).a(), qqq.b(), ((qqp) this.b).a());
        awdx.a((Object) qrl, "Cannot return null from a non-@Nullable @Provides method");
        return qrl;
    }
}
