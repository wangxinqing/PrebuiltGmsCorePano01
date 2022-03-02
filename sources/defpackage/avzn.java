package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: avzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class avzn implements Closeable {
    public final InputStream a() {
        return b().c();
    }

    public abstract batf b();

    public final void close() {
        b().close();
    }
}
