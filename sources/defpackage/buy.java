package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* renamed from: buy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class buy implements but {
    private final jfo a;

    public buy(jfp jfp) {
        this.a = new jfo(jfp);
    }

    public final Executor a(bvp bvp) {
        return new buw(this, bvp);
    }

    public final void a(Runnable runnable) {
        this.a.removeCallbacksAndMessages(runnable);
    }

    public final void a(Runnable runnable, long j, bvp bvp) {
        this.a.postAtTime(new bux(runnable, bvp), runnable, SystemClock.uptimeMillis() + j);
    }

    public final void a(Runnable runnable, bvp bvp) {
        this.a.postAtTime(new bux(runnable, bvp), runnable, SystemClock.uptimeMillis());
    }
}
