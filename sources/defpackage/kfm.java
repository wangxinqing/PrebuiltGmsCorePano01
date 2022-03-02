package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CountDownLatch;

/* renamed from: kfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfm extends kfb {
    public kfm(kec kec, kwg kwg) {
        super("CompletePendingActivityOperation", kec, kwg);
    }

    public final void c() {
        try {
            kdv a = this.a.g.a();
            a.f();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a.b.execute(new kdr(countDownLatch));
            countDownLatch.await();
            synchronized (a) {
                while (a.b()) {
                    a.wait();
                }
            }
            this.b.b();
        } catch (InterruptedException e) {
            this.b.a(new Status(8, "There was an error completing pending operations. Please try again later.", (PendingIntent) null));
        }
    }
}
