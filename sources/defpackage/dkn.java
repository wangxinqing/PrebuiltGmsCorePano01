package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkn {
    public final dkq a;
    public final jiq b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public final Map h;
    public final List i;
    private long j;
    private long k;

    public dkn(dkn dkn) {
        this.a = dkn.a;
        this.b = dkn.b;
        this.d = dkn.d;
        this.e = dkn.e;
        this.f = dkn.f;
        this.j = dkn.j;
        this.k = dkn.k;
        this.i = new ArrayList(dkn.i);
        this.h = new HashMap(dkn.h.size());
        for (Map.Entry entry : dkn.h.entrySet()) {
            dkp c2 = c((Class) entry.getKey());
            ((dkp) entry.getValue()).a(c2);
            this.h.put((Class) entry.getKey(), c2);
        }
    }

    private static dkp c(Class cls) {
        try {
            return (dkp) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            if (e2 instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e2);
            } else if (!(e2 instanceof IllegalAccessException)) {
                int i2 = Build.VERSION.SDK_INT;
                if (e2 instanceof ReflectiveOperationException) {
                    throw new IllegalArgumentException("Linkage exception", e2);
                }
                throw new RuntimeException(e2);
            } else {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
            }
        }
    }

    public final dkn a() {
        return new dkn(this);
    }

    public final dkp b(Class cls) {
        dkp dkp = (dkp) this.h.get(cls);
        if (dkp != null) {
            return dkp;
        }
        dkp c2 = c(cls);
        this.h.put(cls, c2);
        return c2;
    }

    public final dkp a(Class cls) {
        return (dkp) this.h.get(cls);
    }

    public final void a(dkp dkp) {
        iva.a((Object) dkp);
        Class<?> cls = dkp.getClass();
        if (cls.getSuperclass() == dkp.class) {
            dkp.a(b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    public dkn(dkq dkq, jiq jiq) {
        iva.a((Object) dkq);
        iva.a((Object) jiq);
        this.a = dkq;
        this.b = jiq;
        this.j = 1800000;
        this.k = 3024000000L;
        this.h = new HashMap();
        this.i = new ArrayList();
    }
}
