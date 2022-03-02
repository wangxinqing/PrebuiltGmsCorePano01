package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bom implements Comparable {
    public static final Comparator h = bol.a;
    private static final Map j = qug.a();
    public final String a;
    public final int b;
    public final List c;
    public final bnm d;
    public final brl e;
    public int f = -1;
    public final Set g;
    private final List i;

    public bom(brl brl, bnm bnm) {
        this.e = brl;
        this.g = qug.a.a((Collection) brl.f);
        String str = brl.b;
        String str2 = (String) j.get(str);
        if (str2 == null) {
            j.put(str, str);
        } else {
            str = str2;
        }
        this.a = str;
        this.c = brl.c;
        this.b = brl.d;
        if (brl.f.size() > 0) {
            this.i = new ArrayList(brl.f);
            a((Collection) this.e.h, true);
        } else {
            this.i = Collections.emptyList();
        }
        this.d = bnm;
    }

    public static void a() {
        j.clear();
    }

    public static boolean a(String str, String str2) {
        return str == str2;
    }

    public final List b() {
        return Collections.unmodifiableList(this.i);
    }

    public final brl c() {
        amrl.b(this.f != -1);
        brl brl = this.e;
        aucd aucd = (aucd) brl.c(5);
        aucd.a((aucj) brl);
        for (int i2 = 0; i2 < ((brl) aucd.b).i.size(); i2++) {
            brq h2 = aucd.h(i2);
            aucd aucd2 = (aucd) h2.c(5);
            aucd2.a((aucj) h2);
            int i3 = this.f;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            brq brq = (brq) aucd2.b;
            brq brq2 = brq.e;
            brq.a |= 4;
            brq.d = i3;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl2 = (brl) aucd.b;
            brq brq3 = (brq) aucd2.i();
            brl brl3 = brl.v;
            brq3.getClass();
            brl2.a();
            brl2.i.set(i2, brq3);
        }
        for (int i4 = 0; i4 < ((brl) aucd.b).j.size(); i4++) {
            bro i5 = aucd.i(i4);
            aucd aucd3 = (aucd) i5.c(5);
            aucd3.a((aucj) i5);
            int i6 = this.f;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            bro bro = (bro) aucd3.b;
            bro bro2 = bro.e;
            bro.a |= 4;
            bro.d = i6;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl4 = (brl) aucd.b;
            bro bro3 = (bro) aucd3.i();
            brl brl5 = brl.v;
            bro3.getClass();
            brl4.b();
            brl4.j.set(i4, bro3);
        }
        for (int i7 = 0; i7 < ((brl) aucd.b).m.size(); i7++) {
            bqz k = aucd.k(i7);
            aucd aucd4 = (aucd) k.c(5);
            aucd4.a((aucj) k);
            int i8 = this.f;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            bqz bqz = (bqz) aucd4.b;
            bqz bqz2 = bqz.f;
            bqz.a |= 8;
            bqz.e = i8;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl6 = (brl) aucd.b;
            bqz bqz3 = (bqz) aucd4.i();
            brl brl7 = brl.v;
            bqz3.getClass();
            brl6.d();
            brl6.m.set(i7, bqz3);
        }
        for (int i9 = 0; i9 < ((brl) aucd.b).k.size(); i9++) {
            brn j2 = aucd.j(i9);
            aucd aucd5 = (aucd) j2.c(5);
            aucd5.a((aucj) j2);
            int i10 = this.f;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            brn brn = (brn) aucd5.b;
            brn brn2 = brn.f;
            brn.a |= 8;
            brn.e = i10;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl8 = (brl) aucd.b;
            brn brn3 = (brn) aucd5.i();
            brl brl9 = brl.v;
            brn3.getClass();
            brl8.c();
            brl8.k.set(i9, brn3);
        }
        for (int i11 = 0; i11 < ((brl) aucd.b).t.size(); i11++) {
            brr o = aucd.o(i11);
            aucd aucd6 = (aucd) o.c(5);
            aucd6.a((aucj) o);
            int i12 = this.f;
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            brr brr = (brr) aucd6.b;
            brr brr2 = brr.f;
            brr.a |= 4;
            brr.e = i12;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl10 = (brl) aucd.b;
            brr brr3 = (brr) aucd6.i();
            brl brl11 = brl.v;
            brr3.getClass();
            brl10.i();
            brl10.t.set(i11, brr3);
        }
        for (int i13 = 0; i13 < ((brl) aucd.b).n.size(); i13++) {
            brg l = aucd.l(i13);
            aucd aucd7 = (aucd) l.c(5);
            aucd7.a((aucj) l);
            for (int i14 = 0; i14 < ((brg) aucd7.b).c.size(); i14++) {
                brf f2 = aucd7.f(i14);
                aucd aucd8 = (aucd) f2.c(5);
                aucd8.a((aucj) f2);
                for (int i15 = 0; i15 < ((brf) aucd8.b).c.size(); i15++) {
                    bre e2 = aucd8.e(i15);
                    aucd aucd9 = (aucd) e2.c(5);
                    aucd9.a((aucj) e2);
                    int i16 = this.f;
                    if (aucd9.c) {
                        aucd9.c();
                        aucd9.c = false;
                    }
                    bre bre = (bre) aucd9.b;
                    bre bre2 = bre.i;
                    bre.a |= 64;
                    bre.h = i16;
                    if (aucd8.c) {
                        aucd8.c();
                        aucd8.c = false;
                    }
                    brf brf = (brf) aucd8.b;
                    bre bre3 = (bre) aucd9.i();
                    brf brf2 = brf.d;
                    bre3.getClass();
                    brf.a();
                    brf.c.set(i15, bre3);
                }
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                brg brg = (brg) aucd7.b;
                brf brf3 = (brf) aucd8.i();
                brg brg2 = brg.d;
                brf3.getClass();
                brg.a();
                brg.c.set(i14, brf3);
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl12 = (brl) aucd.b;
            brg brg3 = (brg) aucd7.i();
            brl brl13 = brl.v;
            brg3.getClass();
            brl12.e();
            brl12.n.set(i13, brg3);
        }
        for (int i17 = 0; i17 < ((brl) aucd.b).p.size(); i17++) {
            brb m = aucd.m(i17);
            aucd aucd10 = (aucd) m.c(5);
            aucd10.a((aucj) m);
            int i18 = this.f;
            if (aucd10.c) {
                aucd10.c();
                aucd10.c = false;
            }
            brb brb = (brb) aucd10.b;
            brb brb2 = brb.g;
            brb.a |= 16;
            brb.f = i18;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl14 = (brl) aucd.b;
            brb brb3 = (brb) aucd10.i();
            brl brl15 = brl.v;
            brb3.getClass();
            brl14.f();
            brl14.p.set(i17, brb3);
        }
        for (int i19 = 0; i19 < ((brl) aucd.b).r.size(); i19++) {
            brk brk = (brk) ((brl) aucd.b).r.get(i19);
            aucd aucd11 = (aucd) brk.c(5);
            aucd11.a((aucj) brk);
            int i20 = this.f;
            if (aucd11.c) {
                aucd11.c();
                aucd11.c = false;
            }
            brk brk2 = (brk) aucd11.b;
            brk brk3 = brk.g;
            brk2.a |= 128;
            brk2.f = i20;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl16 = (brl) aucd.b;
            brk brk4 = (brk) aucd11.i();
            brl brl17 = brl.v;
            brk4.getClass();
            brl16.g();
            brl16.r.set(i19, brk4);
        }
        for (int i21 = 0; i21 < ((brl) aucd.b).s.size(); i21++) {
            brc n = aucd.n(i21);
            aucd aucd12 = (aucd) n.c(5);
            aucd12.a((aucj) n);
            int i22 = this.f;
            if (aucd12.c) {
                aucd12.c();
                aucd12.c = false;
            }
            brc brc = (brc) aucd12.b;
            brc brc2 = brc.d;
            brc.a |= 2;
            brc.c = i22;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl18 = (brl) aucd.b;
            brc brc3 = (brc) aucd12.i();
            brl brl19 = brl.v;
            brc3.getClass();
            brl18.h();
            brl18.s.set(i21, brc3);
        }
        brl brl20 = (brl) aucd.b;
        if ((brl20.a & 16) != 0) {
            bra bra = brl20.u;
            if (bra == null) {
                bra = bra.d;
            }
            aucd aucd13 = (aucd) bra.c(5);
            aucd13.a((aucj) bra);
            int i23 = this.f;
            if (aucd13.c) {
                aucd13.c();
                aucd13.c = false;
            }
            bra bra2 = (bra) aucd13.b;
            bra2.a |= 2;
            bra2.c = i23;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            brl brl21 = (brl) aucd.b;
            bra bra3 = (bra) aucd13.i();
            brl brl22 = brl.v;
            bra3.getClass();
            brl21.u = bra3;
            brl21.a |= 16;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        brl brl23 = brl.v;
        ((brl) aucd.b).f = aucj.s();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((brl) aucd.b).g = aucj.s();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((brl) aucd.b).h = aucj.s();
        return (brl) aucd.i();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bom) || compareTo((bom) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b;
    }

    public final String toString() {
        String str = !this.a.equals("") ? this.a : "built-in";
        int i2 = this.b;
        String a2 = bkd.a(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(a2).length());
        sb.append("module(");
        sb.append(str);
        sb.append(",v");
        sb.append(i2);
        sb.append(",");
        sb.append(a2);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int compareTo(bom bom) {
        int a2;
        if (!a(this.a, bom.a)) {
            return this.a.compareTo(bom.a);
        }
        amya a3 = amya.b.a(bom.b, this.b).a(bom.d.m, this.d.m);
        int a4 = bnl.a(this.d.k);
        int i2 = 1;
        if (a4 == 0) {
            a4 = 1;
        }
        int i3 = a4 - 1;
        int a5 = bnl.a(bom.d.k);
        if (a5 != 0) {
            i2 = a5;
        }
        amya a6 = a3.a(i3, i2 - 1);
        int a7 = bpc.a(this.d.i);
        if (a7 != 0 && a7 == 2 && (a2 = bpc.a(bom.d.i)) != 0 && a2 == 2) {
            a6 = a6.a(bom.d.h, this.d.h);
        }
        return a6.a(bom.d.d, this.d.d).a();
    }

    public final boolean a(Collection collection, boolean z) {
        int i2;
        boolean isEmpty = this.i.isEmpty();
        if (isEmpty || collection.isEmpty()) {
            return isEmpty;
        }
        int size = this.i.size();
        Iterator it = collection.iterator();
        brm brm = (brm) it.next();
        int i3 = 0;
        int i4 = 0;
        do {
            brp brp = (brp) this.i.get(i3);
            int compareTo = brp.b.compareTo(brm.b);
            if (compareTo < 0) {
                i3++;
                if (!z) {
                    return false;
                }
            } else {
                if (compareTo == 0 && (i2 = brm.c) >= brp.c && i2 <= brp.d) {
                    if (z) {
                        this.i.remove(i3);
                    } else {
                        i3++;
                    }
                    i4++;
                }
                brm = it.hasNext() ? (brm) it.next() : null;
            }
            if (i3 >= this.i.size()) {
                break;
            }
        } while (brm != null);
        if (i4 == size) {
            return true;
        }
        return false;
    }
}
