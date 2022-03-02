package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: qui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qui implements quh {
    public final Set b() {
        return new amxt();
    }

    public final Map a() {
        return amxr.a();
    }

    public final Map a(int i) {
        if (i <= 256) {
            return new nz(i);
        }
        return amxr.a(i);
    }

    public final Set a(Collection collection) {
        Set set;
        int size = collection.size();
        if (size <= 256) {
            set = new ob(size);
        } else {
            set = amxt.a(size);
        }
        set.addAll(collection);
        return set;
    }
}
