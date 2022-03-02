package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;

/* renamed from: as  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class as {
    static final Object c = new Object();
    private volatile Object a;
    final Object b;
    public final n d;
    int e;
    volatile Object f;
    public int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    public as() {
        this.b = new Object();
        this.d = new n();
        this.e = 0;
        this.f = c;
        this.j = new ao(this);
        this.a = c;
        this.g = -1;
    }

    static void a(String str) {
        c.a();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private final void b(ar arVar) {
        if (!arVar.d) {
            return;
        }
        if (!arVar.a()) {
            arVar.a(false);
            return;
        }
        int i2 = arVar.e;
        int i3 = this.g;
        if (i2 < i3) {
            arVar.e = i3;
            arVar.c.a(this.a);
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public Object b() {
        Object obj = this.a;
        if (obj == c) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public final boolean d() {
        return this.e > 0;
    }

    /* access modifiers changed from: protected */
    public void c(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.f;
            obj3 = c;
            this.f = obj;
        }
        if (obj2 == obj3) {
            c.a().a(this.j);
        }
    }

    public as(Object obj) {
        this.b = new Object();
        this.d = new n();
        this.e = 0;
        this.f = c;
        this.j = new ao(this);
        this.a = obj;
        this.g = 0;
    }

    public final void a(aj ajVar) {
        a("removeObservers");
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((ar) entry.getValue()).a(ajVar)) {
                a((ax) entry.getKey());
            }
        }
    }

    public void a(aj ajVar, ax axVar) {
        a("observe");
        if (ajVar.getLifecycle().a() != ad.DESTROYED) {
            aq aqVar = new aq(this, ajVar, axVar);
            ar arVar = (ar) this.d.a(axVar, aqVar);
            if (arVar != null && !arVar.a(ajVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (arVar == null) {
                ajVar.getLifecycle().a(aqVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        a("setValue");
        this.g++;
        this.a = obj;
        a((ar) null);
    }

    /* access modifiers changed from: package-private */
    public final void a(ar arVar) {
        if (!this.h) {
            this.h = true;
            do {
                this.i = false;
                if (arVar == null) {
                    k a2 = this.d.a();
                    while (a2.hasNext()) {
                        b((ar) ((j) a2.next()).b);
                        if (this.i) {
                            break;
                        }
                    }
                } else {
                    b(arVar);
                    arVar = null;
                }
            } while (this.i);
            this.h = false;
            return;
        }
        this.i = true;
    }

    public void a(ax axVar) {
        a("removeObserver");
        ar arVar = (ar) this.d.b(axVar);
        if (arVar != null) {
            arVar.b();
            arVar.a(false);
        }
    }
}
