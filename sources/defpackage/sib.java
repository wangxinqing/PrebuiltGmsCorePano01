package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sib implements awdt {
    public static Executor b() {
        aoru a = jfb.a(2, 10);
        awdx.a((Object) a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
