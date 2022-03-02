package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ijt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ijt implements Executor {
    static final Executor a = new ijt();

    private ijt() {
    }

    public final void execute(Runnable runnable) {
        (axda.a.a().d() ? new Handler(Looper.getMainLooper()) : new qvr(Looper.getMainLooper())).post(runnable);
    }
}
