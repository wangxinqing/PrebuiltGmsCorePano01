package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: nsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsh {
    private final Map a = new nz();

    public final void a() {
        b(2);
    }

    public final void b() {
        b(3);
    }

    public final synchronized void a(int i) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new nse((nsg) entry.getKey(), i));
        }
    }

    public final synchronized void b(int i) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new nsf((nsg) entry.getKey(), i));
        }
    }

    public final void a(nsg nsg, Executor executor) {
        Map map = this.a;
        iva.a((Object) nsg);
        iva.a((Object) executor);
        map.put(nsg, executor);
    }

    public final synchronized void a(ntx ntx) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new nsc((nsg) entry.getKey(), ntx));
        }
    }

    public final synchronized void b(ntx ntx) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new nsd((nsg) entry.getKey(), ntx));
        }
    }
}
