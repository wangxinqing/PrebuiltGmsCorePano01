package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: fgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgr {
    public final String a;
    public final hol b;
    public final fgq c;

    public fgr(Fragment fragment, String str, hol hol) {
        iva.b(fragment instanceof aj, "Fragment must implement LifecycleOwner");
        this.a = str;
        this.b = hol == null ? new hol(fragment.getActivity().getApplicationContext(), "IDENTITY_GMSCORE", (String) null) : hol;
        this.c = new fgq(fragment, fragment.getClass().getCanonicalName());
    }

    public final void a(int i) {
        hol hol = this.b;
        aucd o = anty.n.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anty anty = (anty) o.b;
        str.getClass();
        int i2 = anty.a | 2;
        anty.a = i2;
        anty.c = str;
        anty.b = 8;
        anty.a = i2 | 1;
        aucd o2 = ants.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ants ants = (ants) o2.b;
        ants.b = i - 1;
        ants.a |= 1;
        long b2 = this.c.b();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ants ants2 = (ants) o2.b;
        ants2.a |= 16;
        ants2.e = b2;
        ants ants3 = (ants) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anty anty2 = (anty) o.b;
        ants3.getClass();
        anty2.i = ants3;
        anty2.a |= 128;
        hol.a((audx) o.i()).b();
    }
}
