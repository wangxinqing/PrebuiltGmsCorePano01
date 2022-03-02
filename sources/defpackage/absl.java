package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: absl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absl implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ absq c;

    public absl(absq absq, int i, String str) {
        this.c = absq;
        this.a = i;
        this.b = str;
    }

    public final void run() {
        absq absq;
        absq absq2 = this.c;
        if (absq2.s) {
            absq.h.b("Transfer canceled; dropping error %s", abpp.g(this.a));
            return;
        }
        absq2.k.a(this.a);
        this.c.n.a(1013, Bundle.EMPTY);
        try {
            this.c.y.a(this.a, this.b);
            absq = this.c;
        } catch (RemoteException e) {
            absq.h.e("RemoteException when handling error", e, new Object[0]);
            absq = this.c;
        } catch (Throwable th) {
            this.c.a();
            throw th;
        }
        absq.a();
    }
}
