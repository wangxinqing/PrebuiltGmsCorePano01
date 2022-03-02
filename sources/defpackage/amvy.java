package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvy extends anep {
    final /* synthetic */ amwa a;

    public amvy(amwa amwa) {
        this.a = amwa;
    }

    public final Map a() {
        return this.a;
    }

    public final boolean contains(Object obj) {
        return amxi.a((Collection) this.a.a.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new amvz(this.a);
    }

    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        amwq amwq = this.a.b;
        Object key = ((Map.Entry) obj).getKey();
        Map map = amwq.a;
        amrl.a((Object) map);
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException e) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        amwq.b -= size;
        return true;
    }
}
