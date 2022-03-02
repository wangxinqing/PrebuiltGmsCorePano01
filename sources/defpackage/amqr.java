package defpackage;

import java.util.Iterator;

/* renamed from: amqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqr implements Iterable {
    final /* synthetic */ Iterable a;
    final /* synthetic */ amqt b;

    public amqr(amqt amqt, Iterable iterable) {
        this.b = amqt;
        this.a = iterable;
    }

    public final Iterator iterator() {
        return new amqq(this);
    }
}
