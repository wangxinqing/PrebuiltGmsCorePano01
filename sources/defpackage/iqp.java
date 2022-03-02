package defpackage;

import java.util.Map;

/* renamed from: iqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iqp implements Runnable {
    final /* synthetic */ iqq a;

    public iqp(iqq iqq) {
        this.a = iqq;
    }

    public final void run() {
        irk.a("OnBitmapLoadedRunnable must be executed in the main thread");
        iqq iqq = this.a;
        int i = iqq.f;
        iqn iqn = iqq.d;
        Map map = iqq.e;
        throw null;
    }
}
