package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aiwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwm {
    public final BluetoothAdapter a;

    public aiwm(BluetoothAdapter bluetoothAdapter) {
        amrl.a((Object) bluetoothAdapter);
        this.a = bluetoothAdapter;
    }

    public final Set a() {
        Set<BluetoothDevice> bondedDevices = this.a.getBondedDevices();
        if (bondedDevices == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (BluetoothDevice a2 : bondedDevices) {
            aizo a3 = aiyk.g.a(a2);
            if (a3 != null) {
                hashSet.add(a3);
            }
        }
        return hashSet;
    }
}
