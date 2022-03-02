package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: eyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyu implements ow {
    private final ezb a;

    public eyu(ezb ezb) {
        this.a = ezb;
    }

    public final Object a() {
        ezb ezb = this.a;
        foo foo = (foo) ezb.c.a();
        ezb.getChildFragmentManager().beginTransaction().add((Fragment) foo, "reauth_account").commitNow();
        foo.a();
        return ezb.a.a(qct.DISPLAY_CONSENT_SCREEN);
    }
}
