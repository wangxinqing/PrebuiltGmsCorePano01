package defpackage;

/* renamed from: qqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqf implements awdt {
    private final bapu a;
    private final bapu b;

    public qqf(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public static qqf a(bapu bapu, bapu bapu2) {
        return new qqf(bapu, bapu2);
    }

    /* renamed from: b */
    public final qrk a() {
        qrk qrk = new qrk(((qqo) this.a).a(), qqq.b(), ((qqp) this.b).a());
        awdx.a((Object) qrk, "Cannot return null from a non-@Nullable @Provides method");
        return qrk;
    }
}
