package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: hgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgw extends boi {
    public boj a;
    public final CountDownLatch b = new CountDownLatch(1);
    public int c = 1;

    public hgw(boj boj) {
        this.a = boj;
    }

    public final void a(int i) {
        this.c = i;
        this.b.countDown();
    }
}
