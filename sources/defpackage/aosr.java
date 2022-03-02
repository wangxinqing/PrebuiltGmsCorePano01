package defpackage;

import java.util.concurrent.Future;

/* renamed from: aosr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aosr {
    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(long r4, java.util.concurrent.TimeUnit r6) {
        /*
            r0 = 1
            r1 = 0
            long r4 = r6.toNanos(r4)     // Catch:{ all -> 0x0028 }
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0028 }
            long r2 = r2 + r4
        L_0x000b:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x001d, all -> 0x001a }
            r6.sleep(r4)     // Catch:{ InterruptedException -> 0x001d, all -> 0x001a }
            if (r1 == 0) goto L_0x0019
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L_0x0019:
            return
        L_0x001a:
            r4 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x001d:
            r4 = move-exception
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0026 }
            long r4 = r2 - r4
            r1 = 1
            goto L_0x000b
        L_0x0026:
            r4 = move-exception
            goto L_0x002a
        L_0x0028:
            r4 = move-exception
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L_0x0033:
            goto L_0x0035
        L_0x0034:
            throw r4
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosr.a(long, java.util.concurrent.TimeUnit):void");
    }
}
