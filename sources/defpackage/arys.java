package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;

/* renamed from: arys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arys implements aryw {
    final /* synthetic */ Context a;
    final /* synthetic */ aryx b;

    public arys(aryx aryx, Context context) {
        this.b = aryx;
        this.a = context;
    }

    public final void a() {
    }

    public final void a(int i, BluetoothProfile bluetoothProfile) {
    }

    public final void a(int i, int i2, int i3, BluetoothDevice bluetoothDevice) {
        Object obj;
        synchronized (this.b) {
            aryx aryx = this.b;
            int i4 = aryx.h;
            obj = aryx.d.get(i);
        }
        if (obj == null) {
            ((anih) ((anih) aryq.a.d()).a("arys", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BTConnStateMgr: Receive device status change with profile %d but profileProxy is not connected! Try reconnect.", i);
            aryx aryx2 = this.b;
            aryx2.b.getProfileProxy(this.a, aryx2.g, i);
        }
    }
}
