package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbs implements awdt {
    private final sbh a;

    public sbs(sbh sbh) {
        this.a = sbh;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Executor executor = this.a.a;
        awdx.a((Object) executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
