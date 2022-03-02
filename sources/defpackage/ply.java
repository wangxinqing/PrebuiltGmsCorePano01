package defpackage;

/* renamed from: ply  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ply implements acvp {
    final /* synthetic */ plz a;
    private final acwd b;

    public ply(plz plz, acwd acwd) {
        this.a = plz;
        this.b = acwd;
        plz.d++;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            this.b.a(acwa.d());
        } else {
            Exception e = acwa.e();
            if (e != null) {
                this.b.a(e);
            }
        }
        synchronized (this.a) {
            plz plz = this.a;
            int i = plz.d - 1;
            plz.d = i;
            if (i == 0) {
                if (!plz.b.isEmpty()) {
                    this.a.a();
                } else if (!this.a.c.isEmpty()) {
                    this.a.b();
                }
            }
        }
    }
}
