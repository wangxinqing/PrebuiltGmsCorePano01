package defpackage;

import android.content.Context;

/* renamed from: vei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vei implements uys {
    public final vel a;
    private final arwg b;
    private final vav c;
    private final uyt d;
    private final arwm e = new veh(this, "heartbeat");

    public vei(Context context) {
        this.c = (vav) thl.a(context, vav.class);
        this.b = (arwg) thl.a(context, arwg.class);
        this.a = (vel) thl.a(context, vel.class);
        uyt uyt = (uyt) thl.a(context, uyt.class);
        this.d = uyt;
        uyt.a((uys) this);
    }

    public final void a() {
        if (!this.d.f()) {
            jjg jjg = tgc.a;
            this.d.f();
            this.b.e(this.e);
        } else if (!this.b.b(this.e)) {
            jjg jjg2 = tgc.a;
            this.c.l();
            this.b.a(this.e, this.c.l());
        }
    }

    public final void b() {
        a();
    }

    public final void a(uyq uyq) {
        a();
    }
}
