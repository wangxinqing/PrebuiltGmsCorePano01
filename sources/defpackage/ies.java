package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: ies  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ies implements Runnable {
    final /* synthetic */ iet b;

    public ies(iet iet) {
        this.b = iet;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Lock lock;
        this.b.b.lock();
        try {
            if (Thread.interrupted()) {
                lock = this.b.b;
            } else {
                a();
                lock = this.b.b;
            }
        } catch (RuntimeException e) {
            ifc ifc = this.b.a;
            ifc.e.sendMessage(ifc.e.obtainMessage(2, e));
            lock = this.b.b;
        } catch (Throwable th) {
            this.b.b.unlock();
            throw th;
        }
        lock.unlock();
    }
}
