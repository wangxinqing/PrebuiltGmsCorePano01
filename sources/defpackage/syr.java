package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: syr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syr {
    final /* synthetic */ sys a;

    public syr(sys sys) {
        this.a = sys;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, boolean z) {
        Long l;
        this.a.h();
        this.a.o();
        if (this.a.w().a(j)) {
            this.a.w().m.a(true);
            this.a.w().r.a(0);
        }
        if (z && this.a.v().a(sud.N)) {
            this.a.w().q.a(j);
        }
        if (this.a.w().m.a()) {
            this.a.h();
            ayjq.c();
            this.a.E().k.a("Session started, time", Long.valueOf(this.a.A().b()));
            if (this.a.v().a(sud.L)) {
                l = Long.valueOf(j / 1000);
            } else {
                l = null;
            }
            this.a.f().a("auto", "_sid", (Object) l, j);
            this.a.w().m.a(false);
            Bundle bundle = new Bundle();
            if (this.a.v().a(sud.L)) {
                bundle.putLong("_sid", l.longValue());
            }
            if (this.a.v().a(sud.ax) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.f().a("auto", "_s", j, bundle);
            if (ayis.b() && this.a.v().a(sud.aC)) {
                String a2 = this.a.w().w.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.a.f().a("auto", "_ssr", j, bundle2);
                }
            }
            ayjq.c();
            this.a.w().q.a(j);
        }
    }
}
