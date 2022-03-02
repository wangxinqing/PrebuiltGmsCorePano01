package defpackage;

/* renamed from: apye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apye implements awdt {
    private final bapu a;

    public apye(bapu bapu) {
        this.a = bapu;
    }

    public static apye a(bapu bapu) {
        return new apye(bapu);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aqal aqal = new aqal((apxy) this.a.a());
        awdx.a((Object) aqal, "Cannot return null from a non-@Nullable @Provides method");
        return aqal;
    }
}
