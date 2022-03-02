package defpackage;

/* renamed from: mo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mo {
    public boolean a;
    public Object b;
    private mn c;
    private boolean d;

    public final void a(mn mnVar) {
        synchronized (this) {
            while (this.d) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.c != mnVar) {
                this.c = mnVar;
                if (this.a) {
                    if (mnVar != null) {
                        mnVar.a();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.a     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            r0 = 1
            r3.a = r0     // Catch:{ all -> 0x003a }
            r3.d = r0     // Catch:{ all -> 0x003a }
            mn r0 = r3.c     // Catch:{ all -> 0x003a }
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r0.a()     // Catch:{ all -> 0x0016 }
            goto L_0x0018
        L_0x0016:
            r0 = move-exception
            goto L_0x0022
        L_0x0018:
            if (r1 == 0) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0016 }
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0016 }
            r1.cancel()     // Catch:{ all -> 0x0016 }
            goto L_0x002d
        L_0x0022:
            monitor-enter(r3)
            r3.d = r2     // Catch:{ all -> 0x002a }
            r3.notifyAll()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            monitor-enter(r3)
            r3.d = r2     // Catch:{ all -> 0x0035 }
            r3.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo.b():void");
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }
}
