package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: agwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agwy implements Runnable {
    final /* synthetic */ aorv a;
    final /* synthetic */ TimeUnit b;

    public agwy(aorv aorv, TimeUnit timeUnit) {
        this.a = aorv;
        this.b = timeUnit;
    }

    public final void run() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Memory state is: ");
        sb.append(i);
        Log.w("ProcessReaper", sb.toString());
        if (runningAppProcessInfo.importance >= 400) {
            Log.w("ProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        agwu.a((aorr) this.a.a((Runnable) this, 10, this.b));
    }
}
