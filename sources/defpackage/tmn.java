package defpackage;

/* renamed from: tmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmn implements Runnable {
    private final tmz a;
    private final String b;
    private final tnm c;

    public tmn(tmz tmz, String str, tnm tnm) {
        this.a = tmz;
        this.b = str;
        this.c = tnm;
    }

    public final void run() {
        tmz tmz = this.a;
        String str = this.b;
        tnm tnm = this.c;
        tmv tmv = (tmv) tmz.h.get(str);
        if (tmv == null) {
            ((anih) tky.a.d()).a("onEncryptionFailure() for endpoint %s, but the connection was already removed.", (Object) str);
            return;
        }
        tnm tnm2 = tmv.c;
        if (!tnm2.a().equals(tnm.a()) || !tnm2.b().equals(tnm.b()) || tnm2.l() != tnm.l()) {
            ((anih) tky.a.d()).a("onEncryptionFailure() for endpoint %s, but for a previous connection. Ignoring.", (Object) str);
            return;
        }
        tmz.a(tmv.a, tmv.c.l(), str, tmv.c, tmv.e, tmv.f, 8012, tmv.k);
    }
}
