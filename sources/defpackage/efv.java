package defpackage;

import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop$Params;

/* renamed from: efv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efv implements Runnable {
    private final efz a;
    private final efh b;
    private final Snoop$Params c;
    private final efb d;

    public efv(efz efz, efh efh, Snoop$Params snoop$Params, efb efb) {
        this.a = efz;
        this.b = efh;
        this.c = snoop$Params;
        this.d = efb;
    }

    public final void run() {
        efz efz = this.a;
        efh efh = this.b;
        Snoop$Params snoop$Params = this.c;
        efb efb = this.d;
        eda eda = efz.b;
        if (eda.a()) {
            ecz ecz = new ecz(efh, snoop$Params.b, snoop$Params.c, snoop$Params.d);
            for (Encoding een : snoop$Params.a) {
                een een2 = new een(ecz, een);
                eda.e.a(een2.b).b.a((Object) een2.a);
            }
            eda.a(efb, 0);
            return;
        }
        eda.a(efb, 6500);
    }
}
