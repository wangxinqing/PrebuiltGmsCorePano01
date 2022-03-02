package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.Closeable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: lxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxv implements Closeable {
    public static final long a = TimeUnit.SECONDS.toMillis(60);
    public static final long b = TimeUnit.SECONDS.toMillis(60);
    public final lxz c;
    public final String d;
    public final DroidGuardResultsRequest e;
    public final long f;
    public final long g;
    public final BlockingQueue h;
    public final Thread i = new Thread(new lxu(this));

    public lxv(BlockingQueue blockingQueue, lxz lxz, String str, DroidGuardResultsRequest droidGuardResultsRequest, long j, long j2) {
        this.h = blockingQueue;
        this.c = lxz;
        this.d = str;
        this.e = droidGuardResultsRequest;
        this.f = j;
        this.g = j2;
        droidGuardResultsRequest.a.remove("timeoutMs");
    }

    public final void close() {
        if (this.i.isAlive()) {
            while (!this.h.offer(ampu.a)) {
                this.h.clear();
            }
            try {
                this.i.join();
            } catch (InterruptedException e2) {
            }
        }
    }
}
