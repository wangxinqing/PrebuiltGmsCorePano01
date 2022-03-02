package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: agwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwq implements Runnable {
    private final aorr a;

    public agwq(aorr aorr) {
        this.a = aorr;
    }

    public final void run() {
        try {
            aorl.a((Future) this.a);
        } catch (ExecutionException e) {
            agzj.a(new agwt(e));
        }
    }
}
