package defpackage;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: toj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class toj implements Callable {
    private final InputStream a;

    public toj(InputStream inputStream) {
        this.a = inputStream;
    }

    public final Object call() {
        return Integer.valueOf(this.a.read());
    }
}
