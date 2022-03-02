package defpackage;

/* renamed from: qqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqi implements awdt {
    private final bapu a;

    public qqi(bapu bapu) {
        this.a = bapu;
    }

    public static qqi a(bapu bapu) {
        return new qqi(bapu);
    }

    /* renamed from: b */
    public final qrz a() {
        qrz qrz = new qrz(((qqr) this.a).a());
        awdx.a((Object) qrz, "Cannot return null from a non-@Nullable @Provides method");
        return qrz;
    }
}
