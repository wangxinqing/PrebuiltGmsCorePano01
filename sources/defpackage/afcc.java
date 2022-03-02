package defpackage;

/* renamed from: afcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afcc implements afcg {
    final amzt a = amzy.j();
    auay b = null;
    long c = this.d;
    final /* synthetic */ long d;
    final /* synthetic */ afce e;

    public afcc(afce afce, long j) {
        this.e = afce;
        this.d = j;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        try {
            audx audx = (audx) this.e.c.a((auay) obj2);
            if (this.c >= ((long) audx.p())) {
                this.c -= (long) audx.p();
                this.b = (auay) obj;
                this.a.c(audx);
                return true;
            }
            ((pia) this.e.b.a()).c("Size limit(%d) exceeded, stopping adding rest of changes.", Long.valueOf(this.d));
            return false;
        } catch (auda e2) {
            ((pia) this.e.b.a()).e("Skipping unparsable Change proto:", new Object[0]);
            this.b = (auay) obj;
            return true;
        }
    }
}
