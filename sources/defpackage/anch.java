package defpackage;

import java.util.Iterator;

/* renamed from: anch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anch extends angj {
    final /* synthetic */ ancp a;

    public anch(ancp ancp) {
        this.a = ancp;
    }

    public final boolean contains(Object obj) {
        return this.a.d(obj);
    }

    public final Iterator iterator() {
        return new anck(this.a);
    }

    public final boolean remove(Object obj) {
        return !this.a.b(obj).isEmpty();
    }

    public final int size() {
        return this.a.c.size();
    }
}
