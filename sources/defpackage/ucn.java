package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ucn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucn extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ udb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucn(udb udb, String str, BluetoothDevice bluetoothDevice, String str2, int i) {
        super(str);
        this.d = udb;
        this.a = bluetoothDevice;
        this.b = str2;
        this.c = i;
    }

    public final void run() {
        udb udb = this.d;
        BluetoothDevice bluetoothDevice = this.a;
        String str = this.b;
        int i = this.c;
        Set set = (Set) udb.n.get(bluetoothDevice);
        if (set == null) {
            set = new HashSet();
            udb.n.put(bluetoothDevice, set);
        }
        if (i == 0) {
            set.remove(str);
            if (!set.isEmpty()) {
                ((anih) tsp.a.d()).a("FastPairEventStream: %s is still connected for %s", (Object) set.toArray(), (Object) bluetoothDevice);
                return;
            }
            if (aymw.I() && aymw.k()) {
                ((anih) tsp.a.d()).a("FastPairEventStream: Destroy event stream for %s (Profile)", (Object) bluetoothDevice);
                udb.a(bluetoothDevice);
            }
            udb.k.a(bluetoothDevice.getAddress(), false);
        } else if (i == 2) {
            set.add(str);
            if (aymw.I() && aymw.k()) {
                ((anih) tsp.a.d()).a("FastPairEventStream: Establish event stream for %s (Profile)", (Object) bluetoothDevice);
                udb.a(bluetoothDevice, udb.b.a(bluetoothDevice.getAddress()));
            }
            udb.k.a(bluetoothDevice.getAddress(), true);
        }
    }
}
