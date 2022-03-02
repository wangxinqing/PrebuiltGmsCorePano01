package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: afnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afnd implements Executor {
    private final Executor a;
    private final int b;
    private final Object c = new Object();
    private int d = 0;
    private final Queue e = new ArrayDeque();

    public afnd(Executor executor, int i) {
        this.a = executor;
        this.b = i;
    }

    public final void a() {
        synchronized (this.c) {
            Runnable runnable = (Runnable) this.e.poll();
            if (runnable == null) {
                this.d--;
                return;
            }
            try {
                this.a.execute(new afnc(this, runnable));
            } catch (Throwable th) {
                afsh.a(th, "%s: Task submission failed: %s", "ThrottlingExecutor", runnable);
                synchronized (this.c) {
                    this.d--;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        amrl.a((Object) runnable);
        synchronized (this.c) {
            int i = this.d;
            if (i < this.b) {
                this.d = i + 1;
                try {
                    this.a.execute(new afnc(this, runnable));
                } catch (Throwable th) {
                    synchronized (this.c) {
                        this.d--;
                        throw th;
                    }
                }
            } else {
                this.e.add(runnable);
            }
        }
    }
}
