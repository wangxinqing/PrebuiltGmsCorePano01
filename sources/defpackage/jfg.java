package defpackage;

import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: jfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jfg implements Runnable {
    private final aorr a;

    public jfg(aorr aorr) {
        this.a = aorr;
    }

    public final void run() {
        aorr aorr = this.a;
        if (!aorr.isCancelled()) {
            try {
                aorl.a((Future) aorr);
            } catch (ExecutionException e) {
                new qvr(Looper.getMainLooper()).post(new jfh(e, Thread.currentThread().getName()));
            }
        }
    }
}
