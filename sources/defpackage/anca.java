package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: anca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum anca implements Iterator {
    ;

    private anca(String str) {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        amxg.a(false);
    }
}
