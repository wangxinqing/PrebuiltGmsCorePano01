package defpackage;

import java.util.List;

/* renamed from: pap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pap {
    public static plf a(ota ota) {
        int i;
        ota ota2 = ota;
        osz osz = ota2.b;
        if (osz == null) {
            osz = osz.s;
        }
        aucd o = plf.i.o();
        int i2 = osz.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((plf) o.b).b = i2;
        aucd o2 = pld.c.o();
        String str = osz.e;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        pld pld = (pld) o2.b;
        str.getClass();
        pld.b = str;
        String str2 = osz.c;
        str2.getClass();
        pld.a = str2;
        pld pld2 = (pld) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        plf plf = (plf) o.b;
        pld2.getClass();
        plf.a = pld2;
        int i3 = 3;
        plf.d = ple.a(3);
        String str3 = osz.q;
        if (o.c) {
            o.c();
            o.c = false;
        }
        plf plf2 = (plf) o.b;
        str3.getClass();
        plf2.e = str3;
        String str4 = osz.d;
        str4.getClass();
        plf2.f = str4;
        plf2.c = osz.i;
        plf2.h = osz.r;
        int i4 = 0;
        while (true) {
            int i5 = 4;
            if (i4 >= osz.j.size()) {
                break;
            }
            oqy oqy = (oqy) osz.j.get(i4);
            aucd o3 = plh.b.o();
            boolean z = oqy.q;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((plh) o3.b).a = z;
            plh plh = (plh) o3.i();
            aucd o4 = plg.l.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            plg plg = (plg) o4.b;
            plg.b = i4;
            String str5 = oqy.b;
            str5.getClass();
            plg.a = str5;
            String str6 = oqy.m;
            str6.getClass();
            plg.c = str6;
            oqv a = oqv.a(oqy.d);
            if (a == null) {
                a = oqv.TOKENIZER_TEXT;
            }
            if (a == oqv.TOKENIZER_NONE) {
                int a2 = oqt.a(oqy.p);
                if (a2 != 0 && a2 == 2) {
                    i = 6;
                } else {
                    int a3 = oqt.a(oqy.p);
                    i = a3 == 0 ? 8 : a3 != 3 ? 8 : 7;
                }
            } else {
                i = 3;
            }
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((plg) o4.b).d = i - 2;
            boolean z2 = !oqy.g.isEmpty();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            plg plg2 = (plg) o4.b;
            plg2.e = z2;
            plg2.f = oqy.c;
            plg2.g = oqy.f;
            plg2.h = oqy.e;
            plh.getClass();
            plg2.i = plh;
            aucx aucx = oqy.j;
            if (!plg2.k.a()) {
                plg2.k = aucj.a(plg2.k);
            }
            auab.a((Iterable) aucx, (List) plg2.k);
            oqv a4 = oqv.a(oqy.d);
            if (a4 == null) {
                a4 = oqv.TOKENIZER_TEXT;
            }
            int ordinal = a4.ordinal();
            if (ordinal == 0) {
                i5 = 3;
            } else if (ordinal != 1) {
                i5 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 2 : 8 : 7 : 6 : 5;
            }
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((plg) o4.b).j = i5 - 2;
            plg plg3 = (plg) o4.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            plf plf3 = (plf) o.b;
            plg3.getClass();
            if (!plf3.g.a()) {
                plf3.g = aucj.a(plf3.g);
            }
            plf3.g.add(plg3);
            i4++;
        }
        plf plf4 = (plf) o.i();
        aucd aucd = (aucd) plf4.c(5);
        aucd.a((aucj) plf4);
        otg otg = ota2.c;
        if (otg == null) {
            otg = otg.h;
        }
        int a5 = otf.a(otg.c);
        if (a5 == 0) {
            a5 = 1;
        }
        oqv oqv = oqv.TOKENIZER_TEXT;
        int i6 = a5 - 1;
        if (i6 != 0) {
            if (i6 != 1) {
                i3 = 5;
            } else {
                i3 = 4;
            }
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((plf) aucd.b).d = ple.a(i3);
        return (plf) aucd.i();
    }
}
