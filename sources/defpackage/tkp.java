package defpackage;

import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: tkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkp implements Callable {
    private final tku a;
    private final SendConnectionRequestParams b;
    private final tlh c;

    public tkp(tku tku, SendConnectionRequestParams sendConnectionRequestParams, tlh tlh) {
        this.a = tku;
        this.b = sendConnectionRequestParams;
        this.c = tlh;
    }

    public final Object call() {
        ConnectionOptions connectionOptions;
        tku tku = this.a;
        SendConnectionRequestParams sendConnectionRequestParams = this.b;
        tlh tlh = this.c;
        String str = sendConnectionRequestParams.e;
        if (tlh.f(str) || tlh.e(str)) {
            return 8003;
        }
        ConnectionOptions connectionOptions2 = sendConnectionRequestParams.i;
        tlk tlk = tku.a;
        byte[] a2 = tku.a(sendConnectionRequestParams.d, sendConnectionRequestParams.h);
        byte[] bArr = sendConnectionRequestParams.f;
        if (connectionOptions2 != null) {
            connectionOptions = connectionOptions2;
        } else {
            connectionOptions = new tin().a;
        }
        int a3 = tlk.a(tlh, a2, str, bArr, connectionOptions, sendConnectionRequestParams.g);
        if (a3 != 0) {
            tlh.r(str);
        }
        return Integer.valueOf(a3);
    }
}
