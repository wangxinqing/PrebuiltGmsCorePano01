package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dfs implements csb {
    public final Object a(Object obj, Object obj2) {
        aqsj aqsj;
        aqti aqti;
        aqqh aqqh;
        aqqh aqqh2;
        aqqs aqqs;
        anax anax = (anax) obj2;
        ArrayList arrayList = new ArrayList();
        for (aqso aqso : (List) obj) {
            aqsr aqsr = aqso.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            if (aqsr.b != 0) {
                int i = aqso.b;
                if (i == 1000) {
                    break;
                } else if (i == 8) {
                    aqqh aqqh3 = (aqqh) aqso.c;
                    if (aqqh3.a != 2) {
                        if (aqqh3.a == 1) {
                            aqti = (aqti) aqqh3.b;
                        } else {
                            aqti = aqti.e;
                        }
                        if (aqti.c.size() == 0) {
                            if (aqso.b == 8) {
                                aqqh2 = (aqqh) aqso.c;
                            } else {
                                aqqh2 = aqqh.c;
                            }
                            if (aqqh2.a == 3) {
                                aqqs = (aqqs) aqqh2.b;
                            } else {
                                aqqs = aqqs.b;
                            }
                            if (aqqs.a.size() == 0) {
                            }
                        }
                        if (aqso.b == 8) {
                            aqqh = (aqqh) aqso.c;
                        } else {
                            aqqh = aqqh.c;
                        }
                        arrayList.add(aqqh);
                    } else {
                        if (aqqh3.a == 2) {
                            aqsj = (aqsj) aqqh3.b;
                        } else {
                            aqsj = aqsj.b;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        aucx aucx = aqsj.a;
                        int size = aucx.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            aqsl aqsl = (aqsl) aucx.get(i2);
                            if (!anax.contains(Long.valueOf(aqsl.b))) {
                                arrayList2.add(aqsl);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            aucd o = aqsj.b.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aqsj aqsj2 = (aqsj) o.b;
                            aqsj2.a();
                            auab.a((Iterable) arrayList2, (List) aqsj2.a);
                            aqsj aqsj3 = (aqsj) o.i();
                            aucd o2 = aqqh.c.o();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aqqh aqqh4 = (aqqh) o2.b;
                            aqsj3.getClass();
                            aqqh4.b = aqsj3;
                            aqqh4.a = 2;
                            arrayList.add((aqqh) o2.i());
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
