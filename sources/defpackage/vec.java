package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: vec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vec {
    public final Map a = new WeakHashMap();

    public final boolean a(Object obj) {
        return b(obj) != null;
    }

    public final Object b(Object obj) {
        WeakReference weakReference = (WeakReference) this.a.get(obj);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
