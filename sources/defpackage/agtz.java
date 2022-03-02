package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: agtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agtz implements aoqb {
    private final agui a;

    public agtz(agui agui) {
        this.a = agui;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        agui agui = this.a;
        List<aguk> list = (List) obj;
        if (list.isEmpty()) {
            return aorl.a((Object) null);
        }
        ArrayList arrayList = new ArrayList();
        aucd o = atxk.b.o();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayDeque arrayDeque = new ArrayDeque();
        for (aguk aguk : list) {
            if (aguk.b() + agui.g.e >= currentTimeMillis) {
                try {
                    arrayDeque.add(Pair.create(aguk, (atix) aucj.a((aucj) atix.e, aguk.a())));
                    if (arrayDeque.size() > agui.g.f) {
                        agui.f++;
                        arrayList.add((aguk) ((Pair) arrayDeque.removeFirst()).first);
                    }
                } catch (auda e) {
                    agui.e++;
                    arrayList.add(aguk);
                }
            } else {
                agui.d++;
                arrayList.add(aguk);
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            atix atix = (atix) pair.second;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atxk atxk = (atxk) o.b;
            atix.getClass();
            if (!atxk.a.a()) {
                atxk.a = aucj.a(atxk.a);
            }
            atxk.a.add(atix);
            if (agui.h.a(osi.a())) {
                agui.a.add(Long.valueOf(((aguk) pair.first).b()));
            }
        }
        aucd o2 = atxm.e.o();
        aucd o3 = atwr.c.o();
        String d = agui.g.d.d();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atwr atwr = (atwr) o3.b;
        d.getClass();
        atwr.a |= 2;
        atwr.b = d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atxm atxm = (atxm) o2.b;
        atwr atwr2 = (atwr) o3.i();
        atwr2.getClass();
        atxm.b = atwr2;
        atxm.a |= 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atxm atxm2 = (atxm) o2.b;
        atxm2.d = 1;
        atxm2.a |= 4;
        atxk atxk2 = (atxk) o.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atxm atxm3 = (atxm) o2.b;
        atxk2.getClass();
        atxm3.c = atxk2;
        atxm3.a |= 2;
        atxm atxm4 = (atxm) o2.i();
        atxk atxk3 = atxm4.c;
        if (atxk3 == null) {
            atxk3 = atxk.b;
        }
        if (atxk3.a.isEmpty()) {
            aorr = aorl.a((Object) atxn.a);
        } else {
            aorr = agui.g.a.a(atxm4);
        }
        atxk atxk4 = atxm4.c;
        if (atxk4 == null) {
            atxk4 = atxk.b;
        }
        agui.c = atxk4.a.size();
        return aooz.a(aopr.a(aorr, (aoqb) new agua(agui, list), agui.g.c), Exception.class, (aoqb) new agub(agui, arrayList, list), agui.g.c);
    }
}
