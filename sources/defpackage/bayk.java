package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;

/* renamed from: bayk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayk implements RefCounted {
    private final AtomicInteger a = new AtomicInteger(1);
    private final Runnable b;

    public bayk(Runnable runnable) {
        this.b = runnable;
    }

    public final void release() {
        Runnable runnable;
        int decrementAndGet = this.a.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        } else if (decrementAndGet == 0 && (runnable = this.b) != null) {
            runnable.run();
        }
    }

    public final void retain() {
        if (this.a.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }
}
