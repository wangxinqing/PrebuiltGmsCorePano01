package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: scy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scy extends nis {
    public final ifu a;
    private final afqn b;

    public scy(afqn afqn, ifu ifu) {
        super(152, "VerifyPendingGroupsOperation");
        this.b = afqn;
        this.a = ifu;
    }

    public final void a(Context context) {
        afqn afqn = this.b;
        aorl.a(aopr.a(afqn.a(), (aoqb) new afpo(afqn), afqn.n), new scx(this), aoqm.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
