package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aoqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoqp {
    private static final Logger a = Logger.getLogger(aoqp.class.getName());
    private aoqo b;
    private boolean c;

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", sb.toString(), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r2 = r0.c;
        r0.c = r1;
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        b(r1.a, r1.b);
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.c     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0025
            r0 = 1
            r3.c = r0     // Catch:{ all -> 0x0027 }
            aoqo r0 = r3.b     // Catch:{ all -> 0x0027 }
            r1 = 0
            r3.b = r1     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
        L_0x000e:
            if (r0 == 0) goto L_0x0017
            aoqo r2 = r0.c
            r0.c = r1
            r1 = r0
            r0 = r2
            goto L_0x000e
        L_0x0017:
        L_0x0018:
            if (r1 == 0) goto L_0x0024
            java.lang.Runnable r0 = r1.a
            java.util.concurrent.Executor r2 = r1.b
            b(r0, r2)
            aoqo r1 = r1.c
            goto L_0x0018
        L_0x0024:
            return
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x002a:
            throw r0
        L_0x002b:
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqp.a():void");
    }

    public final void a(Runnable runnable, Executor executor) {
        amrl.a((Object) runnable, (Object) "Runnable was null.");
        amrl.a((Object) executor, (Object) "Executor was null.");
        synchronized (this) {
            if (!this.c) {
                this.b = new aoqo(runnable, executor, this.b);
            } else {
                b(runnable, executor);
            }
        }
    }
}
