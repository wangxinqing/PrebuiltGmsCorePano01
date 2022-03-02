package defpackage;

import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: aheu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aheu implements Callable {
    private final Closeable a;
    private final aorr b;

    public aheu(Closeable closeable, aorr aorr) {
        this.a = closeable;
        this.b = aorr;
    }

    public final Object call() {
        Closeable closeable = this.a;
        aorr aorr = this.b;
        closeable.close();
        return aorl.a((Future) aorr);
    }
}
