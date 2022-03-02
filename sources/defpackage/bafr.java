package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bafr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafr implements baeh {
    public final baeh a;
    public volatile boolean b;
    public List c = new ArrayList();

    public bafr(baeh baeh) {
        this.a = baeh;
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public final void b(babj babj, baaf baaf) {
        a((Runnable) new bafp(this, babj, baaf));
    }

    public final void a() {
        if (!this.b) {
            a((Runnable) new bafn(this));
        } else {
            this.a.a();
        }
    }

    public final void a(baaf baaf) {
        a((Runnable) new bafo(this, baaf));
    }

    public final void a(babj babj, baeg baeg, baaf baaf) {
        a((Runnable) new bafq(this, babj, baeg, baaf));
    }

    public final void a(bajq bajq) {
        if (!this.b) {
            a((Runnable) new bafm(this, bajq));
        } else {
            this.a.a(bajq);
        }
    }
}
