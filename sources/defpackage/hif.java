package defpackage;

import android.content.Intent;
import java.util.concurrent.Executor;

/* renamed from: hif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hif implements aoqb {
    private final hhy a;
    private final Intent b;
    private final amsv c;

    public hif(hhy hhy, Intent intent, amsv amsv) {
        this.a = hhy;
        this.b = intent;
        this.c = amsv;
    }

    public final aorr a(Object obj) {
        hhy hhy = this.a;
        Intent intent = this.b;
        amsv amsv = this.c;
        ibr ibr = (ibr) obj;
        if (ibr.a() == 11002) {
            return aopr.a(qbc.a(hhy.a(intent)), (aoqb) new hig(amsv), (Executor) aoqm.a);
        }
        throw ibr;
    }
}
