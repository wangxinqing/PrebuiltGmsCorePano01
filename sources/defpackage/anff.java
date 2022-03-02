package defpackage;

import java.util.Iterator;

/* renamed from: anff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anff extends angj {
    final /* synthetic */ amwz a;

    public anff() {
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof anfd) {
            anfd anfd = (anfd) obj;
            if (anfd.a() <= 0 || this.a.a(anfd.a) != anfd.a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.a.b();
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof anfd)) {
            return false;
        }
        anfd anfd = (anfd) obj;
        Object obj2 = anfd.a;
        int a2 = anfd.a();
        if (a2 != 0) {
            return this.a.c(obj2, a2);
        }
        return false;
    }

    public final int size() {
        return this.a.c();
    }

    public anff(amwz amwz) {
        this.a = amwz;
    }
}
