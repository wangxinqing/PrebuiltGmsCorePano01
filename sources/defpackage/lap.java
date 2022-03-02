package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: lap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lap {
    public static final Map a = new HashMap();

    static {
        a(lak.a);
        a(lak.b);
        a(lak.c);
        a(lak.d);
        a(lak.e);
        a(lak.f);
        a(lak.k);
        a(lak.g);
        a(lak.h);
        a(lak.i);
        a(lak.j);
        a(lak.l);
        a(lak.m);
        a(lak.n);
        a((lbc) lak.o);
        a(lak.p);
        a((lbc) lak.q);
        a(lak.r);
        a(lak.s);
        a(lak.t);
        a(lak.u);
        a(lak.v);
        a(lak.w);
        a(lak.x);
        a(lak.y);
        a(lak.z);
        a(lak.A);
        a(lak.B);
        a(lak.C);
        a(lak.D);
        a(lak.E);
        a(lak.F);
        a(lak.G);
        a(lak.H);
        a(lak.K);
        a(lak.I);
        a(lak.J);
        a(lak.L);
        a(lak.M);
        a(lak.N);
        a((lbc) lak.O);
        a(lak.P);
        a(lak.Q);
        a(lax.a);
        a(lax.b);
        a(lax.c);
        a(lax.d);
        a(lax.e);
        a(lax.f);
        a(lbe.a);
        a(lbe.b);
        for (kyq kyq : lbm.a()) {
            if (a.get(kyq) == null) {
                String valueOf = String.valueOf(kyq.a());
                throw new IllegalStateException(valueOf.length() == 0 ? new String("No registered converter for field: ") : "No registered converter for field: ".concat(valueOf));
            }
        }
        for (kyq kyq2 : a.keySet()) {
            if (lbm.a(kyq2.a()) == null) {
                String valueOf2 = String.valueOf(kyq2.a());
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Registered converter for unregistered field: ") : "Registered converter for unregistered field: ".concat(valueOf2));
            }
        }
    }

    public static lbc a(kyq kyq) {
        return (lbc) a.get(kyq);
    }

    private static void a(lbc lbc) {
        if (lbc.b instanceof kym) {
            iva.a(lbc instanceof lao, (Object) "Converters for collection fields must be collection converters.");
        }
        a.put(lbc.b, lbc);
    }
}
