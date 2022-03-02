package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: amwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwx extends AbstractCollection {
    final /* synthetic */ amwy a;

    public amwx(amwy amwy) {
        this.a = amwy;
    }

    public final void clear() {
        this.a.d();
    }

    public final boolean contains(Object obj) {
        return this.a.f(obj);
    }

    public final Iterator iterator() {
        return this.a.g();
    }

    public final int size() {
        return this.a.c();
    }
}
