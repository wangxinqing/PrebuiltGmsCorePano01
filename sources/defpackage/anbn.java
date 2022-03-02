package defpackage;

import java.util.Iterator;

/* renamed from: anbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbn extends amym {
    final /* synthetic */ Iterable a;
    final /* synthetic */ amqy b;

    public anbn(Iterable iterable, amqy amqy) {
        this.a = iterable;
        this.b = amqy;
    }

    public final Iterator iterator() {
        return ance.a(this.a.iterator(), this.b);
    }
}
