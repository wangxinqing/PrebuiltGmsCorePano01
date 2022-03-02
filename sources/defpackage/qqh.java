package defpackage;

/* renamed from: qqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqh implements awdt {
    private final bapu a;
    private final bapu b;

    public qqh(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public static qqh a(bapu bapu, bapu bapu2) {
        return new qqh(bapu, bapu2);
    }

    /* renamed from: b */
    public final qrm a() {
        qrm qrm = new qrm(((qqo) this.a).a(), qqq.b(), ((qqp) this.b).a());
        awdx.a((Object) qrm, "Cannot return null from a non-@Nullable @Provides method");
        return qrm;
    }
}
