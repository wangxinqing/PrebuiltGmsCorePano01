package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: wtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtu {
    private final ReentrantLock a = new ReentrantLock();

    public final void a() {
        this.a.lock();
    }

    public final void b() {
        this.a.unlock();
    }

    public final void c() {
        iva.a(this.a.isHeldByCurrentThread());
    }
}
