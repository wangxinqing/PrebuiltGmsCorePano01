package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: upo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class upo implements Runnable {
    private final upt a;

    public upo(upt upt) {
        this.a = upt;
    }

    public final void run() {
        upt upt = this.a;
        while (true) {
            try {
                BluetoothSocket accept = upt.d.accept();
                if (accept == null) {
                    ((anih) ((anih) ulh.a.b()).a("upt", "b", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed! Got null incoming L2CAP socket.");
                } else {
                    upt.a(accept);
                    upt.b.execute(new upp(upt, accept));
                }
            } catch (IOException e) {
                return;
            }
        }
    }
}
