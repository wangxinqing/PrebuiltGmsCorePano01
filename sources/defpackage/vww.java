package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: vww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vww extends vwz {
    private final BluetoothAdapter c = BluetoothAdapter.getDefaultAdapter();

    public vww(Context context) {
        super(context);
    }

    public final boolean a() {
        BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    public final IntentFilter b() {
        return new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    }
}
