package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.bootstrap.BluetoothScanner$1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcu implements tdh {
    public static final anil a = anil.a("NearbyBootstrap");
    public teh b;
    public final Map c;
    final BroadcastReceiver d = new BluetoothScanner$1(this, "nearby");
    public final arwa e;
    private final Context f;
    private final BluetoothAdapter g;
    private boolean h;

    public tcu(Context context, arwa arwa) {
        this.f = context;
        this.e = arwa;
        this.c = new HashMap();
        this.g = BluetoothAdapter.getDefaultAdapter();
        this.h = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.h     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            android.bluetooth.BluetoothAdapter r0 = r5.g     // Catch:{ all -> 0x005d }
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "tcu"
            if (r0 == 0) goto L_0x0046
            r0.cancelDiscovery()     // Catch:{ all -> 0x005d }
            android.content.Context r0 = r5.f     // Catch:{ all -> 0x005d }
            android.content.BroadcastReceiver r4 = r5.d     // Catch:{ all -> 0x005d }
            r0.unregisterReceiver(r4)     // Catch:{ all -> 0x005d }
            r0 = 0
            r5.h = r0     // Catch:{ all -> 0x005d }
            boolean r0 = r5.b()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0027
            teh r0 = r5.b     // Catch:{ RemoteException -> 0x002b, NullPointerException -> 0x0029 }
            r0.b()     // Catch:{ RemoteException -> 0x002b, NullPointerException -> 0x0029 }
        L_0x0027:
            monitor-exit(r5)
            return
        L_0x0029:
            r0 = move-exception
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            anil r4 = a     // Catch:{ all -> 0x005d }
            anie r4 = r4.c()     // Catch:{ all -> 0x005d }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x005d }
            r4.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x005d }
            r0 = 82
            anie r0 = r4.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x005d }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "BluetoothScanner: Fail to call onScanStopped"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return
        L_0x0046:
            anil r0 = a     // Catch:{ all -> 0x005d }
            anie r0 = r0.c()     // Catch:{ all -> 0x005d }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x005d }
            r4 = 70
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)     // Catch:{ all -> 0x005d }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "BluetoothScanner: Bluetooth adapter is not available"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r5)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcu.a():void");
    }

    public final boolean b() {
        teh teh = this.b;
        return (teh == null || teh.asBinder() == null || !this.b.asBinder().isBinderAlive()) ? false : true;
    }

    public final boolean c() {
        return this.h;
    }

    public final synchronized void a(teh teh) {
        if (this.g != null) {
            this.b = teh;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.device.action.NAME_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            this.f.registerReceiver(this.d, intentFilter);
            this.g.startDiscovery();
            this.h = true;
            return;
        }
        ((anih) ((anih) a.c()).a("tcu", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothScanner: Bluetooth adapter is not available");
    }
}
