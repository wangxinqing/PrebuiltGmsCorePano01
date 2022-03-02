package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: acwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acwp implements acwq {
    public final CountDownLatch a = new CountDownLatch(1);

    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void b() {
        this.a.countDown();
    }

    public final void a(Object obj) {
        this.a.countDown();
    }
}
