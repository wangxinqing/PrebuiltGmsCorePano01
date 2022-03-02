package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: scw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scw extends nis {
    public final ifu a;
    private final afqn b;
    private final sbw c;

    public scw(afqn afqn, sbw sbw, ifu ifu) {
        super(152, "ResetOperation");
        this.b = afqn;
        this.c = sbw;
        this.a = ifu;
    }

    public final void a(Context context) {
        afqn afqn = this.b;
        aorl.a(aopr.a(afqn.f(), (amqy) new afps(afqn), afqn.n), new scv(this), aoqm.a);
        sbw sbw = this.c;
        if (sbw != null) {
            sbw.b.getSharedPreferences("gms_icing_mdd_overrider_groups", 0).edit().clear().commit();
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
