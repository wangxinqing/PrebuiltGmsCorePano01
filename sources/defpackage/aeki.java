package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aeki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeki implements Future {
    final /* synthetic */ aekl a;
    private final Object b = new Object();
    private final BlockingQueue c;
    private final aekj d;
    private final boolean e;
    private boolean f = false;
    private boolean g = false;

    public aeki(aekl aekl, BlockingQueue blockingQueue, aekj aekj, boolean z) {
        this.a = aekl;
        this.c = blockingQueue;
        this.d = aekj;
        this.e = z;
    }

    public final boolean cancel(boolean z) {
        synchronized (this.b) {
            if (this.g) {
                return false;
            }
            if (this.f) {
                return true;
            }
            this.d.c();
            this.f = true;
            this.a.a(this.d, (Object) new BluetoothException("Operation cancelled."));
            return true;
        }
    }

    public final Object get() {
        try {
            return a(-1, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean isCancelled() {
        boolean z;
        synchronized (this.b) {
            z = this.f;
        }
        return z;
    }

    public final boolean isDone() {
        boolean z;
        synchronized (this.b) {
            z = this.g;
        }
        return z;
    }

    private final Object a(long j, TimeUnit timeUnit) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            synchronized (this.b) {
                if (this.g) {
                    throw new ExecutionException(new BluetoothException("get() called twice..."));
                }
            }
            if (!this.e) {
                if (j == -1) {
                    this.a.c.acquire();
                } else if (!this.a.c.tryAcquire(j - (System.currentTimeMillis() - currentTimeMillis), timeUnit)) {
                    throw new TimeoutException(String.format("A timeout occured when processing %s after %s %s.", new Object[]{this.d, Long.valueOf(j), timeUnit}));
                }
                this.d.a(this.a);
            }
            if (j == -1) {
                obj = this.c.take();
            } else {
                obj = this.c.poll(j - (System.currentTimeMillis() - currentTimeMillis), timeUnit);
            }
            if (obj != null) {
                synchronized (this.b) {
                    this.g = true;
                }
                if (obj instanceof BluetoothException) {
                    throw new ExecutionException((BluetoothException) obj);
                } else if (obj == aekl.a) {
                    obj = null;
                }
            } else {
                throw new TimeoutException(String.format("A timeout occured when processing %s after %s ms.", new Object[]{this.d, Long.valueOf(j)}));
            }
        }
        return obj;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return a(Math.max(0, j), timeUnit);
    }
}
