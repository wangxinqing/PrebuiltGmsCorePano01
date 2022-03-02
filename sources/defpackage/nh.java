package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: nh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nh implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ Handler b;
    final /* synthetic */ nj c;

    public nh(Callable callable, Handler handler, nj njVar) {
        this.a = callable;
        this.b = handler;
        this.c = njVar;
    }

    public final void run() {
        nd ndVar;
        try {
            ndVar = ((mx) this.a).call();
        } catch (Exception e) {
            ndVar = null;
        }
        this.b.post(new ng(this, ndVar));
    }
}
