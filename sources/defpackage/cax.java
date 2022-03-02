package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: cax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cax {
    public final HashMap a = new HashMap();
    public final clg b = new clg();
    public final amxb c = amzg.q();
    public final amxb d = amzg.q();

    public final Collection a() {
        if (!this.a.isEmpty()) {
            return this.a.values();
        }
        return null;
    }

    public final Set a(bvt bvt) {
        if (this.c.d(bvt)) {
            return this.c.c((Object) bvt);
        }
        return null;
    }

    public final boolean a(int i) {
        return this.b.get(i) != null;
    }

    public final boolean a(car car) {
        return this.a.containsKey(car);
    }
}
