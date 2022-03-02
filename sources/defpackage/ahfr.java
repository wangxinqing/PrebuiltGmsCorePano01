package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ahfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfr implements Callable {
    private final ahfs a;

    public ahfr(ahfs ahfs) {
        this.a = ahfs;
    }

    public final Object call() {
        ahfs ahfs = this.a;
        synchronized (ahfs.b.d) {
            ahfs.a = null;
        }
        return null;
    }
}
