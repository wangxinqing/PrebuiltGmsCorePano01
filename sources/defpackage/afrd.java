package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrd implements awdt {
    private final afrc a;

    public afrd(afrc afrc) {
        this.a = afrc;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Executor executor = this.a.a;
        awdx.a((Object) executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
