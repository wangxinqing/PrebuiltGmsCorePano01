package defpackage;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: auq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auq implements Callable {
    final /* synthetic */ InputStream a;

    public auq(InputStream inputStream) {
        this.a = inputStream;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return aus.a(this.a, (String) null);
    }
}
