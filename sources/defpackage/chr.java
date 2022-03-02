package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: chr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chr extends cbm {
    final CountDownLatch a;
    int b = -1;

    public chr(CountDownLatch countDownLatch) {
        super("ContextManager3PCredentialsVerifier", "ping response", new Object[0]);
        this.a = countDownLatch;
    }

    public final void a(int i) {
        super.a(i);
        new Object[1][0] = Integer.toString(i);
        this.b = i;
        this.a.countDown();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object[] objArr = {(atpz) obj};
        this.b = 0;
        this.a.countDown();
    }
}
