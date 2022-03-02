package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.BluetoothClassic$ScanningOperation$1;

/* renamed from: ujp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ujp extends urq {
    public final uli a = new uli();
    public final aoru b;
    private final Context c;
    private final BluetoothAdapter d;
    private final BroadcastReceiver e;
    private final IntentFilter f;

    public ujp(Context context, BluetoothAdapter bluetoothAdapter, aoru aoru, tou tou) {
        super(22);
        this.c = context;
        this.d = bluetoothAdapter;
        this.b = aoru;
        this.e = new BluetoothClassic$ScanningOperation$1(this, "nearby", tou);
        IntentFilter intentFilter = new IntentFilter();
        this.f = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        this.f.addAction("android.bluetooth.device.action.NAME_CHANGED");
        this.f.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
    }

    private final void c() {
        if (this.d.startDiscovery()) {
            jjg jjg = ulh.a;
        } else {
            ((anih) ((anih) ulh.a.c()).a("ujp", "c", 962, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to rejuvenate Bluetooth Classic discovery, no more Bluetooth devices will be seen.");
        }
    }

    public final synchronized void a() {
        if (!this.d.cancelDiscovery()) {
            ((anih) ((anih) ulh.a.c()).a("ujp", "a", 907, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop Bluetooth Classic discovery.");
        }
        thp.a(this.c, this.e);
    }

    public final synchronized int b() {
        int i;
        this.c.registerReceiver(this.e, this.f);
        if (!this.d.startDiscovery()) {
            thp.a(this.c, this.e);
            ((anih) ((anih) ulh.a.b()).a("ujp", "b", 897, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start Bluetooth Classic discovery.");
            i = 4;
        } else {
            i = 2;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Intent r4, defpackage.uli r5, defpackage.tou r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.e()     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x0024
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x00c3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x00c3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "ujp"
            java.lang.String r6 = "a"
            r0 = 919(0x397, float:1.288E-42)
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r4 = r4.a((java.lang.String) r5, (java.lang.String) r6, (int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00c3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "Ignoring Bluetooth Classic scan result because we are no longer discovering."
            r4.a((java.lang.String) r5)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r3)
            return
        L_0x0024:
            java.lang.String r0 = "android.bluetooth.device.action.FOUND"
            java.lang.String r1 = r4.getAction()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r4 = r4.getParcelableExtra(r0)     // Catch:{ all -> 0x00c3 }
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x004c
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00c3 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x004c
            r5.a(r0)     // Catch:{ all -> 0x00c3 }
            tps r5 = r6.a     // Catch:{ all -> 0x00c3 }
            r5.a((android.bluetooth.BluetoothDevice) r4)     // Catch:{ all -> 0x00c3 }
        L_0x004c:
            monitor-exit(r3)
            return
        L_0x004e:
            java.lang.String r0 = "android.bluetooth.device.action.NAME_CHANGED"
            java.lang.String r1 = r4.getAction()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r5 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r4 = r4.getParcelableExtra(r5)     // Catch:{ all -> 0x00c3 }
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x0069
            tps r5 = r6.a     // Catch:{ all -> 0x00c3 }
            r5.a((android.bluetooth.BluetoothDevice) r4)     // Catch:{ all -> 0x00c3 }
        L_0x0069:
            monitor-exit(r3)
            return
        L_0x006b:
            java.lang.String r0 = "android.bluetooth.adapter.action.DISCOVERY_FINISHED"
            java.lang.String r4 = r4.getAction()     // Catch:{ all -> 0x00c3 }
            boolean r4 = r0.equals(r4)     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x0069
            java.util.Set r4 = r5.a()     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x007f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00c3 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x00c3 }
            tps r0 = r6.a     // Catch:{ all -> 0x00c3 }
            tql r1 = r0.e     // Catch:{ all -> 0x00c3 }
            tpr r2 = new tpr     // Catch:{ all -> 0x00c3 }
            r2.<init>(r0, r5)     // Catch:{ all -> 0x00c3 }
            r1.a((java.lang.Runnable) r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x007f
        L_0x009a:
            android.bluetooth.BluetoothAdapter r4 = r3.d     // Catch:{ all -> 0x00c3 }
            boolean r4 = r4.startDiscovery()     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x00a6
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x00c3 }
            monitor-exit(r3)
            return
        L_0x00a6:
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x00c3 }
            anie r4 = r4.c()     // Catch:{ all -> 0x00c3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "ujp"
            java.lang.String r6 = "c"
            r0 = 962(0x3c2, float:1.348E-42)
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r4 = r4.a((java.lang.String) r5, (java.lang.String) r6, (int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00c3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "Failed to rejuvenate Bluetooth Classic discovery, no more Bluetooth devices will be seen."
            r4.a((java.lang.String) r5)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r3)
            return
        L_0x00c3:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x00c7
        L_0x00c6:
            throw r4
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujp.a(android.content.Intent, uli, tou):void");
    }
}
