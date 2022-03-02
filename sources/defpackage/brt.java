package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: brt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class brt {
    public static bre a(brd brd) {
        aucd o = bre.i.o();
        String str = brd.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        bre bre = (bre) o.b;
        str.getClass();
        int i = bre.a | 1;
        bre.a = i;
        bre.b = str;
        if ((brd.a & 8) != 0) {
            int i2 = brd.e;
            i |= 2;
            bre.a = i;
            bre.c = i2;
        }
        if ((brd.a & 16) != 0) {
            boolean z = brd.f;
            i |= 4;
            bre.a = i;
            bre.d = z;
        }
        if ((brd.a & 32) != 0) {
            int i3 = brd.g;
            bre.a = i | 64;
            bre.h = i3;
        }
        return (bre) o.i();
    }

    public static String b(String str, String str2) {
        if (str2 == null || str2.length() <= 0 || str2.charAt(0) != '.') {
            return str2;
        }
        String valueOf = String.valueOf(str);
        return str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2);
    }

    public static List c(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            brb brb = (brb) it.next();
            int binarySearch = Collections.binarySearch(arrayList, brb, bqy.l);
            if (binarySearch >= 0) {
                String valueOf = String.valueOf(brb.b);
                throw new brs(valueOf.length() == 0 ? new String("bound-service actions should be unique: ") : "bound-service actions should be unique: ".concat(valueOf));
            }
            arrayList.add((-binarySearch) - 1, brb);
        }
        return arrayList;
    }

    public static List d(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            brg brg = (brg) it.next();
            int binarySearch = Collections.binarySearch(arrayList, brg, bqy.g);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
                aucd o = brg.d.o();
                String str = brg.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                brg brg2 = (brg) o.b;
                str.getClass();
                brg2.a |= 1;
                brg2.b = str;
                arrayList.add(binarySearch, (brg) o.i());
            }
            aucx aucx = ((brg) arrayList.get(binarySearch)).c;
            aucx aucx2 = brg.c;
            ArrayList arrayList2 = new ArrayList(aucx);
            int size = aucx2.size();
            for (int i = 0; i < size; i++) {
                brf brf = (brf) aucx2.get(i);
                int binarySearch2 = Collections.binarySearch(arrayList2, brf, bqy.h);
                if (binarySearch2 < 0) {
                    binarySearch2 = (-binarySearch2) - 1;
                    aucd o2 = brf.d.o();
                    String str2 = brf.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    brf brf2 = (brf) o2.b;
                    str2.getClass();
                    brf2.a |= 1;
                    brf2.b = str2;
                    arrayList2.add(binarySearch2, (brf) o2.i());
                }
                aucx aucx3 = ((brf) arrayList2.get(binarySearch2)).c;
                aucx aucx4 = brf.c;
                ArrayList arrayList3 = new ArrayList(aucx3);
                int size2 = aucx4.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bre bre = (bre) aucx4.get(i2);
                    int binarySearch3 = Collections.binarySearch(arrayList3, bre, bqy.i);
                    if (binarySearch3 >= 0) {
                        String valueOf = String.valueOf(bre.b);
                        throw new brs(valueOf.length() == 0 ? new String("Duplicate ModuleIntentOperation ") : "Duplicate ModuleIntentOperation ".concat(valueOf));
                    }
                    arrayList3.add((-binarySearch3) - 1, bre);
                }
                brf brf3 = (brf) arrayList2.get(binarySearch2);
                aucd aucd = (aucd) brf3.c(5);
                aucd.a((aucj) brf3);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brf brf4 = brf.d;
                ((brf) aucd.b).c = aucj.s();
                aucd.m((Iterable) arrayList3);
                arrayList2.set(binarySearch2, (brf) aucd.i());
            }
            brg brg3 = (brg) arrayList.get(binarySearch);
            aucd aucd2 = (aucd) brg3.c(5);
            aucd2.a((aucj) brg3);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            brg brg4 = brg.d;
            ((brg) aucd2.b).c = aucj.s();
            aucd2.n((Iterable) arrayList2);
            arrayList.set(binarySearch, (brg) aucd2.i());
        }
        return arrayList;
    }

    public static void b(List list, List list2) {
        ob obVar = new ob();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            obVar.add(((brn) it.next()).b);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = ((brr) it2.next()).b;
            if (obVar.contains(str)) {
                String valueOf = String.valueOf(str);
                throw new brs(valueOf.length() == 0 ? new String("Unexpected duplicated content-provider proxy from <module-provider> and <module-slice-provider> tags: ") : "Unexpected duplicated content-provider proxy from <module-provider> and <module-slice-provider> tags: ".concat(valueOf));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L_0x001d
            if (r2 == 0) goto L_0x001d
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x001d
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L_0x001d
            char r2 = r3.charAt(r0)
            r1 = 46
            if (r2 != r1) goto L_0x001d
            java.lang.String r2 = r3.substring(r0)
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brt.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return amzy.h();
        }
        List a = a(list, bqy.a);
        int size = a.size();
        int i = 0;
        String str = null;
        while (i < size) {
            brp brp = (brp) a.get(i);
            if (brp.d < brp.c) {
                String str2 = brp.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                sb.append("Required-API entry for API '");
                sb.append(str2);
                sb.append("' has invalid max version");
                throw new brs(sb.toString());
            } else if (str != null && brp.b.equals(str)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38);
                sb2.append("Multiple <uses-api> entries for API '");
                sb2.append(str);
                sb2.append("'");
                throw new brs(sb2.toString());
            } else {
                str = brp.b;
                i++;
            }
        }
        return a;
    }

    public static List a(List list, Comparator comparator) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, comparator);
        return arrayList;
    }

    public static List a(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            brp brp = (brp) list2.get(i2);
            int binarySearch = Collections.binarySearch(arrayList, brp, bqy.a);
            if (binarySearch < 0) {
                arrayList.add((-binarySearch) - 1, brp);
            } else {
                brp brp2 = (brp) arrayList.get(binarySearch);
                aucd aucd = (aucd) brp2.c(5);
                aucd.a((aucj) brp2);
                int i3 = brp.c;
                brp brp3 = (brp) aucd.b;
                int i4 = brp3.d;
                if (i3 > i4 || (i = brp3.c) > brp.d) {
                    String str = brp.b;
                    int i5 = brp.d;
                    int i6 = brp3.c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 167);
                    sb.append("Can't merge <uses-api name='");
                    sb.append(str);
                    sb.append("'>. The requested API versions [");
                    sb.append(i3);
                    sb.append(",");
                    sb.append(i5);
                    sb.append("] are incompatible with the existing required API versions [");
                    sb.append(i6);
                    sb.append(",");
                    sb.append(i4);
                    sb.append("]");
                    throw new brs(sb.toString());
                }
                if (i3 > i) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    brp brp4 = (brp) aucd.b;
                    brp brp5 = brp.e;
                    brp4.a |= 2;
                    brp4.c = i3;
                }
                int i7 = ((brp) aucd.b).d;
                int i8 = brp.d;
                if (i7 > i8 && i8 != i7) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    brp brp6 = (brp) aucd.b;
                    brp brp7 = brp.e;
                    brp6.a |= 4;
                    brp6.d = i8;
                }
                arrayList.set(binarySearch, (brp) aucd.i());
            }
        }
        return arrayList;
    }

    public static void a(String str, aucd aucd) {
        String str2 = ((brl) aucd.b).o;
        if (!str2.equals(str)) {
            for (int i = 0; i < ((brl) aucd.b).i.size(); i++) {
                brq h = aucd.h(i);
                aucd aucd2 = (aucd) h.c(5);
                aucd2.a((aucj) h);
                String a = a(str, b(str2, ((brq) aucd2.b).c));
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                brq brq = (brq) aucd2.b;
                brq brq2 = brq.e;
                a.getClass();
                brq.a |= 2;
                brq.c = a;
                String a2 = a(str, b(str2, brq.b));
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                brq brq3 = (brq) aucd2.b;
                a2.getClass();
                brq3.a |= 1;
                brq3.b = a2;
                brq brq4 = (brq) aucd2.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl = (brl) aucd.b;
                brl brl2 = brl.v;
                brq4.getClass();
                brl.a();
                brl.i.set(i, brq4);
            }
            for (int i2 = 0; i2 < ((brl) aucd.b).j.size(); i2++) {
                bro i3 = aucd.i(i2);
                aucd aucd3 = (aucd) i3.c(5);
                aucd3.a((aucj) i3);
                String a3 = a(str, b(str2, ((bro) aucd3.b).c));
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                bro bro = (bro) aucd3.b;
                bro bro2 = bro.e;
                a3.getClass();
                bro.a |= 2;
                bro.c = a3;
                String a4 = a(str, b(str2, bro.b));
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                bro bro3 = (bro) aucd3.b;
                a4.getClass();
                bro3.a |= 1;
                bro3.b = a4;
                bro bro4 = (bro) aucd3.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl3 = (brl) aucd.b;
                brl brl4 = brl.v;
                bro4.getClass();
                brl3.b();
                brl3.j.set(i2, bro4);
            }
            for (int i4 = 0; i4 < ((brl) aucd.b).k.size(); i4++) {
                brn j = aucd.j(i4);
                aucd aucd4 = (aucd) j.c(5);
                aucd4.a((aucj) j);
                String a5 = a(str, b(str2, ((brn) aucd4.b).c));
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                brn brn = (brn) aucd4.b;
                brn brn2 = brn.f;
                a5.getClass();
                brn.a |= 2;
                brn.c = a5;
                String a6 = a(str, b(str2, brn.b));
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                brn brn3 = (brn) aucd4.b;
                a6.getClass();
                brn3.a |= 1;
                brn3.b = a6;
                brn brn4 = (brn) aucd4.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl5 = (brl) aucd.b;
                brl brl6 = brl.v;
                brn4.getClass();
                brl5.c();
                brl5.k.set(i4, brn4);
            }
            for (int i5 = 0; i5 < ((brl) aucd.b).t.size(); i5++) {
                brr o = aucd.o(i5);
                aucd aucd5 = (aucd) o.c(5);
                aucd5.a((aucj) o);
                String a7 = a(str, b(str2, ((brr) aucd5.b).c));
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                brr brr = (brr) aucd5.b;
                brr brr2 = brr.f;
                a7.getClass();
                brr.a |= 2;
                brr.c = a7;
                String a8 = a(str, b(str2, brr.b));
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                brr brr3 = (brr) aucd5.b;
                a8.getClass();
                brr3.a |= 1;
                brr3.b = a8;
                brr brr4 = (brr) aucd5.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl7 = (brl) aucd.b;
                brl brl8 = brl.v;
                brr4.getClass();
                brl7.i();
                brl7.t.set(i5, brr4);
            }
            for (int i6 = 0; i6 < ((brl) aucd.b).m.size(); i6++) {
                bqz k = aucd.k(i6);
                aucd aucd6 = (aucd) k.c(5);
                aucd6.a((aucj) k);
                String a9 = a(str, b(str2, ((bqz) aucd6.b).c));
                if (aucd6.c) {
                    aucd6.c();
                    aucd6.c = false;
                }
                bqz bqz = (bqz) aucd6.b;
                bqz bqz2 = bqz.f;
                a9.getClass();
                bqz.a |= 2;
                bqz.c = a9;
                String a10 = a(str, b(str2, bqz.b));
                if (aucd6.c) {
                    aucd6.c();
                    aucd6.c = false;
                }
                bqz bqz3 = (bqz) aucd6.b;
                a10.getClass();
                bqz3.a |= 1;
                bqz3.b = a10;
                bqz bqz4 = (bqz) aucd6.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl9 = (brl) aucd.b;
                brl brl10 = brl.v;
                bqz4.getClass();
                brl9.d();
                brl9.m.set(i6, bqz4);
            }
            for (int i7 = 0; i7 < ((brl) aucd.b).l.size(); i7++) {
                brd brd = (brd) ((brl) aucd.b).l.get(i7);
                aucd aucd7 = (aucd) brd.c(5);
                aucd7.a((aucj) brd);
                String a11 = a(str, ((brd) aucd7.b).b);
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                brd brd2 = (brd) aucd7.b;
                brd brd3 = brd.h;
                a11.getClass();
                brd2.a |= 1;
                brd2.b = a11;
                String a12 = a(str, brd2.c);
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                brd brd4 = (brd) aucd7.b;
                a12.getClass();
                brd4.a |= 2;
                brd4.c = a12;
                String a13 = a(str, brd4.d);
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                brd brd5 = (brd) aucd7.b;
                a13.getClass();
                brd5.a |= 4;
                brd5.d = a13;
                brd brd6 = (brd) aucd7.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl11 = (brl) aucd.b;
                brl brl12 = brl.v;
                brd6.getClass();
                if (!brl11.l.a()) {
                    brl11.l = aucj.a(brl11.l);
                }
                brl11.l.set(i7, brd6);
            }
            for (int i8 = 0; i8 < ((brl) aucd.b).n.size(); i8++) {
                brg l = aucd.l(i8);
                aucd aucd8 = (aucd) l.c(5);
                aucd8.a((aucj) l);
                String a14 = a(str, b(str2, ((brg) aucd8.b).b));
                if (aucd8.c) {
                    aucd8.c();
                    aucd8.c = false;
                }
                brg brg = (brg) aucd8.b;
                brg brg2 = brg.d;
                a14.getClass();
                brg.a |= 1;
                brg.b = a14;
                for (int i9 = 0; i9 < ((brg) aucd8.b).c.size(); i9++) {
                    brf f = aucd8.f(i9);
                    aucd aucd9 = (aucd) f.c(5);
                    aucd9.a((aucj) f);
                    String a15 = a(str, b(str2, ((brf) aucd9.b).b));
                    if (aucd9.c) {
                        aucd9.c();
                        aucd9.c = false;
                    }
                    brf brf = (brf) aucd9.b;
                    brf brf2 = brf.d;
                    a15.getClass();
                    brf.a |= 1;
                    brf.b = a15;
                    for (int i10 = 0; i10 < ((brf) aucd9.b).c.size(); i10++) {
                        bre e = aucd9.e(i10);
                        aucd aucd10 = (aucd) e.c(5);
                        aucd10.a((aucj) e);
                        String a16 = a(str, b(str2, ((bre) aucd10.b).b));
                        if (aucd10.c) {
                            aucd10.c();
                            aucd10.c = false;
                        }
                        bre bre = (bre) aucd10.b;
                        bre bre2 = bre.i;
                        a16.getClass();
                        bre.a |= 1;
                        bre.b = a16;
                        bre bre3 = (bre) aucd10.i();
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        brf brf3 = (brf) aucd9.b;
                        bre3.getClass();
                        brf3.a();
                        brf3.c.set(i10, bre3);
                    }
                    brf brf4 = (brf) aucd9.i();
                    if (aucd8.c) {
                        aucd8.c();
                        aucd8.c = false;
                    }
                    brg brg3 = (brg) aucd8.b;
                    brf4.getClass();
                    brg3.a();
                    brg3.c.set(i9, brf4);
                }
                brg brg4 = (brg) aucd8.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl13 = (brl) aucd.b;
                brl brl14 = brl.v;
                brg4.getClass();
                brl13.e();
                brl13.n.set(i8, brg4);
            }
            for (int i11 = 0; i11 < ((brl) aucd.b).p.size(); i11++) {
                brb m = aucd.m(i11);
                aucd aucd11 = (aucd) m.c(5);
                aucd11.a((aucj) m);
                String a17 = a(str, b(str2, ((brb) aucd11.b).c));
                if (aucd11.c) {
                    aucd11.c();
                    aucd11.c = false;
                }
                brb brb = (brb) aucd11.b;
                brb brb2 = brb.g;
                a17.getClass();
                brb.a |= 2;
                brb.c = a17;
                String a18 = a(str, b(str2, brb.b));
                if (aucd11.c) {
                    aucd11.c();
                    aucd11.c = false;
                }
                brb brb3 = (brb) aucd11.b;
                a18.getClass();
                brb3.a |= 1;
                brb3.b = a18;
                String a19 = a(str, b(str2, brb3.d));
                if (aucd11.c) {
                    aucd11.c();
                    aucd11.c = false;
                }
                brb brb4 = (brb) aucd11.b;
                a19.getClass();
                brb4.a |= 4;
                brb4.d = a19;
                brb brb5 = (brb) aucd11.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl15 = (brl) aucd.b;
                brl brl16 = brl.v;
                brb5.getClass();
                brl15.f();
                brl15.p.set(i11, brb5);
            }
            for (int i12 = 0; i12 < ((brl) aucd.b).s.size(); i12++) {
                brc n = aucd.n(i12);
                aucd aucd12 = (aucd) n.c(5);
                aucd12.a((aucj) n);
                String a20 = a(str, b(str2, ((brc) aucd12.b).b));
                if (aucd12.c) {
                    aucd12.c();
                    aucd12.c = false;
                }
                brc brc = (brc) aucd12.b;
                brc brc2 = brc.d;
                a20.getClass();
                brc.a |= 1;
                brc.b = a20;
                brc brc3 = (brc) aucd12.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl17 = (brl) aucd.b;
                brl brl18 = brl.v;
                brc3.getClass();
                brl17.h();
                brl17.s.set(i12, brc3);
            }
            brl brl19 = (brl) aucd.b;
            if ((brl19.a & 16) != 0) {
                bra bra = brl19.u;
                if (bra == null) {
                    bra = bra.d;
                }
                aucd aucd13 = (aucd) bra.c(5);
                aucd13.a((aucj) bra);
                String a21 = a(str, b(str2, ((bra) aucd13.b).b));
                if (aucd13.c) {
                    aucd13.c();
                    aucd13.c = false;
                }
                bra bra2 = (bra) aucd13.b;
                a21.getClass();
                bra2.a |= 1;
                bra2.b = a21;
                bra bra3 = (bra) aucd13.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                brl brl20 = (brl) aucd.b;
                brl brl21 = brl.v;
                bra3.getClass();
                brl20.u = bra3;
                brl20.a |= 16;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl22 = (brl) aucd.b;
            brl brl23 = brl.v;
            str.getClass();
            brl22.a |= 8;
            brl22.o = str;
        }
    }

    public static void a(Collection collection, List list) {
        ob obVar = new ob();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            obVar.add(((brp) it.next()).b);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((brp) it2.next()).b;
            if (obVar.contains(str)) {
                String valueOf = String.valueOf(str);
                throw new brs(valueOf.length() == 0 ? new String("Unexpected duplicated required api from <uses-api> and <uses-api optional='true'> tags: ") : "Unexpected duplicated required api from <uses-api> and <uses-api optional='true'> tags: ".concat(valueOf));
            }
        }
    }
}
