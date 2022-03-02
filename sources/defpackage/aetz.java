package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aetz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aetz implements bapu {
    private final aeuo a;

    public aetz(aeuo aeuo) {
        this.a = aeuo;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Executor f = this.a.f();
        awdx.a((Object) f, "Cannot return null from a non-@Nullable component method");
        return f;
    }
}
