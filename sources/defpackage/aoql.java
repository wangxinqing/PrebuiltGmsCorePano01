package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: aoql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoql extends aopv {
    public static final /* synthetic */ int d = 0;
    public aoqk c;

    public aoql(amzn amzn, boolean z, Executor executor, aoqa aoqa) {
        super(amzn, z, false);
        this.c = new aoqi(this, aoqa, executor);
        f();
    }

    public final void a(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void c() {
        aoqk aoqk = this.c;
        if (aoqk != null) {
            aoqk.e();
        }
    }

    public final void g() {
        aoqk aoqk = this.c;
        if (aoqk != null) {
            aoqk.d();
        }
    }

    public aoql(amzn amzn, boolean z, Executor executor, Callable callable) {
        super(amzn, z, false);
        this.c = new aoqj(this, callable, executor);
        f();
    }

    public final void a(aopu aopu) {
        super.a(aopu);
        if (aopu == aopu.OUTPUT_FUTURE_DONE) {
            this.c = null;
        }
    }
}
