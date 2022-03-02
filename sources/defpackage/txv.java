package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: txv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txv implements txy {
    private arxt a;
    private final Map b = new HashMap();

    public final void a(Context context, BluetoothDevice bluetoothDevice) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r8 = r2.c;
        r1 = defpackage.aubs.c();
        r2 = defpackage.uaj.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r8.h();
        r2 = (defpackage.aucj) r2.c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3 = defpackage.aueh.a.a((java.lang.Object) r2);
        r3.a(r2, defpackage.aubd.a(r8), r1);
        r3.d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8.a(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        defpackage.aucj.b(r2);
        r8 = defpackage.tvq.a((defpackage.uaj) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (defpackage.tvq.a(r8, r6) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r5.b.put(r7, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        r5.b.put(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
        java.lang.Thread.currentThread().interrupt();
        r8 = (defpackage.anih) defpackage.tsp.a.d();
        r8.a((java.lang.Throwable) r7);
        r8.a("FastPair: event stream fail to read device from footprint");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0100, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0101, code lost:
        r8 = (defpackage.anih) defpackage.tsp.a.d();
        r8.a(r7);
        r8.a("FastPair: event stream fail to read device from footprint");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:9:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100 A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:9:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r6, android.bluetooth.BluetoothDevice r7, int r8, byte[] r9) {
        /*
            r5 = this;
            java.lang.String r9 = "FastPair: event stream fail to read device from footprint"
            r0 = 1
            if (r8 != r0) goto L_0x0136
            jjg r8 = defpackage.tsp.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            java.lang.String r0 = "FastPair: The log buffer of bluetooth device is full: %s"
            r8.a((java.lang.String) r0, (java.lang.Object) r7)
            arxt r8 = r5.a
            if (r8 != 0) goto L_0x0020
            java.lang.Class<arxt> r8 = defpackage.arxt.class
            java.lang.Object r8 = defpackage.thl.a((android.content.Context) r6, (java.lang.Class) r8)
            arxt r8 = (defpackage.arxt) r8
            r5.a = r8
        L_0x0020:
            java.util.Map r8 = r5.b
            boolean r8 = r8.containsKey(r7)
            r0 = 0
            if (r8 == 0) goto L_0x0034
            java.util.Map r8 = r5.b
            java.lang.Object r7 = r8.get(r7)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x010f
        L_0x0034:
            java.lang.Class<ttf> r8 = defpackage.ttf.class
            java.lang.Object r8 = defpackage.thl.a((android.content.Context) r6, (java.lang.Class) r8)     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            ttf r8 = (defpackage.ttf) r8     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            java.lang.String r1 = r7.getAddress()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            tzi r8 = r8.a((java.lang.String) r1)     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            if (r8 == 0) goto L_0x0135
            arxt r1 = r5.a     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            aorr r1 = r1.a()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
        L_0x0056:
            boolean r2 = r1.hasNext()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            if (r2 == 0) goto L_0x00e6
            java.lang.Object r2 = r1.next()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            tzj r2 = (defpackage.tzj) r2     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            auay r3 = r2.b     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            auay r4 = r8.c     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            boolean r3 = r3.equals(r4)     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            if (r3 == 0) goto L_0x0056
            auay r8 = r2.c     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            aubs r1 = defpackage.aubs.c()     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            uaj r2 = defpackage.uaj.K     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            aubc r8 = r8.h()     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            r3 = 4
            java.lang.Object r2 = r2.c(r3)     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            aucj r2 = (defpackage.aucj) r2     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            aueh r3 = defpackage.aueh.a     // Catch:{ IOException -> 0x00ca, RuntimeException -> 0x00b9 }
            aueq r3 = r3.a((java.lang.Object) r2)     // Catch:{ IOException -> 0x00ca, RuntimeException -> 0x00b9 }
            aubd r4 = defpackage.aubd.a((defpackage.aubc) r8)     // Catch:{ IOException -> 0x00ca, RuntimeException -> 0x00b9 }
            r3.a(r2, r4, r1)     // Catch:{ IOException -> 0x00ca, RuntimeException -> 0x00b9 }
            r3.d(r2)     // Catch:{ IOException -> 0x00ca, RuntimeException -> 0x00b9 }
            r1 = 0
            r8.a((int) r1)     // Catch:{ auda -> 0x00b7, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            defpackage.aucj.b((defpackage.aucj) r2)     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            uaj r2 = (defpackage.uaj) r2     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            java.lang.String r8 = defpackage.tvq.a((defpackage.uaj) r2)     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
            boolean r1 = defpackage.tvq.a((java.lang.String) r8, (android.content.Context) r6)     // Catch:{ ExecutionException -> 0x00b4, auda -> 0x00b2, InterruptedException -> 0x00af }
            if (r1 != 0) goto L_0x00a8
            java.util.Map r1 = r5.b     // Catch:{ ExecutionException -> 0x00b4, auda -> 0x00b2, InterruptedException -> 0x00af }
            r1.put(r7, r0)     // Catch:{ ExecutionException -> 0x00b4, auda -> 0x00b2, InterruptedException -> 0x00af }
            goto L_0x00ad
        L_0x00a8:
            java.util.Map r0 = r5.b     // Catch:{ ExecutionException -> 0x00b4, auda -> 0x00b2, InterruptedException -> 0x00af }
            r0.put(r7, r8)     // Catch:{ ExecutionException -> 0x00b4, auda -> 0x00b2, InterruptedException -> 0x00af }
        L_0x00ad:
            r0 = r8
            goto L_0x010f
        L_0x00af:
            r7 = move-exception
            r0 = r8
            goto L_0x00e8
        L_0x00b2:
            r7 = move-exception
            goto L_0x00b5
        L_0x00b4:
            r7 = move-exception
        L_0x00b5:
            r0 = r8
            goto L_0x0101
        L_0x00b7:
            r7 = move-exception
            throw r7     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
        L_0x00b9:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            boolean r8 = r8 instanceof defpackage.auda     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            if (r8 == 0) goto L_0x00c9
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            auda r7 = (defpackage.auda) r7     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            throw r7     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
        L_0x00c9:
            throw r7     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
        L_0x00ca:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            boolean r8 = r8 instanceof defpackage.auda     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            if (r8 != 0) goto L_0x00dd
            auda r8 = new auda     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            r8.<init>((java.lang.String) r7)     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            throw r8     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
        L_0x00dd:
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            auda r7 = (defpackage.auda) r7     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
            throw r7     // Catch:{ auda -> 0x00e4, ExecutionException -> 0x0100, InterruptedException -> 0x00e7 }
        L_0x00e4:
            r7 = move-exception
            throw r7     // Catch:{ ExecutionException -> 0x0100, auda -> 0x00fe, InterruptedException -> 0x00e7 }
        L_0x00e6:
            goto L_0x010f
        L_0x00e7:
            r7 = move-exception
        L_0x00e8:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
            jjg r8 = defpackage.tsp.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            r8.a((java.lang.Throwable) r7)
            r8.a((java.lang.String) r9)
            goto L_0x010f
        L_0x00fe:
            r7 = move-exception
            goto L_0x0101
        L_0x0100:
            r7 = move-exception
        L_0x0101:
            jjg r8 = defpackage.tsp.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            r8.a((java.lang.Throwable) r7)
            r8.a((java.lang.String) r9)
        L_0x010f:
            if (r0 == 0) goto L_0x0135
            boolean r7 = defpackage.tvq.a((java.lang.String) r0, (android.content.Context) r6)
            if (r7 == 0) goto L_0x0135
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "com.google.android.gms.nearby.fastpair.ACTION_LOG_BUFFER_FULL"
            r7.<init>(r8)
            r7.setPackage(r0)
            jjg r8 = defpackage.tsp.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            java.lang.String r9 = "FastPair: send the log buffer full event stream broadcast to %s"
            r8.a((java.lang.String) r9, (java.lang.Object) r0)
            android.content.Context r6 = r6.getApplicationContext()
            r6.sendBroadcast(r7)
        L_0x0135:
            return
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txv.a(android.content.Context, android.bluetooth.BluetoothDevice, int, byte[]):void");
    }
}
