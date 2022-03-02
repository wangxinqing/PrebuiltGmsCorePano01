package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: jls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jls implements Executor {
    private final Handler a;

    public jls(Handler handler) {
        this(handler.getLooper());
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    public jls(Looper looper) {
        this.a = new qvr(looper);
    }
}
