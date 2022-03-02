package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqq implements awdt {
    public static final Executor b() {
        Executor executor = qqd.b;
        awdx.a((Object) executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }

    public static qqq c() {
        return new qqq();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
