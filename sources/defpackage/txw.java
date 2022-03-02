package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: txw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txw implements txy {
    public final void a(Context context, BluetoothDevice bluetoothDevice) {
    }

    public final void a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str;
        if (i != 1 || !aymw.a.a().aI() || bArr == null) {
            anih anih = (anih) tsp.a.d();
            if (bArr != null) {
                str = anml.g.a(bArr);
            } else {
                str = null;
            }
            anih.a("DeviceActionEvent: Ignoring action %s with data %s.", i, (Object) str);
            return;
        }
        ((anih) tsp.a.d()).a("DeviceActionEvent: Received ring action change from %s: %s", (Object) bluetoothDevice, (Object) anml.g.a(bArr));
        thp.a(context, new Intent("com.google.location.nearby.common.fastpair.EVENT_STREAM_DEVICE_ACTION_RECEIVED").putExtra("com.google.location.nearby.common.fastpair.EXTRA_DEVICE_ACTION_ADDITIONAL_DATA", bArr));
        tyb tyb = (tyb) ((tya) thl.a(context, tya.class)).b.get(bluetoothDevice);
        if (tyb == null || !tyb.b()) {
            ((anih) tsp.a.d()).a("EventStreamManager: sendAck: Medium is null or not connected.");
        } else {
            tyb.a(255, 1, new byte[]{4, 1});
        }
    }
}
