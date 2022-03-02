package defpackage;

/* renamed from: affp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class affp implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public affp(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        affk affk = new affk((affc) this.b.a(), awds.b(this.a), awds.b(this.c));
        awdx.a((Object) affk, "Cannot return null from a non-@Nullable @Provides method");
        return affk;
    }
}
