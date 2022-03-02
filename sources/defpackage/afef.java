package defpackage;

/* renamed from: afef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afef implements awdt {
    private final bapu a;

    public afef(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afek b = ((afel) this.a).a();
        pcz b2 = pdb.b();
        b2.getClass();
        afbv afbv = new afbv(new afed(b2), b);
        awdx.a((Object) afbv, "Cannot return null from a non-@Nullable @Provides method");
        return afbv;
    }
}
