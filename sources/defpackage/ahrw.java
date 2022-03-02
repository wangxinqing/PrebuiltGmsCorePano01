package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahrw extends Thread {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile Handler b;
    public volatile boolean c = false;
    final /* synthetic */ ahrx d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahrw(ahrx ahrx) {
        super("SensorBatchThread");
        this.d = ahrx;
        setPriority(4);
    }

    public final void run() {
        Looper.prepare();
        this.b = new qvr();
        this.a.countDown();
        Looper.loop();
        ajrh ajrh = this.d.a;
        String.valueOf(getName()).concat(" quitted.");
    }
}
