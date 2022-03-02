package defpackage;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import java.util.concurrent.Callable;

/* renamed from: tmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmj implements Callable {
    private final tmz a;
    private final tlh b;
    private final String c;
    private final DiscoveryOptions d;
    private final ugq e;

    public tmj(tmz tmz, tlh tlh, String str, DiscoveryOptions discoveryOptions, ugq ugq) {
        this.a = tmz;
        this.b = tlh;
        this.c = str;
        this.d = discoveryOptions;
        this.e = ugq;
    }

    public final Object call() {
        tmz tmz = this.a;
        tlh tlh = this.b;
        String str = this.c;
        DiscoveryOptions discoveryOptions = this.d;
        ugq ugq = this.e;
        int a2 = tlh.a(tmz.c());
        if (a2 != 0) {
            ((anih) tky.a.b()).a("Missing required permissions, aborting call to startDiscovery() for serviceId %s", (Object) str);
            return Integer.valueOf(a2);
        }
        tmw a3 = tmz.a(tlh, str, discoveryOptions);
        int i = a3.a;
        if (i != 0) {
            return Integer.valueOf(i);
        }
        tmz.g.put(tlh, new tmt());
        tlh.a(str, tmz.g(), ugq, a3.b, discoveryOptions);
        return 0;
    }
}
