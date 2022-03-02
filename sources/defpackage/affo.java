package defpackage;

/* renamed from: affo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class affo implements awdt {
    private final bapu a;

    public affo(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        pcz b = pdb.b();
        b.getClass();
        afbv afbv = new afbv(new affg(b), new affh((affc) this.a.a()));
        awdx.a((Object) afbv, "Cannot return null from a non-@Nullable @Provides method");
        return afbv;
    }
}
