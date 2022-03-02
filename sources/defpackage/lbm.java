package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: lbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbm {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    static {
        a(lce.a);
        a((kyq) lce.Q);
        a((kyq) lce.N);
        a((kyq) lce.P);
        a((kyq) lce.B);
        a(lce.m);
        a(lce.l);
        a(lce.n);
        a((kyq) lce.M);
        a(lce.o);
        a(lce.j);
        a(lce.q);
        a(lce.r);
        a(lce.s);
        a((kyq) lce.z);
        a(lce.b);
        a((kyq) lce.w);
        a(lce.c);
        a(lce.k);
        a(lce.d);
        a(lce.e);
        a(lce.f);
        a(lce.g);
        a(lce.u);
        a(lce.p);
        a(lce.v);
        a((kyq) lce.x);
        a((kyq) lce.y);
        a((kyq) lce.O);
        a(lce.C);
        a(lce.D);
        a(lce.i);
        a(lce.h);
        a(lce.A);
        a(lce.t);
        a((kyq) lce.L);
        a(lce.E);
        a((kyq) lce.F);
        a(lce.G);
        a(lce.H);
        a((kyq) lce.I);
        a(lce.J);
        a(lce.K);
        a((kyq) lch.a);
        a((kyq) lch.c);
        a((kyq) lch.d);
        a((kyq) lch.e);
        a((kyq) lch.b);
        a((kyq) lch.f);
        a(lcj.a);
        a(lcj.b);
        a(lbv.c);
        a(lcg.c);
    }

    public static Collection a() {
        return Collections.unmodifiableCollection(a.values());
    }

    public static kyq a(String str) {
        return (kyq) a.get(str);
    }

    public static void a(DataHolder dataHolder) {
        for (lbl a2 : b.values()) {
            a2.a(dataHolder);
        }
    }

    public static void a(DataHolder dataHolder, int i) {
        HashSet hashSet = new HashSet();
        for (kyq kyq : a()) {
            if (kyq.d() <= i) {
                hashSet.addAll(kyq.c());
            }
        }
        Iterator it = new HashSet(dataHolder.f.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!hashSet.contains(str)) {
                lbl lbl = (lbl) b.get(str);
                if (lbl == null) {
                    dataHolder.f.remove(str);
                } else {
                    lbl.a(dataHolder);
                }
            }
        }
    }

    private static void a(kyq kyq) {
        if (a.containsKey(kyq.a())) {
            String valueOf = String.valueOf(kyq.a());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Duplicate field name registered: ") : "Duplicate field name registered: ".concat(valueOf));
        } else {
            a.put(kyq.a(), kyq);
        }
    }

    private static void a(lbl lbl) {
        if (b.put(lbl.a(), lbl) != null) {
            String a2 = lbl.a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 46);
            sb.append("A cleaner for key ");
            sb.append(a2);
            sb.append(" has already been registered");
            throw new IllegalStateException(sb.toString());
        }
    }
}
