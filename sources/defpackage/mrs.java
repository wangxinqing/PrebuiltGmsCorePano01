package defpackage;

import java.util.Collections;

/* renamed from: mrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mrs implements Runnable {
    final /* synthetic */ mrt a;

    public mrs(mrt mrt) {
        this.a = mrt;
    }

    public final void run() {
        mtc mtc = this.a.b;
        Collections.sort(mtc.c, new mtb(mtc));
        mtc.b.clear();
        mtc.b.addAll(mtc.c);
        mtc.c.clear();
        mtc.a();
        this.a.getContext().startService(arza.a(this.a.getContext()));
        this.a.c.postDelayed(this, 12000);
    }
}
