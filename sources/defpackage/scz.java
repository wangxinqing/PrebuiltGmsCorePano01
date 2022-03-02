package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: scz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class scz implements aoqb {
    private final sdd a;
    private final List b;
    private final aucd c;
    private final aucd d;

    public scz(sdd sdd, aucd aucd, aucd aucd2, List list) {
        this.a = sdd;
        this.c = aucd;
        this.d = aucd2;
        this.b = list;
    }

    public final aorr a(Object obj) {
        int a2;
        int a3;
        sdd sdd = this.a;
        aucd aucd = this.c;
        aucd aucd2 = this.d;
        List list = this.b;
        afkr afkr = (afkr) obj;
        if (afkr == null) {
            return aorl.a((Object) ampu.a);
        }
        int i = afkr.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojg aojg = (aojg) aucd.b;
        aojg aojg2 = aojg.g;
        aojg.a |= 2;
        aojg.c = i;
        int a4 = afkq.a(afkr.f);
        if ((a4 != 0 && a4 == 3) || (!((a2 = afkq.a(afkr.f)) == 0 || a2 == 1) ? (a3 = afkq.a(afkr.f)) == 0 || a3 != 2 || !sdd.f.equals(scg.ZERO_PARTY) : !sdd.f.equals(scg.FIRST_PARTY) && !sdd.f.equals(scg.ZERO_PARTY))) {
            ArrayList arrayList = new ArrayList();
            aucx aucx = afkr.j;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                afkn afkn = (afkn) aucx.get(i2);
                arrayList.add(aopr.a(sdd.b.a(afkn, afkr), (aoqb) new sda(sdd, list, afkn, aucd2), (Executor) aoqm.a));
            }
            return aorl.c((Iterable) arrayList).a((Callable) new sdb(afkr), (Executor) aoqm.a);
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoju aoju = (aoju) aucd2.b;
        aoju aoju2 = aoju.g;
        aoju.d = aomg.a(6);
        aoju.a |= 8;
        throw new nja(10, "GetFileGroupOp : Group not accessible");
    }
}
