package defpackage;

import android.net.Network;

/* renamed from: lhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lhg implements lho {
    final /* synthetic */ lhh a;

    public lhg(lhh lhh) {
        this.a = lhh;
    }

    public final void a(String str) {
        if (!this.a.b.e()) {
            lhh lhh = this.a;
            lhi lhi = lhh.b;
            Network network = lhh.a;
            int i = lhi.h;
            if (lhi.a.a(network, lhi.d) && lhi.b(lhi.d)) {
                return;
            }
        }
        throw new lhp(str);
    }
}
