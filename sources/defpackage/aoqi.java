package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aoqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqi extends aoqk {
    final /* synthetic */ aoql a;
    private final aoqa d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoqi(aoql aoql, aoqa aoqa, Executor executor) {
        super(aoql, executor);
        this.a = aoql;
        amrl.a((Object) aoqa);
        this.d = aoqa;
    }

    public final String a() {
        return this.d.toString();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        this.b = false;
        aorr a2 = this.d.a();
        amrl.a((Object) a2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) this.d);
        return a2;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.b((aorr) obj);
    }
}
