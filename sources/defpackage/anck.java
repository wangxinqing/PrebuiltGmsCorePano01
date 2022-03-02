package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: anck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anck implements Iterator {
    final Set a = angm.a(this.e.m().size());
    ancm b;
    ancm c;
    int d;
    final /* synthetic */ ancp e;

    public anck(ancp ancp) {
        this.e = ancp;
        ancp ancp2 = this.e;
        this.b = ancp2.a;
        this.d = ancp2.e;
    }

    private final void a() {
        if (this.e.e != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    public final Object next() {
        ancm ancm;
        a();
        ancp.g(this.b);
        ancm ancm2 = this.b;
        this.c = ancm2;
        this.a.add(ancm2.a);
        do {
            ancm = this.b.c;
            this.b = ancm;
            if (ancm == null || this.a.add(ancm.a)) {
            }
            ancm = this.b.c;
            this.b = ancm;
            break;
        } while (this.a.add(ancm.a));
        return this.c.a;
    }

    public final void remove() {
        boolean z;
        a();
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        amxg.a(z);
        this.e.e(this.c.a);
        this.c = null;
        this.d = this.e.e;
    }
}
