package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: ho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ho extends bl {
    public static final bn c = new hn();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final boolean g;
    public boolean h = false;
    public boolean i = false;

    public ho(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public final void a(gj gjVar) {
        if (this.i) {
            boolean a = hl.a(2);
        } else if (!this.d.containsKey(gjVar.q)) {
            this.d.put(gjVar.q, gjVar);
            if (hl.a(2)) {
                "Updating retained Fragments: Added " + gjVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(gj gjVar) {
        if (!this.d.containsKey(gjVar.q) || !this.g) {
            return true;
        }
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void c(gj gjVar) {
        if (this.i) {
            boolean a = hl.a(2);
        } else if (this.d.remove(gjVar.q) != null && hl.a(2)) {
            "Updating retained Fragments: Removed " + gjVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ho hoVar = (ho) obj;
            return this.d.equals(hoVar.d) && this.e.equals(hoVar.e) && this.f.equals(hoVar.f);
        }
    }

    /* access modifiers changed from: protected */
    public final void f() {
        if (hl.a(3)) {
            "onCleared called for " + this;
        }
        this.h = true;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
