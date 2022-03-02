package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sgb implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;
    private final bapu g;

    public sgb(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
        this.e = bapu5;
        this.f = bapu6;
        this.g = bapu7;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afvq b2 = ((sfw) this.e).a();
        sgc sgc = (sgc) this.g.a();
        afxl afxl = new afxl((afua) this.a.a(), ((sfy) this.b).a(), ((sfx) this.c).a(), (afvi) this.d.a(), new sft(b2), new sfu(b2), (Executor) this.f.a(), sfv.a);
        awdx.a((Object) afxl, "Cannot return null from a non-@Nullable @Provides method");
        return afxl;
    }
}
