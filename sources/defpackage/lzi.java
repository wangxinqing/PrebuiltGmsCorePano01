package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: lzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lzi {
    private final ArrayBlockingQueue a = new ArrayBlockingQueue(1);
    private boolean b = false;
    private boolean c = false;

    /* access modifiers changed from: package-private */
    public final Object a(long j) {
        if (!this.c) {
            this.c = true;
            return this.a.poll(j, TimeUnit.MILLISECONDS);
        }
        throw new RuntimeException("BlockingChannel can be read only once.");
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        if (!this.b) {
            this.b = true;
            this.a.offer(obj);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }
}
