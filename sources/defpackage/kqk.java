package defpackage;

/* renamed from: kqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqk extends kqs {
    public final lsb a;
    public final kqs b = kqs.b();
    private boolean h = false;

    public kqk(lsb lsb) {
        this.a = lsb;
    }

    public final kql a() {
        return new kql(173, this);
    }

    public final void b(int i, String str) {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "No table definition to rename");
        kqr kqr = new kqr(str, ((kqr) this.f).b);
        a(i);
        a(i, kqr);
    }

    public final void a(int i) {
        b(i);
        if (this.h) {
            this.h = false;
            this.b.b(i);
        }
    }

    public final void a(int i, String str) {
        a(i, new kqr(str, true));
    }

    public final void a(int i, kqr kqr) {
        a(i, (Object) kqr);
        if (kqr.b) {
            iva.a(!this.h);
            this.h = true;
            kqs kqs = this.b;
            kqm kqm = new kqm(kqr.a.concat("_id"), 1);
            kqm.c();
            kqs.a(i, kqm);
        }
    }
}
