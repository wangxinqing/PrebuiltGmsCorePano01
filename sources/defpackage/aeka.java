package defpackage;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;

/* renamed from: aeka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeka {
    public final BluetoothGattServer a;

    private aeka(BluetoothGattServer bluetoothGattServer) {
        this.a = bluetoothGattServer;
    }

    public static aeka a(BluetoothGattServer bluetoothGattServer) {
        if (bluetoothGattServer != null) {
            return new aeka(bluetoothGattServer);
        }
        return null;
    }

    public final boolean b(aejw aejw) {
        return this.a.connect(aejw.a, false);
    }

    public final void a() {
        this.a.close();
    }

    public final void a(aejw aejw) {
        this.a.cancelConnection(aejw.a);
    }

    public final void a(aejw aejw, int i, int i2, int i3, byte[] bArr) {
        this.a.sendResponse(aejw.a, i, i2, i3, bArr);
    }

    public final boolean a(BluetoothGattService bluetoothGattService) {
        return this.a.addService(bluetoothGattService);
    }
}
