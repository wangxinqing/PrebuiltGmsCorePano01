package defpackage;

/* renamed from: agkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agkk implements awdt {
    private final bapu a;
    private final bapu b;

    public agkk(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        bapu bapu = this.a;
        if (((aged) this.b).a().a()) {
            obj = anax.a((Object) (agkv) bapu.a());
        } else {
            obj = anfv.a;
        }
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
