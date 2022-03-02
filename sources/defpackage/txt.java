package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: txt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txt implements txy {
    public final void a(Context context, BluetoothDevice bluetoothDevice) {
    }

    public final void a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (bArr != null && bArr.length >= 2 && bArr[0] == 4 && bArr[1] == 1) {
            ((anih) tsp.a.d()).a("AcknowledgementEventGroupListener: Support rfcomm ring or not, event code = %d", i);
            ((tya) thl.a(context, tya.class)).a(bluetoothDevice, 4, 1, i);
        }
    }
}
