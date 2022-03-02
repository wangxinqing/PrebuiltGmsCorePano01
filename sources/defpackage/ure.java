package defpackage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ure  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ure implements Runnable {
    private final urk a;
    private final InputStream b;

    public ure(urk urk, InputStream inputStream) {
        this.a = urk;
        this.b = inputStream;
    }

    public final void run() {
        urk urk = this.a;
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(this.b));
            while (true) {
                int readInt = dataInputStream.readInt();
                int i = upu.d;
                if (readInt > 3) {
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr);
                    urk.b(bArr);
                } else {
                    ((anih) ((anih) ulh.a.c()).a("urk", "b", 421, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket get invalid BlePacket length(%s) from %s", readInt, (Object) urk.a);
                    urk.c.a();
                    return;
                }
            }
        } catch (IOException e) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("urk", "b", 434, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket failed to read BlePacket from %s on L2CAP", (Object) urk.a);
            urk.c.a();
        }
    }
}
