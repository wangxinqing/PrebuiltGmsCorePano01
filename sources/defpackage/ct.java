package defpackage;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ct extends AbstractList {
    private final AtomicBoolean a = new AtomicBoolean(false);
    final Executor i;
    final Executor j;
    final cs k;
    final cw l;
    int m = 0;
    public int n = Integer.MAX_VALUE;
    public int o = Integer.MIN_VALUE;
    public final ArrayList p = new ArrayList();

    public ct(cw cwVar, Executor executor, Executor executor2, cs csVar) {
        this.l = cwVar;
        this.i = executor;
        this.j = executor2;
        this.k = csVar;
        int i2 = csVar.b;
        int i3 = csVar.a;
    }

    public abstract void a(int i2);

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.p.size() - 1; size >= 0; size--) {
                cq cqVar = (cq) ((WeakReference) this.p.get(size)).get();
                if (cqVar != null) {
                    cqVar.a(i2, i3);
                }
            }
        }
    }

    public abstract void a(ct ctVar, cq cqVar);

    public final void b(int i2) {
        if (i2 < 0 || i2 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + size());
        }
        this.m = this.l.e + i2;
        a(i2);
        this.n = Math.min(this.n, i2);
        this.o = Math.max(this.o, i2);
    }

    public abstract boolean c();

    public abstract cf d();

    public abstract Object e();

    public boolean f() {
        return h();
    }

    public final List g() {
        return !f() ? new cz(this) : this;
    }

    public final Object get(int i2) {
        return this.l.get(i2);
    }

    public boolean h() {
        return this.a.get();
    }

    public final void i() {
        this.a.set(true);
    }

    public final int size() {
        return this.l.size();
    }

    public final void a(cq cqVar) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            cq cqVar2 = (cq) ((WeakReference) this.p.get(size)).get();
            if (cqVar2 == null || cqVar2 == cqVar) {
                this.p.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.p.size() - 1; size >= 0; size--) {
                cq cqVar = (cq) ((WeakReference) this.p.get(size)).get();
                if (cqVar != null) {
                    cqVar.b(i2, i3);
                }
            }
        }
    }

    public final void a(List list, cq cqVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                a((ct) list, cqVar);
            } else if (!this.l.isEmpty()) {
                cqVar.a(0, this.l.size());
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (((cq) ((WeakReference) this.p.get(size)).get()) == null) {
                this.p.remove(size);
            }
        }
        this.p.add(new WeakReference(cqVar));
    }
}
