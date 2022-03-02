package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: ahih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahih implements Runnable {
    private final ahik a;
    private final aorr b;

    public ahih(ahik ahik, aorr aorr) {
        this.a = ahik;
        this.b = aorr;
    }

    public final void run() {
        try {
            this.a.d.set((ou) aorl.a((Future) this.b));
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
