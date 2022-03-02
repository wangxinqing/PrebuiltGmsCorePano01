package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sgf implements awdt {
    private final bapu a;
    private final bapu b;

    public sgf(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afvi afvi = new afvi((Executor) this.a.a(), (agzs) this.b.a());
        awdx.a((Object) afvi, "Cannot return null from a non-@Nullable @Provides method");
        return afvi;
    }
}
