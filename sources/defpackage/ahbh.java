package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* renamed from: ahbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbh implements Closeable {
    private Semaphore a;

    public ahbh(Semaphore semaphore) {
        this.a = semaphore;
    }

    public final void close() {
        Semaphore semaphore = this.a;
        if (semaphore != null) {
            semaphore.release();
            this.a = null;
        }
    }
}
