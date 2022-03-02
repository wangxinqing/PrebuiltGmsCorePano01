package defpackage;

/* renamed from: ken  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ken implements alnz {
    final /* synthetic */ keo a;

    public ken(keo keo) {
        this.a = keo;
    }

    public final void a(alyv alyv) {
        try {
            keo keo = this.a;
            boolean z = true;
            keo.c.a(keo.e.a, true);
            lkk lkk = this.a.f;
            if (lkk != null) {
                lkx lkx = new lkx(lkk);
                if (alyv != alyv.READ_ONLY) {
                    z = false;
                }
                lkx.b = z;
                this.a.b.a(lkx);
            }
        } catch (nja e) {
        }
    }
}
