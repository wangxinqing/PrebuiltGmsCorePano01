package defpackage;

/* renamed from: alqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class alqn implements alqr {
    public alqq a;
    int b = 3;
    private boolean c;

    public final synchronized void a() {
        if (this.b == 3) {
            this.b = 2;
            c();
        } else {
            throw new IllegalStateException("Cannot open if connection is not in state NEW.");
        }
    }

    public final synchronized void a(alqq alqq) {
        this.a = alqq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.b     // Catch:{ all -> 0x0016 }
            r1 = 1
            if (r0 == r1) goto L_0x0014
            r2.b = r1     // Catch:{ all -> 0x0016 }
            r2.d()     // Catch:{ all -> 0x0016 }
            alqq r0 = r2.a     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0013
            r0.a()
        L_0x0013:
            return
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqn.b():void");
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public final void a(alqp alqp) {
        alqq alqq;
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                alqq = this.a;
            } else {
                alqq = null;
            }
        }
        if (alqq != null) {
            alqq.a(alqp);
        }
    }
}
