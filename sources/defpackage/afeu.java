package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: afeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afeu implements Callable {
    private final affc a;
    private final List b;

    public afeu(affc affc, List list) {
        this.a = affc;
        this.b = list;
    }

    public final Object call() {
        affc affc = this.a;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((aorr) list.get(i)).get();
            } catch (Exception e) {
                ((pdg) affc.h.a()).a("MDH sync failure", e);
            }
        }
        return null;
    }
}
