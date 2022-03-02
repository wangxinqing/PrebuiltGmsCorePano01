package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baky implements Executor {
    private static final Logger a = Logger.getLogger(baky.class.getName());
    private boolean b;
    private ArrayDeque c;

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", sb.toString(), th);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r8.c == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r8.c != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r8.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            java.lang.String r0 = "'task' must not be null."
            defpackage.amrl.a((java.lang.Object) r9, (java.lang.Object) r0)
            boolean r0 = r8.b
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r8.b = r0
            r0 = 0
            r9.run()     // Catch:{ all -> 0x001a }
            java.util.ArrayDeque r9 = r8.c
            if (r9 == 0) goto L_0x0017
        L_0x0014:
            r8.a()
        L_0x0017:
            r8.b = r0
            return
        L_0x001a:
            r6 = move-exception
            java.util.logging.Logger r1 = a     // Catch:{ all -> 0x004a }
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "io.grpc.internal.SerializeReentrantCallsDirectExecutor"
            java.lang.String r4 = "execute"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x004a }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x004a }
            int r5 = r5.length()     // Catch:{ all -> 0x004a }
            int r5 = r5 + 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r7.<init>(r5)     // Catch:{ all -> 0x004a }
            java.lang.String r5 = "Exception while executing runnable "
            r7.append(r5)     // Catch:{ all -> 0x004a }
            r7.append(r9)     // Catch:{ all -> 0x004a }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x004a }
            r1.logp(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque r9 = r8.c
            if (r9 == 0) goto L_0x0017
            goto L_0x0014
        L_0x004a:
            r9 = move-exception
            java.util.ArrayDeque r1 = r8.c
            if (r1 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r8.a()
        L_0x0053:
            r8.b = r0
            throw r9
        L_0x0056:
            java.util.ArrayDeque r0 = r8.c
            if (r0 != 0) goto L_0x0062
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r8.c = r0
        L_0x0062:
            java.util.ArrayDeque r0 = r8.c
            r0.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baky.execute(java.lang.Runnable):void");
    }
}
