package defpackage;

import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: tkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkr implements Callable {
    private final tku a;
    private final RejectConnectionRequestParams b;
    private final tlh c;

    public tkr(tku tku, RejectConnectionRequestParams rejectConnectionRequestParams, tlh tlh) {
        this.a = tku;
        this.b = rejectConnectionRequestParams;
        this.c = tlh;
    }

    public final Object call() {
        tku tku = this.a;
        RejectConnectionRequestParams rejectConnectionRequestParams = this.b;
        tlh tlh = this.c;
        String str = rejectConnectionRequestParams.b;
        if (tlh.e(str)) {
            return 8003;
        }
        if (!tlh.g(str)) {
            return Integer.valueOf(tku.a.a(tlh, str));
        }
        ((anih) ((anih) tky.a.c()).a("tku", "a", 262, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Client %d invoked rejectConnectionRequest() after having already accepted/rejected the connection to %s.", tlh.b(), (Object) str);
        return 8009;
    }
}
