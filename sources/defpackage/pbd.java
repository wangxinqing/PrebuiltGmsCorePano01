package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: pbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pbd implements Callable {
    private final pbf a;
    private final atxm b;

    public pbd(pbf pbf, atxm atxm) {
        this.a = pbf;
        this.b = atxm;
    }

    public final Object call() {
        pbf pbf = this.a;
        atxm atxm = this.b;
        ClientContext a2 = pbf.a(pbf.a);
        quk quk = pbf.b;
        if (quk.c == null) {
            quk.c = baaj.a(baai.UNARY, "footprints.oneplatform.FootprintsService/Write", baoq.a(atxm.e), baoq.a(atxn.a));
        }
        return (atxn) quk.a.a(quk.c, a2, atxm, 10000, TimeUnit.MILLISECONDS);
    }
}
