package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: aqbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqbv extends baaz {
    public final amzy a;
    public final Queue b = new ArrayDeque();
    public final Set c;
    public int d;
    public boolean e;
    public boolean f;
    public baaf g;
    public babj h;
    public baaf i;
    private final Executor k = aosd.a((Executor) aoqm.a);
    private final LinkedHashMap l = new LinkedHashMap();
    private final LinkedHashMap m = new LinkedHashMap();
    private boolean n;

    public aqbv(azxk azxk, amzy amzy, Set set) {
        super(azxk);
        this.a = amzy;
        this.d = amzy.size();
        this.c = set;
    }

    public final void a(baaf baaf) {
        this.g = baaf;
        this.k.execute(new aqbr(this));
    }

    public final void b() {
        if (this.e) {
            for (aqbu aqbu : this.b) {
                Iterator it = anda.a((List) this.a.subList(0, aqbu.c)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        for (aqay aqay : anda.a((List) it.next())) {
                            if (this.c.contains(aqay)) {
                                amrl.b(aqbu.a instanceof audx, (Object) "Only MessageLite is supported");
                                new aqax((audx) aqbu.a);
                                try {
                                    int i2 = aqay.c().b;
                                } catch (Throwable th) {
                                    this.h = babj.a(th);
                                    this.i = new baaf();
                                    d();
                                    this.n = true;
                                    return;
                                }
                            }
                        }
                        if (!aqbu.a()) {
                            aqbu.c--;
                        } else {
                            return;
                        }
                    }
                }
            }
            while (!this.b.isEmpty()) {
                aqbu aqbu2 = (aqbu) this.b.peek();
                if (aqbu2.a() || aqbu2.c != 0) {
                    break;
                }
                this.j.a(((aqbu) this.b.poll()).a);
            }
            c();
        }
    }

    public final void c() {
        if (!a() && this.b.isEmpty() && this.f && !this.n) {
            d();
        }
    }

    public final void d() {
        aqat aqat = new aqat(this.h, this.i);
        for (List a2 : anda.a((List) this.a)) {
            for (aqay aqay : anda.a(a2)) {
                if (this.c.contains(aqay)) {
                    try {
                        int i2 = aqay.a(aqat).b;
                    } catch (Throwable th) {
                        this.h = babj.a(th);
                        this.i = new baaf();
                    }
                }
            }
        }
        if (this.m.isEmpty()) {
            this.j.a(this.h, this.i);
        }
    }

    public final void a(babj babj, baaf baaf) {
        this.k.execute(new aqbt(this, babj, baaf));
    }

    public final void a(Object obj) {
        this.k.execute(new aqbs(this, obj));
    }

    public final boolean a() {
        return !this.l.isEmpty();
    }
}
