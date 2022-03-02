package defpackage;

import java.io.IOException;

/* renamed from: mld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mld extends jfx {
    final /* synthetic */ acwd a;
    final /* synthetic */ mlf e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mld(mlf mlf, acwd acwd) {
        super(9);
        this.e = mlf;
        this.a = acwd;
    }

    public final void run() {
        try {
            this.a.a((Object) eim.f(this.e.getActivity(), this.e.c));
        } catch (eif | IOException e2) {
            this.a.a(e2);
        }
    }
}
