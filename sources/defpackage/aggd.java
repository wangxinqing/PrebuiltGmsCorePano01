package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aggd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aggd implements agcv, agid {
    private final agcz a;
    private final bapu b;
    private final ArrayList c = new ArrayList();
    private boolean d;

    public aggd(agcz agcz, bapu bapu) {
        this.a = agcz;
        this.b = bapu;
        agcz.a((agcy) this);
    }

    public final void b(Activity activity) {
        synchronized (this.c) {
            if (!this.d) {
                this.d = true;
                this.a.b(this);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((aorv) this.b.a()).a((Runnable) it.next());
                }
                this.c.clear();
            }
        }
    }

    public final void c() {
        this.a.b(this);
    }
}
