package defpackage;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: abeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abeh implements icm {
    private final AtomicReference a;
    private final CountDownLatch b;

    public abeh(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = atomicReference;
        this.b = countDownLatch;
    }

    public final void a(icl icl) {
        AtomicReference atomicReference = this.a;
        CountDownLatch countDownLatch = this.b;
        wla wla = (wla) icl;
        xfh b2 = wla.b();
        if (b2 == null) {
            String valueOf = String.valueOf(wla.aO());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Call to loadOwners failed: ");
            sb.append(valueOf);
            Log.w("GetCurrentAccountOpr", sb.toString());
        } else {
            atomicReference.set(b2);
        }
        countDownLatch.countDown();
    }
}
