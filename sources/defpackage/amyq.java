package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: amyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyq extends amys implements Map {
    protected amyq() {
    }

    /* access modifiers changed from: protected */
    public abstract Map b();

    public final void clear() {
        b().clear();
    }

    public final boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    public final Set entrySet() {
        return b().entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    public final Object get(Object obj) {
        return b().get(obj);
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final boolean isEmpty() {
        return b().isEmpty();
    }

    public final Set keySet() {
        return b().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    public final void putAll(Map map) {
        b().putAll(map);
    }

    public final Object remove(Object obj) {
        return b().remove(obj);
    }

    public final int size() {
        return b().size();
    }

    public final Collection values() {
        return b().values();
    }
}
