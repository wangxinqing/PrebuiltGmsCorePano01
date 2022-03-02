package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: amze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amze extends AbstractSet {
    final amzf b;

    public amze(amzf amzf) {
        this.b = amzf;
    }

    public abstract Object a(int i);

    public final void clear() {
        this.b.clear();
    }

    public final Iterator iterator() {
        return new amzd(this);
    }

    public final int size() {
        return this.b.c;
    }
}
