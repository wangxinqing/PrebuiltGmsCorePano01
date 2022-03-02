package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sig implements awdt {
    private final bapu a;

    public sig(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afsx afsx = new afsx(aeko.b(), (Executor) this.a.a());
        awdx.a((Object) afsx, "Cannot return null from a non-@Nullable @Provides method");
        return afsx;
    }
}
