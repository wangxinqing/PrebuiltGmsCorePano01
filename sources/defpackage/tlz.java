package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: tlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tlz implements Callable {
    private final tmz a;
    private final tlh b;
    private final String c;

    public tlz(tmz tmz, tlh tlh, String str) {
        this.a = tmz;
        this.b = tlh;
        this.c = str;
    }

    public final Object call() {
        tmz tmz = this.a;
        tlh tlh = this.b;
        String str = this.c;
        ((anih) tky.a.d()).a("Client %d has rejected the connection with endpoint %s", tlh.b(), (Object) str);
        tmv tmv = (tmv) tmz.h.get(str);
        if (tmv == null) {
            ((anih) tky.a.d()).a("Client %d invoked rejectConnection() to endpointId %s with whome we don't have a pending connection.", tlh.b(), (Object) str);
            return 8011;
        }
        try {
            tmv.c.a(tpk.a(8004, (byte[]) null));
            ((anih) tky.a.d()).a("In rejectConnection(), client %d sent CONNECTION_RESPONSE OfflineFrame to endpoint %s", tlh.b(), (Object) str);
            tmv.a.i(str);
            tmz.a(tlh, str, (byte[]) null, false);
            return 0;
        } catch (IOException e) {
            ((anih) tky.a.b()).a("Client %d failed to write connection request rejection to endpoint %s", tlh.b(), (Object) str);
            tmz.b(tlh, str);
            return 8012;
        }
    }
}
