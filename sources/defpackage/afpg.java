package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpg implements aoqb {
    private final afpi a;

    public afpg(afpi afpi) {
        this.a = afpi;
    }

    public final aorr a(Object obj) {
        afpi afpi = this.a;
        ArrayList arrayList = new ArrayList();
        for (aflf aflf : (List) obj) {
            afkr a2 = afpi.a(aflf);
            if (a2 != null) {
                arrayList.add(Pair.create(aflf, a2));
            }
        }
        return aorl.a((Object) arrayList);
    }
}
