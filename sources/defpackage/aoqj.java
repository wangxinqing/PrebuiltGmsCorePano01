package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: aoqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqj extends aoqk {
    final /* synthetic */ aoql a;
    private final Callable d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoqj(aoql aoql, Callable callable, Executor executor) {
        super(aoql, executor);
        this.a = aoql;
        amrl.a((Object) callable);
        this.d = callable;
    }

    public final String a() {
        return this.d.toString();
    }

    public final Object b() {
        this.b = false;
        return this.d.call();
    }

    public final void a(Object obj) {
        this.a.b(obj);
    }
}
