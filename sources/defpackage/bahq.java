package defpackage;

/* renamed from: bahq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahq implements Runnable {
    final /* synthetic */ baht a;

    public bahq(baht baht) {
        this.a = baht;
    }

    public final void run() {
        boolean z;
        baht baht = this.a;
        bahv bahv = baht.c;
        bahv.p = null;
        if (bahv.o == null) {
            baep baep = bahv.l;
            baep baep2 = baht.a;
            if (baep == baep2) {
                bahv.m = baep2;
                this.a.c.l = null;
                this.a.c.a(azxz.READY);
                return;
            }
            return;
        }
        if (bahv.m == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Unexpected non-null activeTransport");
        baht baht2 = this.a;
        baht2.a.a(baht2.c.o);
    }
}
