package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: aufj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aufj extends AbstractList implements RandomAccess, audh {
    public final audh a;

    public aufj(audh audh) {
        this.a = audh;
    }

    public final void a(auay auay) {
        throw new UnsupportedOperationException();
    }

    public final Object c(int i) {
        return this.a.c(i);
    }

    public final List d() {
        return this.a.d();
    }

    public final audh e() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((audg) this.a).get(i);
    }

    public final Iterator iterator() {
        return new aufi(this);
    }

    public final ListIterator listIterator(int i) {
        return new aufh(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
