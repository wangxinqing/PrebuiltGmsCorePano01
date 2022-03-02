package defpackage;

/* renamed from: nkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkb implements Runnable {
    private final nkc a;
    private final amko b;

    public nkb(nkc nkc, amko amko) {
        this.a = nkc;
        this.b = amko;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            nkc r0 = r5.a
            amko r1 = r5.b
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            amko r3 = r0.c     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            if (r1 == r3) goto L_0x0010
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            r1 = 0
            r0.c = r1     // Catch:{ all -> 0x001f }
            java.util.concurrent.Future r3 = r0.d     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r4 = 0
            r3.cancel(r4)     // Catch:{ all -> 0x001f }
            r0.d = r1     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkb.run():void");
    }
}
