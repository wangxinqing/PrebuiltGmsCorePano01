package defpackage;

/* renamed from: aeql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeql implements awdt {
    private final bapu a;

    public aeql(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        pcz b = pdb.b();
        b.getClass();
        afbv afbv = new afbv(new aeqg(b), new aeqa((aeqd) this.a.a()));
        awdx.a((Object) afbv, "Cannot return null from a non-@Nullable @Provides method");
        return afbv;
    }
}
