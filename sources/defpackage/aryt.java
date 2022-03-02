package defpackage;

import android.bluetooth.BluetoothProfile;
import java.util.List;

/* renamed from: aryt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aryt implements BluetoothProfile.ServiceListener {
    final /* synthetic */ aryx a;

    public aryt(aryx aryx) {
        this.a = aryx;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        ((anih) ((anih) aryq.a.d()).a("aryt", "onServiceConnected", 130, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: onServiceConnected with profile %d.", i);
        synchronized (this.a) {
            if (aymw.N()) {
                aryx aryx = this.a;
                int i2 = aryx.h;
                BluetoothProfile bluetoothProfile2 = (BluetoothProfile) aryx.d.get(i);
                if (bluetoothProfile2 != null) {
                    if (bluetoothProfile2 != bluetoothProfile) {
                        this.a.b.closeProfileProxy(i, bluetoothProfile2);
                        ((anih) ((anih) aryq.a.d()).a("aryt", "onServiceConnected", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: onServiceConnected with profile %d, but there is old profile connected.", i);
                    }
                }
            }
            aryx aryx2 = this.a;
            int i3 = aryx.h;
            aryx2.d.put(i, bluetoothProfile);
        }
        List a2 = this.a.a();
        if (a2.isEmpty()) {
            ((anih) ((anih) aryq.a.d()).a("aryt", "onServiceConnected", 147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr:connected with profile, but no listener registered.");
            return;
        }
        int size = a2.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((aryw) a2.get(i4)).a(i, bluetoothProfile);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        if (r2 >= r1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        ((defpackage.aryw) r0.get(r2)).a();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r0 = r6.a;
        r0.b.getProfileProxy(r0.a, r0.g, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        r0 = r6.a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r0.isEmpty() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.aryq.a.d()).a("aryt", "onServiceDisconnected", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr:disconnected with profile, but no listener registered.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceDisconnected(int r7) {
        /*
            r6 = this;
            aryq r0 = defpackage.aryq.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "aryt"
            java.lang.String r2 = "onServiceDisconnected"
            r3 = 157(0x9d, float:2.2E-43)
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = "BTConnStateMgr: onServiceDisconnected with profile %d."
            r0.a((java.lang.String) r3, (int) r7)
            aryx r0 = r6.a
            monitor-enter(r0)
            aryx r3 = r6.a     // Catch:{ all -> 0x007e }
            int r5 = defpackage.aryx.h     // Catch:{ all -> 0x007e }
            android.util.SparseArray r3 = r3.d     // Catch:{ all -> 0x007e }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x007e }
            android.bluetooth.BluetoothProfile r3 = (android.bluetooth.BluetoothProfile) r3     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x007c
            aryx r5 = r6.a     // Catch:{ all -> 0x007e }
            android.bluetooth.BluetoothAdapter r5 = r5.b     // Catch:{ all -> 0x007e }
            r5.closeProfileProxy(r7, r3)     // Catch:{ all -> 0x007e }
            aryx r3 = r6.a     // Catch:{ all -> 0x007e }
            android.util.SparseArray r3 = r3.d     // Catch:{ all -> 0x007e }
            r3.delete(r7)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            aryx r0 = r6.a
            java.util.List r0 = r0.a()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x005d
            aryq r7 = defpackage.aryq.a
            anie r7 = r7.d()
            anih r7 = (defpackage.anih) r7
            r0 = 168(0xa8, float:2.35E-43)
            anie r7 = r7.a((java.lang.String) r1, (java.lang.String) r2, (int) r0, (java.lang.String) r4)
            anih r7 = (defpackage.anih) r7
            java.lang.String r0 = "BTConnStateMgr:disconnected with profile, but no listener registered."
            r7.a((java.lang.String) r0)
            return
        L_0x005d:
            int r1 = r0.size()
            r2 = 0
        L_0x0062:
            if (r2 >= r1) goto L_0x0070
            java.lang.Object r3 = r0.get(r2)
            aryw r3 = (defpackage.aryw) r3
            r3.a()
            int r2 = r2 + 1
            goto L_0x0062
        L_0x0070:
            aryx r0 = r6.a
            android.bluetooth.BluetoothAdapter r1 = r0.b
            android.content.Context r2 = r0.a
            android.bluetooth.BluetoothProfile$ServiceListener r0 = r0.g
            r1.getProfileProxy(r2, r0, r7)
            return
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return
        L_0x007e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x0081:
            throw r7
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aryt.onServiceDisconnected(int):void");
    }
}
