package defpackage;

/* renamed from: tpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tpf {
    private Object a;

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005e }
            aymi r2 = defpackage.aymi.a     // Catch:{ all -> 0x005e }
            aymj r2 = r2.a()     // Catch:{ all -> 0x005e }
            long r2 = r2.ak()     // Catch:{ all -> 0x005e }
        L_0x000f:
            java.lang.Object r4 = r7.a     // Catch:{ all -> 0x005e }
            if (r4 == r8) goto L_0x005c
            if (r4 != 0) goto L_0x0032
            r7.a = r8     // Catch:{ all -> 0x005e }
            jjg r0 = defpackage.tky.a     // Catch:{ all -> 0x005e }
            anie r0 = r0.d()     // Catch:{ all -> 0x005e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "MediumsOwnership owner set to %s(%d)"
            java.lang.Class r2 = r8.getClass()     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ all -> 0x005e }
            int r8 = r8.hashCode()     // Catch:{ all -> 0x005e }
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (int) r8)     // Catch:{ all -> 0x005e }
            monitor-exit(r7)
            return
        L_0x0032:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005e }
            long r4 = r4 - r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0041
            long r4 = r2 - r4
            r7.wait(r4)     // Catch:{ all -> 0x005e }
            goto L_0x000f
        L_0x0041:
            r7.a = r8     // Catch:{ all -> 0x005e }
            jjg r0 = defpackage.tky.a     // Catch:{ all -> 0x005e }
            anie r0 = r0.d()     // Catch:{ all -> 0x005e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "MediumsOwnership forcibly acquired by %s(%d)"
            java.lang.Class r2 = r8.getClass()     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ all -> 0x005e }
            int r8 = r8.hashCode()     // Catch:{ all -> 0x005e }
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (int) r8)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r7)
            return
        L_0x005e:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0062
        L_0x0061:
            throw r8
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpf.a(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(Object obj) {
        if (this.a == obj) {
            this.a = null;
            notifyAll();
        }
    }
}
