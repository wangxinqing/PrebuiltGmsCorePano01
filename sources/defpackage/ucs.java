package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ucs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucs extends arwm {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucs(udb udb, String str, AtomicReference atomicReference) {
        super(str);
        this.b = udb;
        this.a = atomicReference;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        AtomicReference atomicReference = this.a;
        udb udb = this.b;
        if (aymw.c()) {
            jjg jjg = tsp.a;
            countDownLatch = udb.g.c();
        } else {
            countDownLatch = new CountDownLatch(0);
        }
        atomicReference.set(countDownLatch);
    }
}
