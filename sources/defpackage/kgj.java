package defpackage;

import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.concurrent.CountDownLatch;

/* renamed from: kgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kgj extends kwi {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ kgk b;

    public kgj(kgk kgk, CountDownLatch countDownLatch) {
        this.b = kgk;
        this.a = countDownLatch;
    }

    public final void a(OnEventResponse onEventResponse) {
        if (((ChangeEvent) onEventResponse.a()).a.a != null) {
            kgk kgk = this.b;
            krr krr = kgk.a.l;
            ith ith = kgk.f;
            krr.a(kgk.h.a, (kwj) this);
            this.a.countDown();
        }
    }
}
