package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: ahcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcc implements Closeable {
    public final ahcb a;
    private final long b;
    private long c = System.currentTimeMillis();

    public ahcc(ahcb ahcb, long j, TimeUnit timeUnit) {
        this.a = ahcb;
        this.b = timeUnit.toMillis(j);
    }

    public final void a(int i) {
        this.a.a(i);
        if (System.currentTimeMillis() - this.c >= this.b) {
            this.a.a();
            this.c = System.currentTimeMillis();
        }
    }

    public final void close() {
        this.a.a();
    }
}
