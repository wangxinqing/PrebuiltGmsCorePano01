package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: upc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upc extends ull {
    public final BluetoothSocket c;

    public upc(BluetoothSocket bluetoothSocket) {
        super(String.format("BluetoothClassicSocket:%s", new Object[]{bluetoothSocket.getRemoteDevice().getAddress()}));
        this.c = bluetoothSocket;
    }

    public final InputStream a() {
        throw null;
    }

    public final OutputStream b() {
        throw null;
    }

    public final void c() {
        this.c.close();
    }
}
