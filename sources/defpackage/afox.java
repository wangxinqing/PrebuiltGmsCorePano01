package defpackage;

import java.util.ArrayList;

/* renamed from: afox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afox implements aoqb {
    private final afpf a;
    private final afkr b;

    public afox(afpf afpf, afkr afkr) {
        this.a = afpf;
        this.b = afkr;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        afkr afkr = this.b;
        anax anax = (anax) obj;
        ArrayList arrayList = new ArrayList();
        aucx aucx = afkr.j;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            afkn afkn = (afkn) aucx.get(i);
            int a2 = afkq.a(afkr.f);
            if (a2 == 0) {
                a2 = 1;
            }
            aflh a3 = afqu.a(afkn, a2);
            if (!anax.contains(a3)) {
                arrayList.add(afpf.e.c(a3));
            }
        }
        return aorl.b((Iterable) arrayList).a(afot.a, afpf.h);
    }
}
