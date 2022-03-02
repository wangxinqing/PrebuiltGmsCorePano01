package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aco {
    private final ArrayList a = new ArrayList();
    public acm h = null;

    public static final acn f() {
        return new acn();
    }

    public static void g(adl adl) {
        int i = adl.j;
        if (!adl.k() && (i & 4) == 0) {
            int i2 = adl.d;
            int e = adl.e();
            if (i2 == -1 || e == -1 || i2 != e) {
            }
        }
    }

    public static final acn h(adl adl) {
        acn f = f();
        f.a(adl);
        return f;
    }

    public abstract void a();

    public abstract boolean a(adl adl, acn acn, acn acn2);

    public abstract boolean a(adl adl, adl adl2, acn acn, acn acn2);

    public boolean a(adl adl, List list) {
        throw null;
    }

    public abstract boolean b();

    public abstract boolean b(adl adl, acn acn, acn acn2);

    public abstract boolean c(adl adl, acn acn, acn acn2);

    public abstract void d();

    public abstract void d(adl adl);

    public final void e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((acl) this.a.get(i)).a();
        }
        this.a.clear();
    }

    public boolean f(adl adl) {
        throw null;
    }

    public final void e(adl adl) {
        acm acm = this.h;
        if (acm != null) {
            acm.a(adl);
        }
    }
}
