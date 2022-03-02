package defpackage;

/* renamed from: bahh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahh implements Runnable {
    final /* synthetic */ babj a;
    final /* synthetic */ bahv b;

    public bahh(bahv bahv, babj babj) {
        this.b = bahv;
        this.a = babj;
    }

    public final void run() {
        if (this.b.n.a != azxz.SHUTDOWN) {
            bahv bahv = this.b;
            bahv.o = this.a;
            bajo bajo = bahv.m;
            bahv bahv2 = this.b;
            baep baep = bahv2.l;
            bahv2.m = null;
            this.b.l = null;
            this.b.a(azxz.SHUTDOWN);
            this.b.f.a();
            if (this.b.j.isEmpty()) {
                this.b.d();
            }
            this.b.e();
            if (bajo != null) {
                bajo.a(this.a);
            }
            if (baep != null) {
                baep.a(this.a);
            }
        }
    }
}
