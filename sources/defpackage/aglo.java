package defpackage;

import android.app.Application;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: aglo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aglo implements agkv {
    private final agcz a;
    private final Map b;
    private final agcq c;
    private final agnf d;

    aglo() {
    }

    public final void a() {
    }

    public final synchronized void b() {
        if (!this.b.isEmpty()) {
            for (agln a2 : this.b.values()) {
                a2.a();
            }
            this.b.clear();
        }
    }

    public final void c() {
        this.a.b(this.c);
        b();
    }

    public aglo(agkt agkt, Application application, bapu bapu, agcz agcz, int i) {
        this.b = new HashMap();
        this.d = new agnf(i);
        agkt.a((Executor) bapu.a(), this.d);
        amrl.a((Object) agcz);
        this.a = agcz;
        aglp aglp = new aglp(this);
        this.c = aglp;
        agcz.a((agcy) aglp);
        agjl.a(application);
    }
}
