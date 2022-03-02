package defpackage;

/* renamed from: qqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqr implements awdt {
    private final qqd a;
    private final bapu b;

    public qqr(qqd qqd, bapu bapu) {
        this.a = qqd;
        this.b = bapu;
    }

    public static qqr a(qqd qqd, bapu bapu) {
        return new qqr(qqd, bapu);
    }

    /* renamed from: b */
    public final qsf a() {
        qsf qsf = new qsf(((qqe) this.b).a().getContentResolver(), this.a.d);
        awdx.a((Object) qsf, "Cannot return null from a non-@Nullable @Provides method");
        return qsf;
    }
}
