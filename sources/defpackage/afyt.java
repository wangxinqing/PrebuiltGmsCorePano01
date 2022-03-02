package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: afyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyt {
    public static int a(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((afyq) list.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }

    public static int b(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((afyr) list.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }

    public static afyq a(int i) {
        aucd o = afyq.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        afyq afyq = (afyq) o.b;
        int i2 = afyq.a | 1;
        afyq.a = i2;
        afyq.b = i;
        int i3 = i2 | 4;
        afyq.a = i3;
        afyq.d = 0;
        afyq.a = i3 | 2;
        afyq.c = 1;
        return (afyq) o.i();
    }

    public static Map b(afys afys) {
        HashMap hashMap = new HashMap();
        aucx aucx = afys.e;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            afyr afyr = (afyr) aucx.get(i);
            if ((afyr.a & 2) != 0) {
                hashMap.put(Integer.valueOf(afyr.b), Long.valueOf(afyr.c));
            }
        }
        anhj a = a(afys).iterator();
        while (a.hasNext()) {
            Integer valueOf = Integer.valueOf(((Integer) a.next()).intValue());
            if (!hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, (Object) null);
            }
        }
        return hashMap;
    }

    public static afyq a(afyq afyq) {
        aucd aucd = (aucd) afyq.c(5);
        aucd.a((aucj) afyq);
        long j = afyq.c + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        afyq afyq2 = (afyq) aucd.b;
        afyq afyq3 = afyq.e;
        afyq2.a |= 2;
        afyq2.c = j;
        return (afyq) aucd.i();
    }

    public static afyr a(int i, long j, long j2) {
        aucd o = afyr.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        afyr afyr = (afyr) o.b;
        int i2 = afyr.a | 1;
        afyr.a = i2;
        afyr.b = i;
        int i3 = i2 | 2;
        afyr.a = i3;
        afyr.c = j;
        afyr.a = i3 | 4;
        afyr.d = j2;
        return (afyr) o.i();
    }

    public static afyr a(afyr afyr, long j) {
        aucd aucd = (aucd) afyr.c(5);
        aucd.a((aucj) afyr);
        afyr afyr2 = (afyr) aucd.b;
        if ((afyr2.a & 2) == 0 || afyr2.c > j) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            afyr afyr3 = (afyr) aucd.b;
            afyr afyr4 = afyr.e;
            afyr3.a |= 2;
            afyr3.c = j;
        }
        afyr afyr5 = (afyr) aucd.b;
        if ((afyr5.a & 4) == 0 || afyr5.d > j) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            afyr afyr6 = (afyr) aucd.b;
            afyr afyr7 = afyr.e;
            afyr6.a |= 4;
            afyr6.d = j;
        }
        return (afyr) aucd.i();
    }

    public static anax a(afys afys) {
        anav j = anax.j();
        aucx aucx = afys.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            afyq afyq = (afyq) aucx.get(i);
            if (afyq.c != afyq.d) {
                j.b(Integer.valueOf(afyq.b));
            }
        }
        return j.a();
    }
}
