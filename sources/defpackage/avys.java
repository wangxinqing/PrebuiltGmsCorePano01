package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: avys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avys {
    public static final avys a;
    public final Executor b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), awaj.b("OkHttp ConnectionPool"));
    public final int c;
    public final long d;
    public final Runnable e = new avyr(this);
    public final Deque f = new ArrayDeque();
    public final awah g = new awah();

    static {
        long j;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        if (property2 != null) {
            j = Long.parseLong(property2);
        } else {
            j = 300000;
        }
        if (property != null && !Boolean.parseBoolean(property)) {
            a = new avys(0, j);
        } else if (property3 != null) {
            a = new avys(Integer.parseInt(property3), j);
        } else {
            a = new avys(5, j);
        }
    }

    public avys(int i, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.c = i;
        this.d = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
