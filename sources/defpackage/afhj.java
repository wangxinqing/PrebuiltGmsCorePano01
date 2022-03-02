package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afhj implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public afhj(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aorr b2 = ((aeqi) this.b).a();
        awdn b3 = awds.b(this.c);
        pcz b4 = pdb.b();
        b4.getClass();
        afbv afbv = new afbv(new afhc(b4), new afhd(b4, b2, b3, (afhn) this.a.a(), (Executor) this.d.a()));
        awdx.a((Object) afbv, "Cannot return null from a non-@Nullable @Provides method");
        return afbv;
    }
}
