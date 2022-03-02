package defpackage;

import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import java.util.concurrent.Callable;

/* renamed from: tkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkt implements Callable {
    private final tku a;
    private final tlh b;
    private final SendPayloadParams c;

    public tkt(tku tku, tlh tlh, SendPayloadParams sendPayloadParams) {
        this.a = tku;
        this.b = tlh;
        this.c = sendPayloadParams;
    }

    public final Object call() {
        tku tku = this.a;
        tlh tlh = this.b;
        SendPayloadParams sendPayloadParams = this.c;
        for (String e : sendPayloadParams.b) {
            if (tlh.e(e)) {
                tku.a.a(tlh, sendPayloadParams.b, sendPayloadParams.c);
                return 0;
            }
        }
        return 8011;
    }
}
