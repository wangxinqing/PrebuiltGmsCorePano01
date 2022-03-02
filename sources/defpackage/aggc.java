package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aggc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aggc implements agco, agid {
    public final List a = new ArrayList();
    public boolean b;
    private final agcz c;

    public aggc(agcz agcz) {
        this.c = agcz;
        agcz.a((agcy) this);
    }

    public final void a() {
        synchronized (this) {
            this.b = true;
        }
        this.c.b(this);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((agho) list.get(i)).b();
        }
    }

    public final void c() {
        this.c.b(this);
    }
}
