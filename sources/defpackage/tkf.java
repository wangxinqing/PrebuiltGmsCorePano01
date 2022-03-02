package defpackage;

import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import java.util.concurrent.Callable;

/* renamed from: tkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkf implements Callable {
    private final tku a;
    private final tlh b;
    private final CancelPayloadParams c;

    public tkf(tku tku, tlh tlh, CancelPayloadParams cancelPayloadParams) {
        this.a = tku;
        this.b = tlh;
        this.c = cancelPayloadParams;
    }

    public final Object call() {
        tku tku = this.a;
        return Integer.valueOf(tku.a.a(this.b, this.c.b));
    }
}
