package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: acwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acwf implements Executor {
    private final Handler a = new qvr(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
