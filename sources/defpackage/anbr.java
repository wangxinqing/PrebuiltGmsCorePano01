package defpackage;

import java.util.Iterator;

/* renamed from: anbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anbr extends amym {
    private final Iterable a;

    public anbr(Iterable iterable) {
        this.a = iterable;
    }

    public final Iterator iterator() {
        return ance.a(this.a.iterator());
    }

    public final String toString() {
        return this.a.toString();
    }
}
