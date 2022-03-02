package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;

/* renamed from: bwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwt implements idg {
    final /* synthetic */ bwu a;

    public bwt(bwu bwu) {
        this.a = bwu;
    }

    public final void a(Status status) {
    }

    public final void b(Status status) {
        if (!status.c()) {
            ((anih) ((anih) bxk.a.c()).a("bwt", "b", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EvaluateFenceOperation] Unable to perform fence update operations: error %s", (Object) status);
            this.a.a(status.i, (FenceStateImpl) null);
            return;
        }
        this.a.d = new bws(this);
        cbi.k().a(this.a.d, awuz.p(), bvq.a("EvaluateFenceOperation_timeout"));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Status status = (Status) obj;
        if (!status.c()) {
            ((anih) ((anih) bxk.a.c()).a("bwt", "b", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EvaluateFenceOperation] Unable to perform fence update operations: error %s", (Object) status);
            this.a.a(status.i, (FenceStateImpl) null);
            return;
        }
        this.a.d = new bws(this);
        cbi.k().a(this.a.d, awuz.p(), bvq.a("EvaluateFenceOperation_timeout"));
    }
}
