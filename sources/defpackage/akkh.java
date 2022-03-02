package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: akkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akkh implements akle {
    private final akkj a;
    private final nz b;
    private final List c;
    private final akln d;

    public akkh(akkj akkj, nz nzVar, List list, akln akln) {
        this.a = akkj;
        this.b = nzVar;
        this.c = list;
        this.d = akln;
    }

    public final void a(Collection collection, Collection collection2) {
        akkj akkj = this.a;
        nz nzVar = this.b;
        List list = this.c;
        akln akln = this.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            astz astz = (astz) it.next();
            if ((astz.a & 1) == 0) {
                aklz.a().b("Invalid PlaceInfo missing a feature ID");
            } else {
                asth asth = astz.b;
                if (asth == null) {
                    asth = asth.b;
                }
                list.add(akkk.a(astz, (astv) nzVar.get(Long.valueOf(asth.a))));
            }
        }
        if (akuo.a()) {
            list.addAll(akkj.a(list));
        }
        akkf akkf = akkj.c;
        if (akkf != null) {
            akkf.b(akln, list);
        }
    }
}
