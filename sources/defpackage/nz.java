package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: nz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nz extends ou implements Map {
    oo a;

    public nz() {
    }

    private final oo b() {
        if (this.a == null) {
            this.a = new ny(this);
        }
        return this.a;
    }

    public final Set entrySet() {
        oo b = b();
        if (b.b == null) {
            b.b = new ok(b);
        }
        return b.b;
    }

    public final Set keySet() {
        return b().d();
    }

    public final void putAll(Map map) {
        a(this.h + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        oo b = b();
        if (b.d == null) {
            b.d = new on(b);
        }
        return b.d;
    }

    public nz(int i) {
        super(i);
    }

    public nz(ou ouVar) {
        if (ouVar != null) {
            a(ouVar);
        }
    }
}
