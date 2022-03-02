package defpackage;

import com.google.android.gms.common.Feature;
import java.util.concurrent.Executor;

/* renamed from: qwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qwi implements ahb {
    private final qwq a;
    private final int b;
    private final int c;

    public qwi(qwq qwq, int i, int i2) {
        this.a = qwq;
        this.b = i;
        this.c = i2;
    }

    public final Object a(agz agz) {
        qwq qwq = this.a;
        int i = this.b;
        int i2 = this.c;
        aacz aacz = new aacz(qwq.a);
        iha b2 = ihb.b();
        b2.b = new Feature[]{aaao.a};
        b2.a = aacx.a;
        acwa a2 = aacz.a(b2.a());
        a2.a((Executor) qwq.b, (acvv) new qwm(qwq, agz, i, i2, aacz));
        a2.a((Executor) qwq.b, (acvs) new qwn(qwq, agz, i, i2));
        return "Scheduler client check feature available";
    }
}
