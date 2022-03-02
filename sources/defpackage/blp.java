package defpackage;

import java.util.Iterator;

/* renamed from: blp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class blp implements Iterable {
    public final amzy a;
    public final bpq b;

    public blp(amzy amzy, bpq bpq) {
        this.a = amzy;
        this.b = bpq;
    }

    public final Iterator iterator() {
        return new blo(this);
    }
}
