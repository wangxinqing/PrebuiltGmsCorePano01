package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: tmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmo implements Callable {
    private final tmz a;
    private final tlh b;
    private final String c;
    private final byte[] d;
    private final ugx e;

    public tmo(tmz tmz, tlh tlh, String str, byte[] bArr, ugx ugx) {
        this.a = tmz;
        this.b = tlh;
        this.c = str;
        this.d = bArr;
        this.e = ugx;
    }

    public final Object call() {
        tmz tmz = this.a;
        tlh tlh = this.b;
        String str = this.c;
        byte[] bArr = this.d;
        ugx ugx = this.e;
        ((anih) tky.a.d()).a("Client %d has accepted the connection with endpoint %s", tlh.b(), (Object) str);
        tmv tmv = (tmv) tmz.h.get(str);
        if (tmv == null) {
            ((anih) tky.a.d()).a("Client %d invoked acceptConnection() to endpointId %s with whom we don't have a pending connection.", tlh.b(), (Object) str);
            return 8011;
        }
        try {
            tmv.c.a(tpk.a(0, bArr));
            ((anih) tky.a.d()).a("In acceptConnection(), client %d sent CONNECTION_RESPONSE OfflineFrame to endpoint %s", tlh.b(), (Object) str);
            tmv.l.b();
            tmv.a.a(str, ugx);
            tmz.a(tlh, str, (byte[]) null, false);
            return 0;
        } catch (IOException e2) {
            ((anih) tky.a.b()).a("Client %d failed to write connection request acceptance to endpoint %s", tlh.b(), (Object) str);
            tmz.b(tlh, str);
            return 8012;
        }
    }
}
