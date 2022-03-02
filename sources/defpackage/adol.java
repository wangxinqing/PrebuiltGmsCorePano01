package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: adol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adol {
    public static final iwd a = adnt.i("DelayedBatchMessageQueue");
    public final List b = new ArrayList();
    public final Handler c = new qvr(Looper.getMainLooper(), new adok(this));
    public final long d;
    private final adoj e;

    public adol(long j, adoj adoj) {
        this.e = adoj;
        this.d = j;
    }

    public final void a() {
        amzy a2 = amzy.a((Collection) this.b);
        this.b.clear();
        this.e.a(a2);
    }
}
