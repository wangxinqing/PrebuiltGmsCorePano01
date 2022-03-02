package defpackage;

import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* renamed from: lkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkq implements alpi {
    public final lkk a;
    public final CountDownLatch b = new CountDownLatch(1);
    public boolean c;
    public alpj d;
    public final /* synthetic */ lkr e;

    public lkq(lkr lkr, lkk lkk) {
        this.e = lkr;
        this.a = lkk;
    }

    public final void a(alpj alpj) {
        b(alpj);
    }

    public final void b(alpj alpj) {
        this.d = alpj;
        this.c = false;
        this.b.countDown();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alrs alrs = (alrs) obj;
        this.c = true;
        try {
            new lkf(this.a, this.e.c, alrs).a(this.e.b);
        } catch (RemoteException | nja e2) {
            lkr.a.c("RealtimeDocumentSyncer", "Failed to get initial snapshot.", e2);
        }
        this.b.countDown();
    }
}
