package defpackage;

import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: tkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkq implements Callable {
    private final tku a;
    private final AcceptConnectionRequestParams b;
    private final tlh c;

    public tkq(tku tku, AcceptConnectionRequestParams acceptConnectionRequestParams, tlh tlh) {
        this.a = tku;
        this.b = acceptConnectionRequestParams;
        this.c = tlh;
    }

    public final Object call() {
        tku tku = this.a;
        AcceptConnectionRequestParams acceptConnectionRequestParams = this.b;
        tlh tlh = this.c;
        String str = acceptConnectionRequestParams.c;
        if (tlh.e(str)) {
            return 8003;
        }
        if (!tlh.g(str)) {
            return Integer.valueOf(tku.a.a(tlh, str, acceptConnectionRequestParams.d, acceptConnectionRequestParams.e));
        }
        ((anih) ((anih) tky.a.c()).a("tku", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Client %d invoked acceptConnectionRequest() after having already accepted/rejected the connection to %s.", tlh.b(), (Object) str);
        return 8009;
    }
}
