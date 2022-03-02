package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: annx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class annx implements Runnable {
    final /* synthetic */ aosh a;
    final /* synthetic */ anoa b;

    public annx(anoa anoa, aosh aosh) {
        this.b = anoa;
        this.a = aosh;
    }

    public final void run() {
        try {
            if (!this.a.isCancelled() && aorl.a((Future) this.a) == anoa.b) {
                return;
            }
        } catch (ExecutionException e) {
        }
        this.b.b((aorr) this.a);
    }
}
