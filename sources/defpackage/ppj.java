package defpackage;

import android.content.Context;

/* renamed from: ppj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppj implements Runnable {
    final Context a;
    final aplf b;
    final /* synthetic */ ppk c;

    public ppj(ppk ppk, Context context, aplf aplf) {
        this.c = ppk;
        this.a = context;
        this.b = aplf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        defpackage.apev.a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r10.c.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0017, B:11:0x0040, B:23:0x0059] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            android.content.Context r1 = r10.a     // Catch:{ all -> 0x0069 }
            ppk r2 = r10.c     // Catch:{ all -> 0x0069 }
            int r2 = r2.a()     // Catch:{ all -> 0x0069 }
            int r1 = defpackage.ppk.a((android.content.Context) r1, (int) r2)     // Catch:{ all -> 0x0069 }
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x002d
            if (r1 == r2) goto L_0x002d
            r2 = 3
            if (r1 == r2) goto L_0x0017
            goto L_0x0052
        L_0x0017:
            android.content.Context r1 = r10.a     // Catch:{ all -> 0x0062 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0062 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0062 }
            aplf r3 = r10.b     // Catch:{ all -> 0x0062 }
            android.content.Context r4 = r10.a     // Catch:{ all -> 0x0062 }
            oyq r4 = defpackage.ppk.a((android.content.Context) r4)     // Catch:{ all -> 0x0062 }
            defpackage.ppi.a(r1, r2, r0, r3, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x0052
        L_0x002d:
            ppf r4 = new ppf     // Catch:{ all -> 0x0062 }
            android.content.Context r5 = r10.a     // Catch:{ all -> 0x0062 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0062 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0062 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0062 }
            ppe r4 = r4.iterator()     // Catch:{ all -> 0x0062 }
            android.content.Context r5 = r10.a     // Catch:{ all -> 0x0058 }
            if (r1 != r2) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            aplf r1 = r10.b     // Catch:{ all -> 0x0058 }
            oyq r2 = defpackage.ppk.a((android.content.Context) r5)     // Catch:{ all -> 0x0058 }
            defpackage.ppi.a(r5, r4, r3, r1, r2)     // Catch:{ all -> 0x0058 }
            r4.close()     // Catch:{ all -> 0x0062 }
        L_0x0052:
            ppk r1 = r10.c     // Catch:{ all -> 0x0069 }
            r1.a((defpackage.ppj) r10)     // Catch:{ all -> 0x0069 }
            return
        L_0x0058:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0062 }
        L_0x0061:
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            ppk r2 = r10.c     // Catch:{ all -> 0x0069 }
            r2.a((defpackage.ppj) r10)     // Catch:{ all -> 0x0069 }
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            r4 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Calendar indexing task failed"
            defpackage.pnz.a((java.lang.Throwable) r4, (java.lang.String) r1, (java.lang.Object[]) r0)
            oyt r2 = new oyt
            android.content.Context r0 = r10.a
            r2.<init>(r0)
            ppk r0 = r10.c
            oys r5 = r0.b
            long r6 = defpackage.axrp.f()
            agvx r8 = defpackage.ozx.bg
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r3 = "Calendar indexing task failed"
            r2.a(r3, r4, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppj.run():void");
    }
}
