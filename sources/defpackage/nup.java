package defpackage;

import android.net.ConnectivityManager;

/* renamed from: nup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nup {
    private final ConnectivityManager a;
    private int b = 2;
    private int c = 2;

    public nup(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    public static boolean a(int i) {
        return i == 3 || i == 4;
    }

    public final synchronized int b() {
        return this.b;
    }

    public final synchronized void b(int i) {
        this.c = this.b;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(boolean r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 2
            if (r3 == 0) goto L_0x0029
            int r3 = r2.b     // Catch:{ all -> 0x002b }
            if (r3 != r0) goto L_0x0029
            boolean r3 = defpackage.jkr.c()     // Catch:{ all -> 0x002b }
            r0 = 3
            if (r3 == 0) goto L_0x0029
            boolean r3 = defpackage.jkr.c()     // Catch:{ all -> 0x002b }
            r1 = 1
            if (r3 == 0) goto L_0x001e
            android.net.ConnectivityManager r3 = r2.a     // Catch:{ all -> 0x002b }
            int r3 = r3.getRestrictBackgroundStatus()     // Catch:{ all -> 0x002b }
            if (r3 != r1) goto L_0x0029
        L_0x001e:
            if (r4 != r1) goto L_0x0029
            int r3 = r2.c     // Catch:{ all -> 0x002b }
            if (r3 != r0) goto L_0x0027
            r3 = 4
            monitor-exit(r2)
            return r3
        L_0x0027:
            monitor-exit(r2)
            return r0
        L_0x0029:
            monitor-exit(r2)
            return r0
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nup.a(boolean, int):int");
    }

    public final synchronized boolean a() {
        return a(this.b);
    }
}
