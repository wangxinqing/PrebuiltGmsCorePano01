package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: svr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svr extends Thread {
    final /* synthetic */ svs a;
    private final Object b;
    private final BlockingQueue c;
    private boolean d = false;

    public svr(svs svs, String str, BlockingQueue blockingQueue) {
        this.a = svs;
        iva.a((Object) str);
        iva.a((Object) blockingQueue);
        this.b = new Object();
        this.c = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.a.E().f.a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void b() {
        svs svs = this.a;
        AtomicLong atomicLong = svs.f;
        synchronized (svs.c) {
            if (!this.d) {
                this.a.d.release();
                this.a.c.notifyAll();
                svs svs2 = this.a;
                if (this == svs2.a) {
                    svs2.a = null;
                } else if (this != svs2.b) {
                    svs2.E().c.a("Current scheduler thread is neither worker nor network");
                } else {
                    svs2.b = null;
                }
                this.d = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 == 0) goto L_0x0074
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x006f }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x006f }
        L_0x000b:
            java.util.concurrent.BlockingQueue r1 = r5.c     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x006f }
            svq r1 = (defpackage.svq) r1     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0060
            java.lang.Object r1 = r5.b     // Catch:{ all -> 0x006f }
            monitor-enter(r1)     // Catch:{ all -> 0x006f }
            java.util.concurrent.BlockingQueue r2 = r5.c     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x0032
            svs r2 = r5.a     // Catch:{ all -> 0x005d }
            java.util.concurrent.atomic.AtomicLong r3 = defpackage.svs.f     // Catch:{ all -> 0x005d }
            boolean r2 = r2.e     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r5.b     // Catch:{ InterruptedException -> 0x002e }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r2 = move-exception
            r5.a(r2)     // Catch:{ all -> 0x005d }
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            svs r1 = r5.a     // Catch:{ all -> 0x006f }
            java.util.concurrent.atomic.AtomicLong r2 = defpackage.svs.f     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x006f }
            monitor-enter(r1)     // Catch:{ all -> 0x006f }
            java.util.concurrent.BlockingQueue r2 = r5.c     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x0058
            svs r0 = r5.a     // Catch:{ all -> 0x005a }
            spg r0 = r0.v()     // Catch:{ all -> 0x005a }
            suc r2 = defpackage.sud.aE     // Catch:{ all -> 0x005a }
            boolean r0 = r0.a((defpackage.suc) r2)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0053
            r5.b()     // Catch:{ all -> 0x005a }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            r5.b()
            return
        L_0x0058:
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            goto L_0x000b
        L_0x005a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x005d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x0060:
            boolean r2 = r1.a     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x0067
            r2 = 10
            goto L_0x0068
        L_0x0067:
            r2 = r0
        L_0x0068:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x006f }
            r1.run()     // Catch:{ all -> 0x006f }
            goto L_0x000b
        L_0x006f:
            r0 = move-exception
            r5.b()
            throw r0
        L_0x0074:
            svs r1 = r5.a     // Catch:{ InterruptedException -> 0x007f }
            java.util.concurrent.atomic.AtomicLong r2 = defpackage.svs.f     // Catch:{ InterruptedException -> 0x007f }
            java.util.concurrent.Semaphore r1 = r1.d     // Catch:{ InterruptedException -> 0x007f }
            r1.acquire()     // Catch:{ InterruptedException -> 0x007f }
            r0 = 1
            goto L_0x0001
        L_0x007f:
            r1 = move-exception
            r5.a(r1)
            goto L_0x0001
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svr.run():void");
    }

    public final void a() {
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }
}
