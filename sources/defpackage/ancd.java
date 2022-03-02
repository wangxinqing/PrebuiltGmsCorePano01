package defpackage;

import java.util.Iterator;

/* renamed from: ancd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancd implements Iterator {
    private final Iterator a;
    private boolean b;
    private Object c;

    public ancd(Iterator it) {
        amrl.a((Object) it);
        this.a = it;
    }

    public final Object a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }

    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    public final void remove() {
        amrl.b(!this.b, (Object) "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
