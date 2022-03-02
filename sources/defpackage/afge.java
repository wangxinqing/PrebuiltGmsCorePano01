package defpackage;

/* renamed from: afge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afge implements awdt {
    private final afgc a;

    public afge(afgc afgc) {
        this.a = afgc;
    }

    public static afge a(afgc afgc) {
        return new afge(afgc);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aukh aukh = this.a.b;
        awdx.a((Object) aukh, "Cannot return null from a non-@Nullable @Provides method");
        return aukh;
    }
}
