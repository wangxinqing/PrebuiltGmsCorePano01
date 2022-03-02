package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.util.HashSet;
import java.util.Set;

/* 'enum' modifier removed */
/* renamed from: ltd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ltd extends ltf {
    private final Set b = anfv.a;

    public ltd(String str) {
        super(str);
    }

    public final /* bridge */ /* synthetic */ Object a(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids == null || (r0 = uuids.length) == 0) {
            return this.b;
        }
        HashSet a = angm.a();
        for (ParcelUuid uuid : uuids) {
            a.add(Long.valueOf(uuid.getUuid().getMostSignificantBits() >> 32));
        }
        return a;
    }
}
