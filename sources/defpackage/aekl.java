package defpackage;

import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aekl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekl {
    public static final Object a = new Object();
    private static final String d = aekl.class.getSimpleName();
    final Map b = new HashMap();
    public final Semaphore c;

    public aekl(int i) {
        Semaphore semaphore = new Semaphore(i, true);
        this.c = semaphore;
    }

    public static Object a(Future future) {
        return b(future, -1);
    }

    private static Object b(Future future, long j) {
        if (j == -1) {
            return future.get();
        }
        try {
            return future.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            if (future.cancel(true) || !future.isDone()) {
                Thread.currentThread().interrupt();
                throw new BluetoothException("Wait interrupted");
            }
            Object b2 = b(future, -1);
            Thread.currentThread().interrupt();
            return b2;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof BluetoothException) {
                throw ((BluetoothException) cause);
            }
            throw new RuntimeException(e2);
        } catch (TimeoutException e3) {
            if (!future.cancel(true) && future.isDone()) {
                return b(future, -1);
            }
            throw new BluetoothOperationExecutor$BluetoothOperationTimeoutException(String.format("Wait timed out after %s ms.", new Object[]{Long.valueOf(j)}), e3);
        } catch (Throwable th) {
            Thread.currentThread().interrupt();
            throw th;
        }
    }

    public static Object a(Future future, long j) {
        return b(future, Math.max(0, j));
    }

    public final Object a(aekj aekj) {
        Object a2 = a(b(aekj));
        if (a2 != null) {
            return a2;
        }
        throw new BluetoothException(String.format("Operation %s returned a null result.", new Object[]{aekj}));
    }

    public final Object a(aekj aekj, long j) {
        Object a2 = a(b(aekj), j);
        if (a2 != null) {
            return a2;
        }
        throw new BluetoothException(String.format("Operation %s returned a null result.", new Object[]{aekj}));
    }

    public final void a(aekj aekj, int i) {
        a(aekj, i, (Object) null);
    }

    public final void a(aekj aekj, int i, Object obj) {
        if (i != 0) {
            a(aekj, (Object) new BluetoothGattException(String.format("Operation %s failed: %d - %s.", new Object[]{aekj, Integer.valueOf(i), aekh.a(i)}), i));
            return;
        }
        a(aekj, obj);
    }

    public final void a(aekj aekj, Object obj) {
        Queue queue = (Queue) this.b.get(aekj);
        if (queue == null) {
            Log.e(d, String.format("Receive completion for unexpected operation: %s.", new Object[]{aekj}));
            return;
        }
        if (obj == null) {
            obj = a;
        }
        queue.add(obj);
        this.b.remove(aekj);
        this.c.release();
        Object[] objArr = {aekj, Integer.valueOf(this.c.availablePermits())};
    }

    public final Future b(aekj aekj) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.b.put(aekj, linkedBlockingDeque);
        boolean tryAcquire = this.c.tryAcquire();
        Object[] objArr = {aekj, Integer.valueOf(this.c.availablePermits()), Boolean.valueOf(tryAcquire)};
        if (tryAcquire) {
            aekj.a(this);
        }
        return new aeki(this, linkedBlockingDeque, aekj, tryAcquire);
    }

    public final void b(aekj aekj, long j) {
        a(b(aekj), j);
    }
}
