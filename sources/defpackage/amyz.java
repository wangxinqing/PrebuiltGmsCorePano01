package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: amyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyz extends AbstractMap implements Serializable, amxe {
    private final amzf a;
    private transient Set b;

    public amyz(amzf amzf) {
        this.a = amzf;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    public final amxe a() {
        throw null;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        amza amza = new amza(this.a);
        this.b = amza;
        return amza;
    }

    public final Object get(Object obj) {
        amzf amzf = this.a;
        int b2 = amzf.b(obj);
        if (b2 != -1) {
            return amzf.a[b2];
        }
        return null;
    }

    public final Set keySet() {
        return this.a.values();
    }

    public final Object put(Object obj, Object obj2) {
        return this.a.a(obj, obj2);
    }

    public final Object remove(Object obj) {
        amzf amzf = this.a;
        int a2 = amzi.a(obj);
        int b2 = amzf.b(obj, a2);
        if (b2 == -1) {
            return null;
        }
        Object obj2 = amzf.a[b2];
        amzf.b(b2, a2);
        return obj2;
    }

    public final int size() {
        return this.a.c;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
