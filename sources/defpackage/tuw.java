package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: tuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tuw implements Runnable {
    private final Context a;
    private final arxt b;
    private final Account c;

    public tuw(Context context, arxt arxt, Account account) {
        this.a = context;
        this.b = arxt;
        this.c = account;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        if ((r6.getCause() instanceof defpackage.auda) != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        throw ((defpackage.auda) r6.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        if ((r6.getCause() instanceof defpackage.auda) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        throw new defpackage.auda(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        throw ((defpackage.auda) r6.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f8, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r6 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:13:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            android.content.Context r0 = r12.a
            arxt r1 = r12.b
            android.accounts.Account r2 = r12.c
            android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r3 != 0) goto L_0x000f
            jjg r0 = defpackage.tsp.a
            return
        L_0x000f:
            android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            java.util.Set r3 = r3.getBondedDevices()
            if (r3 == 0) goto L_0x0115
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0021
            goto L_0x0115
        L_0x0021:
            if (r2 == 0) goto L_0x0112
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
        L_0x0029:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0111
            java.lang.Object r6 = r3.next()
            android.bluetooth.BluetoothDevice r6 = (android.bluetooth.BluetoothDevice) r6
            java.lang.Class<ttf> r7 = defpackage.ttf.class
            java.lang.Object r7 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r7)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            ttf r7 = (defpackage.ttf) r7     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r8 = r6.getAddress()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            tzi r7 = r7.a((java.lang.String) r8)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            aorr r8 = r1.a((android.accounts.Account) r2)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.Object r8 = r8.get()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.util.List r8 = (java.util.List) r8     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            tzj r7 = defpackage.tvd.a((java.util.List) r8, (defpackage.tzi) r7)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            if (r7 == 0) goto L_0x0029
            auay r7 = r7.c     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            aubs r8 = defpackage.aubs.c()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            uaj r9 = defpackage.uaj.K     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            aubc r7 = r7.h()     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            r10 = 4
            java.lang.Object r9 = r9.c(r10)     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            aucj r9 = (defpackage.aucj) r9     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            aueh r10 = defpackage.aueh.a     // Catch:{ IOException -> 0x00de, RuntimeException -> 0x00cd }
            aueq r10 = r10.a((java.lang.Object) r9)     // Catch:{ IOException -> 0x00de, RuntimeException -> 0x00cd }
            aubd r11 = defpackage.aubd.a((defpackage.aubc) r7)     // Catch:{ IOException -> 0x00de, RuntimeException -> 0x00cd }
            r10.a(r9, r11, r8)     // Catch:{ IOException -> 0x00de, RuntimeException -> 0x00cd }
            r10.d(r9)     // Catch:{ IOException -> 0x00de, RuntimeException -> 0x00cd }
            r7.a((int) r4)     // Catch:{ auda -> 0x00cb, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            defpackage.aucj.b((defpackage.aucj) r9)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            uaj r9 = (defpackage.uaj) r9     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            jjg r7 = defpackage.tsp.a     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            anie r7 = r7.d()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            anih r7 = (defpackage.anih) r7     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r8 = "FastPair: found device with bonded device public address, item title = %s"
            java.lang.String r10 = r9.h     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            r7.a((java.lang.String) r8, (java.lang.Object) r10)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r7 = r6.getAddress()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r7 = defpackage.arww.c(r7)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            jjg r8 = defpackage.tsp.a     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            anie r8 = r8.d()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            anih r8 = (defpackage.anih) r8     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r10 = "FastPair: found device with bonded device public address, alias = %s"
            r8.a((java.lang.String) r10, (java.lang.Object) r7)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            if (r7 == 0) goto L_0x00bd
            java.lang.String r8 = r9.h     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            boolean r7 = r7.equals(r8)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            if (r7 == 0) goto L_0x00bd
            jjg r6 = defpackage.tsp.a     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            anie r6 = r6.d()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            anih r6 = (defpackage.anih) r6     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r7 = "FastPair: No need to update alias name when footrpints sync complete"
            r6.a((java.lang.String) r7)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            goto L_0x0029
        L_0x00bd:
            java.lang.String r6 = r6.getAddress()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            java.lang.String r7 = r9.h     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            defpackage.arww.a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
            if (r5 != 0) goto L_0x0029
            r5 = 1
            goto L_0x0029
        L_0x00cb:
            r6 = move-exception
            throw r6     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
        L_0x00cd:
            r6 = move-exception
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            boolean r7 = r7 instanceof defpackage.auda     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            if (r7 == 0) goto L_0x00dd
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            auda r6 = (defpackage.auda) r6     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            throw r6     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
        L_0x00dd:
            throw r6     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
        L_0x00de:
            r6 = move-exception
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            boolean r7 = r7 instanceof defpackage.auda     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            if (r7 != 0) goto L_0x00f1
            auda r7 = new auda     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            java.lang.String r6 = r6.getMessage()     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            r7.<init>((java.lang.String) r6)     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            throw r7     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
        L_0x00f1:
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            auda r6 = (defpackage.auda) r6     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            throw r6     // Catch:{ auda -> 0x00f8, ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
        L_0x00f8:
            r6 = move-exception
            throw r6     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc, auda -> 0x00fa }
        L_0x00fa:
            r6 = move-exception
            goto L_0x00ff
        L_0x00fc:
            r6 = move-exception
            goto L_0x00ff
        L_0x00fe:
            r6 = move-exception
        L_0x00ff:
            jjg r7 = defpackage.tsp.a
            anie r7 = r7.c()
            anih r7 = (defpackage.anih) r7
            r7.a((java.lang.Throwable) r6)
            java.lang.String r6 = "FastPair: Failed to read device from Footprints when footprints sync complete."
            r7.a((java.lang.String) r6)
            goto L_0x0029
        L_0x0111:
            return
        L_0x0112:
            jjg r0 = defpackage.tsp.a
            return
        L_0x0115:
            jjg r0 = defpackage.tsp.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuw.run():void");
    }
}
