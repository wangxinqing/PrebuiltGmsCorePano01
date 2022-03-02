package defpackage;

import android.hardware.location.ContextHubTransaction;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aroh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aroh implements arnk {
    private final ContextHubTransaction a;
    private final AtomicInteger b = new AtomicInteger(Integer.MAX_VALUE);

    public aroh(ContextHubTransaction contextHubTransaction) {
        this.a = contextHubTransaction;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        arnj arnj = (arnj) obj;
        throw new UnsupportedOperationException("Use get(long, TimeUnit) instead");
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        throw new UnsupportedOperationException("Use get(long, TimeUnit) instead");
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.b.get() != Integer.MAX_VALUE;
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        int i;
        if (!isDone()) {
            ContextHubTransaction.Response waitForResponse = this.a.waitForResponse(j, timeUnit);
            AtomicInteger atomicInteger = this.b;
            if (waitForResponse.getResult() != 0) {
                i = -1;
            } else {
                i = 0;
            }
            atomicInteger.set(i);
        }
        return Integer.valueOf(this.b.get());
    }
}
