package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: sca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sca {
    public final afsb a;
    private final afqn b;
    private final Executor c;

    public sca(afqn afqn, afsb afsb, Executor executor) {
        this.b = afqn;
        this.a = afsb;
        this.c = executor;
    }

    public final aorr a() {
        agvw agvw = sbx.b;
        afkc afkc = (afkc) sdu.a(sbx.c, this.a, (auef) afkc.b.c(7));
        if (afkc == null) {
            return aorl.a((Object) null);
        }
        ArrayList arrayList = new ArrayList();
        aucx aucx = afkc.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            afjx afjx = (afjx) sdu.a(agvx.a(agvw, ((afkb) aucx.get(i)).a, sbx.a), this.a, (auef) afjx.e.c(7));
            if (afjx != null) {
                try {
                    arrayList.add(this.b.a(afsq.a(afjx.b, afjx.c), afsr.a(afjx)));
                } catch (auda e) {
                    afsh.a((Throwable) e, "%s: Unable to add groups from individual configs.", "PhenotypeConfig");
                }
            }
        }
        return aorl.b((Iterable) arrayList).a(sbz.a, this.c);
    }
}
