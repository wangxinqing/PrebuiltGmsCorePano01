package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: afxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afxq {
    public final afxt a;
    public final anij b;

    public afxq(afxt afxt, anij anij) {
        this.a = afxt;
        this.b = anij;
    }

    public final anax a() {
        afxt afxt = this.a;
        if (afxt != null) {
            afyl afyl = afxt.a;
            Iterator it = anbs.a((Iterable) afyt.a(afyl.c), afyl.b).iterator();
            if (it.hasNext()) {
                EnumSet of = EnumSet.of((Enum) it.next());
                ance.a((Collection) of, it);
                int size = of.size();
                if (size != 0) {
                    if (size != 1) {
                        return new amzs(of);
                    }
                    return anax.a(anbs.b(of));
                }
            }
        }
        return anfv.a;
    }

    public final void b() {
        try {
            afxt afxt = this.a;
            if (afxt != null) {
                afxu.a(afxt.a.b());
            }
        } catch (IOException e) {
            anie c = this.b.c();
            c.a((Throwable) e);
            c.a("afxq", "b", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to update metadata after sync completed successfully!");
        }
    }

    public final void c() {
        try {
            afxt afxt = this.a;
            if (afxt != null) {
                afxu.a(afxt.a.c());
            }
        } catch (IOException e) {
            anie c = this.b.c();
            c.a((Throwable) e);
            c.a("afxq", "c", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to update metadata after sync failed!");
        }
    }

    public final afyp d() {
        afxt afxt = this.a;
        if (afxt == null) {
            return afyp.e().a();
        }
        return afxt.a.d();
    }
}
