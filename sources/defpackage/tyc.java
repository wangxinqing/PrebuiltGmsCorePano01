package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.List;

/* renamed from: tyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tyc implements amrm {
    private final aryx a;

    public tyc(aryx aryx) {
        this.a = aryx;
    }

    public final boolean a(Object obj) {
        aryx aryx = this.a;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        if (aryx == null || aryx.a(bluetoothDevice.getAddress(), (List) amzy.a((Object) 2, (Object) 1)) == null) {
            return false;
        }
        return true;
    }
}
