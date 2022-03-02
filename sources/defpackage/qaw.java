package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qaw implements Callable {
    private final amqy a;
    private final amzy b;

    public qaw(amqy amqy, amzy amzy) {
        this.a = amqy;
        this.b = amzy;
    }

    public final Object call() {
        return this.a.a(anbs.a((Iterable) this.b, qax.a));
    }
}
