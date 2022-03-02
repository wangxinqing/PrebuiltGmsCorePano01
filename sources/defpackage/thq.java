package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: thq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class thq implements Callable {
    private final aorr a;
    private final long b;

    public thq(aorr aorr, long j) {
        this.a = aorr;
        this.b = j;
    }

    public final Object call() {
        return this.a.get(this.b, TimeUnit.MILLISECONDS);
    }
}
