package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ashi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ashi {
    private final Map a = new HashMap();
    private final Set b = Collections.synchronizedSet(new HashSet());

    /* access modifiers changed from: protected */
    public abstract ashv a(asfs asfs);

    /* access modifiers changed from: protected */
    public abstract ashv a(asfs asfs, Set set);

    public final void a(ashv ashv) {
        Set set = this.b;
        iva.a((Object) ashv);
        set.add(ashv);
    }

    public final ashv b(asfs asfs) {
        ashv a2;
        ashv a3;
        iva.a((Object) asfs);
        synchronized (this.a) {
            a2 = a(asfs, this.a.keySet());
            if (a2 == null) {
                synchronized (this.b) {
                    a3 = a(asfs, this.b);
                    if (a3 != null) {
                        this.b.remove(a3);
                    }
                }
                a2 = a3;
            }
            if (a2 == null) {
                a2 = a(asfs);
            }
            if (a2 != null) {
                Integer num = (Integer) this.a.get(a2);
                if (num == null) {
                    num = 0;
                }
                this.a.put(a2, Integer.valueOf(num.intValue() + 1));
            }
        }
        return a2;
    }

    public final void c(ashv ashv) {
        boolean z;
        iva.a((Object) ashv);
        synchronized (this.a) {
            Integer num = (Integer) this.a.get(ashv);
            if (num != null) {
                z = true;
                if (num.intValue() > 1) {
                    this.a.put(ashv, Integer.valueOf(num.intValue() - 1));
                    z = false;
                } else {
                    this.a.remove(ashv);
                }
            } else {
                throw new IllegalArgumentException("Unknown connection.");
            }
        }
        if (z) {
            ashv.close();
        }
    }

    public final void b(ashv ashv) {
        Set set = this.b;
        iva.a((Object) ashv);
        if (set.remove(ashv)) {
            ashv.close();
        }
    }
}
