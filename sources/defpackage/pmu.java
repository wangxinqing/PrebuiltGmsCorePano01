package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: pmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class pmu implements Iterator {
    private Object a;

    private final void a() {
        if (this.a == null) {
            this.a = d();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object d();

    public final boolean hasNext() {
        a();
        return this.a != null;
    }

    public final Object next() {
        a();
        Object obj = this.a;
        if (obj != null) {
            this.a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
