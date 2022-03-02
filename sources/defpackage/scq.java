package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: scq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scq extends nis {
    public final rxb a;
    private final afqn b;

    public scq(afqn afqn, rxb rxb) {
        super(152, "FileGroupListForDebugUIOperation");
        this.b = afqn;
        this.a = rxb;
    }

    public final void a(Context context) {
        aorl.a(aopr.a((aorr) aoqw.c(this.b.b()), sco.a, (Executor) aoqm.a), new scp(this), aoqm.a);
    }

    public final void a(Status status) {
        this.a.a(status, (List) null);
    }
}
