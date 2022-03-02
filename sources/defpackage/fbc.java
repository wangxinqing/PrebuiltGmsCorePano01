package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: fbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fbc implements ow {
    private final fbk a;

    public fbc(fbk fbk) {
        this.a = fbk;
    }

    public final Object a() {
        fbk fbk = this.a;
        if (fbk.l != null) {
            return aorl.a((Object) amri.b(qcr.EXTERNAL_REAUTH_ACCOUNT));
        }
        if (((pze) fbk.getChildFragmentManager().findFragmentByTag("account_chooser")) == null) {
            pze a2 = pze.a(fbk.c, amzy.a((Object) "com.google"), fbk.b.f);
            fbk.getChildFragmentManager().beginTransaction().add((Fragment) a2, "account_chooser").commitNow();
            a2.a();
        }
        return fbk.g.a(qcr.EXTERNAL_REAUTH_ACCOUNT);
    }
}
