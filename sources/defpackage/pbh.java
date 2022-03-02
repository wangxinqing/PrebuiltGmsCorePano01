package defpackage;

import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbh {
    public final pbg[] a;
    public final GlobalSearchQuerySpecification b;
    public final pro c;
    public final int d;

    public pbh(List list, GlobalSearchQuerySpecification globalSearchQuerySpecification, pro pro) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean z = 0;
            int i = 1;
            if (it.hasNext()) {
                osz osz = (osz) it.next();
                String str = osz.e;
                synchronized (pro.a.g) {
                    if (!axsj.e() || !pro.a.e.isEmpty()) {
                        pqq pqq = (pqq) pro.a.e.get(str);
                        if (pqq != null && pqq.b) {
                            z = 1;
                        }
                    } else {
                        z = !prp.b(pro.a.a, str);
                    }
                }
                if (z == 0) {
                    arrayList.add(new pbg(osz));
                } else {
                    oso.a("Blacklisted %s", (Object) osz.e);
                }
            } else {
                pbg[] pbgArr = (pbg[]) arrayList.toArray(new pbg[0]);
                this.a = pbgArr;
                this.b = globalSearchQuerySpecification;
                this.c = pro;
                if (globalSearchQuerySpecification != null) {
                    int length = pbgArr.length;
                    while (z < length) {
                        osz osz2 = pbgArr[z].a;
                        CorpusScoringInfo a2 = globalSearchQuerySpecification.a(osz2.e, osz2.c);
                        if (a2 != null) {
                            i = Math.max(i, a2.b);
                        }
                        z++;
                    }
                }
                this.d = i;
                return;
            }
        }
        while (true) {
        }
    }
}
