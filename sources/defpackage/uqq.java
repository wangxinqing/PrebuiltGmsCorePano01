package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: uqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uqq {
    public static uqr a(ampi ampi, url url, uqo uqo) {
        if (!aymi.F()) {
            byte[] bArr = ura.a;
            String c = ampi.c();
            ura ura = new ura(c, ampi, url, uqo);
            try {
                ura.b();
                return ura;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ura", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to connect to client %s.", (Object) c);
                ura.a();
                return null;
            }
        } else {
            urc urc = new urc(ampi.c(), ampi, (BluetoothSocket) null, url, uqo);
            if (urc.c()) {
                return urc;
            }
            ((anih) ((anih) ulh.a.c()).a("urc", "a", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 failed to init on GATT for client %s.", (Object) ampi.c());
            urc.b();
            return null;
        }
    }

    public static urc a(String str, BluetoothSocket bluetoothSocket, url url, uqo uqo) {
        if (!aymi.F()) {
            return null;
        }
        urc urc = new urc(str, (ampi) null, bluetoothSocket, url, uqo);
        if (urc.c()) {
            return urc;
        }
        ((anih) ((anih) ulh.a.c()).a("urc", "a", 176, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 failed to init on L2CAP.");
        urc.b();
        return null;
    }
}
