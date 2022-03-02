package defpackage;

/* renamed from: qqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqp implements awdt {
    private final bapu a;

    public qqp(bapu bapu) {
        this.a = bapu;
    }

    public static qqp a(bapu bapu) {
        return new qqp(bapu);
    }

    /* renamed from: b */
    public final qsx a() {
        qsx qsx = new qsx(qsy.a(((qqe) this.a).a()));
        awdx.a((Object) qsx, "Cannot return null from a non-@Nullable @Provides method");
        return qsx;
    }
}
