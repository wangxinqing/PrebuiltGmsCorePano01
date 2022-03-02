package defpackage;

import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import java.util.concurrent.Callable;

/* renamed from: tkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkn implements Callable {
    private final tku a;
    private final tlh b;
    private final StartDiscoveryParams c;

    public tkn(tku tku, tlh tlh, StartDiscoveryParams startDiscoveryParams) {
        this.a = tku;
        this.b = tlh;
        this.c = startDiscoveryParams;
    }

    public final Object call() {
        tku tku = this.a;
        tlh tlh = this.b;
        StartDiscoveryParams startDiscoveryParams = this.c;
        if (!tlh.k()) {
            return Integer.valueOf(tku.a.a(tlh, startDiscoveryParams.c, startDiscoveryParams.e, startDiscoveryParams.f));
        }
        return 8002;
    }
}
