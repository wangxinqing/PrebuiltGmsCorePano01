package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: ei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ei implements Executor {
    private final Executor a;
    private final ArrayDeque b = new ArrayDeque();
    private Runnable c;

    public ei(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            this.a.execute(runnable);
        }
    }

    public final synchronized void execute(Runnable runnable) {
        this.b.offer(new eh(this, runnable));
        if (this.c == null) {
            a();
        }
    }
}
