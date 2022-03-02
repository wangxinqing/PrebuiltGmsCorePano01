package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: hhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhb implements afzz {
    final /* synthetic */ hhc a;
    private CountDownLatch b = new CountDownLatch(0);

    public hhb(hhc hhc) {
        this.a = hhc;
    }

    public final synchronized boolean a() {
        if (this.b.getCount() != 0) {
            return false;
        }
        this.b = new CountDownLatch(1);
        return true;
    }

    public final synchronized CountDownLatch b() {
        return this.b;
    }

    public final void c() {
        hem.a().a(this.a.b, 59);
    }

    public final void d() {
    }

    public final void e() {
        synchronized (this) {
            this.b.countDown();
        }
        hem.a().a(this.a.b, 56);
    }
}
