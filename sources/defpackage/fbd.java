package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: fbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fbd implements ow {
    private final fbk a;

    public fbd(fbk fbk) {
        this.a = fbk;
    }

    public final Object a() {
        fbk fbk = this.a;
        foo foo = (foo) fbk.u.a();
        fbk.getChildFragmentManager().beginTransaction().add((Fragment) foo, "account_reauth").commitNow();
        foo.a();
        return fbk.g.a(qcr.AUTH_ACCOUNT);
    }
}
