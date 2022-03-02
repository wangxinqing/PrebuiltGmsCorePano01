package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: pbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pbe implements Callable {
    private final pbf a;
    private final atwj b;

    public pbe(pbf pbf, atwj atwj) {
        this.a = pbf;
        this.b = atwj;
    }

    public final Object call() {
        pbf pbf = this.a;
        atwj atwj = this.b;
        ClientContext a2 = pbf.a(pbf.a);
        quk quk = pbf.b;
        if (quk.f == null) {
            quk.f = baaj.a(baai.UNARY, "footprints.oneplatform.FootprintsService/GetDeletions", baoq.a(atwj.g), baoq.a(atwm.e));
        }
        return (atwm) quk.a.a(quk.f, a2, atwj, 10000, TimeUnit.MILLISECONDS);
    }
}
