package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: algf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algf {
    public static final algf a = new algf(a("SetupCompatServiceInvoker", 50));
    public static final algf b = new algf(a("SetupBindbackServiceExecutor", 1));
    public final Executor c;

    private algf(Executor executor) {
        this.c = executor;
    }

    public static ExecutorService a(String str, int i) {
        return new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(i), new alge(str));
    }
}
