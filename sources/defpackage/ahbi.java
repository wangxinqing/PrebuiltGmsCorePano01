package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* renamed from: ahbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbi implements Closeable {
    public Semaphore a;

    public ahbi(Semaphore semaphore) {
        this.a = semaphore;
    }

    public final Semaphore a() {
        Semaphore semaphore = this.a;
        this.a = null;
        return semaphore;
    }

    public final void close() {
        Semaphore semaphore = this.a;
        if (semaphore != null) {
            semaphore.release();
            this.a = null;
        }
    }
}
