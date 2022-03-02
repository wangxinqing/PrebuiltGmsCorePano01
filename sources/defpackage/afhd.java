package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: afhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afhd implements afbu {
    private final aeri a;
    private final aorr b;
    private final awdn c;
    private final afhn d;
    private final Executor e;

    public afhd(aeri aeri, aorr aorr, awdn awdn, afhn afhn, Executor executor) {
        this.a = aeri;
        this.b = aorr;
        this.c = awdn;
        this.d = afhn;
        this.e = executor;
    }

    public final aorr a(Bundle bundle) {
        aeri aeri = this.a;
        aorr aorr = this.b;
        awdn awdn = this.c;
        afhn afhn = this.d;
        Executor executor = this.e;
        if (aeri.u()) {
            return aooz.a(aopr.a(aorr, (aoqb) new afhe(awdn, afhn, executor), executor), aeqe.class, afhf.a, executor);
        }
        return aooz.a(aopr.a(aorr, (amqy) new afhg(afhn), executor), aeqe.class, afhh.a, executor);
    }
}
