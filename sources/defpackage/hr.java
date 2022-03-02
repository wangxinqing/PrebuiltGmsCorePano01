package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: hr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hr {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public ho c;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b.values().removeAll(Collections.singleton((Object) null));
    }

    public final hq b(String str) {
        return (hq) this.b.get(str);
    }

    /* access modifiers changed from: package-private */
    public final gj c(String str) {
        hq hqVar = (hq) this.b.get(str);
        if (hqVar != null) {
            return hqVar.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final List d() {
        ArrayList arrayList = new ArrayList();
        for (hq hqVar : this.b.values()) {
            if (hqVar != null) {
                arrayList.add(hqVar.a);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (hq hqVar : this.b.values()) {
            if (hqVar != null) {
                arrayList.add(hqVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List c() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(gj gjVar) {
        if (!this.a.contains(gjVar)) {
            synchronized (this.a) {
                this.a.add(gjVar);
            }
            gjVar.w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + gjVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(gj gjVar) {
        synchronized (this.a) {
            this.a.remove(gjVar);
        }
        gjVar.w = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(hq hqVar) {
        gj gjVar = hqVar.a;
        if (!a(gjVar.q)) {
            this.b.put(gjVar.q, hqVar);
            if (gjVar.N) {
                if (gjVar.M) {
                    this.c.a(gjVar);
                } else {
                    this.c.c(gjVar);
                }
                gjVar.N = false;
            }
            if (hl.a(2)) {
                "Added fragment to active set " + gjVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(hq hqVar) {
        gj gjVar = hqVar.a;
        if (gjVar.M) {
            this.c.c(gjVar);
        }
        if (((hq) this.b.put(gjVar.q, (Object) null)) != null) {
            if (hl.a(2)) {
                "Removed fragment from active set " + gjVar;
            }
            for (hq hqVar2 : this.b.values()) {
                if (hqVar2 != null) {
                    gj gjVar2 = hqVar2.a;
                    if (gjVar.q.equals(gjVar2.t)) {
                        gjVar2.s = gjVar;
                        gjVar2.t = null;
                    }
                }
            }
            String str = gjVar.t;
            if (str != null) {
                gjVar.s = c(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        return this.b.get(str) != null;
    }
}
