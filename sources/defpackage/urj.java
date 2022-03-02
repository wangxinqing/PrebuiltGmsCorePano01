package defpackage;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: urj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class urj implements amop {
    final /* synthetic */ urk a;

    public urj(urk urk) {
        this.a = urk;
    }

    public final void a() {
        urk urk = this.a;
        CountDownLatch countDownLatch = urk.b;
        countDownLatch.getClass();
        urk.a((Runnable) new urg(countDownLatch));
    }

    public final void a(byte[] bArr) {
        this.a.b(bArr);
    }

    public final void b() {
        this.a.a((Runnable) new urh(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(IOException iOException) {
        anih anih = (anih) ulh.a.c();
        anih.a((Throwable) iOException);
        ((anih) anih.a("urj", "b", 383, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket connected to %s encountered an error with its internal Weave socket.", (Object) this.a.a);
    }

    public final void a(IOException iOException) {
        this.a.a((Runnable) new uri(this, iOException));
    }
}
