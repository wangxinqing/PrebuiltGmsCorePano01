package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: uqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqx implements Runnable {
    private final uqz a;
    private final byte[] b;

    public uqx(uqz uqz, byte[] bArr) {
        this.a = uqz;
        this.b = bArr;
    }

    public final void run() {
        uqz uqz = this.a;
        upu a2 = upu.a(this.b);
        if (a2 == null) {
            ura ura = uqz.a;
            byte[] bArr = ura.a;
            ((anih) ((anih) ulh.a.c()).a("uqz", "c", 477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s was unable to parse incoming data.", (Object) ura.b);
        } else if (!Arrays.equals(a2.b, ura.a)) {
            byte[] bArr2 = a2.b;
            byte[] bArr3 = a2.c;
            try {
                uqk uqk = (uqk) uqz.a.g.get(jhy.d(bArr2));
                uqk.c.write(bArr3);
                if (aymi.A()) {
                    uqk.c.flush();
                }
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("uqz", "a", 552, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s encountered an error while receiving incoming data for service ID hash %s.", (Object) uqz.a.b, (Object) ulu.a(bArr2));
            }
        } else {
            uqz.b(a2.c);
        }
    }
}
