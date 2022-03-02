package defpackage;

import java.util.concurrent.Callable;

/* renamed from: acsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acsc implements Callable {
    private final long a;

    public acsc(long j) {
        this.a = j;
    }

    public final Object call() {
        Thread.sleep(this.a);
        return null;
    }
}
