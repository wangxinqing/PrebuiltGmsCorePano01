package defpackage;

import java.util.ListIterator;

/* renamed from: anco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anco implements ListIterator {
    final Object a;
    int b;
    ancm c;
    ancm d;
    ancm e;
    final /* synthetic */ ancp f;

    public anco(ancp ancp, Object obj) {
        this.f = ancp;
        this.a = obj;
        ancl ancl = (ancl) ancp.c.get(obj);
        this.c = ancl != null ? ancl.a : null;
    }

    public final void add(Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    public final boolean hasNext() {
        return this.c != null;
    }

    public final boolean hasPrevious() {
        return this.e != null;
    }

    public final Object next() {
        ancp.g(this.c);
        ancm ancm = this.c;
        this.d = ancm;
        this.e = ancm;
        this.c = ancm.e;
        this.b++;
        return this.d.b;
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        ancp.g(this.e);
        ancm ancm = this.e;
        this.d = ancm;
        this.c = ancm;
        this.e = ancm.f;
        this.b--;
        return this.d.b;
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    public final void remove() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        amxg.a(z);
        ancm ancm = this.d;
        if (ancm != this.c) {
            this.e = ancm.f;
            this.b--;
        } else {
            this.c = ancm.e;
        }
        this.f.a(ancm);
        this.d = null;
    }

    public final void set(Object obj) {
        amrl.b(this.d != null);
        this.d.b = obj;
    }

    public anco(ancp ancp, Object obj, int i) {
        int i2;
        ancm ancm;
        ancm ancm2;
        this.f = ancp;
        ancl ancl = (ancl) ancp.c.get(obj);
        if (ancl != null) {
            i2 = ancl.c;
        } else {
            i2 = 0;
        }
        amrl.b(i, i2);
        if (i >= i2 / 2) {
            if (ancl != null) {
                ancm = ancl.b;
            } else {
                ancm = null;
            }
            this.e = ancm;
            this.b = i2;
            while (true) {
                int i3 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i3;
            }
        } else {
            if (ancl != null) {
                ancm2 = ancl.a;
            } else {
                ancm2 = null;
            }
            this.c = ancm2;
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i4;
            }
        }
        this.a = obj;
        this.d = null;
    }
}
