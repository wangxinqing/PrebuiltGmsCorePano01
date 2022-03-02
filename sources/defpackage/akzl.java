package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: akzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzl extends akzo {
    final /* synthetic */ akzz a;
    private final Map b;

    public akzl(akzz akzz, Map map) {
        this.a = akzz;
        this.b = map;
    }

    public final /* bridge */ /* synthetic */ void b(icl icl) {
        rhr rhr = (rhr) icl;
        if (this.a.g == null) {
            return;
        }
        if (!rhr.b.c()) {
            this.a.g.d();
            return;
        }
        nz nzVar = new nz(rhr.a());
        Iterator it = rhr.iterator();
        while (it.hasNext()) {
            rhq rhq = (rhq) it.next();
            nzVar.put(rhq.a(), (rhq) rhq.r());
        }
        nz nzVar2 = new nz(((ou) this.b).h);
        for (Map.Entry entry : this.b.entrySet()) {
            rhq rhq2 = (rhq) nzVar.get(entry.getValue());
            if (rhq2 != null) {
                nzVar2.put((String) entry.getKey(), rhq2);
            } else {
                this.a.g.d();
                return;
            }
        }
        this.a.g.a(nzVar2);
    }
}
