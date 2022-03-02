package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: jfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jfp extends HandlerThread implements RejectedExecutionHandler {
    public final jfz a;
    private boolean b = false;

    public jfp(int i) {
        super("PooledHandlerThread", i);
        jfz jfz = new jfz(1, i);
        this.a = jfz;
        jfz.setRejectedExecutionHandler(this);
    }

    public final Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public final boolean quit() {
        this.a.shutdownNow();
        return this.b;
    }

    public final boolean quitSafely() {
        this.a.shutdown();
        return this.b;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
    }

    public final synchronized void start() {
        this.b = true;
    }

    public jfp(String str, int i) {
        super(str, i);
        jfj jfj = new jfj(str, i);
        this.a = jfj;
        jfj.setRejectedExecutionHandler(this);
    }
}
