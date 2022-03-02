package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: hwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwh extends RequestFinishedInfo.Listener {
    final /* synthetic */ Object a;
    final /* synthetic */ avtn b;
    final /* synthetic */ auay c;
    final /* synthetic */ hwi d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwh(hwi hwi, Executor executor, Object obj, avtn avtn, auay auay) {
        super(executor);
        this.d = hwi;
        this.a = obj;
        this.b = avtn;
        this.c = auay;
    }

    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo.getFinishedReason() == 0 && requestFinishedInfo.getAnnotations().contains(this.a)) {
            this.d.a.b(this.b, requestFinishedInfo.getMetrics().getSentByteCount().longValue() - ((long) this.c.a()));
        }
    }
}
