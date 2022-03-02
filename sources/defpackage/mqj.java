package defpackage;

import java.io.IOException;

/* renamed from: mqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mqj extends jfx {
    final /* synthetic */ acwd a;
    final /* synthetic */ mql e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mqj(mql mql, acwd acwd) {
        super(9);
        this.e = mql;
        this.a = acwd;
    }

    public final void run() {
        try {
            this.a.a((Object) eim.f(this.e.getActivity(), this.e.b));
        } catch (eif | IOException e2) {
            this.a.a(e2);
        }
    }
}
