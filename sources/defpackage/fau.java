package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fau implements ax {
    private final fbk a;

    public fau(fbk fbk) {
        this.a = fbk;
    }

    public final void a(Object obj) {
        fbk fbk = this.a;
        fbm fbm = (fbm) obj;
        if (fbm.b.i == Status.e.i && !fbm.a.a() && fbk.g.c == qcr.EXTERNAL_ACCOUNT_CHOOSER) {
            fbk.f.c.a((aj) fbk);
            fbk.g.d();
        }
    }
}
