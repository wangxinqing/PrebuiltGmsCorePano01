package defpackage;

import android.app.ActivityManager;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* renamed from: jnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jnm extends jnl {
    public final void a(AsyncTask asyncTask, Executor executor, Object... objArr) {
        asyncTask.executeOnExecutor(executor, objArr);
    }

    public final boolean d() {
        return ActivityManager.isRunningInTestHarness();
    }

    public final int e() {
        return 4;
    }
}
