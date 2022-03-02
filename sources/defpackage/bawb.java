package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bawb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawb implements Executor {
    public final Executor a;
    public final Runnable b = new bawa(this);
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public bawb(Executor executor) {
        this.a = executor;
    }

    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException e) {
                this.c.removeLast();
            }
        }
    }
}
