package defpackage;

/* renamed from: agdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdr implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public agdr(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        boolean booleanValue = ((agdq) this.a).a().booleanValue();
        boolean booleanValue2 = ((agds) this.b).a().booleanValue();
        bapu bapu = this.c;
        bapu bapu2 = this.d;
        if (!booleanValue) {
            obj = agfg.a;
        } else if (!booleanValue2) {
            obj = ((agij) bapu2).a();
        } else {
            obj = ((agim) bapu).a();
        }
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
