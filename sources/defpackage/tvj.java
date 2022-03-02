package defpackage;

import android.content.Context;

/* renamed from: tvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tvj extends arwm {
    final /* synthetic */ boolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ tzi c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvj(String str, boolean z, Context context, tzi tzi) {
        super(str);
        this.a = z;
        this.b = context;
        this.c = tzi;
    }

    public final void run() {
        if (!this.a) {
            ((anih) tsp.a.d()).a("FastPair: fail to update name, enable update name status.");
            tzi tzi = this.c;
            ((ttf) thl.a(this.b, ttf.class)).a(tzi, true, tzi.e);
            return;
        }
        ((anih) tsp.a.d()).a("FastPair: success to update name, clear retry times.");
        ((ttf) thl.a(this.b, ttf.class)).a(this.c, false, 0);
    }
}
