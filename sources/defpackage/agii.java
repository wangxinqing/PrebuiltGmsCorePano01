package defpackage;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: agii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agii implements agig {
    static final anax a = anax.a("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    private static final anhq e = anhq.a("agii");
    public final agks b;
    final ConcurrentHashMap c;
    public final amri d;
    private final agnf f;
    private final bapu g;
    private final agng h;

    public agii(agkt agkt, bapu bapu, amri amri, ConcurrentHashMap concurrentHashMap) {
        this.f = new agnf(((aghy) amri.b()).c());
        this.b = agkt.a((Executor) aoqm.a, this.f);
        this.g = bapu;
        this.h = ((aghy) amri.b()).b();
        this.c = concurrentHashMap;
        this.d = ((aghy) amri.b()).d();
    }

    private final aorr a(String str, boolean z, basu basu, barb barb) {
        return aorl.a((aoqa) new agih(this, str, z, basu, barb), (Executor) this.g.a());
    }

    public final void a() {
    }

    public final agif b() {
        if (!this.h.a() || this.f.b()) {
            return agif.b;
        }
        return new agif();
    }

    public final void c() {
        this.c.clear();
    }

    private static basu a(agif agif) {
        aucd o = basu.s.o();
        aucd o2 = basv.d.o();
        long b2 = agif.b();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        basv basv = (basv) o2.b;
        int i = basv.a | 1;
        basv.a = i;
        basv.b = b2;
        if (agif.d != 0) {
            basv.c = 0;
            basv.a = i | 2;
            basv basv2 = (basv) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            basu basu = (basu) o.b;
            basv2.getClass();
            basu.e = basv2;
            basu.a |= 8;
            return (basu) o.i();
        }
        throw null;
    }

    public final aorr a(agif agif, String str, boolean z) {
        if (agif == null || agif == agif.b || str == null || str.isEmpty()) {
            return aorl.a((Throwable) new IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
        }
        if (a.contains(str)) {
            return aorl.a((Throwable) new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", new Object[]{str})));
        } else if (!this.f.b()) {
            return a(str, z, a(agif), (barb) null);
        } else {
            return aorl.a((Object) null);
        }
    }

    public final aorr a(String str, boolean z, long j, long j2, barb barb) {
        if (this.h.a() && !this.f.b()) {
            if (j <= j2) {
                return a(str, z, a(new agif(j, j2)), barb);
            }
            ((anhn) ((anhn) e.c()).a("agii", "a", 259, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skip timer event: end time %d is before start time %d", j2, j);
        }
        return aorl.a((Object) null);
    }
}
