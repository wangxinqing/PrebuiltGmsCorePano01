package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqm implements awdt {
    public static qqm b() {
        return new qqm();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Executor executor = qqd.b;
        awdx.a((Object) executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
