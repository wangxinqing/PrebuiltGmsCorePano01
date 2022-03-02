package defpackage;

import java.util.Set;

/* renamed from: ukq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukq {
    private final Set a = new ob();
    private tfw b = new tfw();

    /* access modifiers changed from: package-private */
    public final synchronized tfw a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "ukq"
            java.lang.String r1 = "b"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.util.Set r3 = r5.a     // Catch:{ all -> 0x004f }
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x004f }
            if (r3 != 0) goto L_0x0026
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x004f }
            anie r3 = r3.d()     // Catch:{ all -> 0x004f }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x004f }
            r4 = 1948(0x79c, float:2.73E-42)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x004f }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "In ScanningCancellationFlag, service %s attempted to cancel the scan but they were not registered as a scanner"
            r0.a((java.lang.String) r1, (java.lang.Object) r6)     // Catch:{ all -> 0x004f }
            monitor-exit(r5)
            return
        L_0x0026:
            java.util.Set r3 = r5.a     // Catch:{ all -> 0x004f }
            r3.remove(r6)     // Catch:{ all -> 0x004f }
            java.util.Set r3 = r5.a     // Catch:{ all -> 0x004f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x004d
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x004f }
            anie r3 = r3.d()     // Catch:{ all -> 0x004f }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x004f }
            r4 = 1960(0x7a8, float:2.747E-42)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x004f }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "In ScanningCancellationFlag, service %s is the last scanner to stop scanning. The flag has been cancelled."
            r0.a((java.lang.String) r1, (java.lang.Object) r6)     // Catch:{ all -> 0x004f }
            tfw r6 = r5.b     // Catch:{ all -> 0x004f }
            r6.a()     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r5)
            return
        L_0x004f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukq.b(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str) {
        if (this.a.isEmpty()) {
            ((anih) ((anih) ulh.a.d()).a("ukq", "a", 1936, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("In ScanningCancellationFlag, service %s has become the first scanner. The flag has been reset.", (Object) str);
            this.b = new tfw();
        }
        this.a.add(str);
    }
}
