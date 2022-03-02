package defpackage;

/* renamed from: qqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqo implements awdt {
    private final bapu a;

    public qqo(bapu bapu) {
        this.a = bapu;
    }

    public static qqo a(bapu bapu) {
        return new qqo(bapu);
    }

    /* renamed from: b */
    public final aplf a() {
        aplf a2 = aplf.a(((qqe) this.a).a());
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
