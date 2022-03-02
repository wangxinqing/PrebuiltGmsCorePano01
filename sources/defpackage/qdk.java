package defpackage;

/* renamed from: qdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qdk implements Runnable {
    private final qdm a;

    public qdk(qdm qdm) {
        this.a = qdm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = r0.c;
        r3 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r3 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r1 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r1 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r0.a(2, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r3 = r0.f.a;
        r4 = r0.b;
        r5 = android.os.Message.obtain();
        r5.what = 1;
        r5.arg1 = r1.a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", false);
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.c);
        r5.setData(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            qdm r0 = r8.a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.a     // Catch:{ all -> 0x008c }
            r2 = 2
            if (r1 != r2) goto L_0x008a
            java.util.Queue r1 = r0.d     // Catch:{ all -> 0x008c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008c }
            if (r1 != 0) goto L_0x0085
            java.util.Queue r1 = r0.d     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x008c }
            qdo r1 = (defpackage.qdo) r1     // Catch:{ all -> 0x008c }
            android.util.SparseArray r3 = r0.e     // Catch:{ all -> 0x008c }
            int r4 = r1.a     // Catch:{ all -> 0x008c }
            r3.put(r4, r1)     // Catch:{ all -> 0x008c }
            qdq r3 = r0.f     // Catch:{ all -> 0x008c }
            java.util.concurrent.ScheduledExecutorService r3 = r3.b     // Catch:{ all -> 0x008c }
            qdl r4 = new qdl     // Catch:{ all -> 0x008c }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x008c }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008c }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            qdq r3 = r0.f
            android.content.Context r3 = r3.a
            android.os.Messenger r4 = r0.b
            android.os.Message r5 = android.os.Message.obtain()
            r6 = 1
            r5.what = r6
            int r6 = r1.a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r6 = 0
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r6)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r6 = "pkg"
            r4.putString(r6, r3)
            android.os.Bundle r1 = r1.c
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r5.setData(r4)
            qdn r1 = r0.c     // Catch:{ RemoteException -> 0x007b }
            android.os.Messenger r3 = r1.a     // Catch:{ RemoteException -> 0x007b }
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.iid.MessengerCompat r1 = r1.b     // Catch:{ RemoteException -> 0x007b }
            if (r1 == 0) goto L_0x006f
            r1.a(r5)     // Catch:{ RemoteException -> 0x007b }
            goto L_0x0002
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x007b }
            throw r1     // Catch:{ RemoteException -> 0x007b }
        L_0x0077:
            r3.send(r5)     // Catch:{ RemoteException -> 0x007b }
            goto L_0x0002
        L_0x007b:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x0085:
            r0.b()     // Catch:{ all -> 0x008c }
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008f:
            throw r1
        L_0x0090:
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdk.run():void");
    }
}
