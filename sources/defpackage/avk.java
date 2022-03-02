package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: avk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class avk extends FutureTask {
    final /* synthetic */ avl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avk(avl avl, Callable callable) {
        super(callable);
        this.a = avl;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        if (!isCancelled()) {
            try {
                Executor executor = avl.a;
                this.a.a((avi) get());
            } catch (InterruptedException | ExecutionException e) {
                avl avl = this.a;
                avi avi = new avi(e);
                Executor executor2 = avl.a;
                avl.a(avi);
            }
        }
    }
}
