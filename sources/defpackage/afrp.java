package defpackage;

/* renamed from: afrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrp implements awdt {
    private final afrg a;

    public afrp(afrg afrg) {
        this.a = afrg;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afmh afmh;
        afrg afrg = this.a;
        if (afrg.e.a()) {
            afmh = (afmh) afrg.e.b();
        } else {
            afmh = afre.a;
        }
        awdx.a((Object) afmh, "Cannot return null from a non-@Nullable @Provides method");
        return afmh;
    }
}
