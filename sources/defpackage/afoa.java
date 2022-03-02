package defpackage;

import android.util.Pair;
import java.util.List;

/* renamed from: afoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoa implements amqy {
    private final anav a;

    public afoa(anav anav) {
        this.a = anav;
    }

    public final Object a(Object obj) {
        anav anav = this.a;
        for (Pair pair : (List) obj) {
            afkr afkr = (afkr) pair.second;
            aucx aucx = afkr.j;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                afkn afkn = (afkn) aucx.get(i);
                int a2 = afkq.a(afkr.f);
                if (a2 == 0) {
                    a2 = 1;
                }
                anav.b(afqu.a(afkn, a2));
            }
        }
        return anav.a();
    }
}
