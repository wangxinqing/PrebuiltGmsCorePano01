package defpackage;

import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: yaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yaq {
    private final ArrayBlockingQueue a;
    private amzt b;
    private int c = 0;

    public yaq(int i) {
        this.a = new ArrayBlockingQueue(i, true);
        this.b = new amzt();
    }

    private final void a(String str, boolean z) {
        try {
            this.a.put(new yam(this.b.a(), str, z));
            this.b = new amzt();
        } catch (InterruptedException e) {
            Log.e("FSA2_PaginatedQueue", "BlockingQueue.put interrupted, bailing out", e);
            throw new xye(e);
        }
    }

    public final void b() {
        this.a.size();
    }

    public final synchronized void b(String str) {
        a(str, true);
    }

    public final yao a() {
        try {
            return (yao) this.a.take();
        } catch (InterruptedException e) {
            Log.e("FSA2_PaginatedQueue", "BlockingQueue.take interrupted, bailing out", e);
            throw new xye(e);
        }
    }

    public final yao a(long j, TimeUnit timeUnit) {
        try {
            return (yao) this.a.poll(j, timeUnit);
        } catch (InterruptedException e) {
            Log.e("FSA2_PaginatedQueue", "BlockingQueue.take interrupted, bailing out", e);
            throw new xye(e);
        }
    }

    public final synchronized void a(Object obj) {
        this.b.c(obj);
        this.c++;
    }

    public final synchronized void a(String str) {
        a(str, false);
    }
}
