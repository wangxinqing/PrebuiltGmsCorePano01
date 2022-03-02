package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: hct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hct {
    private final anau a;

    public hct(Context context, gwr gwr) {
        anaq a2 = anau.a();
        if (!gwr.a()) {
            a2.b(hac.class, 1);
            a2.b(hac.class, 4);
            a2.b(hac.class, 5);
            a2.b(hac.class, 2);
            a2.b(hac.class, 7);
            a2.b(hac.class, 8);
            a2.b(hac.class, 10);
            a2.b(hac.class, 10);
            a2.b(hac.class, 9);
            a2.b(hac.class, 11);
            a2.b(hac.class, 12);
            a2.b(hac.class, 13);
            a2.b(hac.class, 14);
            a2.b(hac.class, 16);
            a2.b(hac.class, 19);
        }
        if (!gwr.b()) {
            a2.b(hac.class, 6);
            a2.b(hac.class, 15);
        }
        if (!gwr.c()) {
            a2.b(gzr.class, 1);
            a2.b(gzr.class, 10);
            a2.b(gzr.class, 9);
            a2.b(gzr.class, 19);
            a2.b(gzr.class, 17);
            a2.b(had.class, 6);
            a2.b(had.class, 7);
            a2.b(had.class, 8);
            a2.b(had.class, 18);
            a2.b(had.class, 16);
            a2.b(had.class, 19);
        }
        if (!gwr.d()) {
            a2.b(gzr.class, 6);
        }
        if (!gwr.e()) {
            a2.b(gzr.class, 3);
            a2.b(gzr.class, 16);
            a2.b(gzr.class, 22);
            a2.b(had.class, 9);
        }
        if (!gwr.f()) {
            a2.b(gzr.class, 11);
        }
        if (!gwr.g()) {
            a2.b(gzr.class, 12);
        }
        if (!gwr.h()) {
            a2.b(gzr.class, 18);
        }
        if (!gwr.i()) {
            a2.b(had.class, 5);
        }
        if (!gwr.r) {
            a2.b(gzr.class, 24);
        }
        if (!gwr.j()) {
            a2.b(gzr.class, 23);
        }
        if (!gwr.k()) {
            a2.b(gzr.class, 25);
        }
        if (!gwr.l()) {
            a2.b(had.class, 14);
        }
        if (!gwr.m()) {
            a2.b(gzr.class, 26);
        }
        if (!gwr.n()) {
            a2.b(gzr.class, 27);
        }
        if (jix.b(context) && awrq.p()) {
            anax a3 = anax.a((Object) 11, (Object) 16);
            Class<gzr> cls = gzr.class;
            Collection collection = (Collection) a2.a.get(cls);
            if (collection != null) {
                for (Object next : a3) {
                    amxg.a((Object) cls, next);
                    collection.add(next);
                }
            } else {
                Iterator it = a3.iterator();
                if (it.hasNext()) {
                    Collection c = anaq.c();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        amxg.a((Object) cls, next2);
                        c.add(next2);
                    }
                    a2.a.put(cls, c);
                }
            }
        }
        this.a = a2.b();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Class cls, int i) {
        return !this.a.b(cls, Integer.valueOf(i));
    }
}
