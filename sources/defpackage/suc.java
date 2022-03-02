package defpackage;

/* renamed from: suc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class suc {
    private static final Object f = new Object();
    public final String a;
    private final sua b;
    private final Object c;
    private final Object d;
    private final Object e = new Object();
    private volatile Object g = null;
    private volatile Object h = null;

    public suc(String str, Object obj, Object obj2, sua sua) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = sua;
    }

    public final Object a() {
        return a((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = defpackage.sud.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        if (r4.hasNext() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        r0 = (defpackage.suc) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        if (defpackage.spc.a() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        if (r2 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        r1 = r2.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005a, code lost:
        throw new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            if (r4 != 0) goto L_0x0091
            spc r4 = defpackage.sub.a
            if (r4 == 0) goto L_0x008f
            spc r4 = defpackage.sub.a
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x0060
            java.lang.Object r4 = f
            monitor-enter(r4)
            boolean r0 = defpackage.spc.a()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.h     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r3.h     // Catch:{ all -> 0x005d }
            goto L_0x0022
        L_0x0020:
            java.lang.Object r0 = r3.c     // Catch:{ all -> 0x005d }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            return r0
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            java.util.List r4 = defpackage.sud.a     // Catch:{ SecurityException -> 0x005b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005b }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005b }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005b }
            suc r0 = (defpackage.suc) r0     // Catch:{ SecurityException -> 0x005b }
            boolean r1 = defpackage.spc.a()     // Catch:{ SecurityException -> 0x005b }
            if (r1 != 0) goto L_0x0053
            r1 = 0
            sua r2 = r0.b     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r1 = r2.a()     // Catch:{ IllegalStateException -> 0x0048 }
            goto L_0x0049
        L_0x0047:
            goto L_0x0049
        L_0x0048:
            r2 = move-exception
        L_0x0049:
            java.lang.Object r2 = f     // Catch:{ SecurityException -> 0x005b }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005b }
            r0.h = r1     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            goto L_0x002b
        L_0x0050:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            throw r4     // Catch:{ SecurityException -> 0x005b }
        L_0x0053:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005b }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005b }
            throw r4     // Catch:{ SecurityException -> 0x005b }
        L_0x005b:
            r4 = move-exception
            goto L_0x0060
        L_0x005d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            throw r0
        L_0x0060:
            sua r4 = r3.b
            if (r4 != 0) goto L_0x0070
            spc r4 = defpackage.sub.a
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x006d
            java.lang.Object r4 = r3.c
            goto L_0x006f
        L_0x006d:
            java.lang.Object r4 = r3.d
        L_0x006f:
            return r4
        L_0x0070:
            java.lang.Object r4 = r4.a()     // Catch:{ SecurityException -> 0x0082, IllegalStateException -> 0x0075 }
            return r4
        L_0x0075:
            r4 = move-exception
            spc r4 = defpackage.sub.a
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x007f
            java.lang.Object r4 = r3.c
            goto L_0x0081
        L_0x007f:
            java.lang.Object r4 = r3.d
        L_0x0081:
            return r4
        L_0x0082:
            r4 = move-exception
            spc r4 = defpackage.sub.a
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x008c
            java.lang.Object r4 = r3.c
            goto L_0x008e
        L_0x008c:
            java.lang.Object r4 = r3.d
        L_0x008e:
            return r4
        L_0x008f:
            java.lang.Object r4 = r3.d
        L_0x0091:
            return r4
        L_0x0092:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0095:
            throw r4
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suc.a(java.lang.Object):java.lang.Object");
    }
}
