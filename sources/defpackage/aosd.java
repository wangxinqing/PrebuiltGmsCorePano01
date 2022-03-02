package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aosd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aosd {
    public static aoru a() {
        return new aory();
    }

    public static aoru a(ExecutorService executorService) {
        if (executorService instanceof aoru) {
            return (aoru) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new aosc((ScheduledExecutorService) executorService) : new aorz(executorService);
    }

    public static aorv a(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof aorv ? (aorv) scheduledExecutorService : new aosc(scheduledExecutorService);
    }

    public static Executor a(Executor executor) {
        return new aosg(executor);
    }

    static Executor a(Executor executor, aopn aopn) {
        amrl.a((Object) executor);
        amrl.a((Object) aopn);
        return executor != aoqm.a ? new aorx(executor, aopn) : executor;
    }
}
