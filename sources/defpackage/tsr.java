package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: tsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tsr {
    public static auzz a(int i) {
        aucd o = auzz.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auzz auzz = (auzz) o.b;
        int i2 = i - 1;
        if (i != 0) {
            auzz.b = i2;
            auzz.a |= 1;
            return (auzz) o.i();
        }
        throw null;
    }

    public static List a(List list, List list2) {
        Long l;
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uak uak = (uak) it.next();
                auzz auzz = uak.b;
                if (auzz == null) {
                    auzz = auzz.d;
                }
                if ((uak.a & 2) != 0) {
                    l = Long.valueOf(uak.c);
                } else {
                    l = null;
                }
                hashMap.put(auzz, l);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            auzz auzz2 = (auzz) list2.get(i);
            aucd o = uak.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            uak uak2 = (uak) o.b;
            auzz2.getClass();
            uak2.b = auzz2;
            uak2.a |= 1;
            arrayList.add((uak) o.i());
            if (hashMap.get(auzz2) == null) {
                uak uak3 = (uak) arrayList.get(i);
                aucd aucd = (aucd) uak3.c(5);
                aucd.a((aucj) uak3);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                uak uak4 = (uak) aucd.b;
                uak4.a &= -3;
                uak4.c = 0;
                arrayList.set(i, (uak) aucd.i());
            } else {
                uak uak5 = (uak) arrayList.get(i);
                aucd aucd2 = (aucd) uak5.c(5);
                aucd2.a((aucj) uak5);
                long longValue = ((Long) hashMap.get(auzz2)).longValue();
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                uak uak6 = (uak) aucd2.b;
                uak6.a |= 2;
                uak6.c = longValue;
                arrayList.set(i, (uak) aucd2.i());
            }
        }
        return arrayList;
    }

    public static List a(int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int a : iArr) {
            arrayList.add(a(a));
        }
        return a((List) null, arrayList);
    }
}
