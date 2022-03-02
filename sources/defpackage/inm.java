package defpackage;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: inm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class inm {
    public static Thread a(long j, inb inb) {
        Thread thread = new Thread(new ink(j, inb));
        thread.start();
        return thread;
    }

    public static void a(inb inb) {
        Log.i("RestartUtil", "Acquiring restart lock");
        try {
            if ((inb.a.equals(aogr.SCHEDULED_IDLE) || inb.a.equals(aogr.SCHEDULED_NOT_IDLE_DURING_WINDOW)) && axai.b()) {
                if (!iwc.a().b.a(Math.max(300, axai.a.a().f()), TimeUnit.SECONDS)) {
                    jis.a(inb.b, new RuntimeException("Unable to acquire periodic restart writer lock"), 67108864);
                }
            }
        } catch (InterruptedException e) {
            Log.e("RestartUtil", "Interrupted waiting for writer lock.", e);
            jis.a(inb.b, e, 67108864);
        } catch (Throwable th) {
            Log.i("RestartUtil", "Restarting.");
            Process.killProcess(Process.myPid());
            throw th;
        }
        Log.i("RestartUtil", "Restarting.");
        Process.killProcess(Process.myPid());
    }

    static final /* synthetic */ void a(Future future, Thread thread) {
        try {
            future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.e("RestartUtil", "Interrupted, cancelled, or failed", e);
        }
        Log.i("RestartUtil", "ensureRestartWhenDoneOrTimeoutMillis - future completed");
        thread.interrupt();
    }
}
