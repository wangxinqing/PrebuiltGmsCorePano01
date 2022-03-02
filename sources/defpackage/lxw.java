package defpackage;

import android.os.Process;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import java.util.concurrent.TimeoutException;

/* renamed from: lxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxw implements Runnable {
    final /* synthetic */ DroidGuardChimeraService a;
    private final Thread b;

    public lxw(DroidGuardChimeraService droidGuardChimeraService, Thread thread) {
        this.a = droidGuardChimeraService;
        this.b = thread;
    }

    public final void run() {
        TimeoutException timeoutException = new TimeoutException("FSC timeout");
        timeoutException.setStackTrace(this.b.getStackTrace());
        may.a(this.a).a((Throwable) timeoutException);
        Process.killProcess(Process.myPid());
    }
}
