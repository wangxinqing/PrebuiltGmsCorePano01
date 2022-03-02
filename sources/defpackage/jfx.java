package defpackage;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import java.lang.Thread;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: jfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jfx extends Thread {
    private final ThreadPoolExecutor a;
    public volatile Thread b;
    public boolean c;
    public amko d;
    private final Runnable e;
    private boolean f;

    public jfx(int i) {
        this(i, (Runnable) null);
    }

    public final long getId() {
        throw new UnsupportedOperationException();
    }

    public final StackTraceElement[] getStackTrace() {
        try {
            return this.b.getStackTrace();
        } catch (NullPointerException e2) {
            return new StackTraceElement[0];
        }
    }

    public final Thread.State getState() {
        try {
            return this.b.getState();
        } catch (NullPointerException e2) {
            if (!this.f) {
                return Thread.State.NEW;
            }
            if (!this.c) {
                return Thread.State.RUNNABLE;
            }
            return Thread.State.TERMINATED;
        }
    }

    public final Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        throw new UnsupportedOperationException();
    }

    public final void interrupt() {
        try {
            this.b.interrupt();
        } catch (NullPointerException e2) {
        }
    }

    public final boolean isInterrupted() {
        try {
            return this.b.isInterrupted();
        } catch (NullPointerException e2) {
            return false;
        }
    }

    public final void setContextClassLoader(ClassLoader classLoader) {
        throw new UnsupportedOperationException();
    }

    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        throw new UnsupportedOperationException();
    }

    public final synchronized void start() {
        if (!this.f) {
            this.d = jez.a();
            this.a.execute(new jfw(this));
            this.f = true;
        } else {
            throw new IllegalThreadStateException("Thread already started");
        }
    }

    public final String toString() {
        Runnable runnable = this.e;
        if (runnable != null) {
            return runnable.toString();
        }
        return super.toString();
    }

    public jfx(int i, Runnable runnable) {
        super(runnable);
        this.f = false;
        this.b = null;
        this.c = false;
        this.a = GlobalExecutorsImpl.getPool(i);
        this.e = runnable;
        if (!jfa.a.c) {
            setPriority(i);
        }
    }
}
