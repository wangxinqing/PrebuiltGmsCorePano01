package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: aoui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aoui {
    public final Class a;
    public final Class b;
    private final Map c;

    @SafeVarargs
    protected aoui(Class cls, aouh... aouhArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        aouh aouh = aouhArr[0];
        if (hashMap.containsKey(aouh.a)) {
            String valueOf = String.valueOf(aouh.a.getCanonicalName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("KeyTypeManager constructed with duplicate factories for primitive ") : "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf));
        }
        hashMap.put(aouh.a, aouh);
        this.b = aouhArr[0].a;
        this.c = Collections.unmodifiableMap(hashMap);
    }

    public abstract audx a(auay auay);

    public final Object a(audx audx, Class cls) {
        aouh aouh = (aouh) this.c.get(cls);
        if (aouh != null) {
            return aouh.a(audx);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String a();

    public abstract void a(audx audx);

    public final Set b() {
        return this.c.keySet();
    }

    public aoug c() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int d();
}
