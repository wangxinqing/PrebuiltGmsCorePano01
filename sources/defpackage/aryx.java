package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aryx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryx {
    static final amzl e = new anfo(new Object[]{2, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", 1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"}, 2);
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final BluetoothAdapter b = BluetoothAdapter.getDefaultAdapter();
    public final amzy c;
    public final SparseArray d;
    final BroadcastReceiver f;
    BluetoothProfile.ServiceListener g = new aryt(this);
    private boolean i;
    private final List j = new ArrayList();

    static {
        amxg.a((Object) 2, (Object) "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        amxg.a((Object) 1, (Object) "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
    }

    public aryx(Context context, List list) {
        this.a = context;
        this.d = new SparseArray(list.size());
        this.c = amzy.a((Collection) list);
        if (this.b == null) {
            ((anih) ((anih) aryq.a.c()).a("aryx", "<init>", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr:BluetoothAdapter.getDefaultAdapter() return null!");
            this.f = null;
            this.i = true;
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            this.b.getProfileProxy(context, this.g, intValue);
            amzl amzl = e;
            Integer valueOf = Integer.valueOf(intValue);
            if (amzl.containsKey(valueOf)) {
                intentFilter.addAction((String) e.get(valueOf));
            } else {
                ((anih) ((anih) aryq.a.c()).a("aryx", "<init>", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr:untrackable profile:%d, the connection status change will not be able to dispatch to stateChangeListener!", intValue);
            }
        }
        if (intentFilter.countActions() > 0) {
            if (aymw.N()) {
                a(new arys(this, context));
            }
            aryv aryv = new aryv(new aryr(this));
            this.f = aryv;
            context.registerReceiver(aryv, intentFilter);
            return;
        }
        this.f = null;
    }

    public final BluetoothDevice a(String str, int i2) {
        BluetoothProfile bluetoothProfile;
        amrl.a(this.c.contains(Integer.valueOf(i2)), "Unregistered profile:%s", (Object) Integer.toString(i2));
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            bluetoothProfile = (BluetoothProfile) this.d.get(i2);
            if (bluetoothProfile != null) {
                arrayList.addAll(bluetoothProfile.getConnectedDevices());
            }
        }
        if (bluetoothProfile == null) {
            if (!aymw.N()) {
                ((anih) ((anih) aryq.a.c()).a("aryx", "a", 291, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: getConnectedDevice called but proxy is not connected!");
                return null;
            }
            BluetoothAdapter bluetoothAdapter = this.b;
            if (bluetoothAdapter == null) {
                return null;
            }
            if (!bluetoothAdapter.isEnabled()) {
                ((anih) ((anih) aryq.a.d()).a("aryx", "a", 301, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: getConnectedDevice called without proxy because bluetoothAdapter is not enabled.");
                return null;
            } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                ((anih) ((anih) aryq.a.d()).a("aryx", "a", 308, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: getConnectedDevice called but proxy is not connected, try reconnect but can't wait on main thread!");
                this.b.getProfileProxy(this.a, this.g, i2);
                return null;
            } else {
                ((anih) ((anih) aryq.a.d()).a("aryx", "a", 315, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: getConnectedDevice called but proxy is not connected, try reconnect and wait.");
                aosh f2 = aosh.f();
                aryu aryu = new aryu(i2, f2);
                a(aryu);
                this.b.getProfileProxy(this.a, this.g, i2);
                try {
                    arrayList.addAll((Collection) f2.get(aymt.a.a().aG(), TimeUnit.MILLISECONDS));
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    anih anih = (anih) aryq.a.c();
                    anih.a(e2);
                    ((anih) anih.a("aryx", "a", 342, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: proxy reconnect failed.");
                }
                synchronized (this.j) {
                    this.j.remove(aryu);
                }
            }
        }
        if (arrayList.isEmpty()) {
            ((anih) ((anih) aryq.a.c()).a("aryx", "a", 348, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: Doesn't get any device from profile proxy %d.", i2);
            return null;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) arrayList.get(i3);
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(str)) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "aryx"
            java.lang.String r1 = "b"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r7.i     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0022
            aryq r3 = defpackage.aryq.a     // Catch:{ all -> 0x006f }
            anie r3 = r3.c()     // Catch:{ all -> 0x006f }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x006f }
            r4 = 363(0x16b, float:5.09E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x006f }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "BTConnStateMgr: Already destroyed!"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x006f }
            monitor-exit(r7)
            return
        L_0x0022:
            r3 = 1
            r7.i = r3     // Catch:{ all -> 0x006f }
            r3 = 0
        L_0x0026:
            android.util.SparseArray r4 = r7.d     // Catch:{ all -> 0x006f }
            int r4 = r4.size()     // Catch:{ all -> 0x006f }
            if (r3 >= r4) goto L_0x0044
            android.util.SparseArray r4 = r7.d     // Catch:{ all -> 0x006f }
            int r4 = r4.keyAt(r3)     // Catch:{ all -> 0x006f }
            android.util.SparseArray r5 = r7.d     // Catch:{ all -> 0x006f }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x006f }
            android.bluetooth.BluetoothProfile r5 = (android.bluetooth.BluetoothProfile) r5     // Catch:{ all -> 0x006f }
            android.bluetooth.BluetoothAdapter r6 = r7.b     // Catch:{ all -> 0x006f }
            r6.closeProfileProxy(r4, r5)     // Catch:{ all -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0026
        L_0x0044:
            android.util.SparseArray r3 = r7.d     // Catch:{ all -> 0x006f }
            r3.clear()     // Catch:{ all -> 0x006f }
            android.content.BroadcastReceiver r3 = r7.f     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0052
            android.content.Context r4 = r7.a     // Catch:{ IllegalArgumentException -> 0x0054 }
            r4.unregisterReceiver(r3)     // Catch:{ IllegalArgumentException -> 0x0054 }
        L_0x0052:
            monitor-exit(r7)
            return
        L_0x0054:
            r3 = move-exception
            aryq r4 = defpackage.aryq.a     // Catch:{ all -> 0x006f }
            anie r4 = r4.c()     // Catch:{ all -> 0x006f }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x006f }
            r4.a((java.lang.Throwable) r3)     // Catch:{ all -> 0x006f }
            r3 = 377(0x179, float:5.28E-43)
            anie r0 = r4.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x006f }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "BTConnStateMgr: unregisterReceiver meet exception!"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x006f }
            monitor-exit(r7)
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x0073
        L_0x0072:
            throw r0
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aryx.b():void");
    }

    public final BluetoothDevice a(String str, List list) {
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            if (this.c.contains(Integer.valueOf(intValue))) {
                BluetoothDevice a2 = a(str, intValue);
                if (a2 != null) {
                    return a2;
                }
                z = true;
            }
        }
        amrl.a(z, "Unregistered profiles:%s", (Object) list.toString());
        return null;
    }

    public final List a() {
        amzy a2;
        synchronized (this.j) {
            a2 = amzy.a((Collection) this.j);
        }
        return a2;
    }

    public final void a(aryw aryw) {
        synchronized (this.j) {
            this.j.add(aryw);
        }
        synchronized (this) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                int keyAt = this.d.keyAt(i2);
                aryw.a(keyAt, (BluetoothProfile) this.d.get(keyAt));
            }
        }
    }
}
