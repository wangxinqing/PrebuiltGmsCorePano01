package com.google.android.gms.ads.internal.util.future;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.d;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class b implements Executor {
    private final Handler a = new d(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.b.a();
                com.google.android.gms.ads.internal.b.b();
                throw th;
            }
        } else {
            this.a.post(runnable);
        }
    }
}
