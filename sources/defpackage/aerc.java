package defpackage;

/* renamed from: aerc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerc implements awdt {
    private final bapu a;
    private final bapu b;

    public aerc(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        awfc a2 = awfj.a(this.a, this.b);
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
