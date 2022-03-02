package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bum implements Future {
    private Boolean a;

    /* renamed from: a */
    public final synchronized Boolean get(long j, TimeUnit timeUnit) {
        while (j > 0) {
            if (isDone()) {
                break;
            }
            wait(TimeUnit.MILLISECONDS.convert(j, timeUnit));
        }
        if (isDone()) {
        } else {
            throw new TimeoutException();
        }
        return this.a;
    }

    /* renamed from: aB */
    public final synchronized Boolean get() {
        while (!isDone()) {
            wait();
        }
        return this.a;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final synchronized boolean isDone() {
        return this.a != null;
    }

    public final synchronized void a(boolean z) {
        this.a = Boolean.valueOf(z);
        notifyAll();
    }
}
