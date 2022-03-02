package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: cvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvk {
    public static final iwd a = dit.a("ScreenGraphFetcher");
    public final dih b;
    public final aqsr c;
    public final cvm d;
    public final ExecutorService e;
    public final csx f;
    public final ctc g;
    public boolean h = false;
    public boolean i = false;
    public Exception j = null;
    public final aw k;
    public final cts l;
    private final ctu m;
    private int n;

    public cvk(dih dih, aqsr aqsr, cvm cvm, ctu ctu, ExecutorService executorService, cub cub, crr crr, cvs cvs) {
        ctu ctu2 = ctu;
        ihs b2 = ihs.b();
        dja.a();
        ctb ctb = new ctb(b2, dih, cvs);
        cts cts = new cts(ihs.b(), dih, executorService, cub, crr);
        cte cte = new cte();
        this.b = dih;
        this.c = aqsr;
        this.d = cvm;
        this.m = ctu2;
        this.e = executorService;
        this.f = ctb;
        this.l = cts;
        this.g = cte;
        this.k = ctu2.a(d(aqsr));
        this.n = 0;
    }

    private final void a(aqso aqso) {
        for (aqsr aqsr : csm.a(aqso)) {
            iwd iwd = a;
            Object[] objArr = new Object[2];
            aqsr aqsr2 = aqso.d;
            if (aqsr2 == null) {
                aqsr2 = aqsr.d;
            }
            objArr[0] = Integer.valueOf(aqsr2.b);
            objArr[1] = Integer.valueOf(aqsr.b);
            iwd.a("loadRemoteDescendants(%s) -> %s", objArr);
            a(aqsr);
        }
    }

    public final void a() {
        this.n++;
    }

    public final void b() {
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 == 0) {
            this.h = false;
            this.i = false;
            c();
        }
    }

    public final void c() {
        this.k.b(new csn(this.h, this.i, this.j));
    }

    public final ctt d(aqsr aqsr) {
        return new ctt(this.b, aqsr, this.d);
    }

    public final boolean b(aqsr aqsr) {
        aw b2 = this.m.b(d(aqsr));
        if (((csl) b2.b()).a()) {
            return false;
        }
        for (aqsr b3 : csm.a(((csl) b2.b()).a)) {
            if (!b(b3)) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(aqsr aqsr) {
        aw b2 = this.m.b(d(aqsr));
        if (((csl) b2.b()).c()) {
            return false;
        }
        for (aqsr c2 : csm.a(((csl) b2.b()).a)) {
            if (!c(c2)) {
                return false;
            }
        }
        return true;
    }

    private final void a(csl csl, long j2, Map map, csx csx) {
        for (aqsr a2 : csm.a(csl.a)) {
            a(a2, j2, map, csx);
        }
    }

    public final void a(aqrf aqrf, long j2, boolean z, boolean z2) {
        if (z2) {
            j2 = 0;
        }
        amzt amzt = new amzt();
        if ((aqrf.a & 1) != 0) {
            aqso aqso = aqrf.b;
            if (aqso == null) {
                aqso = aqso.f;
            }
            amzt.c(new csl(aqso, j2, z));
        }
        aucx aucx = aqrf.c;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            amzt.c(new csl((aqso) aucx.get(i2), j2, z));
        }
        a((List) amzt.a());
        if ((aqrf.a & 1) != 0) {
            aqso aqso2 = aqrf.b;
            if (aqso2 == null) {
                aqso2 = aqso.f;
            }
            a(aqso2);
        }
    }

    public final void a(aqsr aqsr) {
        Set<aqsr> set;
        a.a("loadRemoteResourceAndDescendants(%s)", Integer.valueOf(aqsr.b));
        csl csl = (csl) this.m.b(d(aqsr)).b();
        boolean z = !((Boolean) this.m.a().b()).booleanValue();
        if (!csl.c()) {
            a.a("loadRemoteResourceAndDescendants(%s): no refresh needed for this resource", Integer.valueOf(aqsr.b));
            a(csl.a);
            return;
        }
        ctu ctu = this.m;
        ctt d2 = d(aqsr);
        if (ctu.d.containsKey(d2)) {
            anav j2 = anax.j();
            aqso aqso = ((csl) ((aw) ctu.d.get(d2)).b()).a;
            Set<aqsr> a2 = csm.a(aqso);
            j2.b((Iterable) a2);
            for (aqsr ctt : a2) {
                ctt ctt2 = new ctt(d2.a, ctt, d2.c, d2.e);
                if (ctu.d.containsKey(ctt2)) {
                    aqso aqso2 = ((csl) ((aw) ctu.d.get(ctt2)).b()).a;
                    j2.b((Iterable) csm.b(aqso2));
                    if (aqso2.b == 6) {
                        anax<aqsr> a3 = anax.a((Collection) ((aqqk) aqso2.c).a);
                        j2.b((Iterable) a3);
                        for (aqsr ctt3 : a3) {
                            ctt ctt4 = new ctt(d2.a, ctt3, d2.c, d2.e);
                            if (ctu.d.containsKey(ctt4)) {
                                j2.b((Iterable) csm.b(((csl) ((aw) ctu.d.get(ctt4)).b()).a));
                            }
                        }
                    }
                }
            }
            j2.b((Iterable) csm.b(aqso));
            set = j2.a();
        } else {
            set = anfv.a;
        }
        anav j3 = anax.j();
        for (aqsr ctt5 : set) {
            ctt ctt6 = new ctt(d2.a, ctt5, d2.c, d2.e);
            if (ctu.d.containsKey(ctt6) && !((csl) ((aw) ctu.d.get(ctt6)).b()).c()) {
                aucd o = aqss.c.o();
                aqsr aqsr2 = ((csl) ((aw) ctu.d.get(ctt6)).b()).a.d;
                if (aqsr2 == null) {
                    aqsr2 = aqsr.d;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqss aqss = (aqss) o.b;
                aqsr2.getClass();
                aqss.b = aqsr2;
                aqss.a |= 1;
                j3.b((aqss) o.i());
            }
        }
        anax a4 = j3.a();
        long currentTimeMillis = System.currentTimeMillis();
        a();
        acwa a5 = acws.a((Executor) this.e, (Callable) new cvf(this, aqsr, currentTimeMillis, a4, z));
        a5.a((acvv) new cvg(this, currentTimeMillis));
        a5.a((acvs) new cvh(this, aqsr, currentTimeMillis));
        a5.a((acvp) new cvi(this));
    }

    public final void a(aqsr aqsr, long j2, Map map, csx csx) {
        csl csl;
        cta cta;
        csl csl2;
        long j3;
        int i2;
        aqpq a2;
        aqpq a3;
        cvp a4;
        cvp a5;
        aqsr aqsr2 = aqsr;
        Map map2 = map;
        if (!map2.containsKey(aqsr2)) {
            ctu ctu = this.m;
            ctt d2 = d(aqsr);
            if (ctu.d.containsKey(d2)) {
                csl = (csl) ((aw) ctu.d.get(d2)).b();
            } else {
                csl = new csl(d2.b);
            }
            if (csl.c()) {
                int i3 = aqsr2.b;
                csl csl3 = null;
                if (i3 == 524) {
                    int a6 = csp.a(aqsr);
                    if (a6 == 1 || ctb.b(a6)) {
                        aucd o = aqql.l.o();
                        aqsr b2 = ctb.b(10209, a6);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aqql aqql = (aqql) o.b;
                        b2.getClass();
                        aqql.b = b2;
                        aqql.a |= 1;
                        aqsr b3 = ctb.b(10111, a6);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aqql aqql2 = (aqql) o.b;
                        b3.getClass();
                        aqql2.f = b3;
                        aqql2.a |= 32;
                        if (ctb.b(a6)) {
                            aqsr c2 = ctb.c(2007);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aqql aqql3 = (aqql) o.b;
                            c2.getClass();
                            aqql3.j = c2;
                            aqql3.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                            aqsr c3 = ctb.c(2008);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aqql aqql4 = (aqql) o.b;
                            c3.getClass();
                            aqql4.k = c3;
                            aqql4.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                        }
                        aucd o2 = aqso.f.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aqso aqso = (aqso) o2.b;
                        int i4 = 2 | aqso.a;
                        aqso.a = i4;
                        aqso.e = true;
                        aqsr.getClass();
                        aqso.d = aqsr2;
                        aqso.a = i4 | 1;
                        aqsu aqsu = (aqsu) aqsv.b.o();
                        aucd o3 = aqpp.j.o();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        aqpp aqpp = (aqpp) o3.b;
                        aqql aqql5 = (aqql) o.i();
                        aqql5.getClass();
                        aqpp.f = aqql5;
                        aqpp.a |= 32;
                        aqsu.a(o3);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aqso aqso2 = (aqso) o2.b;
                        aqsv aqsv = (aqsv) aqsu.i();
                        aqsv.getClass();
                        aqso2.c = aqsv;
                        aqso2.b = 3;
                        aqso aqso3 = (aqso) o2.i();
                        if (awgy.j() && a6 == 1 && dio.a(((ctb) csx).a)) {
                            cta = cta.a(aqso3);
                        } else {
                            cta = cta.b(aqso3);
                        }
                    } else {
                        cta = null;
                    }
                } else if (i3 == 10047) {
                    cta = ctb.a(aqsr2, 10);
                } else if (i3 == 10110) {
                    cta = ((ctb) csx).b(aqsr2);
                } else if (i3 == 10211) {
                    ctb ctb = (ctb) csx;
                    if (dio.a(ctb.a)) {
                        aqpq aqpq = (aqpq) aqps.j.o();
                        if (aqpq.c) {
                            aqpq.c();
                            aqpq.c = false;
                        }
                        aqps aqps = (aqps) aqpq.b;
                        "com.google.android.gms".getClass();
                        int i5 = aqps.a | 1;
                        aqps.a = i5;
                        aqps.b = "com.google.android.gms";
                        "com.google.android.gms.accountsettings.VIEW_SETTINGS_0P".getClass();
                        aqps.a = i5 | 4;
                        aqps.d = "com.google.android.gms.accountsettings.VIEW_SETTINGS_0P";
                        aucd o4 = aqrb.c.o();
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        aqrb aqrb = (aqrb) o4.b;
                        aqrb.a = 11;
                        aqrb.b = 1;
                        aqpq.a("extra.screenId", (aqrb) o4.i());
                        aucd o5 = aqso.f.o();
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        aqso aqso4 = (aqso) o5.b;
                        int i6 = 2 | aqso4.a;
                        aqso4.a = i6;
                        aqso4.e = true;
                        aqsr.getClass();
                        aqso4.d = aqsr2;
                        aqso4.a = i6 | 1;
                        aqsu aqsu2 = (aqsu) aqsv.b.o();
                        aucd o6 = aqpp.j.o();
                        aucd o7 = aqpt.d.o();
                        ctb.a(aqpq);
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        aqpt aqpt = (aqpt) o7.b;
                        aqps aqps2 = (aqps) aqpq.i();
                        aqps2.getClass();
                        aqpt.c = aqps2;
                        aqpt.a |= 1;
                        if (o6.c) {
                            o6.c();
                            o6.c = false;
                        }
                        aqpp aqpp2 = (aqpp) o6.b;
                        aqpt aqpt2 = (aqpt) o7.i();
                        aqpt2.getClass();
                        aqpp2.h = aqpt2;
                        aqpp2.a |= 128;
                        aqsu2.a(o6);
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        aqso aqso5 = (aqso) o5.b;
                        aqsv aqsv2 = (aqsv) aqsu2.i();
                        aqsv2.getClass();
                        aqso5.c = aqsv2;
                        aqso5.b = 3;
                        cta = cta.b((aqso) o5.i());
                    } else {
                        cta = null;
                    }
                } else if (i3 == 10371) {
                    ctb ctb2 = (ctb) csx;
                    if (dio.a(ctb2.a)) {
                        if (!awgy.h()) {
                            i2 = 2;
                        } else {
                            i2 = 10212;
                        }
                        aucd o8 = aqso.f.o();
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        aqso aqso6 = (aqso) o8.b;
                        int i7 = 2 | aqso6.a;
                        aqso6.a = i7;
                        aqso6.e = true;
                        aqsr.getClass();
                        aqso6.d = aqsr2;
                        aqso6.a = i7 | 1;
                        aqqh a7 = ctb.a(ctb2.a((int) R.string.common_asm_google_account_title), ctb2.a((int) R.string.accountsettings_google_account_subtitle), aqrk.GOOGLE_G_ICON, i2);
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        aqso aqso7 = (aqso) o8.b;
                        a7.getClass();
                        aqso7.c = a7;
                        aqso7.b = 8;
                        aqso aqso8 = (aqso) o8.i();
                        if (!awgy.j() || !dio.a(ctb2.a)) {
                            cta = cta.b(aqso8);
                        } else {
                            cta = cta.a(aqso8);
                        }
                    } else {
                        cta = null;
                    }
                } else if (i3 == 2009) {
                    cta = ctb.a(aqsr2, 14);
                } else if (i3 == 2010) {
                    cta = ctb.a(aqsr2, 15);
                } else if (i3 == 10208) {
                    cta = ((ctb) csx).a(aqsr2);
                } else if (i3 != 10209) {
                    switch (i3) {
                        case 1003:
                            aucd o9 = aqso.f.o();
                            if (o9.c) {
                                o9.c();
                                o9.c = false;
                            }
                            aqso aqso9 = (aqso) o9.b;
                            int i8 = aqso9.a | 2;
                            aqso9.a = i8;
                            aqso9.e = true;
                            aqsr.getClass();
                            aqso9.d = aqsr2;
                            aqso9.a = i8 | 1;
                            aqsu aqsu3 = (aqsu) aqsv.b.o();
                            aucd o10 = aqpp.j.o();
                            aucd o11 = aqpt.d.o();
                            aqpq aqpq2 = (aqpq) aqps.j.o();
                            if (aqpq2.c) {
                                aqpq2.c();
                                aqpq2.c = false;
                            }
                            aqps aqps3 = (aqps) aqpq2.b;
                            "com.android.settings".getClass();
                            int i9 = aqps3.a | 1;
                            aqps3.a = i9;
                            aqps3.b = "com.android.settings";
                            "android.settings.DEVICE_INFO_SETTINGS".getClass();
                            aqps3.a = i9 | 4;
                            aqps3.d = "android.settings.DEVICE_INFO_SETTINGS";
                            ((ctb) csx).a(aqpq2);
                            if (o11.c) {
                                o11.c();
                                o11.c = false;
                            }
                            aqpt aqpt3 = (aqpt) o11.b;
                            aqps aqps4 = (aqps) aqpq2.i();
                            aqps4.getClass();
                            aqpt3.c = aqps4;
                            aqpt3.a |= 1;
                            if (o10.c) {
                                o10.c();
                                o10.c = false;
                            }
                            aqpp aqpp3 = (aqpp) o10.b;
                            aqpt aqpt4 = (aqpt) o11.i();
                            aqpt4.getClass();
                            aqpp3.h = aqpt4;
                            aqpp3.a |= 128;
                            aqsu3.a(o10);
                            if (o9.c) {
                                o9.c();
                                o9.c = false;
                            }
                            aqso aqso10 = (aqso) o9.b;
                            aqsv aqsv3 = (aqsv) aqsu3.i();
                            aqsv3.getClass();
                            aqso10.c = aqsv3;
                            aqso10.b = 3;
                            cta = cta.b((aqso) o9.i());
                            break;
                        case 1004:
                            aqsu aqsu4 = (aqsu) aqsv.b.o();
                            if (!amrk.a(awgs.c()) && (a2 = ctb.a(awgs.c())) != null) {
                                aucd o12 = aqpp.j.o();
                                aucd o13 = aqpt.d.o();
                                ((ctb) csx).a(a2);
                                if (o13.c) {
                                    o13.c();
                                    o13.c = false;
                                }
                                aqpt aqpt5 = (aqpt) o13.b;
                                aqps aqps5 = (aqps) a2.i();
                                aqps5.getClass();
                                aqpt5.c = aqps5;
                                aqpt5.a |= 1;
                                if (o12.c) {
                                    o12.c();
                                    o12.c = false;
                                }
                                aqpp aqpp4 = (aqpp) o12.b;
                                aqpt aqpt6 = (aqpt) o13.i();
                                aqpt6.getClass();
                                aqpp4.h = aqpt6;
                                aqpp4.a |= 128;
                                aqsu4.a(o12);
                            }
                            aucd o14 = aqso.f.o();
                            if (o14.c) {
                                o14.c();
                                o14.c = false;
                            }
                            aqso aqso11 = (aqso) o14.b;
                            int i10 = aqso11.a | 2;
                            aqso11.a = i10;
                            aqso11.e = true;
                            aqsr.getClass();
                            aqso11.d = aqsr2;
                            aqso11.a = i10 | 1;
                            aucd o15 = aqpp.j.o();
                            aucd o16 = aqpt.d.o();
                            aqpq aqpq3 = (aqpq) aqps.j.o();
                            if (aqpq3.c) {
                                aqpq3.c();
                                aqpq3.c = false;
                            }
                            aqps aqps6 = (aqps) aqpq3.b;
                            "com.android.emergency".getClass();
                            int i11 = aqps6.a | 1;
                            aqps6.a = i11;
                            aqps6.b = "com.android.emergency";
                            "android.settings.EDIT_EMERGENCY_INFO".getClass();
                            int i12 = i11 | 4;
                            aqps6.a = i12;
                            aqps6.d = "android.settings.EDIT_EMERGENCY_INFO";
                            aqps6.a = i12 | 32;
                            aqps6.i = true;
                            ((ctb) csx).a(aqpq3);
                            if (o16.c) {
                                o16.c();
                                o16.c = false;
                            }
                            aqpt aqpt7 = (aqpt) o16.b;
                            aqps aqps7 = (aqps) aqpq3.i();
                            aqps7.getClass();
                            aqpt7.c = aqps7;
                            aqpt7.a |= 1;
                            if (o15.c) {
                                o15.c();
                                o15.c = false;
                            }
                            aqpp aqpp5 = (aqpp) o15.b;
                            aqpt aqpt8 = (aqpt) o16.i();
                            aqpt8.getClass();
                            aqpp5.h = aqpt8;
                            aqpp5.a |= 128;
                            aqsu4.a(o15);
                            if (o14.c) {
                                o14.c();
                                o14.c = false;
                            }
                            aqso aqso12 = (aqso) o14.b;
                            aqsv aqsv4 = (aqsv) aqsu4.i();
                            aqsv4.getClass();
                            aqso12.c = aqsv4;
                            aqso12.b = 3;
                            cta = cta.b((aqso) o14.i());
                            break;
                        case 1005:
                            aqsu aqsu5 = (aqsu) aqsv.b.o();
                            if (!amrk.a(awgs.e()) && (a3 = ctb.a(awgs.e())) != null) {
                                aucd o17 = aqpp.j.o();
                                aucd o18 = aqpt.d.o();
                                ((ctb) csx).a(a3);
                                if (o18.c) {
                                    o18.c();
                                    o18.c = false;
                                }
                                aqpt aqpt9 = (aqpt) o18.b;
                                aqps aqps8 = (aqps) a3.i();
                                aqps8.getClass();
                                aqpt9.c = aqps8;
                                aqpt9.a |= 1;
                                if (o17.c) {
                                    o17.c();
                                    o17.c = false;
                                }
                                aqpp aqpp6 = (aqpp) o17.b;
                                aqpt aqpt10 = (aqpt) o18.i();
                                aqpt10.getClass();
                                aqpp6.h = aqpt10;
                                aqpp6.a |= 128;
                                aqsu5.a(o17);
                            }
                            aucd o19 = aqso.f.o();
                            if (o19.c) {
                                o19.c();
                                o19.c = false;
                            }
                            aqso aqso13 = (aqso) o19.b;
                            int i13 = aqso13.a | 2;
                            aqso13.a = i13;
                            aqso13.e = true;
                            aqsr.getClass();
                            aqso13.d = aqsr2;
                            aqso13.a = i13 | 1;
                            aucd o20 = aqpp.j.o();
                            aucd o21 = aqqf.d.o();
                            if (o21.c) {
                                o21.c();
                                o21.c = false;
                            }
                            aqqf aqqf = (aqqf) o21.b;
                            aqqf.a = 2 | aqqf.a;
                            aqqf.c = true;
                            String k2 = awgs.a.a().k();
                            if (o21.c) {
                                o21.c();
                                o21.c = false;
                            }
                            aqqf aqqf2 = (aqqf) o21.b;
                            k2.getClass();
                            aqqf2.a |= 1;
                            aqqf2.b = k2;
                            if (o20.c) {
                                o20.c();
                                o20.c = false;
                            }
                            aqpp aqpp7 = (aqpp) o20.b;
                            aqqf aqqf3 = (aqqf) o21.i();
                            aqqf3.getClass();
                            aqpp7.c = aqqf3;
                            aqpp7.a |= 4;
                            aqsu5.a(o20);
                            if (o19.c) {
                                o19.c();
                                o19.c = false;
                            }
                            aqso aqso14 = (aqso) o19.b;
                            aqsv aqsv5 = (aqsv) aqsu5.i();
                            aqsv5.getClass();
                            aqso14.c = aqsv5;
                            aqso14.b = 3;
                            cta = cta.b((aqso) o19.i());
                            break;
                        default:
                            switch (i3) {
                                case 2000:
                                    int a8 = csp.a(Collections.unmodifiableMap(aqsr2.c));
                                    if (a8 != 0) {
                                        cvs cvs = ((ctb) csx).c;
                                        cvs.b.await();
                                        GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) cvs.a.a.get(Integer.valueOf(a8));
                                        if (googleSettingsItem != null) {
                                            aucd o22 = aqso.f.o();
                                            if (o22.c) {
                                                o22.c();
                                                o22.c = false;
                                            }
                                            aqso aqso15 = (aqso) o22.b;
                                            int i14 = 2 | aqso15.a;
                                            aqso15.a = i14;
                                            aqso15.e = true;
                                            aqsr.getClass();
                                            aqso15.d = aqsr2;
                                            aqso15.a = i14 | 1;
                                            csl3 = null;
                                            aqqh a9 = ctb.a(ctb.a(googleSettingsItem.d, googleSettingsItem.i, (aqrk) null, ctb.d(2002, a8)));
                                            if (o22.c) {
                                                o22.c();
                                                o22.c = false;
                                            }
                                            aqso aqso16 = (aqso) o22.b;
                                            a9.getClass();
                                            aqso16.c = a9;
                                            aqso16.b = 8;
                                            cta = cta.b((aqso) o22.i());
                                            break;
                                        }
                                    }
                                    csl3 = null;
                                    cta = null;
                                    break;
                                case 2001:
                                    int a10 = csp.a(Collections.unmodifiableMap(aqsr2.c));
                                    if (a10 == 0) {
                                        cta = null;
                                        csl3 = null;
                                        break;
                                    } else {
                                        aucd o23 = aqso.f.o();
                                        if (o23.c) {
                                            o23.c();
                                            o23.c = false;
                                        }
                                        aqso aqso17 = (aqso) o23.b;
                                        int i15 = aqso17.a | 2;
                                        aqso17.a = i15;
                                        aqso17.e = true;
                                        aqsr.getClass();
                                        aqso17.d = aqsr2;
                                        aqso17.a = i15 | 1;
                                        aqsu aqsu6 = (aqsu) aqsv.b.o();
                                        aucd o24 = aqpp.j.o();
                                        aucd o25 = aqrv.e.o();
                                        if (o25.c) {
                                            o25.c();
                                            o25.c = false;
                                        }
                                        aqrv aqrv = (aqrv) o25.b;
                                        aqrv.a |= 1;
                                        aqrv.b = 11;
                                        aucd o26 = aqrg.c.o();
                                        if (o26.c) {
                                            o26.c();
                                            o26.c = false;
                                        }
                                        aqrg aqrg = (aqrg) o26.b;
                                        aqrg.a |= 1;
                                        aqrg.b = a10;
                                        aqrg aqrg2 = (aqrg) o26.i();
                                        if (o25.c) {
                                            o25.c();
                                            o25.c = false;
                                        }
                                        aqrv aqrv2 = (aqrv) o25.b;
                                        aqrg2.getClass();
                                        aqrv2.d = aqrg2;
                                        aqrv2.a |= 8;
                                        aqrv aqrv3 = (aqrv) o25.i();
                                        if (o24.c) {
                                            o24.c();
                                            o24.c = false;
                                        }
                                        aqpp aqpp8 = (aqpp) o24.b;
                                        aqrv3.getClass();
                                        aqpp8.b = aqrv3;
                                        aqpp8.a |= 2;
                                        aqsu6.a(o24);
                                        if (o23.c) {
                                            o23.c();
                                            o23.c = false;
                                        }
                                        aqso aqso18 = (aqso) o23.b;
                                        aqsv aqsv6 = (aqsv) aqsu6.i();
                                        aqsv6.getClass();
                                        aqso18.c = aqsv6;
                                        aqso18.b = 3;
                                        cta = cta.b((aqso) o23.i());
                                        csl3 = null;
                                        break;
                                    }
                                case 2002:
                                    int b4 = csp.b(Collections.unmodifiableMap(aqsr2.c));
                                    if (b4 != -1 && (a4 = ((ctb) csx).c.a(b4)) != null) {
                                        aucd o27 = aqso.f.o();
                                        if (o27.c) {
                                            o27.c();
                                            o27.c = false;
                                        }
                                        aqso aqso19 = (aqso) o27.b;
                                        int i16 = aqso19.a | 2;
                                        aqso19.a = i16;
                                        aqso19.e = true;
                                        aqsr.getClass();
                                        aqso19.d = aqsr2;
                                        aqso19.a = i16 | 1;
                                        aqpx[] aqpxArr = new aqpx[1];
                                        String str = a4.a;
                                        aucd o28 = aqpx.e.o();
                                        aucd o29 = aqqw.c.o();
                                        if (o29.c) {
                                            o29.c();
                                            o29.c = false;
                                        }
                                        aqqw aqqw = (aqqw) o29.b;
                                        str.getClass();
                                        aqqw.a |= 1;
                                        aqqw.b = str;
                                        if (o28.c) {
                                            o28.c();
                                            o28.c = false;
                                        }
                                        aqpx aqpx = (aqpx) o28.b;
                                        aqqw aqqw2 = (aqqw) o29.i();
                                        aqqw2.getClass();
                                        aqpx.c = aqqw2;
                                        aqpx.b = 17;
                                        aqpxArr[0] = (aqpx) o28.i();
                                        aqqh a11 = ctb.a(aqpxArr);
                                        if (o27.c) {
                                            o27.c();
                                            o27.c = false;
                                        }
                                        aqso aqso20 = (aqso) o27.b;
                                        a11.getClass();
                                        aqso20.c = a11;
                                        aqso20.b = 8;
                                        cta = cta.b((aqso) o27.i());
                                        break;
                                    } else {
                                        cta = null;
                                        break;
                                    }
                                    break;
                                case 2003:
                                    int b5 = csp.b(Collections.unmodifiableMap(aqsr2.c));
                                    if (b5 != -1 && (a5 = ((ctb) csx).c.a(b5)) != null) {
                                        aucd o30 = aqso.f.o();
                                        if (o30.c) {
                                            o30.c();
                                            o30.c = false;
                                        }
                                        aqso aqso21 = (aqso) o30.b;
                                        int i17 = 2 | aqso21.a;
                                        aqso21.a = i17;
                                        aqso21.e = true;
                                        aqsr.getClass();
                                        aqso21.d = aqsr2;
                                        aqso21.a = i17 | 1;
                                        aqqh a12 = ctb.a(ctb.a(a5.a, (String) null, (aqrk) null, ctb.c(2005, b5)));
                                        if (o30.c) {
                                            o30.c();
                                            o30.c = false;
                                        }
                                        aqso aqso22 = (aqso) o30.b;
                                        a12.getClass();
                                        aqso22.c = a12;
                                        aqso22.b = 8;
                                        cta = cta.b((aqso) o30.i());
                                        break;
                                    } else {
                                        cta = null;
                                        break;
                                    }
                                case 2004:
                                    int b6 = csp.b(Collections.unmodifiableMap(aqsr2.c));
                                    if (b6 == -1) {
                                        cta = null;
                                        break;
                                    } else {
                                        aqsr c4 = ctb.c(2006, b6);
                                        aucd o31 = aqso.f.o();
                                        if (o31.c) {
                                            o31.c();
                                            o31.c = false;
                                        }
                                        aqso aqso23 = (aqso) o31.b;
                                        int i18 = 2 | aqso23.a;
                                        aqso23.a = i18;
                                        aqso23.e = true;
                                        aqsr.getClass();
                                        aqso23.d = aqsr2;
                                        aqso23.a = i18 | 1;
                                        aqsu aqsu7 = (aqsu) aqsv.b.o();
                                        aucd o32 = aqpp.j.o();
                                        aucd o33 = aqql.l.o();
                                        if (o33.c) {
                                            o33.c();
                                            o33.c = false;
                                        }
                                        aqql aqql6 = (aqql) o33.b;
                                        c4.getClass();
                                        aqql6.f = c4;
                                        aqql6.a |= 32;
                                        aucd o34 = aqro.c.o();
                                        String str2 = ((ctb) csx).c.a(b6).a;
                                        if (o34.c) {
                                            o34.c();
                                            o34.c = false;
                                        }
                                        aqro aqro = (aqro) o34.b;
                                        str2.getClass();
                                        aqro.a |= 1;
                                        aqro.b = str2;
                                        aqro aqro2 = (aqro) o34.i();
                                        if (o33.c) {
                                            o33.c();
                                            o33.c = false;
                                        }
                                        aqql aqql7 = (aqql) o33.b;
                                        aqro2.getClass();
                                        aqql7.h = aqro2;
                                        aqql7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        if (o32.c) {
                                            o32.c();
                                            o32.c = false;
                                        }
                                        aqpp aqpp9 = (aqpp) o32.b;
                                        aqql aqql8 = (aqql) o33.i();
                                        aqql8.getClass();
                                        aqpp9.f = aqql8;
                                        aqpp9.a |= 32;
                                        aqsu7.a(o32);
                                        if (o31.c) {
                                            o31.c();
                                            o31.c = false;
                                        }
                                        aqso aqso24 = (aqso) o31.b;
                                        aqsv aqsv7 = (aqsv) aqsu7.i();
                                        aqsv7.getClass();
                                        aqso24.c = aqsv7;
                                        aqso24.b = 3;
                                        cta = cta.b((aqso) o31.i());
                                        break;
                                    }
                                case 2005:
                                    int b7 = csp.b(Collections.unmodifiableMap(aqsr2.c));
                                    if (b7 != -1) {
                                        ctb ctb3 = (ctb) csx;
                                        cvp a13 = ctb3.c.a(b7);
                                        if (a13 != null) {
                                            aqqj aqqj = (aqqj) aqqk.b.o();
                                            anhj a14 = a13.d.iterator();
                                            while (a14.hasNext()) {
                                                ctb3.a(aqqj, (cvo) a14.next());
                                            }
                                            aucd o35 = aqso.f.o();
                                            if (o35.c) {
                                                o35.c();
                                                o35.c = false;
                                            }
                                            aqso aqso25 = (aqso) o35.b;
                                            int i19 = aqso25.a | 2;
                                            aqso25.a = i19;
                                            aqso25.e = false;
                                            aqsr.getClass();
                                            aqso25.d = aqsr2;
                                            aqso25.a = i19 | 1;
                                            aqqk aqqk = (aqqk) aqqj.i();
                                            if (o35.c) {
                                                o35.c();
                                                o35.c = false;
                                            }
                                            aqso aqso26 = (aqso) o35.b;
                                            aqqk.getClass();
                                            aqso26.c = aqqk;
                                            aqso26.b = 6;
                                            cta = cta.b((aqso) o35.i());
                                            break;
                                        }
                                    }
                                    cta = null;
                                    break;
                                case 2006:
                                    quj.a();
                                    aqrz aqrz = (aqrz) aqsb.b.o();
                                    ctb ctb4 = (ctb) csx;
                                    if (quj.e(ctb4.b)) {
                                        aqrz.a(ctb4.a((int) R.string.common_usage_and_diagnostics, 2009));
                                    }
                                    aqrz.a(ctb4.a((int) R.string.common_open_source_licenses, 2010));
                                    aucd o36 = aqso.f.o();
                                    if (o36.c) {
                                        o36.c();
                                        o36.c = false;
                                    }
                                    aqso aqso27 = (aqso) o36.b;
                                    int i20 = aqso27.a | 2;
                                    aqso27.a = i20;
                                    aqso27.e = true;
                                    aqsr.getClass();
                                    aqso27.d = aqsr2;
                                    aqso27.a = i20 | 1;
                                    aqsb aqsb = (aqsb) aqrz.i();
                                    aqsb.getClass();
                                    aqso27.c = aqsb;
                                    aqso27.b = 13;
                                    cta = cta.b((aqso) o36.i());
                                    break;
                                case 2007:
                                    cta = ctb.a(aqsr2, 12);
                                    break;
                                default:
                                    switch (i3) {
                                        case 10367:
                                            cta = ((ctb) csx).c(aqsr2);
                                            break;
                                        case 10368:
                                            cta = ((ctb) csx).d(aqsr2);
                                            break;
                                        case 10369:
                                            aucd o37 = aqso.f.o();
                                            if (o37.c) {
                                                o37.c();
                                                o37.c = false;
                                            }
                                            aqso aqso28 = (aqso) o37.b;
                                            int i21 = aqso28.a | 2;
                                            aqso28.a = i21;
                                            aqso28.e = true;
                                            aqsr.getClass();
                                            aqso28.d = aqsr2;
                                            aqso28.a = i21 | 1;
                                            ctb ctb5 = (ctb) csx;
                                            aqqh a15 = ctb.a(ctb5.a((int) R.string.as_clp_payments_info_title), ctb5.a((int) R.string.as_clp_payments_info_subtitle), aqrk.PAYMENT_ICON, 1006);
                                            if (o37.c) {
                                                o37.c();
                                                o37.c = false;
                                            }
                                            aqso aqso29 = (aqso) o37.b;
                                            a15.getClass();
                                            aqso29.c = a15;
                                            aqso29.b = 8;
                                            aqso aqso30 = (aqso) o37.i();
                                            if (awgy.j() && dio.a(ctb5.a)) {
                                                cta = cta.a(aqso30);
                                                break;
                                            } else {
                                                cta = cta.b(aqso30);
                                                break;
                                            }
                                            break;
                                        default:
                                            cta = null;
                                            break;
                                    }
                            }
                    }
                } else {
                    aucd o38 = aqso.f.o();
                    if (o38.c) {
                        o38.c();
                        o38.c = false;
                    }
                    aqso aqso31 = (aqso) o38.b;
                    int i22 = aqso31.a | 2;
                    aqso31.a = i22;
                    aqso31.e = true;
                    aqsr.getClass();
                    aqso31.d = aqsr2;
                    aqso31.a = i22 | 1;
                    aqpx[] aqpxArr2 = new aqpx[1];
                    aucd o39 = aqpx.e.o();
                    aqqv aqqv = aqqv.a;
                    if (o39.c) {
                        o39.c();
                        o39.c = false;
                    }
                    aqpx aqpx2 = (aqpx) o39.b;
                    aqqv.getClass();
                    aqpx2.c = aqqv;
                    aqpx2.b = 19;
                    aqpxArr2[0] = (aqpx) o39.i();
                    aqqh a16 = ctb.a(aqpxArr2);
                    if (o38.c) {
                        o38.c();
                        o38.c = false;
                    }
                    aqso aqso32 = (aqso) o38.b;
                    a16.getClass();
                    aqso32.c = a16;
                    aqso32.b = 8;
                    cta = cta.b((aqso) o38.i());
                }
                if (cta == null) {
                    csl2 = csl3;
                } else if (!dio.a(((ctb) csx).a) && !cta.b) {
                    throw new IllegalStateException("No account resource should always be local-only");
                } else {
                    if (!cta.b) {
                        j3 = 0;
                    } else {
                        j3 = j2;
                    }
                    csl2 = new csl(cta.a, j3, true);
                }
                if (csl2 != null) {
                    aqsr aqsr3 = csl2.a.d;
                    if (aqsr3 == null) {
                        aqsr3 = aqsr.d;
                    }
                    iva.a(aqsr3.equals(aqsr2));
                    iva.a(csl2.c);
                    map2.put(aqsr2, csl2);
                    a(csl2, j2, map, csx);
                    return;
                }
                a(csl, j2, map, csx);
                return;
            }
            a(csl, j2, map, csx);
            return;
        }
    }

    public final void a(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            csl csl = (csl) list.get(i2);
            if (!csl.a()) {
                ctu ctu = this.m;
                aqsr aqsr = csl.a.d;
                if (aqsr == null) {
                    aqsr = aqsr.d;
                }
                aw b2 = ctu.b(d(aqsr));
                csl csl2 = (csl) b2.b();
                if (!csl.c || csl2.a() || csl2.c) {
                    b2.b(new csl(csq.a(csl.a), csl.b, csl.c));
                }
            }
        }
    }
}
