package defpackage;

import android.os.Handler;

/* renamed from: qdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qdi implements Handler.Callback {
    private final qdm a;

    public qdi(qdm qdm) {
        this.a = qdm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r2.a(new defpackage.qdp(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r5 = r5.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r5 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r2.b.a((java.lang.Object) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            qdm r0 = r4.a
            int r1 = r5.arg1
            monitor-enter(r0)
            android.util.SparseArray r2 = r0.e     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x005d }
            qdo r2 = (defpackage.qdo) r2     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x0029
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r2 = 50
            r5.<init>(r2)     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "Received response for unknown request: "
            r5.append(r2)     // Catch:{ all -> 0x005d }
            r5.append(r1)     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "MessengerIpcClient"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005d }
            android.util.Log.w(r1, r5)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            goto L_0x005b
        L_0x0029:
            android.util.SparseArray r3 = r0.e     // Catch:{ all -> 0x005d }
            r3.remove(r1)     // Catch:{ all -> 0x005d }
            r0.b()     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r1 = "unsupported"
            boolean r0 = r5.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x004b
            qdp r5 = new qdp
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r5.<init>(r0, r1)
            r2.a(r5)
            goto L_0x005b
        L_0x004b:
            java.lang.String r0 = "data"
            android.os.Bundle r5 = r5.getBundle(r0)
            if (r5 != 0) goto L_0x0056
            android.os.Bundle r5 = android.os.Bundle.EMPTY
        L_0x0056:
            acwd r0 = r2.b
            r0.a((java.lang.Object) r5)
        L_0x005b:
            r5 = 1
            return r5
        L_0x005d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdi.handleMessage(android.os.Message):boolean");
    }
}
