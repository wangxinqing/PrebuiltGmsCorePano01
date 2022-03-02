package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bagz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bagz {
    private static final Logger g = Logger.getLogger(bagz.class.getName());
    public final long a;
    public final amsn b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;
    public long f;

    public bagz(long j, amsn amsn) {
        this.a = j;
        this.b = amsn;
    }

    public static Runnable a() {
        return new bagx();
    }

    public static Runnable a(baia baia) {
        return new bagy(baia);
    }

    public static void a(baia baia, Executor executor, Throwable th) {
        a(executor, a(baia));
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            g.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }
}
