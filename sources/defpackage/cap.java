package defpackage;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: cap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cap extends cbe implements rng {
    public final HashMap a = new HashMap();
    public final caj b = new caj(this);
    public final cla c = new cla();
    public final boolean d = awuz.n();
    public final Set e = new HashSet();
    private final rns f = rns.f(cbi.f());

    private static final boolean c(cas cas) {
        if (!cas.a(cas, 1) || !cas.b(cas)) {
            return false;
        }
        return true;
    }

    public final Collection a(bsz bsz) {
        cax cax = (cax) this.a.get(bsz);
        if (cax != null) {
            return cax.a();
        }
        return null;
    }

    public final void b() {
        long a2 = cbi.i().a();
        for (bsz bsz : cbi.y().a()) {
            juj a3 = cbi.q().a(bsz, 14);
            if (a3 != null) {
                try {
                    jye jye = (jye) aucj.a((aucj) jye.b, a3.c());
                    if (jye != null && !jir.a((Collection) jye.a)) {
                        aucx aucx = jye.a;
                        int size = aucx.size();
                        for (int i = 0; i < size; i++) {
                            atke atke = (atke) aucx.get(i);
                            atkd atkd = atke.h;
                            if (atkd == null) {
                                atkd = atkd.e;
                            }
                            cas cas = new cas(atke, new car(atkd, jhg.a, bsz));
                            if (!cas.a(cas, a2)) {
                                this.b.a(cas);
                            }
                        }
                    }
                } catch (auda e2) {
                    anih anih = (anih) bxk.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("cap", "b", 573, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InterestManager] Could not deserialize proto.");
                }
            }
        }
    }

    public final Set a() {
        return this.a.keySet();
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        if (i2 == 0) {
            jtm jtm = new jtm();
            for (int a2 : bta.a) {
                jtm.a(a2);
            }
            jtn a3 = jtm.a();
            for (bsz bsz : cbi.y().a()) {
                cjd p = cbi.p();
                ContextManagerClientInfo contextManagerClientInfo = r8;
                ContextManagerClientInfo contextManagerClientInfo2 = new ContextManagerClientInfo(bsz.b, (String) null, 0, (String) null, 0, 0, (String) null, (String) null, 0, 0);
                Object[] objArr2 = {Integer.valueOf(p.b((ContextDataFilterImpl) a3, contextManagerClientInfo)), bsz};
            }
            for (cas cas : this.e) {
                this.b.a(cas.b);
            }
            return;
        }
        for (cas a4 : this.e) {
            this.b.a(a4);
        }
    }

    public final void b(car car) {
        if (this.d) {
            this.e.remove(car);
            if (this.e.isEmpty()) {
                this.f.a((rng) cbi.r());
            }
        }
    }

    public final void b(cas cas) {
        b(cas.b);
        if (!this.d || a(cas.b)) {
            b(cas, false);
            this.b.a(cas.b);
        }
    }

    public final void a(bsz bsz, bvt bvt) {
        if (this.d) {
            ArrayList arrayList = new ArrayList(this.b.a.size() + this.e.size());
            for (cas cas : this.b.a) {
                if ((bvt == null || bvt.equals(cas.c)) && cas.b.c.equals(bsz)) {
                    arrayList.add(cas);
                }
            }
            for (cas cas2 : this.e) {
                if ((bvt == null || bvt.equals(cas2.c)) && cas2.b.c.equals(bsz)) {
                    arrayList.add(cas2);
                }
            }
            if (!arrayList.isEmpty()) {
                b((Collection) arrayList);
            }
        }
        cax cax = (cax) this.a.get(bsz);
        if (cax == null) {
            new Object[1][0] = bvt;
            return;
        }
        Collection a2 = bvt != null ? cax.a(bvt) : cax.a();
        if (a2 != null) {
            b((Collection) new ArrayList(a2));
        } else {
            new Object[1][0] = bvt;
        }
    }

    public final void b(cas cas, boolean z) {
        if (awuz.o() && c(cas)) {
            bsz bsz = cas.b.c;
            if (z || (this.a.containsKey(bsz) && ((cax) this.a.get(bsz)).a(cas.b))) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    arrayList.add(cas.a);
                }
                if (this.a.containsKey(bsz) && ((cax) this.a.get(bsz)).a() != null) {
                    for (cas cas2 : ((cax) this.a.get(bsz)).a()) {
                        if (!cas2.b.equals(cas.b) && c(cas2)) {
                            arrayList.add(cas2.a);
                        }
                    }
                }
                aucd o = jye.b.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                jye jye = (jye) o.b;
                if (!jye.a.a()) {
                    jye.a = aucj.a(jye.a);
                }
                auab.a((Iterable) arrayList, (List) jye.a);
                cbi.q().a(juj.a(bsz, 14, (jye) o.i()));
                return;
            }
            Object[] objArr = {cas.b.c(), bsz.b};
        }
    }

    public final void a(cao cao, but but) {
        new Object[1][0] = cao;
        this.c.a(cao, but);
    }

    public final void a(cas cas) {
        a(cas, true);
    }

    public final void a(cas cas, boolean z) {
        if (z || !a(cas.b)) {
            if (this.d && bta.a(cas.b().bA)) {
                boolean b2 = rns.b(cbi.f());
                if (this.e.isEmpty()) {
                    this.f.a((rng) cbi.r(), cbi.k().a(bvq.a("location_settings")));
                }
                this.e.add(cas);
                if (!b2) {
                    return;
                }
            }
            this.b.a(cas);
            b(cas, true);
        }
    }

    public final void b(Collection collection) {
        new Object[1][0] = collection;
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b((cas) it.next());
            }
        }
    }

    public final void a(Collection collection) {
        a(collection, true);
    }

    public final void a(Collection collection, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                a((cas) it.next(), z);
            }
        }
    }

    public final boolean a(car car) {
        if (this.d && this.b.a.contains(car)) {
            return true;
        }
        cax cax = (cax) this.a.get(car.c);
        return cax != null && cax.a(car);
    }
}
