package defpackage;

import com.google.android.gms.drive.DriveSpace;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: lrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrt {
    private static final ith a = new ith("GenoaValuesHelper", "");

    public static knl a(kkf kkf, kmp kmp) {
        iva.a(kkf.b());
        knl ah = kmp.ah();
        if (ah != null) {
            return ah;
        }
        knl a2 = kkf.a(kmp);
        kmp.j(true);
        return a2;
    }

    public static int b(kkf kkf, kkz kkz, long j, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        kkf kkf2 = kkf;
        long j2 = j;
        kkf.d();
        khq a2 = khq.a(kkz);
        try {
            Set<knl> i = kkf2.i(j2);
            boolean z10 = z;
            boolean z11 = false;
            for (knl knl : i) {
                kmp a3 = kkf2.a(a2, knl.a);
                kns b = knl.b();
                boolean z12 = true;
                if (b.a() && b.c() == j2) {
                    String u = a3.u();
                    String str = (String) b.b();
                    z11 |= !ius.a(u, str);
                    a3.c(str);
                    b.d();
                }
                kns kns = knl.c;
                if (kns.a() && kns.c() == j2) {
                    kpy v = a3.v();
                    kpy kpy = (kpy) kns.b();
                    if (v != kpy) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z11 |= z9;
                    a3.a(kpy);
                    kns.d();
                }
                kns d = knl.d();
                if (d.a() && d.c() == j2) {
                    String P = a3.P();
                    String str2 = (String) d.b();
                    z11 |= !P.equals(str2);
                    a3.a(str2);
                    d.d();
                }
                kns g = knl.g();
                if (g.a() && g.c() == j2) {
                    String T = a3.T();
                    String str3 = (String) g.b();
                    z11 |= !ius.a(T, str3);
                    a3.h(str3);
                    g.d();
                }
                kns c = knl.c();
                if (c.a() && c.c() == j2) {
                    String H = a3.H();
                    String str4 = (String) c.b();
                    z11 |= !ius.a(H, str4);
                    a3.g(str4);
                    c.d();
                }
                kns h = knl.h();
                if (h.a()) {
                    if (h.c() == j2) {
                        Date G = a3.G();
                        Date date = (Date) h.b();
                        z11 |= !ius.a(G, date);
                        a3.e(date);
                        h.d();
                    }
                }
                kns i2 = knl.i();
                if (i2.a() && i2.c() == j2) {
                    boolean U = a3.U();
                    boolean booleanValue = ((Boolean) i2.b()).booleanValue();
                    if (U != booleanValue) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z11 |= z8;
                    a3.d(booleanValue);
                    i2.d();
                }
                kns f = knl.f();
                if (f.a() && f.c() == j2) {
                    boolean Q = a3.Q();
                    boolean booleanValue2 = ((Boolean) f.b()).booleanValue();
                    if (Q != booleanValue2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z11 |= z7;
                    a3.b(booleanValue2);
                    f.d();
                }
                kns e = knl.e();
                if (e.a() && e.c() == j2) {
                    String Z = a3.Z();
                    String str5 = (String) e.b();
                    z11 |= !ius.a(Z, str5);
                    a3.j(str5);
                    e.d();
                }
                kns j3 = knl.j();
                if (j3.a() && j3.c() == j2) {
                    boolean contains = a3.aj().contains(DriveSpace.a);
                    boolean booleanValue3 = ((Boolean) j3.b()).booleanValue();
                    if (contains != booleanValue3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z11 |= z6;
                    a3.k(booleanValue3);
                    j3.d();
                }
                kns k = knl.k();
                if (k.a() && k.c() == j2) {
                    boolean B = a3.B();
                    boolean booleanValue4 = ((Boolean) k.b()).booleanValue();
                    if (B != booleanValue4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z11 |= z5;
                    a3.a(booleanValue4);
                    k.d();
                }
                kns l = knl.l();
                if (l.a() && l.c() == j2) {
                    boolean R = a3.R();
                    boolean booleanValue5 = ((Boolean) l.b()).booleanValue();
                    if (R != booleanValue5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z11 |= z4;
                    a3.c(booleanValue5);
                    l.d();
                }
                kns kns2 = knl.d;
                if (kns2.a() && kns2.c() == j2) {
                    Long V = a3.V();
                    Long l2 = (Long) kns2.b();
                    z11 |= !ius.a(V, l2);
                    a3.c(l2.longValue());
                    kns2.d();
                }
                kns m = knl.m();
                if (m.a() && m.c() == j2) {
                    Date F = a3.F();
                    Date date2 = (Date) m.b();
                    z11 |= !ius.a(F, date2);
                    a3.d(date2);
                    m.d();
                }
                kns kns3 = knl.e;
                if (kns3.a() && kns3.c() == j2) {
                    amzy S = a3.S();
                    amzy a4 = amzy.a((Collection) kns3.b());
                    if (S != null) {
                        if (a4 != null && S.size() == a4.size() && S.containsAll(a4)) {
                            z3 = true;
                            z11 |= z3;
                            a3.a(a4);
                            kns3.d();
                        }
                    } else if (a4 == null) {
                        z3 = true;
                        z11 |= z3;
                        a3.a(a4);
                        kns3.d();
                    }
                    z3 = false;
                    z11 |= z3;
                    a3.a(a4);
                    kns3.d();
                }
                kns n = knl.n();
                if (n.a() && n.c() == j2) {
                    boolean Y = a3.Y();
                    boolean booleanValue6 = ((Boolean) n.b()).booleanValue();
                    if (Y != booleanValue6) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z11 |= z2;
                    a3.f(booleanValue6);
                    n.d();
                }
                kns o = knl.o();
                if (o.a() && o.c() == j2) {
                    Date C = a3.C();
                    Date date3 = (Date) o.b();
                    z11 |= !C.equals(date3);
                    a3.a(date3);
                    o.d();
                }
                kns p = knl.p();
                if (p.a() && p.c() == j2) {
                    Date D = a3.D();
                    Date date4 = (Date) p.b();
                    z11 |= !ius.a(D, date4);
                    a3.b(date4);
                    p.d();
                }
                kns q = knl.q();
                if (q.a() && q.c() == j2) {
                    Date E = a3.E();
                    Date date5 = (Date) q.b();
                    z11 |= !E.equals(date5);
                    a3.c(date5);
                    q.d();
                }
                Iterator it = knl.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((kns) it.next()).a()) {
                            knl.t();
                            break;
                        }
                    } else {
                        knl.u();
                        a3.j(false);
                        break;
                    }
                }
                z10 &= z11;
                if (!z10) {
                    z12 = false;
                }
                a3.m(z12);
            }
            kkf.f();
            int size = i.size();
            kkf.e();
            return size;
        } catch (kcs e2) {
            a.c("GenoaValuesHelper", "Entry no longer exists", e2);
        } catch (Throwable th) {
            kkf.e();
            throw th;
        }
    }

    public static void a(kkd kkd, kkz kkz, long j) {
        kmp kmp;
        iva.a(kkd.b());
        List<krl> a2 = kkd.a(Long.valueOf(j));
        HashSet<kkx> hashSet = new HashSet<>();
        for (krl krl : a2) {
            kns g = krl.g();
            if (j == g.c()) {
                ((klw) krl.a()).a((String) g.b());
                g.d();
            }
            krl.c();
            hashSet.add(krl.d.b);
        }
        for (kkx kkx : hashSet) {
            if (kkx.a()) {
                kmp = ((kjp) kkd).a(khq.a(kkz), "EntryView", "ScopedEntryView", lrr.a(kkz.b, kkx.a.longValue()));
            } else {
                kmp = null;
            }
            if (kmp != null) {
                kmp.a((String) null, true);
                kmp.f();
            }
        }
        a2.size();
    }

    public static void a(kkf kkf, kkz kkz, long j, long j2) {
        iva.a(kkf.b());
        for (knl knl : kkf.i(j)) {
            List list = knl.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kns kns = (kns) list.get(i);
                if (kns.a() && kns.c() == j) {
                    kns.a(j2);
                }
            }
            knl.t();
        }
        for (krl krl : kkf.a(Long.valueOf(j))) {
            kns g = krl.g();
            if (g.a() && g.c() == j) {
                g.a(j2);
            }
            krl.c();
        }
        kky a2 = kkf.a(kkz, j);
        try {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                kmp kmp = (kmp) it.next();
                Long l = kmp.a.h;
                if (l != null && j == l.longValue()) {
                    kmp.a.h = Long.valueOf(j2);
                }
                Long p = kmp.p();
                if (p != null && j == p.longValue()) {
                    kmp.b(Long.valueOf(j2));
                }
                kmp.f();
            }
        } finally {
            a2.close();
        }
    }

    public static void a(kkf kkf, kkz kkz, long j, boolean z) {
        boolean z2;
        kkf.d();
        try {
            for (kmu kmu : ((kjp) kkf).a(kqz.b(kmw.GENOA_ROLE_ACTION_ID.m.e(j), kmw.GENOA_IS_LINK_REQUIRED_ACTION_ID.m.e(j)))) {
                Long l = kmu.h;
                if (l == null || kmu.g == null || l.longValue() != j) {
                    z2 = false;
                } else {
                    kmu.f = kmu.g.intValue();
                    kmu.g = null;
                    kmu.h = null;
                    z2 = true;
                }
                Long l2 = kmu.k;
                if (l2 != null) {
                    if (kmu.j != null && l2.longValue() == j) {
                        kmu.i = kmu.j.booleanValue();
                        kmu.j = null;
                        kmu.k = null;
                        z2 = true;
                    }
                }
                if (kmu.h == null && kmu.k == null && kmu.f == -100) {
                    kmu.u();
                } else if (z2) {
                    kmu.t();
                }
            }
            b(kkf, kkz, j, z);
            kbc.a(kkf, kkz, j, z);
            kkf.f();
        } finally {
            kkf.e();
        }
    }

    public static void a(kkf kkf, kkz kkz, knc knc, long j, boolean z) {
        kky a2;
        kkf.d();
        try {
            kmp a3 = kkf.a(khq.a(kkz), knc);
            Long p = a3.p();
            if (p == null || p.longValue() != j) {
                kkf.f();
                kkf.e();
            }
            kjp kjp = (kjp) kkf;
            a2 = kjp.a(((kjp) kkf).a.a(kou.a.b(), (String[]) null, kot.ENTRY_ID.k.e(knc.a), String.valueOf(kou.a.a.a()).concat(" DESC")), (kkp) kkt.a);
            if (!a2.isEmpty()) {
                Long valueOf = Long.valueOf(j);
                if (!valueOf.equals(((kor) a2.get(0)).b)) {
                    a.b("GenoaValuesHelper", "Last content action ID (%s) doesn't match what we're told (%s)", ((kor) a2.get(0)).b, valueOf);
                } else {
                    if (a2.size() != 1) {
                        if (z) {
                            kor kor = (kor) a2.get(1);
                            String str = kor.a;
                            if (!ius.a(str, a3.q())) {
                                a3.c(str, lru.b(str));
                            }
                            a3.a(kkf.d(str).f);
                            a3.b(kor.b);
                            a3.m(false);
                            a2.close();
                            kkf.f();
                            kkf.e();
                        }
                    }
                    String n = a3.n();
                    if (!ius.a(n, a3.q())) {
                        a3.c(n, lru.b(n));
                    }
                    if (a3.t() != null) {
                        a3.a(a3.t().longValue());
                        a3.c((Long) null);
                    }
                    a3.b((Long) null);
                    a3.m(false);
                    a2.close();
                    kkf.f();
                    kkf.e();
                }
            } else {
                a.c("GenoaValuesHelper", "No pending uploads when cleaning up content action!?");
            }
            a2.close();
            kkf.e();
        } catch (kcs e) {
            try {
                a.c("GenoaValuesHelper", "Entry doesn't exist?!", e);
            } catch (Throwable th) {
                kkf.e();
                throw th;
            }
        } catch (Throwable th2) {
            a2.close();
            throw th2;
        }
    }

    public static void a(kmp kmp, knl knl, kpy kpy, long j) {
        kns kns = knl.c;
        if (!kns.a()) {
            kns.a((Object) kmp.v(), j);
        } else {
            kns.a(j);
        }
        kmp.a(kpy);
    }

    public static void a(kmp kmp, knl knl, boolean z, long j) {
        kns k = knl.k();
        if (k.a()) {
            k.a(j);
        } else {
            k.a((Object) Boolean.valueOf(kmp.B()), j);
        }
        kmp.a(z);
    }
}
