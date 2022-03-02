package defpackage;

import android.bluetooth.BluetoothServerSocket;
import java.io.IOException;

/* renamed from: uji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uji extends jfx {
    final /* synthetic */ BluetoothServerSocket a;
    final /* synthetic */ String e;
    final /* synthetic */ ujq f;
    final /* synthetic */ tom g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uji(ujq ujq, int i, BluetoothServerSocket bluetoothServerSocket, tom tom, String str) {
        super(i);
        this.f = ujq;
        this.a = bluetoothServerSocket;
        this.g = tom;
        this.e = str;
    }

    public final void run() {
        while (true) {
            try {
                upc upc = new upc(this.a.accept());
                String str = upc.a;
                urq urq = new urq(24);
                if (ujq.a(this.f.b.b(urq))) {
                    upc.a(new ujg(this, urq));
                    this.g.a.a(upc);
                } else {
                    ((anih) ((anih) ulh.a.b()).a("uji", "run", 375, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create a BluetoothClassicSocket because we were unable to register the MediumOperation.");
                    ulu.a((ull) upc, "BluetoothClassic", str);
                }
            } catch (IOException e2) {
                BluetoothServerSocket bluetoothServerSocket = this.a;
                String str2 = this.e;
                if (bluetoothServerSocket != null) {
                    try {
                        bluetoothServerSocket.close();
                        jjg jjg = ulh.a;
                        return;
                    } catch (IOException e3) {
                        anih anih = (anih) ulh.a.c();
                        anih.a((Throwable) e3);
                        ((anih) anih.a("ulu", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) "BluetoothClassic", (Object) str2);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
