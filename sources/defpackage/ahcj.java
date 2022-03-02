package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ahcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcj implements agzr {
    private ahcj() {
    }

    public static ahcj a() {
        return new ahcj();
    }

    public static final InputStream b(agzq agzq) {
        agzn agzn;
        InputStream b = agzq.b.b(agzq.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        if (!agzq.d.isEmpty()) {
            List list = agzq.d;
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ahcp a = ((ahcq) list.get(i)).a();
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            if (!arrayList2.isEmpty()) {
                agzn = new agzn(b, arrayList2);
            } else {
                agzn = null;
            }
            if (agzn != null) {
                arrayList.add(agzn);
            }
        }
        List list2 = agzq.c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(((ahcs) list2.get(i2)).a(agzq.e, (InputStream) anbs.d(arrayList)));
        }
        Collections.reverse(arrayList);
        for (agzk a2 : agzq.g) {
            a2.a(arrayList);
        }
        return (InputStream) arrayList.get(0);
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        return b(agzq);
    }
}
