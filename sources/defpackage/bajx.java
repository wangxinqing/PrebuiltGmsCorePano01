package defpackage;

/* renamed from: bajx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bajx extends azxb {
    public final baei a;
    public final baaj b;
    public final baaf c;
    public final azxh d;
    public final azyd e;
    public final Object f = new Object();
    public baef g;
    public boolean h;
    bafs i;

    public bajx(baei baei, baaj baaj, baaf baaf, azxh azxh) {
        this.a = baei;
        this.b = baaj;
        this.c = baaf;
        this.d = azxh;
        this.e = azyd.a();
    }

    public final void a(babj babj) {
        amrl.a(!babj.a(), (Object) "Cannot fail with OK status");
        amrl.b(!this.h, (Object) "apply() or fail() already called");
        a((baef) new bage(babj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3.i == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        defpackage.amrl.b(r1, (java.lang.Object) "delayedStream is null");
        r3.i.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.baef r4) {
        /*
            r3 = this;
            boolean r0 = r3.h
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "already finalized"
            defpackage.amrl.b((boolean) r0, (java.lang.Object) r2)
            r3.h = r1
            java.lang.Object r0 = r3.f
            monitor-enter(r0)
            baef r2 = r3.g     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x0016
            r3.g = r4     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            bafs r0 = r3.i
            if (r0 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r0 = "delayedStream is null"
            defpackage.amrl.b((boolean) r1, (java.lang.Object) r0)
            bafs r0 = r3.i
            r0.a((defpackage.baef) r4)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajx.a(baef):void");
    }
}
