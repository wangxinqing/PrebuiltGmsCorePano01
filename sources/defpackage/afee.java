package defpackage;

/* renamed from: afee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afee implements awdt {
    private final bapu a;

    public afee(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        pjj b = ((pjk) this.a).a();
        pcz b2 = pdb.b();
        b2.getClass();
        pji a2 = b.a((aelh) new afec(b2), "mdh-subscription-cleanup");
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
