package defpackage;

/* renamed from: qqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqj implements awdt {
    private final bapu a;
    private final bapu b;

    public qqj(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public static qqj a(bapu bapu, bapu bapu2) {
        return new qqj(bapu, bapu2);
    }

    /* renamed from: b */
    public final qrn a() {
        qrn qrn = new qrn(((qqo) this.a).a(), qqq.b(), ((qqp) this.b).a());
        awdx.a((Object) qrn, "Cannot return null from a non-@Nullable @Provides method");
        return qrn;
    }
}
