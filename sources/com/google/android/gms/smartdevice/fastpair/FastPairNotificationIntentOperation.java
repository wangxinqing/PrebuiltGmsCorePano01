package com.google.android.gms.smartdevice.fastpair;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import com.google.android.chimera.IntentOperation;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastPairNotificationIntentOperation extends IntentOperation {
    public static final iwd a = acqa.a("FastPair", "FastPairIntentOperation");
    public static final Set b = new HashSet();
    public final acwd c = new acwd();
    private long d;
    private abna e;
    private acfv f;
    private BluetoothGatt g;
    private final BluetoothGattCallback h = new acfw(this);
    private final aucd i = anxg.g.o();

    static void a(hol hol, anxg anxg) {
        a.a(anxg.toString(), new Object[0]);
        if (azkn.b()) {
            aucd o = anwh.j.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anwh anwh = (anwh) o.b;
            anxg.getClass();
            anwh.i = anxg;
            anwh.a |= 128;
            hol.a((audx) (anwh) o.i()).b();
            return;
        }
        hol.a(anxg.k()).b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v26, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v33, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v39 */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026d, code lost:
        if (r6 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r8.a(r6, r10);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0201, code lost:
        if (r6 != null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0213, code lost:
        if (r6 != null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r6.disconnect();
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0252, code lost:
        if (r6 != null) goto L_0x026f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0277 A[Catch:{ InterruptedException | ExecutionException -> 0x0442, TimeoutException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0296 A[Catch:{ InterruptedException | ExecutionException -> 0x0442, TimeoutException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a1 A[Catch:{ InterruptedException | ExecutionException -> 0x0442, TimeoutException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0220 A[Catch:{ InterruptedException | ExecutionException -> 0x0442, TimeoutException -> 0x040f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:78:0x0215=Splitter:B:78:0x0215, B:107:0x0268=Splitter:B:107:0x0268, B:75:0x020e=Splitter:B:75:0x020e, B:110:0x026f=Splitter:B:110:0x026f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r0 = defpackage.azkn.d()
            if (r0 == 0) goto L_0x046b
            long r0 = java.lang.System.currentTimeMillis()
            r14.d = r0
            r0 = 0
            if (r15 == 0) goto L_0x0461
            android.os.Bundle r1 = r15.getExtras()
            if (r1 != 0) goto L_0x0019
            goto L_0x0461
        L_0x0019:
            android.os.Bundle r1 = r15.getExtras()
            java.lang.String r2 = "android.bluetooth.device.extra.DEVICE"
            java.lang.Object r1 = r1.get(r2)
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            if (r1 == 0) goto L_0x0460
            java.util.Set r2 = b
            java.lang.String r3 = r1.getAddress()
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0457
            hol r2 = new hol
            java.lang.String r3 = "SMART_SETUP"
            r4 = 0
            r2.<init>(r14, r3, r4)
            java.util.Set r3 = b
            java.lang.String r5 = r1.getAddress()
            r3.add(r5)
            abna r3 = defpackage.abpo.a(r14)
            r14.e = r3
            aucd r3 = r14.i
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r3.c()
            r3.c = r0
        L_0x0056:
            aucj r3 = r3.b
            anxg r3 = (defpackage.anxg) r3
            anxg r5 = defpackage.anxg.g
            r5 = 1
            r3.b = r5
            int r6 = r3.a
            r6 = r6 | r5
            r3.a = r6
            azkn r3 = defpackage.azkn.a
            azko r3 = r3.a()
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x0076
            byte[] r15 = defpackage.aclz.b(r15)
            r11 = r15
            goto L_0x0077
        L_0x0076:
            r11 = r4
        L_0x0077:
            acfv r15 = new acfv
            aucd r8 = r14.i
            long r9 = r14.d
            r6 = r15
            r7 = r14
            r6.<init>(r7, r8, r9, r11)
            r14.f = r15
            iwd r15 = a
            java.lang.String r3 = r1.getAddress()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "onHandleIntent(). BluetoothDevice address: "
            int r7 = r3.length()
            if (r7 != 0) goto L_0x009c
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
            goto L_0x00a0
        L_0x009c:
            java.lang.String r3 = r6.concat(r3)
        L_0x00a0:
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r15.b(r3, r6)
            r15 = 2
            java.lang.String r3 = ""
            boolean r6 = defpackage.azkn.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r6 == 0) goto L_0x00cd
            android.bluetooth.BluetoothGattCallback r3 = r14.h     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.bluetooth.BluetoothGatt r1 = r1.connectGatt(r14, r0, r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r14.g = r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            acwd r1 = r14.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            acwi r1 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            azkn r3 = defpackage.azkn.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            azko r3 = r3.a()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long r6 = r3.i()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object r1 = defpackage.acws.a(r1, r6, r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x00cd:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long r8 = r14.d     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long r6 = r6 - r8
            abna r1 = r14.e     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            double r8 = (double) r6     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            amsv r1 = r1.g     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object r1 = r1.a()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            ahgv r1 = (defpackage.ahgv) r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r11[r0] = r10     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.a(r8, r11)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucd r1 = r14.i     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r8 = r1.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r8 != 0) goto L_0x00f3
            goto L_0x00f8
        L_0x00f3:
            r1.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x00f8:
            aucj r1 = r1.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r1 = (defpackage.anxg) r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r8 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = r8 | 8
            r1.a = r8     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.e = r6     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucd r1 = r14.i     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r8 = r1.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r8 != 0) goto L_0x010b
            goto L_0x0110
        L_0x010b:
            r1.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0110:
            aucj r1 = r1.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r1 = (defpackage.anxg) r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r3.getClass()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r8 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = r8 | r15
            r1.a = r8     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.c = r3     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            iwd r1 = a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r8 = r8.length()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r8 = r8 + 41
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9.<init>(r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r8 = "Device name: "
            r9.append(r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9.append(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r8 = ", Time: "
            r9.append(r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9.append(r6)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r6 = r9.toString()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.b(r6, r7)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r1 = defpackage.azkn.b()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r1 == 0) goto L_0x0165
            boolean r1 = defpackage.azkn.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r1 == 0) goto L_0x0165
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r1 == 0) goto L_0x0165
            aucd r1 = r14.i     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucj r1 = r1.i()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r1 = (defpackage.anxg) r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            a(r2, r1)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0165:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r1 == 0) goto L_0x0174
            azkn r1 = defpackage.azkn.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            azko r1 = r1.a()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.k()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0174:
            boolean r1 = defpackage.azkn.d()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r1 != 0) goto L_0x017c
        L_0x017a:
            goto L_0x044a
        L_0x017c:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r1 != 0) goto L_0x017a
            acfv r1 = r14.f     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            iwd r6 = defpackage.acfv.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r7 = "send request."
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r6.b(r7, r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.util.Map r6 = defpackage.acfv.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r6 = r6.containsKey(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r6 == 0) goto L_0x027c
            android.content.Context r6 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r7 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r6 != 0) goto L_0x01a7
            goto L_0x027c
        L_0x01a7:
            boolean r6 = r6.isConnected()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r6 == 0) goto L_0x027c
            android.content.Context r6 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.util.Map r7 = defpackage.acfv.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r7 = r7.containsKey(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r7 == 0) goto L_0x027b
            java.util.Map r7 = defpackage.acfv.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object r7 = r7.get(r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            azkn r8 = defpackage.azkn.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            azko r8 = r8.a()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r8 = r8.b()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != 0) goto L_0x0224
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x020b, all -> 0x0209 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x020b, all -> 0x0209 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x020b, all -> 0x0209 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x020b, all -> 0x0209 }
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            if (r7 == r9) goto L_0x01f9
            iwd r8 = defpackage.acfv.b     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            r10 = 29
            r9.<init>(r10)     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            java.lang.String r10 = "Bad response code "
            r9.append(r10)     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            r9.append(r7)     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            java.lang.String r7 = r9.toString()     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            r8.d(r7, r9)     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            goto L_0x0201
        L_0x01f9:
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ IOException -> 0x0207, all -> 0x0204 }
        L_0x0201:
            if (r6 == 0) goto L_0x0285
            goto L_0x0215
        L_0x0204:
            r1 = move-exception
            r4 = r6
            goto L_0x021e
        L_0x0207:
            r7 = move-exception
            goto L_0x020e
        L_0x0209:
            r1 = move-exception
            goto L_0x021e
        L_0x020b:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L_0x020e:
            iwd r8 = defpackage.acfv.b     // Catch:{ all -> 0x021c }
            r8.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x021a
        L_0x0215:
            r6.disconnect()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            goto L_0x0285
        L_0x021a:
            goto L_0x0285
        L_0x021c:
            r1 = move-exception
            r4 = r6
        L_0x021e:
            if (r4 == 0) goto L_0x0223
            r4.disconnect()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0223:
            throw r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0224:
            opl r8 = new opl     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8.<init>(r6)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0264, all -> 0x0261 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0264, all -> 0x0261 }
            java.net.HttpURLConnection r6 = r8.a(r6)     // Catch:{ IOException -> 0x0264, all -> 0x0261 }
            int r10 = r6.getResponseCode()     // Catch:{ IOException -> 0x025e, all -> 0x025a }
            if (r10 != r9) goto L_0x0241
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            goto L_0x0252
        L_0x0241:
            iwd r9 = defpackage.acfv.b     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            r11[r0] = r12     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            r11[r5] = r7     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
            java.lang.String r7 = "Bad response (%d) from %s"
            r9.d(r7, r11)     // Catch:{ IOException -> 0x0258, all -> 0x0255 }
        L_0x0252:
            if (r6 == 0) goto L_0x0285
            goto L_0x026f
        L_0x0255:
            r1 = move-exception
            r4 = r6
            goto L_0x0275
        L_0x0258:
            r7 = move-exception
            goto L_0x0268
        L_0x025a:
            r1 = move-exception
            r4 = r6
            r10 = 0
            goto L_0x0275
        L_0x025e:
            r7 = move-exception
            r10 = 0
            goto L_0x0268
        L_0x0261:
            r1 = move-exception
            r10 = 0
            goto L_0x0275
        L_0x0264:
            r6 = move-exception
            r7 = r6
            r6 = r4
            r10 = 0
        L_0x0268:
            iwd r9 = defpackage.acfv.b     // Catch:{ all -> 0x0273 }
            r9.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0273 }
            if (r6 == 0) goto L_0x021a
        L_0x026f:
            r8.a(r6, r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            goto L_0x0285
        L_0x0273:
            r1 = move-exception
            r4 = r6
        L_0x0275:
            if (r4 == 0) goto L_0x027a
            r8.a(r4, r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x027a:
            throw r1     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x027b:
            goto L_0x0285
        L_0x027c:
            iwd r6 = defpackage.acfv.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r7 = "Use default device icon. "
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r6.d(r7, r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0285:
            iwd r6 = defpackage.acfv.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r7 = "show notification."
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r6.b(r7, r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r6 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            iwq r6 = defpackage.iwq.a((android.content.Context) r6)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r6 != 0) goto L_0x02a1
            iwd r1 = defpackage.acfv.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r3 = "NotificationManager is null."
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.d(r3, r4)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            goto L_0x044a
        L_0x02a1:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = 4
            r9 = 2131954028(0x7f13096c, float:1.9544544E38)
            java.lang.String r10 = "smartdevice.channel"
            r11 = 26
            if (r7 >= r11) goto L_0x02ae
            goto L_0x02c1
        L_0x02ae:
            android.app.NotificationChannel r7 = new android.app.NotificationChannel     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r12 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r12 = r12.getString(r9)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.<init>(r10, r12, r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r12 = "Smart_device_channel_for_fastpair"
            r7.setDescription(r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r6.a((android.app.NotificationChannel) r7)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x02c1:
            je r7 = new je     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r12 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.<init>(r12, r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r10 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r12 = 2131231953(0x7f0804d1, float:1.8080002E38)
            int r10 = defpackage.hdg.a(r10, r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.b((int) r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r10 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r12[r0] = r3     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r13 = 2131954058(0x7f13098a, float:1.9544605E38)
            java.lang.String r10 = r10.getString(r13, r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.e(r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r10 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r12 = 2131954057(0x7f130989, float:1.9544602E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.b((java.lang.CharSequence) r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r12 = 60000(0xea60, double:2.9644E-319)
            r7.A = r12     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r10 = defpackage.jkr.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r10 == 0) goto L_0x030e
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r10.<init>()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r12 = "android.substName"
            android.content.Context r13 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r9 = r13.getString(r9)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r10.putString(r12, r9)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.a((android.os.Bundle) r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x030e:
            anxe r9 = defpackage.anxe.d     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucd r9 = r9.o()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r4 == 0) goto L_0x032f
            r7.a((android.graphics.Bitmap) r4)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r4 = r9.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r4 != 0) goto L_0x031e
            goto L_0x0323
        L_0x031e:
            r9.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0323:
            aucj r4 = r9.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxe r4 = (defpackage.anxe) r4     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.c = r5     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r10 = r4.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r10 = r10 | r15
            r4.a = r10     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            goto L_0x0344
        L_0x032f:
            boolean r4 = r9.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r4 != 0) goto L_0x0334
            goto L_0x0339
        L_0x0334:
            r9.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0339:
            aucj r4 = r9.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxe r4 = (defpackage.anxe) r4     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.c = r15     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r10 = r4.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r10 = r10 | r15
            r4.a = r10     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0344:
            aucd r4 = r1.g     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r10 = r4.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r10 != 0) goto L_0x034b
            goto L_0x0350
        L_0x034b:
            r4.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0350:
            aucj r4 = r4.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r4 = (defpackage.anxg) r4     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucj r9 = r9.i()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxe r9 = (defpackage.anxe) r9     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r9.getClass()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.d = r9     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r9 = r4.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = r8 | r9
            r4.a = r8     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucd r4 = r1.g     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r8 = r4.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r8 != 0) goto L_0x036b
            goto L_0x0370
        L_0x036b:
            r4.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0370:
            aucj r4 = r4.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r4 = (defpackage.anxg) r4     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = 3
            r4.b = r8     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r8 = r4.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = r8 | r5
            r4.a = r8     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long r12 = r1.e     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long r8 = r8 - r12
            iwd r4 = defpackage.acfv.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r12 = 47
            r10.<init>(r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r12 = "Time to show notification: "
            r10.append(r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r10.append(r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r10 = r10.toString()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.b(r10, r12)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucd r4 = r1.g     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            boolean r10 = r4.c     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r10 != 0) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            r4.c()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.c = r0     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x03a9:
            aucj r4 = r4.b     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r4 = (defpackage.anxg) r4     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r10 = r4.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r10 = r10 | 16
            r4.a = r10     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r4.f = r8     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucd r4 = r1.g     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            aucj r4 = r4.i()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            anxg r4 = (defpackage.anxg) r4     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            byte[] r4 = r4.k()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r3 = r3.hashCode()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r1.d = r3     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r8 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r9 = "com.google.android.gms.smartdevice.fastpair.DISMISS"
            byte[] r10 = r1.f     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.app.PendingIntent r3 = com.google.android.gms.smartdevice.fastpair.NotificationBehaviorIntentOperation.a(r8, r9, r3, r4, r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.b((android.app.PendingIntent) r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r3 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r8 = "com.google.android.gms.smartdevice.fastpair.OPEN"
            int r9 = r1.d     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            byte[] r10 = r1.f     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.app.PendingIntent r3 = com.google.android.gms.smartdevice.fastpair.NotificationBehaviorIntentOperation.a(r3, r8, r9, r4, r10)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.f = r3     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r3 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r8 = r1.d     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            byte[] r9 = r1.f     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            java.lang.String r10 = "com.google.android.gms.smartdevice.fastpair.OPEN_ACTION"
            android.app.PendingIntent r3 = com.google.android.gms.smartdevice.fastpair.NotificationBehaviorIntentOperation.a(r3, r10, r8, r4, r9)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.content.Context r4 = r1.a     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r8 = 2131954056(0x7f130988, float:1.95446E38)
            java.lang.String r4 = r4.getString(r8)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.a((int) r0, (java.lang.CharSequence) r4, (android.app.PendingIntent) r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            if (r3 >= r11) goto L_0x0405
            r7.j = r5     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            long[] r3 = new long[r0]     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r7.a((long[]) r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
        L_0x0405:
            int r1 = r1.d     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            android.app.Notification r3 = r7.b()     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            r6.a((int) r1, (android.app.Notification) r3)     // Catch:{ InterruptedException -> 0x0444, ExecutionException -> 0x0442, TimeoutException -> 0x040f }
            goto L_0x044a
        L_0x040f:
            r1 = move-exception
            iwd r1 = a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "Time out for getting device name."
            r1.b(r4, r3)
            aucd r1 = r14.i
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0420
            goto L_0x0425
        L_0x0420:
            r1.c()
            r1.c = r0
        L_0x0425:
            aucj r0 = r1.b
            anxg r0 = (defpackage.anxg) r0
            r0.b = r15
            int r15 = r0.a
            r15 = r15 | r5
            r0.a = r15
            boolean r15 = defpackage.azkn.b()
            if (r15 == 0) goto L_0x044a
            aucd r15 = r14.i
            aucj r15 = r15.i()
            anxg r15 = (defpackage.anxg) r15
            a(r2, r15)
            goto L_0x044a
        L_0x0442:
            r15 = move-exception
            goto L_0x0445
        L_0x0444:
            r15 = move-exception
        L_0x0445:
            iwd r0 = a
            r0.a((java.lang.Throwable) r15)
        L_0x044a:
            android.bluetooth.BluetoothGatt r15 = r14.g
            if (r15 == 0) goto L_0x0456
            r15.disconnect()
            android.bluetooth.BluetoothGatt r15 = r14.g
            r15.close()
        L_0x0456:
            return
        L_0x0457:
            iwd r15 = a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Already processed the same intent."
            r15.b(r1, r0)
        L_0x0460:
            return
        L_0x0461:
            iwd r15 = a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Intent is null or doesn't have extras."
            r15.f(r1, r0)
            return
        L_0x046b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.fastpair.FastPairNotificationIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
