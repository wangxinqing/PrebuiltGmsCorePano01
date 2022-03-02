package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* renamed from: scu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scu extends nis {
    public final afqn a;
    public final sca b;
    public final ifu c;

    public scu(afqn afqn, sca sca, ifu ifu) {
        super(152, "HandleFlagChangeOperation");
        this.b = sca;
        this.a = afqn;
        this.c = ifu;
    }

    public final void a(Context context) {
        aorr a2 = aorl.a((Object) null);
        if (axsv.b()) {
            a2 = aopr.a(a2, (aoqb) new scr(this), (Executor) aoqm.a);
        }
        aorl.a(aopr.a(a2, (aoqb) new scs(this), (Executor) aoqm.a), new sct(this), aoqm.a);
    }

    public final void a(Status status) {
        this.c.a(status);
    }
}
