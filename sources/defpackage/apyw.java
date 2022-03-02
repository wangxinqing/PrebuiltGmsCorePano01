package defpackage;

/* renamed from: apyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apyw implements awdt {
    private final bapu a;

    public apyw(bapu bapu) {
        this.a = bapu;
    }

    public static apyw a(bapu bapu) {
        return new apyw(bapu);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aeko.b();
        apzb apzb = new apzb((apzd) this.a.a());
        awdx.a((Object) apzb, "Cannot return null from a non-@Nullable @Provides method");
        return apzb;
    }
}
