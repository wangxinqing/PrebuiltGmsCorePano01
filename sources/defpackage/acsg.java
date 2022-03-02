package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsg {
    private static Future a = null;

    public static void a() {
        Future future = a;
        if (future != null && !future.isDone() && !a.isCancelled()) {
            a.cancel(true);
        }
    }

    public static boolean a(long j) {
        return a(new acsc(j), j);
    }

    public static boolean a(Callable callable, long j) {
        if (j <= 0) {
            acsh.a("ControlledEventsWakelockFailureInvalidDuration");
            return false;
        } else if (a == null) {
            acrz acrz = new acrz(ihs.b(), "Controlled_Events_Wakelock", "Acquired ControlledEvents Wakelock.");
            aoru b = jfm.b(9);
            a = b.b(callable);
            try {
                acrz.a("Controlled_Events_Wakelock");
                a.get(j, TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                if (!a.isCancelled()) {
                    a();
                }
                if (e instanceof TimeoutException) {
                    return true;
                }
                acsh.a("ControlledEventsWakelockFailureInterrupted");
                return false;
            } finally {
                acrz.c("Controlled_Events_Wakelock");
                a = null;
                b.shutdownNow();
            }
        } else {
            acsh.a("ControlledEventsWakelockFailureAlreadyHeld");
            return false;
        }
    }
}
