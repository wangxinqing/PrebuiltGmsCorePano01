package defpackage;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: zyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyz {
    public static final zyz a = new zyz();
    public final LruCache b = new LruCache(3);

    private zyz() {
    }

    public final amri a(String str, String str2, String[] strArr) {
        aqxb a2 = a(str, str2);
        if (a2 == null) {
            return ampu.a;
        }
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        aqxa aqxa = (aqxa) aucd;
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableList(((aqxb) aqxa.b).a).iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            aqxx aqxx = (aqxx) it.next();
            int length = strArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (aqxx.g.equals(strArr[i])) {
                    arrayList.add(aqxx);
                    break;
                }
                i++;
            }
        }
        if (aqxa.c) {
            aqxa.c();
            aqxa.c = false;
        }
        ((aqxb) aqxa.b).a = aucj.s();
        aqxa.a(arrayList);
        return amri.b((aqxb) aqxa.i());
    }

    public final aqxb a(String str, String str2) {
        return (aqxb) this.b.get(new zyy(str, str2));
    }
}
