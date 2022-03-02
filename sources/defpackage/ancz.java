package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: ancz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancz extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;
    final List a;
    final amqy b;

    public ancz(List list, amqy amqy) {
        amrl.a((Object) list);
        this.a = list;
        amrl.a((Object) amqy);
        this.b = amqy;
    }

    public final void clear() {
        this.a.clear();
    }

    public final ListIterator listIterator(int i) {
        return new ancy(this, this.a.listIterator(i));
    }

    public final int size() {
        return this.a.size();
    }
}
