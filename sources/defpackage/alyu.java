package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: alyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyu extends AbstractList {
    public final Object[] a;
    public final int b;

    public alyu(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    public final Object get(int i) {
        return this.a[i];
    }

    public final Iterator iterator() {
        return new alyt(this);
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.a, this.b);
    }
}
