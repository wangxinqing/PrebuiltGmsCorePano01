package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: tmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tmq extends tms {
    public final BluetoothDevice a;

    protected tmq(BluetoothDevice bluetoothDevice, String str, byte[] bArr, String str2) {
        super(str, bArr, str2, asoe.BLUETOOTH);
        this.a = bluetoothDevice;
    }
}
