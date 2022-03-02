package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aauz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aauz {
    public Map a = new HashMap();
    public final ReadWriteLock b = new ReentrantReadWriteLock();

    static {
        aauz.class.getSimpleName();
    }

    static aauy a(aauy aauy) {
        return a(aauy, true);
    }

    public static aauy a(aauy aauy, boolean z) {
        if (aauy.a.b.size() != 0) {
            ArrayList arrayList = new ArrayList();
            aucx aucx = aauy.a.b;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                aawd aawd = (aawd) aucx.get(i);
                long j = aauy.b;
                aavj aavj = aawd.e;
                if (aavj == null) {
                    aavj = aavj.b;
                }
                if (!a(j, aavj.a)) {
                    arrayList.add(aawd);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (!z) {
                aauy aauy2 = new aauy();
                aucd o = aavs.e.o();
                aavj aavj2 = aauy.a.c;
                if (aavj2 == null) {
                    aavj2 = aavj.b;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aavs aavs = (aavs) o.b;
                aavj2.getClass();
                aavs.c = aavj2;
                aavs.a |= 1;
                aavj aavj3 = aauy.a.d;
                if (aavj3 == null) {
                    aavj3 = aavj.b;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aavs aavs2 = (aavs) o.b;
                aavj3.getClass();
                aavs2.d = aavj3;
                aavs2.a |= 2;
                aauy2.b = aauy.b;
                o.ag(arrayList);
                aauy2.a = (aavs) o.i();
                return aauy2;
            }
            if (arrayList.size() < aauy.a.b.size()) {
                aavs aavs3 = aauy.a;
                aucd aucd = (aucd) aavs3.c(5);
                aucd.a((aucj) aavs3);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aavs aavs4 = aavs.e;
                ((aavs) aucd.b).b = aucj.s();
                aucd.ag(arrayList);
                aauy.a = (aavs) aucd.i();
            }
            return aauy;
        }
        aavs aavs5 = aauy.a;
        if ((aavs5.a & 2) != 0) {
            long j2 = aauy.b;
            aavj aavj4 = aavs5.d;
            if (aavj4 == null) {
                aavj4 = aavj.b;
            }
            if (!a(j2, aavj4.a)) {
                return aauy;
            }
        }
        return null;
    }

    private static boolean a(long j, long j2) {
        return j + (j2 * 1000) <= System.currentTimeMillis();
    }

    public final void a(Map map, aaae aaae, aauy aauy) {
        aaux aaux;
        aaae b2 = aaae.b();
        if (map.containsKey(b2)) {
            aaux = (aaux) map.get(b2);
            if (aaux.a == null) {
                aaux.a = new HashMap();
            }
            if (aaux.b == null) {
                aaux.b = new HashMap();
            }
        } else {
            aaux aaux2 = new aaux();
            aaux2.a = new HashMap();
            aaux2.b = new HashMap();
            map.put(b2, aaux2);
            aaux = aaux2;
        }
        if (aawf.a(aauy.a)) {
            aaux.b.put(aaae, aauy);
        } else {
            aaux.a.put(aaae, aauy);
        }
    }
}
