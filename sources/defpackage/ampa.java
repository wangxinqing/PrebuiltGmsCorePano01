package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ampa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampa implements Future {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile amog b;
    public volatile BluetoothGattCharacteristic c;
    private volatile Exception d;
    private aejx e;

    public ampa(aejx aejx) {
        this.e = aejx;
    }

    private final synchronized void a() {
        aejx aejx = this.e;
        if (aejx != null) {
            aejx.e();
            this.e = null;
        }
    }

    public final boolean cancel(boolean z) {
        if (this.d != null) {
            return true;
        }
        a(new InterruptedException("connection cancelled"));
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.a.await();
        if (this.d == null) {
            return this.b;
        }
        throw new ExecutionException(this.d);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.a.getCount() == 0;
    }

    public final void a(Exception exc) {
        a();
        this.d = exc;
        this.a.countDown();
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (!this.a.await(j, timeUnit)) {
            a();
            throw new TimeoutException();
        } else if (this.d == null) {
            return this.b;
        } else {
            throw new ExecutionException(this.d);
        }
    }
}
