package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ctu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctu {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public anax c = anfv.a;
    public final Map d = new ConcurrentHashMap();
    public volatile boolean e;
    private aw f;
    private aw g;

    public final aw a() {
        if (this.f == null) {
            aw awVar = new aw();
            this.f = awVar;
            awVar.b(false);
        }
        return this.f;
    }

    public final aw b() {
        if (this.g == null) {
            aw awVar = new aw();
            this.g = awVar;
            awVar.b(false);
        }
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final aw a(ctt ctt) {
        if (this.a.containsKey(ctt)) {
            return (aw) this.a.get(ctt);
        }
        aw awVar = new aw();
        awVar.b(new csn(false, false, (Throwable) null));
        this.a.put(ctt, awVar);
        return awVar;
    }

    /* access modifiers changed from: package-private */
    public final aw b(ctt ctt) {
        if (this.d.containsKey(ctt)) {
            return (aw) this.d.get(ctt);
        }
        aw awVar = new aw();
        awVar.b(new csl(ctt.b));
        this.d.put(ctt, awVar);
        return awVar;
    }

    /* access modifiers changed from: package-private */
    public final aw a(String str) {
        if (this.b.containsKey(str)) {
            return (aw) this.b.get(str);
        }
        aw awVar = new aw();
        if (!this.e) {
            awVar.b((Object) null);
        } else {
            awVar.b(anfv.a);
        }
        this.b.put(str, awVar);
        return awVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(dih dih, String str, boolean z) {
        anav j = anax.j();
        for (ctt ctt : this.d.keySet()) {
            if (ctt.a.equals(dih) && ctt.c.equals(str)) {
                j.b(b(ctt));
            }
        }
        for (aw awVar : j.a()) {
            if (z || !((csl) awVar.b()).a.e) {
                awVar.b(new csl(((csl) awVar.b()).a, 0, ((csl) awVar.b()).c));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Long l) {
        anav anav = new anav();
        anav.b((Iterable) this.c);
        anav.b(l);
        this.c = anav.a();
    }
}
