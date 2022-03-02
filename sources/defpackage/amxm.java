package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxm extends AbstractSet {
    final /* synthetic */ amxr a;

    public amxm(amxr amxr) {
        this.a = amxr;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        Map d = this.a.d();
        if (d != null) {
            return d.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a2 = this.a.a(entry.getKey());
            if (a2 == -1 || !amqx.a(this.a.e[a2], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.a.i();
    }

    public final boolean remove(Object obj) {
        Map d = this.a.d();
        if (d != null) {
            return d.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!this.a.b()) {
                int f = this.a.f();
                Object key = entry.getKey();
                Object value = entry.getValue();
                amxr amxr = this.a;
                int a2 = amxu.a(key, value, f, amxr.b, amxr.c, amxr.d, amxr.e);
                if (a2 != -1) {
                    this.a.a(a2, f);
                    amxr amxr2 = this.a;
                    amxr2.g--;
                    amxr2.g();
                    return true;
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.a.size();
    }
}
