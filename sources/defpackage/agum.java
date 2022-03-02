package defpackage;

import java.util.concurrent.Callable;

/* renamed from: agum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agum implements Callable {
    private final agus a;
    private final long b;
    private final Iterable c;

    public agum(agus agus, long j, Iterable iterable) {
        this.a = agus;
        this.b = j;
        this.c = iterable;
    }

    public final Object call() {
        this.a.b(this.b, this.c);
        return null;
    }
}
