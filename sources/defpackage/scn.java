package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: scn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scn extends nis {
    public final ifu a;
    private final afqn b;
    private final boolean c;

    public scn(afqn afqn, boolean z, ifu ifu) {
        super(152, "DownloadPendingGroupsOperation");
        this.b = afqn;
        this.c = z;
        this.a = ifu;
    }

    public final void a(Context context) {
        afqn afqn = this.b;
        aorl.a(aopr.a(afqn.a(), (aoqb) new afpn(afqn, this.c), afqn.n), new scm(this), aoqm.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
