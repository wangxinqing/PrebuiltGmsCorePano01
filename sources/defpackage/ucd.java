package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: ucd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucd extends arwm {
    final /* synthetic */ int a;
    final /* synthetic */ BluetoothDevice b;
    final /* synthetic */ int c;
    final /* synthetic */ udb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucd(udb udb, String str, int i, BluetoothDevice bluetoothDevice, int i2) {
        super(str);
        this.d = udb;
        this.a = i;
        this.b = bluetoothDevice;
        this.c = i2;
    }

    public final void run() {
        switch (this.a) {
            case 10:
                if (aymw.a.a().q() || this.c == 12) {
                    udb udb = this.d;
                    BluetoothDevice bluetoothDevice = this.b;
                    tzi a2 = udb.b.a(bluetoothDevice.getAddress());
                    if (a2 != null) {
                        ((anih) tsp.a.d()).a("FastPair: RemoveBond: Handle remove bond event");
                        jfm.b(10).execute(new tuu(udb.e, udb.g, a2));
                    } else {
                        ((anih) tsp.a.d()).a("FastPair: RemoveBond: Not Fast Pair 2.0 device (%s)", (Object) bluetoothDevice.getAddress());
                    }
                    udb udb2 = this.d;
                    BluetoothDevice bluetoothDevice2 = this.b;
                    if (aymw.x()) {
                        ((anih) tsp.a.d()).a("FastPair: remove ble address from retroactive manager for %s", (Object) bluetoothDevice2);
                        udb2.j.a(bluetoothDevice2);
                    }
                }
                if (aymw.k()) {
                    ((anih) tsp.a.d()).a("FastPairEventStream: Destroy event stream for %s (NONE)", (Object) this.b);
                    this.d.a(this.b);
                    return;
                }
                return;
            case 11:
                if (aynf.e()) {
                    udb udb3 = this.d;
                    BluetoothDevice bluetoothDevice3 = this.b;
                    for (ttg ttg : udb3.b.c()) {
                        if (bluetoothDevice3.getAddress().equals(ttg.m())) {
                            udb3.f.a(asom.BLUETOOTH_BONDING, ttg);
                        }
                    }
                }
                if (!this.d.r) {
                    ((anih) tsp.a.d()).a("FastPair: Received BONDING state, temporarily disabling notifications.");
                    udb udb4 = this.d;
                    udb4.a.e(udb4.t);
                    ucz ucz = udb4.q;
                    if (ucz != null) {
                        ucz.a(false);
                    }
                    udb4.a.a(udb4.t, aymt.a.a().A());
                    return;
                }
                return;
            case 12:
                if (aymw.k() && !aymw.I()) {
                    ((anih) tsp.a.d()).a("FastPairEventStream: Establish event stream for %s (BONDED)", (Object) this.b);
                    udb udb5 = this.d;
                    BluetoothDevice bluetoothDevice4 = this.b;
                    udb5.a(bluetoothDevice4, udb5.b.a(bluetoothDevice4.getAddress()));
                }
                if (!this.d.r) {
                    tvd.a((Runnable) new ucc(this, this.b));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
