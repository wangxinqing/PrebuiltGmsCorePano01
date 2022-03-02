package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class n implements Iterable {
    public j b;
    public j c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    /* access modifiers changed from: protected */
    public j a(Object obj) {
        j jVar = this.b;
        while (jVar != null && !jVar.a.equals(obj)) {
            jVar = jVar.c;
        }
        return jVar;
    }

    public final j b(Object obj, Object obj2) {
        j jVar = new j(obj, obj2);
        this.e++;
        j jVar2 = this.c;
        if (jVar2 == null) {
            this.b = jVar;
        } else {
            jVar2.c = jVar;
            jVar.d = jVar2;
        }
        this.c = jVar;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.e == nVar.e) {
                Iterator it = iterator();
                Iterator it2 = nVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        h hVar = new h(this.b, this.c);
        this.d.put(hVar, false);
        return hVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object b(Object obj) {
        j a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (m c2 : this.d.keySet()) {
                c2.c(a);
            }
        }
        j jVar = a.d;
        j jVar2 = a.c;
        if (jVar != null) {
            jVar.c = jVar2;
        } else {
            this.b = jVar2;
        }
        j jVar3 = a.c;
        if (jVar3 != null) {
            jVar3.d = jVar;
        } else {
            this.c = jVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final Object a(Object obj, Object obj2) {
        j a = a(obj);
        if (a != null) {
            return a.b;
        }
        b(obj, obj2);
        return null;
    }

    public final k a() {
        k kVar = new k(this);
        this.d.put(kVar, false);
        return kVar;
    }
}
