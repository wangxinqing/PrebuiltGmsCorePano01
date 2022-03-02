package defpackage;

import android.os.Handler;

/* renamed from: akay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akay implements Handler.Callback {
    final /* synthetic */ akba a;

    public akay(akba akba) {
        this.a = akba;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0.d == r4) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r4) {
        /*
            r3 = this;
            int r0 = r4.what
            if (r0 == 0) goto L_0x0006
            r4 = 0
            return r4
        L_0x0006:
            akba r0 = r3.a
            java.lang.Object r4 = r4.obj
            akaz r4 = (defpackage.akaz) r4
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            akaz r2 = r0.c     // Catch:{ all -> 0x001f }
            if (r2 != r4) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            akaz r2 = r0.d     // Catch:{ all -> 0x001f }
            if (r2 != r4) goto L_0x001c
        L_0x0018:
            r2 = 2
            r0.a(r4, r2)     // Catch:{ all -> 0x001f }
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            r4 = 1
            return r4
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akay.handleMessage(android.os.Message):boolean");
    }
}
