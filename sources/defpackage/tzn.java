package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: tzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tzn extends arwm {
    final /* synthetic */ tzr a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tzn(tzr tzr, String str) {
        super(str);
        this.a = tzr;
    }

    public final void run() {
        if (!aymw.a.a().T()) {
            Context context = this.a.c;
            if (context != null) {
                Intent a2 = DiscoveryChimeraService.a(context);
                a2.setAction("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_DOWNGRADE");
                thp.a(this.a.c, a2);
                return;
            }
            ((anih) tsp.a.c()).a("FastPairScanner2: context is invalid, canceling downgrade");
            return;
        }
        this.a.c();
    }
}
