package defpackage;

import android.content.Context;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceState;
import java.util.List;

/* renamed from: cfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cfj extends ccv implements grc {
    public static final ccj b = new ccj(new cfg(), "SunStateProducer", new int[]{43}, (int[]) null);
    public final bva j;
    final Runnable k;
    public AwarenessFence l;
    public final String m;
    public final long[] n = new long[3];
    public final long[] o = new long[3];
    public long p;

    public cfj(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        String valueOf = String.valueOf(bsz.b);
        this.m = valueOf.length() == 0 ? new String("SunStateProductionFence") : "SunStateProductionFence".concat(valueOf);
        this.p = 120000;
        this.j = new cfh(this, "[SunStateProducer] get location snapshot", new Object[0]);
        this.k = new cfi(this);
    }

    public static atuo a(int i, long[] jArr) {
        aucd o2 = atuo.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atuo atuo = (atuo) o2.b;
        atuo.b = i - 1;
        atuo.a |= 1;
        if (jArr != null) {
            List a = aook.a(jArr);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atuo atuo2 = (atuo) o2.b;
            if (!atuo2.c.a()) {
                atuo2.c = aucj.a(atuo2.c);
            }
            auab.a((Iterable) a, (List) atuo2.c);
        }
        return (atuo) o2.i();
    }

    public final void c() {
        if (this.l != null) {
            grd grd = new grd();
            grd.a((grc) this);
            gra.a(this.d, this.g).a(grd.a()).a((acvp) new bva("[SunStateProducer] unregister fence", new Object[0]));
        }
    }

    public final void j() {
        new Object[1][0] = Long.valueOf(this.p);
        this.a.a(this.k, this.p, bvq.a("SunStateProducer_repostLocationSnapshot"));
        long j2 = this.p;
        this.p = Math.min(14400000, j2 + j2);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
        c();
        this.a.a(this.k);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        gra.b(this.d, this.g).d().a(this.a.a(bvq.a("SunStateProducer_getLocationSnapshot")), (acvp) this.j);
    }

    public final void a(FenceState fenceState) {
        if (fenceState.a() == 2) {
            this.a.a(this.k, bvq.a("SunStateProducer_fenceStateChanged"));
        }
    }
}
