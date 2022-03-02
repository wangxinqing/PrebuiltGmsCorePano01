package defpackage;

import java.util.concurrent.Semaphore;

/* renamed from: quz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class quz {
    public final Semaphore a;

    public quz() {
        this(new Semaphore(1073741823));
    }

    public quz(Semaphore semaphore) {
        amrl.a((Object) semaphore);
        this.a = semaphore;
    }
}
