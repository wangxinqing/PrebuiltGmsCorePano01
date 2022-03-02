package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnx implements Runnable {
    private final rny a;
    private final rnh b;
    private final Executor c;
    private final String d;
    private final boolean e;

    public rnx(rny rny, rnh rnh, Executor executor, String str, boolean z) {
        this.a = rny;
        this.b = rnh;
        this.c = executor;
        this.d = str;
        this.e = z;
    }

    public final void run() {
        rny rny = this.a;
        rnh rnh = this.b;
        Executor executor = this.c;
        String str = this.d;
        boolean z = this.e;
        synchronized (rny.c) {
            if (rny.c.get(rnh) == executor) {
                rnh.a(str, z);
            }
        }
    }
}
