package defpackage;

/* renamed from: athi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class athi implements Runnable {
    private final athn a;

    public athi(athn athn) {
        this.a = athn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2 = r0.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = java.lang.System.currentTimeMillis();
        r1 = r0.e.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r1.hasNext() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r5 = (defpackage.atih) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r5.b > r3) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r0.e.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r5.a(r3) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0.d.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r0.d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r1.hasNext() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r5 = (defpackage.atih) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r5.a(r3) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r5.b(r3);
        r0.e.put(r5, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r1 = r0.d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r1.hasNext() != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (r0.d.size() == 0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r1 = r0.d.size();
        r3 = new defpackage.atih[r1];
        r0.d.toArray(r3);
        r0.d.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2 = new java.util.ArrayList();
        r4 = r0.c.a();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        if (r5 < r1) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r2.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r0.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        r6 = r3[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r6 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r2.isEmpty() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        if ((r6.a() + r4) <= 32768) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r0.a(r2);
        r4 = r0.c.a();
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        r3[r5] = null;
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        r4 = r4 + r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r0.a(r3, new java.io.IOException(r1.getMessage()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        ((defpackage.atih) r1.next()).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            athn r0 = r9.a
            java.lang.Object r1 = r0.f
            monitor-enter(r1)
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x010c }
            long r4 = r0.j     // Catch:{ all -> 0x010c }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x001b
            aqeq r2 = r0.k     // Catch:{ all -> 0x010c }
            r2.b(r4)     // Catch:{ all -> 0x010c }
            aqeq r0 = r0.k     // Catch:{ all -> 0x010c }
            r0.f()     // Catch:{ all -> 0x010c }
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            return
        L_0x001b:
            r2 = 0
            r0.j = r2     // Catch:{ all -> 0x010c }
            r0.i = r2     // Catch:{ all -> 0x010c }
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            java.lang.Object r2 = r0.f
            monitor-enter(r2)
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0109 }
            java.util.HashMap r1 = r0.e     // Catch:{ all -> 0x0109 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0109 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0109 }
        L_0x0033:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0109 }
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0109 }
            atih r5 = (defpackage.atih) r5     // Catch:{ all -> 0x0109 }
            long r6 = r5.b     // Catch:{ all -> 0x0109 }
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x0033
            java.util.HashMap r6 = r0.e     // Catch:{ all -> 0x0109 }
            r6.remove(r5)     // Catch:{ all -> 0x0109 }
            boolean r6 = r5.a((long) r3)     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x0033
            java.util.ArrayList r6 = r0.d     // Catch:{ all -> 0x0109 }
            r6.add(r5)     // Catch:{ all -> 0x0109 }
            goto L_0x0033
        L_0x0056:
            java.util.ArrayList r1 = r0.d     // Catch:{ all -> 0x0109 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0109 }
        L_0x005c:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0109 }
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0109 }
            atih r5 = (defpackage.atih) r5     // Catch:{ all -> 0x0109 }
            boolean r6 = r5.a((long) r3)     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x005c
            r5.b((long) r3)     // Catch:{ all -> 0x0109 }
            java.util.HashMap r6 = r0.e     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = ""
            r6.put(r5, r7)     // Catch:{ all -> 0x0109 }
            goto L_0x005c
        L_0x0079:
            java.util.ArrayList r1 = r0.d     // Catch:{ all -> 0x0109 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0109 }
        L_0x007f:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0109 }
            if (r3 != 0) goto L_0x00fe
            r0.b()     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r1 = r0.d     // Catch:{ all -> 0x0109 }
            int r1 = r1.size()     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x00fc
            java.util.ArrayList r1 = r0.d     // Catch:{ all -> 0x0109 }
            int r1 = r1.size()     // Catch:{ all -> 0x0109 }
            atih[] r3 = new defpackage.atih[r1]     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r4 = r0.d     // Catch:{ all -> 0x0109 }
            r4.toArray(r3)     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r4 = r0.d     // Catch:{ all -> 0x0109 }
            r4.clear()     // Catch:{ all -> 0x0109 }
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ee }
            r2.<init>()     // Catch:{ Exception -> 0x00ee }
            athz r4 = r0.c     // Catch:{ Exception -> 0x00ee }
            int r4 = r4.a()     // Catch:{ Exception -> 0x00ee }
            r5 = 0
        L_0x00af:
            if (r5 < r1) goto L_0x00be
            r0.b()     // Catch:{ Exception -> 0x00ee }
            int r1 = r2.size()     // Catch:{ Exception -> 0x00ee }
            if (r1 <= 0) goto L_0x00bd
            r0.a((java.util.ArrayList) r2)     // Catch:{ Exception -> 0x00ee }
        L_0x00bd:
            return
        L_0x00be:
            r6 = r3[r5]     // Catch:{ Exception -> 0x00ee }
            if (r6 != 0) goto L_0x00c3
            goto L_0x00eb
        L_0x00c3:
            boolean r7 = r2.isEmpty()     // Catch:{ Exception -> 0x00ee }
            if (r7 == 0) goto L_0x00ca
        L_0x00c9:
            goto L_0x00e0
        L_0x00ca:
            int r7 = r6.a()     // Catch:{ Exception -> 0x00ee }
            int r7 = r7 + r4
            r8 = 32768(0x8000, float:4.5918E-41)
            if (r7 <= r8) goto L_0x00c9
            r0.a((java.util.ArrayList) r2)     // Catch:{ Exception -> 0x00ee }
            athz r4 = r0.c     // Catch:{ Exception -> 0x00ee }
            int r4 = r4.a()     // Catch:{ Exception -> 0x00ee }
            r2.clear()     // Catch:{ Exception -> 0x00ee }
        L_0x00e0:
            r7 = 0
            r3[r5] = r7     // Catch:{ Exception -> 0x00ee }
            r2.add(r6)     // Catch:{ Exception -> 0x00ee }
            int r6 = r6.a()     // Catch:{ Exception -> 0x00ee }
            int r4 = r4 + r6
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x00af
        L_0x00ee:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r1 = r1.getMessage()
            r2.<init>(r1)
            r0.a(r3, r2)
            return
        L_0x00fc:
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            return
        L_0x00fe:
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0109 }
            atih r3 = (defpackage.atih) r3     // Catch:{ all -> 0x0109 }
            r3.h()     // Catch:{ all -> 0x0109 }
            goto L_0x007f
        L_0x0109:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            throw r0
        L_0x010c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            goto L_0x0110
        L_0x010f:
            throw r0
        L_0x0110:
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.athi.run():void");
    }
}
