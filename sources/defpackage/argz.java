package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: argz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class argz extends argu implements Set {
    final /* synthetic */ arhd b;

    public argz(arhd arhd) {
        this.b = arhd;
    }

    /* renamed from: b */
    public abstract argy iterator();

    public final void clear() {
        this.b.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return entry.getValue().equals(this.b.a(entry.getKey(), false));
    }

    public /* bridge */ /* synthetic */ argv e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return super.equals(obj);
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.b.remove(((Map.Entry) obj).getKey());
        return true;
    }

    public final int size() {
        return this.b.size();
    }
}
