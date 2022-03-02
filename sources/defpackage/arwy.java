package defpackage;

import android.os.RemoteException;
import java.util.concurrent.TimeUnit;

/* renamed from: arwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arwy implements Runnable {
    private final arxb a;
    private final long b;
    private final aosh c;

    public arwy(arxb arxb, long j, aosh aosh) {
        this.a = arxb;
        this.b = j;
        this.c = aosh;
    }

    public final void run() {
        arxb arxb = this.a;
        long j = this.b;
        aosh aosh = this.c;
        try {
            arxb.b.await(j, TimeUnit.MILLISECONDS);
            synchronized (arxb) {
                arxw arxw = arxb.a;
                if (arxw == null) {
                    ((anih) ((anih) aryq.a.c()).a("arxb", "a", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getFirmwareUpdatableItems fail because deviceStatusService is null!");
                    aosh.b((Object) null);
                } else {
                    aosh.b((Object) arxw.b());
                }
            }
        } catch (RemoteException | InterruptedException e) {
            anih anih = (anih) aryq.a.c();
            anih.a(e);
            ((anih) anih.a("arxb", "a", 156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getFirmwareUpdatableItems meet exception!");
            aosh.b((Object) null);
        }
    }
}
