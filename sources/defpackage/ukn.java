package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.io.IOException;
import java.util.Map;

/* renamed from: ukn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukn extends urq {
    public final upt a;

    public ukn(BluetoothAdapter bluetoothAdapter, Map map, uqo uqo) {
        super(33);
        this.a = new upt(bluetoothAdapter, map, uqo);
    }

    public final void a() {
        this.a.c();
    }

    public final int b() {
        upt upt = this.a;
        try {
            upt.d = upt.f.listenUsingInsecureL2capChannel();
            upt.a = upt.d.getPsm();
            new jfx(9, new upo(upt)).start();
            return 2;
        } catch (IOException e) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("upt", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to listen incoming L2CAP socket.");
            return 3;
        }
    }
}
