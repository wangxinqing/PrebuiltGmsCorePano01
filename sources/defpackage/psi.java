package defpackage;

import java.util.concurrent.Executor;

/* renamed from: psi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psi implements awdt {
    public static Executor b() {
        aoru b = jfm.b(10);
        awdx.a((Object) b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
