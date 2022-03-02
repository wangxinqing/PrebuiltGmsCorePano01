package defpackage;

import android.content.ServiceConnection;

/* renamed from: dmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmk extends dma {
    public final dmj a = new dmj(this);
    public dpf b;
    private final dnb c;
    private final dpw e;

    protected dmk(dmd dmd) {
        super(dmd);
        this.e = new dpw(dmd.c);
        this.c = new dmg(this, dmd);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    public final void s() {
        this.e.a();
        dnb dnb = this.c;
        f();
        dnb.a(((Long) doz.C.a()).longValue());
    }

    public final void u() {
        dly i = i();
        i.q();
        dkw.a();
        dms dms = i.a;
        dkw.a();
        dms.q();
        dms.b("Service disconnected");
    }

    public final boolean b() {
        dkw.a();
        q();
        return this.b != null;
    }

    public final void t() {
        dkw.a();
        q();
        try {
            jca.a().a(d(), (ServiceConnection) this.a);
        } catch (IllegalArgumentException | IllegalStateException e2) {
        }
        if (this.b != null) {
            this.b = null;
            u();
        }
    }
}
