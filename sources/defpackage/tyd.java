package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Build;

/* renamed from: tyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tyd extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ tye b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tyd(tye tye, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.b = tye;
        this.a = bluetoothDevice;
    }

    public final void run() {
        int i;
        tye tye = this.b;
        tya tya = tye.b;
        BluetoothDevice bluetoothDevice = this.a;
        tzi a2 = tye.c.a(bluetoothDevice.getAddress());
        if (a2 == null || (a2.a & 1024) == 0) {
            i = 0;
        } else {
            uaj uaj = a2.n;
            if (uaj == null) {
                uaj = uaj.K;
            }
            if (tvq.a(tvq.a(uaj), tye.a)) {
                i = 1;
            } else {
                i = 0;
            }
        }
        if (jkr.h()) {
            i |= 2;
        }
        tya.a(bluetoothDevice, 7, new byte[]{(byte) i});
        this.b.b.a(this.a, 8, new byte[]{1, (byte) Build.VERSION.SDK_INT});
    }
}
