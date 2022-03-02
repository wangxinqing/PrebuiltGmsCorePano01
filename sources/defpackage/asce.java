package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* renamed from: asce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asce {
    public final UUID a;
    private final BluetoothAdapter b;
    private final String c;

    public asce(BluetoothAdapter bluetoothAdapter, String str, UUID uuid) {
        iva.a((Object) bluetoothAdapter);
        this.b = bluetoothAdapter;
        iva.a((Object) str);
        this.c = str;
        iva.a((Object) uuid);
        this.a = uuid;
    }

    public final BluetoothDevice a() {
        return this.b.getRemoteDevice(this.c);
    }
}
