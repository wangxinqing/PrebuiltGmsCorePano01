package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.Closeable;

/* renamed from: upr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upr implements Runnable {
    private final BluetoothSocket a;

    public upr(BluetoothSocket bluetoothSocket) {
        this.a = bluetoothSocket;
    }

    public final void run() {
        BluetoothSocket bluetoothSocket = this.a;
        ((anih) ((anih) ulh.a.d()).a("upt", "c", 223, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2capServerHandler timed out for handling incoming L2CAP socket after %d ms.", aymi.g());
        jjt.a((Closeable) bluetoothSocket);
    }
}
