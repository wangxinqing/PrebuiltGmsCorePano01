package defpackage;

import java.util.concurrent.Executor;

/* renamed from: pkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pkt {
    private final awdn a;
    private final awdn b;
    private final awdn c;
    private final awdn d;
    private final awdn e;
    private final awdn f;
    private final awdn g;

    public pkt(awdn awdn, awdn awdn2, awdn awdn3, awdn awdn4, awdn awdn5, awdn awdn6, awdn awdn7) {
        this.b = awdn;
        this.c = awdn2;
        this.a = awdn3;
        this.d = awdn4;
        this.e = awdn5;
        this.f = awdn6;
        this.g = awdn7;
    }

    public final void a() {
        if (((aeri) this.a.a()).D()) {
            ((Executor) this.b.a()).execute(new pks(this));
        } else {
            b();
        }
    }

    public final void b() {
        try {
            ((afbt) this.e.a()).a(((Long) ozz.i.c()).longValue(), ((Long) ozz.j.c()).longValue(), 2, ((Boolean) ozz.k.c()).booleanValue(), false);
            ((afbt) this.d.a()).a(axrs.a.a().p(), axrs.a.a().j(), 3, axrs.a.a().q(), false);
            ((afbt) this.f.a()).a(((Long) ozz.u.c()).longValue(), ((Long) ozz.v.c()).longValue(), 3, ((Boolean) ozz.w.c()).booleanValue(), false);
            ((afbt) this.g.a()).a(((Long) ozz.x.c()).longValue(), ((Long) ozz.y.c()).longValue(), 3, ((Boolean) ozz.z.c()).booleanValue(), true);
        } catch (RuntimeException e2) {
            ((pdg) this.c.a()).a("Failed to schedule tasks due to unexpected RuntimeException in MDH.", e2);
        }
    }
}
