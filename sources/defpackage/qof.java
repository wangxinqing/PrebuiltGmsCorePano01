package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qof {
    private final List a = new ArrayList();

    public final synchronized CancellationSignal a() {
        CancellationSignal cancellationSignal;
        cancellationSignal = new CancellationSignal();
        this.a.add(cancellationSignal);
        return cancellationSignal;
    }

    public final synchronized void b() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((CancellationSignal) list.get(i)).cancel();
        }
    }

    public final void a(aorr aorr, Executor executor) {
        aorr.a(new qoe(this, aorr), executor);
    }
}
