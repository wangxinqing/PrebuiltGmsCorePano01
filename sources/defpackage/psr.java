package defpackage;

import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: psr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psr implements Closeable {
    public final ozs a;
    public final orf b;
    public final NativeIndex c;
    public final agpc d;
    public final Executor e;
    public final oyq f;

    public psr(ozs ozs, orf orf, NativeIndex nativeIndex, agpc agpc, oyq oyq, Executor executor) {
        this.a = ozs;
        this.b = orf;
        this.c = nativeIndex;
        this.d = agpc;
        this.f = oyq;
        this.e = executor;
    }

    public final void close() {
        this.d.close();
    }
}
