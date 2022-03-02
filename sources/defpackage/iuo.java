package defpackage;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: iuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iuo implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ GetServiceRequest b;
    final /* synthetic */ iup c;

    public iuo(iup iup, CountDownLatch countDownLatch, GetServiceRequest getServiceRequest) {
        this.c = iup;
        this.a = countDownLatch;
        this.b = getServiceRequest;
    }

    public final void run() {
        try {
            if (!this.a.await(((Long) iks.w.c()).longValue(), TimeUnit.MILLISECONDS)) {
                this.c.b(this.b, 99);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
