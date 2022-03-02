package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: ammi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ammi implements Closeable {
    public static ammi a(File file) {
        return new ammm(file);
    }

    public abstract long a();

    /* access modifiers changed from: protected */
    public abstract InputStream a(long j, long j2);

    public final synchronized InputStream b() {
        return a(0, a());
    }
}
