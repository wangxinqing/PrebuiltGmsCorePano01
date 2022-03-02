package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: sow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sow {
    public BitSet a;
    final /* synthetic */ spb b;
    private String c;
    private boolean d;
    private taf e;
    private BitSet f;
    private Map g;
    private Map h;

    public sow(spb spb, String str) {
        this.b = spb;
        this.c = str;
        this.d = true;
        this.a = new BitSet();
        this.f = new BitSet();
        this.g = new nz();
        this.h = new nz();
    }

    /* access modifiers changed from: package-private */
    public final szx a(int i, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        List list2 = list;
        aucd o = szx.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        szx szx = (szx) o.b;
        int i2 = szx.a | 1;
        szx.a = i2;
        szx.b = i;
        boolean z = this.d;
        int i3 = i2 | 8;
        szx.a = i3;
        szx.e = z;
        taf taf = this.e;
        if (taf != null) {
            taf.getClass();
            szx.d = taf;
            szx.a = i3 | 4;
        }
        aucd o2 = taf.e.o();
        o2.W(szg.a(this.a));
        o2.X(szg.a(this.f));
        Map map = this.g;
        if (map != null) {
            arrayList = new ArrayList(((ou) map).h);
            for (Integer intValue : this.g.keySet()) {
                int intValue2 = intValue.intValue();
                aucd o3 = szy.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                szy szy = (szy) o3.b;
                szy.a |= 1;
                szy.b = intValue2;
                long longValue = ((Long) this.g.get(Integer.valueOf(intValue2))).longValue();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                szy szy2 = (szy) o3.b;
                szy2.a |= 2;
                szy2.c = longValue;
                arrayList.add((szy) o3.i());
            }
        } else {
            arrayList = null;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        taf taf2 = (taf) o2.b;
        taf2.a();
        auab.a((Iterable) arrayList, (List) taf2.c);
        Map map2 = this.h;
        if (map2 == null) {
            arrayList2 = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(((ou) map2).h);
            for (Integer num2 : this.h.keySet()) {
                aucd o4 = tag.d.o();
                int intValue3 = num2.intValue();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                tag tag = (tag) o4.b;
                tag.a |= 1;
                tag.b = intValue3;
                List list3 = (List) this.h.get(num2);
                if (list3 != null) {
                    Collections.sort(list3);
                    o4.Y(list3);
                }
                arrayList3.add((tag) o4.i());
            }
            arrayList2 = arrayList3;
        }
        if (!aylg.b() || !this.b.v().b(this.c, sud.ak)) {
            szx szx2 = (szx) o.b;
            if ((szx2.a & 4) != 0) {
                taf taf3 = szx2.d;
                if (taf3 == null) {
                    taf3 = taf.e;
                }
                aucx aucx = taf3.d;
                if (!aucx.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(arrayList2);
                    nz nzVar = new nz();
                    int size = aucx.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        tag tag2 = (tag) aucx.get(i4);
                        if ((tag2.a & 1) != 0 && tag2.c.size() > 0) {
                            nzVar.put(Integer.valueOf(tag2.b), Long.valueOf(tag2.c.a(tag2.c.size() - 1)));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        tag tag3 = (tag) arrayList4.get(i5);
                        if ((tag3.a & 1) != 0) {
                            num = Integer.valueOf(tag3.b);
                        } else {
                            num = null;
                        }
                        Long l = (Long) nzVar.remove(num);
                        if (l != null && (list2 == null || !list2.contains(Integer.valueOf(tag3.b)))) {
                            ArrayList arrayList5 = new ArrayList();
                            if (l.longValue() < tag3.c.a(0)) {
                                arrayList5.add(l);
                            }
                            arrayList5.addAll(tag3.c);
                            aucd aucd = (aucd) tag3.c(5);
                            aucd.a((aucj) tag3);
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            tag tag4 = tag.d;
                            ((tag) aucd.b).c = aucj.r();
                            aucd.Y(arrayList5);
                            arrayList4.set(i5, (tag) aucd.i());
                        }
                    }
                    for (Integer num3 : nzVar.keySet()) {
                        aucd o5 = tag.d.o();
                        int intValue4 = num3.intValue();
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        tag tag5 = (tag) o5.b;
                        tag5.a |= 1;
                        tag5.b = intValue4;
                        long longValue2 = ((Long) nzVar.get(num3)).longValue();
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        tag tag6 = (tag) o5.b;
                        tag6.a();
                        tag6.c.a(longValue2);
                        arrayList4.add((tag) o5.i());
                    }
                    arrayList2 = arrayList4;
                }
            }
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        taf taf4 = (taf) o2.b;
        taf4.b();
        auab.a((Iterable) arrayList2, (List) taf4.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        szx szx3 = (szx) o.b;
        taf taf5 = (taf) o2.i();
        taf5.getClass();
        szx3.c = taf5;
        szx3.a |= 2;
        return (szx) o.i();
    }

    public sow(spb spb, String str, taf taf, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.b = spb;
        this.c = str;
        this.a = bitSet;
        this.f = bitSet2;
        this.g = map;
        this.h = new nz();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.h.put(num, arrayList);
            }
        }
        this.d = false;
        this.e = taf;
    }

    /* access modifiers changed from: package-private */
    public final void a(soz soz) {
        int a2 = soz.a();
        Boolean bool = soz.d;
        if (bool != null) {
            this.f.set(a2, bool.booleanValue());
        }
        Boolean bool2 = soz.e;
        if (bool2 != null) {
            this.a.set(a2, bool2.booleanValue());
        }
        if (soz.f != null) {
            Map map = this.g;
            Integer valueOf = Integer.valueOf(a2);
            Long l = (Long) map.get(valueOf);
            long longValue = soz.f.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.g.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (soz.g != null) {
            Map map2 = this.h;
            Integer valueOf2 = Integer.valueOf(a2);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.h.put(valueOf2, list);
            }
            if (aylg.b() && this.b.v().b(this.c, sud.ak) && soz.b()) {
                list.clear();
            }
            ayiv.c();
            ayiv.c();
            list.add(Long.valueOf(soz.g.longValue() / 1000));
        }
    }
}
