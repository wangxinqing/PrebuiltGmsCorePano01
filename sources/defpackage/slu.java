package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: slu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class slu implements slm {
    private final Set a;

    public slu(Set set) {
        this.a = set;
    }

    public final aorr a(sls sls) {
        amzt j = amzy.j();
        for (slv a2 : this.a) {
            j.c(a2.a());
        }
        amzy a3 = j.a();
        return aorl.b((Iterable) a3).a((Callable) new slt(a3), (Executor) aoqm.a);
    }

    public final aorr a(sls sls, afxv afxv) {
        return aopr.a(a(sls), sll.a, (Executor) aoqm.a);
    }
}
