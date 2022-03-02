package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bapb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bapb {
    public static final azxg a = azxg.a("internal-stub-type");
    private static final Logger b = Logger.getLogger(bapb.class.getName());

    private bapb() {
    }

    public static aorr a(azxl azxl, Object obj) {
        baow baow = new baow(azxl);
        a(azxl, obj, (azxk) new bapa(baow), false);
        return baow;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(defpackage.azxi r10, defpackage.baaj r11, defpackage.azxh r12, java.lang.Object r13) {
        /*
            baoz r0 = new baoz
            r0.<init>()
            azxh r1 = new azxh
            r1.<init>(r12)
            r1.c = r0
            azxl r10 = r10.a(r11, r1)
            r11 = 1
            r12 = 0
            aorr r13 = a((defpackage.azxl) r10, (java.lang.Object) r13)     // Catch:{ RuntimeException -> 0x00eb, Error -> 0x00e3, all -> 0x00e0 }
        L_0x0016:
            boolean r1 = r13.isDone()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            java.lang.String r2 = "Thread interrupted"
            r3 = 0
            if (r1 != 0) goto L_0x006d
            defpackage.baoz.a()     // Catch:{ InterruptedException -> 0x0061 }
            java.lang.Object r1 = r0.poll()     // Catch:{ InterruptedException -> 0x0061 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x0061 }
            if (r1 != 0) goto L_0x0046
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x0061 }
            r0.b = r1     // Catch:{ InterruptedException -> 0x0061 }
        L_0x0030:
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x0042 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x003b
            r0.b = r3     // Catch:{ InterruptedException -> 0x0061 }
            goto L_0x0046
        L_0x003b:
            java.util.concurrent.locks.LockSupport.park(r0)     // Catch:{ all -> 0x0042 }
            defpackage.baoz.a()     // Catch:{ all -> 0x0042 }
            goto L_0x0030
        L_0x0042:
            r1 = move-exception
            r0.b = r3     // Catch:{ InterruptedException -> 0x0061 }
            throw r1     // Catch:{ InterruptedException -> 0x0061 }
        L_0x0046:
            r1.run()     // Catch:{ all -> 0x004a }
            goto L_0x0058
        L_0x004a:
            r8 = move-exception
            java.util.logging.Logger r3 = defpackage.baoz.a     // Catch:{ InterruptedException -> 0x0061 }
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch:{ InterruptedException -> 0x0061 }
            java.lang.String r5 = "io.grpc.stub.ClientCalls$ThreadlessExecutor"
            java.lang.String r6 = "waitAndDrain"
            java.lang.String r7 = "Runnable threw exception"
            r3.logp(r4, r5, r6, r7, r8)     // Catch:{ InterruptedException -> 0x0061 }
        L_0x0058:
            java.lang.Object r1 = r0.poll()     // Catch:{ InterruptedException -> 0x0061 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x0061 }
            if (r1 != 0) goto L_0x0046
            goto L_0x0016
        L_0x0061:
            r12 = move-exception
            r10.a((java.lang.String) r2, (java.lang.Throwable) r12)     // Catch:{ RuntimeException -> 0x006a, Error -> 0x0067 }
            r12 = 1
            goto L_0x0016
        L_0x0067:
            r12 = move-exception
            goto L_0x00e6
        L_0x006a:
            r12 = move-exception
            goto L_0x00ee
        L_0x006d:
            java.lang.Object r10 = r13.get()     // Catch:{ InterruptedException -> 0x00bc, ExecutionException -> 0x007b }
            if (r12 == 0) goto L_0x007a
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            r11.interrupt()
        L_0x007a:
            return r10
        L_0x007b:
            r11 = move-exception
            java.lang.Throwable r11 = r11.getCause()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            java.lang.String r13 = "t"
            defpackage.amrl.a((java.lang.Object) r11, (java.lang.Object) r13)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            r13 = r11
        L_0x0086:
            if (r13 == 0) goto L_0x00ab
            boolean r0 = r13 instanceof defpackage.babk     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r13 instanceof defpackage.babl     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            if (r0 != 0) goto L_0x0095
            java.lang.Throwable r13 = r13.getCause()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            goto L_0x0086
        L_0x0095:
            babl r13 = (defpackage.babl) r13     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babl r11 = new babl     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babj r0 = r13.a     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            baaf r13 = r13.b     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            r11.<init>(r0, r13)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            goto L_0x00bb
        L_0x00a1:
            babk r13 = (defpackage.babk) r13     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babl r11 = new babl     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babj r13 = r13.a     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            r11.<init>(r13, r3)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            goto L_0x00bb
        L_0x00ab:
            babj r13 = defpackage.babj.d     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            java.lang.String r0 = "unexpected exception"
            babj r13 = r13.a((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babj r11 = r13.b((java.lang.Throwable) r11)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babl r11 = r11.b()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
        L_0x00bb:
            throw r11     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
        L_0x00bc:
            r11 = move-exception
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            r13.interrupt()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babj r13 = defpackage.babj.c     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babj r13 = r13.a((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babj r11 = r13.b((java.lang.Throwable) r11)     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            babl r11 = r11.b()     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
            throw r11     // Catch:{ RuntimeException -> 0x00db, Error -> 0x00d6, all -> 0x00d3 }
        L_0x00d3:
            r10 = move-exception
            r11 = r12
            goto L_0x00f4
        L_0x00d6:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x00e6
        L_0x00db:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x00ee
        L_0x00e0:
            r10 = move-exception
            r11 = 0
            goto L_0x00f4
        L_0x00e3:
            r11 = move-exception
            r12 = r11
            r11 = 0
        L_0x00e6:
            java.lang.RuntimeException r10 = a((defpackage.azxl) r10, (java.lang.Throwable) r12)     // Catch:{ all -> 0x00f3 }
            throw r10     // Catch:{ all -> 0x00f3 }
        L_0x00eb:
            r11 = move-exception
            r12 = r11
            r11 = 0
        L_0x00ee:
            java.lang.RuntimeException r10 = a((defpackage.azxl) r10, (java.lang.Throwable) r12)     // Catch:{ all -> 0x00f3 }
            throw r10     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r10 = move-exception
        L_0x00f4:
            if (r11 == 0) goto L_0x00fd
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            r11.interrupt()
        L_0x00fd:
            goto L_0x00ff
        L_0x00fe:
            throw r10
        L_0x00ff:
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bapb.a(azxi, baaj, azxh, java.lang.Object):java.lang.Object");
    }

    private static RuntimeException a(azxl azxl, Throwable th) {
        try {
            azxl.a((String) null, th);
        } catch (Throwable th2) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }

    private static void a(azxl azxl, Object obj, azxk azxk, boolean z) {
        azxl.a(azxk, new baaf());
        if (z) {
            azxl.a(1);
        } else {
            azxl.a(2);
        }
        try {
            azxl.a(obj);
            azxl.b();
        } catch (RuntimeException e) {
            throw a(azxl, (Throwable) e);
        } catch (Error e2) {
            throw a(azxl, (Throwable) e2);
        }
    }

    public static void a(azxl azxl, Object obj, bape bape) {
        a(azxl, obj, (azxk) new baox(bape, new baov(azxl)), true);
    }
}
