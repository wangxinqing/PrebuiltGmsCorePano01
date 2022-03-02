package defpackage;

import java.util.concurrent.Executor;

/* renamed from: six  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class six implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public six(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        ahgm b2 = ((siy) this.d).a();
        ahej ahej = new ahej();
        ahej.a = (Executor) this.a.a();
        ahej.b = (agzs) this.b.a();
        ahej.a((ahgg) this.c.a(), b2);
        ahej.a(ahex.a);
        ahej.a(ahdx.a);
        ahei a2 = ahej.a();
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
