package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: chi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chi {
    public static final amzy a = amzy.h();
    public final List b = new ArrayList();

    public chi(atsn atsn) {
        a(atsn);
    }

    public final void a(atsn atsn) {
        this.b.clear();
        if (atsn != null) {
            aucx aucx = atsn.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                atsm atsm = (atsm) aucx.get(i);
                List list = this.b;
                atsg atsg = atsm.a;
                if (atsg == null) {
                    atsg = atsg.c;
                }
                long j = atsg.a;
                atsg atsg2 = atsm.a;
                if (atsg2 == null) {
                    atsg2 = atsg.c;
                }
                long j2 = atsg2.b;
                ArrayList arrayList = new ArrayList(new aucu(atsm.b, atsm.c));
                anbs.f(arrayList, chg.a);
                Collections.sort(arrayList);
                list.add(new chh(j, j2, arrayList));
            }
        }
    }
}
