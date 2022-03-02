package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afbd implements bapu {
    private final afbj a;

    public afbd(afbj afbj) {
        this.a = afbj;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Executor f = this.a.f();
        awdx.a((Object) f, "Cannot return null from a non-@Nullable component method");
        return f;
    }
}
