package defpackage;

import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.common.api.Status;

/* renamed from: faq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class faq implements ax {
    private final fbk a;

    public faq(fbk fbk) {
        this.a = fbk;
    }

    public final void a(Object obj) {
        fbk fbk = this.a;
        amri amri = (amri) obj;
        if (amri.a()) {
            fbk.s = new ConsentResult(gei.SUCCESS, gda.GRANTED, (String) amri.b());
            fbk.g.c();
            return;
        }
        fbk.g.d();
        fbk.a(new fbm(Status.e, ampu.a));
    }
}
