package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Future;

/* renamed from: ahfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfd implements aoqa {
    private final ahfj a;

    public ahfd(ahfj ahfj) {
        this.a = ahfj;
    }

    public final aorr a() {
        ahfj ahfj = this.a;
        try {
            return aorl.a(ahfj.a((Uri) aorl.a((Future) ahfj.b)));
        } catch (IOException e) {
            if (e.getCause() instanceof ahax) {
                return aorl.a((Throwable) e);
            }
            return aopr.a(aorl.a((Throwable) e), amll.a((aoqb) new ahfg(ahfj)), ahfj.d);
        }
    }
}
