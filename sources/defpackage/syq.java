package defpackage;

import android.os.Bundle;

/* renamed from: syq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syq {
    protected long a;
    protected long b;
    public final spm c = new syp(this, this.d.x);
    final /* synthetic */ sys d;

    public syq(sys sys) {
        this.d = sys;
        long b2 = sys.A().b();
        this.a = b2;
        this.b = b2;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        long b2 = this.d.A().b();
        long j = this.b;
        this.b = b2;
        return b2 - j;
    }

    public final boolean a(boolean z, boolean z2, long j) {
        this.d.h();
        this.d.l();
        if (!ayjc.a.a().a() || !this.d.v().a(sud.aG)) {
            j = this.d.A().b();
        }
        ayjq.c();
        this.d.w().q.a(this.d.A().a());
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.E().k.a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (this.d.v().a(sud.S) && !z2) {
            j2 = a();
        }
        this.d.w().r.a(j2);
        this.d.E().k.a("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        sxn.a(this.d.c().o(), bundle, true);
        if (this.d.v().a(sud.S) && !this.d.v().a(sud.T) && z2) {
            bundle.putLong("_fr", 1);
        }
        if (!this.d.v().a(sud.T) || !z2) {
            this.d.f().a("auto", "_e", bundle);
        }
        this.a = j;
        this.c.c();
        this.c.a(Math.max(0, 3600000 - this.d.w().r.a()));
        return true;
    }
}
