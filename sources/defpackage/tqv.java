package defpackage;

import android.util.SparseArray;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: tqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tqv {
    public final SparseArray a;

    public tqv(tph tph, tob tob, tnq tnq, tlt tlt) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(2, new tql(tph, tob, tnq, tlt));
        sparseArray.put(1, new tqt(tph, tob, tnq, tlt));
        sparseArray.put(3, new tqs(tph, tob, tnq, tlt));
        this.a = sparseArray;
    }

    public static final int a(tlh tlh, Strategy strategy) {
        Strategy d = tlh.d();
        if (d != null && !d.equals(strategy)) {
            if (tlh.g() || tlh.k()) {
                ((anih) tky.a.d()).a("Unable to change Strategy to %s, client is still advertising or discovering with Strategy %s", (Object) strategy, (Object) d);
                return 8008;
            } else if (tlh.o().length > 0) {
                ((anih) tky.a.d()).a("Unable to change Strategy to %s, client still has connected endpoints with Strategy %s", (Object) strategy, (Object) d);
                return 8008;
            }
        }
        tlh.a(strategy);
        return 0;
    }

    public final tqu a(tlh tlh) {
        Strategy d = tlh.d();
        int i = 0;
        if (d != null) {
            if (Strategy.a.equals(d)) {
                i = 2;
            } else if (Strategy.b.equals(d)) {
                i = 1;
            } else if (!Strategy.c.equals(d)) {
                jjg jjg = tky.a;
            } else {
                i = 3;
            }
        }
        return (tqu) this.a.get(i);
    }
}
