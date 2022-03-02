package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agic {
    final List a = new ArrayList();
    public volatile boolean b;

    public final synchronized void a() {
        if (!this.b) {
            this.b = true;
            synchronized (this.a) {
                for (agid c : this.a) {
                    try {
                        c.c();
                    } catch (RuntimeException e) {
                    }
                }
                this.a.clear();
            }
        }
    }

    public final void b(agid agid) {
        if (!a(agid)) {
            agid.c();
        }
    }

    public final void a(amsv amsv) {
        if (!this.b && ((Boolean) amsv.a()).booleanValue()) {
            a();
        }
    }

    public final boolean a(agid agid) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            List list = this.a;
            amrl.a((Object) agid);
            list.add(agid);
            return true;
        }
    }
}
